
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The source/level at which is item is defined (available through inheritance)
 * 
 * <p>Java class for typeSource</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeSource">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Agency"/>
 *     <enumeration value="BranchGroup"/>
 *     <enumeration value="Branch"/>
 *     <enumeration value="Agent"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeSource", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeSource {

    @XmlEnumValue("Agency")
    AGENCY("Agency"),
    @XmlEnumValue("BranchGroup")
    BRANCH_GROUP("BranchGroup"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    TypeSource(String v) {
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
    public static TypeSource fromValue(String v) {
        for (TypeSource c: TypeSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
