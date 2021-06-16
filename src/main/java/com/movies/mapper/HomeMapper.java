package com.movies.mapper;

import com.movies.pojo.Movie;
import com.movies.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface HomeMapper {

    List<Type> getType();

    List<Movie> getMovie();

    List<String> getArea();

    List<Movie> select(String type, String year, String area);

    List<Movie> searchMovie(String searchfield);

}


