package com.movies.controller.adminPacket;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.movies.pojo.Movieorder;
import com.movies.pojo.PageUtils;
import com.movies.serviceImpl.MovieorderServiceImpl;
import com.movies.serviceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author movies
 * @since 2021-06-15
 */
@Controller
@RequestMapping("/admin")
public class MovieorderController {
    @Autowired
    MovieorderServiceImpl movieorderService;
    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("pageOrder")
    public String pageOrder(Integer currentpage, Model model) {
        PageUtils pageUtils = new PageUtils(new Page(currentpage, 5), "/admin/pageOrder/");
        movieorderService.page(pageUtils.getPage());
        List<Movieorder> records = pageUtils.getPage().getRecords();
        for (Movieorder record : records) {
            System.out.println(record.getMId());
            System.out.println(record.getUId());
            System.out.println(record.getOdate());
            System.out.println(record.getOnum());

        }

        model.addAttribute("page", pageUtils);
        model.addAttribute("orderlist", records);
        return "admin/order";

    }
    @RequestMapping("AllOrder")
    public String getAllOrder(Model model){
        model.addAttribute("orderList",orderService.getAllOrder());
        return "/admin/order1";
    }
    @RequestMapping("deleteOrder")
    public String deleteOrder(int oid){
        return "redirect:/admin/AllOrder";
    }

}

