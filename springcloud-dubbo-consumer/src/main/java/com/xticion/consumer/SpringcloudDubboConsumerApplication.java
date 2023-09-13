package com.xticion.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDubboConsumerApplication.class, args);
    }

}
