package com.realdolmen.controller;

import com.realdolmen.domain.Enums;
import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.pack.Pack;
import com.realdolmen.domain.pack.PackRepository;
import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by BPTAT47 on 7/11/2014.
 */
@Controller
public class CarOrderController {

    @LoggerProducer
    private Logger logger;

    @RequestMapping("/order/order")
    public String orderACar(Model model){

        CarModel carModel = new CarModel("Audi", "A3", Enums.CarType.HATCHBACK, Enums.Fuel.DIESEL, new Date(), 2, 140000, 180000, 20, 9, 88, 2, "", new Pack());
        model.addAttribute(carModel);
        logger.info(carModel.getBrand());

        return  "carOrder";
    }
}
