package com.taller.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.taller.devops"})
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World Vincent";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
