package com.movies.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movies.mapper.TypeMapper;
import com.movies.pojo.Type;
import com.movies.service.TypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
