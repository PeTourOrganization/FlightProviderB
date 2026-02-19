
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Will be optionally returned as part if one or
 *                 all ticketing requests fail.
 * 
 * <p>Java class for typeTicketFailureInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTicketFailureInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber"/>
 *             <element ref="{http://www.travelport.com/schema/common_v54_0}Name"/>
 *           </sequence>
 *           <element name="TCRNumber" type="{http://www.travelport.com/schema/air_v54_0}typeTCRNumber"/>
 *         </choice>
 *         <element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTicketFailureInfo", propOrder = {
    "ticketNumber",
    "name",
    "tcrNumber",
    "bookingTravelerRef"
})
public class TypeTicketFailureInfo {

    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String ticketNumber;
    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Name name;
    /**
     * The identifying number for a Ticketless Air
     *                             Reservation.
     * 
     */
    @XmlElement(name = "TCRNumber")
    protected String tcrNumber;
    @XmlElement(name = "BookingTravelerRef", required = true)
    protected List<String> bookingTravelerRef;
    @XmlAttribute(name = "Code", required = true)
    protected BigInteger code;
    @XmlAttribute(name = "Message")
    protected String message;

    /**
     * The identifying number for the actual ticket
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
     * The identifying number for a Ticketless Air
     *                             Reservation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRNumber() {
        return tcrNumber;
    }

    /**
     * Sets the value of the tcrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTCRNumber()
     */
    public void setTCRNumber(String value) {
        this.tcrNumber = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerRef property.
     */
    public List<String> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
