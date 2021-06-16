package com.movies.controller.adminPacket;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.movies.pojo.Movie;
import com.movies.pojo.PageUtils;
import com.movies.serviceImpl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author movies
 * @since 2021-05-13
 */
@Controller
@RequestMapping("/admin")
public class MovieController {
    @Autowired
    private MovieServiceImpl movieService;
    private final String realPath = "E:\\java\\movie-sales2.0\\movie-sales\\src\\main\\resources\\static\\pages\\img\\";

    //到movie页面
    @RequestMapping("/movie")
    public String movie() {
        System.out.println("movie页面");
        return "admin/movie";
    }

    //查看所有电影
    @RequestMapping("/pageMovie")
    public String queryAllMovies(Model model,Long currentpage) {

        PageUtils pageUtils = new PageUtils(new Page(currentpage, 5), "/admin/pageMovie");
        Page page = movieService.page(pageUtils.getPage());
        model.addAttribute("page",pageUtils);
        return "admin/movie";
    }

    //根据名字查电影
    @RequestMapping("/MovieByName")
    public String queryMovieByName(String mName, Model model) {
        PageUtils pageUtils = new PageUtils(new Page(1, 5), "/movie/pageMovie/");
        QueryWrapper<Movie> wrapper = new QueryWrapper<>();
        wrapper.like("m_name", mName);
        Page page = movieService.page(pageUtils.getPage(), wrapper);
        model.addAttribute("page", pageUtils);
        return "admin/movie";
    }

    /**
     * 添加电影
     *
     * @param
     * @return
     */
    @RequestMapping("/addmovie")
    public String addMovie(MultipartFile mPhoto, Integer mId, String mName, String mDescription, String mDuration, Integer mReleaseTime, String mType, String mArea, Integer mPrice) {
        System.out.println(mDuration);
        if (mPhoto == null) {
            System.out.println("文件为null");
            return "redirect:/admin/pageMovie?currentpage=1";
        }
        String filename = mPhoto.getOriginalFilename();
        String format = new SimpleDateFormat("YYMMddhhmmss").format(new Date());
        try {
            File file = new File(realPath + format + filename);
            mPhoto.transferTo(file);

        } catch (IOException e) {
            new RuntimeException("文件上传错误");
            e.printStackTrace();
            return "redirect:/admin/pageMovie?currentpage=1";

        }
        Movie movie = new Movie(mId, mName, mDescription, mDuration, mReleaseTime, mType, mArea, format+filename, mPrice);
        System.out.println(movie.toString());
        boolean save = movieService.save(movie);
        System.out.println("添加电影" + save);
        return "redirect:/admin/pageMovie?currentpage=1";
    }

    //添加电影
    @RequestMapping("/toaddMovie")
    public String addMoive() {
        System.out.println("进入到添加电影页面");
        return "admin/movie/addMovie";
    }


    /**
     * 修改电影
     */
    //修改电影
    @RequestMapping("/toUpdateMovie/{mId}")
    public String topdateMovie(@PathVariable Integer mId, HttpSession session, Model model) {
        QueryWrapper<Movie> wrapper = new QueryWrapper<>();
        wrapper.eq("m_id", mId);
        Movie movie = movieService.getOne(wrapper);
        System.out.println(movie);
        Map map = (Map) session.getAttribute("map");
        map.put("movie", movie);
        map.put("mid", mId);
        model.addAttribute("map", map);
        return "admin/movie/updateMovie";
    }

    /**
     *将form表单的值提交
     * @param session
     * @param mPhoto
     * @param mName
     * @param mDescription
     * @param mDuration
     * @param mReleaseTime
     * @param mType
     * @param mArea
     * @param mPrice
     * @return
     */
    @RequestMapping("/updateMovie")
    public String updateMovie(HttpSession session, MultipartFile mPhoto, String mName, String mDescription, String mDuration, Integer mReleaseTime, String mType, String mArea, Integer mPrice) {
        UpdateWrapper<Movie> wrapper = new UpdateWrapper<>();
        Map map = (Map) session.getAttribute("map");
        Integer mid = (Integer) map.get("mid");
        Movie movie1 = (Movie) map.get("movie");
        String mPhotoName = movie1.getMName();
        wrapper.eq("m_id", mid);
        if (mPhoto != null) {
            String filename = mPhoto.getOriginalFilename();
            String format = new SimpleDateFormat("YYYYMMddhhmmss").format(new Date());
            try {
                mPhoto.transferTo(new File(realPath + format + filename));
                Movie movie = new Movie(mid, mName, mDescription, mDuration, mReleaseTime, mType, mArea, format+filename, mPrice);
                boolean update = movieService.update(movie, wrapper);
            } catch (IOException e) {
                System.out.println("文件上传错误");
                e.printStackTrace();
                return "redirect:/admin/pageMovie?currentpage=1";

            }
            return "redirect:/admin/pageMovie?currentpage=1";

        } else {
            Movie movie = new Movie(mid, mName, mDescription, mDuration, mReleaseTime, mType, mArea, mPhotoName, mPrice);
            movieService.update(movie, wrapper);
            return "redirect:/admin/pageMovie?currentpage=1";

        }
    }

    /**
     * 删除电影
     */
    @RequestMapping("/deleteMovie/{mId}")
    public String deleteMovie(@PathVariable Integer mId) {
        boolean b = movieService.removeById(mId);
        System.out.println("删除=========》" + b);
        return "redirect:/admin/pageMovie?currentpage=1";
    }
}


