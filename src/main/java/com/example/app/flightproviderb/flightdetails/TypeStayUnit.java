
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Units for the Length of Stay
 * 
 * <p>Java class for typeStayUnit</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeStayUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Minutes"/>
 *     <enumeration value="Hours"/>
 *     <enumeration value="Days"/>
 *     <enumeration value="Months"/>
 *     <enumeration value="Monday"/>
 *     <enumeration value="Tuesday"/>
 *     <enumeration value="Wednesday"/>
 *     <enumeration value="Thursday"/>
 *     <enumeration value="Friday"/>
 *     <enumeration value="Saturday"/>
 *     <enumeration value="Sunday"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeStayUnit")
@XmlEnum
public enum TypeStayUnit {

    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday");
    private final String value;

    TypeStayUnit(String v) {
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
    public static TypeStayUnit fromValue(String v) {
        for (TypeStayUnit c: TypeStayUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
