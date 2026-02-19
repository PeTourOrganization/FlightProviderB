
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeItineraryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeItineraryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="New"/>
 *     <enumeration value="Original"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeItineraryType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeItineraryType {


    /**
     * Indicates the itinerary is New
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * Indicates the itinerary is Original
     * 
     */
    @XmlEnumValue("Original")
    ORIGINAL("Original");
    private final String value;

    TypeItineraryType(String v) {
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
    public static TypeItineraryType fromValue(String v) {
        for (TypeItineraryType c: TypeItineraryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
