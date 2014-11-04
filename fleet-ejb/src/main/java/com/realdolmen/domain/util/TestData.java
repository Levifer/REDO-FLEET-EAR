package com.realdolmen.domain.util;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by BPTAT47 on 30/10/2014.
 */
@Singleton
@Startup
public class TestData {

    @Inject
    private TestDataInserter inserter;


    @PostConstruct
    private  void init(){
        inserter.insertOptions();
        inserter.insertAPack();
        inserter.insertACarModel();
        inserter.insertASecondCarModelWithAnUpdatedPack();
        inserter.insertEmployees();

    }
}
