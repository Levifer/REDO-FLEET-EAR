package com.realdolmen.controller;

import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.CarType;
import com.realdolmen.wsdl.carmodel.Fuel;
import com.realdolmen.wsdl.carmodel.Pack;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TLAAU71 on 7/11/2014.
 */
@Controller
public class CarModelController {
    @LoggerProducer
    private Logger logger;

    @Autowired
    private CarModelWebServiceClient carModelWebServiceClient;

    private  List<Fuel> fuels;
    private List<Pack> packs;
    private List<CarType> types;
    private Pack pack = new Pack();

    @RequestMapping("admin")
    public String admin(Model model){
        populate(model);
        model.addAttribute("carModel", new CarModel());
        model.addAttribute("fuelList", fuels);
        model.addAttribute("packList",packs);
        model.addAttribute("typeList", types);
        model.addAttribute("pack",pack);
        return "insertCarModel";
    }

    public void populate(Model model){

        fuels = new ArrayList<>();
        fuels.add(Fuel.BENZINE);
        fuels.add(Fuel.DIESEL);

        packs = new ArrayList<>();
        packs.add(new Pack());

        types = new ArrayList<>();
        types.add(CarType.BERLINE);
        types.add(CarType.BREAK);
        types.add(CarType.COUPE);
        types.add(CarType.HATCHBACK);
        types.add(CarType.JEEP);
        types.add(CarType.MONOVOLUME);

    }
    @RequestMapping(value="/admin/car", method = RequestMethod.POST)
    public String insertCarModel(@ModelAttribute("carModel")CarModel carModel,BindingResult result,Model model){
        /*if(result.hasErrors()){
            logger.info("CarModel is not valid");
            return "insertCarModel";
        }else{*/
            logger.info("Carmodel Valid");
            carModelWebServiceClient.addCarModel(carModel);
            logger.info("Carmodel is insterted");
            return "carModelSucces";
        //}
    }

}
