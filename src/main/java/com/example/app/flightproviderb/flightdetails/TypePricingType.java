
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typePricingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePricingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ClassBooked"/>
 *     <enumeration value="LowestClass"/>
 *     <enumeration value="LowestQuote"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePricingType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypePricingType {

    @XmlEnumValue("ClassBooked")
    CLASS_BOOKED("ClassBooked"),
    @XmlEnumValue("LowestClass")
    LOWEST_CLASS("LowestClass"),
    @XmlEnumValue("LowestQuote")
    LOWEST_QUOTE("LowestQuote");
    private final String value;

    TypePricingType(String v) {
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
    public static TypePricingType fromValue(String v) {
        for (TypePricingType c: TypePricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
