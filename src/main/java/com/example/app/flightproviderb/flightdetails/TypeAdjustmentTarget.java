
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeAdjustmentTarget</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeAdjustmentTarget">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Base"/>
 *     <enumeration value="Total"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeAdjustmentTarget", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeAdjustmentTarget {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeAdjustmentTarget(String v) {
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
    public static TypeAdjustmentTarget fromValue(String v) {
        for (TypeAdjustmentTarget c: TypeAdjustmentTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
