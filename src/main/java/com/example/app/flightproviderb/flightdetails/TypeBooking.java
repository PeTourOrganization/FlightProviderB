
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type of booking
 * 
 * <p>Java class for typeBooking</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeBooking">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SSR"/>
 *     <enumeration value="Auxillary Segment"/>
 *     <enumeration value="Available for Display/Pricing"/>
 *     <enumeration value="Contact Carrier for Booking"/>
 *     <enumeration value="No Booking Required"/>
 *     <enumeration value="Apply booking per service"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeBooking")
@XmlEnum
public enum TypeBooking {

    SSR("SSR"),
    @XmlEnumValue("Auxillary Segment")
    AUXILLARY_SEGMENT("Auxillary Segment"),
    @XmlEnumValue("Available for Display/Pricing")
    AVAILABLE_FOR_DISPLAY_PRICING("Available for Display/Pricing"),
    @XmlEnumValue("Contact Carrier for Booking")
    CONTACT_CARRIER_FOR_BOOKING("Contact Carrier for Booking"),
    @XmlEnumValue("No Booking Required")
    NO_BOOKING_REQUIRED("No Booking Required"),
    @XmlEnumValue("Apply booking per service")
    APPLY_BOOKING_PER_SERVICE("Apply booking per service");
    private final String value;

    TypeBooking(String v) {
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
    public static TypeBooking fromValue(String v) {
        for (TypeBooking c: TypeBooking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
