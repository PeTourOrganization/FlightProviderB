
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareStatus" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareInfoRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareCalc" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PassengerType" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}WaiverCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PaymentRef" maxOccurs="999" minOccurs="0"/>
 *         <element name="ChangePenalty" type="{http://www.travelport.com/schema/air_v54_0}typeFarePenalty" maxOccurs="999" minOccurs="0"/>
 *         <element name="CancelPenalty" type="{http://www.travelport.com/schema/air_v54_0}typeFarePenalty" maxOccurs="999" minOccurs="0"/>
 *         <element name="NoShowPenalty" type="{http://www.travelport.com/schema/air_v54_0}typeFarePenalty" maxOccurs="999" minOccurs="0"/>
 *         <element name="MostRestrictivePenalties" type="{http://www.travelport.com/schema/air_v54_0}typeMostRestrictivePenalties" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Adjustment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Yield" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketingModifiersRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentPricingModifiers" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightOptionsList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageAllowances" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRulesFilter" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PolicyCodesList" minOccurs="0"/>
 *         <element name="PriceChange" type="{http://www.travelport.com/schema/air_v54_0}PriceChangeType" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ActionDetails" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/air_v54_0}attrPolicyMarking"/>
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CommandKey">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="10"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AmountType" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to32" />
 *       <attribute name="IncludesVAT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ExchangeAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Exchangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LatestTicketingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PricingMethod" use="required" type="{http://www.travelport.com/schema/air_v54_0}typePricingMethod" />
 *       <attribute name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v54_0}typeEticketability" />
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AirPricingInfoGroup" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="TotalNetPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Ticketed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PricingType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="25"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TrueLastDateToTicket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareCalculationInd">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Cat35Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareInfo",
    "fareStatus",
    "fareInfoRef",
    "bookingInfo",
    "taxInfo",
    "fareCalc",
    "passengerType",
    "bookingTravelerRef",
    "waiverCode",
    "paymentRef",
    "changePenalty",
    "cancelPenalty",
    "noShowPenalty",
    "mostRestrictivePenalties",
    "feeInfo",
    "adjustment",
    "yield",
    "airPricingModifiers",
    "ticketingModifiersRef",
    "airSegmentPricingModifiers",
    "flightOptionsList",
    "baggageAllowances",
    "fareRulesFilter",
    "policyCodesList",
    "priceChange",
    "actionDetails",
    "commission"
})
@XmlRootElement(name = "AirPricingInfo")
public class AirPricingInfo {

    /**
     * Information about this fare component
     * 
     */
    @XmlElement(name = "FareInfo")
    protected List<FareInfo> fareInfo;
    /**
     * Denotes the status of a particular fare.
     * 
     */
    @XmlElement(name = "FareStatus")
    protected FareStatus fareStatus;
    /**
     * Reference to a complete FareInfo from a
     *                 shared list
     * 
     */
    @XmlElement(name = "FareInfoRef")
    protected List<FareInfoRef> fareInfoRef;
    /**
     * Links segments and fares together
     * 
     */
    @XmlElement(name = "BookingInfo")
    protected List<BookingInfo> bookingInfo;
    /**
     * The tax information for a
     * 
     */
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    /**
     * The complete fare calculation line.
     * 
     */
    @XmlElement(name = "FareCalc")
    protected String fareCalc;
    /**
     * The passenger type details associated to a fare.
     * 
     */
    @XmlElement(name = "PassengerType")
    protected List<PassengerType> passengerType;
    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    /**
     * Waiver code to override fare validations
     * 
     */
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    /**
     * The reference to the Payment if Air Pricing
     *                             is charged
     * 
     */
    @XmlElement(name = "PaymentRef")
    protected List<PaymentRef2> paymentRef;
    /**
     * The penalty (if any) to change the itinerary
     * 
     */
    @XmlElement(name = "ChangePenalty")
    protected List<TypeFarePenalty> changePenalty;
    /**
     * The penalty (if any) to cancel the fare
     * 
     */
    @XmlElement(name = "CancelPenalty")
    protected List<TypeFarePenalty> cancelPenalty;
    /**
     * The NoShow penalty (if any)
     * 
     */
    @XmlElement(name = "NoShowPenalty")
    protected List<TypeFarePenalty> noShowPenalty;
    /**
     * Contain CAT16 Most Restrictive Penalties.
     * 
     */
    @XmlElement(name = "MostRestrictivePenalties")
    protected TypeMostRestrictivePenalties mostRestrictivePenalties;
    /**
     * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
     * 
     */
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    /**
     * An indentifier which indentifies adjustment made
     *                 on original pricing. It can a flat amount or percentage of original
     *                 price. The value of Amount/Percent can be negetive. Negative value
     *                 implies a discount.
     * 
     */
    @XmlElement(name = "Adjustment")
    protected List<Adjustment> adjustment;
    /**
     * An identifier which identifies yield made
     *                 on original pricing. It can be a flat amount of original
     *                 price. The value of Amount can be negative. Negative value
     *                 implies a discount.
     * 
     */
    @XmlElement(name = "Yield")
    protected List<Yield> yield;
    /**
     * Controls and switches for a Air Search
     *                 request that contains Pricing Information
     * 
     */
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    /**
     * Reference to a shared list of Ticketing
     *                 Modifers
     * 
     */
    @XmlElement(name = "TicketingModifiersRef")
    protected List<TicketingModifiersRef> ticketingModifiersRef;
    /**
     * Specifies modifiers that a particular
     *                 segment should be priced in. If this is used, then there must be one
     *                 for each AirSegment in the AirItinerary.
     * 
     */
    @XmlElement(name = "AirSegmentPricingModifiers")
    protected List<AirSegmentPricingModifiers> airSegmentPricingModifiers;
    /**
     * List of Flight Options for the itinerary.
     * 
     */
    @XmlElement(name = "FlightOptionsList")
    protected FlightOptionsList flightOptionsList;
    /**
     * Details of Baggage allowance
     * 
     */
    @XmlElement(name = "BaggageAllowances")
    protected BaggageAllowances baggageAllowances;
    /**
     * Fare Rules Filter about this fare component. Applicable Providers are 1P,1G,1V.
     * 
     */
    @XmlElement(name = "FareRulesFilter")
    protected FareRulesFilter fareRulesFilter;
    /**
     * A list of codes that indicate why an item was determined to be ‘out of policy’
     * 
     */
    @XmlElement(name = "PolicyCodesList")
    protected PolicyCodesList policyCodesList;
    /**
     * Indicates a price change is found in Fare Control Manager
     * 
     */
    @XmlElement(name = "PriceChange")
    protected List<PriceChangeType> priceChange;
    /**
     * Information related to the storing of the fare: Agent, Date and Action for Provider: 1P
     * 
     */
    @XmlElement(name = "ActionDetails")
    protected ActionDetails actionDetails;
    /**
     * Allows an agency to update the commission
     *                      to a new or different commission rate which will be applied at
     *                      time of ticketing. The commission Modifier allows the user
     *                      specify how the commission change is to applied
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Commission> commission;
    /**
     * The IATA location code for this origination of this entity.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * The IATA location code for this destination of this entity.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The command identifier used when this is in
     *                         response to an AirPricingCommand. Not used in any request
     *                         processing.
     * 
     */
    @XmlAttribute(name = "CommandKey")
    protected String commandKey;
    /**
     * This field displays type of payment amount when it is non-monetary. Presently available/supported value is "Flight Pass Credits".
     * 
     */
    @XmlAttribute(name = "AmountType")
    protected String amountType;
    /**
     * Indicates whether the Base Price
     *                         includes VAT.
     * 
     */
    @XmlAttribute(name = "IncludesVAT")
    protected Boolean includesVAT;
    /**
     * The amount to pay to cover the exchange of the
     *                         fare (includes penalties).
     * 
     */
    @XmlAttribute(name = "ExchangeAmount")
    protected String exchangeAmount;
    /**
     * The amount forfeited when the fare is
     *                         exchanged.
     * 
     */
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    /**
     * Indicates whether the fare is refundable
     * 
     */
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    /**
     * Indicates whether the fare is
     *                         exchangeable
     * 
     */
    @XmlAttribute(name = "Exchangeable")
    protected Boolean exchangeable;
    /**
     * The latest date/time at which this pricing
     *                         information is valid
     * 
     */
    @XmlAttribute(name = "LatestTicketingTime")
    protected String latestTicketingTime;
    @XmlAttribute(name = "PricingMethod", required = true)
    protected TypePricingMethod pricingMethod;
    /**
     * A security value used to guarantee that the
     *                         pricing data sent in matches the pricing data previously returned
     * 
     */
    @XmlAttribute(name = "Checksum")
    protected String checksum;
    /**
     * The E-Ticketability of this AirPricing
     * 
     */
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    /**
     * The Plating Carrier for this journey
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * This attribute is added to support multiple
     *                         store fare in Host. All AirPricingInfo with same group number will
     *                         be stored together.
     * 
     */
    @XmlAttribute(name = "AirPricingInfoGroup")
    protected Integer airPricingInfoGroup;
    /**
     * The total price of a negotiated fare.
     * 
     */
    @XmlAttribute(name = "TotalNetPrice")
    protected String totalNetPrice;
    /**
     * Indicates if the associated stored fare
     *                         is ticketed or not.
     * 
     */
    @XmlAttribute(name = "Ticketed")
    protected Boolean ticketed;
    /**
     * Indicates the Pricing Type used.
     *                         The possible values are TicketRecord, StoredFare, PricingInstruction.
     * 
     */
    @XmlAttribute(name = "PricingType")
    protected String pricingType;
    /**
     * This date indicates the true last date/time to ticket for the fare. This date comes from the filed fare . There is no guarantee the fare will still be available on that date or that the fare amount may change.  
     *     It is merely the last date to purchase a ticket based on the carriers fare rules at the time the itinerary was quoted and stored
     * 
     */
    @XmlAttribute(name = "TrueLastDateToTicket")
    protected String trueLastDateToTicket;
    /**
     * Fare calculation that was used to price the itinerary.
     * 
     */
    @XmlAttribute(name = "FareCalculationInd")
    protected String fareCalculationInd;
    /**
     * A true value indicates that the fare has a Cat35 rule.
     * 				A false valud indicates that the fare does not have a Cat35 rule
     * 
     */
    @XmlAttribute(name = "Cat35Indicator")
    protected Boolean cat35Indicator;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * The total price for this entity including base price and all taxes.
     * 
     */
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    /**
     * Represents the base price for this entity. This does not include any taxes or surcharges.
     * 
     */
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    /**
     * The Converted total price in Default Currency for this entity including base price and all taxes.
     * 
     */
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    /**
     * The Converted base price in Default Currency for this entity. This does not include any taxes or surcharges.
     * 
     */
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    /**
     * Represents the base price in the related currency for this entity. This does not include any taxes or surcharges.
     * 
     */
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    /**
     * The aggregated amount of all the taxes that are associated with this entity. See the associated TaxInfo array for a breakdown of the individual taxes.
     * 
     */
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    /**
     * The aggregated amount of all the fees that are associated with this entity. See the associated FeeInfo array for a breakdown of the individual fees.
     * 
     */
    @XmlAttribute(name = "Fees")
    protected String fees;
    /**
     * The total cost for all optional services.
     * 
     */
    @XmlAttribute(name = "Services")
    protected String services;
    /**
     * The Converted tax amount in Default Currency.
     * 
     */
    @XmlAttribute(name = "ApproximateTaxes")
    protected String approximateTaxes;
    /**
     * The Converted fee amount in Default Currency.
     * 
     */
    @XmlAttribute(name = "ApproximateFees")
    protected String approximateFees;
    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     */
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     */
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;
    /**
     * This attribute will be used to indicate if a fare or rate has been determined to be ‘in policy’ based on the associated policy settings.
     * 
     */
    @XmlAttribute(name = "InPolicy")
    protected Boolean inPolicy;
    /**
     * This attribute is used to indicate if the vendors responsible for the fare or rate being returned have been determined to be ‘preferred’ based on the associated policy settings.
     * 
     */
    @XmlAttribute(name = "PreferredOption")
    protected Boolean preferredOption;

    /**
     * Information about this fare component
     * 
     * Gets the value of the fareInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareInfo property.
     */
    public List<FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<>();
        }
        return this.fareInfo;
    }

    /**
     * Denotes the status of a particular fare.
     * 
     * @return
     *     possible object is
     *     {@link FareStatus }
     *     
     */
    public FareStatus getFareStatus() {
        return fareStatus;
    }

    /**
     * Sets the value of the fareStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStatus }
     *     
     * @see #getFareStatus()
     */
    public void setFareStatus(FareStatus value) {
        this.fareStatus = value;
    }

    /**
     * Reference to a complete FareInfo from a
     *                 shared list
     * 
     * Gets the value of the fareInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareInfoRef property.
     */
    public List<FareInfoRef> getFareInfoRef() {
        if (fareInfoRef == null) {
            fareInfoRef = new ArrayList<>();
        }
        return this.fareInfoRef;
    }

    /**
     * Links segments and fares together
     * 
     * Gets the value of the bookingInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingInfo property.
     */
    public List<BookingInfo> getBookingInfo() {
        if (bookingInfo == null) {
            bookingInfo = new ArrayList<>();
        }
        return this.bookingInfo;
    }

    /**
     * The tax information for a
     * 
     * Gets the value of the taxInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxInfo property.
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<>();
        }
        return this.taxInfo;
    }

    /**
     * The complete fare calculation line.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalc() {
        return fareCalc;
    }

    /**
     * Sets the value of the fareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareCalc()
     */
    public void setFareCalc(String value) {
        this.fareCalc = value;
    }

    /**
     * The passenger type details associated to a fare.
     * 
     * Gets the value of the passengerType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerType }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerType property.
     */
    public List<PassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<>();
        }
        return this.passengerType;
    }

    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerRef property.
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Waiver code to override fare validations
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     * @see #getWaiverCode()
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * The reference to the Payment if Air Pricing
     *                             is charged
     * 
     * Gets the value of the paymentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRef2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentRef property.
     */
    public List<PaymentRef2> getPaymentRef() {
        if (paymentRef == null) {
            paymentRef = new ArrayList<>();
        }
        return this.paymentRef;
    }

    /**
     * The penalty (if any) to change the itinerary
     * 
     * Gets the value of the changePenalty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changePenalty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChangePenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFarePenalty }
     * </p>
     * 
     * 
     * @return
     *     The value of the changePenalty property.
     */
    public List<TypeFarePenalty> getChangePenalty() {
        if (changePenalty == null) {
            changePenalty = new ArrayList<>();
        }
        return this.changePenalty;
    }

    /**
     * The penalty (if any) to cancel the fare
     * 
     * Gets the value of the cancelPenalty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPenalty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCancelPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFarePenalty }
     * </p>
     * 
     * 
     * @return
     *     The value of the cancelPenalty property.
     */
    public List<TypeFarePenalty> getCancelPenalty() {
        if (cancelPenalty == null) {
            cancelPenalty = new ArrayList<>();
        }
        return this.cancelPenalty;
    }

    /**
     * The NoShow penalty (if any)
     * 
     * Gets the value of the noShowPenalty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noShowPenalty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNoShowPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFarePenalty }
     * </p>
     * 
     * 
     * @return
     *     The value of the noShowPenalty property.
     */
    public List<TypeFarePenalty> getNoShowPenalty() {
        if (noShowPenalty == null) {
            noShowPenalty = new ArrayList<>();
        }
        return this.noShowPenalty;
    }

    /**
     * Contain CAT16 Most Restrictive Penalties.
     * 
     * @return
     *     possible object is
     *     {@link TypeMostRestrictivePenalties }
     *     
     */
    public TypeMostRestrictivePenalties getMostRestrictivePenalties() {
        return mostRestrictivePenalties;
    }

    /**
     * Sets the value of the mostRestrictivePenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMostRestrictivePenalties }
     *     
     * @see #getMostRestrictivePenalties()
     */
    public void setMostRestrictivePenalties(TypeMostRestrictivePenalties value) {
        this.mostRestrictivePenalties = value;
    }

    /**
     * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
     * 
     * Gets the value of the feeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFeeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the feeInfo property.
     */
    public List<TypeFeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<>();
        }
        return this.feeInfo;
    }

    /**
     * An indentifier which indentifies adjustment made
     *                 on original pricing. It can a flat amount or percentage of original
     *                 price. The value of Amount/Percent can be negetive. Negative value
     *                 implies a discount.
     * 
     * Gets the value of the adjustment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment }
     * </p>
     * 
     * 
     * @return
     *     The value of the adjustment property.
     */
    public List<Adjustment> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<>();
        }
        return this.adjustment;
    }

    /**
     * An identifier which identifies yield made
     *                 on original pricing. It can be a flat amount of original
     *                 price. The value of Amount can be negative. Negative value
     *                 implies a discount.
     * 
     * Gets the value of the yield property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yield property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Yield }
     * </p>
     * 
     * 
     * @return
     *     The value of the yield property.
     */
    public List<Yield> getYield() {
        if (yield == null) {
            yield = new ArrayList<>();
        }
        return this.yield;
    }

    /**
     * Controls and switches for a Air Search
     *                 request that contains Pricing Information
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
     * Reference to a shared list of Ticketing
     *                 Modifers
     * 
     * Gets the value of the ticketingModifiersRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiersRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketingModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingModifiersRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketingModifiersRef property.
     */
    public List<TicketingModifiersRef> getTicketingModifiersRef() {
        if (ticketingModifiersRef == null) {
            ticketingModifiersRef = new ArrayList<>();
        }
        return this.ticketingModifiersRef;
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
     * List of Flight Options for the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link FlightOptionsList }
     *     
     */
    public FlightOptionsList getFlightOptionsList() {
        return flightOptionsList;
    }

    /**
     * Sets the value of the flightOptionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightOptionsList }
     *     
     * @see #getFlightOptionsList()
     */
    public void setFlightOptionsList(FlightOptionsList value) {
        this.flightOptionsList = value;
    }

    /**
     * Details of Baggage allowance
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowances }
     *     
     */
    public BaggageAllowances getBaggageAllowances() {
        return baggageAllowances;
    }

    /**
     * Sets the value of the baggageAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowances }
     *     
     * @see #getBaggageAllowances()
     */
    public void setBaggageAllowances(BaggageAllowances value) {
        this.baggageAllowances = value;
    }

    /**
     * Fare Rules Filter about this fare component. Applicable Providers are 1P,1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesFilter }
     *     
     */
    public FareRulesFilter getFareRulesFilter() {
        return fareRulesFilter;
    }

    /**
     * Sets the value of the fareRulesFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesFilter }
     *     
     * @see #getFareRulesFilter()
     */
    public void setFareRulesFilter(FareRulesFilter value) {
        this.fareRulesFilter = value;
    }

    /**
     * A list of codes that indicate why an item was determined to be ‘out of policy’
     * 
     * @return
     *     possible object is
     *     {@link PolicyCodesList }
     *     
     */
    public PolicyCodesList getPolicyCodesList() {
        return policyCodesList;
    }

    /**
     * Sets the value of the policyCodesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyCodesList }
     *     
     * @see #getPolicyCodesList()
     */
    public void setPolicyCodesList(PolicyCodesList value) {
        this.policyCodesList = value;
    }

    /**
     * Indicates a price change is found in Fare Control Manager
     * 
     * Gets the value of the priceChange property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceChange property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceChangeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceChange property.
     */
    public List<PriceChangeType> getPriceChange() {
        if (priceChange == null) {
            priceChange = new ArrayList<>();
        }
        return this.priceChange;
    }

    /**
     * Information related to the storing of the fare: Agent, Date and Action for Provider: 1P
     * 
     * @return
     *     possible object is
     *     {@link ActionDetails }
     *     
     */
    public ActionDetails getActionDetails() {
        return actionDetails;
    }

    /**
     * Sets the value of the actionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetails }
     *     
     * @see #getActionDetails()
     */
    public void setActionDetails(ActionDetails value) {
        this.actionDetails = value;
    }

    /**
     * Allows an agency to update the commission
     *                      to a new or different commission rate which will be applied at
     *                      time of ticketing. The commission Modifier allows the user
     *                      specify how the commission change is to applied
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * The IATA location code for this origination of this entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * The IATA location code for this destination of this entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * The command identifier used when this is in
     *                         response to an AirPricingCommand. Not used in any request
     *                         processing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandKey() {
        return commandKey;
    }

    /**
     * Sets the value of the commandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommandKey()
     */
    public void setCommandKey(String value) {
        this.commandKey = value;
    }

    /**
     * This field displays type of payment amount when it is non-monetary. Presently available/supported value is "Flight Pass Credits".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAmountType()
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * Indicates whether the Base Price
     *                         includes VAT.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesVAT() {
        return includesVAT;
    }

    /**
     * Sets the value of the includesVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludesVAT()
     */
    public void setIncludesVAT(Boolean value) {
        this.includesVAT = value;
    }

    /**
     * The amount to pay to cover the exchange of the
     *                         fare (includes penalties).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAmount() {
        return exchangeAmount;
    }

    /**
     * Sets the value of the exchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExchangeAmount()
     */
    public void setExchangeAmount(String value) {
        this.exchangeAmount = value;
    }

    /**
     * The amount forfeited when the fare is
     *                         exchanged.
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
     * @see #getForfeitAmount()
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
    }

    /**
     * Indicates whether the fare is refundable
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRefundable()
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Indicates whether the fare is
     *                         exchangeable
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExchangeable()
     */
    public void setExchangeable(Boolean value) {
        this.exchangeable = value;
    }

    /**
     * The latest date/time at which this pricing
     *                         information is valid
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTicketingTime() {
        return latestTicketingTime;
    }

    /**
     * Sets the value of the latestTicketingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLatestTicketingTime()
     */
    public void setLatestTicketingTime(String value) {
        this.latestTicketingTime = value;
    }

    /**
     * Gets the value of the pricingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TypePricingMethod }
     *     
     */
    public TypePricingMethod getPricingMethod() {
        return pricingMethod;
    }

    /**
     * Sets the value of the pricingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePricingMethod }
     *     
     */
    public void setPricingMethod(TypePricingMethod value) {
        this.pricingMethod = value;
    }

    /**
     * A security value used to guarantee that the
     *                         pricing data sent in matches the pricing data previously returned
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChecksum()
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * The E-Ticketability of this AirPricing
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     * @see #getETicketability()
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
    }

    /**
     * The Plating Carrier for this journey
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Provider reservation reference key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderReservationInfoRef()
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * This attribute is added to support multiple
     *                         store fare in Host. All AirPricingInfo with same group number will
     *                         be stored together.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirPricingInfoGroup() {
        return airPricingInfoGroup;
    }

    /**
     * Sets the value of the airPricingInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getAirPricingInfoGroup()
     */
    public void setAirPricingInfoGroup(Integer value) {
        this.airPricingInfoGroup = value;
    }

    /**
     * The total price of a negotiated fare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNetPrice() {
        return totalNetPrice;
    }

    /**
     * Sets the value of the totalNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTotalNetPrice()
     */
    public void setTotalNetPrice(String value) {
        this.totalNetPrice = value;
    }

    /**
     * Indicates if the associated stored fare
     *                         is ticketed or not.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketed() {
        return ticketed;
    }

    /**
     * Sets the value of the ticketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTicketed()
     */
    public void setTicketed(Boolean value) {
        this.ticketed = value;
    }

    /**
     * Indicates the Pricing Type used.
     *                         The possible values are TicketRecord, StoredFare, PricingInstruction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPricingType()
     */
    public void setPricingType(String value) {
        this.pricingType = value;
    }

    /**
     * This date indicates the true last date/time to ticket for the fare. This date comes from the filed fare . There is no guarantee the fare will still be available on that date or that the fare amount may change.  
     *     It is merely the last date to purchase a ticket based on the carriers fare rules at the time the itinerary was quoted and stored
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLastDateToTicket() {
        return trueLastDateToTicket;
    }

    /**
     * Sets the value of the trueLastDateToTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrueLastDateToTicket()
     */
    public void setTrueLastDateToTicket(String value) {
        this.trueLastDateToTicket = value;
    }

    /**
     * Fare calculation that was used to price the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalculationInd() {
        return fareCalculationInd;
    }

    /**
     * Sets the value of the fareCalculationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareCalculationInd()
     */
    public void setFareCalculationInd(String value) {
        this.fareCalculationInd = value;
    }

    /**
     * A true value indicates that the fare has a Cat35 rule.
     * 				A false valud indicates that the fare does not have a Cat35 rule
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat35Indicator() {
        return cat35Indicator;
    }

    /**
     * Sets the value of the cat35Indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat35Indicator()
     */
    public void setCat35Indicator(Boolean value) {
        this.cat35Indicator = value;
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

    /**
     * The total price for this entity including base price and all taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTotalPrice()
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Represents the base price for this entity. This does not include any taxes or surcharges.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBasePrice()
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * The Converted total price in Default Currency for this entity including base price and all taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateTotalPrice()
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * The Converted base price in Default Currency for this entity. This does not include any taxes or surcharges.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateBasePrice()
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Represents the base price in the related currency for this entity. This does not include any taxes or surcharges.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEquivalentBasePrice()
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * The aggregated amount of all the taxes that are associated with this entity. See the associated TaxInfo array for a breakdown of the individual taxes.
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
     * The aggregated amount of all the fees that are associated with this entity. See the associated FeeInfo array for a breakdown of the individual fees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFees()
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * The total cost for all optional services.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServices()
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * The Converted tax amount in Default Currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTaxes() {
        return approximateTaxes;
    }

    /**
     * Sets the value of the approximateTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateTaxes()
     */
    public void setApproximateTaxes(String value) {
        this.approximateTaxes = value;
    }

    /**
     * The Converted fee amount in Default Currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateFees() {
        return approximateFees;
    }

    /**
     * Sets the value of the approximateFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApproximateFees()
     */
    public void setApproximateFees(String value) {
        this.approximateFees = value;
    }

    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     * @see #getElStat()
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeyOverride()
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

    /**
     * This attribute will be used to indicate if a fare or rate has been determined to be ‘in policy’ based on the associated policy settings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPolicy() {
        return inPolicy;
    }

    /**
     * Sets the value of the inPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInPolicy()
     */
    public void setInPolicy(Boolean value) {
        this.inPolicy = value;
    }

    /**
     * This attribute is used to indicate if the vendors responsible for the fare or rate being returned have been determined to be ‘preferred’ based on the associated policy settings.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPreferredOption()
     */
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

}
