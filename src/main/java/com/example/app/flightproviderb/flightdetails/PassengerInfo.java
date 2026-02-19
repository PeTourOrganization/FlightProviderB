
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Name" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassengerType" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name"
})
@XmlRootElement(name = "PassengerInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PassengerInfo {

    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Name name;
    /**
     * A reference to a passenger related to a ticket.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    /**
     * Passenger Type Code.
     * 
     */
    @XmlAttribute(name = "PassengerType")
    protected String passengerType;

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
     * A reference to a passenger related to a ticket.
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
     * Passenger Type Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassengerType()
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

}
