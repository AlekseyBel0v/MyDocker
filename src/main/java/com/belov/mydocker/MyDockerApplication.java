package com.belov.mydocker;

import com.belov.mydocker.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = User.class))

public class MyDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDockerApplication.class, args);
    }

}