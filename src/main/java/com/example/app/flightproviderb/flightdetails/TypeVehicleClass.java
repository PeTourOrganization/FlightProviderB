
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The class of vehicle
 * 
 * <p>Java class for typeVehicleClass</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeVehicleClass">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Mini"/>
 *     <enumeration value="Economy"/>
 *     <enumeration value="Compact"/>
 *     <enumeration value="Intermediate"/>
 *     <enumeration value="Standard"/>
 *     <enumeration value="Fullsize"/>
 *     <enumeration value="Luxury"/>
 *     <enumeration value="Premium"/>
 *     <enumeration value="Special"/>
 *     <enumeration value="MiniElite"/>
 *     <enumeration value="EconomyElite"/>
 *     <enumeration value="CompactElite"/>
 *     <enumeration value="IntermediateElite"/>
 *     <enumeration value="StandardElite"/>
 *     <enumeration value="FullsizeElite"/>
 *     <enumeration value="PremiumElite"/>
 *     <enumeration value="LuxuryElite"/>
 *     <enumeration value="Oversize"/>
 *     <enumeration value="Subcompact"/>
 *     <enumeration value="Minivan"/>
 *     <enumeration value="TwelvePassengerVan"/>
 *     <enumeration value="MovingVan"/>
 *     <enumeration value="FifteenPassengerVan"/>
 *     <enumeration value="CargoVan"/>
 *     <enumeration value="TwelveFootTruck"/>
 *     <enumeration value="TwentyFootTruck"/>
 *     <enumeration value="TwentyfourFootTruck"/>
 *     <enumeration value="TwentysixFootTruck"/>
 *     <enumeration value="Moped"/>
 *     <enumeration value="Stretch"/>
 *     <enumeration value="Regular"/>
 *     <enumeration value="Unique"/>
 *     <enumeration value="Exotic"/>
 *     <enumeration value="SmallOrMediumTruck"/>
 *     <enumeration value="LargeTruck"/>
 *     <enumeration value="SmallSUV"/>
 *     <enumeration value="MediumSUV"/>
 *     <enumeration value="LargeSUV"/>
 *     <enumeration value="ExoticSUV"/>
 *     <enumeration value="FourWheelDrive"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeVehicleClass", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeVehicleClass {

    @XmlEnumValue("Mini")
    MINI("Mini"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("Compact")
    COMPACT("Compact"),
    @XmlEnumValue("Intermediate")
    INTERMEDIATE("Intermediate"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Fullsize")
    FULLSIZE("Fullsize"),
    @XmlEnumValue("Luxury")
    LUXURY("Luxury"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("MiniElite")
    MINI_ELITE("MiniElite"),
    @XmlEnumValue("EconomyElite")
    ECONOMY_ELITE("EconomyElite"),
    @XmlEnumValue("CompactElite")
    COMPACT_ELITE("CompactElite"),
    @XmlEnumValue("IntermediateElite")
    INTERMEDIATE_ELITE("IntermediateElite"),
    @XmlEnumValue("StandardElite")
    STANDARD_ELITE("StandardElite"),
    @XmlEnumValue("FullsizeElite")
    FULLSIZE_ELITE("FullsizeElite"),
    @XmlEnumValue("PremiumElite")
    PREMIUM_ELITE("PremiumElite"),
    @XmlEnumValue("LuxuryElite")
    LUXURY_ELITE("LuxuryElite"),
    @XmlEnumValue("Oversize")
    OVERSIZE("Oversize"),
    @XmlEnumValue("Subcompact")
    SUBCOMPACT("Subcompact"),
    @XmlEnumValue("Minivan")
    MINIVAN("Minivan"),
    @XmlEnumValue("TwelvePassengerVan")
    TWELVE_PASSENGER_VAN("TwelvePassengerVan"),
    @XmlEnumValue("MovingVan")
    MOVING_VAN("MovingVan"),
    @XmlEnumValue("FifteenPassengerVan")
    FIFTEEN_PASSENGER_VAN("FifteenPassengerVan"),
    @XmlEnumValue("CargoVan")
    CARGO_VAN("CargoVan"),
    @XmlEnumValue("TwelveFootTruck")
    TWELVE_FOOT_TRUCK("TwelveFootTruck"),
    @XmlEnumValue("TwentyFootTruck")
    TWENTY_FOOT_TRUCK("TwentyFootTruck"),
    @XmlEnumValue("TwentyfourFootTruck")
    TWENTYFOUR_FOOT_TRUCK("TwentyfourFootTruck"),
    @XmlEnumValue("TwentysixFootTruck")
    TWENTYSIX_FOOT_TRUCK("TwentysixFootTruck"),
    @XmlEnumValue("Moped")
    MOPED("Moped"),
    @XmlEnumValue("Stretch")
    STRETCH("Stretch"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Unique")
    UNIQUE("Unique"),
    @XmlEnumValue("Exotic")
    EXOTIC("Exotic"),
    @XmlEnumValue("SmallOrMediumTruck")
    SMALL_OR_MEDIUM_TRUCK("SmallOrMediumTruck"),
    @XmlEnumValue("LargeTruck")
    LARGE_TRUCK("LargeTruck"),
    @XmlEnumValue("SmallSUV")
    SMALL_SUV("SmallSUV"),
    @XmlEnumValue("MediumSUV")
    MEDIUM_SUV("MediumSUV"),
    @XmlEnumValue("LargeSUV")
    LARGE_SUV("LargeSUV"),
    @XmlEnumValue("ExoticSUV")
    EXOTIC_SUV("ExoticSUV"),
    @XmlEnumValue("FourWheelDrive")
    FOUR_WHEEL_DRIVE("FourWheelDrive");
    private final String value;

    TypeVehicleClass(String v) {
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
    public static TypeVehicleClass fromValue(String v) {
        for (TypeVehicleClass c: TypeVehicleClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
