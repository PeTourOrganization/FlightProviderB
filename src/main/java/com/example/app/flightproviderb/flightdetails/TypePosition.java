
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Facility position with respect to position
 *                 within the aircraft cabin. Possible values are – Left, Right,
 *                 Center, Left Center, Right Center
 * 
 * <p>Java class for typePosition</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typePosition">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Left"/>
 *     <enumeration value="Right"/>
 *     <enumeration value="Center"/>
 *     <enumeration value="LeftCenter"/>
 *     <enumeration value="RightCenter"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typePosition")
@XmlEnum
public enum TypePosition {

    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("LeftCenter")
    LEFT_CENTER("LeftCenter"),
    @XmlEnumValue("RightCenter")
    RIGHT_CENTER("RightCenter");
    private final String value;

    TypePosition(String v) {
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
    public static TypePosition fromValue(String v) {
        for (TypePosition c: TypePosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
