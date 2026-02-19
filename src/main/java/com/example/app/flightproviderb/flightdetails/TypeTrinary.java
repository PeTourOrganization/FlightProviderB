
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Extension of boolean, that allows for unknown values.
 * 
 * <p>Java class for typeTrinary</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeTrinary">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="true"/>
 *     <enumeration value="false"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeTrinary", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeTrinary {

    @XmlEnumValue("true")
    TRUE("true"),
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TypeTrinary(String v) {
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
    public static TypeTrinary fromValue(String v) {
        for (TypeTrinary c: TypeTrinary.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
