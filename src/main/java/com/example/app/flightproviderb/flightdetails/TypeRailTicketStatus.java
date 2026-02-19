
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Status Types for Ticket Info.
 * 
 * <p>Java class for typeRailTicketStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeRailTicketStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Not Print Ready"/>
 *     <enumeration value="Can Be Printed"/>
 *     <enumeration value="Queued (sent to print module)"/>
 *     <enumeration value="Printed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeRailTicketStatus", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeRailTicketStatus {

    @XmlEnumValue("Not Print Ready")
    NOT_PRINT_READY("Not Print Ready"),
    @XmlEnumValue("Can Be Printed")
    CAN_BE_PRINTED("Can Be Printed"),
    @XmlEnumValue("Queued (sent to print module)")
    QUEUED_SENT_TO_PRINT_MODULE("Queued (sent to print module)"),
    @XmlEnumValue("Printed")
    PRINTED("Printed");
    private final String value;

    TypeRailTicketStatus(String v) {
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
    public static TypeRailTicketStatus fromValue(String v) {
        for (TypeRailTicketStatus c: TypeRailTicketStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
