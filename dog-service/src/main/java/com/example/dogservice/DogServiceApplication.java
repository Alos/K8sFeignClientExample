package com.example.dogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DogServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(DogServiceApplication.class, args);
  }
}
