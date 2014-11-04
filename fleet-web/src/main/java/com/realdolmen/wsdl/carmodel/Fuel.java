
package com.realdolmen.wsdl.carmodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fuel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fuel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIESEL"/>
 *     &lt;enumeration value="BENZINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fuel")
@XmlEnum
public enum Fuel {

    DIESEL,
    BENZINE;

    public String value() {
        return name();
    }

    public static Fuel fromValue(String v) {
        return valueOf(v);
    }

}
