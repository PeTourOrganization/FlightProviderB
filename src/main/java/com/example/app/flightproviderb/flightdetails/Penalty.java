
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
 *       <attribute name="CancelRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonExchangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="CancelationPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ReissuePenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonReissuePenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TicketRefundPenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ChargeApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ChargePortion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PenaltyAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Penalty", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Penalty {

    @XmlAttribute(name = "CancelRefund")
    protected Boolean cancelRefund;
    @XmlAttribute(name = "NonRefundable")
    protected Boolean nonRefundable;
    @XmlAttribute(name = "NonExchangeable")
    protected Boolean nonExchangeable;
    @XmlAttribute(name = "CancelationPenalty")
    protected Boolean cancelationPenalty;
    @XmlAttribute(name = "ReissuePenalty")
    protected Boolean reissuePenalty;
    @XmlAttribute(name = "NonReissuePenalty")
    protected Boolean nonReissuePenalty;
    @XmlAttribute(name = "TicketRefundPenalty")
    protected Boolean ticketRefundPenalty;
    @XmlAttribute(name = "ChargeApplicable")
    protected Boolean chargeApplicable;
    @XmlAttribute(name = "ChargePortion")
    protected Boolean chargePortion;
    @XmlAttribute(name = "PenaltyAmount")
    protected String penaltyAmount;

    /**
     * Gets the value of the cancelRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelRefund() {
        return cancelRefund;
    }

    /**
     * Sets the value of the cancelRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelRefund(Boolean value) {
        this.cancelRefund = value;
    }

    /**
     * Gets the value of the nonRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * Sets the value of the nonRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

    /**
     * Gets the value of the nonExchangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonExchangeable() {
        return nonExchangeable;
    }

    /**
     * Sets the value of the nonExchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonExchangeable(Boolean value) {
        this.nonExchangeable = value;
    }

    /**
     * Gets the value of the cancelationPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelationPenalty() {
        return cancelationPenalty;
    }

    /**
     * Sets the value of the cancelationPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelationPenalty(Boolean value) {
        this.cancelationPenalty = value;
    }

    /**
     * Gets the value of the reissuePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReissuePenalty() {
        return reissuePenalty;
    }

    /**
     * Sets the value of the reissuePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissuePenalty(Boolean value) {
        this.reissuePenalty = value;
    }

    /**
     * Gets the value of the nonReissuePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonReissuePenalty() {
        return nonReissuePenalty;
    }

    /**
     * Sets the value of the nonReissuePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonReissuePenalty(Boolean value) {
        this.nonReissuePenalty = value;
    }

    /**
     * Gets the value of the ticketRefundPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketRefundPenalty() {
        return ticketRefundPenalty;
    }

    /**
     * Sets the value of the ticketRefundPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketRefundPenalty(Boolean value) {
        this.ticketRefundPenalty = value;
    }

    /**
     * Gets the value of the chargeApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeApplicable() {
        return chargeApplicable;
    }

    /**
     * Sets the value of the chargeApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeApplicable(Boolean value) {
        this.chargeApplicable = value;
    }

    /**
     * Gets the value of the chargePortion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargePortion() {
        return chargePortion;
    }

    /**
     * Sets the value of the chargePortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargePortion(Boolean value) {
        this.chargePortion = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmount(String value) {
        this.penaltyAmount = value;
    }

}
