package com.lying.examplemultidatasource;

import com.lying.examplemultidatasource.orm.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleMultiDatasourceApplicationTests {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Test
    public void contextLoads() {
        jdbcTemplate1.update("INSERT INTO user (name, age) VALUES (?, ?)", "Lee", 25);
        jdbcTemplate1.update("INSERT INTO user (name, age) VALUES (?, ?)", "Bryant", 39);
        jdbcTemplate1.update("INSERT INTO user (name, age) VALUES (?, ?)", "Mic", 38);

        jdbcTemplate2.update("INSERT INTO user (name, age) VALUES (?, ?)", "Jame", 33);



        List<User> list =  jdbcTemplate1.query("select * from user", new RowMapper<User>() {
            @Nullable
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return User.builder().id(Long.valueOf(resultSet.getString("id")))
                        .name(resultSet.getString("name"))
                        .age(Integer.valueOf(resultSet.getString("age")))
                        .build();
            }
        });
        System.err.println(list);

        System.err.println("");

         list =  jdbcTemplate2.query("select * from user", new RowMapper<User>() {
            @Nullable
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return User.builder().id(Long.valueOf(resultSet.getString("id")))
                        .name(resultSet.getString("name"))
                        .age(Integer.valueOf(resultSet.getString("age")))
                        .build();
            }
        });
        System.err.println(list);

    }

}
