package com.movies;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.movies.pojo.Movieorder;
import com.movies.pojo.Order;
import com.movies.serviceImpl.MovieorderServiceImpl;
import com.movies.serviceImpl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OrderTest {
    @Autowired
    MovieorderServiceImpl movieorderService;
    @Test
    void test1(){

        List<Movieorder> allOrder = movieorderService.list();
        allOrder.forEach(System.out::println);
    }
}
