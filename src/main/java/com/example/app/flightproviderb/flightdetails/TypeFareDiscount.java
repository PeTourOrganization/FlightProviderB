
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fare Discount Calculation Method
 * 
 * <p>Java class for typeFareDiscount</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareDiscount">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BaseReCalcUSTaxes"/>
 *     <enumeration value="BaseNoReCalcUSTaxes"/>
 *     <enumeration value="BaseTax"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareDiscount")
@XmlEnum
public enum TypeFareDiscount {

    @XmlEnumValue("BaseReCalcUSTaxes")
    BASE_RE_CALC_US_TAXES("BaseReCalcUSTaxes"),
    @XmlEnumValue("BaseNoReCalcUSTaxes")
    BASE_NO_RE_CALC_US_TAXES("BaseNoReCalcUSTaxes"),
    @XmlEnumValue("BaseTax")
    BASE_TAX("BaseTax");
    private final String value;

    TypeFareDiscount(String v) {
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
    public static TypeFareDiscount fromValue(String v) {
        for (TypeFareDiscount c: TypeFareDiscount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
