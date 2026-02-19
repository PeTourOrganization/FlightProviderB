
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The "profile level" used for association of workflow etc.
 * 
 * <p>Java class for typeProfileLevelWithSystem</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeProfileLevelWithSystem">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="System"/>
 *     <enumeration value="Agency"/>
 *     <enumeration value="Branch"/>
 *     <enumeration value="BranchGroup"/>
 *     <enumeration value="Agent"/>
 *     <enumeration value="Account"/>
 *     <enumeration value="TravelerGroup"/>
 *     <enumeration value="Traveler"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeProfileLevelWithSystem", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeProfileLevelWithSystem {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("TravelerGroup")
    TRAVELER_GROUP("TravelerGroup"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler");
    private final String value;

    TypeProfileLevelWithSystem(String v) {
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
    public static TypeProfileLevelWithSystem fromValue(String v) {
        for (TypeProfileLevelWithSystem c: TypeProfileLevelWithSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
