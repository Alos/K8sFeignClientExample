package com.example.dogservice;

import feign.RequestLine;
import java.util.List;

public interface CatApi {

  @RequestLine("GET /api/v1/cats")
  List<Cat> getAllCats();
}
