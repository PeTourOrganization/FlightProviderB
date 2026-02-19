
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for typeFuel</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFuel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Petrol"/>
 *     <enumeration value="Diesel"/>
 *     <enumeration value="Hybrid"/>
 *     <enumeration value="Electric"/>
 *     <enumeration value="LPGCNG"/>
 *     <enumeration value="Hydrogen"/>
 *     <enumeration value="MultiFuel"/>
 *     <enumeration value="Ethanol"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFuel", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeFuel {

    @XmlEnumValue("Petrol")
    PETROL("Petrol"),
    @XmlEnumValue("Diesel")
    DIESEL("Diesel"),
    @XmlEnumValue("Hybrid")
    HYBRID("Hybrid"),
    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    LPGCNG("LPGCNG"),
    @XmlEnumValue("Hydrogen")
    HYDROGEN("Hydrogen"),
    @XmlEnumValue("MultiFuel")
    MULTI_FUEL("MultiFuel"),
    @XmlEnumValue("Ethanol")
    ETHANOL("Ethanol");
    private final String value;

    TypeFuel(String v) {
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
    public static TypeFuel fromValue(String v) {
        for (TypeFuel c: TypeFuel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
