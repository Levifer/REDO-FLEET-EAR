package com.realdolmen.controller;

import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Controller
public class CarController {
    @LoggerProducer
    private Logger logger;

    @Autowired
    private CarModelWebServiceClient carModelWebServiceClient;

    private boolean error = true;

    @RequestMapping("/")
    public String home(Model model) {
        logger.info("home");
        model.addAttribute("isLoggedIn",true);
        return "index";
    }

    @RequestMapping("/car")
    public String list(@RequestParam(value="type", required = false) String type, @RequestParam(value = "brand", required = false) String brand, Model model) {
        logger.info("/car");
        List<CarModel> cars = new ArrayList<CarModel>();
        if(type!=null){
            logger.info("find cars by type: " + type);
            GetCarModelsByTypeResponse carModels = carModelWebServiceClient.getCarModelsByType(type.toUpperCase());
            cars = carModels.getCarModels();
        }

        if(brand!=null){
            logger.info("find cars by brand: " + brand);
            GetCarModelsByBrandResponse carModels = carModelWebServiceClient.getCarModelsByBrand(brand.toLowerCase());
            cars = carModels.getCarModels();
        }

        if(cars.isEmpty()){
            logger.info("findAllCars");
            GetAllCarModelsResponse carModels = carModelWebServiceClient.getAllCarModels();
            cars = carModels.getCarModels();
        }

        model.addAttribute("isLoggedIn",true);
        model.addAttribute("cars",cars);
        return "carList";
    }

    @RequestMapping("/car/{id}")
    public String detail(@PathVariable("id") String id, Model model) {
        logger.info("/car - id: " + id);
        GetCarModelByIdResponse carModelsByIdResponse = carModelWebServiceClient.getCarModelsById(Integer.parseInt(id));
        model.addAttribute("isLoggedIn",true);
        model.addAttribute("car", carModelsByIdResponse.getCarModel());
        return "carDetail";
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
