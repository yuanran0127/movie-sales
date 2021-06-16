package com.movies.serviceImpl;

import com.movies.mapper.BuyMapper;
import com.movies.pojo.Movie;
import com.movies.pojo.Order;
import com.movies.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BuyMapper buyMapper;

    public Movie selectMovie(Integer mid) {
        return buyMapper.selectMovie(mid);
    }

    public void insertOrder(Order order) {
        buyMapper.insertOrder(order);
    }
}
