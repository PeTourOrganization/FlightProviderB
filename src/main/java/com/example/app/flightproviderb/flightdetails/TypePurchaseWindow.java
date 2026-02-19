
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The purchase windows available for merchandising service
 * 
 * <p>Java class for typePurchaseWindow</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePurchaseWindow">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BookingOnly"/>
 *     <enumeration value="TicketingOnly"/>
 *     <enumeration value="CheckInOnly"/>
 *     <enumeration value="Anytime"/>
 *     <enumeration value="PostTicketing"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePurchaseWindow", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypePurchaseWindow {

    @XmlEnumValue("BookingOnly")
    BOOKING_ONLY("BookingOnly"),
    @XmlEnumValue("TicketingOnly")
    TICKETING_ONLY("TicketingOnly"),
    @XmlEnumValue("CheckInOnly")
    CHECK_IN_ONLY("CheckInOnly"),
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime"),
    @XmlEnumValue("PostTicketing")
    POST_TICKETING("PostTicketing");
    private final String value;

    TypePurchaseWindow(String v) {
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
    public static TypePurchaseWindow fromValue(String v) {
        for (TypePurchaseWindow c: TypePurchaseWindow.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
