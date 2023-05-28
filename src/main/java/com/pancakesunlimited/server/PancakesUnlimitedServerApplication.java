package com.pancakesunlimited.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.pancakesunlimited.server")
@EntityScan("com.pancakesunlimited.server")
public class PancakesUnlimitedServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PancakesUnlimitedServerApplication.class, args);
    }

}
