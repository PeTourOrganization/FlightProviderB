
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeLocation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeLocation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}Airport" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}City" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}CityOrAirport" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeLocation", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "airport",
    "city",
    "cityOrAirport"
})
public class TypeLocation {

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

}
