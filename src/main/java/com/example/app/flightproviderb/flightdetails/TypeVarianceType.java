
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type code for Variance.
 * 
 * <p>Java class for typeVarianceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeVarianceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Actual"/>
 *     <enumeration value="Estimated"/>
 *     <enumeration value="Canceled"/>
 *     <enumeration value="Diversion"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeVarianceType")
@XmlEnum
public enum TypeVarianceType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Diversion")
    DIVERSION("Diversion");
    private final String value;

    TypeVarianceType(String v) {
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
    public static TypeVarianceType fromValue(String v) {
        for (TypeVarianceType c: TypeVarianceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
