
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareTicketDesignator" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketingCode" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareSurcharge" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ContractCode" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Endorsement" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageAllowance" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleKey" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleFailureInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRemarkRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Brand" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" minOccurs="0"/>
 *         <element name="FareAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ChangePenalty" type="{http://www.travelport.com/schema/air_v54_0}typeFarePenalty" minOccurs="0"/>
 *         <element name="CancelPenalty" type="{http://www.travelport.com/schema/air_v54_0}typeFarePenalty" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRulesFilter" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PassengerTypeCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="EffectiveDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="PrivateFare" type="{http://www.travelport.com/schema/air_v54_0}typePrivateFare" />
 *       <attribute name="NegotiatedFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TourCode" type="{http://www.travelport.com/schema/air_v54_0}typeTourCode" />
 *       <attribute name="WaiverCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="FareFamily" type="{http://www.travelport.com/schema/common_v54_0}typeFareFamily" />
 *       <attribute name="PromotionalFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="CarCode" type="{http://www.travelport.com/schema/air_v54_0}typeCarCode" />
 *       <attribute name="ValueCode" type="{http://www.travelport.com/schema/air_v54_0}typeValueCode" />
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="InclusiveTour" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="TaxAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareTicketDesignator",
    "ticketingCode",
    "fareSurcharge",
    "accountCode",
    "contractCode",
    "endorsement",
    "baggageAllowance",
    "fareRuleKey",
    "fareRuleFailureInfo",
    "fareRemarkRef",
    "brand",
    "commission",
    "fareAttributes",
    "changePenalty",
    "cancelPenalty",
    "fareRulesFilter"
})
@XmlRootElement(name = "FareInfo")
public class FareInfo {

    /**
     * Ticket Designator used to further qualify a
     *                 Fare
     * 
     */
    @XmlElement(name = "FareTicketDesignator")
    protected List<FareTicketDesignator> fareTicketDesignator;
    /**
     * Ticketing Code used to apply commissions.
     * 
     */
    @XmlElement(name = "TicketingCode")
    protected List<TicketingCode> ticketingCode;
    /**
     * Surcharges for a fare component
     * 
     */
    @XmlElement(name = "FareSurcharge")
    protected List<FareSurcharge> fareSurcharge;
    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AccountCode> accountCode;
    /**
     * Some private fares (non-ATPCO) are secured to a
     *                 contract code.
     * 
     */
    @XmlElement(name = "ContractCode")
    protected List<ContractCode> contractCode;
    /**
     * Restrictions or instructions about the fare or ticket
     * 
     */
    @XmlElement(name = "Endorsement", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Endorsement> endorsement;
    /**
     * Free Baggage Allowance
     * 
     */
    @XmlElement(name = "BaggageAllowance")
    protected BaggageAllowance baggageAllowance;
    /**
     * The Fare Rule requested using a Key. The key is
     *                 typically a provider specific string which is required to make a
     *                 following Air Fare Rule Request. This Key is returned in Low Fare
     *                 Shop or Air Price Response
     * 
     */
    @XmlElement(name = "FareRuleKey")
    protected FareRuleKey fareRuleKey;
    /**
     * Returns fare rule failure reason codes when
     *                 fare basis code is forced.
     * 
     */
    @XmlElement(name = "FareRuleFailureInfo")
    protected FareRuleFailureInfo fareRuleFailureInfo;
    @XmlElement(name = "FareRemarkRef")
    protected List<FareRemarkRef> fareRemarkRef;
    /**
     * Commercially recognized product offered by an airline
     * 
     */
    @XmlElement(name = "Brand")
    protected Brand brand;
    /**
     * Specifies the Commission for Agency for a particular Fare component. Apllicable Providers are 1G and 1V.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Commission commission;
    /**
     * Returns all fare attributes separated by pipe ‘|’. Attribute information is returned by comma separated values for each attribute. These information include attribute number, chargeable indicator and supplementary info. Attribute numbers: 1 - Checked Bag, 2 - Carry On, 3 - Rebooking, 4 - Refund, 5 - Seats, 6 - Meals, 7 - WiFi. Chargeable Indicator: Y - Chargeable, N - Not Chargeable. Supplementary Information that will be returned is : For 1 and 2 - Baggage weights. For 3 – Changeable Info. For 4 – Refundable Info. For 5 - Seat description. For 6 – Meal description. For 7 – WiFi description. Example: 1,Y,23|1,N,50|2,N,8|3,N,CHANGEABLE|4,Y,REFUNDABLE|5,N,SEATING|5,N,MIDDLE|6,Y,SOFT DRINK|6,N,ALCOHOLIC DRINK|6,Y,SNACK|7,X,WIFI
     * 
     */
    @XmlElement(name = "FareAttributes")
    protected String fareAttributes;
    /**
     * The penalty (if any) to change the itinerary
     * 
     */
    @XmlElement(name = "ChangePenalty")
    protected TypeFarePenalty changePenalty;
    /**
     * The penalty (if any) to cancel the fare
     * 
     */
    @XmlElement(name = "CancelPenalty")
    protected TypeFarePenalty cancelPenalty;
    /**
     * Fare Rules Filter about this fare component. Applicable Providers are 1P,1G,1V.
     * 
     */
    @XmlElement(name = "FareRulesFilter")
    protected FareRulesFilter fareRulesFilter;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The fare basis code for this fare
     * 
     */
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    /**
     * The PTC that is associated with this fare.
     * 
     */
    @XmlAttribute(name = "PassengerTypeCode", required = true)
    protected String passengerTypeCode;
    /**
     * Returns the airport or city code that
     *                         defines the origin market for this fare.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * Returns the airport or city code that
     *                         defines the destination market for this fare.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    /**
     * Returns the date on which this fare was
     *                         quoted
     * 
     */
    @XmlAttribute(name = "EffectiveDate", required = true)
    protected String effectiveDate;
    /**
     * Returns the departure date of the first
     *                         segment that uses this fare.
     * 
     */
    @XmlAttribute(name = "TravelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar travelDate;
    /**
     * Returns the departure date of the first
     *                         segment of the journey.
     * 
     */
    @XmlAttribute(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "PrivateFare")
    protected TypePrivateFare privateFare;
    /**
     * Identifies the fare as a Negotiated
     *                         Fare.
     * 
     */
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "WaiverCode")
    protected String waiverCode;
    /**
     * Fare not valid before this date.
     * 
     */
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidBefore;
    /**
     * Fare not valid after this date.
     * 
     */
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidAfter;
    /**
     * Provider PseudoCityCode associated with
     *                         private fare.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * An alpha-numeric string which denotes fare
     *                         family. Some carriers may return this in lieu of or in addition to
     *                         the CabinClass.
     * 
     */
    @XmlAttribute(name = "FareFamily")
    protected String fareFamily;
    /**
     * Boolean to describe whether the Fare is Promotional fare or not.
     * 
     */
    @XmlAttribute(name = "PromotionalFare")
    protected Boolean promotionalFare;
    @XmlAttribute(name = "CarCode")
    protected String carCode;
    @XmlAttribute(name = "ValueCode")
    protected String valueCode;
    /**
     * Whether the ticket can be issued as bulk for this
     *                         fare. Providers supported: Worldspan
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * Whether the ticket can be issued as part of
     *                         included package for this fare. Providers supported: Worldspan
     * 
     */
    @XmlAttribute(name = "InclusiveTour")
    protected Boolean inclusiveTour;
    /**
     * Used in rapid reprice
     * 
     */
    @XmlAttribute(name = "Value")
    protected String value;
    /**
     * Code of the provider returning this fare info
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * Currency code and value for the approximate tax amount for this fare component.
     * 
     */
    @XmlAttribute(name = "TaxAmount")
    protected String taxAmount;
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
     * Ticket Designator used to further qualify a
     *                 Fare
     * 
     * Gets the value of the fareTicketDesignator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTicketDesignator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareTicketDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareTicketDesignator }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareTicketDesignator property.
     */
    public List<FareTicketDesignator> getFareTicketDesignator() {
        if (fareTicketDesignator == null) {
            fareTicketDesignator = new ArrayList<>();
        }
        return this.fareTicketDesignator;
    }

    /**
     * Ticketing Code used to apply commissions.
     * 
     * Gets the value of the ticketingCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketingCode property.
     */
    public List<TicketingCode> getTicketingCode() {
        if (ticketingCode == null) {
            ticketingCode = new ArrayList<>();
        }
        return this.ticketingCode;
    }

    /**
     * Surcharges for a fare component
     * 
     * Gets the value of the fareSurcharge property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareSurcharge property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSurcharge }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareSurcharge property.
     */
    public List<FareSurcharge> getFareSurcharge() {
        if (fareSurcharge == null) {
            fareSurcharge = new ArrayList<>();
        }
        return this.fareSurcharge;
    }

    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     * Gets the value of the accountCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountCode property.
     */
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<>();
        }
        return this.accountCode;
    }

    /**
     * Some private fares (non-ATPCO) are secured to a
     *                 contract code.
     * 
     * Gets the value of the contractCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractCode property.
     */
    public List<ContractCode> getContractCode() {
        if (contractCode == null) {
            contractCode = new ArrayList<>();
        }
        return this.contractCode;
    }

    /**
     * Restrictions or instructions about the fare or ticket
     * 
     * Gets the value of the endorsement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endorsement }
     * </p>
     * 
     * 
     * @return
     *     The value of the endorsement property.
     */
    public List<Endorsement> getEndorsement() {
        if (endorsement == null) {
            endorsement = new ArrayList<>();
        }
        return this.endorsement;
    }

    /**
     * Free Baggage Allowance
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowance }
     *     
     */
    public BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowance }
     *     
     * @see #getBaggageAllowance()
     */
    public void setBaggageAllowance(BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * The Fare Rule requested using a Key. The key is
     *                 typically a provider specific string which is required to make a
     *                 following Air Fare Rule Request. This Key is returned in Low Fare
     *                 Shop or Air Price Response
     * 
     * @return
     *     possible object is
     *     {@link FareRuleKey }
     *     
     */
    public FareRuleKey getFareRuleKey() {
        return fareRuleKey;
    }

    /**
     * Sets the value of the fareRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleKey }
     *     
     * @see #getFareRuleKey()
     */
    public void setFareRuleKey(FareRuleKey value) {
        this.fareRuleKey = value;
    }

    /**
     * Returns fare rule failure reason codes when
     *                 fare basis code is forced.
     * 
     * @return
     *     possible object is
     *     {@link FareRuleFailureInfo }
     *     
     */
    public FareRuleFailureInfo getFareRuleFailureInfo() {
        return fareRuleFailureInfo;
    }

    /**
     * Sets the value of the fareRuleFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRuleFailureInfo }
     *     
     * @see #getFareRuleFailureInfo()
     */
    public void setFareRuleFailureInfo(FareRuleFailureInfo value) {
        this.fareRuleFailureInfo = value;
    }

    /**
     * Gets the value of the fareRemarkRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRemarkRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRemarkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRemarkRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRemarkRef property.
     */
    public List<FareRemarkRef> getFareRemarkRef() {
        if (fareRemarkRef == null) {
            fareRemarkRef = new ArrayList<>();
        }
        return this.fareRemarkRef;
    }

    /**
     * Commercially recognized product offered by an airline
     * 
     * @return
     *     possible object is
     *     {@link Brand }
     *     
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brand }
     *     
     * @see #getBrand()
     */
    public void setBrand(Brand value) {
        this.brand = value;
    }

    /**
     * Specifies the Commission for Agency for a particular Fare component. Apllicable Providers are 1G and 1V.
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     * @see #getCommission()
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * Returns all fare attributes separated by pipe ‘|’. Attribute information is returned by comma separated values for each attribute. These information include attribute number, chargeable indicator and supplementary info. Attribute numbers: 1 - Checked Bag, 2 - Carry On, 3 - Rebooking, 4 - Refund, 5 - Seats, 6 - Meals, 7 - WiFi. Chargeable Indicator: Y - Chargeable, N - Not Chargeable. Supplementary Information that will be returned is : For 1 and 2 - Baggage weights. For 3 – Changeable Info. For 4 – Refundable Info. For 5 - Seat description. For 6 – Meal description. For 7 – WiFi description. Example: 1,Y,23|1,N,50|2,N,8|3,N,CHANGEABLE|4,Y,REFUNDABLE|5,N,SEATING|5,N,MIDDLE|6,Y,SOFT DRINK|6,N,ALCOHOLIC DRINK|6,Y,SNACK|7,X,WIFI
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAttributes() {
        return fareAttributes;
    }

    /**
     * Sets the value of the fareAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareAttributes()
     */
    public void setFareAttributes(String value) {
        this.fareAttributes = value;
    }

    /**
     * The penalty (if any) to change the itinerary
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getChangePenalty() {
        return changePenalty;
    }

    /**
     * Sets the value of the changePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     * @see #getChangePenalty()
     */
    public void setChangePenalty(TypeFarePenalty value) {
        this.changePenalty = value;
    }

    /**
     * The penalty (if any) to cancel the fare
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getCancelPenalty() {
        return cancelPenalty;
    }

    /**
     * Sets the value of the cancelPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     * @see #getCancelPenalty()
     */
    public void setCancelPenalty(TypeFarePenalty value) {
        this.cancelPenalty = value;
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
     * The fare basis code for this fare
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasis()
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * The PTC that is associated with this fare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassengerTypeCode()
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Returns the airport or city code that
     *                         defines the origin market for this fare.
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
     * Returns the airport or city code that
     *                         defines the destination market for this fare.
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
     * Returns the date on which this fare was
     *                         quoted
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEffectiveDate()
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Returns the departure date of the first
     *                         segment that uses this fare.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTravelDate()
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * Returns the departure date of the first
     *                         segment of the journey.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDepartureDate()
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the privateFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypePrivateFare }
     *     
     */
    public TypePrivateFare getPrivateFare() {
        return privateFare;
    }

    /**
     * Sets the value of the privateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePrivateFare }
     *     
     */
    public void setPrivateFare(TypePrivateFare value) {
        this.privateFare = value;
    }

    /**
     * Identifies the fare as a Negotiated
     *                         Fare.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFare() {
        return negotiatedFare;
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNegotiatedFare()
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
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
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

    /**
     * Fare not valid before this date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidBefore()
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * Fare not valid after this date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidAfter()
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

    /**
     * Provider PseudoCityCode associated with
     *                         private fare.
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
     * An alpha-numeric string which denotes fare
     *                         family. Some carriers may return this in lieu of or in addition to
     *                         the CabinClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamily() {
        return fareFamily;
    }

    /**
     * Sets the value of the fareFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareFamily()
     */
    public void setFareFamily(String value) {
        this.fareFamily = value;
    }

    /**
     * Boolean to describe whether the Fare is Promotional fare or not.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionalFare() {
        return promotionalFare;
    }

    /**
     * Sets the value of the promotionalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPromotionalFare()
     */
    public void setPromotionalFare(Boolean value) {
        this.promotionalFare = value;
    }

    /**
     * Gets the value of the carCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarCode() {
        return carCode;
    }

    /**
     * Sets the value of the carCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarCode(String value) {
        this.carCode = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueCode(String value) {
        this.valueCode = value;
    }

    /**
     * Whether the ticket can be issued as bulk for this
     *                         fare. Providers supported: Worldspan
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
     * Whether the ticket can be issued as part of
     *                         included package for this fare. Providers supported: Worldspan
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveTour() {
        return inclusiveTour;
    }

    /**
     * Sets the value of the inclusiveTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInclusiveTour()
     */
    public void setInclusiveTour(Boolean value) {
        this.inclusiveTour = value;
    }

    /**
     * Used in rapid reprice
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Code of the provider returning this fare info
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
     * @see #getSupplierCode()
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Currency code and value for the approximate tax amount for this fare component.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxAmount()
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
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

}
