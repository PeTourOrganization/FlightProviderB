
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Optional commission modifier.
 * 
 * <p>Java class for typeCommissionModifier</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeCommissionModifier">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FarePercent"/>
 *     <enumeration value="FareAmount"/>
 *     <enumeration value="CommissionAmount"/>
 *     <enumeration value="LessStandardCommission"/>
 *     <enumeration value="StandardPlusSupplementaryPercent"/>
 *     <enumeration value="SupplementaryPercent"/>
 *     <enumeration value="SupplementaryAmount"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeCommissionModifier", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeCommissionModifier {


    /**
     * Commission percentage applied to the fare
     * 
     */
    @XmlEnumValue("FarePercent")
    FARE_PERCENT("FarePercent"),

    /**
     * Commission amount applied to the fare
     * 
     */
    @XmlEnumValue("FareAmount")
    FARE_AMOUNT("FareAmount"),

    /**
     * Specific commission amount to be applied
     * 
     */
    @XmlEnumValue("CommissionAmount")
    COMMISSION_AMOUNT("CommissionAmount"),

    /**
     * Indicates commission percentage applied to the fare less the standard commission
     * 
     */
    @XmlEnumValue("LessStandardCommission")
    LESS_STANDARD_COMMISSION("LessStandardCommission"),

    /**
     * Indicates commission percentage includes standard and supplementary commission
     * 
     */
    @XmlEnumValue("StandardPlusSupplementaryPercent")
    STANDARD_PLUS_SUPPLEMENTARY_PERCENT("StandardPlusSupplementaryPercent"),

    /**
     * Supplementary commission percent which is applied to the fare
     * 
     */
    @XmlEnumValue("SupplementaryPercent")
    SUPPLEMENTARY_PERCENT("SupplementaryPercent"),

    /**
     * Supplementary commission amount which is applied to the fare
     * 
     */
    @XmlEnumValue("SupplementaryAmount")
    SUPPLEMENTARY_AMOUNT("SupplementaryAmount");
    private final String value;

    TypeCommissionModifier(String v) {
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
    public static TypeCommissionModifier fromValue(String v) {
        for (TypeCommissionModifier c: TypeCommissionModifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
