package com.kobe.flywhey.FlywayDemo.controller;

import com.kobe.flywhey.FlywayDemo.dto.AddTestRequest;
import com.kobe.flywhey.FlywayDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/")
    public void addTest(@RequestBody AddTestRequest request) {
        testService.addTest(request);
    }
}
