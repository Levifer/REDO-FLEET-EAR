package com.realdolmen.controller;

import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
            model.addAttribute("error",null);
            cars = carModelWebServiceClient.getCarModelsByType(type.toUpperCase());
        }

        if(brand!=null){
            logger.info("find cars by brand: " + brand);
            cars = carModelWebServiceClient.getCarModelsByBrand(brand.toLowerCase());
            model.addAttribute("error",null);
        }

        if(brand== null && type== null){
            logger.info("find all cars");
            cars = carModelWebServiceClient.getAllCarModels();
            model.addAttribute("error",null);
        }
        if(cars.isEmpty()){
            model.addAttribute("error","No cars found");
        }

        model.addAttribute("isLoggedIn",true);
        model.addAttribute("cars",cars);
        return "carList";
    }

    @RequestMapping("/car/{id}")
    public String detail(@PathVariable("id") String id, Model model, final RedirectAttributes redirectAttributes) {
        logger.info("/car - id: " + id);
        CarModel carModel = carModelWebServiceClient.getCarModelsById(Integer.parseInt(id));
        model.addAttribute("isLoggedIn",true);
        redirectAttributes.addAttribute("id", id);
        model.addAttribute("car", carModel);
        return "carDetail";
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
