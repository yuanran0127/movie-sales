package com.movies.mapper;

import com.movies.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModificationMapper {

    User getUser(Integer uid);

    void update(User user);

    String selectUser(Integer uid);
}
