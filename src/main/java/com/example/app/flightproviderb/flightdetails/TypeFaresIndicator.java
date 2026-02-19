
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the type of fares to return (Only
 *                 public fares, Only private fares, Only agency private fares, Only
 *                 airline private fares or all fares)
 * 
 * <p>Java class for typeFaresIndicator</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFaresIndicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PublicFaresOnly"/>
 *     <enumeration value="PrivateFaresOnly"/>
 *     <enumeration value="AgencyPrivateFaresOnly"/>
 *     <enumeration value="AirlinePrivateFaresOnly"/>
 *     <enumeration value="PublicAndPrivateFares"/>
 *     <enumeration value="NetFaresOnly"/>
 *     <enumeration value="AllFares"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFaresIndicator")
@XmlEnum
public enum TypeFaresIndicator {

    @XmlEnumValue("PublicFaresOnly")
    PUBLIC_FARES_ONLY("PublicFaresOnly"),
    @XmlEnumValue("PrivateFaresOnly")
    PRIVATE_FARES_ONLY("PrivateFaresOnly"),
    @XmlEnumValue("AgencyPrivateFaresOnly")
    AGENCY_PRIVATE_FARES_ONLY("AgencyPrivateFaresOnly"),
    @XmlEnumValue("AirlinePrivateFaresOnly")
    AIRLINE_PRIVATE_FARES_ONLY("AirlinePrivateFaresOnly"),
    @XmlEnumValue("PublicAndPrivateFares")
    PUBLIC_AND_PRIVATE_FARES("PublicAndPrivateFares"),
    @XmlEnumValue("NetFaresOnly")
    NET_FARES_ONLY("NetFaresOnly"),

    /**
     * Applicable for 1G/1V air shop only
     * 
     */
    @XmlEnumValue("AllFares")
    ALL_FARES("AllFares");
    private final String value;

    TypeFaresIndicator(String v) {
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
    public static TypeFaresIndicator fromValue(String v) {
        for (TypeFaresIndicator c: TypeFaresIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
