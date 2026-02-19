
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeReqSeat</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeReqSeat">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Any"/>
 *     <enumeration value="Aisle"/>
 *     <enumeration value="Bulkhead"/>
 *     <enumeration value="Exit"/>
 *     <enumeration value="Window"/>
 *     <enumeration value="Middle"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeReqSeat", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeReqSeat {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Bulkhead")
    BULKHEAD("Bulkhead"),
    @XmlEnumValue("Exit")
    EXIT("Exit"),
    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle");
    private final String value;

    TypeReqSeat(String v) {
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
    public static TypeReqSeat fromValue(String v) {
        for (TypeReqSeat c: TypeReqSeat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
