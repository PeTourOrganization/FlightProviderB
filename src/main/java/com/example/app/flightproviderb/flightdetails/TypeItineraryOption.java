
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeItineraryOption</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeItineraryOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NoFare"/>
 *     <enumeration value="NoAmount"/>
 *     <enumeration value="SequenceNumber"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeItineraryOption")
@XmlEnum
public enum TypeItineraryOption {

    @XmlEnumValue("NoFare")
    NO_FARE("NoFare"),
    @XmlEnumValue("NoAmount")
    NO_AMOUNT("NoAmount"),
    @XmlEnumValue("SequenceNumber")
    SEQUENCE_NUMBER("SequenceNumber");
    private final String value;

    TypeItineraryOption(String v) {
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
    public static TypeItineraryOption fromValue(String v) {
        for (TypeItineraryOption c: TypeItineraryOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
