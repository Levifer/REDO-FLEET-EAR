
package com.realdolmen.wsdl.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "PackWebServiceService", targetNamespace = "http://pack.domain.realdolmen.com/", wsdlLocation = "http://localhost:8080/fleet-ejb/PackWebService?wsdl")
public class PackWebServiceService
    extends Service
{

    private final static URL PACKWEBSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.realdolmen.wsdl.pack.PackWebServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.realdolmen.wsdl.pack.PackWebServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/fleet-ejb/PackWebService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/fleet-ejb/PackWebService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PACKWEBSERVICESERVICE_WSDL_LOCATION = url;
    }

    public PackWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PackWebServiceService() {
        super(PACKWEBSERVICESERVICE_WSDL_LOCATION, new QName("http://pack.domain.realdolmen.com/", "PackWebServiceService"));
    }

    /**
     * 
     * @return
     *     returns PackWebService
     */
    @WebEndpoint(name = "PackWebServicePort")
    public PackWebService getPackWebServicePort() {
        return super.getPort(new QName("http://pack.domain.realdolmen.com/", "PackWebServicePort"), PackWebService.class);
    }

}
