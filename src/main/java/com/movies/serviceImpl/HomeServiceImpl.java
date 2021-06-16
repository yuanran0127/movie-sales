package com.movies.serviceImpl;

import com.movies.mapper.HomeMapper;
import com.movies.pojo.Movie;
import com.movies.pojo.Type;
import com.movies.pojo.User;
import com.movies.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeMapper homeMapper;

    public List<Type> getType() {
        return homeMapper.getType();
    }

    public List<Movie> getMovie() {
        return homeMapper.getMovie();
    }

    public List<String> getArea() {
        return homeMapper.getArea();
    }

    public List<Movie> select(String type, String year, String area){
        String newType="%"+type+"%";
        String newYear=year+"%";
        return homeMapper.select(newType,newYear,area);
    }

    public List<Movie> searchMovie(String searchfield){
        String newsearchfield="%"+searchfield+"%";
        return homeMapper.searchMovie(newsearchfield);
    }

}
