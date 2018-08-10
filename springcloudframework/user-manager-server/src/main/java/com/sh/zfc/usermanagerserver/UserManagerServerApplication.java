package com.sh.zfc.usermanagerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserManagerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagerServerApplication.class, args);
    }
}
