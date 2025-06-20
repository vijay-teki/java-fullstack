package com.example.vijay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.vijay.repository") // ✅ This is crucial
public class VijayApplication {
    public static void main(String[] args) {
        SpringApplication.run(VijayApplication.class, args);
    }
}
