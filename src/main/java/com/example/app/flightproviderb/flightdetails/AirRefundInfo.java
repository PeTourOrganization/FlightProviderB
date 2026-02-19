
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}RefundRemark" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RefundAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="RetainAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="RefundFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="RefundableTaxes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FiledCurrency" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *       <attribute name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="Taxes" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="OriginalTicketTotal" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Retain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="Refund" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refundRemark"
})
@XmlRootElement(name = "AirRefundInfo")
public class AirRefundInfo {

    /**
     * A textual remark displayed in Refund Quote and Refund response.
     * 
     */
    @XmlElement(name = "RefundRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<RefundRemark> refundRemark;
    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    @XmlAttribute(name = "RetainAmount")
    protected String retainAmount;
    /**
     * Refund fee for ACH/1P
     * 
     */
    @XmlAttribute(name = "RefundFee")
    protected String refundFee;
    /**
     *  1P - None : All taxes are not refundable. 
     * 					Unknown : Refundability of taxes are not known.
     * 
     */
    @XmlAttribute(name = "RefundableTaxes")
    protected String refundableTaxes;
    /**
     *  1P  Currency of filed CAT33 refund fee
     * 
     */
    @XmlAttribute(name = "FiledCurrency")
    protected String filedCurrency;
    /**
     *  1P - Currency conversion rate used for conversion    
     * 					between FiledCurrency and PCC base currency in which the response is
     * 					returned.
     * 
     */
    @XmlAttribute(name = "ConversionRate")
    protected BigDecimal conversionRate;
    /**
     *  1P - The total value of taxes.
     * 
     */
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    /**
     *  1P - The original ticket amount.
     * 
     */
    @XmlAttribute(name = "OriginalTicketTotal")
    protected String originalTicketTotal;
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    /**
     * This indicates whether any amount is retained by the provider.
     * 
     */
    @XmlAttribute(name = "Retain")
    protected Boolean retain;
    /**
     * This indicates whether carrier/host supports refund for the correcponding pnr.
     * 
     */
    @XmlAttribute(name = "Refund")
    protected Boolean refund;

    /**
     * A textual remark displayed in Refund Quote and Refund response.
     * 
     * Gets the value of the refundRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefundRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the refundRemark property.
     */
    public List<RefundRemark> getRefundRemark() {
        if (refundRemark == null) {
            refundRemark = new ArrayList<>();
        }
        return this.refundRemark;
    }

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
     * Gets the value of the retainAmount property.
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
     */
    public void setRetainAmount(String value) {
        this.retainAmount = value;
    }

    /**
     * Refund fee for ACH/1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFee() {
        return refundFee;
    }

    /**
     * Sets the value of the refundFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundFee()
     */
    public void setRefundFee(String value) {
        this.refundFee = value;
    }

    /**
     *  1P - None : All taxes are not refundable. 
     * 					Unknown : Refundability of taxes are not known.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundableTaxes() {
        return refundableTaxes;
    }

    /**
     * Sets the value of the refundableTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundableTaxes()
     */
    public void setRefundableTaxes(String value) {
        this.refundableTaxes = value;
    }

    /**
     *  1P  Currency of filed CAT33 refund fee
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledCurrency() {
        return filedCurrency;
    }

    /**
     * Sets the value of the filedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFiledCurrency()
     */
    public void setFiledCurrency(String value) {
        this.filedCurrency = value;
    }

    /**
     *  1P - Currency conversion rate used for conversion    
     * 					between FiledCurrency and PCC base currency in which the response is
     * 					returned.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getConversionRate()
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     *  1P - The total value of taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxes()
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     *  1P - The original ticket amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketTotal() {
        return originalTicketTotal;
    }

    /**
     * Sets the value of the originalTicketTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalTicketTotal()
     */
    public void setOriginalTicketTotal(String value) {
        this.originalTicketTotal = value;
    }

    /**
     * Gets the value of the forfeitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfeitAmount() {
        return forfeitAmount;
    }

    /**
     * Sets the value of the forfeitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
    }

    /**
     * This indicates whether any amount is retained by the provider.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRetain() {
        if (retain == null) {
            return false;
        } else {
            return retain;
        }
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
     * This indicates whether carrier/host supports refund for the correcponding pnr.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRefund() {
        if (refund == null) {
            return false;
        } else {
            return refund;
        }
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

}
