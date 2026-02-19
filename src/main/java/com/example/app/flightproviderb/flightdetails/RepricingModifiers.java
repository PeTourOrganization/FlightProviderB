
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="PrivateFareOptions" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareType" maxOccurs="100" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareTicketDesignator" minOccurs="0"/>
 *         <element name="OverrideCurrency" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *                 <attribute name="CountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentPricingModifiers" maxOccurs="999" minOccurs="0"/>
 *         <element name="WithholdTaxCode" maxOccurs="4" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *       <attribute name="PriceClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typePriceClassOfService" />
 *       <attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="ReissueLocCityCode" type="{http://www.travelport.com/schema/common_v54_0}typeCity" />
 *       <attribute name="ReissueLocCountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PenaltyAsTaxCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AirPricingSolutionRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PenaltyToFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PricePTCOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="BrandDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="BrandModifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="JetServiceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="TimeWindow">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="01"/>
 *             <maxInclusive value="12"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FlightType" default="Direct">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Direct"/>
 *             <enumeration value="NonStop"/>
 *             <enumeration value="SingleConnection"/>
 *             <enumeration value="NoRestrictions"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MultiAirportSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="ConnectionPoint" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privateFareOptions",
    "fareType",
    "fareTicketDesignator",
    "overrideCurrency",
    "airSegmentPricingModifiers",
    "withholdTaxCode"
})
@XmlRootElement(name = "RepricingModifiers")
public class RepricingModifiers {

    /**
     * Public and/or Private Fares requested for pricing.            Currently supported: AccountCodeOnly, PrivateFaresOnly, PublicPrivateFaresOnly.
     * 
     */
    @XmlElement(name = "PrivateFareOptions")
    protected String privateFareOptions;
    /**
     * Used to request fares based on the ATPCO type
     *                 code
     * 
     */
    @XmlElement(name = "FareType")
    protected List<FareType> fareType;
    /**
     * Ticket Designator used to further qualify a
     *                 Fare
     * 
     */
    @XmlElement(name = "FareTicketDesignator")
    protected FareTicketDesignator fareTicketDesignator;
    @XmlElement(name = "OverrideCurrency")
    protected RepricingModifiers.OverrideCurrency overrideCurrency;
    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     */
    @XmlElement(name = "AirSegmentPricingModifiers")
    protected List<AirSegmentPricingModifiers> airSegmentPricingModifiers;
    /**
     * Used to request tax withholding for the tax code specified. Providers supported 1G/1P
     * 
     */
    @XmlElement(name = "WithholdTaxCode")
    protected List<String> withholdTaxCode;
    /**
     * Values allowed are ClassBooked or LowestClass. This tells how to price the new itinerary.
     * 
     */
    @XmlAttribute(name = "PriceClassOfService")
    protected TypePriceClassOfService priceClassOfService;
    /**
     * This is either today’s date or the date the repriced itinerary was created
     * 
     */
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    /**
     * This is the city code of the reissue location
     * 
     */
    @XmlAttribute(name = "ReissueLocCityCode")
    protected String reissueLocCityCode;
    /**
     * This is the country code of the reissue location
     * 
     */
    @XmlAttribute(name = "ReissueLocCountryCode")
    protected String reissueLocCountryCode;
    /**
     * Set to true and the itinerary is/will be a bulk ticket. 
     *                                         Set to false and the itinerary being repriced will not be a bulk ticket.
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * May be used in conjunction with PrivateFareOptions
     * 
     */
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    /**
     * Used to request that the penalty be applied as a tax, to the tax code specified. Providers supported 1G/1P
     * 
     */
    @XmlAttribute(name = "PenaltyAsTaxCode")
    protected String penaltyAsTaxCode;
    /**
     * A reference to a AirPricingSolution. Providers: 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "AirPricingSolutionRef")
    protected String airPricingSolutionRef;
    /**
     * Will add the change fee/penalty amount to the total fare amount. Supported Providers: 1P
     * 
     */
    @XmlAttribute(name = "PenaltyToFare")
    protected Boolean penaltyToFare;
    /**
     * A value of true forces the price for the PTC even if that fare is not the lowest fare for the passenger.
     * 
     */
    @XmlAttribute(name = "PricePTCOnly")
    protected Boolean pricePTCOnly;
    /**
     * Set to true full brand details will be returned.
     * 
     */
    @XmlAttribute(name = "BrandDetails")
    protected Boolean brandDetails;
    /**
     * A value of MaintainBrand will maintain the brand from the original ticket if applicable.
     * 
     */
    @XmlAttribute(name = "BrandModifier")
    protected String brandModifier;
    /**
     * Request flights that are jet service only. Available in AirExchangeMultiQuoteReq only.
     * 
     */
    @XmlAttribute(name = "JetServiceOnly")
    protected Boolean jetServiceOnly;
    /**
     * A value of Time Window is optional. Available in AirExchangeMultiQuoteReq only.
     * 
     */
    @XmlAttribute(name = "TimeWindow")
    protected Integer timeWindow;
    /**
     * Type of flights to be returned. Values are 'NonStop', 'Direct', 'SingleConnection' and 'NoRestrictions'. Available in AirExchangeMultiQuoteReq only.
     * 
     */
    @XmlAttribute(name = "FlightType")
    protected String flightType;
    /**
     * A value of Multi Airport Search Indicator is optional. Available in AirExchangeMultiQuoteReq only.
     * 
     */
    @XmlAttribute(name = "MultiAirportSearch")
    protected Boolean multiAirportSearch;
    /**
     * A value of Connection City Code is optional. Available in AirExchangeMultiQuoteReq only.
     * 
     */
    @XmlAttribute(name = "ConnectionPoint")
    protected String connectionPoint;

    /**
     * Public and/or Private Fares requested for pricing.            Currently supported: AccountCodeOnly, PrivateFaresOnly, PublicPrivateFaresOnly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateFareOptions() {
        return privateFareOptions;
    }

    /**
     * Sets the value of the privateFareOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrivateFareOptions()
     */
    public void setPrivateFareOptions(String value) {
        this.privateFareOptions = value;
    }

    /**
     * Used to request fares based on the ATPCO type
     *                 code
     * 
     * Gets the value of the fareType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareType property.
     */
    public List<FareType> getFareType() {
        if (fareType == null) {
            fareType = new ArrayList<>();
        }
        return this.fareType;
    }

    /**
     * Ticket Designator used to further qualify a
     *                 Fare
     * 
     * @return
     *     possible object is
     *     {@link FareTicketDesignator }
     *     
     */
    public FareTicketDesignator getFareTicketDesignator() {
        return fareTicketDesignator;
    }

    /**
     * Sets the value of the fareTicketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTicketDesignator }
     *     
     * @see #getFareTicketDesignator()
     */
    public void setFareTicketDesignator(FareTicketDesignator value) {
        this.fareTicketDesignator = value;
    }

    /**
     * Gets the value of the overrideCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link RepricingModifiers.OverrideCurrency }
     *     
     */
    public RepricingModifiers.OverrideCurrency getOverrideCurrency() {
        return overrideCurrency;
    }

    /**
     * Sets the value of the overrideCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricingModifiers.OverrideCurrency }
     *     
     */
    public void setOverrideCurrency(RepricingModifiers.OverrideCurrency value) {
        this.overrideCurrency = value;
    }

    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     * Gets the value of the airSegmentPricingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentPricingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentPricingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentPricingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentPricingModifiers property.
     */
    public List<AirSegmentPricingModifiers> getAirSegmentPricingModifiers() {
        if (airSegmentPricingModifiers == null) {
            airSegmentPricingModifiers = new ArrayList<>();
        }
        return this.airSegmentPricingModifiers;
    }

    /**
     * Used to request tax withholding for the tax code specified. Providers supported 1G/1P
     * 
     * Gets the value of the withholdTaxCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdTaxCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWithholdTaxCode().add(newItem);
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
     *     The value of the withholdTaxCode property.
     */
    public List<String> getWithholdTaxCode() {
        if (withholdTaxCode == null) {
            withholdTaxCode = new ArrayList<>();
        }
        return this.withholdTaxCode;
    }

    /**
     * Values allowed are ClassBooked or LowestClass. This tells how to price the new itinerary.
     * 
     * @return
     *     possible object is
     *     {@link TypePriceClassOfService }
     *     
     */
    public TypePriceClassOfService getPriceClassOfService() {
        return priceClassOfService;
    }

    /**
     * Sets the value of the priceClassOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePriceClassOfService }
     *     
     * @see #getPriceClassOfService()
     */
    public void setPriceClassOfService(TypePriceClassOfService value) {
        this.priceClassOfService = value;
    }

    /**
     * This is either today’s date or the date the repriced itinerary was created
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreateDate()
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * This is the city code of the reissue location
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueLocCityCode() {
        return reissueLocCityCode;
    }

    /**
     * Sets the value of the reissueLocCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReissueLocCityCode()
     */
    public void setReissueLocCityCode(String value) {
        this.reissueLocCityCode = value;
    }

    /**
     * This is the country code of the reissue location
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueLocCountryCode() {
        return reissueLocCountryCode;
    }

    /**
     * Sets the value of the reissueLocCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReissueLocCountryCode()
     */
    public void setReissueLocCountryCode(String value) {
        this.reissueLocCountryCode = value;
    }

    /**
     * Set to true and the itinerary is/will be a bulk ticket. 
     *                                         Set to false and the itinerary being repriced will not be a bulk ticket.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBulkTicket()
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * May be used in conjunction with PrivateFareOptions
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
     * @see #getAccountCode()
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Used to request that the penalty be applied as a tax, to the tax code specified. Providers supported 1G/1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAsTaxCode() {
        return penaltyAsTaxCode;
    }

    /**
     * Sets the value of the penaltyAsTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPenaltyAsTaxCode()
     */
    public void setPenaltyAsTaxCode(String value) {
        this.penaltyAsTaxCode = value;
    }

    /**
     * A reference to a AirPricingSolution. Providers: 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPricingSolutionRef() {
        return airPricingSolutionRef;
    }

    /**
     * Sets the value of the airPricingSolutionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirPricingSolutionRef()
     */
    public void setAirPricingSolutionRef(String value) {
        this.airPricingSolutionRef = value;
    }

    /**
     * Will add the change fee/penalty amount to the total fare amount. Supported Providers: 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenaltyToFare() {
        return penaltyToFare;
    }

    /**
     * Sets the value of the penaltyToFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPenaltyToFare()
     */
    public void setPenaltyToFare(Boolean value) {
        this.penaltyToFare = value;
    }

    /**
     * A value of true forces the price for the PTC even if that fare is not the lowest fare for the passenger.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPricePTCOnly() {
        if (pricePTCOnly == null) {
            return false;
        } else {
            return pricePTCOnly;
        }
    }

    /**
     * Sets the value of the pricePTCOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPricePTCOnly()
     */
    public void setPricePTCOnly(Boolean value) {
        this.pricePTCOnly = value;
    }

    /**
     * Set to true full brand details will be returned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBrandDetails() {
        if (brandDetails == null) {
            return false;
        } else {
            return brandDetails;
        }
    }

    /**
     * Sets the value of the brandDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBrandDetails()
     */
    public void setBrandDetails(Boolean value) {
        this.brandDetails = value;
    }

    /**
     * A value of MaintainBrand will maintain the brand from the original ticket if applicable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandModifier() {
        return brandModifier;
    }

    /**
     * Sets the value of the brandModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandModifier()
     */
    public void setBrandModifier(String value) {
        this.brandModifier = value;
    }

    /**
     * Request flights that are jet service only. Available in AirExchangeMultiQuoteReq only.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isJetServiceOnly() {
        if (jetServiceOnly == null) {
            return false;
        } else {
            return jetServiceOnly;
        }
    }

    /**
     * Sets the value of the jetServiceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isJetServiceOnly()
     */
    public void setJetServiceOnly(Boolean value) {
        this.jetServiceOnly = value;
    }

    /**
     * A value of Time Window is optional. Available in AirExchangeMultiQuoteReq only.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeWindow() {
        return timeWindow;
    }

    /**
     * Sets the value of the timeWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTimeWindow()
     */
    public void setTimeWindow(Integer value) {
        this.timeWindow = value;
    }

    /**
     * Type of flights to be returned. Values are 'NonStop', 'Direct', 'SingleConnection' and 'NoRestrictions'. Available in AirExchangeMultiQuoteReq only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        if (flightType == null) {
            return "Direct";
        } else {
            return flightType;
        }
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightType()
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * A value of Multi Airport Search Indicator is optional. Available in AirExchangeMultiQuoteReq only.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiAirportSearch() {
        if (multiAirportSearch == null) {
            return true;
        } else {
            return multiAirportSearch;
        }
    }

    /**
     * Sets the value of the multiAirportSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMultiAirportSearch()
     */
    public void setMultiAirportSearch(Boolean value) {
        this.multiAirportSearch = value;
    }

    /**
     * A value of Connection City Code is optional. Available in AirExchangeMultiQuoteReq only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPoint() {
        return connectionPoint;
    }

    /**
     * Sets the value of the connectionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConnectionPoint()
     */
    public void setConnectionPoint(String value) {
        this.connectionPoint = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
     *       <attribute name="CountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OverrideCurrency {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

    }

}
