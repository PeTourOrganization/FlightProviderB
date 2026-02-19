
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The status of a fare
 * 
 * <p>Java class for typeFareGuarantee</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareGuarantee">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Auto"/>
 *     <enumeration value="Manual"/>
 *     <enumeration value="ManualFare"/>
 *     <enumeration value="Guaranteed"/>
 *     <enumeration value="Invalid"/>
 *     <enumeration value="Restored"/>
 *     <enumeration value="Ticketed"/>
 *     <enumeration value="Unticketable"/>
 *     <enumeration value="Reprice"/>
 *     <enumeration value="Expired"/>
 *     <enumeration value="AutoUsingPrivateFare"/>
 *     <enumeration value="GuaranteedUsingAirlinePrivateFare"/>
 *     <enumeration value="Airline"/>
 *     <enumeration value="GuaranteeExpired"/>
 *     <enumeration value="AgencyPrivateFareNoOverride"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareGuarantee")
@XmlEnum
public enum TypeFareGuarantee {


    /**
     * Automatically generated
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * Agent has overridden default(s)
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * Fare has been constructed by agent
     * 
     */
    @XmlEnumValue("ManualFare")
    MANUAL_FARE("ManualFare"),

    /**
     * Fare is guaranteed
     * 
     */
    @XmlEnumValue("Guaranteed")
    GUARANTEED("Guaranteed"),

    /**
     * Invalid fare, e.g. due to name or
     *                   itinerary change
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * Ticketed stored fare has been restored
     * 
     */
    @XmlEnumValue("Restored")
    RESTORED("Restored"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),

    /**
     * Unable to ticket
     * 
     */
    @XmlEnumValue("Unticketable")
    UNTICKETABLE("Unticketable"),

    /**
     * Need requote to ticket
     * 
     */
    @XmlEnumValue("Reprice")
    REPRICE("Reprice"),

    /**
     * Expired fare due to older fare guarantee date typically older than 7 days
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Agency private fares that are not guaranteed
     * 
     */
    @XmlEnumValue("AutoUsingPrivateFare")
    AUTO_USING_PRIVATE_FARE("AutoUsingPrivateFare"),

    /**
     * Guaranteed fare using Airline private fare that was filed with a fare distributor.
     * 
     */
    @XmlEnumValue("GuaranteedUsingAirlinePrivateFare")
    GUARANTEED_USING_AIRLINE_PRIVATE_FARE("GuaranteedUsingAirlinePrivateFare"),

    /**
     * Fare guaranteed by Airline.
     * 
     */
    @XmlEnumValue("Airline")
    AIRLINE("Airline"),

    /**
     * Guaranteed fare recently got expired as ticketing hadn't been done within a time frame typically midnight local time of POS .
     * 
     */
    @XmlEnumValue("GuaranteeExpired")
    GUARANTEE_EXPIRED("GuaranteeExpired"),

    /**
     * Agency Private Fare with no rules override
     * 
     */
    @XmlEnumValue("AgencyPrivateFareNoOverride")
    AGENCY_PRIVATE_FARE_NO_OVERRIDE("AgencyPrivateFareNoOverride"),

    /**
     * To handle new enumerations added by provider but currently not recognized by API
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeFareGuarantee(String v) {
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
    public static TypeFareGuarantee fromValue(String v) {
        for (TypeFareGuarantee c: TypeFareGuarantee.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
