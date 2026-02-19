
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The valid reporting types
 * 
 * <p>Java class for typeReportingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeReportingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AvailabilityFailure"/>
 *     <enumeration value="PriceDiscrepancies"/>
 *     <enumeration value="MarriageDiscrepancies"/>
 *     <enumeration value="Success"/>
 *     <enumeration value="ScheduleDiscrepancies"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeReportingType")
@XmlEnum
public enum TypeReportingType {

    @XmlEnumValue("AvailabilityFailure")
    AVAILABILITY_FAILURE("AvailabilityFailure"),
    @XmlEnumValue("PriceDiscrepancies")
    PRICE_DISCREPANCIES("PriceDiscrepancies"),
    @XmlEnumValue("MarriageDiscrepancies")
    MARRIAGE_DISCREPANCIES("MarriageDiscrepancies"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("ScheduleDiscrepancies")
    SCHEDULE_DISCREPANCIES("ScheduleDiscrepancies");
    private final String value;

    TypeReportingType(String v) {
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
    public static TypeReportingType fromValue(String v) {
        for (TypeReportingType c: TypeReportingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
