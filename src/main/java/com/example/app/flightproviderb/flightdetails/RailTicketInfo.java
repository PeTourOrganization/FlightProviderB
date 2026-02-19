
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailJourneyRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}TicketAdvisory" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Number" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="19"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="IssueLocation">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TicketStatus" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to255" />
 *       <attribute name="TicketFormType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TrafficType" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to255" />
 *       <attribute name="IssuedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="TicketType" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to255" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railJourneyRef",
    "ticketAdvisory"
})
@XmlRootElement(name = "RailTicketInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailTicketInfo {

    /**
     * Reference to a RailJourney
     * 
     */
    @XmlElement(name = "RailJourneyRef", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailJourneyRef> railJourneyRef;
    /**
     * Additional ticket information.
     * 
     */
    @XmlElement(name = "TicketAdvisory", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<TicketAdvisory> ticketAdvisory;
    /**
     * Ticket number.
     * 
     */
    @XmlAttribute(name = "Number", required = true)
    protected String number;
    /**
     * Issue location is internal distributor code associated with the PCC.
     * 
     */
    @XmlAttribute(name = "IssueLocation")
    protected String issueLocation;
    /**
     * Status of Ticket.
     * 
     */
    @XmlAttribute(name = "TicketStatus")
    protected String ticketStatus;
    /**
     * FormType of Ticket.
     * 
     */
    @XmlAttribute(name = "TicketFormType")
    protected String ticketFormType;
    /**
     * Type of traffic.
     * 
     */
    @XmlAttribute(name = "TrafficType")
    protected String trafficType;
    /**
     * Ticket issue date.
     * 
     */
    @XmlAttribute(name = "IssuedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issuedDate;
    /**
     * Type of ticket. Paper, eTicket etc.
     * 
     */
    @XmlAttribute(name = "TicketType")
    protected String ticketType;
    /**
     * Reference to a BookingTraveler.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Reference to a RailJourney
     * 
     * Gets the value of the railJourneyRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railJourneyRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailJourneyRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the railJourneyRef property.
     */
    public List<RailJourneyRef> getRailJourneyRef() {
        if (railJourneyRef == null) {
            railJourneyRef = new ArrayList<>();
        }
        return this.railJourneyRef;
    }

    /**
     * Additional ticket information.
     * 
     * Gets the value of the ticketAdvisory property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketAdvisory property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketAdvisory }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketAdvisory property.
     */
    public List<TicketAdvisory> getTicketAdvisory() {
        if (ticketAdvisory == null) {
            ticketAdvisory = new ArrayList<>();
        }
        return this.ticketAdvisory;
    }

    /**
     * Ticket number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Issue location is internal distributor code associated with the PCC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueLocation() {
        return issueLocation;
    }

    /**
     * Sets the value of the issueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssueLocation()
     */
    public void setIssueLocation(String value) {
        this.issueLocation = value;
    }

    /**
     * Status of Ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
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
     * FormType of Ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketFormType() {
        return ticketFormType;
    }

    /**
     * Sets the value of the ticketFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketFormType()
     */
    public void setTicketFormType(String value) {
        this.ticketFormType = value;
    }

    /**
     * Type of traffic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * Sets the value of the trafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrafficType()
     */
    public void setTrafficType(String value) {
        this.trafficType = value;
    }

    /**
     * Ticket issue date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getIssuedDate()
     */
    public void setIssuedDate(XMLGregorianCalendar value) {
        this.issuedDate = value;
    }

    /**
     * Type of ticket. Paper, eTicket etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketType()
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Reference to a BookingTraveler.
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
