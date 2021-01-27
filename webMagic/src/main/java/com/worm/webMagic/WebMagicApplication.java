package com.worm.webMagic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时
public class WebMagicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebMagicApplication.class, args);
    }

}
