
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Types of fare break.
 * 
 * <p>Java class for typeFareBreak</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareBreak">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MustBreak"/>
 *     <enumeration value="MustOnlyBreak"/>
 *     <enumeration value="MustNotBreak"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareBreak")
@XmlEnum
public enum TypeFareBreak {


    /**
     * Break Fare at the associated segment.
     *                         Multiple Breaks or No Breaks may be allowed.
     * 
     */
    @XmlEnumValue("MustBreak")
    MUST_BREAK("MustBreak"),

    /**
     * Only Break Fare at the associated segment.
     *                         Fare Break in the entire itinerary is allowed only at the
     *                         concerned segment.
     * 
     */
    @XmlEnumValue("MustOnlyBreak")
    MUST_ONLY_BREAK("MustOnlyBreak"),

    /**
     * No Fare Break allowed at the associated
     *                         segment.
     * 
     */
    @XmlEnumValue("MustNotBreak")
    MUST_NOT_BREAK("MustNotBreak");
    private final String value;

    TypeFareBreak(String v) {
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
    public static TypeFareBreak fromValue(String v) {
        for (TypeFareBreak c: TypeFareBreak.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
