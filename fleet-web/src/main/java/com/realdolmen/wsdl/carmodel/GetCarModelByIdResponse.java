
package com.realdolmen.wsdl.carmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCarModelByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCarModelByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carModels" type="{http://carmodel.domain.realdolmen.com/}carModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCarModelByIdResponse", propOrder = {
    "carModels"
})
public class GetCarModelByIdResponse {

    protected CarModel carModels;

    /**
     * Gets the value of the carModels property.
     * 
     * @return
     *     possible object is
     *     {@link CarModel }
     *     
     */
    public CarModel getCarModels() {
        return carModels;
    }

    /**
     * Sets the value of the carModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarModel }
     *     
     */
    public void setCarModels(CarModel value) {
        this.carModels = value;
    }

}
