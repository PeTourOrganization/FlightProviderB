
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fare Search option indicator.
 * 
 * <p>Java class for typeFareSearchOption</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareSearchOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Leave"/>
 *     <enumeration value="Return"/>
 *     <enumeration value="Seasonal"/>
 *     <enumeration value="Blackout"/>
 *     <enumeration value="Advance Purchase"/>
 *     <enumeration value="Day-of-week"/>
 *     <enumeration value="Effective Date"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareSearchOption")
@XmlEnum
public enum TypeFareSearchOption {

    @XmlEnumValue("Leave")
    LEAVE("Leave"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("Seasonal")
    SEASONAL("Seasonal"),
    @XmlEnumValue("Blackout")
    BLACKOUT("Blackout"),
    @XmlEnumValue("Advance Purchase")
    ADVANCE_PURCHASE("Advance Purchase"),
    @XmlEnumValue("Day-of-week")
    DAY_OF_WEEK("Day-of-week"),
    @XmlEnumValue("Effective Date")
    EFFECTIVE_DATE("Effective Date");
    private final String value;

    TypeFareSearchOption(String v) {
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
    public static TypeFareSearchOption fromValue(String v) {
        for (TypeFareSearchOption c: TypeFareSearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
