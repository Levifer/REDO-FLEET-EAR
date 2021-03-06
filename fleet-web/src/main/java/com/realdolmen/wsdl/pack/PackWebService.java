
package com.realdolmen.wsdl.pack;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "PackWebService", targetNamespace = "http://pack.domain.realdolmen.com/")
public interface PackWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.realdolmen.wsdl.pack.Pack>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://pack.domain.realdolmen.com/", className = "com.realdolmen.wsdl.pack.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://pack.domain.realdolmen.com/", className = "com.realdolmen.wsdl.pack.FindAllResponse")
    public List<Pack> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.realdolmen.wsdl.pack.Pack
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findById", targetNamespace = "http://pack.domain.realdolmen.com/", className = "com.realdolmen.wsdl.pack.FindById")
    @ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://pack.domain.realdolmen.com/", className = "com.realdolmen.wsdl.pack.FindByIdResponse")
    public Pack findById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.realdolmen.wsdl.pack.Pack
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePack", targetNamespace = "http://pack.domain.realdolmen.com/", className = "com.realdolmen.wsdl.pack.UpdatePack")
    @ResponseWrapper(localName = "updatePackResponse", targetNamespace = "http://pack.domain.realdolmen.com/", className = "com.realdolmen.wsdl.pack.UpdatePackResponse")
    public Pack updatePack(
        @WebParam(name = "arg0", targetNamespace = "")
        Pack arg0);

}
