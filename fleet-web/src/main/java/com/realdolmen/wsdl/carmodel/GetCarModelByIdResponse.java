
package com.realdolmen.wsdl.carmodel;

import com.realdolmen.domain.carmodel.CarModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://carmodel.domain.realdolmen.com/}carModel" minOccurs="0"/>
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
    "carModel"
})
public class GetCarModelByIdResponse {

    @XmlElement(namespace = "http://carmodel.domain.realdolmen.com/")
    protected CarModel carModel;

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link CarModel }
     *     
     */
    public CarModel getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarModel }
     *     
     */
    public void setCarModel(CarModel value) {
        this.carModel = value;
    }

}
