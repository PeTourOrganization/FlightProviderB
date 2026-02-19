
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Available product types
 * 
 * <p>Java class for typeProduct</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeProduct">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Air"/>
 *     <enumeration value="Vehicle"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="Rail"/>
 *     <enumeration value="Cruise"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeProduct", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeProduct {

    @XmlEnumValue("Air")
    AIR("Air"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Rail")
    RAIL("Rail"),
    @XmlEnumValue("Cruise")
    CRUISE("Cruise"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeProduct(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TypeProduct fromValue(String v) {
        for (TypeProduct c: TypeProduct.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
