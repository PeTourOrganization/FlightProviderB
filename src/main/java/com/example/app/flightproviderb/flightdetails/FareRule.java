
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleLong" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleShort" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RuleAdvancedPurchase" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RuleLengthOfStay" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RuleCharges" minOccurs="0"/>
 *         <element name="FareRuleResultMessage" type="{http://www.travelport.com/schema/common_v54_0}typeResultMessage" maxOccurs="999" minOccurs="0"/>
 *         <element name="StructuredFareRules" type="{http://www.travelport.com/schema/air_v54_0}StructuredFareRulesType" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attribute name="FareInfoRef" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "fareRuleLong",
    "fareRuleShort",
    "ruleAdvancedPurchase",
    "ruleLengthOfStay",
    "ruleCharges",
    "fareRuleResultMessage",
    "structuredFareRules"
})
@XmlRootElement(name = "FareRule")
public class FareRule {

    /**
     * Long Text Fare Rule
     * 
     */
    @XmlElement(name = "FareRuleLong")
    protected List<FareRuleLong> fareRuleLong;
    /**
     * Short Text Fare Rule
     * 
     */
    @XmlElement(name = "FareRuleShort")
    protected List<FareRuleShort> fareRuleShort;
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
    @XmlElement(name = "FareRuleResultMessage")
    protected List<TypeResultMessage> fareRuleResultMessage;
    @XmlElement(name = "StructuredFareRules")
    protected StructuredFareRulesType structuredFareRules;
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;
    @XmlAttribute(name = "RuleNumber")
    protected String ruleNumber;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "TariffNumber")
    protected String tariffNumber;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * Long Text Fare Rule
     * 
     * Gets the value of the fareRuleLong property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleLong property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRuleLong().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleLong }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRuleLong property.
     */
    public List<FareRuleLong> getFareRuleLong() {
        if (fareRuleLong == null) {
            fareRuleLong = new ArrayList<>();
        }
        return this.fareRuleLong;
    }

    /**
     * Short Text Fare Rule
     * 
     * Gets the value of the fareRuleShort property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleShort property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRuleShort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleShort }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRuleShort property.
     */
    public List<FareRuleShort> getFareRuleShort() {
        if (fareRuleShort == null) {
            fareRuleShort = new ArrayList<>();
        }
        return this.fareRuleShort;
    }

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
     * Gets the value of the fareRuleResultMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleResultMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRuleResultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRuleResultMessage property.
     */
    public List<TypeResultMessage> getFareRuleResultMessage() {
        if (fareRuleResultMessage == null) {
            fareRuleResultMessage = new ArrayList<>();
        }
        return this.fareRuleResultMessage;
    }

    /**
     * Gets the value of the structuredFareRules property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredFareRulesType }
     *     
     */
    public StructuredFareRulesType getStructuredFareRules() {
        return structuredFareRules;
    }

    /**
     * Sets the value of the structuredFareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredFareRulesType }
     *     
     */
    public void setStructuredFareRules(StructuredFareRulesType value) {
        this.structuredFareRules = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
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

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

}
