
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specify whether the change is to update or delete the field.
 * 
 * <p>Java class for typeProfileEntityStatusWithDelete</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeProfileEntityStatusWithDelete">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Deleted"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="Inactive"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeProfileEntityStatusWithDelete", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeProfileEntityStatusWithDelete {

    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    TypeProfileEntityStatusWithDelete(String v) {
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
    public static TypeProfileEntityStatusWithDelete fromValue(String v) {
        for (TypeProfileEntityStatusWithDelete c: TypeProfileEntityStatusWithDelete.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
