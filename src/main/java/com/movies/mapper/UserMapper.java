package com.movies.mapper;

import com.movies.pojo.User;
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
public interface UserMapper extends BaseMapper<User> {

}
