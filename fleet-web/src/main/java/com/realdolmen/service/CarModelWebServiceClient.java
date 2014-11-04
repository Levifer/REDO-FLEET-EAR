package com.realdolmen.service;
        import com.realdolmen.domain.ws.carmodel.CarModels;
        import com.realdolmen.domain.ws.carmodel.CarModelsResponse;
        import com.realdolmen.domain.ws.carmodel.ObjectFactory;
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

    public CarModelsResponse getCarModelsByBrand(String brand){
        ObjectFactory of = new ObjectFactory();
        CarModels request = new CarModels();
        request.setBrand(brand);
        CarModelsResponse carModelsResponse = of.createCarModelsResponse();

        JAXBElement<CarModelsResponse> response = (JAXBElement<CarModelsResponse>) webServiceTemplate.marshalSendAndReceive(
                of.createCarModels(request),
                new SoapActionCallback("getCarModels")
        );


        return response.getValue();

    }
}
