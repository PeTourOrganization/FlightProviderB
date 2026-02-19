
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * To support Anchor flight search contain the anchor flight details. Supported providers 1P
 * 
 * <p>Java class for typeAnchorFlightData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeAnchorFlightData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="AirlineCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FlightNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="ConnectionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAnchorFlightData")
public class TypeAnchorFlightData {

    /**
     * Indicates Anchor flight carrier code
     * 
     */
    @XmlAttribute(name = "AirlineCode", required = true)
    protected String airlineCode;
    /**
     * Indicates Anchor flight number
     * 
     */
    @XmlAttribute(name = "FlightNumber", required = true)
    protected String flightNumber;
    /**
     * Indicates that the Anchor flight has any connecting flight or not
     * 
     */
    @XmlAttribute(name = "ConnectionIndicator")
    protected Boolean connectionIndicator;

    /**
     * Indicates Anchor flight carrier code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirlineCode()
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Indicates Anchor flight number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightNumber()
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Indicates that the Anchor flight has any connecting flight or not
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionIndicator() {
        return connectionIndicator;
    }

    /**
     * Sets the value of the connectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isConnectionIndicator()
     */
    public void setConnectionIndicator(Boolean value) {
        this.connectionIndicator = value;
    }

}
