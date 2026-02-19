
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The category of vehicle
 * 
 * <p>Java class for typeVehicleCategory</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeVehicleCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Car"/>
 *     <enumeration value="Van"/>
 *     <enumeration value="SUV"/>
 *     <enumeration value="Convertible"/>
 *     <enumeration value="Truck"/>
 *     <enumeration value="StationWagon"/>
 *     <enumeration value="Pickup"/>
 *     <enumeration value="AllTerrain"/>
 *     <enumeration value="Recreational"/>
 *     <enumeration value="Sport"/>
 *     <enumeration value="Special"/>
 *     <enumeration value="ExtendedCabPickup"/>
 *     <enumeration value="RegularCabPickup"/>
 *     <enumeration value="SpecialOffer"/>
 *     <enumeration value="Coupe"/>
 *     <enumeration value="Monospace"/>
 *     <enumeration value="Roadster"/>
 *     <enumeration value="Crossover"/>
 *     <enumeration value="Motorcycle"/>
 *     <enumeration value="Limo"/>
 *     <enumeration value="Motorhome"/>
 *     <enumeration value="TwoWheelVehicle"/>
 *     <enumeration value="CommercialVanOrTruck"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeVehicleCategory", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeVehicleCategory {

    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Van")
    VAN("Van"),
    SUV("SUV"),
    @XmlEnumValue("Convertible")
    CONVERTIBLE("Convertible"),
    @XmlEnumValue("Truck")
    TRUCK("Truck"),
    @XmlEnumValue("StationWagon")
    STATION_WAGON("StationWagon"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("AllTerrain")
    ALL_TERRAIN("AllTerrain"),
    @XmlEnumValue("Recreational")
    RECREATIONAL("Recreational"),
    @XmlEnumValue("Sport")
    SPORT("Sport"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("ExtendedCabPickup")
    EXTENDED_CAB_PICKUP("ExtendedCabPickup"),
    @XmlEnumValue("RegularCabPickup")
    REGULAR_CAB_PICKUP("RegularCabPickup"),
    @XmlEnumValue("SpecialOffer")
    SPECIAL_OFFER("SpecialOffer"),
    @XmlEnumValue("Coupe")
    COUPE("Coupe"),
    @XmlEnumValue("Monospace")
    MONOSPACE("Monospace"),
    @XmlEnumValue("Roadster")
    ROADSTER("Roadster"),
    @XmlEnumValue("Crossover")
    CROSSOVER("Crossover"),
    @XmlEnumValue("Motorcycle")
    MOTORCYCLE("Motorcycle"),
    @XmlEnumValue("Limo")
    LIMO("Limo"),
    @XmlEnumValue("Motorhome")
    MOTORHOME("Motorhome"),
    @XmlEnumValue("TwoWheelVehicle")
    TWO_WHEEL_VEHICLE("TwoWheelVehicle"),
    @XmlEnumValue("CommercialVanOrTruck")
    COMMERCIAL_VAN_OR_TRUCK("CommercialVanOrTruck");
    private final String value;

    TypeVehicleCategory(String v) {
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
    public static TypeVehicleCategory fromValue(String v) {
        for (TypeVehicleCategory c: TypeVehicleCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
