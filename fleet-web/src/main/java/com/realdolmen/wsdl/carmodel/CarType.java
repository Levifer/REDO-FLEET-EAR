
package com.realdolmen.wsdl.carmodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="carType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HATCHBACK"/>
 *     &lt;enumeration value="BERLINE"/>
 *     &lt;enumeration value="BREAK"/>
 *     &lt;enumeration value="COUPE"/>
 *     &lt;enumeration value="JEEP"/>
 *     &lt;enumeration value="MONOVOLUME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "carType")
@XmlEnum
public enum CarType {

    HATCHBACK,
    BERLINE,
    BREAK,
    COUPE,
    JEEP,
    MONOVOLUME;

    public String value() {
        return name();
    }

    public static CarType fromValue(String v) {
        return valueOf(v);
    }

}
