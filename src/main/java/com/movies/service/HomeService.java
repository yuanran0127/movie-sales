package com.movies.service;

import com.movies.pojo.Movie;
import com.movies.pojo.Type;
import com.movies.pojo.User;

import java.util.List;
import java.util.Map;

public interface HomeService {

    List<Type> getType();

    List<Movie> getMovie();

    List<String> getArea();

    List<Movie> select(String type, String year, String area);

    List<Movie> searchMovie(String searchfield);

}
