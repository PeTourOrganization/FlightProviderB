
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base Low Fare Search Request
 * 
 * <p>Java class for BaseLowFareSearchReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseLowFareSearchReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}BaseAirSearchReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SearchPassenger" maxOccurs="18"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Enumeration" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlexExploreModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PCC" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRulesFilterCategory" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="EnablePointToPointSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="EnablePointToPointAlternates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MaxNumberOfExpertSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       <attribute name="SolutionResult" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="PreferCompleteItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="MetaOptionIdentifier">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ReturnUpsellFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="IncludeFareInfoMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ReturnBrandedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="MultiGDSSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ReturnMM" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="CheckOBFees" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NSCC">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FareInfoRules" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MostRestrictivePenalties" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLowFareSearchReq", propOrder = {
    "searchPassenger",
    "airPricingModifiers",
    "enumeration",
    "airExchangeModifiers",
    "flexExploreModifiers",
    "pcc",
    "fareRulesFilterCategory",
    "formOfPayment"
})
@XmlSeeAlso({
    LowFareSearchReq.class
})
public class BaseLowFareSearchReq
    extends BaseAirSearchReq
{

    /**
     * Provider: 1G,1V,1P,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 					passenger
     * 
     */
    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<SearchPassenger> searchPassenger;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     */
    @XmlElement(name = "Enumeration")
    protected Enumeration enumeration;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    /**
     * This is the container for a set of modifiers which allow the user to perform a special kind of low fare search, depicted as flex explore, based on different parameters like Area, Zone, Country, State, Specific locations, Distance around the actual destination of the itinerary. Applicable for providers 1G,1V,1P.
     * 
     */
    @XmlElement(name = "FlexExploreModifiers")
    protected FlexExploreModifiers flexExploreModifiers;
    /**
     * Specify pseudo City
     * 
     */
    @XmlElement(name = "PCC")
    protected PCC pcc;
    /**
     * Fare Rules Filter if requested will return rules for requested category in the response. Applicable for providers 1G,1V,1P.
     * 
     */
    @XmlElement(name = "FareRulesFilterCategory")
    protected FareRulesFilterCategory fareRulesFilterCategory;
    /**
     * Provider: 1P
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
    /**
     * Provider: 1G,1V,1P,ACH-Indicates that low cost providers should be queried for top connection options and the results returned with the search.
     * 
     */
    @XmlAttribute(name = "EnablePointToPointSearch")
    protected Boolean enablePointToPointSearch;
    /**
     * Provider: 1G,1V,1P,ACH-Indicates that suggestions for alternate connection cities for low cost providers should be returned with the search.
     * 
     */
    @XmlAttribute(name = "EnablePointToPointAlternates")
    protected Boolean enablePointToPointAlternates;
    /**
     * Provider: 1G,1V,1P,ACH-Indicates the Maximum Number of Expert Solutions to be returned from the Knowledge Base for the provided search criteria
     * 
     */
    @XmlAttribute(name = "MaxNumberOfExpertSolutions")
    protected BigInteger maxNumberOfExpertSolutions;
    /**
     * Provider: 1G,1V,1P,ACH-Indicates whether the response will contain Solution result (AirPricingSolution) or Non Solution Result (AirPricingPoints). The default value is false. This attribute cannot be combined with EnablePointToPointSearch, EnablePointToPointAlternates and MaxNumberOfExpertSolutions.
     * 
     */
    @XmlAttribute(name = "SolutionResult")
    protected Boolean solutionResult;
    /**
     * Provider: ACH-This attribute is only supported for ACH .It works in conjunction with the @SolutionResult flag
     * 
     */
    @XmlAttribute(name = "PreferCompleteItinerary")
    protected Boolean preferCompleteItinerary;
    /**
     * Invoke Meta Search.  Valid values are 00 to 99, or D for the default meta search configuration.  When Meta Search not requested, normal LowFareSearch applies.  Supported Providers;  1g/1v/1p
     * 
     */
    @XmlAttribute(name = "MetaOptionIdentifier")
    protected String metaOptionIdentifier;
    /**
     * When set to “true”, Upsell information will be returned in the shop response. Provider supported : 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "ReturnUpsellFare")
    protected Boolean returnUpsellFare;
    /**
     * Set to True to return FareInfoMessageList. Providers supported: 1G/1V/1P
     * 
     */
    @XmlAttribute(name = "IncludeFareInfoMessages")
    protected Boolean includeFareInfoMessages;
    /**
     * When ReturnBrandedFares is set to “false”, Rich Content and Branding will not be returned in the shop response.  When ReturnBrandedFares it is set to “true” or is not sent, Rich Content and Branding will be returned in the shop response.  Provider: 1P/ACH.
     * 
     */
    @XmlAttribute(name = "ReturnBrandedFares")
    protected Boolean returnBrandedFares;
    /**
     * A "true" value indicates MultiGDSSearch. Specific provisioning is required.
     * 
     */
    @XmlAttribute(name = "MultiGDSSearch")
    protected Boolean multiGDSSearch;
    /**
     * If this attribute is set to “true”, Fare Control Manager processing will be invoked.
     * 
     */
    @XmlAttribute(name = "ReturnMM")
    protected Boolean returnMM;
    /**
     * A flag to return fees for ticketing and for various forms of payment. The default is “TicketingOnly” and will return only ticketing fees.  The value “All” will return ticketing fees and the applicable form of payment fees for the form of payment information specified in the request.  “FOPOnly” will return the applicable form of payment fees for the form of payment information specified in the request. Form of payment fees are never included in the total unless specific card details are in the request.Provider notes:ACH - CheckOBFees is valid only for LowFareSearch.  The valid values are “All”, “TicketingOnly” and “None” and the default value is “None”. 1P -The valid values are “All”, “None” and “TicketingOnly”.1G – All four values are supported.1V/RCH – CheckOBFees are not supported.”
     * 
     */
    @XmlAttribute(name = "CheckOBFees")
    protected String checkOBFees;
    /**
     *  1 to 3 numeric that defines a Search Control Console filter.This attribute is used to override that filter.
     * 
     */
    @XmlAttribute(name = "NSCC")
    protected String nscc;
    /**
     * Returns ChangePenalty and CancelPenalty values at the FareInfo level. If FareRulesFilterCategory is sent FareRulesFilter will be returned at FareInfo level.  Provider: 1G/1V.
     * 
     */
    @XmlAttribute(name = "FareInfoRules")
    protected Boolean fareInfoRules;
    /**
     * Boolean flag used to request the MostRestrictivePenalties in the response
     * 
     */
    @XmlAttribute(name = "MostRestrictivePenalties")
    protected Boolean mostRestrictivePenalties;

    /**
     * Provider: 1G,1V,1P,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 					passenger
     * 
     * Gets the value of the searchPassenger property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchPassenger property.
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<>();
        }
        return this.searchPassenger;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers }
     *     
     */
    public AirPricingModifiers getAirPricingModifiers() {
        return airPricingModifiers;
    }

    /**
     * Sets the value of the airPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers }
     *     
     * @see #getAirPricingModifiers()
     */
    public void setAirPricingModifiers(AirPricingModifiers value) {
        this.airPricingModifiers = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH.
     * 
     * @return
     *     possible object is
     *     {@link Enumeration }
     *     
     */
    public Enumeration getEnumeration() {
        return enumeration;
    }

    /**
     * Sets the value of the enumeration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enumeration }
     *     
     * @see #getEnumeration()
     */
    public void setEnumeration(Enumeration value) {
        this.enumeration = value;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public AirExchangeModifiers getAirExchangeModifiers() {
        return airExchangeModifiers;
    }

    /**
     * Sets the value of the airExchangeModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeModifiers }
     *     
     * @see #getAirExchangeModifiers()
     */
    public void setAirExchangeModifiers(AirExchangeModifiers value) {
        this.airExchangeModifiers = value;
    }

    /**
     * This is the container for a set of modifiers which allow the user to perform a special kind of low fare search, depicted as flex explore, based on different parameters like Area, Zone, Country, State, Specific locations, Distance around the actual destination of the itinerary. Applicable for providers 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link FlexExploreModifiers }
     *     
     */
    public FlexExploreModifiers getFlexExploreModifiers() {
        return flexExploreModifiers;
    }

    /**
     * Sets the value of the flexExploreModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexExploreModifiers }
     *     
     * @see #getFlexExploreModifiers()
     */
    public void setFlexExploreModifiers(FlexExploreModifiers value) {
        this.flexExploreModifiers = value;
    }

    /**
     * Specify pseudo City
     * 
     * @return
     *     possible object is
     *     {@link PCC }
     *     
     */
    public PCC getPCC() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCC }
     *     
     * @see #getPCC()
     */
    public void setPCC(PCC value) {
        this.pcc = value;
    }

    /**
     * Fare Rules Filter if requested will return rules for requested category in the response. Applicable for providers 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesFilterCategory }
     *     
     */
    public FareRulesFilterCategory getFareRulesFilterCategory() {
        return fareRulesFilterCategory;
    }

    /**
     * Sets the value of the fareRulesFilterCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesFilterCategory }
     *     
     * @see #getFareRulesFilterCategory()
     */
    public void setFareRulesFilterCategory(FareRulesFilterCategory value) {
        this.fareRulesFilterCategory = value;
    }

    /**
     * Provider: 1P
     * 
     * Gets the value of the formOfPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the formOfPayment property.
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<>();
        }
        return this.formOfPayment;
    }

    /**
     * Provider: 1G,1V,1P,ACH-Indicates that low cost providers should be queried for top connection options and the results returned with the search.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnablePointToPointSearch() {
        if (enablePointToPointSearch == null) {
            return false;
        } else {
            return enablePointToPointSearch;
        }
    }

    /**
     * Sets the value of the enablePointToPointSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnablePointToPointSearch()
     */
    public void setEnablePointToPointSearch(Boolean value) {
        this.enablePointToPointSearch = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH-Indicates that suggestions for alternate connection cities for low cost providers should be returned with the search.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnablePointToPointAlternates() {
        if (enablePointToPointAlternates == null) {
            return false;
        } else {
            return enablePointToPointAlternates;
        }
    }

    /**
     * Sets the value of the enablePointToPointAlternates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnablePointToPointAlternates()
     */
    public void setEnablePointToPointAlternates(Boolean value) {
        this.enablePointToPointAlternates = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH-Indicates the Maximum Number of Expert Solutions to be returned from the Knowledge Base for the provided search criteria
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfExpertSolutions() {
        if (maxNumberOfExpertSolutions == null) {
            return new BigInteger("0");
        } else {
            return maxNumberOfExpertSolutions;
        }
    }

    /**
     * Sets the value of the maxNumberOfExpertSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxNumberOfExpertSolutions()
     */
    public void setMaxNumberOfExpertSolutions(BigInteger value) {
        this.maxNumberOfExpertSolutions = value;
    }

    /**
     * Provider: 1G,1V,1P,ACH-Indicates whether the response will contain Solution result (AirPricingSolution) or Non Solution Result (AirPricingPoints). The default value is false. This attribute cannot be combined with EnablePointToPointSearch, EnablePointToPointAlternates and MaxNumberOfExpertSolutions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSolutionResult() {
        if (solutionResult == null) {
            return false;
        } else {
            return solutionResult;
        }
    }

    /**
     * Sets the value of the solutionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSolutionResult()
     */
    public void setSolutionResult(Boolean value) {
        this.solutionResult = value;
    }

    /**
     * Provider: ACH-This attribute is only supported for ACH .It works in conjunction with the @SolutionResult flag
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferCompleteItinerary() {
        if (preferCompleteItinerary == null) {
            return true;
        } else {
            return preferCompleteItinerary;
        }
    }

    /**
     * Sets the value of the preferCompleteItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPreferCompleteItinerary()
     */
    public void setPreferCompleteItinerary(Boolean value) {
        this.preferCompleteItinerary = value;
    }

    /**
     * Invoke Meta Search.  Valid values are 00 to 99, or D for the default meta search configuration.  When Meta Search not requested, normal LowFareSearch applies.  Supported Providers;  1g/1v/1p
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaOptionIdentifier() {
        return metaOptionIdentifier;
    }

    /**
     * Sets the value of the metaOptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMetaOptionIdentifier()
     */
    public void setMetaOptionIdentifier(String value) {
        this.metaOptionIdentifier = value;
    }

    /**
     * When set to “true”, Upsell information will be returned in the shop response. Provider supported : 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnUpsellFare() {
        if (returnUpsellFare == null) {
            return false;
        } else {
            return returnUpsellFare;
        }
    }

    /**
     * Sets the value of the returnUpsellFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnUpsellFare()
     */
    public void setReturnUpsellFare(Boolean value) {
        this.returnUpsellFare = value;
    }

    /**
     * Set to True to return FareInfoMessageList. Providers supported: 1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeFareInfoMessages() {
        if (includeFareInfoMessages == null) {
            return false;
        } else {
            return includeFareInfoMessages;
        }
    }

    /**
     * Sets the value of the includeFareInfoMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeFareInfoMessages()
     */
    public void setIncludeFareInfoMessages(Boolean value) {
        this.includeFareInfoMessages = value;
    }

    /**
     * When ReturnBrandedFares is set to “false”, Rich Content and Branding will not be returned in the shop response.  When ReturnBrandedFares it is set to “true” or is not sent, Rich Content and Branding will be returned in the shop response.  Provider: 1P/ACH.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnBrandedFares() {
        if (returnBrandedFares == null) {
            return true;
        } else {
            return returnBrandedFares;
        }
    }

    /**
     * Sets the value of the returnBrandedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnBrandedFares()
     */
    public void setReturnBrandedFares(Boolean value) {
        this.returnBrandedFares = value;
    }

    /**
     * A "true" value indicates MultiGDSSearch. Specific provisioning is required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiGDSSearch() {
        if (multiGDSSearch == null) {
            return false;
        } else {
            return multiGDSSearch;
        }
    }

    /**
     * Sets the value of the multiGDSSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMultiGDSSearch()
     */
    public void setMultiGDSSearch(Boolean value) {
        this.multiGDSSearch = value;
    }

    /**
     * If this attribute is set to “true”, Fare Control Manager processing will be invoked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnMM() {
        if (returnMM == null) {
            return false;
        } else {
            return returnMM;
        }
    }

    /**
     * Sets the value of the returnMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnMM()
     */
    public void setReturnMM(Boolean value) {
        this.returnMM = value;
    }

    /**
     * A flag to return fees for ticketing and for various forms of payment. The default is “TicketingOnly” and will return only ticketing fees.  The value “All” will return ticketing fees and the applicable form of payment fees for the form of payment information specified in the request.  “FOPOnly” will return the applicable form of payment fees for the form of payment information specified in the request. Form of payment fees are never included in the total unless specific card details are in the request.Provider notes:ACH - CheckOBFees is valid only for LowFareSearch.  The valid values are “All”, “TicketingOnly” and “None” and the default value is “None”. 1P -The valid values are “All”, “None” and “TicketingOnly”.1G – All four values are supported.1V/RCH – CheckOBFees are not supported.”
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOBFees() {
        return checkOBFees;
    }

    /**
     * Sets the value of the checkOBFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCheckOBFees()
     */
    public void setCheckOBFees(String value) {
        this.checkOBFees = value;
    }

    /**
     *  1 to 3 numeric that defines a Search Control Console filter.This attribute is used to override that filter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNSCC()
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

    /**
     * Returns ChangePenalty and CancelPenalty values at the FareInfo level. If FareRulesFilterCategory is sent FareRulesFilter will be returned at FareInfo level.  Provider: 1G/1V.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFareInfoRules() {
        if (fareInfoRules == null) {
            return false;
        } else {
            return fareInfoRules;
        }
    }

    /**
     * Sets the value of the fareInfoRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFareInfoRules()
     */
    public void setFareInfoRules(Boolean value) {
        this.fareInfoRules = value;
    }

    /**
     * Boolean flag used to request the MostRestrictivePenalties in the response
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMostRestrictivePenalties() {
        if (mostRestrictivePenalties == null) {
            return false;
        } else {
            return mostRestrictivePenalties;
        }
    }

    /**
     * Sets the value of the mostRestrictivePenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMostRestrictivePenalties()
     */
    public void setMostRestrictivePenalties(Boolean value) {
        this.mostRestrictivePenalties = value;
    }

}
