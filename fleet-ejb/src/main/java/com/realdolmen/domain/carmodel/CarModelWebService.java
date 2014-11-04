package com.realdolmen.domain.carmodel;

import com.realdolmen.domain.Enums;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by BPTAT47 on 3/11/2014.
 */
@WebService
@Stateless
public class CarModelWebService {
    @Inject
    private CarModelRepository carModelRepository;

    @WebResult(name = "carModels")
    @WebMethod(action = "getCarModelsByBrand")
    public List<CarModel> getCarModelsByBrand(@WebParam(name = "brand") String brand) {
        return carModelRepository.findAllByBrand(brand);
    }

    @WebResult(name = "carModels")
    @WebMethod(action = "getCarModelsByType")
    public List<CarModel> getCarModelsByType(@WebParam(name = "type") String type) {
        for(Enums.CarType carType : Enums.CarType.values()){
            if(carType.getLabel().toUpperCase().equals(type.toUpperCase())){
                return carModelRepository.findAllByType(carType);
            }
        }
        return null;
    }

    @WebResult(name = "carModel")
    @WebMethod(action = "getCarModelById")
    public CarModel getCarModelById(@WebParam(name = "id") Integer id) {
        return carModelRepository.find(id);
    }

    @WebResult(name = "carModels")
    @WebMethod(action = "getAllCarModels")
    public List<CarModel> getAllCarModels() {
        return carModelRepository.findAll();
    }
}