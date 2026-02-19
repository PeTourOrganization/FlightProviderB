
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
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RuleAdvancedPurchase" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RuleLengthOfStay" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RuleCharges" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RuleNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TariffNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleAdvancedPurchase",
    "ruleLengthOfStay",
    "ruleCharges"
})
@XmlRootElement(name = "FareDisplayRule")
public class FareDisplayRule {

    /**
     * Container for rules regarding advance
     *                 purchase restrictions. TicketingEarliestDate and TicketingLatestDate
     *                 are strings representing respective dates. If a year component is
     *                 present then it signifies an exact date. If only day and month
     *                 components are present then it signifies a seasonal date, which
     *                 means applicable for that date in any year
     * 
     */
    @XmlElement(name = "RuleAdvancedPurchase")
    protected RuleAdvancedPurchase ruleAdvancedPurchase;
    /**
     * Container for rules providing minimum and
     *                 maximum stay requirements.
     * 
     */
    @XmlElement(name = "RuleLengthOfStay")
    protected RuleLengthOfStay ruleLengthOfStay;
    /**
     * Container for rules related to charges
     *                 such as deposits, surcharges, penalities, etc..
     * 
     */
    @XmlElement(name = "RuleCharges")
    protected RuleCharges ruleCharges;
    @XmlAttribute(name = "RuleNumber")
    protected String ruleNumber;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "TariffNumber")
    protected String tariffNumber;

    /**
     * Container for rules regarding advance
     *                 purchase restrictions. TicketingEarliestDate and TicketingLatestDate
     *                 are strings representing respective dates. If a year component is
     *                 present then it signifies an exact date. If only day and month
     *                 components are present then it signifies a seasonal date, which
     *                 means applicable for that date in any year
     * 
     * @return
     *     possible object is
     *     {@link RuleAdvancedPurchase }
     *     
     */
    public RuleAdvancedPurchase getRuleAdvancedPurchase() {
        return ruleAdvancedPurchase;
    }

    /**
     * Sets the value of the ruleAdvancedPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleAdvancedPurchase }
     *     
     * @see #getRuleAdvancedPurchase()
     */
    public void setRuleAdvancedPurchase(RuleAdvancedPurchase value) {
        this.ruleAdvancedPurchase = value;
    }

    /**
     * Container for rules providing minimum and
     *                 maximum stay requirements.
     * 
     * @return
     *     possible object is
     *     {@link RuleLengthOfStay }
     *     
     */
    public RuleLengthOfStay getRuleLengthOfStay() {
        return ruleLengthOfStay;
    }

    /**
     * Sets the value of the ruleLengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleLengthOfStay }
     *     
     * @see #getRuleLengthOfStay()
     */
    public void setRuleLengthOfStay(RuleLengthOfStay value) {
        this.ruleLengthOfStay = value;
    }

    /**
     * Container for rules related to charges
     *                 such as deposits, surcharges, penalities, etc..
     * 
     * @return
     *     possible object is
     *     {@link RuleCharges }
     *     
     */
    public RuleCharges getRuleCharges() {
        return ruleCharges;
    }

    /**
     * Sets the value of the ruleCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleCharges }
     *     
     * @see #getRuleCharges()
     */
    public void setRuleCharges(RuleCharges value) {
        this.ruleCharges = value;
    }

    /**
     * Gets the value of the ruleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleNumber() {
        return ruleNumber;
    }

    /**
     * Sets the value of the ruleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleNumber(String value) {
        this.ruleNumber = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the tariffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNumber() {
        return tariffNumber;
    }

    /**
     * Sets the value of the tariffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNumber(String value) {
        this.tariffNumber = value;
    }

}
