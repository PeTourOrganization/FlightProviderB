
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of fare restriction
 * 
 * <p>Java class for typeFareRestrictionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareRestrictionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DayOfWeek"/>
 *     <enumeration value="FlightTimeOfDay"/>
 *     <enumeration value="Both"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareRestrictionType")
@XmlEnum
public enum TypeFareRestrictionType {

    @XmlEnumValue("DayOfWeek")
    DAY_OF_WEEK("DayOfWeek"),
    @XmlEnumValue("FlightTimeOfDay")
    FLIGHT_TIME_OF_DAY("FlightTimeOfDay"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeFareRestrictionType(String v) {
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
    public static TypeFareRestrictionType fromValue(String v) {
        for (TypeFareRestrictionType c: TypeFareRestrictionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
