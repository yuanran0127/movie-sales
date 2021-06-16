package com.movies.controller.adminPacket;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.movies.pojo.PageUtils;
import com.movies.pojo.User;
import com.movies.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
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
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/pageUser")
    public String pageUser(Model model,Long  currentpage) {
        PageUtils pageUtils = new PageUtils(new Page(currentpage, 5), "/admin/pageUser");
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        Page page = userService.page(pageUtils.getPage());
//        model.addAttribute("pages",page);
        model.addAttribute("page",pageUtils);
        return "admin/user1";
    }

    @RequestMapping("/userByName")
    public String byName(String uName, Model model) {
        PageUtils pageUtils = new PageUtils(new Page(1, 5), "/admin/pageUser");
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("u_name", uName);
        Page page = userService.page(pageUtils.getPage(), wrapper);
        model.addAttribute("page",pageUtils);
        return "admin/user1";
    }

    /* @RequestMapping("/updateUser")
     public String toUpdate(Model model){
         System.out.println("更新用户");
         return "user/updateUser";
     }*/
    @RequestMapping("/toUpdateUser/{uId}")
    public String toUpdateUser(@PathVariable Integer uId, Model model, HttpSession session) {
        Map map = (Map)session.getAttribute("map");
        map.put("uId",uId);
        session.setAttribute("map",map);
        User user = userService.getById(uId);
        model.addAttribute("user", user);
        System.out.println("进入去修改页面");
        System.out.println(user.getUName());
        return "admin/user/updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user, HttpSession session) {
        Map map = (Map)session.getAttribute("map");
        Integer uId = (Integer) map.get("uId");
        System.out.println("session" + uId);
        System.out.println("进入修改页面");
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("u_id",uId);
        User user1 = new User(uId, user.getUName(), user.getUSex(), user.getUPhoneNum(), user.getUUsername(), user.getUPassword());
        boolean update = userService.update(user1, wrapper);
        System.out.println("修改=========》" + update);
        return "redirect:/admin/pageUser?currentpage=1";
    }

    @RequestMapping("/adduser")
    public String addUser() {
        System.out.println("adduser界面");
        return "admin/user/addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        boolean save = userService.save(user);
        System.out.println("添加========>");
        return "redirect:/admin/pageUser?currentpage=1";
    }

    @RequestMapping("/deleteUser/{uid}")
    public String deleteUser(@PathVariable Integer uid) {
        boolean b = userService.removeById(uid);
        System.out.println("删除==========>" + b);
        return "redirect:/admin/pageUser?currentpage=1";
    }
}

