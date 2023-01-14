package com.kobe.flywhey.FlywayDemo.service;

import com.kobe.flywhey.FlywayDemo.dto.AddTestRequest;
import com.kobe.flywhey.FlywayDemo.entity.Test;
import com.kobe.flywhey.FlywayDemo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void addTest(AddTestRequest request) {
        Test test = new Test();
        test.setText(request.getText());

        testRepository.save(test);
    }
}
