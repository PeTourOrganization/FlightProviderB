
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the ability to eticket an entity
 *                 (Yes, No, Required, Ticketless)
 * 
 * <p>Java class for typeEticketability</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeEticketability">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Yes"/>
 *     <enumeration value="No"/>
 *     <enumeration value="Required"/>
 *     <enumeration value="Ticketless"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeEticketability")
@XmlEnum
public enum TypeEticketability {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Ticketless")
    TICKETLESS("Ticketless");
    private final String value;

    TypeEticketability(String v) {
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
    public static TypeEticketability fromValue(String v) {
        for (TypeEticketability c: TypeEticketability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
