
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeBillingDetailsDataType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeBillingDetailsDataType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Alpha"/>
 *     <enumeration value="Numeric"/>
 *     <enumeration value="AlphaNumeric"/>
 *     <enumeration value="Date"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeBillingDetailsDataType")
@XmlEnum
public enum TypeBillingDetailsDataType {

    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("AlphaNumeric")
    ALPHA_NUMERIC("AlphaNumeric"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    TypeBillingDetailsDataType(String v) {
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
    public static TypeBillingDetailsDataType fromValue(String v) {
        for (TypeBillingDetailsDataType c: TypeBillingDetailsDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
