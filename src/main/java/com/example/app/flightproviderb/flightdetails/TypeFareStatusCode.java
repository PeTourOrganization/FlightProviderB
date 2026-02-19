
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeFareStatusCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareStatusCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ReadyToTicket"/>
 *     <enumeration value="UnableToTicket"/>
 *     <enumeration value="Reprice"/>
 *     <enumeration value="Ticketed"/>
 *     <enumeration value="Unable"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareStatusCode")
@XmlEnum
public enum TypeFareStatusCode {


    /**
     * Fare is enabled and available for ticketing
     * 
     */
    @XmlEnumValue("ReadyToTicket")
    READY_TO_TICKET("ReadyToTicket"),

    /**
     * Fare could not be ticketed
     * 
     */
    @XmlEnumValue("UnableToTicket")
    UNABLE_TO_TICKET("UnableToTicket"),

    /**
     * Fare needs to be repriced
     * 
     */
    @XmlEnumValue("Reprice")
    REPRICE("Reprice"),

    /**
     * Fare is ticketed
     * 
     */
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),

    /**
     * Fare is not enabled
     * 
     */
    @XmlEnumValue("Unable")
    UNABLE("Unable"),

    /**
     * To handle new enumerations added by provider but currently not recognized by API
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeFareStatusCode(String v) {
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
    public static TypeFareStatusCode fromValue(String v) {
        for (TypeFareStatusCode c: TypeFareStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
