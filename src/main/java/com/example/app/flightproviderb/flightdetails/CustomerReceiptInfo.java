
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
 *       <attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="EmailRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CustomerReceiptInfo")
public class CustomerReceiptInfo {

    /**
     * Refererence of the Booking Traveler related to the email.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;
    /**
     * Reference to the email address used for receipt of EMD.
     * 
     */
    @XmlAttribute(name = "EmailRef", required = true)
    protected String emailRef;

    /**
     * Refererence of the Booking Traveler related to the email.
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
     * Reference to the email address used for receipt of EMD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailRef() {
        return emailRef;
    }

    /**
     * Sets the value of the emailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEmailRef()
     */
    public void setEmailRef(String value) {
        this.emailRef = value;
    }

}
