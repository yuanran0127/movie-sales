package com.movies.service;

import com.movies.pojo.User;

public interface ModificationService {

    User getUser(Integer uid);

    void update(User user);

    String selectUser(Integer uid);

}
