package ru.javabegin.oauth2.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SimpleBackend {
    public static void main(String[] args) {
        SpringApplication.run(SimpleBackend.class, args);
    }

}
