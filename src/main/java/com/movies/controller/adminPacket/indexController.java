package com.movies.controller.adminPacket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("index")
    public String index() {
        return "index";
    }
    @RequestMapping("admin")
    public String admin(){
        return "index";
    }
}
