
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingRules" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RoutingRules" minOccurs="0"/>
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
    "bookingRules",
    "routingRules"
})
@XmlRootElement(name = "AccountRelatedRules")
public class AccountRelatedRules {

    /**
     * Rules related to pre pay booking
     * 
     */
    @XmlElement(name = "BookingRules")
    protected List<BookingRules> bookingRules;
    /**
     * Rules related to routing
     * 
     */
    @XmlElement(name = "RoutingRules")
    protected RoutingRules routingRules;

    /**
     * Rules related to pre pay booking
     * 
     * Gets the value of the bookingRules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRules }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingRules property.
     */
    public List<BookingRules> getBookingRules() {
        if (bookingRules == null) {
            bookingRules = new ArrayList<>();
        }
        return this.bookingRules;
    }

    /**
     * Rules related to routing
     * 
     * @return
     *     possible object is
     *     {@link RoutingRules }
     *     
     */
    public RoutingRules getRoutingRules() {
        return routingRules;
    }

    /**
     * Sets the value of the routingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingRules }
     *     
     * @see #getRoutingRules()
     */
    public void setRoutingRules(RoutingRules value) {
        this.routingRules = value;
    }

}
