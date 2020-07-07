package com.gazgeek.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${greeting.message}")
    private String message;

    @RequestMapping("/")
    String home() {
        return "Message is : " + message;
    }

}
