
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentRef"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketValidity" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageAllowance" minOccurs="0"/>
 *         <element name="TicketDesignator" type="{http://www.travelport.com/schema/air_v54_0}typeTicketDesignator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegmentRef",
    "ticketValidity",
    "baggageAllowance",
    "ticketDesignator"
})
@XmlRootElement(name = "SegmentModifiers")
public class SegmentModifiers {

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     */
    @XmlElement(name = "AirSegmentRef", required = true)
    protected AirSegmentRef airSegmentRef;
    /**
     * To be used to pass the ticket validity dates
     * 
     */
    @XmlElement(name = "TicketValidity")
    protected TicketValidity ticketValidity;
    /**
     * Free Baggage Allowance
     * 
     */
    @XmlElement(name = "BaggageAllowance")
    protected BaggageAllowance baggageAllowance;
    @XmlElement(name = "TicketDesignator")
    protected String ticketDesignator;

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentRef }
     *     
     */
    public AirSegmentRef getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentRef }
     *     
     * @see #getAirSegmentRef()
     */
    public void setAirSegmentRef(AirSegmentRef value) {
        this.airSegmentRef = value;
    }

    /**
     * To be used to pass the ticket validity dates
     * 
     * @return
     *     possible object is
     *     {@link TicketValidity }
     *     
     */
    public TicketValidity getTicketValidity() {
        return ticketValidity;
    }

    /**
     * Sets the value of the ticketValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketValidity }
     *     
     * @see #getTicketValidity()
     */
    public void setTicketValidity(TicketValidity value) {
        this.ticketValidity = value;
    }

    /**
     * Free Baggage Allowance
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowance }
     *     
     */
    public BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowance }
     *     
     * @see #getBaggageAllowance()
     */
    public void setBaggageAllowance(BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
    }

}
