package com.movies.controller.userPacket;

import com.movies.pojo.Movie;
import com.movies.pojo.Order;
import com.movies.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/movie")
@SessionAttributes("mid")
public class BuyController {

    @Autowired
    private BuyService buyService;

    @RequestMapping("/buy/{mid}")
    public String buyMovie(@PathVariable("mid") Integer mid, Model model){
        model.addAttribute("mid",mid);
        model.addAttribute("movie",buyService.selectMovie(mid));
        return "buy";
    }

    @RequestMapping("/buy/createOrder")
    public String createOrder(Integer mid, Integer buynum, HttpSession session){
        Movie movie=new Movie();
        movie.setMId(mid);
        Order order=new Order();
        order.setOdate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        order.setM_id(movie);
        order.setOnum(buynum);
        Integer uid = (Integer) session.getAttribute("uid");
        order.setU_id(uid);
        buyService.insertOrder(order);
        return "redirect:/movie/home";
    }

}
