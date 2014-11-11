package com.realdolmen.controller.mapper;


import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.Pack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Levifer on 11/11/2014.
 */
public class CarModelToCar {
    /*public CarModel mapTo(com.realdolmen.wsdl.carmodel.CarModel carModel ){

        return  setValues(carModel);
    }

    public CarModel setValues(com.realdolmen.wsdl.carmodel.CarModel carModel){
        com.realdolmen.wsdl.car.CarModel carModelToBeReturned = new com.realdolmen.wsdl.car.CarModel();
        carModelToBeReturned.setPack(mapPack(carModel.getPack()));
        return  carModelToBeReturned;
    }


    public com.realdolmen.wsdl.car.Pack mapPack(Pack pack){
        com.realdolmen.wsdl.car.Pack packToBeReturned = new com.realdolmen.wsdl.car.Pack();
       /* packToBeReturned.setOptions(mapOption(pack.getOptions().getOption()));
        packToBeReturned.setPrice(pack.getPrice());
        packToBeReturned.setBenefitPrice(pack.getBenefitPrice());
        packToBeReturned.setDowngrade(pack.getDowngrade());
        packToBeReturned.setId(pack.getId());
        packToBeReturned.setUpgrade(pack.getUpgrade());

        return packToBeReturned;
    }

    public  List<com.realdolmen.wsdl.car.Pack.Options> mapOption(List<com.realdolmen.wsdl.carmodel.Option> option){
        List<com.realdolmen.wsdl.car.Pack.Options>  optionToBeReturned = new ArrayList<com.realdolmen.wsdl.car.Pack.Options>();
        for (com.realdolmen.wsdl.carmodel.Option option1 : option) {
          /*  com.realdolmen.wsdl.car.Pack.Options.  optionToBeAdded = new com.realdolmen.wsdl.car.Option();
            optionToBeAdded.setDescription(option1.getDescription());
            optionToBeAdded.setName(option1.getName());
            optionToBeAdded.setOPTIONID(option1.getOPTIONID());
            optionToBeAdded.setPrice(option1.getPrice());
            optionToBeAdded.setType(option1.getType());
            optionToBeReturned.add(optionToBeAdded);
        }
        return optionToBeReturned;
    }
    */
}
