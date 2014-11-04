package com.realdolmen.service;

import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.carmodel.CarModelWebService;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by AEIAT46 on 3-11-2014.
 */
@Service
public class CarModelWebServiceClient extends WebServiceGatewaySupport {
    private static CarModelWebService carModelWebService;
    public void callWebService(String brand) {

        URL wsdlLocation = null;
        try {
            wsdlLocation = new URL("http://localhost:8080/fleet-ejb/CarModelWebService?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        QName serviceName = new QName("http://carmodel.domain.realdolmen.com/", "CarModelWebService");
        javax.xml.ws.Service service = javax.xml.ws.Service.create(wsdlLocation, serviceName);
        carModelWebService = service.getPort(CarModelWebService.class);

    }
}
