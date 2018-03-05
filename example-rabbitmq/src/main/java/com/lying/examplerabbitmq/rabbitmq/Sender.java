package com.lying.examplerabbitmq.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send() {
        String context = "first mq  >>" + new Date();
        System.err.println("hello" + context);
        amqpTemplate.convertAndSend("hello", context);
    }


}
