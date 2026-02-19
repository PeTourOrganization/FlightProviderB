
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used in Low Fare Search to better target the
 *                 results
 * 
 * <p>Java class for typeTripType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeTripType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Cheapest"/>
 *     <enumeration value="Quickest"/>
 *     <enumeration value="MostConvenient"/>
 *     <enumeration value="Leisure"/>
 *     <enumeration value="Business"/>
 *     <enumeration value="Luxury"/>
 *     <enumeration value="PreferFirst"/>
 *     <enumeration value="BusinessOrFirst"/>
 *     <enumeration value="NoPenalty"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeTripType")
@XmlEnum
public enum TypeTripType {

    @XmlEnumValue("Cheapest")
    CHEAPEST("Cheapest"),
    @XmlEnumValue("Quickest")
    QUICKEST("Quickest"),
    @XmlEnumValue("MostConvenient")
    MOST_CONVENIENT("MostConvenient"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Luxury")
    LUXURY("Luxury"),
    @XmlEnumValue("PreferFirst")
    PREFER_FIRST("PreferFirst"),
    @XmlEnumValue("BusinessOrFirst")
    BUSINESS_OR_FIRST("BusinessOrFirst"),
    @XmlEnumValue("NoPenalty")
    NO_PENALTY("NoPenalty");
    private final String value;

    TypeTripType(String v) {
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
    public static TypeTripType fromValue(String v) {
        for (TypeTripType c: TypeTripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
