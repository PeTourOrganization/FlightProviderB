
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Seat availability info of a seat map
 * 
 * <p>Java class for typeSeatAvailability</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeSeatAvailability">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Available"/>
 *     <enumeration value="Occupied"/>
 *     <enumeration value="Reserved"/>
 *     <enumeration value="AdvancedBoardingPass"/>
 *     <enumeration value="InterlineCheckin"/>
 *     <enumeration value="Codeshare"/>
 *     <enumeration value="Protected"/>
 *     <enumeration value="PartnerAirline"/>
 *     <enumeration value="AdvSeatSelection"/>
 *     <enumeration value="Blocked"/>
 *     <enumeration value="Extra"/>
 *     <enumeration value="RBDRestriction"/>
 *     <enumeration value="Group"/>
 *     <enumeration value="NoSeat"/>
 *     <enumeration value="UnoccupiedButNotEligible"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeSeatAvailability")
@XmlEnum
public enum TypeSeatAvailability {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Occupied")
    OCCUPIED("Occupied"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("AdvancedBoardingPass")
    ADVANCED_BOARDING_PASS("AdvancedBoardingPass"),
    @XmlEnumValue("InterlineCheckin")
    INTERLINE_CHECKIN("InterlineCheckin"),
    @XmlEnumValue("Codeshare")
    CODESHARE("Codeshare"),
    @XmlEnumValue("Protected")
    PROTECTED("Protected"),
    @XmlEnumValue("PartnerAirline")
    PARTNER_AIRLINE("PartnerAirline"),
    @XmlEnumValue("AdvSeatSelection")
    ADV_SEAT_SELECTION("AdvSeatSelection"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Extra")
    EXTRA("Extra"),
    @XmlEnumValue("RBDRestriction")
    RBD_RESTRICTION("RBDRestriction"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("NoSeat")
    NO_SEAT("NoSeat"),
    @XmlEnumValue("UnoccupiedButNotEligible")
    UNOCCUPIED_BUT_NOT_ELIGIBLE("UnoccupiedButNotEligible");
    private final String value;

    TypeSeatAvailability(String v) {
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
    public static TypeSeatAvailability fromValue(String v) {
        for (TypeSeatAvailability c: TypeSeatAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
