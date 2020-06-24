package com.example.dogservice;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cat-service")
public interface CatClient {

  @GetMapping("/api/v1/cats")
  List<Cat> getAllCats();
}
