package com.example.dogservice;

import feign.FeignException;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DogController {

  private final CatClient catClient;

  @GetMapping("/api/v1/talk")
  public List<Cat> talkWithCatService() {
    return catClient.getAllCats();
  }

  @GetMapping("/api/v1/talk2")
  public List<Cat> talkWithCatService2() {
    try {
      return catClient.getAllCats2();
    } catch (FeignException.NotFound e) {
      log.error("Opps, something broke!");
      log.error(e.getCause().toString());
      log.error(e.getMessage());
      return Collections.EMPTY_LIST;
    }
  }

  @GetMapping("/api/v1/bark")
  public String bark() {
    return "woof woof";
  }
}
