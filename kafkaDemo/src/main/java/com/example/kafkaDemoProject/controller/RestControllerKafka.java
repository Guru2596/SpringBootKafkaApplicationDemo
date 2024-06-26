package com.example.kafkaDemoProject.controller;

import com.example.kafkaDemoProject.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerKafka {
    @Autowired
    Producer producer;

    @GetMapping("/producerMsg")
    public String sendMessage(@RequestParam("message") String message){
        producer.sendMsgToTopic(message);
        return "Message sent Successfully to the your Vaccination Slot Information topic";
    }
}
