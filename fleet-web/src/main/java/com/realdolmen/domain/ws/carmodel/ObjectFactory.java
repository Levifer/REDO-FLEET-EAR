
package com.realdolmen.domain.ws.carmodel;

import com.realdolmen.domain.carmodel.CarModel;
import com.realdolmen.domain.option.Option;
import com.realdolmen.domain.pack.Pack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.realdolmen.domain.carmodel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CarModel_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "carModel");
    private final static QName _CarModels_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "carModels");
    private final static QName _Pack_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "pack");
    private final static QName _Option_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "option");
    private final static QName _CarModelsResponse_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "carModelsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.realdolmen.domain.carmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarModels }
     * 
     */
    public CarModels createCarModels() {
        return new CarModels();
    }

    /**
     * Create an instance of {@link CarModel }
     * 
     */
    public CarModel createCarModel() {
        return new CarModel();
    }

    /**
     * Create an instance of {@link Pack }
     * 
     */
    public Pack createPack() {
        return new Pack();
    }

    /**
     * Create an instance of {@link CarModelsResponse }
     * 
     */
    public CarModelsResponse createCarModelsResponse() {
        return new CarModelsResponse();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "carModel")
    public JAXBElement<CarModel> createCarModel(CarModel value) {
        return new JAXBElement<CarModel>(_CarModel_QNAME, CarModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarModels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "carModels")
    public JAXBElement<CarModels> createCarModels(CarModels value) {
        return new JAXBElement<CarModels>(_CarModels_QNAME, CarModels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "pack")
    public JAXBElement<Pack> createPack(Pack value) {
        return new JAXBElement<Pack>(_Pack_QNAME, Pack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Option }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "option")
    public JAXBElement<Option> createOption(Option value) {
        return new JAXBElement<Option>(_Option_QNAME, Option.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarModelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "carModelsResponse")
    public JAXBElement<CarModelsResponse> createCarModelsResponse(CarModelsResponse value) {
        return new JAXBElement<CarModelsResponse>(_CarModelsResponse_QNAME, CarModelsResponse.class, null, value);
    }

}
