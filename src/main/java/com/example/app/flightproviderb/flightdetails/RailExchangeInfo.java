
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
 *       <attribute name="RefundAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="CancellationFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ExchangeAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ApproximateRefundAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ApproximateCancellationFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ApproximateExchangeAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="RetainAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailExchangeInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailExchangeInfo {

    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    @XmlAttribute(name = "CancellationFee")
    protected String cancellationFee;
    @XmlAttribute(name = "ExchangeAmount")
    protected String exchangeAmount;
    @XmlAttribute(name = "ApproximateRefundAmount")
    protected String approximateRefundAmount;
    @XmlAttribute(name = "ApproximateCancellationFee")
    protected String approximateCancellationFee;
    /**
     * The Converted total price in Default Currency for this entity including base price and all taxes.
     * 
     */
    @XmlAttribute(name = "ApproximateExchangeAmount")
    protected String approximateExchangeAmount;
    /**
     * Amount retained by a rail vendor for future use at the vendor’s site.
     * 
     */
    @XmlAttribute(name = "RetainAmount")
    protected String retainAmount;

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundAmount(String value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the cancellationFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationFee() {
        return cancellationFee;
    }

    /**
     * Sets the value of the cancellationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationFee(String value) {
        this.cancellationFee = value;
    }

    /**
     * Gets the value of the exchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAmount() {
        return exchangeAmount;
    }

    /**
     * Sets the value of the exchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeAmount(String value) {
        this.exchangeAmount = value;
    }

    /**
     * Gets the value of the approximateRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateRefundAmount() {
        return approximateRefundAmount;
    }

    /**
     * Sets the value of the approximateRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateRefundAmount(String value) {
        this.approximateRefundAmount = value;
    }

    /**
     * Gets the value of the approximateCancellationFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateCancellationFee() {
        return approximateCancellationFee;
    }

    /**
     * Sets the value of the approximateCancellationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateCancellationFee(String value) {
        this.approximateCancellationFee = value;
    }

    /**
     * The Converted total price in Default Currency for this entity including base price and all taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateExchangeAmount() {
        return approximateExchangeAmount;
    }

    /**
     * Sets the value of the approximateExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateExchangeAmount()
     */
    public void setApproximateExchangeAmount(String value) {
        this.approximateExchangeAmount = value;
    }

    /**
     * Amount retained by a rail vendor for future use at the vendor’s site.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainAmount() {
        return retainAmount;
    }

    /**
     * Sets the value of the retainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRetainAmount()
     */
    public void setRetainAmount(String value) {
        this.retainAmount = value;
    }

}
