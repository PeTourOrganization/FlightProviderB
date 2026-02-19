
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The direction of travel.
 * 
 * <p>Java class for typeRailDirection</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeRailDirection">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Inbound"/>
 *     <enumeration value="Outbound"/>
 *     <enumeration value="Both"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeRailDirection", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeRailDirection {

    @XmlEnumValue("Inbound")
    INBOUND("Inbound"),
    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeRailDirection(String v) {
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
    public static TypeRailDirection fromValue(String v) {
        for (TypeRailDirection c: TypeRailDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
