
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
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="OriginAirport" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="DestinationAirport" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LegDetail")
public class LegDetail {

    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * Returns the origin airport code for the
     *                         Leg Detail.
     * 
     */
    @XmlAttribute(name = "OriginAirport", required = true)
    protected String originAirport;
    /**
     * Returns the destination airport code for
     *                         the Leg Detail.
     * 
     */
    @XmlAttribute(name = "DestinationAirport", required = true)
    protected String destinationAirport;
    /**
     * Carrier for the Search Leg Detail.
     * 
     */
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    /**
     * The Departure date and time for this Leg
     *                         Detail.
     * 
     */
    @XmlAttribute(name = "TravelDate")
    protected String travelDate;
    /**
     * Flight Number for the Search Leg Detail.
     * 
     */
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Returns the origin airport code for the
     *                         Leg Detail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirport() {
        return originAirport;
    }

    /**
     * Sets the value of the originAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginAirport()
     */
    public void setOriginAirport(String value) {
        this.originAirport = value;
    }

    /**
     * Returns the destination airport code for
     *                         the Leg Detail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestinationAirport()
     */
    public void setDestinationAirport(String value) {
        this.destinationAirport = value;
    }

    /**
     * Carrier for the Search Leg Detail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * The Departure date and time for this Leg
     *                         Detail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelDate()
     */
    public void setTravelDate(String value) {
        this.travelDate = value;
    }

    /**
     * Flight Number for the Search Leg Detail.
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

}
