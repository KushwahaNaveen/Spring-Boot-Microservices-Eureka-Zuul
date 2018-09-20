package com.nav.microservice2.mservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.nav.utility")
@ComponentScan(basePackages = {"com.nav.controller"})
public class MServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MServiceTwoApplication.class, args);
    }
}
