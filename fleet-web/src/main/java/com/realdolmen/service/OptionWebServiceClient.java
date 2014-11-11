package com.realdolmen.service;

import com.realdolmen.controller.mapper.OptionMapper;
import com.realdolmen.controller.mapper.OptionToPackOptionMapper;
import com.realdolmen.controller.mapper.PackToCarModelOptionMapper;
import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.option.Option;
import com.realdolmen.wsdl.option.OptionWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AEIAT46 on 10-11-2014.
 */
@Service
public class OptionWebServiceClient {

    @Autowired
    private OptionWebService optionWebService;

    public List<Option> getAllOptions() {
        return optionWebService.findAllOption();
    }

    public List<Option> getOptionsByCarModelId(CarModel carModel) {
        PackToCarModelOptionMapper optionMapper = new PackToCarModelOptionMapper();
        List<Option> optionsRetrievedFromDB = optionWebService.findOptionByCarModelId(carModel.getId());
        List<Option> optionsToBeReturned = new ArrayList<>();
        for (Option option : optionsRetrievedFromDB) {
            if(!carModel.getPack().getOptions().getOption().contains(option)){
                optionsToBeReturned.add(option);
            }
        }
        return optionsToBeReturned;
    }
}
