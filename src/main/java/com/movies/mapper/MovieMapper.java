package com.movies.mapper;

import com.movies.pojo.Movie;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author movies
 * @since 2021-05-13
 */
@Mapper
public interface MovieMapper extends BaseMapper<Movie> {

}
