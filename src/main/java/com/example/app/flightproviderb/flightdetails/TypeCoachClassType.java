
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Values for accommodation class.
 * 
 * <p>Java class for typeCoachClassType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeCoachClassType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="First Class"/>
 *     <enumeration value="Standard Class"/>
 *     <enumeration value="First and Standard Class"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeCoachClassType", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeCoachClassType {

    @XmlEnumValue("First Class")
    FIRST_CLASS("First Class"),
    @XmlEnumValue("Standard Class")
    STANDARD_CLASS("Standard Class"),
    @XmlEnumValue("First and Standard Class")
    FIRST_AND_STANDARD_CLASS("First and Standard Class"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeCoachClassType(String v) {
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
    public static TypeCoachClassType fromValue(String v) {
        for (TypeCoachClassType c: TypeCoachClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
