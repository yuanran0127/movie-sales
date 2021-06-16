package com.movies.controller.adminPacket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LogoutController {
    @RequestMapping("/logout")
    public String toLogout(HttpSession session){
        Map map = (Map) session.getAttribute("map");
        System.out.println(map.get("admin"));
        map.put("admin",null);
        System.out.println(map.get("admin"));
        return "redirect:/";
    }
    @RequestMapping("/userLogout")
    public String userLogout(HttpSession session) {
        Map map = (Map) session.getAttribute("map");
        System.out.println(map.get("admin"));
        map.put("user",null);
        return "redirect:/";
    }
}