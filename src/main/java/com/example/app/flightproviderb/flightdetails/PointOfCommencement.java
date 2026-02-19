
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="CityOrAirportCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PointOfCommencement", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PointOfCommencement {

    /**
     * Three digit Airport or City code that would be the Point of Commencement location for the trips/legs mentioned.
     * 
     */
    @XmlAttribute(name = "CityOrAirportCode", required = true)
    protected String cityOrAirportCode;
    /**
     * Specify a date or date and time
     * 
     */
    @XmlAttribute(name = "Time", required = true)
    protected String time;

    /**
     * Three digit Airport or City code that would be the Point of Commencement location for the trips/legs mentioned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrAirportCode() {
        return cityOrAirportCode;
    }

    /**
     * Sets the value of the cityOrAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCityOrAirportCode()
     */
    public void setCityOrAirportCode(String value) {
        this.cityOrAirportCode = value;
    }

    /**
     * Specify a date or date and time
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTime()
     */
    public void setTime(String value) {
        this.time = value;
    }

}
