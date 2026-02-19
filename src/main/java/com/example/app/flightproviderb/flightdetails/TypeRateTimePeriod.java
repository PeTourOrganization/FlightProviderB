
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The period for the rate code (daily, weekly, etc)
 * 
 * <p>Java class for typeRateTimePeriod</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeRateTimePeriod">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Hourly"/>
 *     <enumeration value="Daily"/>
 *     <enumeration value="Weekly"/>
 *     <enumeration value="Monthly"/>
 *     <enumeration value="WeekendDay"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Package"/>
 *     <enumeration value="Bundle"/>
 *     <enumeration value="Total"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeRateTimePeriod", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeRateTimePeriod {

    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("WeekendDay")
    WEEKEND_DAY("WeekendDay"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    TypeRateTimePeriod(String v) {
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
    public static TypeRateTimePeriod fromValue(String v) {
        for (TypeRateTimePeriod c: TypeRateTimePeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
