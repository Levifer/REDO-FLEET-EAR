package com.realdolmen.controller;

import com.realdolmen.domain.employee.Employee;
import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by AEIAT46 on 29/10/2014.
 */
@Controller
public class LoginController {

    @LoggerProducer
    private Logger logger;

    @RequestMapping("/login")
    public String getLoginPage(Model model){
        logger.info("getLoginPage");
        model.addAttribute("isLoggedIn",false);
        return "login";
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