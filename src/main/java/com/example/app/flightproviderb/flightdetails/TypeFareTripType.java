
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * RoundTheWorld -- round the world fare
 * 
 * <p>Java class for typeFareTripType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareTripType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OneWay"/>
 *     <enumeration value="OneWayOnly"/>
 *     <enumeration value="Return"/>
 *     <enumeration value="ReturnOnly"/>
 *     <enumeration value="HalfReturn"/>
 *     <enumeration value="CircleTrip"/>
 *     <enumeration value="RoundTheWorld"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareTripType")
@XmlEnum
public enum TypeFareTripType {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("ReturnOnly")
    RETURN_ONLY("ReturnOnly"),
    @XmlEnumValue("HalfReturn")
    HALF_RETURN("HalfReturn"),
    @XmlEnumValue("CircleTrip")
    CIRCLE_TRIP("CircleTrip"),
    @XmlEnumValue("RoundTheWorld")
    ROUND_THE_WORLD("RoundTheWorld");
    private final String value;

    TypeFareTripType(String v) {
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
    public static TypeFareTripType fromValue(String v) {
        for (TypeFareTripType c: TypeFareTripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
