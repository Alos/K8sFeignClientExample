package com.example.dogservice;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DogController {

  private final CatClient catClient;

  @GetMapping("/api/v1/talk")
  public List<Cat> talkWithCatService() {
    List<Cat> catsFromTheCatService = catClient.getAllCats();
    return catsFromTheCatService;
  }

  @GetMapping("/api/v1/bark")
  public String bark() {
    return "woof woof";
  }
}
