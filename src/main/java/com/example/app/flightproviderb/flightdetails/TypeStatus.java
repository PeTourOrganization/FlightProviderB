
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The status of the service fees.
 * 
 * <p>Java class for typeStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Issued"/>
 *     <enumeration value="ReadyToIssue"/>
 *     <enumeration value="IssueLater"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeStatus", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeStatus {


    /**
     * The service fee has been issued.
     * 
     */
    @XmlEnumValue("Issued")
    ISSUED("Issued"),

    /**
     * The service fee is ready to be issued.
     * 
     */
    @XmlEnumValue("ReadyToIssue")
    READY_TO_ISSUE("ReadyToIssue"),

    /**
     * The service fee can be issued later.
     * 
     */
    @XmlEnumValue("IssueLater")
    ISSUE_LATER("IssueLater");
    private final String value;

    TypeStatus(String v) {
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
    public static TypeStatus fromValue(String v) {
        for (TypeStatus c: TypeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
