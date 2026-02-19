
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Extra for ExtraSegmentInfo and Vendor for VendorMessages
 * 
 * <p>Java class for typeRailSegmentInfo</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeRailSegmentInfo">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Extra"/>
 *     <enumeration value="Vendor"/>
 *     <enumeration value="Services"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeRailSegmentInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeRailSegmentInfo {

    @XmlEnumValue("Extra")
    EXTRA("Extra"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("Services")
    SERVICES("Services");
    private final String value;

    TypeRailSegmentInfo(String v) {
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
    public static TypeRailSegmentInfo fromValue(String v) {
        for (TypeRailSegmentInfo c: TypeRailSegmentInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
