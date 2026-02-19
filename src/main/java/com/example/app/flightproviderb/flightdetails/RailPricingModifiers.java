
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}DiscountCard" maxOccurs="9" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProhibitNonRefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProhibitNonExchangeableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="CurrencyType" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *       <attribute name="RailSearchType" type="{http://www.travelport.com/schema/common_v54_0}typeRailSearchType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "discountCard"
})
@XmlRootElement(name = "RailPricingModifiers", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailPricingModifiers {

    /**
     * Discount request for rail.
     * 
     */
    @XmlElement(name = "DiscountCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<DiscountCard> discountCard;
    /**
     * Indicates whether it prohibits NonRefundable Fares.
     * 
     */
    @XmlAttribute(name = "ProhibitNonRefundableFares")
    protected Boolean prohibitNonRefundableFares;
    /**
     * Indicates whether it prohibits NonExchangeable Fares .
     * 
     */
    @XmlAttribute(name = "ProhibitNonExchangeableFares")
    protected Boolean prohibitNonExchangeableFares;
    /**
     *  3 Letter Currency Code
     * 
     */
    @XmlAttribute(name = "CurrencyType")
    protected String currencyType;
    /**
     * RailSearchType options are "All Fares"  "Fastest"  "Lowest Fare" "One Fare Per Class" "Seasons".  Supported by NTV/VF only for "All Fares" "Lowest Fare" and "One Fare Per Class". Provider : RCH
     * 
     */
    @XmlAttribute(name = "RailSearchType")
    protected String railSearchType;

    /**
     * Discount request for rail.
     * 
     * Gets the value of the discountCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiscountCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the discountCard property.
     */
    public List<DiscountCard> getDiscountCard() {
        if (discountCard == null) {
            discountCard = new ArrayList<>();
        }
        return this.discountCard;
    }

    /**
     * Indicates whether it prohibits NonRefundable Fares.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonRefundableFares() {
        if (prohibitNonRefundableFares == null) {
            return false;
        } else {
            return prohibitNonRefundableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonRefundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProhibitNonRefundableFares()
     */
    public void setProhibitNonRefundableFares(Boolean value) {
        this.prohibitNonRefundableFares = value;
    }

    /**
     * Indicates whether it prohibits NonExchangeable Fares .
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonExchangeableFares() {
        if (prohibitNonExchangeableFares == null) {
            return false;
        } else {
            return prohibitNonExchangeableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonExchangeableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProhibitNonExchangeableFares()
     */
    public void setProhibitNonExchangeableFares(Boolean value) {
        this.prohibitNonExchangeableFares = value;
    }

    /**
     *  3 Letter Currency Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrencyType()
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * RailSearchType options are "All Fares"  "Fastest"  "Lowest Fare" "One Fare Per Class" "Seasons".  Supported by NTV/VF only for "All Fares" "Lowest Fare" and "One Fare Per Class". Provider : RCH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailSearchType() {
        return railSearchType;
    }

    /**
     * Sets the value of the railSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailSearchType()
     */
    public void setRailSearchType(String value) {
        this.railSearchType = value;
    }

}
