package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

  @Value("${NAME:World}")
  String name;
  

  @RestController
  class HelloworldController {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    String getFoosBySimplePathWithPathVariable(@PathVariable("id") String id) {
        return id;
    }
    // String hello() {
    //   return "testing again";
    // }

    
    // @GetMapping("/")
    // String hello() {
    //   return "testing again";
    // }
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }
}