
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeVoucherType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeVoucherType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FullCredit"/>
 *     <enumeration value="GroupOrDay"/>
 *     <enumeration value="SpecificValue"/>
 *     <enumeration value="RegularVoucher"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeVoucherType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeVoucherType {

    @XmlEnumValue("FullCredit")
    FULL_CREDIT("FullCredit"),
    @XmlEnumValue("GroupOrDay")
    GROUP_OR_DAY("GroupOrDay"),
    @XmlEnumValue("SpecificValue")
    SPECIFIC_VALUE("SpecificValue"),
    @XmlEnumValue("RegularVoucher")
    REGULAR_VOUCHER("RegularVoucher");
    private final String value;

    TypeVoucherType(String v) {
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
    public static TypeVoucherType fromValue(String v) {
        for (TypeVoucherType c: TypeVoucherType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
