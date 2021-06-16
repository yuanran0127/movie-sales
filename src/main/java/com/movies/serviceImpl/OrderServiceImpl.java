package com.movies.serviceImpl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movies.mapper.OrderMapper;
import com.movies.pojo.Order;
import com.movies.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getOrder(Integer uid) {
        return orderMapper.getOrder(uid);
    }

    public void delete(Integer oid){
        orderMapper.delete(oid);
    }

    public List<Order> getAllOrder() {
        return orderMapper.getAllOrder();
    }

}
