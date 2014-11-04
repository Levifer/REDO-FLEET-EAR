package com.realdolmen.service;

import com.realdolmen.wsdl.carmodel.GetCarModelsByBrand;
import com.realdolmen.wsdl.carmodel.GetCarModelsByBrandResponse;
import com.realdolmen.wsdl.carmodel.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

/**
 * Created by AEIAT46 on 3-11-2014.
 */
@Service
public class CarModelWebServiceClient extends WebServiceGatewaySupport {
    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public GetCarModelsByBrandResponse getCarModelsByBrand(String brand) {
        ObjectFactory of = new ObjectFactory();
        GetCarModelsByBrand request = new GetCarModelsByBrand();
        request.setBrand(brand);
        GetCarModelsByBrandResponse carModelsResponse = of.createGetCarModelsByBrandResponse();

        JAXBElement<GetCarModelsByBrandResponse> response = (JAXBElement<GetCarModelsByBrandResponse>) webServiceTemplate.marshalSendAndReceive(
                of.createGetCarModelsByBrand(request),
                new SoapActionCallback("getCarModelsByBrand")
        );


        return response.getValue();

    }
}
