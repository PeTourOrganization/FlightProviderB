
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SSR"/>
 *         <element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ssr",
    "bookingTravelerRef"
})
@XmlRootElement(name = "SSRInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class SSRInfo {

    /**
     * Special serivces like wheel chair, or pet carrier.
     * 
     */
    @XmlElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected SSR ssr;
    /**
     * Reference to Booking Traveler.
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> bookingTravelerRef;

    /**
     * Special serivces like wheel chair, or pet carrier.
     * 
     * @return
     *     possible object is
     *     {@link SSR }
     *     
     */
    public SSR getSSR() {
        return ssr;
    }

    /**
     * Sets the value of the ssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSR }
     *     
     * @see #getSSR()
     */
    public void setSSR(SSR value) {
        this.ssr = value;
    }

    /**
     * Reference to Booking Traveler.
     * 
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

}
