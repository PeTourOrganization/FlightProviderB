
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeBillingDetailsName</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeBillingDetailsName">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PersonalId"/>
 *     <enumeration value="CostAccountNumber"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="ProjectNumber"/>
 *     <enumeration value="ActionCode"/>
 *     <enumeration value="DepartmentCode"/>
 *     <enumeration value="AccountingUnit"/>
 *     <enumeration value="OrderNumber"/>
 *     <enumeration value="Destination"/>
 *     <enumeration value="FileDate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeBillingDetailsName")
@XmlEnum
public enum TypeBillingDetailsName {

    @XmlEnumValue("PersonalId")
    PERSONAL_ID("PersonalId"),
    @XmlEnumValue("CostAccountNumber")
    COST_ACCOUNT_NUMBER("CostAccountNumber"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("ProjectNumber")
    PROJECT_NUMBER("ProjectNumber"),
    @XmlEnumValue("ActionCode")
    ACTION_CODE("ActionCode"),
    @XmlEnumValue("DepartmentCode")
    DEPARTMENT_CODE("DepartmentCode"),
    @XmlEnumValue("AccountingUnit")
    ACCOUNTING_UNIT("AccountingUnit"),
    @XmlEnumValue("OrderNumber")
    ORDER_NUMBER("OrderNumber"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("FileDate")
    FILE_DATE("FileDate");
    private final String value;

    TypeBillingDetailsName(String v) {
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
    public static TypeBillingDetailsName fromValue(String v) {
        for (TypeBillingDetailsName c: TypeBillingDetailsName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
