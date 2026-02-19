
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type of payment required to reserve travel i.e. Hotel Reservation requirement
 * 
 * <p>Java class for typeReserveRequirement</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeReserveRequirement">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <maxLength value="20"/>
 *     <enumeration value="Deposit"/>
 *     <enumeration value="Guarantee"/>
 *     <enumeration value="Prepayment"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeReserveRequirement", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeReserveRequirement {

    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee"),
    @XmlEnumValue("Prepayment")
    PREPAYMENT("Prepayment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeReserveRequirement(String v) {
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
    public static TypeReserveRequirement fromValue(String v) {
        for (TypeReserveRequirement c: TypeReserveRequirement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
