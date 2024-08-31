package com.rroberts.spring_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QADatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "QA datasource";
    }
}
