package com.realdolmen.controller;

import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
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
    public String home(Model model,Principal principal) {
        logger.info("home");
        if(principal != null)
            model.addAttribute("isLoggedIn",true);
        else
            model.addAttribute("isLoggedIn",false);
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

        model.addAttribute("isLoggedIn", true);
        model.addAttribute("cars",cars);
        return "carList";
    }

    @RequestMapping("/car/{id}")
    public String detail(@PathVariable("id") String id, RedirectAttributes redirectAttributes,HttpServletRequest request) {
        logger.info("/car - id: " + id);
        CarModel carModel = carModelWebServiceClient.getCarModelsById(Integer.parseInt(id));
        request.getSession().setAttribute("carmodel",carModel);
        return "redirect:/car/detail";
    }

    @RequestMapping(value = "/car/detail",method = RequestMethod.GET)
    public String carDetail(Model model, @ModelAttribute("id") final String id, Principal principal, RedirectAttributes redirectAttributes,HttpServletRequest request) {
        logger.info("Principal: " + principal.getName());
        logger.info("/carDetail - id: " + id);
        CarModel carModel = (CarModel)request.getSession().getAttribute("carmodel");
        model.addAttribute("car", carModel);
        return "carDetail";
    }

    @RequestMapping(value = "/car/detail", method = RequestMethod.POST)
    public String handleFormSubmission( final RedirectAttributes redirectAttributes,HttpServletRequest request) {
        CarModel carModel = (CarModel)request.getSession().getAttribute("carmodel");
        redirectAttributes.addFlashAttribute("carmodel",carModel);
       request.getSession().removeAttribute("carmodel");
        return "redirect:/ordercar/order";
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
