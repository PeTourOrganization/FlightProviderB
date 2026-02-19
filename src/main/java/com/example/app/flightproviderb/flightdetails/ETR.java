
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgencyInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTraveler"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CreditCardAuth" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SupplierLocator" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareCalc"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Ticket" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AuditData" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Restriction" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}WaiverCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageAllowances" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Exchangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TourCode" type="{http://www.travelport.com/schema/air_v54_0}typeTourCode" />
 *       <attribute name="IssuedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="ProviderLocatorCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderLocatorCode" />
 *       <attribute name="IATANumber" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="CountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="TicketingAgentSignOn">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="9"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "agencyInfo",
    "bookingTraveler",
    "formOfPayment",
    "payment",
    "creditCardAuth",
    "supplierLocator",
    "fareCalc",
    "ticket",
    "commission",
    "airPricingInfo",
    "auditData",
    "restriction",
    "waiverCode",
    "baggageAllowances"
})
@XmlRootElement(name = "ETR")
public class ETR {

    /**
     * Identifies the AirReservation LocatorCode
     *                 within the Universal Record
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode")
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * Tracks the various agent/agency information
     * 
     */
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AgencyInfo agencyInfo;
    /**
     * A traveler and all their accompanying data.
     * 
     */
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected BookingTraveler bookingTraveler;
    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<FormOfPayment> formOfPayment;
    /**
     * Payment information - must be used in conjunction with credit card info
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Payment> payment;
    /**
     * This is a container to display detail information of credit card auth. Providers supported: Worldspan.
     * 
     */
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<CreditCardAuth> creditCardAuth;
    /**
     * Locator code on the host carrier system
     * 
     */
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SupplierLocator> supplierLocator;
    /**
     * The complete fare calculation line.
     * 
     */
    @XmlElement(name = "FareCalc", required = true)
    protected String fareCalc;
    /**
     * The ticket that resulted from an air booking
     * 
     */
    @XmlElement(name = "Ticket", required = true)
    protected List<Ticket> ticket;
    /**
     * Identifies the agency commission
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Commission> commission;
    /**
     * Per traveler type pricing breakdown. This will
     *                 reflect the pricing for all travelers of the specified type.
     * 
     */
    @XmlElement(name = "AirPricingInfo")
    protected AirPricingInfo airPricingInfo;
    /**
     * Container for Pricing Audit Data.For providers 1P
     * 
     */
    @XmlElement(name = "AuditData")
    protected AuditData auditData;
    /**
     * Which activities are supported for a particular element
     * 
     */
    @XmlElement(name = "Restriction", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Restriction> restriction;
    /**
     * Waiver code to override fare validations
     * 
     */
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    /**
     * Baggage Allowance Info after Ticketing
     * 
     */
    @XmlElement(name = "BaggageAllowances")
    protected BaggageAllowances baggageAllowances;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    @XmlAttribute(name = "Exchangeable")
    protected Boolean exchangeable;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    /**
     * Ticket issue date.
     * 					Local DATE of PCC only. Time displayed is always T00:00:00.000 as no time returned by host.
     * 
     */
    @XmlAttribute(name = "IssuedDate", required = true)
    protected String issuedDate;
    /**
     * Whether the ticket was issued as bulk.
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * Contains the Provider Code of the provider that houses this ETR.
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * Contains the Locator Code of the Provider Reservation that houses this ETR.
     * 
     */
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    /**
     * Contains the IATA Number of the agent initiating the request.
     * 
     */
    @XmlAttribute(name = "IATANumber")
    protected String iataNumber;
    /**
     * Contain Pseudo City, city/office number, branch ID, etc.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * Contains Ticketed PCC’s Country code.
     * 
     */
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    /**
     * Contains the Plating Carrier of this ETR.
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * Contains the SignOn Agent of this ETR.
     * 
     */
    @XmlAttribute(name = "TicketingAgentSignOn")
    protected String ticketingAgentSignOn;
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
     * Identifies the AirReservation LocatorCode
     *                 within the Universal Record
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     * @see #getAirReservationLocatorCode()
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Tracks the various agent/agency information
     * 
     * @return
     *     possible object is
     *     {@link AgencyInfo }
     *     
     */
    public AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInfo }
     *     
     * @see #getAgencyInfo()
     */
    public void setAgencyInfo(AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * A traveler and all their accompanying data.
     * 
     * @return
     *     possible object is
     *     {@link BookingTraveler }
     *     
     */
    public BookingTraveler getBookingTraveler() {
        return bookingTraveler;
    }

    /**
     * Sets the value of the bookingTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTraveler }
     *     
     * @see #getBookingTraveler()
     */
    public void setBookingTraveler(BookingTraveler value) {
        this.bookingTraveler = value;
    }

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
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
     * Payment information - must be used in conjunction with credit card info
     * 
     * Gets the value of the payment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * </p>
     * 
     * 
     * @return
     *     The value of the payment property.
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<>();
        }
        return this.payment;
    }

    /**
     * This is a container to display detail information of credit card auth. Providers supported: Worldspan.
     * 
     * Gets the value of the creditCardAuth property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardAuth property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreditCardAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardAuth }
     * </p>
     * 
     * 
     * @return
     *     The value of the creditCardAuth property.
     */
    public List<CreditCardAuth> getCreditCardAuth() {
        if (creditCardAuth == null) {
            creditCardAuth = new ArrayList<>();
        }
        return this.creditCardAuth;
    }

    /**
     * Locator code on the host carrier system
     * 
     * Gets the value of the supplierLocator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * </p>
     * 
     * 
     * @return
     *     The value of the supplierLocator property.
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<>();
        }
        return this.supplierLocator;
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
     * The ticket that resulted from an air booking
     * 
     * Gets the value of the ticket property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ticket }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticket property.
     */
    public List<Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<>();
        }
        return this.ticket;
    }

    /**
     * Identifies the agency commission
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
     * Per traveler type pricing breakdown. This will
     *                 reflect the pricing for all travelers of the specified type.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingInfo }
     *     
     */
    public AirPricingInfo getAirPricingInfo() {
        return airPricingInfo;
    }

    /**
     * Sets the value of the airPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingInfo }
     *     
     * @see #getAirPricingInfo()
     */
    public void setAirPricingInfo(AirPricingInfo value) {
        this.airPricingInfo = value;
    }

    /**
     * Container for Pricing Audit Data.For providers 1P
     * 
     * @return
     *     possible object is
     *     {@link AuditData }
     *     
     */
    public AuditData getAuditData() {
        return auditData;
    }

    /**
     * Sets the value of the auditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditData }
     *     
     * @see #getAuditData()
     */
    public void setAuditData(AuditData value) {
        this.auditData = value;
    }

    /**
     * Which activities are supported for a particular element
     * 
     * Gets the value of the restriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * </p>
     * 
     * 
     * @return
     *     The value of the restriction property.
     */
    public List<Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<>();
        }
        return this.restriction;
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
     * Baggage Allowance Info after Ticketing
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
     * Gets the value of the refundable property.
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
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the exchangeable property.
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
     */
    public void setExchangeable(Boolean value) {
        this.exchangeable = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Ticket issue date.
     * 					Local DATE of PCC only. Time displayed is always T00:00:00.000 as no time returned by host.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssuedDate()
     */
    public void setIssuedDate(String value) {
        this.issuedDate = value;
    }

    /**
     * Whether the ticket was issued as bulk.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkTicket() {
        return bulkTicket;
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
     * Contains the Provider Code of the provider that houses this ETR.
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
     * @see #getProviderCode()
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Contains the Locator Code of the Provider Reservation that houses this ETR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderLocatorCode()
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Contains the IATA Number of the agent initiating the request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATANumber()
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Contain Pseudo City, city/office number, branch ID, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPseudoCityCode()
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Contains Ticketed PCC’s Country code.
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
     * @see #getCountryCode()
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Contains the Plating Carrier of this ETR.
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
     * Contains the SignOn Agent of this ETR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingAgentSignOn() {
        return ticketingAgentSignOn;
    }

    /**
     * Sets the value of the ticketingAgentSignOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketingAgentSignOn()
     */
    public void setTicketingAgentSignOn(String value) {
        this.ticketingAgentSignOn = value;
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

}
