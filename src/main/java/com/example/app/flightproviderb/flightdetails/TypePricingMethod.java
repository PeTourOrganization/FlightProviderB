
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The method at which the pricing data was
 *             acquired
 * 
 * <p>Java class for typePricingMethod</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePricingMethod">
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
 *     <enumeration value="AgentAssisted"/>
 *     <enumeration value="VerifyPrice"/>
 *     <enumeration value="AltSegmentRemovedReprice"/>
 *     <enumeration value="AuxiliarySegmentRemovedReprice"/>
 *     <enumeration value="DuplicateSegmentRemovedReprice"/>
 *     <enumeration value="Unknown"/>
 *     <enumeration value="GuaranteedUsingAgencyPrivateFare"/>
 *     <enumeration value="AutoRapidReprice"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePricingMethod")
@XmlEnum
public enum TypePricingMethod {


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
     * Expired fare, older than 7 days
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
     * Fare created as a result of Claim PNR which transfers data to GDS for ticketing purposes.
     * 
     */
    @XmlEnumValue("Airline")
    AIRLINE("Airline"),

    /**
     * Worldspan TKG FAX Line Documentation - AGENT ASSISTEDPRICED
     * 
     */
    @XmlEnumValue("AgentAssisted")
    AGENT_ASSISTED("AgentAssisted"),

    /**
     * Worldspan TKG FAX Line Documentation -  AWAITING PRICE VERIFICATION
     * 
     */
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),

    /**
     * Worldspan TKG FAX Line Documentation - AWAITING REPRICING ALT SEGS RMVD
     * 
     */
    @XmlEnumValue("AltSegmentRemovedReprice")
    ALT_SEGMENT_REMOVED_REPRICE("AltSegmentRemovedReprice"),

    /**
     * Worldspan TKG FAX Line Documentation -  AWAITING REPRICING AUX SEGS REMOVED
     * 
     */
    @XmlEnumValue("AuxiliarySegmentRemovedReprice")
    AUXILIARY_SEGMENT_REMOVED_REPRICE("AuxiliarySegmentRemovedReprice"),

    /**
     * Worldspan TKG FAX Line Documentation - AWAITING REPRICING DUPE SEGS REMOVED
     * 
     */
    @XmlEnumValue("DuplicateSegmentRemovedReprice")
    DUPLICATE_SEGMENT_REMOVED_REPRICE("DuplicateSegmentRemovedReprice"),

    /**
     * Any other kind of Pricing Method which is not supported by API.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Guaranteed fare using Agency private fare that was filed with a fare distributor.
     * 
     */
    @XmlEnumValue("GuaranteedUsingAgencyPrivateFare")
    GUARANTEED_USING_AGENCY_PRIVATE_FARE("GuaranteedUsingAgencyPrivateFare"),

    /**
     * Auto priced by rapid reprice. Provider 1P FCI code 4 .
     * 
     */
    @XmlEnumValue("AutoRapidReprice")
    AUTO_RAPID_REPRICE("AutoRapidReprice");
    private final String value;

    TypePricingMethod(String v) {
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
    public static TypePricingMethod fromValue(String v) {
        for (TypePricingMethod c: TypePricingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
