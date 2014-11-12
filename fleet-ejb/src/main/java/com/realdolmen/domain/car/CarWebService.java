package com.realdolmen.domain.car;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by BPTAT47 on 30/10/2014.
 */
@WebService
@Stateless
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CarWebService {

    @Inject
    private CarRepository carRepository;

    @WebMethod(action = "create")
    public void createCar(@WebParam(name = "Car")Car car){
        carRepository.persist(car);
    }

    @WebResult(name = "Car")
    @WebMethod(action = "findCarById")
    public Car findCarById(@WebParam(name = "id") Integer id) {
        return carRepository.find(id);
    }

    @WebResult(name = "Cars")
    @WebMethod(action = "findAllCars")
    public List<Car> findAllCars(){
        return carRepository.findAll();
    }

    

}
