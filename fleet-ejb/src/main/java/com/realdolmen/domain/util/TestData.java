package com.realdolmen.domain.util;


import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by BPTAT47 on 30/10/2014.
 */
@Singleton
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
