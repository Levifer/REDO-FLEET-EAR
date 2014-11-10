package com.realdolmen.controller.mapper;

import com.realdolmen.wsdl.pack.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AEIAT46 on 10-11-2014.
 */
public class PackToCarModelOptionMapper {


    public com.realdolmen.wsdl.carmodel.Option  mapTo(Option itemRetrievedFromSoap ){

        return  setValues(itemRetrievedFromSoap);
    }

    public List<com.realdolmen.wsdl.carmodel.Option> mapTo(List<Option> options){
        List<com.realdolmen.wsdl.carmodel.Option> toCustomPackOptions = new ArrayList<com.realdolmen.wsdl.carmodel.Option>();
        for (Option item : options ){
            toCustomPackOptions.add(mapTo(item));
        }
        return toCustomPackOptions;
    }

    public com.realdolmen.wsdl.carmodel.Option setValues(Option option){
        com.realdolmen.wsdl.carmodel.Option customOption = new com.realdolmen.wsdl.carmodel.Option();
        customOption.setDescription(option.getDescription());
        customOption.setName(option.getName());
        customOption.setOPTIONID(option.getOPTIONID());
        customOption.setPrice(option.getPrice());
        customOption.setType(option.getType());
        return  customOption;
    }
}
