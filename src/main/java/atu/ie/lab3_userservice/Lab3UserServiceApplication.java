package atu.ie.lab3_userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Lab3UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab3UserServiceApplication.class, args);
    }

}
