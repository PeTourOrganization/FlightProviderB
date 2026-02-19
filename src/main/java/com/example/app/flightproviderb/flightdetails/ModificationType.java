
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The modification types supported
 * 
 * <p>Java class for ModificationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ModificationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="AddSegment"/>
 *     <enumeration value="RemoveSegment"/>
 *     <enumeration value="ReplaceSegment"/>
 *     <enumeration value="AddPassenger"/>
 *     <enumeration value="RemovePassenger"/>
 *     <enumeration value="OptionsOnly"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModificationType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum ModificationType {


    /**
     * Add a segment to the itinerary
     * 
     */
    @XmlEnumValue("AddSegment")
    ADD_SEGMENT("AddSegment"),

    /**
     * Delete a segment from the itinerary
     * 
     */
    @XmlEnumValue("RemoveSegment")
    REMOVE_SEGMENT("RemoveSegment"),

    /**
     * Replace a segment in the itinerary with a new segment
     * 
     */
    @XmlEnumValue("ReplaceSegment")
    REPLACE_SEGMENT("ReplaceSegment"),

    /**
     * Add a passenger to the itinerary
     * 
     */
    @XmlEnumValue("AddPassenger")
    ADD_PASSENGER("AddPassenger"),

    /**
     * Remove a passenger from the itinerary
     * 
     */
    @XmlEnumValue("RemovePassenger")
    REMOVE_PASSENGER("RemovePassenger"),

    /**
     * Modification where only options are added / removed from the itinerary
     * 
     */
    @XmlEnumValue("OptionsOnly")
    OPTIONS_ONLY("OptionsOnly"),

    /**
     * Other modification types
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ModificationType(String v) {
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
    public static ModificationType fromValue(String v) {
        for (ModificationType c: ModificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
