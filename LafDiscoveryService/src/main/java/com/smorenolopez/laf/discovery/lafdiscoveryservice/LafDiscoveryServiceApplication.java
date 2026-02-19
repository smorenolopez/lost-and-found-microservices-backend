package com.smorenolopez.laf.discovery.lafdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LafDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LafDiscoveryServiceApplication.class, args);
    }

}
