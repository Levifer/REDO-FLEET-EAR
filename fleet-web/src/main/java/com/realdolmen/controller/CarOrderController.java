package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;

import com.realdolmen.wsdl.carmodel.CarType;
import com.realdolmen.wsdl.carmodel.Fuel;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by BPTAT47 on 7/11/2014.
 */
@Controller
public class CarOrderController {

    @LoggerProducer
    private Logger logger;

    @RequestMapping("/ordercar/order")
    public String orderACar(Model model) throws DatatypeConfigurationException {
        CarModel carModel = new CarModel();
        logger.info(carModel.getName());
        carModel.setBrand("Audi");
        carModel.setName("A3");
        carModel.setType(CarType.HATCHBACK);
        carModel.setFuelType(Fuel.DIESEL);
        Date date = new Date();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(date);
        XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        carModel.setYear(date2);
        carModel.setCategory(2);
        carModel.setMinKm(140000);
        carModel.setMaxKm(180000);
        carModel.setDeliveryTime(20);
        model.addAttribute("carmodel",carModel);
        logger.info("/***************CarOrderController********************/");
        return  "carOrder";

    }
}
