
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The different levels at which an optional service may be applied
 * 
 * <p>Java class for OptionalServiceApplicabilityType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OptionalServiceApplicabilityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Itinerary"/>
 *     <enumeration value="Passenger"/>
 *     <enumeration value="Segment"/>
 *     <enumeration value="PassengerSegment"/>
 *     <enumeration value="PassengerOD"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OptionalServiceApplicabilityType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum OptionalServiceApplicabilityType {

    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),
    @XmlEnumValue("Passenger")
    PASSENGER("Passenger"),
    @XmlEnumValue("Segment")
    SEGMENT("Segment"),
    @XmlEnumValue("PassengerSegment")
    PASSENGER_SEGMENT("PassengerSegment"),

    /**
     * PassengerOD stands for passenger origin destination.
     * 
     */
    @XmlEnumValue("PassengerOD")
    PASSENGER_OD("PassengerOD"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OptionalServiceApplicabilityType(String v) {
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
    public static OptionalServiceApplicabilityType fromValue(String v) {
        for (OptionalServiceApplicabilityType c: OptionalServiceApplicabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
