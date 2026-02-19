
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The passenger residency type.Residence Type can be Employee, National or Resident
 * 
 * <p>Java class for typeResidency</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeResidency">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Employee"/>
 *     <enumeration value="National"/>
 *     <enumeration value="Resident"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeResidency", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeResidency {

    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Resident")
    RESIDENT("Resident");
    private final String value;

    TypeResidency(String v) {
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
    public static TypeResidency fromValue(String v) {
        for (TypeResidency c: TypeResidency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
