
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The various reservation events (book, cancel, void, etc)
 * 
 * <p>Java class for typeEventType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeEventType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Create"/>
 *     <enumeration value="Cancel"/>
 *     <enumeration value="Ticket"/>
 *     <enumeration value="Refund"/>
 *     <enumeration value="Exchange"/>
 *     <enumeration value="Void"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeEventType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeEventType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("Void")
    VOID("Void");
    private final String value;

    TypeEventType(String v) {
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
    public static TypeEventType fromValue(String v) {
        for (TypeEventType c: TypeEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
