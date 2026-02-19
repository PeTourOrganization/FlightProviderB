
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeAlliance</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeAlliance">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="StarAlliance"/>
 *     <enumeration value="OneWorld"/>
 *     <enumeration value="KLMNorthwestAlliance"/>
 *     <enumeration value="SkyTeam"/>
 *     <enumeration value="OWCode"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeAlliance")
@XmlEnum
public enum TypeAlliance {

    @XmlEnumValue("StarAlliance")
    STAR_ALLIANCE("StarAlliance"),
    @XmlEnumValue("OneWorld")
    ONE_WORLD("OneWorld"),
    @XmlEnumValue("KLMNorthwestAlliance")
    KLM_NORTHWEST_ALLIANCE("KLMNorthwestAlliance"),
    @XmlEnumValue("SkyTeam")
    SKY_TEAM("SkyTeam"),
    @XmlEnumValue("OWCode")
    OW_CODE("OWCode");
    private final String value;

    TypeAlliance(String v) {
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
    public static TypeAlliance fromValue(String v) {
        for (TypeAlliance c: TypeAlliance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
