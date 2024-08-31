package com.rroberts.spring_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Dev datasource";
    }
}
