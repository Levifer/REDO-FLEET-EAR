
package com.realdolmen.wsdl.option;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.realdolmen.wsdl.option package. 
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

    private final static QName _FindByNameResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findByNameResponse");
    private final static QName _FindLowerThandPrice_QNAME = new QName("http://option.domain.realdolmen.com/", "findLowerThandPrice");
    private final static QName _FindById_QNAME = new QName("http://option.domain.realdolmen.com/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findByIdResponse");
    private final static QName _FindLowerThandPriceResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findLowerThandPriceResponse");
    private final static QName _FindAll_QNAME = new QName("http://option.domain.realdolmen.com/", "findAll");
    private final static QName _FindByType_QNAME = new QName("http://option.domain.realdolmen.com/", "findByType");
    private final static QName _Option_QNAME = new QName("http://option.domain.realdolmen.com/", "option");
    private final static QName _FindByName_QNAME = new QName("http://option.domain.realdolmen.com/", "findByName");
    private final static QName _FindAllResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findAllResponse");
    private final static QName _FindByTypeResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findByTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.realdolmen.wsdl.option
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindByTypeResponse }
     * 
     */
    public FindByTypeResponse createFindByTypeResponse() {
        return new FindByTypeResponse();
    }

    /**
     * Create an instance of {@link FindLowerThandPriceResponse }
     * 
     */
    public FindLowerThandPriceResponse createFindLowerThandPriceResponse() {
        return new FindLowerThandPriceResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindByNameResponse }
     * 
     */
    public FindByNameResponse createFindByNameResponse() {
        return new FindByNameResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindLowerThandPrice }
     * 
     */
    public FindLowerThandPrice createFindLowerThandPrice() {
        return new FindLowerThandPrice();
    }

    /**
     * Create an instance of {@link FindByType }
     * 
     */
    public FindByType createFindByType() {
        return new FindByType();
    }

    /**
     * Create an instance of {@link FindByName }
     * 
     */
    public FindByName createFindByName() {
        return new FindByName();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findByNameResponse")
    public JAXBElement<FindByNameResponse> createFindByNameResponse(FindByNameResponse value) {
        return new JAXBElement<FindByNameResponse>(_FindByNameResponse_QNAME, FindByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLowerThandPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findLowerThandPrice")
    public JAXBElement<FindLowerThandPrice> createFindLowerThandPrice(FindLowerThandPrice value) {
        return new JAXBElement<FindLowerThandPrice>(_FindLowerThandPrice_QNAME, FindLowerThandPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLowerThandPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findLowerThandPriceResponse")
    public JAXBElement<FindLowerThandPriceResponse> createFindLowerThandPriceResponse(FindLowerThandPriceResponse value) {
        return new JAXBElement<FindLowerThandPriceResponse>(_FindLowerThandPriceResponse_QNAME, FindLowerThandPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findByType")
    public JAXBElement<FindByType> createFindByType(FindByType value) {
        return new JAXBElement<FindByType>(_FindByType_QNAME, FindByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Option }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "option")
    public JAXBElement<Option> createOption(Option value) {
        return new JAXBElement<Option>(_Option_QNAME, Option.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findByName")
    public JAXBElement<FindByName> createFindByName(FindByName value) {
        return new JAXBElement<FindByName>(_FindByName_QNAME, FindByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findByTypeResponse")
    public JAXBElement<FindByTypeResponse> createFindByTypeResponse(FindByTypeResponse value) {
        return new JAXBElement<FindByTypeResponse>(_FindByTypeResponse_QNAME, FindByTypeResponse.class, null, value);
    }

}
