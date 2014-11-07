package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by BPTAT47 on 7/11/2014.
 */
@Controller
public class CarOrderController {

    @LoggerProducer
    private Logger logger;

    @RequestMapping(value="/car/order",method = RequestMethod.POST)
    public String orderACar(Model model, @ModelAttribute("car") CarModel carModel){
        logger.info(carModel.getName());
        //model.addAttribute("car", carModel);

        /*CarModel carModel = new CarModel("Audi", "A3", CarType.HATCHBACK, Fuel.DIESEL, new Date(), 2, 140000, 180000, 20, 9, 88, 2, "", new Pack());
        carModel.setBrand("Audi");
        carModel.setName("A3");
        carModel.setType(CarType.HATCHBACK);
        carModel.setFuelType(Fuel.DIESEL);
        carModel.setYear(XMLGregorianCalendarImpl.createDate(2014,11,7,1);
        carModel.setCategory(2);
        carModel.setMinKm(140000);
        carModel.setMaxKm(180000);
        carModel.setDeliveryTime(20);
        model.addAttribute(carModel);
        logger.info(carModel.getBrand());*/

        return "carOrder";
    }
}
