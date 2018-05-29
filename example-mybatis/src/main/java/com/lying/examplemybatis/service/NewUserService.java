package com.lying.examplemybatis.service;

import com.lying.examplemybatis.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface NewUserService {

    @Select("select * from user where id = #{id}")
    @Results({
            @Result(property = "name", column = "user_name")
    })
    User findById(@Param("id") Long id);

}
