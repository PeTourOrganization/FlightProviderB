
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ATA/IATA Standard commission level.
 * 
 * <p>Java class for typeCommissionLevel</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeCommissionLevel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Recalled"/>
 *     <enumeration value="Fare"/>
 *     <enumeration value="Penalty"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeCommissionLevel", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeCommissionLevel {

    @XmlEnumValue("Recalled")
    RECALLED("Recalled"),
    @XmlEnumValue("Fare")
    FARE("Fare"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    TypeCommissionLevel(String v) {
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
    public static TypeCommissionLevel fromValue(String v) {
        for (TypeCommissionLevel c: TypeCommissionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
