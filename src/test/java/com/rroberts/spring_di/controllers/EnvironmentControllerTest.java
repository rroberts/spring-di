package com.rroberts.spring_di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
class EnvironmentControllerTest {

    @Autowired
    private EnvironmentController controller;

    @Test
    void getDatasourceService() {
        System.out.println(controller.getDatasourceService());
    }
}