
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeDoorCount</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeDoorCount">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TwoToThreeDoors"/>
 *     <enumeration value="TwoToFourDoors"/>
 *     <enumeration value="FourToFiveDoors"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeDoorCount", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeDoorCount {

    @XmlEnumValue("TwoToThreeDoors")
    TWO_TO_THREE_DOORS("TwoToThreeDoors"),
    @XmlEnumValue("TwoToFourDoors")
    TWO_TO_FOUR_DOORS("TwoToFourDoors"),
    @XmlEnumValue("FourToFiveDoors")
    FOUR_TO_FIVE_DOORS("FourToFiveDoors");
    private final String value;

    TypeDoorCount(String v) {
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
    public static TypeDoorCount fromValue(String v) {
        for (TypeDoorCount c: TypeDoorCount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
