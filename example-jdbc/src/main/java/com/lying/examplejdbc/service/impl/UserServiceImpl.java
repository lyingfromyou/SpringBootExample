package com.lying.examplejdbc.service.impl;

import com.lying.examplejdbc.orm.User;
import com.lying.examplejdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("INSERT INTO user(name, age)VALUES (?, ?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM user WHERE user.name = ?", name);
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query("SELECT user.id, user.name, user.age FROM user", new RowMapper<User>() {
            @Nullable
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                System.err.println(i);
                return User.builder().id(Long.valueOf(resultSet.getString("id")))
                        .name(resultSet.getString("name"))
                        .age(Integer.valueOf(resultSet.getString("age")))
                        .build();
            }
        });
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM user");
    }
}
