package com.realdolmen.controller.mapper;


import com.realdolmen.wsdl.car.CarType;
import com.realdolmen.wsdl.car.Fuel;
import com.realdolmen.wsdl.car.Option;
import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.Pack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Levifer on 11/11/2014.
 */
public class CarModelToCar {
    public com.realdolmen.wsdl.car.CarModel mapTo(com.realdolmen.wsdl.carmodel.CarModel carModel ){

        return  setValues(carModel);
    }

    public com.realdolmen.wsdl.car.CarModel setValues(com.realdolmen.wsdl.carmodel.CarModel carModel){
        com.realdolmen.wsdl.car.CarModel carModelToBeReturned = new com.realdolmen.wsdl.car.CarModel();
        carModelToBeReturned.setId(carModel.getId());
        carModelToBeReturned.setBrand(carModel.getBrand());
        carModelToBeReturned.setName(carModel.getName());
        carModelToBeReturned.setCategory(carModel.getCategory());
        carModelToBeReturned.setCo2(carModel.getCo2());
        carModelToBeReturned.setDeliveryTime(carModel.getDeliveryTime());
        carModelToBeReturned.setFiscalHp(carModel.getFiscalHp());
        carModelToBeReturned.setFuelType(mapFuel(carModel.getFuelType()));
        carModelToBeReturned.setImageUrl(carModel.getImageUrl());
        carModelToBeReturned.setMinKm(carModel.getMinKm());
        carModelToBeReturned.setMaxKm(carModel.getMaxKm());
        carModelToBeReturned.setQuarter(carModel.getQuarter());
        carModelToBeReturned.setType(mapType(carModel.getType()));
        carModelToBeReturned.setYear(carModel.getYear());
        carModelToBeReturned.setPack(mapPack(carModel.getPack()));
        return  carModelToBeReturned;
    }

    public Fuel mapFuel(com.realdolmen.wsdl.carmodel.Fuel fuel){
        return Fuel.fromValue(fuel.value());
    }

    public CarType mapType(com.realdolmen.wsdl.carmodel.CarType type){
        return  CarType.fromValue(type.value());
    }

    public com.realdolmen.wsdl.car.Pack mapPack(Pack pack){
        com.realdolmen.wsdl.car.Pack packToBeReturned = new com.realdolmen.wsdl.car.Pack();
        packToBeReturned.setOptions(new com.realdolmen.wsdl.car.Pack.Options());
        List<Option> optionList = mapOption(pack.getOptions().getOption());
        packToBeReturned.getOptions().getOption().addAll(optionList);
        packToBeReturned.setPrice(pack.getPrice());
        packToBeReturned.setBenefitPrice(pack.getBenefitPrice());
        packToBeReturned.setDowngrade(pack.getDowngrade());
        packToBeReturned.setId(pack.getId());
        packToBeReturned.setUpgrade(pack.getUpgrade());

        return packToBeReturned;
    }

    public  List<Option> mapOption(List<com.realdolmen.wsdl.carmodel.Option> option){
        List<Option>  optionToBeReturned = new ArrayList<Option>();
        for (com.realdolmen.wsdl.carmodel.Option option1 : option) {
            Option  optionToBeAdded = new com.realdolmen.wsdl.car.Option();
            optionToBeAdded.setDescription(option1.getDescription());
            optionToBeAdded.setName(option1.getName());
            optionToBeAdded.setOPTIONID(option1.getOPTIONID());
            optionToBeAdded.setPrice(option1.getPrice());
            optionToBeAdded.setType(option1.getType());
            optionToBeReturned.add(optionToBeAdded);
        }
        return optionToBeReturned;
    }

}
