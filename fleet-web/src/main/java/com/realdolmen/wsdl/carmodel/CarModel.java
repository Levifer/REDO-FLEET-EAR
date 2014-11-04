
package com.realdolmen.wsdl.carmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for carModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuelType" type="{http://carmodel.domain.realdolmen.com/}fuel" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minKm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxKm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deliveryTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fiscalHp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="co2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://carmodel.domain.realdolmen.com/}pack" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carModel", propOrder = {
    "id",
    "brand",
    "name",
    "type",
    "fuelType",
    "year",
    "quarter",
    "minKm",
    "maxKm",
    "deliveryTime",
    "fiscalHp",
    "co2",
    "category",
    "imageUrl",
    "pack"
})
public class CarModel {

    protected Integer id;
    protected String brand;
    protected String name;
    protected String type;
    protected Fuel fuelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar year;
    protected int quarter;
    protected int minKm;
    protected int maxKm;
    protected int deliveryTime;
    protected int fiscalHp;
    protected int co2;
    protected int category;
    protected String imageUrl;
    @XmlElement(namespace = "http://carmodel.domain.realdolmen.com/")
    protected Pack pack;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link Fuel }
     *     
     */
    public Fuel getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fuel }
     *     
     */
    public void setFuelType(Fuel value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    /**
     * Gets the value of the quarter property.
     * 
     */
    public int getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     */
    public void setQuarter(int value) {
        this.quarter = value;
    }

    /**
     * Gets the value of the minKm property.
     * 
     */
    public int getMinKm() {
        return minKm;
    }

    /**
     * Sets the value of the minKm property.
     * 
     */
    public void setMinKm(int value) {
        this.minKm = value;
    }

    /**
     * Gets the value of the maxKm property.
     * 
     */
    public int getMaxKm() {
        return maxKm;
    }

    /**
     * Sets the value of the maxKm property.
     * 
     */
    public void setMaxKm(int value) {
        this.maxKm = value;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     */
    public int getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     */
    public void setDeliveryTime(int value) {
        this.deliveryTime = value;
    }

    /**
     * Gets the value of the fiscalHp property.
     * 
     */
    public int getFiscalHp() {
        return fiscalHp;
    }

    /**
     * Sets the value of the fiscalHp property.
     * 
     */
    public void setFiscalHp(int value) {
        this.fiscalHp = value;
    }

    /**
     * Gets the value of the co2 property.
     * 
     */
    public int getCo2() {
        return co2;
    }

    /**
     * Sets the value of the co2 property.
     * 
     */
    public void setCo2(int value) {
        this.co2 = value;
    }

    /**
     * Gets the value of the category property.
     * 
     */
    public int getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(int value) {
        this.category = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the pack property.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Sets the value of the pack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
    }

}
