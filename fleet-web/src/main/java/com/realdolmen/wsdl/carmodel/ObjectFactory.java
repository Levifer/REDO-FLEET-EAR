
package com.realdolmen.wsdl.carmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.realdolmen.wsdl.carmodel package. 
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

    private final static QName _GetCarModelsByBrandResponse_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "getCarModelsByBrandResponse");
    private final static QName _Pack_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "pack");
    private final static QName _CarModel_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "carModel");
    private final static QName _Option_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "option");
    private final static QName _GetCarModelsByTypeResponse_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "getCarModelsByTypeResponse");
    private final static QName _GetCarModelsByType_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "getCarModelsByType");
    private final static QName _GetCarModelsByBrand_QNAME = new QName("http://carmodel.domain.realdolmen.com/", "getCarModelsByBrand");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.realdolmen.wsdl.carmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCarModelsByType }
     * 
     */
    public GetCarModelsByType createGetCarModelsByType() {
        return new GetCarModelsByType();
    }

    /**
     * Create an instance of {@link GetCarModelsByBrandResponse }
     * 
     */
    public GetCarModelsByBrandResponse createGetCarModelsByBrandResponse() {
        return new GetCarModelsByBrandResponse();
    }

    /**
     * Create an instance of {@link CarModel }
     * 
     */
    public CarModel createCarModel() {
        return new CarModel();
    }

    /**
     * Create an instance of {@link GetCarModelsByBrand }
     * 
     */
    public GetCarModelsByBrand createGetCarModelsByBrand() {
        return new GetCarModelsByBrand();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link GetCarModelsByTypeResponse }
     * 
     */
    public GetCarModelsByTypeResponse createGetCarModelsByTypeResponse() {
        return new GetCarModelsByTypeResponse();
    }

    /**
     * Create an instance of {@link Pack }
     * 
     */
    public Pack createPack() {
        return new Pack();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarModelsByBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "getCarModelsByBrandResponse")
    public JAXBElement<GetCarModelsByBrandResponse> createGetCarModelsByBrandResponse(GetCarModelsByBrandResponse value) {
        return new JAXBElement<GetCarModelsByBrandResponse>(_GetCarModelsByBrandResponse_QNAME, GetCarModelsByBrandResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CarModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "carModel")
    public JAXBElement<CarModel> createCarModel(CarModel value) {
        return new JAXBElement<CarModel>(_CarModel_QNAME, CarModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarModelsByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "getCarModelsByTypeResponse")
    public JAXBElement<GetCarModelsByTypeResponse> createGetCarModelsByTypeResponse(GetCarModelsByTypeResponse value) {
        return new JAXBElement<GetCarModelsByTypeResponse>(_GetCarModelsByTypeResponse_QNAME, GetCarModelsByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarModelsByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "getCarModelsByType")
    public JAXBElement<GetCarModelsByType> createGetCarModelsByType(GetCarModelsByType value) {
        return new JAXBElement<GetCarModelsByType>(_GetCarModelsByType_QNAME, GetCarModelsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarModelsByBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://carmodel.domain.realdolmen.com/", name = "getCarModelsByBrand")
    public JAXBElement<GetCarModelsByBrand> createGetCarModelsByBrand(GetCarModelsByBrand value) {
        return new JAXBElement<GetCarModelsByBrand>(_GetCarModelsByBrand_QNAME, GetCarModelsByBrand.class, null, value);
    }

}
