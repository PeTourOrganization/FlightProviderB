
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines how the client wishes to receive travel documents, e.g. collect ticket at a kiosk, print in agency.
 * 
 * <p>Java class for typeFulfillmentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFulfillmentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Kiosk"/>
 *     <enumeration value="Travel Agency"/>
 *     <enumeration value="Courier"/>
 *     <enumeration value="Standard Mail"/>
 *     <enumeration value="Ticketless"/>
 *     <enumeration value="Ticket Office"/>
 *     <enumeration value="Express Mail"/>
 *     <enumeration value="Corporate Kiosk"/>
 *     <enumeration value="Train Station Service Desk"/>
 *     <enumeration value="Direct Printing of Ticket"/>
 *     <enumeration value="Printing of Ticket at Home"/>
 *     <enumeration value="Digital Printing of Ticket at Home"/>
 *     <enumeration value="Retrieve Ticket at Eurostar in London"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFulfillmentType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeFulfillmentType {

    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk"),
    @XmlEnumValue("Travel Agency")
    TRAVEL_AGENCY("Travel Agency"),
    @XmlEnumValue("Courier")
    COURIER("Courier"),
    @XmlEnumValue("Standard Mail")
    STANDARD_MAIL("Standard Mail"),
    @XmlEnumValue("Ticketless")
    TICKETLESS("Ticketless"),
    @XmlEnumValue("Ticket Office")
    TICKET_OFFICE("Ticket Office"),
    @XmlEnumValue("Express Mail")
    EXPRESS_MAIL("Express Mail"),
    @XmlEnumValue("Corporate Kiosk")
    CORPORATE_KIOSK("Corporate Kiosk"),
    @XmlEnumValue("Train Station Service Desk")
    TRAIN_STATION_SERVICE_DESK("Train Station Service Desk"),
    @XmlEnumValue("Direct Printing of Ticket")
    DIRECT_PRINTING_OF_TICKET("Direct Printing of Ticket"),
    @XmlEnumValue("Printing of Ticket at Home")
    PRINTING_OF_TICKET_AT_HOME("Printing of Ticket at Home"),
    @XmlEnumValue("Digital Printing of Ticket at Home")
    DIGITAL_PRINTING_OF_TICKET_AT_HOME("Digital Printing of Ticket at Home"),
    @XmlEnumValue("Retrieve Ticket at Eurostar in London")
    RETRIEVE_TICKET_AT_EUROSTAR_IN_LONDON("Retrieve Ticket at Eurostar in London");
    private final String value;

    TypeFulfillmentType(String v) {
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
    public static TypeFulfillmentType fromValue(String v) {
        for (TypeFulfillmentType c: TypeFulfillmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
