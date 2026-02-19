
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeFarePull</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFarePull">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ReverseOfOriginDestination"/>
 *     <enumeration value="SameAsOriginDestination"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFarePull", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeFarePull {

    @XmlEnumValue("ReverseOfOriginDestination")
    REVERSE_OF_ORIGIN_DESTINATION("ReverseOfOriginDestination"),
    @XmlEnumValue("SameAsOriginDestination")
    SAME_AS_ORIGIN_DESTINATION("SameAsOriginDestination");
    private final String value;

    TypeFarePull(String v) {
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
    public static TypeFarePull fromValue(String v) {
        for (TypeFarePull c: TypeFarePull.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
