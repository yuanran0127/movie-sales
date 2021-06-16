package com.movies;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.movies.pojo.Admin;
import com.movies.service.BuyService;
import com.movies.service.HomeService;
import com.movies.service.MovieorderService;
import com.movies.service.OrderService;
import com.movies.serviceImpl.AdminServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test {
    @Autowired
    AdminServiceImpl adminService;
    @Test
    void test1(){
        System.out.println("hhh");
    }

    @Test
    void test2(){
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("adm_name", "admin");
        Admin one = adminService.getOne(wrapper);
        System.out.println(one.getAdmName());
    }

    @Autowired
    private HomeService homeService;

    @Autowired
    private OrderService orderService;

    @Test
    void  test3(){
//        System.out.println("area:"+homeService.getArea());
//        System.out.println("type:"+homeService.getType());
//        System.out.println("movie:"+homeService.getMovie());

//        System.out.println("movie=============>"+homeService.select("%动画%","2020%","中国大陆"));

    //    System.out.println("movie------------------》》》》》"+homeService.searchMovie("猪猪侠"));
//        System.out.println("order=============>>>>"+orderService.getOrder(2));
//        orderService.getOrder(2);
//        homeService.update(new User(2,"阿鬼大大","男","13474527606","111234","222"));
    }


    @Autowired
    private BuyService buyService;
    @Test
    void test4(){
//        orderService.delete(2106110001);
//        Movie movie=new Movie();
//        movie.setMId(1100102);
//        Order order=new Order();
//        order.setU_id(2);
//        order.setOdate("2021-06-14 14:08:32");
//        order.setOnum(2);
//        order.setM_id(movie);
//        buyService.insertOrder(order);
        buyService.selectMovie(1100101);
    }

    @Autowired
    private MovieorderService movieorderService;
    @Test
    public void test5(){
        movieorderService.getAllOrder();
    }

}
