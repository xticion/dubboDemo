package com.xticion.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDubboProviderApplication.class, args);
    }

}
