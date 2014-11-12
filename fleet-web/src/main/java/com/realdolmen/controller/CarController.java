package com.realdolmen.controller;

import com.realdolmen.controller.dto.OptionList;
import com.realdolmen.controller.mapper.CarModelToCar;
import com.realdolmen.controller.mapper.CustomPackOptionToCarOptionMapper;
import com.realdolmen.controller.mapper.OptionMapper;
import com.realdolmen.controller.mapper.OptionToCustomPackOptionMapper;
import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.service.OptionWebServiceClient;
import com.realdolmen.util.LoggerProducer;
//import com.realdolmen.wsdl.car.Car;
import com.realdolmen.wsdl.car.Car;
import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.Option;
import com.realdolmen.wsdl.customPack.CustomPack;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Autowired
    private OptionWebServiceClient optionWebServiceClient;

    private boolean error = true;

    @RequestMapping("/")
    public String home(Model model, Principal principal) {
        logger.info("home");
        loginOrLogout(model, principal);
        return "index";
    }

    @RequestMapping("/car/*")
    public void loginOrLogout(Model model, Principal principal) {
        if (principal != null)
            model.addAttribute("isLoggedIn", true);
        else
            model.addAttribute("isLoggedIn", false);
    }

    @RequestMapping("/car")
    public String list(@RequestParam(value = "type", required = false) String type, @RequestParam(value = "brand", required = false) String brand, Model model) {
        logger.info("/car");
        List<CarModel> carModels = new ArrayList<CarModel>();
        if (type != null) {
            logger.info("find cars by type: " + type);
            model.addAttribute("error", null);
            carModels = carModelWebServiceClient.getCarModelsByType(type.toUpperCase());
        }

        if (brand != null) {
            logger.info("find cars by brand: " + brand);
            carModels = carModelWebServiceClient.getCarModelsByBrand(brand.toLowerCase());
            model.addAttribute("error", null);
        }

        if (brand == null && type == null) {
            logger.info("find all cars");
            carModels = carModelWebServiceClient.getAllCarModels();
            model.addAttribute("error", null);
        }
        if (carModels.isEmpty()) {
            model.addAttribute("error", "No cars found");
        }

        model.addAttribute("isLoggedIn", true);
        model.addAttribute("carModels", carModels);
        return "carList";
    }

    @RequestMapping("/car/{id}")
    public String detail(@PathVariable("id") String id, RedirectAttributes redirectAttributes, HttpServletRequest request) {
        logger.info("/car - id: " + id);
        CarModel carModel = carModelWebServiceClient.getCarModelsById(Integer.parseInt(id));
        request.getSession().setAttribute("carmodel", carModel);
        return "redirect:/car/detail";
    }

    @RequestMapping(value = "/car/detail", method = RequestMethod.GET)
    public String carDetail(Model model, @ModelAttribute("id") final String id, Principal principal, RedirectAttributes redirectAttributes, HttpServletRequest request) {
        logger.info("Principal: " + principal.getName());
        logger.info("/carDetail - id: " + id);

        CarModel carModel = (CarModel) request.getSession().getAttribute("carmodel");
        ArrayList<com.realdolmen.wsdl.option.Option> list = new ArrayList<com.realdolmen.wsdl.option.Option>();
        list.add(optionWebServiceClient.findOptionById(35));
        list.add(optionWebServiceClient.findOptionById(36));
        list.add(optionWebServiceClient.findOptionById(37));
        list.add(optionWebServiceClient.findOptionById(38));
        list.add(optionWebServiceClient.findOptionById(39));
        list.add(optionWebServiceClient.findOptionById(40));

        request.getSession().setAttribute("listOfOptions",list);

        List<com.realdolmen.wsdl.option.Option> options =   list;
        model.addAttribute("carModel", carModel);
        model.addAttribute("options", new OptionList());
        model.addAttribute("customOptions",list);
        return "carDetail";
    }



    @RequestMapping(value = "/car/detail", method = RequestMethod.POST)
    public String handleFormSubmission(final RedirectAttributes redirectAttributes, HttpServletRequest request) {
        CarModel carModel = (CarModel) request.getSession().getAttribute("carmodel");
        List<com.realdolmen.wsdl.option.Option> optionList = (  List<com.realdolmen.wsdl.option.Option>)request.getSession().getAttribute("listOfOptions");

        com.realdolmen.wsdl.car.CustomPack customPack = new com.realdolmen.wsdl.car.CustomPack();
        customPack.setOptions(new com.realdolmen.wsdl.car.CustomPack.Options());

        String [] selectedOptions = request.getParameterValues("items");
        List<com.realdolmen.wsdl.customPack.Option> optionsToBeSaved = new ArrayList<>();
        for (String s : selectedOptions) {
            OptionToCustomPackOptionMapper optionMapper = new OptionToCustomPackOptionMapper();
            com.realdolmen.wsdl.option.Option option = optionWebServiceClient.findOptionById(Integer.parseInt(s));
            optionsToBeSaved.add(optionMapper.mapTo(option));
        }

        Car car = new Car();
        CarModelToCar carModelToCar = new CarModelToCar();
        car.setModel(carModelToCar.mapTo(carModel));
        CustomPackOptionToCarOptionMapper carOptionMapper = new CustomPackOptionToCarOptionMapper();
        customPack.getOptions().getOption().addAll(carOptionMapper.mapTo(optionsToBeSaved));
        car.setCustomPack(customPack);
        redirectAttributes.addFlashAttribute("optionList", optionList);
        redirectAttributes.addFlashAttribute("car", car);
        return "redirect:/ordercar/order";
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
