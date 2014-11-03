package com.realdolmen.repository;

import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.service.CarModelWebServiceClient;
import com.realdolmen.util.LoggerProducer;
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

    private List<String[]> cars(){
        List<String[]> cars = new ArrayList<>();
        String[] car = new String[]{
                "1","Audi", "A3", "Hatchback", "1.6 TDI", "105", "ultra attraction"
        };
        cars.add(car);

        car = new String[]{
                "2","Seat", "Ibiza ST", "Break", "1.6 CRTDI", "105","Style Ecomotive"
        };
        cars.add(car);

        car = new String[]{
                "3","Seat", "Leon Style", "Hatchback", "1.6 CRTDI", "105",""
        };
        cars.add(car);

        car = new String[]{
                "4","Skoda", "Octavia Berline", "Berline", "1.6 CRTDI", "110",""
        };
        cars.add(car);

        car = new String[]{
                "5","Skoda", "Octavia Combi", "Break", "1.6 TDI", "110","Greenline"
        };
        cars.add(car);

        car = new String[]{
                "6","Skoda", "Roomster", "Monovolume", "1.6 TDI", "75",""
        };
        cars.add(car);

        car = new String[]{
                "7","Volkswagen", "Golf 7", "Hatchback", "1.6 TDI", "105","Highline"
        };
        cars.add(car);

        car = new String[]{
                "8","Volkswagen", "Golf Variant", "Break", "1.6 TDI", "105","Trendline"
        };
        cars.add(car);

        return cars;
    }

    @RequestMapping("/")
    public String home(Model model) {
        logger.info("home");
        model.addAttribute("isLoggedIn",true);
        carModelWebServiceClient.callWebService("audi");
        return "index";
    }

    @RequestMapping("/car")
    public String list(@RequestParam(value="type", required = false) String type, @RequestParam(value = "brand", required = false) String brand, Model model) {
        logger.info("/car");
        List<String[]> filterCars = new ArrayList<>();
        List<String[]> baseCars = cars();
        if(type!=null){
            logger.info("find cars by type: " + type);
            for(String[] car : baseCars){
                if(car[3].toLowerCase().equals(type.toLowerCase())){
                    filterCars.add(car);
                }
            }
        }

        if(brand!=null){
            logger.info("find cars by brand: " + brand);
            if(filterCars.isEmpty()){
                for(String[] car : baseCars){
                    if(car[1].toLowerCase().equals(brand.toLowerCase())){
                        filterCars.add(car);
                    }
                }
            }else{
                for(String[] car : filterCars){
                    if(car[1].toLowerCase().equals(brand.toLowerCase())){
                        filterCars.add(car);
                    }
                }
            }
        }

        System.out.println(filterCars);
        model.addAttribute("isLoggedIn",true);
        model.addAttribute("cars",filterCars);
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
