package com.gazgeek.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${greeting.message}")
    private String message;

    @RequestMapping("/")
    String home() {

        logger.info("Request arrived in home mappings");
        return "Message is : " + message;
    }

}
