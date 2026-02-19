
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Invoice record type: Invoice, Void, Refund, Manual
 * 
 * <p>Java class for typeInvoiceRecordCategory</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeInvoiceRecordCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Invoice"/>
 *     <enumeration value="Void"/>
 *     <enumeration value="Refund"/>
 *     <enumeration value="Manual"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeInvoiceRecordCategory", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeInvoiceRecordCategory {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Void")
    VOID("Void"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    TypeInvoiceRecordCategory(String v) {
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
    public static TypeInvoiceRecordCategory fromValue(String v) {
        for (TypeInvoiceRecordCategory c: TypeInvoiceRecordCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
