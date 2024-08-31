package com.rroberts.spring_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UATDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "UAT datasource";
    }
}
