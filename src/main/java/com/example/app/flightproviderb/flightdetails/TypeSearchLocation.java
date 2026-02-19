
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeSearchLocation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeSearchLocation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}Airport" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}City" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}CityOrAirport" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}CoordinateLocation" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}RailLocation" minOccurs="0"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Distance" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSearchLocation", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "airport",
    "city",
    "cityOrAirport",
    "coordinateLocation",
    "railLocation",
    "distance"
})
public class TypeSearchLocation {

    /**
     * Airport identifier
     * 
     */
    @XmlElement(name = "Airport")
    protected Airport airport;
    /**
     * City identifier
     * 
     */
    @XmlElement(name = "City")
    protected City city;
    /**
     * This element can be used when it is not known whether the value is an airport or a city code.
     * 
     */
    @XmlElement(name = "CityOrAirport")
    protected CityOrAirport cityOrAirport;
    /**
     * Specific lat/long location, usually associated with a Distance
     * 
     */
    @XmlElement(name = "CoordinateLocation")
    protected CoordinateLocation coordinateLocation;
    /**
     * RCH specific location code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     */
    @XmlElement(name = "RailLocation")
    protected RailLocation railLocation;
    /**
     * Container to encapsulate the a distance value with its unit of measure.
     * 
     */
    @XmlElement(name = "Distance")
    protected Distance distance;

    /**
     * Airport identifier
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     * @see #getAirport()
     */
    public void setAirport(Airport value) {
        this.airport = value;
    }

    /**
     * City identifier
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     * @see #getCity()
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * This element can be used when it is not known whether the value is an airport or a city code.
     * 
     * @return
     *     possible object is
     *     {@link CityOrAirport }
     *     
     */
    public CityOrAirport getCityOrAirport() {
        return cityOrAirport;
    }

    /**
     * Sets the value of the cityOrAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityOrAirport }
     *     
     * @see #getCityOrAirport()
     */
    public void setCityOrAirport(CityOrAirport value) {
        this.cityOrAirport = value;
    }

    /**
     * Specific lat/long location, usually associated with a Distance
     * 
     * @return
     *     possible object is
     *     {@link CoordinateLocation }
     *     
     */
    public CoordinateLocation getCoordinateLocation() {
        return coordinateLocation;
    }

    /**
     * Sets the value of the coordinateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateLocation }
     *     
     * @see #getCoordinateLocation()
     */
    public void setCoordinateLocation(CoordinateLocation value) {
        this.coordinateLocation = value;
    }

    /**
     * RCH specific location code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     * @return
     *     possible object is
     *     {@link RailLocation }
     *     
     */
    public RailLocation getRailLocation() {
        return railLocation;
    }

    /**
     * Sets the value of the railLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLocation }
     *     
     * @see #getRailLocation()
     */
    public void setRailLocation(RailLocation value) {
        this.railLocation = value;
    }

    /**
     * Container to encapsulate the a distance value with its unit of measure.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     * @see #getDistance()
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

}
