package com.movies.controller.userPacket;

import com.movies.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/movie/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping()
    public String getOrder(Model model, HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");

        model.addAttribute("orderList",orderService.getOrder(uid));
        return "order";
    }

    @RequestMapping("/delete")
    public String delete(Integer oid,Model model){
        orderService.delete(oid);
        return "redirect:/movie/order";
    }

}
