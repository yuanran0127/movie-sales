package com.movies.service;

import com.movies.pojo.Movie;
import com.movies.pojo.Order;

public interface BuyService {

    Movie selectMovie(Integer mid);

    void insertOrder(Order order);
}
