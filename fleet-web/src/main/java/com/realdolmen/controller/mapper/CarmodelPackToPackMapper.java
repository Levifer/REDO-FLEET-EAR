package com.realdolmen.controller.mapper;

import com.realdolmen.wsdl.option.Option;
import com.realdolmen.wsdl.pack.Pack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TLAAU71 on 11/11/2014.
 */
public class CarmodelPackToPackMapper {

    private CarModelToPackOptionMapper optionMapper = new CarModelToPackOptionMapper();

    public Pack  mapTo(com.realdolmen.wsdl.carmodel.Pack itemRetrievedFromSoap ){

        return  setValues(itemRetrievedFromSoap);
    }

    public List<Pack> mapTo(List<com.realdolmen.wsdl.carmodel.Pack> carmodelPacks){
        List<Pack> packs = new ArrayList<Pack>();
        for (com.realdolmen.wsdl.carmodel.Pack item : carmodelPacks ){
            packs.add(mapTo(item));
        }
        return packs;
    }

    public Pack setValues(com.realdolmen.wsdl.carmodel.Pack carmodelPack){
        Pack pack = new Pack();
        pack.setId(carmodelPack.getId());
        pack.setPrice(carmodelPack.getPrice());
        pack.setBenefitPrice(carmodelPack.getBenefitPrice());
        pack.setDowngrade(carmodelPack.getDowngrade());
        pack.setUpgrade(carmodelPack.getUpgrade());
        pack.setOptions(new Pack.Options());
        List<com.realdolmen.wsdl.pack.Option> optionList = optionMapper.mapTo(carmodelPack.getOptions().getOption());
        pack.getOptions().getOption().addAll(optionList);
        return  pack;
    }
}
