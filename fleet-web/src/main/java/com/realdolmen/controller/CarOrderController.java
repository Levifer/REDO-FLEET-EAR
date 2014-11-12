package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
//import com.realdolmen.wsdl.car.Car;
import com.realdolmen.wsdl.car.Car;
import com.realdolmen.wsdl.car.CarWebService;
import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.CarModelWebService;
import com.realdolmen.wsdl.option.Option;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by BPTAT47 on 7/11/2014.
 */
@Controller
public class CarOrderController {

    @LoggerProducer
    private Logger logger;

    @Autowired
    private CarWebService carWebService;

    private Car car;
    @RequestMapping(value = "/ordercar/order",method = RequestMethod.GET)
    public String orderACar(HttpServletRequest request,Model model) throws DatatypeConfigurationException {
        Map<String, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        List<Option> optionList = new ArrayList<>();
        List<Option> realOptions  = new ArrayList<>();;
        Car car = new Car();
        if (inputFlashMap != null) {
            car= (Car)inputFlashMap.get("car");
            optionList = (List<Option>) inputFlashMap.get("optionList");
            realOptions  = new ArrayList<>();
            realOptions.add(optionList.get(0));
            realOptions.add(optionList.get(1));
        }
        if(model.asMap().get("car")!=null){
            car = (Car)model.asMap().get("car");
            optionList = (List<Option>) model.asMap().get("optionList");
            realOptions = new ArrayList<>();
            realOptions.add(optionList.get(0));
            realOptions.add(optionList.get(1));
        }
        model.addAttribute("car",car);
        model.addAttribute("optionList", realOptions);
        model.addAttribute("totalPrice",getTotalPrice(realOptions));
        logger.info(car.getModel().getName());
        logger.info("/***************CarOrderController********************/");
        request.getSession().removeAttribute("carmodel");
        return  "carOrder";
    }

    @RequestMapping(value = "/ordercar/order",method = RequestMethod.POST)
    public String confirmOrder(Model model){

        carWebService.createCar(car);
        logger.info("/***************Car Insterted********************/");
        return "index";
    }

    public BigDecimal getTotalPrice(List<Option> options){
        BigDecimal totalPrice = new BigDecimal(0);
        for (Option option : options) {
            totalPrice = totalPrice.add(option.getPrice());
        }
        return totalPrice;
    }
}
