package com.example.demo.1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
  
  @RequestMapping("/hello")
  String home() {
    return "Hello World";
  }
}
