package com.gazgeek.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
public class Application {

    Logger logger = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Scheduled(fixedDelay = 5000)
    public void scheduleFixedDelayTask() {
        logger.info("Sample logging from application - {}" , LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }


}