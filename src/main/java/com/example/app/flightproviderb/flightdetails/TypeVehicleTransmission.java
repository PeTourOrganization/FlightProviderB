
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeVehicleTransmission</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeVehicleTransmission">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Automatic"/>
 *     <enumeration value="Automatic4WD"/>
 *     <enumeration value="AutomaticAWD"/>
 *     <enumeration value="Manual"/>
 *     <enumeration value="Manual4WD"/>
 *     <enumeration value="ManualAWD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeVehicleTransmission", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeVehicleTransmission {

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),
    @XmlEnumValue("Automatic4WD")
    AUTOMATIC_4_WD("Automatic4WD"),
    @XmlEnumValue("AutomaticAWD")
    AUTOMATIC_AWD("AutomaticAWD"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Manual4WD")
    MANUAL_4_WD("Manual4WD"),
    @XmlEnumValue("ManualAWD")
    MANUAL_AWD("ManualAWD");
    private final String value;

    TypeVehicleTransmission(String v) {
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
    public static TypeVehicleTransmission fromValue(String v) {
        for (TypeVehicleTransmission c: TypeVehicleTransmission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
