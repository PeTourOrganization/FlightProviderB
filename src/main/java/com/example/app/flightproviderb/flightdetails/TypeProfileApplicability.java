
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The applicability of the profile or profile template value.
 * 
 * <p>Java class for typeProfileApplicability</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeProfileApplicability">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Always"/>
 *     <enumeration value="Optional"/>
 *     <enumeration value="Never"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeProfileApplicability", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeProfileApplicability {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Never")
    NEVER("Never");
    private final String value;

    TypeProfileApplicability(String v) {
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
    public static TypeProfileApplicability fromValue(String v) {
        for (TypeProfileApplicability c: TypeProfileApplicability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
