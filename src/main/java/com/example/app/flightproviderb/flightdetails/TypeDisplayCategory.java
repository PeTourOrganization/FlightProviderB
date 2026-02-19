
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type of booking
 * 
 * <p>Java class for typeDisplayCategory</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeDisplayCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="With Itinerary Pricing"/>
 *     <enumeration value="Store"/>
 *     <enumeration value="SpecialService"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeDisplayCategory")
@XmlEnum
public enum TypeDisplayCategory {

    @XmlEnumValue("With Itinerary Pricing")
    WITH_ITINERARY_PRICING("With Itinerary Pricing"),
    @XmlEnumValue("Store")
    STORE("Store"),
    @XmlEnumValue("SpecialService")
    SPECIAL_SERVICE("SpecialService");
    private final String value;

    TypeDisplayCategory(String v) {
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
    public static TypeDisplayCategory fromValue(String v) {
        for (TypeDisplayCategory c: TypeDisplayCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
