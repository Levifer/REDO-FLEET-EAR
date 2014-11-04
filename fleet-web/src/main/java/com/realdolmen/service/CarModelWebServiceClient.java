package com.realdolmen.service;

import com.realdolmen.wsdl.carmodel.*;
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

        JAXBElement<GetCarModelsByBrandResponse> response = (JAXBElement<GetCarModelsByBrandResponse>) webServiceTemplate.marshalSendAndReceive(
                of.createGetCarModelsByBrand(request),
                new SoapActionCallback("getCarModelsByBrand")
        );

        return response.getValue();
    }

    public GetCarModelsByTypeResponse getCarModelsByType(String type) {
        ObjectFactory of = new ObjectFactory();
        GetCarModelsByType request = new GetCarModelsByType();
        request.setType(type);

        JAXBElement<GetCarModelsByTypeResponse> response = (JAXBElement<GetCarModelsByTypeResponse>) webServiceTemplate.marshalSendAndReceive(
                of.createGetCarModelsByType(request),
                new SoapActionCallback("getCarModelsByType")
        );

        return response.getValue();
    }

    public GetCarModelByIdResponse getCarModelsById(Integer id) {
        ObjectFactory of = new ObjectFactory();
        GetCarModelById request = new GetCarModelById();
        request.setId(id);

        JAXBElement<GetCarModelByIdResponse> response = (JAXBElement<GetCarModelByIdResponse>) webServiceTemplate.marshalSendAndReceive(
                of.createGetCarModelById(request),
                new SoapActionCallback("getCarModelById")
        );

        return response.getValue();
    }

    public GetAllCarModelsResponse getAllCarModels() {
        ObjectFactory of = new ObjectFactory();
        GetAllCarModels request = new GetAllCarModels();

        JAXBElement<GetAllCarModelsResponse> response = (JAXBElement<GetAllCarModelsResponse>) webServiceTemplate.marshalSendAndReceive(
                of.createGetAllCarModels(request),
                new SoapActionCallback("getAllCarModels")
        );

        return response.getValue();
    }
}
