package com.movies.service;

import com.movies.pojo.Movieorder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.movies.pojo.Order;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author movies
 * @since 2021-06-15
 */
public interface MovieorderService extends IService<Movieorder> {
    public List<Order> getAllOrder();


}
