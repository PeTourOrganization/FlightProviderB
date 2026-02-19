
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration of all Train Transport Modes
 * 
 * <p>Java class for typeTransportMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeTransportMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Bicycle"/>
 *     <enumeration value="Boat"/>
 *     <enumeration value="Bus"/>
 *     <enumeration value="Cable Car"/>
 *     <enumeration value="Car"/>
 *     <enumeration value="Carriage"/>
 *     <enumeration value="Courtesy car"/>
 *     <enumeration value="Helicopter"/>
 *     <enumeration value="Limousine"/>
 *     <enumeration value="Metro"/>
 *     <enumeration value="Monorail"/>
 *     <enumeration value="Motorbike"/>
 *     <enumeration value="Pack Animal"/>
 *     <enumeration value="Plane"/>
 *     <enumeration value="Rental Car"/>
 *     <enumeration value="Rickshaw"/>
 *     <enumeration value="Shuttle"/>
 *     <enumeration value="Subway"/>
 *     <enumeration value="Sedan Chair"/>
 *     <enumeration value="Taxi"/>
 *     <enumeration value="Train"/>
 *     <enumeration value="Trolley"/>
 *     <enumeration value="Tube"/>
 *     <enumeration value="Walk"/>
 *     <enumeration value="Water Taxi"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Car/Rush hour"/>
 *     <enumeration value="Taxi/Rush hour"/>
 *     <enumeration value="No Transportation"/>
 *     <enumeration value="Express Train"/>
 *     <enumeration value="Public"/>
 *     <enumeration value="Ship/Ferry"/>
 *     <enumeration value="Underground"/>
 *     <enumeration value="Tram/light rail"/>
 *     <enumeration value="Shared Taxi"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeTransportMode", namespace = "http://www.travelport.com/schema/rail_v54_0")
@XmlEnum
public enum TypeTransportMode {

    @XmlEnumValue("Bicycle")
    BICYCLE("Bicycle"),
    @XmlEnumValue("Boat")
    BOAT("Boat"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Cable Car")
    CABLE_CAR("Cable Car"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Carriage")
    CARRIAGE("Carriage"),
    @XmlEnumValue("Courtesy car")
    COURTESY_CAR("Courtesy car"),
    @XmlEnumValue("Helicopter")
    HELICOPTER("Helicopter"),
    @XmlEnumValue("Limousine")
    LIMOUSINE("Limousine"),
    @XmlEnumValue("Metro")
    METRO("Metro"),
    @XmlEnumValue("Monorail")
    MONORAIL("Monorail"),
    @XmlEnumValue("Motorbike")
    MOTORBIKE("Motorbike"),
    @XmlEnumValue("Pack Animal")
    PACK_ANIMAL("Pack Animal"),
    @XmlEnumValue("Plane")
    PLANE("Plane"),
    @XmlEnumValue("Rental Car")
    RENTAL_CAR("Rental Car"),
    @XmlEnumValue("Rickshaw")
    RICKSHAW("Rickshaw"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle"),
    @XmlEnumValue("Subway")
    SUBWAY("Subway"),
    @XmlEnumValue("Sedan Chair")
    SEDAN_CHAIR("Sedan Chair"),
    @XmlEnumValue("Taxi")
    TAXI("Taxi"),
    @XmlEnumValue("Train")
    TRAIN("Train"),
    @XmlEnumValue("Trolley")
    TROLLEY("Trolley"),
    @XmlEnumValue("Tube")
    TUBE("Tube"),
    @XmlEnumValue("Walk")
    WALK("Walk"),
    @XmlEnumValue("Water Taxi")
    WATER_TAXI("Water Taxi"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Car/Rush hour")
    CAR_RUSH_HOUR("Car/Rush hour"),
    @XmlEnumValue("Taxi/Rush hour")
    TAXI_RUSH_HOUR("Taxi/Rush hour"),
    @XmlEnumValue("No Transportation")
    NO_TRANSPORTATION("No Transportation"),
    @XmlEnumValue("Express Train")
    EXPRESS_TRAIN("Express Train"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Ship/Ferry")
    SHIP_FERRY("Ship/Ferry"),
    @XmlEnumValue("Underground")
    UNDERGROUND("Underground"),
    @XmlEnumValue("Tram/light rail")
    TRAM_LIGHT_RAIL("Tram/light rail"),
    @XmlEnumValue("Shared Taxi")
    SHARED_TAXI("Shared Taxi");
    private final String value;

    TypeTransportMode(String v) {
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
    public static TypeTransportMode fromValue(String v) {
        for (TypeTransportMode c: TypeTransportMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
