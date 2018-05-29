package com.lying.examplemybatis.controller;

import com.lying.examplemybatis.domain.User;
import com.lying.examplemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/say_hello/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        User user = userService.findByName(name);
        System.out.println(user);
        return "Hello, " + user.getName();
    }

}
