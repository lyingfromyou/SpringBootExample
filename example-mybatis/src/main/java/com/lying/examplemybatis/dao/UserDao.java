package com.lying.examplemybatis.dao;

import com.lying.examplemybatis.domain.User;

public interface UserDao {

    User findById(Long id);

    User findByName(String name);

}
