
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The available status codes for an MCO
 * 
 * <p>Java class for typeMCOStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeMCOStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Open"/>
 *     <enumeration value="Used"/>
 *     <enumeration value="Refunded"/>
 *     <enumeration value="Voided"/>
 *     <enumeration value="Expired"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeMCOStatus", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeMCOStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Used")
    USED("Used"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    TypeMCOStatus(String v) {
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
    public static TypeMCOStatus fromValue(String v) {
        for (TypeMCOStatus c: TypeMCOStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
