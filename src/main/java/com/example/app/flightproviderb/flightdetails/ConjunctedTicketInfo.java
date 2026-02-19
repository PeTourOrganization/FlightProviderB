
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
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ConjunctedTicketInfo")
public class ConjunctedTicketInfo {

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

}
