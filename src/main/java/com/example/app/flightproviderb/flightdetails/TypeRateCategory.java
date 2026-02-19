
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The category of the rate (Best, etc)
 * 
 * <p>Java class for typeRateCategory</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeRateCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Association"/>
 *     <enumeration value="Business"/>
 *     <enumeration value="Corporate"/>
 *     <enumeration value="Government"/>
 *     <enumeration value="Industry"/>
 *     <enumeration value="Package"/>
 *     <enumeration value="Inclusive"/>
 *     <enumeration value="Promotional"/>
 *     <enumeration value="Credential"/>
 *     <enumeration value="Standard"/>
 *     <enumeration value="Consortium"/>
 *     <enumeration value="Convention"/>
 *     <enumeration value="Negotiated"/>
 *     <enumeration value="Prepay"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeRateCategory", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeRateCategory {

    @XmlEnumValue("Association")
    ASSOCIATION("Association"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("Credential")
    CREDENTIAL("Credential"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Consortium")
    CONSORTIUM("Consortium"),
    @XmlEnumValue("Convention")
    CONVENTION("Convention"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("Prepay")
    PREPAY("Prepay");
    private final String value;

    TypeRateCategory(String v) {
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
    public static TypeRateCategory fromValue(String v) {
        for (TypeRateCategory c: TypeRateCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
