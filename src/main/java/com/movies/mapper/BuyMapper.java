package com.movies.mapper;

import com.movies.pojo.Movie;
import com.movies.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuyMapper {

    Movie selectMovie(Integer mid);

    void insertOrder(Order order);
}
