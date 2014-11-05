package com.realdolmen.config;

import com.realdolmen.wsdl.carmodel.CarModelWebService;
import com.realdolmen.wsdl.carmodel.CarModelWebServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by AEIAT46 on 5-11-2014.
 */

@Configuration
public class ConsumeWsdlConfig {
    @Bean
    public CarModelWebService carModelWebService(){
        return new CarModelWebServiceService().getCarModelWebServicePort();
    }
}
