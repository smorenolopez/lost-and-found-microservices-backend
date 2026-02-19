package com.smorenolopez.laf.users.lafusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LafUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(LafUsersApplication.class, args);
    }

}
