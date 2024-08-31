package com.rroberts.spring_di.controllers;

import com.rroberts.spring_di.services.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final DatasourceService datasourceService;

    public EnvironmentController(final DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasourceService() {
        return datasourceService.getDatasource();
    }
}
