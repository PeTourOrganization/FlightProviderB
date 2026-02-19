
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
 *       <choice>
 *         <element name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney"/>
 *         <element name="Percent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </choice>
 *       <attribute name="AdjustedTotalPrice" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ApproximateAdjustedTotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amount",
    "percent"
})
@XmlRootElement(name = "Adjustment")
public class Adjustment {

    /**
     * Implies a flat amount to be adjusted.
     *                             Negetive value implies a discount.
     * 
     */
    @XmlElement(name = "Amount")
    protected String amount;
    /**
     * Implies an adjustment to be made on
     *                             original price. Negetive value implies a discount.
     * 
     */
    @XmlElement(name = "Percent")
    protected Float percent;
    /**
     * The adjusted price after applying adjustment
     *                         on Total price
     * 
     */
    @XmlAttribute(name = "AdjustedTotalPrice", required = true)
    protected String adjustedTotalPrice;
    /**
     * The Converted adjusted total price in Default
     *                         Currency for this entity.
     * 
     */
    @XmlAttribute(name = "ApproximateAdjustedTotalPrice")
    protected String approximateAdjustedTotalPrice;
    /**
     * Reference to a booking traveler for which adjustment is applied.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Implies a flat amount to be adjusted.
     *                             Negetive value implies a discount.
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
     * Implies an adjustment to be made on
     *                             original price. Negetive value implies a discount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getPercent()
     */
    public void setPercent(Float value) {
        this.percent = value;
    }

    /**
     * The adjusted price after applying adjustment
     *                         on Total price
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedTotalPrice() {
        return adjustedTotalPrice;
    }

    /**
     * Sets the value of the adjustedTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdjustedTotalPrice()
     */
    public void setAdjustedTotalPrice(String value) {
        this.adjustedTotalPrice = value;
    }

    /**
     * The Converted adjusted total price in Default
     *                         Currency for this entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateAdjustedTotalPrice() {
        return approximateAdjustedTotalPrice;
    }

    /**
     * Sets the value of the approximateAdjustedTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateAdjustedTotalPrice()
     */
    public void setApproximateAdjustedTotalPrice(String value) {
        this.approximateAdjustedTotalPrice = value;
    }

    /**
     * Reference to a booking traveler for which adjustment is applied.
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
