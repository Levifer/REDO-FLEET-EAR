
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

    private final static QName _FindAllOptionResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findAllOptionResponse");
    private final static QName _FindOptionByName_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionByName");
    private final static QName _Option_QNAME = new QName("http://option.domain.realdolmen.com/", "option");
    private final static QName _CreateOptionResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "createOptionResponse");
    private final static QName _FindOptionByIdResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionByIdResponse");
    private final static QName _FindOptionByTypeResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionByTypeResponse");
    private final static QName _FindOptionByNameResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionByNameResponse");
    private final static QName _FindOptionLowerThandPrice_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionLowerThandPrice");
    private final static QName _FindOptionLowerThandPriceResponse_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionLowerThandPriceResponse");
    private final static QName _FindOptionByType_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionByType");
    private final static QName _CreateOption_QNAME = new QName("http://option.domain.realdolmen.com/", "createOption");
    private final static QName _FindOptionById_QNAME = new QName("http://option.domain.realdolmen.com/", "findOptionById");
    private final static QName _FindAllOption_QNAME = new QName("http://option.domain.realdolmen.com/", "findAllOption");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.realdolmen.wsdl.option
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOptionLowerThandPrice }
     * 
     */
    public FindOptionLowerThandPrice createFindOptionLowerThandPrice() {
        return new FindOptionLowerThandPrice();
    }

    /**
     * Create an instance of {@link FindOptionByIdResponse }
     * 
     */
    public FindOptionByIdResponse createFindOptionByIdResponse() {
        return new FindOptionByIdResponse();
    }

    /**
     * Create an instance of {@link FindOptionByNameResponse }
     * 
     */
    public FindOptionByNameResponse createFindOptionByNameResponse() {
        return new FindOptionByNameResponse();
    }

    /**
     * Create an instance of {@link FindOptionByName }
     * 
     */
    public FindOptionByName createFindOptionByName() {
        return new FindOptionByName();
    }

    /**
     * Create an instance of {@link FindOptionById }
     * 
     */
    public FindOptionById createFindOptionById() {
        return new FindOptionById();
    }

    /**
     * Create an instance of {@link FindOptionLowerThandPriceResponse }
     * 
     */
    public FindOptionLowerThandPriceResponse createFindOptionLowerThandPriceResponse() {
        return new FindOptionLowerThandPriceResponse();
    }

    /**
     * Create an instance of {@link FindAllOption }
     * 
     */
    public FindAllOption createFindAllOption() {
        return new FindAllOption();
    }

    /**
     * Create an instance of {@link CreateOption }
     * 
     */
    public CreateOption createCreateOption() {
        return new CreateOption();
    }

    /**
     * Create an instance of {@link FindOptionByType }
     * 
     */
    public FindOptionByType createFindOptionByType() {
        return new FindOptionByType();
    }

    /**
     * Create an instance of {@link FindAllOptionResponse }
     * 
     */
    public FindAllOptionResponse createFindAllOptionResponse() {
        return new FindAllOptionResponse();
    }

    /**
     * Create an instance of {@link FindOptionByTypeResponse }
     * 
     */
    public FindOptionByTypeResponse createFindOptionByTypeResponse() {
        return new FindOptionByTypeResponse();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link CreateOptionResponse }
     * 
     */
    public CreateOptionResponse createCreateOptionResponse() {
        return new CreateOptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findAllOptionResponse")
    public JAXBElement<FindAllOptionResponse> createFindAllOptionResponse(FindAllOptionResponse value) {
        return new JAXBElement<FindAllOptionResponse>(_FindAllOptionResponse_QNAME, FindAllOptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionByName")
    public JAXBElement<FindOptionByName> createFindOptionByName(FindOptionByName value) {
        return new JAXBElement<FindOptionByName>(_FindOptionByName_QNAME, FindOptionByName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "createOptionResponse")
    public JAXBElement<CreateOptionResponse> createCreateOptionResponse(CreateOptionResponse value) {
        return new JAXBElement<CreateOptionResponse>(_CreateOptionResponse_QNAME, CreateOptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionByIdResponse")
    public JAXBElement<FindOptionByIdResponse> createFindOptionByIdResponse(FindOptionByIdResponse value) {
        return new JAXBElement<FindOptionByIdResponse>(_FindOptionByIdResponse_QNAME, FindOptionByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionByTypeResponse")
    public JAXBElement<FindOptionByTypeResponse> createFindOptionByTypeResponse(FindOptionByTypeResponse value) {
        return new JAXBElement<FindOptionByTypeResponse>(_FindOptionByTypeResponse_QNAME, FindOptionByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionByNameResponse")
    public JAXBElement<FindOptionByNameResponse> createFindOptionByNameResponse(FindOptionByNameResponse value) {
        return new JAXBElement<FindOptionByNameResponse>(_FindOptionByNameResponse_QNAME, FindOptionByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionLowerThandPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionLowerThandPrice")
    public JAXBElement<FindOptionLowerThandPrice> createFindOptionLowerThandPrice(FindOptionLowerThandPrice value) {
        return new JAXBElement<FindOptionLowerThandPrice>(_FindOptionLowerThandPrice_QNAME, FindOptionLowerThandPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionLowerThandPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionLowerThandPriceResponse")
    public JAXBElement<FindOptionLowerThandPriceResponse> createFindOptionLowerThandPriceResponse(FindOptionLowerThandPriceResponse value) {
        return new JAXBElement<FindOptionLowerThandPriceResponse>(_FindOptionLowerThandPriceResponse_QNAME, FindOptionLowerThandPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionByType")
    public JAXBElement<FindOptionByType> createFindOptionByType(FindOptionByType value) {
        return new JAXBElement<FindOptionByType>(_FindOptionByType_QNAME, FindOptionByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "createOption")
    public JAXBElement<CreateOption> createCreateOption(CreateOption value) {
        return new JAXBElement<CreateOption>(_CreateOption_QNAME, CreateOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOptionById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findOptionById")
    public JAXBElement<FindOptionById> createFindOptionById(FindOptionById value) {
        return new JAXBElement<FindOptionById>(_FindOptionById_QNAME, FindOptionById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://option.domain.realdolmen.com/", name = "findAllOption")
    public JAXBElement<FindAllOption> createFindAllOption(FindAllOption value) {
        return new JAXBElement<FindAllOption>(_FindAllOption_QNAME, FindAllOption.class, null, value);
    }

}
