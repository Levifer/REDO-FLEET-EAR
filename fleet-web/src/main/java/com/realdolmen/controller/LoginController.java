package com.realdolmen.controller;

import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by AEIAT46 on 29/10/2014.
 */
@Controller
public class LoginController {

    @LoggerProducer
    private Logger logger;

    //Spring Security see this :
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
        model.setViewName("login");

        return model;

    }

//    public String login(Employee employee){
//        logger.info("Employee:" + employee.getEmail());
//        if(!employee.getEmail().isEmpty() && !employee.getPassword().isEmpty() && employee.getEmail().endsWith("@realdolmen.com")){
//            return "yes";
//        }else{
//            return "no";
//        }
//    }

    public String login(){
        logger.info("login()");
        return "yes";
    }

}