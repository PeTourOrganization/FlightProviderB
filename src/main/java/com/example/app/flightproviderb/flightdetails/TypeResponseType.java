
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Indicates the type of information to be returned in RailShopModifyAPIResponse.  Values are “Schedules” or “Availability” or “Fares”.  If not sent, “Fares” will be mapped if the request is for a specific rail segments, otherwise “Availability” will be mapped. Provider Supported RCH.
 * 
 * <p>Java class for typeResponseType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeResponseType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Availability"/>
 *     <enumeration value="Schedules"/>
 *     <enumeration value="Fares"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeResponseType", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeResponseType {

    @XmlEnumValue("Availability")
    AVAILABILITY("Availability"),
    @XmlEnumValue("Schedules")
    SCHEDULES("Schedules"),
    @XmlEnumValue("Fares")
    FARES("Fares");
    private final String value;

    TypeResponseType(String v) {
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
    public static TypeResponseType fromValue(String v) {
        for (TypeResponseType c: TypeResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
