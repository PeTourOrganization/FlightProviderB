
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
 *       <attribute name="Refund" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Retain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RetainAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="NetAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailRefundInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailRefundInfo {

    /**
     * Amount refunded back to customer.
     * 
     */
    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    /**
     * Cancellation penalty imposed by the distributor.
     * 
     */
    @XmlAttribute(name = "CancellationFee")
    protected String cancellationFee;
    /**
     * Indicates whether vendor offers refund on rail reservation.
     * 
     */
    @XmlAttribute(name = "Refund")
    protected Boolean refund;
    /**
     * Indicates whether vendor retains the amount to be used later.
     * 
     */
    @XmlAttribute(name = "Retain")
    protected Boolean retain;
    /**
     * Amount retained by rail vendor for futute exchange/rail book at rail vendor site.
     * 
     */
    @XmlAttribute(name = "RetainAmount")
    protected String retainAmount;
    /**
     * Net total amount to be refunded or retained by the vendor.
     * 
     */
    @XmlAttribute(name = "NetAmount")
    protected String netAmount;

    /**
     * Amount refunded back to customer.
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
     * @see #getRefundAmount()
     */
    public void setRefundAmount(String value) {
        this.refundAmount = value;
    }

    /**
     * Cancellation penalty imposed by the distributor.
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
     * @see #getCancellationFee()
     */
    public void setCancellationFee(String value) {
        this.cancellationFee = value;
    }

    /**
     * Indicates whether vendor offers refund on rail reservation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRefund()
     */
    public void setRefund(Boolean value) {
        this.refund = value;
    }

    /**
     * Indicates whether vendor retains the amount to be used later.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetain() {
        return retain;
    }

    /**
     * Sets the value of the retain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRetain()
     */
    public void setRetain(Boolean value) {
        this.retain = value;
    }

    /**
     * Amount retained by rail vendor for futute exchange/rail book at rail vendor site.
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

    /**
     * Net total amount to be refunded or retained by the vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNetAmount()
     */
    public void setNetAmount(String value) {
        this.netAmount = value;
    }

}
