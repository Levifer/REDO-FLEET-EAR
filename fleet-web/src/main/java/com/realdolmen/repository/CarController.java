package com.realdolmen.repository;

import com.realdolmen.util.LoggerProducer;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by BPTAT47 on 29/10/2014.
 */
@Controller
public class CarController {
    @LoggerProducer
    private Logger logger;

    private boolean error = true;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("isLoggedIn",true);
        return "index";
    }

    @RequestMapping("/car")
    public String list(@RequestParam(value="type", required = false) String type, @RequestParam(value = "brand", required = false) String brand, Model model) {
        logger.info("/car");
        if(type!=null){
            logger.info("find cars by type: " + type);
        }

        if(brand!=null){
            logger.info("find cars by brand: " + brand);
        }
        model.addAttribute("isLoggedIn",true);
        return "carList";
    }

    @RequestMapping("/car/{id}")
    public String detail(@PathVariable("id") String id, Model model) {
        logger.info("/car - id: " + id);
        model.addAttribute("isLoggedIn",true);
        model.addAttribute("id",id);
        return "carDetail";
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
