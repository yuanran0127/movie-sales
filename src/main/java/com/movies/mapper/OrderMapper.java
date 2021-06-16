package com.movies.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.movies.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> getOrder(Integer uid);
    List<Order> getAllOrder();

    void delete(Integer oid);

}
