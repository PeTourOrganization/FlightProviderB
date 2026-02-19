
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List the types of private fares, Agency private fare, Airline private Fare and Unknown. 
 *     Also, this enumaration list includes PrivateFare to indetify private fares for GDSs where we can not identify specific private fares.
 * 
 * <p>Java class for typePrivateFare</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePrivateFare">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UnknownType"/>
 *     <enumeration value="PrivateFare"/>
 *     <enumeration value="AgencyPrivateFare"/>
 *     <enumeration value="AirlinePrivateFare"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePrivateFare")
@XmlEnum
public enum TypePrivateFare {

    @XmlEnumValue("UnknownType")
    UNKNOWN_TYPE("UnknownType"),
    @XmlEnumValue("PrivateFare")
    PRIVATE_FARE("PrivateFare"),
    @XmlEnumValue("AgencyPrivateFare")
    AGENCY_PRIVATE_FARE("AgencyPrivateFare"),
    @XmlEnumValue("AirlinePrivateFare")
    AIRLINE_PRIVATE_FARE("AirlinePrivateFare");
    private final String value;

    TypePrivateFare(String v) {
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
    public static TypePrivateFare fromValue(String v) {
        for (TypePrivateFare c: TypePrivateFare.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
