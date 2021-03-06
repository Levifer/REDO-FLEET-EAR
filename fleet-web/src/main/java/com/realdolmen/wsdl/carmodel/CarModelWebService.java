
package com.realdolmen.wsdl.carmodel;

import com.realdolmen.domain.carmodel.CarModel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CarModelWebService", targetNamespace = "http://carmodel.domain.realdolmen.com/")
public interface CarModelWebService {


    /**
     * 
     * @param id
     * @return
     *     returns com.realdolmen.wsdl.carmodel.CarModel
     */
    @WebMethod(action = "getCarModelById")
    @WebResult(name = "carModel", targetNamespace = "http://carmodel.domain.realdolmen.com/")
    @RequestWrapper(localName = "getCarModelById", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetCarModelById")
    @ResponseWrapper(localName = "getCarModelByIdResponse", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetCarModelByIdResponse")
    public CarModel getCarModelById(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param brand
     * @return
     *     returns java.util.List<com.realdolmen.wsdl.carmodel.CarModel>
     */
    @WebMethod(action = "getCarModelsByBrand")
    @WebResult(name = "carModels", targetNamespace = "")
    @RequestWrapper(localName = "getCarModelsByBrand", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetCarModelsByBrand")
    @ResponseWrapper(localName = "getCarModelsByBrandResponse", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetCarModelsByBrandResponse")
    public List<CarModel> getCarModelsByBrand(
        @WebParam(name = "brand", targetNamespace = "")
        String brand);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<com.realdolmen.wsdl.carmodel.CarModel>
     */
    @WebMethod(action = "getCarModelsByType")
    @WebResult(name = "carModels", targetNamespace = "")
    @RequestWrapper(localName = "getCarModelsByType", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetCarModelsByType")
    @ResponseWrapper(localName = "getCarModelsByTypeResponse", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetCarModelsByTypeResponse")
    public List<CarModel> getCarModelsByType(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @return
     *     returns java.util.List<com.realdolmen.wsdl.carmodel.CarModel>
     */
    @WebMethod(action = "getAllCarModels")
    @WebResult(name = "carModels", targetNamespace = "")
    @RequestWrapper(localName = "getAllCarModels", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetAllCarModels")
    @ResponseWrapper(localName = "getAllCarModelsResponse", targetNamespace = "http://carmodel.domain.realdolmen.com/", className = "com.realdolmen.wsdl.carmodel.GetAllCarModelsResponse")
    public List<CarModel> getAllCarModels();

}
