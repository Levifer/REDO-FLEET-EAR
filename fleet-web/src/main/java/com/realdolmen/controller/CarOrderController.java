package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.carmodel.CarModel;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Map;

/**
 * Created by BPTAT47 on 7/11/2014.
 */
@Controller
public class CarOrderController {

    @LoggerProducer
    private Logger logger;

    @RequestMapping(value = "/ordercar/order",method = RequestMethod.GET)
    public String orderACar(HttpServletRequest request,Model model) throws DatatypeConfigurationException {

        Map<String, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        CarModel carModel = new CarModel();
        if (inputFlashMap != null) {
            carModel = (CarModel)inputFlashMap.get("carmodel");
        }
        logger.info(carModel.getName());
        model.addAttribute("carmodel",carModel);
        logger.info("/***************CarOrderController********************/");
        //request.getSession().removeAttribute("carmodel");

        return  "carOrder";

    }
}
