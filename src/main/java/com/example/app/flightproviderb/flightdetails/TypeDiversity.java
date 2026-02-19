
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used in Low Fare Search to better promote
 *                 unique results
 * 
 * <p>Java class for typeDiversity</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeDiversity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Blend"/>
 *     <enumeration value="Airports"/>
 *     <enumeration value="Carrier"/>
 *     <enumeration value="Origin"/>
 *     <enumeration value="Destination"/>
 *     <enumeration value="DateCombination"/>
 *     <enumeration value="FirstODDate"/>
 *     <enumeration value="SecondODDate"/>
 *     <enumeration value="FirstOD"/>
 *     <enumeration value="SecondOD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeDiversity")
@XmlEnum
public enum TypeDiversity {

    @XmlEnumValue("Blend")
    BLEND("Blend"),
    @XmlEnumValue("Airports")
    AIRPORTS("Airports"),
    @XmlEnumValue("Carrier")
    CARRIER("Carrier"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("DateCombination")
    DATE_COMBINATION("DateCombination"),
    @XmlEnumValue("FirstODDate")
    FIRST_OD_DATE("FirstODDate"),
    @XmlEnumValue("SecondODDate")
    SECOND_OD_DATE("SecondODDate"),
    @XmlEnumValue("FirstOD")
    FIRST_OD("FirstOD"),
    @XmlEnumValue("SecondOD")
    SECOND_OD("SecondOD");
    private final String value;

    TypeDiversity(String v) {
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
    public static TypeDiversity fromValue(String v) {
        for (TypeDiversity c: TypeDiversity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
