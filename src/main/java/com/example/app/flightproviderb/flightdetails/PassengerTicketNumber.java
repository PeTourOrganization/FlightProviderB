
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
 *       <attribute name="TicketNumber" type="{http://www.travelport.com/schema/air_v54_0}typePassengerTicketNumber" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PassengerTicketNumber")
public class PassengerTicketNumber {

    /**
     * The identifying number for a Ticket for a
     *                         passenger.
     * 
     */
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    /**
     * Reference to a passenger associated with
     *                         a ticket.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * The identifying number for a Ticket for a
     *                         passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketNumber()
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Reference to a passenger associated with
     *                         a ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
