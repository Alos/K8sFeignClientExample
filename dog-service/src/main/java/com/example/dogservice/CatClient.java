package com.example.dogservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cat-service")
@CircuitBreaker(name = "cat-service")
@Retry(name = "cat-service")
public interface CatClient {

  @GetMapping("/api/v1/cats")
  List<Cat> getAllCats();
}
