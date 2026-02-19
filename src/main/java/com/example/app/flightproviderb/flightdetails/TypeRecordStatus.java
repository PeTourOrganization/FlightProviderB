
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information on whether the Universal Record is Current, Past , Cancelled or Any status.
 * 
 * <p>Java class for typeRecordStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeRecordStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="Past"/>
 *     <enumeration value="Current"/>
 *     <enumeration value="Canceled"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeRecordStatus", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeRecordStatus {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Past")
    PAST("Past"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TypeRecordStatus(String v) {
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
    public static TypeRecordStatus fromValue(String v) {
        for (TypeRecordStatus c: TypeRecordStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
