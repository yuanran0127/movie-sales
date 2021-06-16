package com.movies.controller.adminPacket;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.movies.pojo.Admin;
import com.movies.pojo.User;
import com.movies.serviceImpl.AdminServiceImpl;
import com.movies.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes(value = {"uid", "uusername"})
public class loginController {
    @Autowired
    AdminServiceImpl adminService;
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(String username, String password, Model model, HttpSession session) {
        if (username.equals("admin")) {
            QueryWrapper<Admin> wrapper = new QueryWrapper<>();
            wrapper.eq("adm_name", username)
                    .eq("adm_password", password);
            Admin admin = adminService.getOne(wrapper);
//            System.out.println(admin.getAdmName());
            if(admin==null){
                model.addAttribute("msg","管理员密码错误");
                return "redirect:toLogin";
            }
            Map<String, Object> map = new HashMap<>();
            map.put("admin", admin);
            session.setAttribute("map", map);
            System.out.println("登录成功");
            return "redirect:/index";
        } else {
            QueryWrapper<User> wrapper = new QueryWrapper<>();
            wrapper.eq("u_username", username)
                    .eq("u_password", password);
            User user = userService.getOne(wrapper);



            if (user != null) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("user", user);
                session.setAttribute("map", map);
                model.addAttribute("uid", user.getUId());
                model.addAttribute("uusername", username);
                return "redirect:movie/home";
            } else {
                model.addAttribute("msg", "用户名或密码错误");
                System.out.println("密码错误");
                return "redirect:toLogin";
            }
        }
    }

    @RequestMapping("toLogin")
    public String toLogin(Model model) {
        model.addAttribute("msg", "用户名或者密码错误");
        return "login";

    }

}
