package com.kobe.flywhey.FlywayDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }
}
