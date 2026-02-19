
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Types of connection indicator : 
 *                      AvailabilityAndPricing : Specified availability and pricing connection;
 *                      TurnAround : Specified turn around;
 *                      Stopover : Specified stopover;
 * 
 * <p>Java class for typeConnectionIndicator</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeConnectionIndicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AvailabilityAndPricing"/>
 *     <enumeration value="TurnAround"/>
 *     <enumeration value="Stopover"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeConnectionIndicator")
@XmlEnum
public enum TypeConnectionIndicator {

    @XmlEnumValue("AvailabilityAndPricing")
    AVAILABILITY_AND_PRICING("AvailabilityAndPricing"),
    @XmlEnumValue("TurnAround")
    TURN_AROUND("TurnAround"),
    @XmlEnumValue("Stopover")
    STOPOVER("Stopover");
    private final String value;

    TypeConnectionIndicator(String v) {
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
    public static TypeConnectionIndicator fromValue(String v) {
        for (TypeConnectionIndicator c: TypeConnectionIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
