package com.mercury.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author stanley
 * @create 2019/10/1 9:07
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String args[]) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
