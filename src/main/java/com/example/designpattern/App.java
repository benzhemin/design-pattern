package com.example.designpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger log = LoggerFactory.getLogger(App.class);

  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    log.info("Starting application...");
    System.out.println(new App().getGreeting());
    log.info("Application finished successfully.");

    try {
      // Simulate an error
      throw new RuntimeException("Test exception");
    } catch (Exception e) {
      log.error("An error occurred", e);
    }
  }
}
