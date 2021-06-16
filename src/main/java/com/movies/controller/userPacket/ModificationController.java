package com.movies.controller.userPacket;

import com.movies.pojo.User;
import com.movies.service.ModificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/movie")
public class ModificationController {

    @Autowired
    private ModificationService modificationService;

    @RequestMapping("/modification")
    public String modification(HttpSession session, Model model){
        Integer uid=(Integer)session.getAttribute("uid");
        model.addAttribute("user",modificationService.getUser(uid));
        return "modification";
    }

    @RequestMapping("/modification/update")
    public String update(User user){
        modificationService.update(user);
        return "redirect:/movie/home";
    }

    @RequestMapping("/checkRepeat")
    @ResponseBody
    public String checkRepeat(Integer uId, HttpSession session){
        String uUsername=(String)session.getAttribute("uusername");
        String name=modificationService.selectUser(uId);
        if(name.equals(uUsername)){
            return "用户名可用";
        }else if(name==""||name==null) {
            return "用户名不能为空";
        }else{
                return "用户名已存在";
        }
    }

    @RequestMapping("/checkPhoneNum")
    @ResponseBody
    public String checkPhoneNum(String uPhoneNum){
        try {
            Integer.parseInt(uPhoneNum);
        }catch(NumberFormatException e){
            return "手机号为11位纯数字！";
        }
        if(uPhoneNum.length()!=11){
            return "手机号为11位数字";
        }
        return "";
    }
}
