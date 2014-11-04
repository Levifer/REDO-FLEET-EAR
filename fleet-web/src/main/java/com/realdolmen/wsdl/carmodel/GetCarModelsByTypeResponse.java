
package com.realdolmen.wsdl.carmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCarModelsByTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCarModelsByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carModels" type="{http://carmodel.domain.realdolmen.com/}carModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCarModelsByTypeResponse", propOrder = {
    "carModels"
})
public class GetCarModelsByTypeResponse {

    protected List<CarModel> carModels;

    /**
     * Gets the value of the carModels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carModels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarModels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarModel }
     * 
     * 
     */
    public List<CarModel> getCarModels() {
        if (carModels == null) {
            carModels = new ArrayList<CarModel>();
        }
        return this.carModels;
    }

}
