
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="AdvisoryMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *         <element name="EndorsementText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *         <element name="WaiverText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="LowFarePricing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="LowFareFound" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="PenaltyApplies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="DiscountApplies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ItineraryType" type="{http://www.travelport.com/schema/common_v54_0}typeItineraryCode" />
 *       <attribute name="ValidatingVendorCode" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="ForTicketingOnDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="LastDateToTicket" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="FormOfRefund" type="{http://www.travelport.com/schema/common_v54_0}typeFormOfRefund" />
 *       <attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BankersSellingRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="PricingType" type="{http://www.travelport.com/schema/common_v54_0}typePricingType" />
 *       <attribute name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="RateOfExchange" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="OriginalTicketCurrency" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "advisoryMessage",
    "endorsementText",
    "waiverText"
})
@XmlRootElement(name = "PricingDetails")
public class PricingDetails {

    /**
     * Advisory messages returned from the host.
     * 
     */
    @XmlElement(name = "AdvisoryMessage")
    protected List<String> advisoryMessage;
    /**
     * Endorsement text returned from the host.
     * 
     */
    @XmlElement(name = "EndorsementText")
    protected List<String> endorsementText;
    /**
     * Waiver text returned from the host.
     * 
     */
    @XmlElement(name = "WaiverText")
    protected String waiverText;
    /**
     * This tells if Low Fare Finder was used.
     * 
     */
    @XmlAttribute(name = "LowFarePricing")
    protected Boolean lowFarePricing;
    /**
     * This tells if the lowest fare was found.
     * 
     */
    @XmlAttribute(name = "LowFareFound")
    protected Boolean lowFareFound;
    /**
     * This tells if penalties apply.
     * 
     */
    @XmlAttribute(name = "PenaltyApplies")
    protected Boolean penaltyApplies;
    /**
     * This tells if a discount applies.
     * 
     */
    @XmlAttribute(name = "DiscountApplies")
    protected Boolean discountApplies;
    /**
     * Values allowed are International or Domestic. This tells if the itinerary is international or domestic.
     * 
     */
    @XmlAttribute(name = "ItineraryType")
    protected TypeItineraryCode itineraryType;
    /**
     * The vendor code of the validating carrier.
     * 
     */
    @XmlAttribute(name = "ValidatingVendorCode")
    protected String validatingVendorCode;
    /**
     * The ticketing date of the itinerary.
     * 
     */
    @XmlAttribute(name = "ForTicketingOnDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar forTicketingOnDate;
    /**
     * The last date to issue the ticket.
     * 
     */
    @XmlAttribute(name = "LastDateToTicket")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateToTicket;
    /**
     * How the refund will be issued. Values will be MCO or FormOfPayment
     * 
     */
    @XmlAttribute(name = "FormOfRefund")
    protected TypeFormOfRefund formOfRefund;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    /**
     * The selling rate at time of quote.
     * 
     */
    @XmlAttribute(name = "BankersSellingRate")
    protected BigDecimal bankersSellingRate;
    /**
     * Ties with the RepricingModifiers sent in the request and tells how the itinerary was priced.
     * 
     */
    @XmlAttribute(name = "PricingType")
    protected TypePricingType pricingType;
    /**
     * The conversion rate at the time of quote.
     * 
     */
    @XmlAttribute(name = "ConversionRate")
    protected BigDecimal conversionRate;
    /**
     * The exchange rate at time of quote.
     * 
     */
    @XmlAttribute(name = "RateOfExchange")
    protected BigDecimal rateOfExchange;
    /**
     * The currency of the original ticket.
     * 
     */
    @XmlAttribute(name = "OriginalTicketCurrency")
    protected String originalTicketCurrency;

    /**
     * Advisory messages returned from the host.
     * 
     * Gets the value of the advisoryMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advisoryMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdvisoryMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the advisoryMessage property.
     */
    public List<String> getAdvisoryMessage() {
        if (advisoryMessage == null) {
            advisoryMessage = new ArrayList<>();
        }
        return this.advisoryMessage;
    }

    /**
     * Endorsement text returned from the host.
     * 
     * Gets the value of the endorsementText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEndorsementText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the endorsementText property.
     */
    public List<String> getEndorsementText() {
        if (endorsementText == null) {
            endorsementText = new ArrayList<>();
        }
        return this.endorsementText;
    }

    /**
     * Waiver text returned from the host.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverText() {
        return waiverText;
    }

    /**
     * Sets the value of the waiverText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWaiverText()
     */
    public void setWaiverText(String value) {
        this.waiverText = value;
    }

    /**
     * This tells if Low Fare Finder was used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLowFarePricing() {
        if (lowFarePricing == null) {
            return false;
        } else {
            return lowFarePricing;
        }
    }

    /**
     * Sets the value of the lowFarePricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLowFarePricing()
     */
    public void setLowFarePricing(Boolean value) {
        this.lowFarePricing = value;
    }

    /**
     * This tells if the lowest fare was found.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLowFareFound() {
        if (lowFareFound == null) {
            return false;
        } else {
            return lowFareFound;
        }
    }

    /**
     * Sets the value of the lowFareFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLowFareFound()
     */
    public void setLowFareFound(Boolean value) {
        this.lowFareFound = value;
    }

    /**
     * This tells if penalties apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPenaltyApplies() {
        if (penaltyApplies == null) {
            return false;
        } else {
            return penaltyApplies;
        }
    }

    /**
     * Sets the value of the penaltyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPenaltyApplies()
     */
    public void setPenaltyApplies(Boolean value) {
        this.penaltyApplies = value;
    }

    /**
     * This tells if a discount applies.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDiscountApplies() {
        if (discountApplies == null) {
            return false;
        } else {
            return discountApplies;
        }
    }

    /**
     * Sets the value of the discountApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDiscountApplies()
     */
    public void setDiscountApplies(Boolean value) {
        this.discountApplies = value;
    }

    /**
     * Values allowed are International or Domestic. This tells if the itinerary is international or domestic.
     * 
     * @return
     *     possible object is
     *     {@link TypeItineraryCode }
     *     
     */
    public TypeItineraryCode getItineraryType() {
        return itineraryType;
    }

    /**
     * Sets the value of the itineraryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeItineraryCode }
     *     
     * @see #getItineraryType()
     */
    public void setItineraryType(TypeItineraryCode value) {
        this.itineraryType = value;
    }

    /**
     * The vendor code of the validating carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingVendorCode() {
        return validatingVendorCode;
    }

    /**
     * Sets the value of the validatingVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValidatingVendorCode()
     */
    public void setValidatingVendorCode(String value) {
        this.validatingVendorCode = value;
    }

    /**
     * The ticketing date of the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForTicketingOnDate() {
        return forTicketingOnDate;
    }

    /**
     * Sets the value of the forTicketingOnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getForTicketingOnDate()
     */
    public void setForTicketingOnDate(XMLGregorianCalendar value) {
        this.forTicketingOnDate = value;
    }

    /**
     * The last date to issue the ticket.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateToTicket() {
        return lastDateToTicket;
    }

    /**
     * Sets the value of the lastDateToTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLastDateToTicket()
     */
    public void setLastDateToTicket(XMLGregorianCalendar value) {
        this.lastDateToTicket = value;
    }

    /**
     * How the refund will be issued. Values will be MCO or FormOfPayment
     * 
     * @return
     *     possible object is
     *     {@link TypeFormOfRefund }
     *     
     */
    public TypeFormOfRefund getFormOfRefund() {
        return formOfRefund;
    }

    /**
     * Sets the value of the formOfRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFormOfRefund }
     *     
     * @see #getFormOfRefund()
     */
    public void setFormOfRefund(TypeFormOfRefund value) {
        this.formOfRefund = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * The selling rate at time of quote.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankersSellingRate() {
        return bankersSellingRate;
    }

    /**
     * Sets the value of the bankersSellingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBankersSellingRate()
     */
    public void setBankersSellingRate(BigDecimal value) {
        this.bankersSellingRate = value;
    }

    /**
     * Ties with the RepricingModifiers sent in the request and tells how the itinerary was priced.
     * 
     * @return
     *     possible object is
     *     {@link TypePricingType }
     *     
     */
    public TypePricingType getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePricingType }
     *     
     * @see #getPricingType()
     */
    public void setPricingType(TypePricingType value) {
        this.pricingType = value;
    }

    /**
     * The conversion rate at the time of quote.
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
     * The exchange rate at time of quote.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateOfExchange() {
        return rateOfExchange;
    }

    /**
     * Sets the value of the rateOfExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRateOfExchange()
     */
    public void setRateOfExchange(BigDecimal value) {
        this.rateOfExchange = value;
    }

    /**
     * The currency of the original ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTicketCurrency() {
        return originalTicketCurrency;
    }

    /**
     * Sets the value of the originalTicketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalTicketCurrency()
     */
    public void setOriginalTicketCurrency(String value) {
        this.originalTicketCurrency = value;
    }

}
