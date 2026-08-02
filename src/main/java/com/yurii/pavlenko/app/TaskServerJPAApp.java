package com.yurii.pavlenko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.yurii.pavlenko.assistant.tasks.repositories")
@EntityScan(basePackages = "com.yurii.pavlenko.assistant.tasks.models.entity")
public class TaskServerJPAApp {
    public static void main(String[] args) {
        SpringApplication.run(TaskServerJPAApp.class, args);
    }
}