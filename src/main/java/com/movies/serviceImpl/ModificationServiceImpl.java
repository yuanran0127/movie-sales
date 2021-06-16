package com.movies.serviceImpl;

import com.movies.mapper.ModificationMapper;
import com.movies.pojo.User;
import com.movies.service.ModificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModificationServiceImpl implements ModificationService {

    @Autowired
    private ModificationMapper modificationMapper;

    public User getUser(Integer uid){
        return modificationMapper.getUser(uid);
    }

    public void update(User user){
        modificationMapper.update(user);
    }

    public String selectUser(Integer uid){
        return modificationMapper.selectUser(uid);
    }
}
