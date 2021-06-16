package com.movies.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.movies.pojo.Order;

import java.util.List;

public interface OrderService extends IService<Order> {

    List<Order> getOrder(Integer uid);

    void delete(Integer oid);
    List<Order> getAllOrder();

}
