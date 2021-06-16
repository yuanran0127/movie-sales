package com.movies.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movies.mapper.MovieMapper;
import com.movies.pojo.Movie;
import com.movies.service.MovieService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author movies
 * @since 2021-05-13
 */
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements MovieService {


}
