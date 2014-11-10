package com.realdolmen.service;

import com.realdolmen.util.LoggerProducer;
import com.realdolmen.wsdl.pack.Pack;
import com.realdolmen.wsdl.pack.PackWebService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AEIAT46 on 10-11-2014.
 */
@Service
public class PackWebServiceClient {
    @LoggerProducer
    private Logger logger;
    @Autowired
    private PackWebService packWebService;

    public void addPack(Pack pack){
        packWebService.createPack(pack);
        logger.info("addPack");
    }
}
