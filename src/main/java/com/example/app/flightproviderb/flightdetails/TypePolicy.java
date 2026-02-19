
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Available product types
 * 
 * <p>Java class for typePolicy</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePolicy">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Air"/>
 *     <enumeration value="Vehicle"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="Rail"/>
 *     <enumeration value="Ticketing"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePolicy", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypePolicy {

    @XmlEnumValue("Air")
    AIR("Air"),
    @XmlEnumValue("Vehicle")
    VEHICLE("Vehicle"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Rail")
    RAIL("Rail"),
    @XmlEnumValue("Ticketing")
    TICKETING("Ticketing");
    private final String value;

    TypePolicy(String v) {
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
    public static TypePolicy fromValue(String v) {
        for (TypePolicy c: TypePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
