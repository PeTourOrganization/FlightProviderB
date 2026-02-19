
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The valid inventory types are Seamless - A, DirectAccess - B, Basic - C
 * 
 * <p>Java class for typeInventoryRequest</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeInventoryRequest">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Seamless"/>
 *     <enumeration value="DirectAccess"/>
 *     <enumeration value="Basic"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeInventoryRequest")
@XmlEnum
public enum TypeInventoryRequest {

    @XmlEnumValue("Seamless")
    SEAMLESS("Seamless"),
    @XmlEnumValue("DirectAccess")
    DIRECT_ACCESS("DirectAccess"),
    @XmlEnumValue("Basic")
    BASIC("Basic");
    private final String value;

    TypeInventoryRequest(String v) {
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
    public static TypeInventoryRequest fromValue(String v) {
        for (TypeInventoryRequest c: TypeInventoryRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
