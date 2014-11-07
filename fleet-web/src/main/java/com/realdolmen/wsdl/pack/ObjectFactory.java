
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

    private final static QName _FindAllPacksResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "findAllPacksResponse");
    private final static QName _CreatePackResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "createPackResponse");
    private final static QName _UpdatePack_QNAME = new QName("http://pack.domain.realdolmen.com/", "updatePack");
    private final static QName _FindPackById_QNAME = new QName("http://pack.domain.realdolmen.com/", "findPackById");
    private final static QName _UpdatePackResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "updatePackResponse");
    private final static QName _FindAllPacks_QNAME = new QName("http://pack.domain.realdolmen.com/", "findAllPacks");
    private final static QName _FindPackByIdResponse_QNAME = new QName("http://pack.domain.realdolmen.com/", "findPackByIdResponse");
    private final static QName _CreatePack_QNAME = new QName("http://pack.domain.realdolmen.com/", "createPack");
    private final static QName _Option_QNAME = new QName("http://pack.domain.realdolmen.com/", "option");
    private final static QName _Pack_QNAME = new QName("http://pack.domain.realdolmen.com/", "pack");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.realdolmen.wsdl.pack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllPacks }
     * 
     */
    public FindAllPacks createFindAllPacks() {
        return new FindAllPacks();
    }

    /**
     * Create an instance of {@link Pack }
     * 
     */
    public Pack createPack() {
        return new Pack();
    }

    /**
     * Create an instance of {@link UpdatePackResponse }
     * 
     */
    public UpdatePackResponse createUpdatePackResponse() {
        return new UpdatePackResponse();
    }

    /**
     * Create an instance of {@link FindPackById }
     * 
     */
    public FindPackById createFindPackById() {
        return new FindPackById();
    }

    /**
     * Create an instance of {@link CreatePack }
     * 
     */
    public CreatePack createCreatePack() {
        return new CreatePack();
    }

    /**
     * Create an instance of {@link CreatePackResponse }
     * 
     */
    public CreatePackResponse createCreatePackResponse() {
        return new CreatePackResponse();
    }

    /**
     * Create an instance of {@link UpdatePack }
     * 
     */
    public UpdatePack createUpdatePack() {
        return new UpdatePack();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link FindAllPacksResponse }
     * 
     */
    public FindAllPacksResponse createFindAllPacksResponse() {
        return new FindAllPacksResponse();
    }

    /**
     * Create an instance of {@link FindPackByIdResponse }
     * 
     */
    public FindPackByIdResponse createFindPackByIdResponse() {
        return new FindPackByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPacksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findAllPacksResponse")
    public JAXBElement<FindAllPacksResponse> createFindAllPacksResponse(FindAllPacksResponse value) {
        return new JAXBElement<FindAllPacksResponse>(_FindAllPacksResponse_QNAME, FindAllPacksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "createPackResponse")
    public JAXBElement<CreatePackResponse> createCreatePackResponse(CreatePackResponse value) {
        return new JAXBElement<CreatePackResponse>(_CreatePackResponse_QNAME, CreatePackResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPackById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findPackById")
    public JAXBElement<FindPackById> createFindPackById(FindPackById value) {
        return new JAXBElement<FindPackById>(_FindPackById_QNAME, FindPackById.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPacks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findAllPacks")
    public JAXBElement<FindAllPacks> createFindAllPacks(FindAllPacks value) {
        return new JAXBElement<FindAllPacks>(_FindAllPacks_QNAME, FindAllPacks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPackByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "findPackByIdResponse")
    public JAXBElement<FindPackByIdResponse> createFindPackByIdResponse(FindPackByIdResponse value) {
        return new JAXBElement<FindPackByIdResponse>(_FindPackByIdResponse_QNAME, FindPackByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "createPack")
    public JAXBElement<CreatePack> createCreatePack(CreatePack value) {
        return new JAXBElement<CreatePack>(_CreatePack_QNAME, CreatePack.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Pack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack.domain.realdolmen.com/", name = "pack")
    public JAXBElement<Pack> createPack(Pack value) {
        return new JAXBElement<Pack>(_Pack_QNAME, Pack.class, null, value);
    }

}
