//package com.movies.movie;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.movies.pojo.Movie;
//import com.movies.serviceImpl.MovieServiceImpl;
//import com.movies.pojo.Mt;
//import com.movies.serviceImpl.MtServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootTest
//public class MovieTest {
//    @Autowired
//    MovieServiceImpl movieService;
//    @Autowired
//    MtServiceImpl mtService;
//
//    //查看所有电影
//    @Test
//    public void test1() {
//        List<Movie> list = movieService.list();
//        for (Movie movie : list) {
//            System.out.println(movie);
//        }
//    }
//
//    //根据名字在查询电影
//    @Test
//    public void test2() {
//
//        QueryWrapper<Movie> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("m_name", "哪吒");
//        Movie one = movieService.getOne(queryWrapper);
//        System.out.println(one);
//
////        System.out.println(movie.toString());
//    }
//
//    //添加电影
//    @Test
//    public void test3() {
//        Movie movie = new Movie();
//        movie.setMArea("中国");
//        movie.setMName("哪吒");
//        movie.setMDescription("神话电影");
//        movie.setMDuration(1);
//        movie.setMReleaseTime(100);
//        movie.setMPhoto("a.jpg");
//        movie.setMPrice(30);
//        movie.setMType("动画");
//        movieService.save(movie);
//    }
//
//    //添加或修改用户
//    @Test
//    public void test4() {
//        Movie movie = new Movie();
//        movie.setMArea("中国");
//        movie.setMName("哪吒");
//        movie.setMDescription("神话电影");
//        movie.setMDuration(1);
//        movie.setMReleaseTime(100);
//        movie.setMPhoto("a.jpg");
//        movie.setMPrice(30);
//        movie.setMType("动画");
//        movieService.saveOrUpdate(movie);
//    }
//
//    //根据id删除用户
//    @Test
//    public void test5() {
//        movieService.removeById(1);
//    }
//    //链表查询 查询为喜剧的电影
//
//    /**
//     * select * from movie  inner join mt on movie.m_name = mt.m_name where m.type = 动画
//     */
//    @Test
//    public void typeMovie(){
//        QueryWrapper<Mt> mtQueryWrapper = new QueryWrapper<>();
//        mtQueryWrapper.eq("t_name","动画");
//        List<Mt> list = mtService.list(mtQueryWrapper);
//        ArrayList<Movie> movies = new ArrayList<>();
//        for (Mt mt : list) {
//            QueryWrapper<Movie> movieQueryWrapper = new QueryWrapper<>();
//            movieQueryWrapper.eq("m_name",mt.getMName());
//            Movie movie = movieService.getOne(movieQueryWrapper);
//            movies.add(movie);
//        }
//        for (Movie movie : movies) {
//            System.out.println(movie);
//        }
//    }
//
//
//
//}
