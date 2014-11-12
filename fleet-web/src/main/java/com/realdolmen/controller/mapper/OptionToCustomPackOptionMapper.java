package com.realdolmen.controller.mapper;




import com.realdolmen.wsdl.option.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Levifer on 11/11/2014.
 */
public class OptionToCustomPackOptionMapper {
    public com.realdolmen.wsdl.customPack.Option mapTo(Option itemRetrievedFromSoap ){

        return  setValues(itemRetrievedFromSoap);
    }

    public List< com.realdolmen.wsdl.customPack.Option> mapTo(List<Option> options){
        List<com.realdolmen.wsdl.customPack.Option> toCustomPackOptions = new ArrayList<com.realdolmen.wsdl.customPack.Option>();
        for (Option item : options ){
            toCustomPackOptions.add(mapTo(item));
        }
        return toCustomPackOptions;
    }

    public com.realdolmen.wsdl.customPack.Option setValues(Option option){
        com.realdolmen.wsdl.customPack.Option customOption = new com.realdolmen.wsdl.customPack.Option();
        customOption.setDescription(option.getDescription());
        customOption.setName(option.getName());
        customOption.setOPTIONID(option.getOPTIONID());
        customOption.setPrice(option.getPrice());
        customOption.setType(option.getType());
        return  customOption;
    }
}
