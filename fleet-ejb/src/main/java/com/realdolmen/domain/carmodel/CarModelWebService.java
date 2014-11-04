package com.realdolmen.domain.carmodel;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.transaction.Transactional;
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
        List<CarModel> carModels = carModelRepository.findAllByBrand(brand);
        return carModels;
    }

    @WebResult(name = "carModels")
    @WebMethod(action = "getCarModelsByType")
    public List<CarModel> getCarModelsByType(@WebParam(name = "type") String type) {
        List<CarModel> carModels = carModelRepository.findAllByType(type);
        return carModels;
    }

}
