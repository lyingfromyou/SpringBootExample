package com.lying.examplemybatis.service;

import com.lying.examplemybatis.domain.User;

public interface UserService {

    User findById(Long id);

    User findByName(String name);
}
