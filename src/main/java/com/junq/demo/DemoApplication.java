package com.junq.demo;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
//    SpringApplication.run(DemoApplication.class, args);
    new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
  }
}
