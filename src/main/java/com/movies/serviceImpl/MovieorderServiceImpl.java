package com.movies.serviceImpl;

import com.movies.pojo.Movieorder;
import com.movies.mapper.MovieorderMapper;
import com.movies.pojo.Order;
import com.movies.service.MovieorderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author movies
 * @since 2021-06-15
 */
@Service
public class MovieorderServiceImpl extends ServiceImpl<MovieorderMapper, Movieorder> implements MovieorderService {
    @Autowired
    MovieorderMapper movieorderMapper;
    @Override
    public List<Order> getAllOrder() {
        return movieorderMapper.getAllOrder();
    }
}
