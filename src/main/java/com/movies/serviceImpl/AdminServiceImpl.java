package com.movies.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movies.mapper.AdminMapper;
import com.movies.pojo.Admin;
import com.movies.service.AdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
