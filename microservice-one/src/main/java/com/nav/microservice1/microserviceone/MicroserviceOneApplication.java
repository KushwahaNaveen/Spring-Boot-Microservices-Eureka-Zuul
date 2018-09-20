package com.nav.microservice1.microserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.nav.microservice1.bo")
@ComponentScan(basePackages = {"com.nav.microservice1.controller"})
@EnableJpaRepositories("com.nav.microservice1.repository")
@EnableDiscoveryClient
public class MicroserviceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOneApplication.class, args);
    }
}
