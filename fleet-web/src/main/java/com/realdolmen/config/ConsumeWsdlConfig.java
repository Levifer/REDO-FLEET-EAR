package com.realdolmen.config;

import com.realdolmen.wsdl.car.CarWebService;
import com.realdolmen.wsdl.car.CarWebServiceService;
import com.realdolmen.wsdl.carmodel.CarModelWebService;
import com.realdolmen.wsdl.carmodel.CarModelWebServiceService;
import com.realdolmen.wsdl.option.OptionWebService;
import com.realdolmen.wsdl.option.OptionWebServiceService;
import com.realdolmen.wsdl.pack.PackWebService;
import com.realdolmen.wsdl.pack.PackWebServiceService;
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

    @Bean
    public OptionWebService optionWebService(){
        return new OptionWebServiceService().getOptionWebServicePort();
    }

    @Bean
    public PackWebService packWebService(){
        return new PackWebServiceService().getPackWebServicePort();
    }
    @Bean
    public CarWebService carWebService(){
        return new CarWebServiceService().getCarWebServicePort();
    }

}
