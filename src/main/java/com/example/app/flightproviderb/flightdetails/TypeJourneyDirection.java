
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Outbound and Return directions.
 * 
 * <p>Java class for typeJourneyDirection</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeJourneyDirection">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Outward"/>
 *     <enumeration value="Return"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeJourneyDirection", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeJourneyDirection {

    @XmlEnumValue("Outward")
    OUTWARD("Outward"),
    @XmlEnumValue("Return")
    RETURN("Return");
    private final String value;

    TypeJourneyDirection(String v) {
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
    public static TypeJourneyDirection fromValue(String v) {
        for (TypeJourneyDirection c: TypeJourneyDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
