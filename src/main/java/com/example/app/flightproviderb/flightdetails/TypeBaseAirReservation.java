
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Parent Container for Air Reservation
 * 
 * <p>Java class for typeBaseAirReservation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeBaseAirReservation">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReservation">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SupplierLocator" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ThirdPartyInformation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DocumentInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTravelerRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationInfoRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SvcSegment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CreditCardAuth" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareNote" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element name="TaxInfo" type="{http://www.travelport.com/schema/air_v54_0}typeTaxInfoWithPaymentRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketingModifiers" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AssociatedRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PocketItineraryRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundleTotal" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirExchangeBundle" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AmenitiesList" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBaseAirReservation", propOrder = {
    "optionalServices",
    "supplierLocator",
    "thirdPartyInformation",
    "documentInfo",
    "bookingTravelerRef",
    "providerReservationInfoRef",
    "airSegment",
    "svcSegment",
    "airPricingInfo",
    "payment",
    "creditCardAuth",
    "fareNote",
    "feeInfo",
    "taxInfo",
    "ticketingModifiers",
    "associatedRemark",
    "pocketItineraryRemark",
    "airExchangeBundleTotal",
    "airExchangeBundle",
    "amenitiesList"
})
@XmlSeeAlso({
    TypeAirReservationWithFOP.class,
    AirReservation.class
})
public class TypeBaseAirReservation
    extends BaseReservation
{

    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * Locator code on the host carrier system
     * 
     */
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SupplierLocator> supplierLocator;
    /**
     * Third party supplier locator information. Specifically applicable for SDK booking.
     * 
     */
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ThirdPartyInformation> thirdPartyInformation;
    /**
     * Container for the document information
     *                summary line.
     * 
     */
    @XmlElement(name = "DocumentInfo")
    protected DocumentInfo documentInfo;
    /**
     * Reference Element for Booking Traveler and Loyalty cards
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    /**
     * Container for Provider reservation reference key.
     * 
     */
    @XmlElement(name = "ProviderReservationInfoRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ProviderReservationInfoRef> providerReservationInfoRef;
    /**
     * An Air marketable travel segment.
     * 
     */
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    /**
     * Service segment added to collect additional fee. 1P only
     * 
     */
    @XmlElement(name = "SvcSegment")
    protected List<SvcSegment> svcSegment;
    /**
     * Per traveler type pricing breakdown. This will
     *                 reflect the pricing for all travelers of the specified type.
     * 
     */
    @XmlElement(name = "AirPricingInfo")
    protected List<AirPricingInfo> airPricingInfo;
    /**
     * Payment information - must be used in conjunction with credit card info
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Payment> payment;
    /**
     * The result of a Credit Auth Request. Will contain all the authorization info and result codes.
     * 
     */
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<CreditCardAuth> creditCardAuth;
    /**
     * A simple textual fare note. Used within several
     *                 other objects.
     * 
     */
    @XmlElement(name = "FareNote")
    protected List<FareNote> fareNote;
    /**
     * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
     * 
     */
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    /**
     * Itinerary level taxes
     * 
     */
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfoWithPaymentRef> taxInfo;
    /**
     * A container to identify individual ticketing
     *             modifiers.
     * 
     */
    @XmlElement(name = "TicketingModifiers")
    protected List<TicketingModifiers> ticketingModifiers;
    @XmlElement(name = "AssociatedRemark")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "PocketItineraryRemark")
    protected List<PocketItineraryRemark> pocketItineraryRemark;
    /**
     * Total exchange and penalty information for one ticket number
     * 
     */
    @XmlElement(name = "AirExchangeBundleTotal")
    protected AirExchangeBundleTotal airExchangeBundleTotal;
    /**
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P
     * 
     */
    @XmlElement(name = "AirExchangeBundle")
    protected List<AirExchangeBundle> airExchangeBundle;
    /**
     * List of Amenities for the itinerary.
     * 
     */
    @XmlElement(name = "AmenitiesList")
    protected List<AmenitiesList> amenitiesList;

    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     * @see #getOptionalServices()
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
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
     * Third party supplier locator information. Specifically applicable for SDK booking.
     * 
     * Gets the value of the thirdPartyInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getThirdPartyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the thirdPartyInformation property.
     */
    public List<ThirdPartyInformation> getThirdPartyInformation() {
        if (thirdPartyInformation == null) {
            thirdPartyInformation = new ArrayList<>();
        }
        return this.thirdPartyInformation;
    }

    /**
     * Container for the document information
     *                summary line.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfo }
     *     
     */
    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfo }
     *     
     * @see #getDocumentInfo()
     */
    public void setDocumentInfo(DocumentInfo value) {
        this.documentInfo = value;
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
     * Container for Provider reservation reference key.
     * 
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerReservationInfoRef property.
     */
    public List<ProviderReservationInfoRef> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * An Air marketable travel segment.
     * 
     * Gets the value of the airSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegment property.
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<>();
        }
        return this.airSegment;
    }

    /**
     * Service segment added to collect additional fee. 1P only
     * 
     * Gets the value of the svcSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSvcSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the svcSegment property.
     */
    public List<SvcSegment> getSvcSegment() {
        if (svcSegment == null) {
            svcSegment = new ArrayList<>();
        }
        return this.svcSegment;
    }

    /**
     * Per traveler type pricing breakdown. This will
     *                 reflect the pricing for all travelers of the specified type.
     * 
     * Gets the value of the airPricingInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingInfo property.
     */
    public List<AirPricingInfo> getAirPricingInfo() {
        if (airPricingInfo == null) {
            airPricingInfo = new ArrayList<>();
        }
        return this.airPricingInfo;
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
     * The result of a Credit Auth Request. Will contain all the authorization info and result codes.
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
     * A simple textual fare note. Used within several
     *                 other objects.
     * 
     * Gets the value of the fareNote property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareNote property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareNote }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareNote property.
     */
    public List<FareNote> getFareNote() {
        if (fareNote == null) {
            fareNote = new ArrayList<>();
        }
        return this.fareNote;
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
     * Itinerary level taxes
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
     * {@link TypeTaxInfoWithPaymentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxInfo property.
     */
    public List<TypeTaxInfoWithPaymentRef> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<>();
        }
        return this.taxInfo;
    }

    /**
     * A container to identify individual ticketing
     *             modifiers.
     * 
     * Gets the value of the ticketingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketingModifiers property.
     */
    public List<TicketingModifiers> getTicketingModifiers() {
        if (ticketingModifiers == null) {
            ticketingModifiers = new ArrayList<>();
        }
        return this.ticketingModifiers;
    }

    /**
     * Gets the value of the associatedRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the associatedRemark property.
     */
    public List<AssociatedRemark> getAssociatedRemark() {
        if (associatedRemark == null) {
            associatedRemark = new ArrayList<>();
        }
        return this.associatedRemark;
    }

    /**
     * Gets the value of the pocketItineraryRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pocketItineraryRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPocketItineraryRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PocketItineraryRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the pocketItineraryRemark property.
     */
    public List<PocketItineraryRemark> getPocketItineraryRemark() {
        if (pocketItineraryRemark == null) {
            pocketItineraryRemark = new ArrayList<>();
        }
        return this.pocketItineraryRemark;
    }

    /**
     * Total exchange and penalty information for one ticket number
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeBundleTotal }
     *     
     */
    public AirExchangeBundleTotal getAirExchangeBundleTotal() {
        return airExchangeBundleTotal;
    }

    /**
     * Sets the value of the airExchangeBundleTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeBundleTotal }
     *     
     * @see #getAirExchangeBundleTotal()
     */
    public void setAirExchangeBundleTotal(AirExchangeBundleTotal value) {
        this.airExchangeBundleTotal = value;
    }

    /**
     * Bundle exchange, pricing, and penalty information. Providers ACH/1G/1V/1P
     * 
     * Gets the value of the airExchangeBundle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airExchangeBundle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirExchangeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeBundle }
     * </p>
     * 
     * 
     * @return
     *     The value of the airExchangeBundle property.
     */
    public List<AirExchangeBundle> getAirExchangeBundle() {
        if (airExchangeBundle == null) {
            airExchangeBundle = new ArrayList<>();
        }
        return this.airExchangeBundle;
    }

    /**
     * List of Amenities for the itinerary.
     * 
     * Gets the value of the amenitiesList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenitiesList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAmenitiesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenitiesList }
     * </p>
     * 
     * 
     * @return
     *     The value of the amenitiesList property.
     */
    public List<AmenitiesList> getAmenitiesList() {
        if (amenitiesList == null) {
            amenitiesList = new ArrayList<>();
        }
        return this.amenitiesList;
    }

}
