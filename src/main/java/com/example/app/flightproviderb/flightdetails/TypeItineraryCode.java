
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeItineraryCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeItineraryCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="International"/>
 *     <enumeration value="Domestic"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeItineraryCode", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeItineraryCode {


    /**
     * Indicates the itinerary is International
     * 
     */
    @XmlEnumValue("International")
    INTERNATIONAL("International"),

    /**
     * Indicates the itinerary is domestic
     * 
     */
    @XmlEnumValue("Domestic")
    DOMESTIC("Domestic");
    private final String value;

    TypeItineraryCode(String v) {
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
    public static TypeItineraryCode fromValue(String v) {
        for (TypeItineraryCode c: TypeItineraryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
