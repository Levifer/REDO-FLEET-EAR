package com.realdolmen.service;

import com.realdolmen.wsdl.option.Option;
import com.realdolmen.wsdl.option.OptionWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AEIAT46 on 10-11-2014.
 */
@Service
public class OptionWebServiceClient {

    @Autowired
    private OptionWebService optionWebService;

    public List<Option> getAllOptions(){
        return optionWebService.findAllOption();
    }
}
