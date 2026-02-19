
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareDisplayRule"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FarePricing" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRestriction" maxOccurs="99" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRoutingInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareMileageInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirFareDisplayRuleKey" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCode" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AddlBookingCodeInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRuleFailureInfo" minOccurs="0"/>
 *         <element name="PriceChange" type="{http://www.travelport.com/schema/air_v54_0}PriceChangeType" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="TripType" type="{http://www.travelport.com/schema/air_v54_0}typeFareTripType" />
 *       <attribute name="FareTypeCode" type="{http://www.travelport.com/schema/air_v54_0}typeFareTypeCode" />
 *       <attribute name="SpecialFare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="InstantPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="EligibilityRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="FlightRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="StopoversRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TransfersRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="BlackoutsExist" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AccompaniedTravel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MileOrRouteBasedFare" type="{http://www.travelport.com/schema/air_v54_0}typeMileOrRouteBasedFare" />
 *       <attribute name="GlobalIndicator" type="{http://www.travelport.com/schema/air_v54_0}typeATPCOGlobalIndicator" />
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="FareTicketingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareTicketingDesignator" type="{http://www.travelport.com/schema/air_v54_0}typeTicketDesignator" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareDisplayRule",
    "farePricing",
    "fareRestriction",
    "fareRoutingInformation",
    "fareMileageInformation",
    "airFareDisplayRuleKey",
    "bookingCode",
    "accountCode",
    "addlBookingCodeInformation",
    "fareRuleFailureInfo",
    "priceChange"
})
@XmlRootElement(name = "FareDisplay")
public class FareDisplay {

    /**
     * Fare Display Rule Container
     * 
     */
    @XmlElement(name = "FareDisplayRule", required = true)
    protected FareDisplayRule fareDisplayRule;
    /**
     * Container for Fare Pricing Information.
     *                 One per PTC type.
     * 
     */
    @XmlElement(name = "FarePricing", required = true)
    protected List<FarePricing> farePricing;
    /**
     * Fare Restriction
     * 
     */
    @XmlElement(name = "FareRestriction")
    protected List<FareRestriction> fareRestriction;
    /**
     * Contains Fare/Tariff Display Routing
     *                 Information
     * 
     */
    @XmlElement(name = "FareRoutingInformation")
    protected String fareRoutingInformation;
    /**
     * Contains Fare/Tariff Display Mileage
     *                 Information
     * 
     */
    @XmlElement(name = "FareMileageInformation")
    protected String fareMileageInformation;
    /**
     * The Tariff Fare Rule requested using a Key. The
     *                 key is typically a provider specific string which is required to
     *                 make either a following Air Fare Tariff request for Mileage/Routing
     *                 information or Air Fare Tariff Rule Request.
     * 
     */
    @XmlElement(name = "AirFareDisplayRuleKey")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    /**
     * The Booking Code (Class of Service) for a
     *                 segment
     * 
     */
    @XmlElement(name = "BookingCode")
    protected List<BookingCode> bookingCode;
    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<AccountCode> accountCode;
    /**
     * Returns additional booking codes for the
     *                 selected fare
     * 
     */
    @XmlElement(name = "AddlBookingCodeInformation")
    protected AddlBookingCodeInformation addlBookingCodeInformation;
    /**
     * Returns fare rule failure info for Non
     *                             Valid fares.
     * 
     */
    @XmlElement(name = "FareRuleFailureInfo")
    protected FareRuleFailureInfo fareRuleFailureInfo;
    /**
     * Indicates a price change is found in Fare Control Manager
     * 
     */
    @XmlElement(name = "PriceChange")
    protected List<PriceChangeType> priceChange;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    @XmlAttribute(name = "TripType")
    protected TypeFareTripType tripType;
    @XmlAttribute(name = "FareTypeCode")
    protected String fareTypeCode;
    @XmlAttribute(name = "SpecialFare")
    protected Boolean specialFare;
    @XmlAttribute(name = "InstantPurchase")
    protected Boolean instantPurchase;
    @XmlAttribute(name = "EligibilityRestricted")
    protected Boolean eligibilityRestricted;
    @XmlAttribute(name = "FlightRestricted")
    protected Boolean flightRestricted;
    @XmlAttribute(name = "StopoversRestricted")
    protected Boolean stopoversRestricted;
    @XmlAttribute(name = "TransfersRestricted")
    protected Boolean transfersRestricted;
    @XmlAttribute(name = "BlackoutsExist")
    protected Boolean blackoutsExist;
    @XmlAttribute(name = "AccompaniedTravel")
    protected Boolean accompaniedTravel;
    @XmlAttribute(name = "MileOrRouteBasedFare")
    protected TypeMileOrRouteBasedFare mileOrRouteBasedFare;
    @XmlAttribute(name = "GlobalIndicator")
    protected TypeATPCOGlobalIndicator globalIndicator;
    /**
     * Returns the origin airport or city code
     *                         for which this tariff is applicable.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * Returns the destination airport or city
     *                         code for which this tariff is applicable.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * Returns the ticketing code for which this tariff is applicable.
     * 
     */
    @XmlAttribute(name = "FareTicketingCode")
    protected String fareTicketingCode;
    /**
     * Returns the ticketing designator for which this tariff is applicable.
     * 
     */
    @XmlAttribute(name = "FareTicketingDesignator")
    protected String fareTicketingDesignator;

    /**
     * Fare Display Rule Container
     * 
     * @return
     *     possible object is
     *     {@link FareDisplayRule }
     *     
     */
    public FareDisplayRule getFareDisplayRule() {
        return fareDisplayRule;
    }

    /**
     * Sets the value of the fareDisplayRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDisplayRule }
     *     
     * @see #getFareDisplayRule()
     */
    public void setFareDisplayRule(FareDisplayRule value) {
        this.fareDisplayRule = value;
    }

    /**
     * Container for Fare Pricing Information.
     *                 One per PTC type.
     * 
     * Gets the value of the farePricing property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePricing property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFarePricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricing }
     * </p>
     * 
     * 
     * @return
     *     The value of the farePricing property.
     */
    public List<FarePricing> getFarePricing() {
        if (farePricing == null) {
            farePricing = new ArrayList<>();
        }
        return this.farePricing;
    }

    /**
     * Fare Restriction
     * 
     * Gets the value of the fareRestriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestriction }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRestriction property.
     */
    public List<FareRestriction> getFareRestriction() {
        if (fareRestriction == null) {
            fareRestriction = new ArrayList<>();
        }
        return this.fareRestriction;
    }

    /**
     * Contains Fare/Tariff Display Routing
     *                 Information
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRoutingInformation() {
        return fareRoutingInformation;
    }

    /**
     * Sets the value of the fareRoutingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareRoutingInformation()
     */
    public void setFareRoutingInformation(String value) {
        this.fareRoutingInformation = value;
    }

    /**
     * Contains Fare/Tariff Display Mileage
     *                 Information
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMileageInformation() {
        return fareMileageInformation;
    }

    /**
     * Sets the value of the fareMileageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareMileageInformation()
     */
    public void setFareMileageInformation(String value) {
        this.fareMileageInformation = value;
    }

    /**
     * The Tariff Fare Rule requested using a Key. The
     *                 key is typically a provider specific string which is required to
     *                 make either a following Air Fare Tariff request for Mileage/Routing
     *                 information or Air Fare Tariff Rule Request.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     * @see #getAirFareDisplayRuleKey()
     */
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * The Booking Code (Class of Service) for a
     *                 segment
     * 
     * Gets the value of the bookingCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingCode property.
     */
    public List<BookingCode> getBookingCode() {
        if (bookingCode == null) {
            bookingCode = new ArrayList<>();
        }
        return this.bookingCode;
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
     * Returns additional booking codes for the
     *                 selected fare
     * 
     * @return
     *     possible object is
     *     {@link AddlBookingCodeInformation }
     *     
     */
    public AddlBookingCodeInformation getAddlBookingCodeInformation() {
        return addlBookingCodeInformation;
    }

    /**
     * Sets the value of the addlBookingCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBookingCodeInformation }
     *     
     * @see #getAddlBookingCodeInformation()
     */
    public void setAddlBookingCodeInformation(AddlBookingCodeInformation value) {
        this.addlBookingCodeInformation = value;
    }

    /**
     * Returns fare rule failure info for Non
     *                             Valid fares.
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
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the fareBasis property.
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
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
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
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareTripType }
     *     
     */
    public TypeFareTripType getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareTripType }
     *     
     */
    public void setTripType(TypeFareTripType value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the fareTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeCode() {
        return fareTypeCode;
    }

    /**
     * Sets the value of the fareTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareTypeCode(String value) {
        this.fareTypeCode = value;
    }

    /**
     * Gets the value of the specialFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialFare() {
        return specialFare;
    }

    /**
     * Sets the value of the specialFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialFare(Boolean value) {
        this.specialFare = value;
    }

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantPurchase(Boolean value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the eligibilityRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityRestricted() {
        return eligibilityRestricted;
    }

    /**
     * Sets the value of the eligibilityRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityRestricted(Boolean value) {
        this.eligibilityRestricted = value;
    }

    /**
     * Gets the value of the flightRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlightRestricted() {
        return flightRestricted;
    }

    /**
     * Sets the value of the flightRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlightRestricted(Boolean value) {
        this.flightRestricted = value;
    }

    /**
     * Gets the value of the stopoversRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopoversRestricted() {
        return stopoversRestricted;
    }

    /**
     * Sets the value of the stopoversRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopoversRestricted(Boolean value) {
        this.stopoversRestricted = value;
    }

    /**
     * Gets the value of the transfersRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransfersRestricted() {
        return transfersRestricted;
    }

    /**
     * Sets the value of the transfersRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransfersRestricted(Boolean value) {
        this.transfersRestricted = value;
    }

    /**
     * Gets the value of the blackoutsExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackoutsExist() {
        return blackoutsExist;
    }

    /**
     * Sets the value of the blackoutsExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackoutsExist(Boolean value) {
        this.blackoutsExist = value;
    }

    /**
     * Gets the value of the accompaniedTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedTravel() {
        return accompaniedTravel;
    }

    /**
     * Sets the value of the accompaniedTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedTravel(Boolean value) {
        this.accompaniedTravel = value;
    }

    /**
     * Gets the value of the mileOrRouteBasedFare property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public TypeMileOrRouteBasedFare getMileOrRouteBasedFare() {
        return mileOrRouteBasedFare;
    }

    /**
     * Sets the value of the mileOrRouteBasedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    public void setMileOrRouteBasedFare(TypeMileOrRouteBasedFare value) {
        this.mileOrRouteBasedFare = value;
    }

    /**
     * Gets the value of the globalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeATPCOGlobalIndicator }
     *     
     */
    public TypeATPCOGlobalIndicator getGlobalIndicator() {
        return globalIndicator;
    }

    /**
     * Sets the value of the globalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeATPCOGlobalIndicator }
     *     
     */
    public void setGlobalIndicator(TypeATPCOGlobalIndicator value) {
        this.globalIndicator = value;
    }

    /**
     * Returns the origin airport or city code
     *                         for which this tariff is applicable.
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
     * Returns the destination airport or city
     *                         code for which this tariff is applicable.
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
     * Returns the ticketing code for which this tariff is applicable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTicketingCode() {
        return fareTicketingCode;
    }

    /**
     * Sets the value of the fareTicketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareTicketingCode()
     */
    public void setFareTicketingCode(String value) {
        this.fareTicketingCode = value;
    }

    /**
     * Returns the ticketing designator for which this tariff is applicable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTicketingDesignator() {
        return fareTicketingDesignator;
    }

    /**
     * Sets the value of the fareTicketingDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareTicketingDesignator()
     */
    public void setFareTicketingDesignator(String value) {
        this.fareTicketingDesignator = value;
    }

}
