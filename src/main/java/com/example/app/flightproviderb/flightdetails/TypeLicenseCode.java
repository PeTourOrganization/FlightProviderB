
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of license assigned to an agent.
 * 
 * <p>Java class for typeLicenseCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeLicenseCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Standard"/>
 *     <enumeration value="Standard Plus"/>
 *     <enumeration value="Enterprise"/>
 *     <enumeration value="TE Only"/>
 *     <enumeration value="uAPI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeLicenseCode", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeLicenseCode {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Standard Plus")
    STANDARD_PLUS("Standard Plus"),
    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("TE Only")
    TE_ONLY("TE Only"),
    @XmlEnumValue("uAPI")
    U_API("uAPI");
    private final String value;

    TypeLicenseCode(String v) {
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
    public static TypeLicenseCode fromValue(String v) {
        for (TypeLicenseCode c: TypeLicenseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
