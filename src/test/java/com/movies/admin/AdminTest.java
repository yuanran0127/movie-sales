package com.movies.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.movies.pojo.Admin;
import com.movies.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminTest {
    @Autowired
    AdminService adminService;
    @Test
    void test1(){
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper .eq("adm_name", "admin")
                .eq("adm_password", "123456");
        Admin admin = adminService.getOne(wrapper);
        System.out.println(admin.toString());
    }
}
