package com.realdolmen.controller.mapper;

import com.realdolmen.wsdl.carmodel.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AEIAT46 on 10-11-2014.
 */
public class CarModelToPackOptionMapper {
    public com.realdolmen.wsdl.pack.Option  mapTo(Option itemRetrievedFromSoap ){

        return  setValues(itemRetrievedFromSoap);
    }

    public List<com.realdolmen.wsdl.pack.Option> mapTo(List<Option> options){
        List<com.realdolmen.wsdl.pack.Option> toCustomPackOptions = new ArrayList<com.realdolmen.wsdl.pack.Option>();
        for (Option item : options ){
            toCustomPackOptions.add(mapTo(item));
        }
        return toCustomPackOptions;
    }

    public com.realdolmen.wsdl.pack.Option setValues(Option option){
        com.realdolmen.wsdl.pack.Option customOption = new com.realdolmen.wsdl.pack.Option();
        customOption.setDescription(option.getDescription());
        customOption.setName(option.getName());
        customOption.setOPTIONID(option.getOPTIONID());
        customOption.setPrice(option.getPrice());
        customOption.setType(option.getType());
        return  customOption;
    }
}
