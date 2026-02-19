
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Whether the fare is Mile or Route based
 * 
 * <p>Java class for typeMileOrRouteBasedFare</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeMileOrRouteBasedFare">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Mile"/>
 *     <enumeration value="Route"/>
 *     <enumeration value="Both"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeMileOrRouteBasedFare")
@XmlEnum
public enum TypeMileOrRouteBasedFare {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Route")
    ROUTE("Route"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TypeMileOrRouteBasedFare(String v) {
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
    public static TypeMileOrRouteBasedFare fromValue(String v) {
        for (TypeMileOrRouteBasedFare c: TypeMileOrRouteBasedFare.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
