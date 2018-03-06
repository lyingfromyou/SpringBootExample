package com.lying.examplelog4j.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LogManager.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.error("error");
        return "hello";
    }


}
