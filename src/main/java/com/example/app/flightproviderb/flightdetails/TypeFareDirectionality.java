
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A fare's directionality (e.g. one-way, return )
 * 
 * <p>Java class for typeFareDirectionality</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareDirectionality">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Outbound"/>
 *     <enumeration value="Return"/>
 *     <enumeration value="All"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareDirectionality")
@XmlEnum
public enum TypeFareDirectionality {

    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    TypeFareDirectionality(String v) {
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
    public static TypeFareDirectionality fromValue(String v) {
        for (TypeFareDirectionality c: TypeFareDirectionality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
