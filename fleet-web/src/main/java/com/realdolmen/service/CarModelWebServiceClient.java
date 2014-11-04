package com.realdolmen.service;

import com.realdolmen.domain.carmodel.CarModel;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.util.List;

/**
 * Created by AEIAT46 on 3-11-2014.
 */
@Service
public class CarModelWebServiceClient extends WebServiceGatewaySupport {
    public void callWebService(String brand){
        List<CarModel> cars = (List<CarModel>)getWebServiceTemplate().marshalSendAndReceive(brand,
                new SoapActionCallback("http://localhost:8080/fleet-ejb/CarModelWebService/carModels"));

    }
}
