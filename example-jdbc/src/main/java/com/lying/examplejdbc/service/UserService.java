package com.lying.examplejdbc.service;

import com.lying.examplejdbc.orm.User;

import java.util.List;

public interface UserService {
    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    List<User> getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();

}
