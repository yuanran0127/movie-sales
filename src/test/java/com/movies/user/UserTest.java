package com.movies.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.movies.mapper.UserMapper;
import com.movies.pojo.User;
import com.movies.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    UserMapper userMapper;

    //查询所有用户
    @Test
    public void test1() {
        List<User> list = userService.list();
        for (User user : list) {
            System.out.println(user);
        }
    }

    //根据id查询用户
    @Test
    public void test2() {
        User byId = userService.getById(1);
        System.out.println(byId);
    }

    //注册用户
    @Test
    public void test3() {
        User user = new User();
        user.setUName("阿鬼大大");
        user.setUPhoneNum("111");
        user.setUSex("男");
        user.setUUsername("wzx");
        user.setUPassword("111");
        userService.save(user);
    }

    //添加或修改用户
    @Test
    public void test4() {
        User user = new User();
        user.setUName("阿鬼大大");
        user.setUPhoneNum("111");
        user.setUSex("男");
        user.setUUsername("wzx");
        user.setUPassword("111");
        userService.saveOrUpdate(user);
    }

    //根据id删除用户
    @Test
    public void test5() {
        userService.removeById(1);
    }

    //分页查询
    @Test
    public void pageUser() {
        Page<User> page1 = new Page<>(0,5);
        Page<User> page = userService.page(page1, null);
        List<User> records = page.getRecords();
        long pages = page.getPages();
        System.out.println("==========>"+pages);
        for (User record : records) {
            System.out.println("===========>"+record);
        }
    }
}
