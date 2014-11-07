package com.realdolmen.service;

import com.realdolmen.wsdl.carmodel.CarModel;
import com.realdolmen.wsdl.carmodel.CarModelWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.List;

/**
 * Created by AEIAT46 on 3-11-2014.
 */
@Service
public class CarModelWebServiceClient extends WebServiceGatewaySupport {

    @Autowired
    private CarModelWebService carModelWebService;

    public List<CarModel> getCarModelsByBrand(String brand) {
        return carModelWebService.getCarModelsByBrand(brand);
    }

    public List<CarModel> getCarModelsByType(String type) {
        return carModelWebService.getCarModelsByType(type);
    }

    public CarModel getCarModelsById(Integer id) {
        return carModelWebService.getCarModelById(id);
    }

    public List<CarModel> getAllCarModels() {
        return carModelWebService.getAllCarModels();
    }

    public void addCarModel(CarModel carModel){
        carModelWebService.addCarModel(carModel);
    }
}
