
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The type of location requested, such as resort, city center.
 * 
 * <p>Java class for typeVehicleLocation</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeVehicleLocation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Terminal"/>
 *     <enumeration value="ShuttleOnAirport"/>
 *     <enumeration value="ShuttleOffAirport"/>
 *     <enumeration value="RailwayStation"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="CarDealer"/>
 *     <enumeration value="CityCenterDowntown"/>
 *     <enumeration value="EastOfCityCenter"/>
 *     <enumeration value="SouthOfCityCenter"/>
 *     <enumeration value="WestOfCityCenter"/>
 *     <enumeration value="NorthOfCityCenter"/>
 *     <enumeration value="PortOrFerry"/>
 *     <enumeration value="NearResort"/>
 *     <enumeration value="Airport"/>
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Military"/>
 *     <enumeration value="FixedBaseOperations"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeVehicleLocation", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeVehicleLocation {

    @XmlEnumValue("Terminal")
    TERMINAL("Terminal"),
    @XmlEnumValue("ShuttleOnAirport")
    SHUTTLE_ON_AIRPORT("ShuttleOnAirport"),
    @XmlEnumValue("ShuttleOffAirport")
    SHUTTLE_OFF_AIRPORT("ShuttleOffAirport"),
    @XmlEnumValue("RailwayStation")
    RAILWAY_STATION("RailwayStation"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("CarDealer")
    CAR_DEALER("CarDealer"),
    @XmlEnumValue("CityCenterDowntown")
    CITY_CENTER_DOWNTOWN("CityCenterDowntown"),
    @XmlEnumValue("EastOfCityCenter")
    EAST_OF_CITY_CENTER("EastOfCityCenter"),
    @XmlEnumValue("SouthOfCityCenter")
    SOUTH_OF_CITY_CENTER("SouthOfCityCenter"),
    @XmlEnumValue("WestOfCityCenter")
    WEST_OF_CITY_CENTER("WestOfCityCenter"),
    @XmlEnumValue("NorthOfCityCenter")
    NORTH_OF_CITY_CENTER("NorthOfCityCenter"),
    @XmlEnumValue("PortOrFerry")
    PORT_OR_FERRY("PortOrFerry"),
    @XmlEnumValue("NearResort")
    NEAR_RESORT("NearResort"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("FixedBaseOperations")
    FIXED_BASE_OPERATIONS("FixedBaseOperations");
    private final String value;

    TypeVehicleLocation(String v) {
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
    public static TypeVehicleLocation fromValue(String v) {
        for (TypeVehicleLocation c: TypeVehicleLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
