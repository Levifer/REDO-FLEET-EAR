
package com.realdolmen.wsdl.pack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.realdolmen.wsdl.pack package. 
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

    private final static QName _FindById_QNAME = new QName("http://pack.domain.realdolmen.com/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "findByIdResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "findAllResponse");
    private final static QName _UpdatePack_QNAME = new QName("http://pack.domain.realdolmen.com/", "updatePack");
    private final static QName _UpdatePackResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "updatePackResponse");
    private final static QName _Option_QNAME = new QName("http://pack.domain.realdolmen.com/", "option");
    private final static QName _FindAll_QNAME = new QName("http://pack.domain.realdolmen.com/", "findAll");
    private final static QName _Pack_QNAME = new QName("http://pack.domain.realdolmen.com/", "pack");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.realdolmen.wsdl.pack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pack }
     * 
     */
    public Pack createPack() {
        return new Pack();
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
     * Create an instance of {@link UpdatePack }
     * 
     */
    public UpdatePack createUpdatePack() {
        return new UpdatePack();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link UpdatePackResponse }
     * 
     */
    public UpdatePackResponse createUpdatePackResponse() {
        return new UpdatePackResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "updatePack")
    public JAXBElement<UpdatePack> createUpdatePack(UpdatePack value) {
        return new JAXBElement<UpdatePack>(_UpdatePack_QNAME, UpdatePack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "updatePackResponse")
    public JAXBElement<UpdatePackResponse> createUpdatePackResponse(UpdatePackResponse value) {
        return new JAXBElement<UpdatePackResponse>(_UpdatePackResponse_QNAME, UpdatePackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Option }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "option")
    public JAXBElement<Option> createOption(Option value) {
        return new JAXBElement<Option>(_Option_QNAME, Option.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "pack")
    public JAXBElement<Pack> createPack(Pack value) {
        return new JAXBElement<Pack>(_Pack_QNAME, Pack.class, null, value);
    }

}
