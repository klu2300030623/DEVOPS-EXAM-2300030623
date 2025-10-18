package com.klef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendSpringbootappApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BackendSpringbootappApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BackendSpringbootappApplication.class, args);
        System.out.println("Spring Boot Project is Running ...");
    }

}