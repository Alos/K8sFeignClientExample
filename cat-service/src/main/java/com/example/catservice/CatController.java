package com.example.catservice;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

  @GetMapping("/api/v1/cats")
  public List<Cat> getAllCats() {
    Cat catA = new Cat("Fluffy", 12);
    Cat catB = new Cat("Grumpy cat", 30);
    return List.of(catA, catB);
  }
}
