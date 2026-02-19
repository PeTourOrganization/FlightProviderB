
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
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
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
@XmlRootElement(name = "Yield")
public class Yield {

    /**
     * Yield per passenger level in Default
     *                         Currency for this entity.
     * 
     */
    @XmlAttribute(name = "Amount")
    protected String amount;
    /**
     * Reference to a booking traveler for which Yield is applied.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Yield per passenger level in Default
     *                         Currency for this entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAmount()
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Reference to a booking traveler for which Yield is applied.
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
