
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Types of possible commission.
 * 
 * <p>Java class for typeCommissionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeCommissionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Flat"/>
 *     <enumeration value="PercentBase"/>
 *     <enumeration value="PercentTotal"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeCommissionType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeCommissionType {

    @XmlEnumValue("Flat")
    FLAT("Flat"),
    @XmlEnumValue("PercentBase")
    PERCENT_BASE("PercentBase"),
    @XmlEnumValue("PercentTotal")
    PERCENT_TOTAL("PercentTotal");
    private final String value;

    TypeCommissionType(String v) {
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
    public static TypeCommissionType fromValue(String v) {
        for (TypeCommissionType c: TypeCommissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
