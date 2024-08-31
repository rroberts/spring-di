package com.rroberts.spring_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDatasourceService implements DatasourceService {
    @Override
    public String getDatasource() {
        return "Prod datasource";
    }
}
