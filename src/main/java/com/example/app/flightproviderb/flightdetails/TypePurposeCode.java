
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of valid Purpose Codes.
 * 
 * <p>Java class for typePurposeCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePurposeCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Business"/>
 *     <enumeration value="Pleasure"/>
 *     <enumeration value="CharterService"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePurposeCode")
@XmlEnum
public enum TypePurposeCode {


    /**
     * Business
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * Pleasure
     * 
     */
    @XmlEnumValue("Pleasure")
    PLEASURE("Pleasure"),

    /**
     * Charter Service
     * 
     */
    @XmlEnumValue("CharterService")
    CHARTER_SERVICE("CharterService");
    private final String value;

    TypePurposeCode(String v) {
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
    public static TypePurposeCode fromValue(String v) {
        for (TypePurposeCode c: TypePurposeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
