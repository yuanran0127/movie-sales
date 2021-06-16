package com.movies.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movies.mapper.UserMapper;
import com.movies.pojo.User;
import com.movies.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author movies
 * @since 2021-05-13
// */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
