
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
 *       <attribute name="TicketNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeTicketNumber" />
 *       <attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ExchangedCoupon", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ExchangedCoupon {

    /**
     * The ticket number for which the exchange coupons are present.
     * 
     */
    @XmlAttribute(name = "TicketNumber", required = true)
    protected String ticketNumber;
    /**
     * Coupon numbers that were exchanged specific to this ticket
     * 
     */
    @XmlAttribute(name = "CouponNumber")
    protected String couponNumber;

    /**
     * The ticket number for which the exchange coupons are present.
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
     * Coupon numbers that were exchanged specific to this ticket
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCouponNumber()
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

}
