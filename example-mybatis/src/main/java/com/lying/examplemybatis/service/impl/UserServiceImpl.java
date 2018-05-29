package com.lying.examplemybatis.service.impl;

import com.lying.examplemybatis.dao.UserDao;
import com.lying.examplemybatis.domain.User;
import com.lying.examplemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
