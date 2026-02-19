
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeBackOffice</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeBackOffice">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Accounting"/>
 *     <enumeration value="Global"/>
 *     <enumeration value="NonAccounting"/>
 *     <enumeration value="NonAccountingRemote"/>
 *     <enumeration value="Dual"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeBackOffice")
@XmlEnum
public enum TypeBackOffice {

    @XmlEnumValue("Accounting")
    ACCOUNTING("Accounting"),
    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("NonAccounting")
    NON_ACCOUNTING("NonAccounting"),
    @XmlEnumValue("NonAccountingRemote")
    NON_ACCOUNTING_REMOTE("NonAccountingRemote"),
    @XmlEnumValue("Dual")
    DUAL("Dual");
    private final String value;

    TypeBackOffice(String v) {
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
    public static TypeBackOffice fromValue(String v) {
        for (TypeBackOffice c: TypeBackOffice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
