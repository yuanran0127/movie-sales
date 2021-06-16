package com.movies.mapper;

import com.movies.pojo.Movieorder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.movies.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author movies
 * @since 2021-06-15
 */
@Mapper
public interface MovieorderMapper extends BaseMapper<Movieorder> {
    public List<Order> getAllOrder();

}
