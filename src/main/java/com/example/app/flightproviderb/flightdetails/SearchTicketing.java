
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
 *       <attribute name="TicketStatus" default="Both">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Ticketed"/>
 *             <enumeration value="Unticketed"/>
 *             <enumeration value="Both"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ReservationStatus" default="Both">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="OnHold"/>
 *             <enumeration value="SetForTicketing"/>
 *             <enumeration value="Both"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TicketDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchTicketing", namespace = "http://www.travelport.com/schema/common_v54_0")
public class SearchTicketing {

    /**
     * Return only PNRs with ticketed, non-ticketed or both
     * 
     */
    @XmlAttribute(name = "TicketStatus")
    protected String ticketStatus;
    /**
     * Used only if "TicketStatus" set to "No" or "Both". Return only PNRs with specific reservation status or both statuses.
     * 
     */
    @XmlAttribute(name = "ReservationStatus")
    protected String reservationStatus;
    /**
     * Identifies when this reservation was ticketed, or when it should be ticketed by (in the event of a TTL)
     * 
     */
    @XmlAttribute(name = "TicketDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketDate;

    /**
     * Return only PNRs with ticketed, non-ticketed or both
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        if (ticketStatus == null) {
            return "Both";
        } else {
            return ticketStatus;
        }
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketStatus()
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * Used only if "TicketStatus" set to "No" or "Both". Return only PNRs with specific reservation status or both statuses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        if (reservationStatus == null) {
            return "Both";
        } else {
            return reservationStatus;
        }
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReservationStatus()
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }

    /**
     * Identifies when this reservation was ticketed, or when it should be ticketed by (in the event of a TTL)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketDate() {
        return ticketDate;
    }

    /**
     * Sets the value of the ticketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTicketDate()
     */
    public void setTicketDate(XMLGregorianCalendar value) {
        this.ticketDate = value;
    }

}
