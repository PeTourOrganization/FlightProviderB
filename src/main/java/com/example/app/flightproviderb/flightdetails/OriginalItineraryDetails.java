
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *       <attribute name="ItineraryType" type="{http://www.travelport.com/schema/common_v54_0}typeItineraryCode" />
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="TicketingPCC" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="TicketingIATA" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *       <attribute name="TicketingCountry" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *       <attribute name="TourCode" type="{http://www.travelport.com/schema/air_v54_0}typeTourCode" />
 *       <attribute name="TicketingDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OriginalItineraryDetails")
public class OriginalItineraryDetails {

    /**
     * Values allowed are International or Domestic. This tells if the itinerary is international or domestic.
     * 
     */
    @XmlAttribute(name = "ItineraryType")
    protected TypeItineraryCode itineraryType;
    /**
     * Set to true and the itinerary is/will be a bulk ticket. 
     *                                         Set to false and the itinerary being repriced will not be a bulk ticket. 
     *                                         Default is false.
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * This is the PCC or SID where the ticket was issued
     * 
     */
    @XmlAttribute(name = "TicketingPCC")
    protected String ticketingPCC;
    /**
     * This is the IATA where the ticket was issued.
     * 
     */
    @XmlAttribute(name = "TicketingIATA")
    protected String ticketingIATA;
    /**
     * This is the country where the ticket was issued.
     * 
     */
    @XmlAttribute(name = "TicketingCountry")
    protected String ticketingCountry;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    /**
     * The date the repriced itinerary was ticketed
     * 
     */
    @XmlAttribute(name = "TicketingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketingDate;

    /**
     * Values allowed are International or Domestic. This tells if the itinerary is international or domestic.
     * 
     * @return
     *     possible object is
     *     {@link TypeItineraryCode }
     *     
     */
    public TypeItineraryCode getItineraryType() {
        return itineraryType;
    }

    /**
     * Sets the value of the itineraryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItineraryCode }
     *     
     * @see #getItineraryType()
     */
    public void setItineraryType(TypeItineraryCode value) {
        this.itineraryType = value;
    }

    /**
     * Set to true and the itinerary is/will be a bulk ticket. 
     *                                         Set to false and the itinerary being repriced will not be a bulk ticket. 
     *                                         Default is false.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBulkTicket()
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * This is the PCC or SID where the ticket was issued
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingPCC() {
        return ticketingPCC;
    }

    /**
     * Sets the value of the ticketingPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketingPCC()
     */
    public void setTicketingPCC(String value) {
        this.ticketingPCC = value;
    }

    /**
     * This is the IATA where the ticket was issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingIATA() {
        return ticketingIATA;
    }

    /**
     * Sets the value of the ticketingIATA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketingIATA()
     */
    public void setTicketingIATA(String value) {
        this.ticketingIATA = value;
    }

    /**
     * This is the country where the ticket was issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingCountry() {
        return ticketingCountry;
    }

    /**
     * Sets the value of the ticketingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketingCountry()
     */
    public void setTicketingCountry(String value) {
        this.ticketingCountry = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * The date the repriced itinerary was ticketed
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketingDate() {
        return ticketingDate;
    }

    /**
     * Sets the value of the ticketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTicketingDate()
     */
    public void setTicketingDate(XMLGregorianCalendar value) {
        this.ticketingDate = value;
    }

}
