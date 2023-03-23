package com.ducku.Controller;

import com.ducku.api.HomeAPI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

  private final HomeAPI homeAPI;


  @GetMapping("/home")
  public String index() {
    return homeAPI.hello();
  }

}
