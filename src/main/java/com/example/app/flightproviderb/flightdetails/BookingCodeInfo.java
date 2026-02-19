
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
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BookingCounts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingCodeInfo")
public class BookingCodeInfo {

    /**
     * Specifies Cabin class for a group of
     *                         class of services. Cabin class is not identified if it is not
     *                         present.
     * 
     */
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    /**
     * Lists class of service and their counts for
     *                         specific cabin class
     * 
     */
    @XmlAttribute(name = "BookingCounts")
    protected String bookingCounts;

    /**
     * Specifies Cabin class for a group of
     *                         class of services. Cabin class is not identified if it is not
     *                         present.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Lists class of service and their counts for
     *                         specific cabin class
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCounts() {
        return bookingCounts;
    }

    /**
     * Sets the value of the bookingCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingCounts()
     */
    public void setBookingCounts(String value) {
        this.bookingCounts = value;
    }

}
