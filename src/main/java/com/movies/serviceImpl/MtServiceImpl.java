package com.movies.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.movies.mapper.MtMapper;
import com.movies.pojo.Mt;
import com.movies.service.MtService;
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
public class MtServiceImpl extends ServiceImpl<MtMapper, Mt> implements MtService {

}
