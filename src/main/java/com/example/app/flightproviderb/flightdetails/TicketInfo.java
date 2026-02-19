
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Name"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ConjunctedTicketInfo" maxOccurs="3" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExchangedTicketInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="IATANumber" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *       <attribute name="TicketIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="TicketingAgentSignOn">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="9"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *       <attribute name="Status" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeTicketStatus" />
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AirPricingInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "conjunctedTicketInfo",
    "exchangedTicketInfo"
})
@XmlRootElement(name = "TicketInfo")
public class TicketInfo {

    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected Name name;
    @XmlElement(name = "ConjunctedTicketInfo")
    protected List<ConjunctedTicketInfo> conjunctedTicketInfo;
    /**
     * Contains Exchanged/Reissued Ticket Information
     * 
     */
    @XmlElement(name = "ExchangedTicketInfo")
    protected List<ExchangedTicketInfo> exchangedTicketInfo;
    @XmlAttribute(name = "Number", required = true)
    protected String number;
    @XmlAttribute(name = "IATANumber")
    protected String iataNumber;
    @XmlAttribute(name = "TicketIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketIssueDate;
    @XmlAttribute(name = "TicketingAgentSignOn")
    protected String ticketingAgentSignOn;
    /**
     * Contains Ticketed PCC’s Country code.
     * 
     */
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "Status", required = true)
    protected TypeTicketStatus status;
    /**
     * Whether the ticket was issued as bulk.
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * A reference to a passenger.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;
    /**
     * A reference to a AirPricing.Applicable Providers 1G and 1V.
     * 
     */
    @XmlAttribute(name = "AirPricingInfoRef")
    protected String airPricingInfoRef;

    /**
     * Complete name fields
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     * @see #getName()
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the conjunctedTicketInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conjunctedTicketInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConjunctedTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConjunctedTicketInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the conjunctedTicketInfo property.
     */
    public List<ConjunctedTicketInfo> getConjunctedTicketInfo() {
        if (conjunctedTicketInfo == null) {
            conjunctedTicketInfo = new ArrayList<>();
        }
        return this.conjunctedTicketInfo;
    }

    /**
     * Contains Exchanged/Reissued Ticket Information
     * 
     * Gets the value of the exchangedTicketInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangedTicketInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExchangedTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangedTicketInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the exchangedTicketInfo property.
     */
    public List<ExchangedTicketInfo> getExchangedTicketInfo() {
        if (exchangedTicketInfo == null) {
            exchangedTicketInfo = new ArrayList<>();
        }
        return this.exchangedTicketInfo;
    }

    /**
     * Gets the value of the number property.
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
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the ticketIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketIssueDate() {
        return ticketIssueDate;
    }

    /**
     * Sets the value of the ticketIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketIssueDate(XMLGregorianCalendar value) {
        this.ticketIssueDate = value;
    }

    /**
     * Gets the value of the ticketingAgentSignOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingAgentSignOn() {
        return ticketingAgentSignOn;
    }

    /**
     * Sets the value of the ticketingAgentSignOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingAgentSignOn(String value) {
        this.ticketingAgentSignOn = value;
    }

    /**
     * Contains Ticketed PCC’s Country code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryCode()
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketStatus }
     *     
     */
    public TypeTicketStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketStatus }
     *     
     */
    public void setStatus(TypeTicketStatus value) {
        this.status = value;
    }

    /**
     * Whether the ticket was issued as bulk.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkTicket() {
        return bulkTicket;
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
     * A reference to a passenger.
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

    /**
     * A reference to a AirPricing.Applicable Providers 1G and 1V.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPricingInfoRef() {
        return airPricingInfoRef;
    }

    /**
     * Sets the value of the airPricingInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirPricingInfoRef()
     */
    public void setAirPricingInfoRef(String value) {
        this.airPricingInfoRef = value;
    }

}
