
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BackOfficeHandOff" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Itinerary" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="IssueTicketOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="IssueElectronicTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="FaxIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "backOfficeHandOff",
    "itinerary"
})
@XmlRootElement(name = "DocumentSelect")
public class DocumentSelect {

    /**
     * Allows an agency to select the back office
     *                 documents and also route to different host to produce for the
     *                 itinerary.
     * 
     */
    @XmlElement(name = "BackOfficeHandOff")
    protected BackOfficeHandOff backOfficeHandOff;
    /**
     * Allows an agency to select the itinenary
     *                 option for ticket.
     * 
     */
    @XmlElement(name = "Itinerary")
    protected Itinerary itinerary;
    /**
     * Set to true to alter system default of
     *                         itinerary,ticket and back office.
     * 
     */
    @XmlAttribute(name = "IssueTicketOnly")
    protected Boolean issueTicketOnly;
    /**
     * Set to true for electronic tickets.
     * 
     */
    @XmlAttribute(name = "IssueElectronicTicket")
    protected Boolean issueElectronicTicket;
    /**
     * Set to true for providing fax details.
     * 
     */
    @XmlAttribute(name = "FaxIndicator")
    protected Boolean faxIndicator;

    /**
     * Allows an agency to select the back office
     *                 documents and also route to different host to produce for the
     *                 itinerary.
     * 
     * @return
     *     possible object is
     *     {@link BackOfficeHandOff }
     *     
     */
    public BackOfficeHandOff getBackOfficeHandOff() {
        return backOfficeHandOff;
    }

    /**
     * Sets the value of the backOfficeHandOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackOfficeHandOff }
     *     
     * @see #getBackOfficeHandOff()
     */
    public void setBackOfficeHandOff(BackOfficeHandOff value) {
        this.backOfficeHandOff = value;
    }

    /**
     * Allows an agency to select the itinenary
     *                 option for ticket.
     * 
     * @return
     *     possible object is
     *     {@link Itinerary }
     *     
     */
    public Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Itinerary }
     *     
     * @see #getItinerary()
     */
    public void setItinerary(Itinerary value) {
        this.itinerary = value;
    }

    /**
     * Set to true to alter system default of
     *                         itinerary,ticket and back office.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueTicketOnly() {
        return issueTicketOnly;
    }

    /**
     * Sets the value of the issueTicketOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIssueTicketOnly()
     */
    public void setIssueTicketOnly(Boolean value) {
        this.issueTicketOnly = value;
    }

    /**
     * Set to true for electronic tickets.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueElectronicTicket() {
        return issueElectronicTicket;
    }

    /**
     * Sets the value of the issueElectronicTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIssueElectronicTicket()
     */
    public void setIssueElectronicTicket(Boolean value) {
        this.issueElectronicTicket = value;
    }

    /**
     * Set to true for providing fax details.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxIndicator() {
        return faxIndicator;
    }

    /**
     * Sets the value of the faxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFaxIndicator()
     */
    public void setFaxIndicator(Boolean value) {
        this.faxIndicator = value;
    }

}
