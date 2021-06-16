package com.movies.controller.adminPacket;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.movies.pojo.Admin;
import com.movies.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class updatePassword {
    @Autowired
    AdminServiceImpl adminService;

    @RequestMapping("/toUpdatePassword")
    public String toUpdatePassword() {
        return "updatePassword";
    }

    @RequestMapping("/updatePassword")
    public String updatePassword(HttpSession session, String originalPassword, String updatePassword, String rePassword, Model model) {
        Map map = (Map)session.getAttribute("map");
        Admin admin =(Admin) map.get("admin");
        Integer admId = admin.getAdmId();
        String admName = admin.getAdmName();
        System.out.println("admid======>" + admId);
        System.out.println("admname=====>" + admName);
        System.out.println("原始密码=====>" + originalPassword);
        System.out.println("修改密码=====>" + updatePassword);
        System.out.println("再次输入的密码为=====>" + rePassword);
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("adm_id", admId)
                .eq("adm_name", admName)
                .eq("adm_password", originalPassword);
        Admin admin1 = adminService.getOne(wrapper);
        if (admin1==null) {
            model.addAttribute("updatePassword", "原密码不对");
            return "updatePassword";
        }
        else {
            if (updatePassword.equals(rePassword)) {

                Admin updateAdmin = new Admin(admId, admName, rePassword);
                UpdateWrapper<Admin> updateWrapper = new UpdateWrapper<>();
                wrapper.eq("adm_id", admId)
                        .eq("adm_name", admName);
                adminService.update(updateAdmin,updateWrapper);
                session.setAttribute("admin", null);
                System.out.println("密码修改成功");
                return "redirect:/";
            }
            else {
                model.addAttribute("updatePassword", "两次密码不等");
                return "updatePassword";
            }
        }
    }
}
