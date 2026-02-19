
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExchangePenaltyInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="EligibleFares" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RefundableFares" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PassedAutomationChecks" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangePenaltyInfo"
})
@XmlRootElement(name = "ExchangeEligibilityInfo")
public class ExchangeEligibilityInfo {

    @XmlElement(name = "ExchangePenaltyInfo")
    protected List<ExchangePenaltyInfo> exchangePenaltyInfo;
    /**
     * Identifies which fares are eligible for Exchange
     * 
     */
    @XmlAttribute(name = "EligibleFares")
    protected String eligibleFares;
    /**
     * Fares eligible for refund: All, Some, None
     * 
     */
    @XmlAttribute(name = "RefundableFares")
    protected String refundableFares;
    /**
     * Indicates whether the itinerary passed initial validation for automated exchange
     * 
     */
    @XmlAttribute(name = "PassedAutomationChecks")
    protected Boolean passedAutomationChecks;

    /**
     * Gets the value of the exchangePenaltyInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangePenaltyInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExchangePenaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangePenaltyInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the exchangePenaltyInfo property.
     */
    public List<ExchangePenaltyInfo> getExchangePenaltyInfo() {
        if (exchangePenaltyInfo == null) {
            exchangePenaltyInfo = new ArrayList<>();
        }
        return this.exchangePenaltyInfo;
    }

    /**
     * Identifies which fares are eligible for Exchange
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibleFares() {
        return eligibleFares;
    }

    /**
     * Sets the value of the eligibleFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEligibleFares()
     */
    public void setEligibleFares(String value) {
        this.eligibleFares = value;
    }

    /**
     * Fares eligible for refund: All, Some, None
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundableFares() {
        return refundableFares;
    }

    /**
     * Sets the value of the refundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundableFares()
     */
    public void setRefundableFares(String value) {
        this.refundableFares = value;
    }

    /**
     * Indicates whether the itinerary passed initial validation for automated exchange
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassedAutomationChecks() {
        return passedAutomationChecks;
    }

    /**
     * Sets the value of the passedAutomationChecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPassedAutomationChecks()
     */
    public void setPassedAutomationChecks(Boolean value) {
        this.passedAutomationChecks = value;
    }

}
