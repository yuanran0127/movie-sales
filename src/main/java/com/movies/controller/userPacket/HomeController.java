package com.movies.controller.userPacket;

import com.movies.pojo.Movie;
import com.movies.pojo.User;
import com.movies.service.HomeService;
import com.movies.serviceImpl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/movie")
@SessionAttributes(value={"year","type","area"})
public class HomeController {

    @Autowired
    private HomeService homeService;
    @Autowired
    MovieServiceImpl movieService;

    @RequestMapping("/home")
    public String home(Model model, HttpSession session){
        Map map = (Map) session.getAttribute("map");
        User user =(User) map.get("user");
        String uName = user.getUName();
        model.addAttribute("uName",uName);
        model.addAttribute("areaList",homeService.getArea());
        model.addAttribute("typeList",homeService.getType());
        model.addAttribute("movieList",homeService.getMovie());
        return "home";

    }

    @RequestMapping("/select")
    public String select(String type, String year, String area, Model model,HttpSession session){
        //实现 级联动态 查询
        //可以通过type year area三个条件查找想要的电影 做到尽可能的缩小范围查找
        String oldtype = (String) session.getAttribute("type");
        String oldyear = (String) session.getAttribute("year");
        String oldarea = (String) session.getAttribute("area");
        if (type != null && type != "") {
            model.addAttribute("type", type);
        }else{
            type=oldtype;
        }
        if (year != null && year != "") {
            model.addAttribute("year", year);
        }else{
            year=oldyear;
        }
        if (area != null && area != "") {
            model.addAttribute("area", area);
        }else{
            area=oldarea;
        }
        model.addAttribute("areaList", homeService.getArea());
        model.addAttribute("typeList", homeService.getType());
        System.out.println(type + "===" + area + "===" + year);
        model.addAttribute("movieList", homeService.select(type, year, area));
        return "home";
    }

    @RequestMapping(value = "/searchmovie")
    public String searcheMovie(String searchfield, Model model){
        model.addAttribute("areaList",homeService.getArea());
        model.addAttribute("typeList",homeService.getType());
        List<Movie> movies = homeService.searchMovie(searchfield);
        model.addAttribute("movieList",movies);
        return "home";
    }

}
