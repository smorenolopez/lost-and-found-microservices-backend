package com.smorenolopez.laf.emailverification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmailVerificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailVerificationApplication.class, args);
    }

}
