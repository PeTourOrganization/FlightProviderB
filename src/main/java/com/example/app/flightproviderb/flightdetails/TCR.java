
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTraveler" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PassengerTicketNumber" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgencyInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SupplierLocator" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}RefundRemark" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
 *       <attribute name="TCRNumber" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTCRNumber" />
 *       <attribute name="Status" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeTCRStatus" />
 *       <attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ConfirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BasePrice" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Taxes" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Fees" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Exchangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Voidable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Modifiable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute ref="{http://www.travelport.com/schema/air_v54_0}RefundAccessCode"/>
 *       <attribute name="RefundAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="RefundFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPayment",
    "payment",
    "bookingTraveler",
    "passengerTicketNumber",
    "airPricingInfo",
    "agencyInfo",
    "airReservationLocatorCode",
    "supplierLocator",
    "refundRemark"
})
@XmlRootElement(name = "TCR")
public class TCR {

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
     * A traveler and all their accompanying data.
     * 
     */
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected List<BookingTraveler> bookingTraveler;
    /**
     * Information related to Ticket Number
     * 
     */
    @XmlElement(name = "PassengerTicketNumber")
    protected List<PassengerTicketNumber> passengerTicketNumber;
    /**
     * Per traveler type pricing breakdown. This will
     *                 reflect the pricing for all travelers of the specified type.
     * 
     */
    @XmlElement(name = "AirPricingInfo")
    protected List<AirPricingInfo> airPricingInfo;
    /**
     * Tracks the various agent/agency information
     * 
     */
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AgencyInfo agencyInfo;
    /**
     * Identifies the AirReservation LocatorCode
     *                 within the Universal Record
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode")
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * Locator code on the host carrier system
     * 
     */
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SupplierLocator> supplierLocator;
    /**
     * A textual remark displayed in Refund Quote and Refund response.
     * 
     */
    @XmlElement(name = "RefundRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<RefundRemark> refundRemark;
    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     */
    @XmlAttribute(name = "TCRNumber", required = true)
    protected String tcrNumber;
    /**
     * The current status of this TCR. Some status
     *                         values are not applicable by some Airlines.
     * 
     */
    @XmlAttribute(name = "Status", required = true)
    protected TypeTCRStatus status;
    /**
     * The date at which the status was changed on
     *                         this TCR due to an action event (itemized from the booleans
     *                         below).
     * 
     */
    @XmlAttribute(name = "ModifiedDate", required = true)
    protected String modifiedDate;
    /**
     * The date at which this TCR was confirmed (not
     *                         created). This mean the payment was approved and processed and
     *                         travel for this TCR is confirmed.
     * 
     */
    @XmlAttribute(name = "ConfirmedDate")
    protected String confirmedDate;
    /**
     * The base price of this TCR as a whole as it
     *                         was when it was first booked.
     * 
     */
    @XmlAttribute(name = "BasePrice", required = true)
    protected String basePrice;
    /**
     * The taxes of this TCR as a whole as it was
     *                         when it was first booked.
     * 
     */
    @XmlAttribute(name = "Taxes", required = true)
    protected String taxes;
    /**
     * The fees of this TCR as a whole as it was when
     *                         it was first booked.
     * 
     */
    @XmlAttribute(name = "Fees", required = true)
    protected String fees;
    /**
     * Is it possible to perform a Refund for this
     *                         TCR.
     * 
     */
    @XmlAttribute(name = "Refundable", required = true)
    protected boolean refundable;
    /**
     * Is it possible to perform an Exchange for this
     *                         TCR.
     * 
     */
    @XmlAttribute(name = "Exchangeable", required = true)
    protected boolean exchangeable;
    /**
     * Is it possible to perform a Void on this TCR.
     * 
     */
    @XmlAttribute(name = "Voidable", required = true)
    protected boolean voidable;
    /**
     * Is it possible to modify this TCR (opposed to
     *                         Refund/Exchange/Void).
     * 
     */
    @XmlAttribute(name = "Modifiable", required = true)
    protected boolean modifiable;
    /**
     * For some vendors a code/password is required to avail any amount retained during refund.User can define their own password too This attribute will be used to show/accept this code.
     * 
     */
    @XmlAttribute(name = "RefundAccessCode", namespace = "http://www.travelport.com/schema/air_v54_0")
    protected String refundAccessCode;
    /**
     * Total Amount refunded to the customer.
     * 
     */
    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    /**
     * Charges incurred for processing refund.
     * 
     */
    @XmlAttribute(name = "RefundFee")
    protected String refundFee;
    /**
     * Amount forfeited as a result of refund.
     * 
     */
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;
    /**
     * Represents Carrier Code for ACH PNR Retrieve.
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

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
     * A traveler and all their accompanying data.
     * 
     * Gets the value of the bookingTraveler property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTraveler property.
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<>();
        }
        return this.bookingTraveler;
    }

    /**
     * Information related to Ticket Number
     * 
     * Gets the value of the passengerTicketNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTicketNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTicketNumber }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerTicketNumber property.
     */
    public List<PassengerTicketNumber> getPassengerTicketNumber() {
        if (passengerTicketNumber == null) {
            passengerTicketNumber = new ArrayList<>();
        }
        return this.passengerTicketNumber;
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
     * A textual remark displayed in Refund Quote and Refund response.
     * 
     * Gets the value of the refundRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefundRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the refundRemark property.
     */
    public List<RefundRemark> getRefundRemark() {
        if (refundRemark == null) {
            refundRemark = new ArrayList<>();
        }
        return this.refundRemark;
    }

    /**
     * The identifying number for a Ticketless Air
     *                         Reservation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCRNumber() {
        return tcrNumber;
    }

    /**
     * Sets the value of the tcrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTCRNumber()
     */
    public void setTCRNumber(String value) {
        this.tcrNumber = value;
    }

    /**
     * The current status of this TCR. Some status
     *                         values are not applicable by some Airlines.
     * 
     * @return
     *     possible object is
     *     {@link TypeTCRStatus }
     *     
     */
    public TypeTCRStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTCRStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(TypeTCRStatus value) {
        this.status = value;
    }

    /**
     * The date at which the status was changed on
     *                         this TCR due to an action event (itemized from the booleans
     *                         below).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModifiedDate()
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * The date at which this TCR was confirmed (not
     *                         created). This mean the payment was approved and processed and
     *                         travel for this TCR is confirmed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfirmedDate()
     */
    public void setConfirmedDate(String value) {
        this.confirmedDate = value;
    }

    /**
     * The base price of this TCR as a whole as it
     *                         was when it was first booked.
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
     * The taxes of this TCR as a whole as it was
     *                         when it was first booked.
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
     * The fees of this TCR as a whole as it was when
     *                         it was first booked.
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
     * Is it possible to perform a Refund for this
     *                         TCR.
     * 
     */
    public boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     */
    public void setRefundable(boolean value) {
        this.refundable = value;
    }

    /**
     * Is it possible to perform an Exchange for this
     *                         TCR.
     * 
     */
    public boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     */
    public void setExchangeable(boolean value) {
        this.exchangeable = value;
    }

    /**
     * Is it possible to perform a Void on this TCR.
     * 
     */
    public boolean isVoidable() {
        return voidable;
    }

    /**
     * Sets the value of the voidable property.
     * 
     */
    public void setVoidable(boolean value) {
        this.voidable = value;
    }

    /**
     * Is it possible to modify this TCR (opposed to
     *                         Refund/Exchange/Void).
     * 
     */
    public boolean isModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     */
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }

    /**
     * For some vendors a code/password is required to avail any amount retained during refund.User can define their own password too This attribute will be used to show/accept this code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAccessCode() {
        return refundAccessCode;
    }

    /**
     * Sets the value of the refundAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundAccessCode()
     */
    public void setRefundAccessCode(String value) {
        this.refundAccessCode = value;
    }

    /**
     * Total Amount refunded to the customer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundAmount()
     */
    public void setRefundAmount(String value) {
        this.refundAmount = value;
    }

    /**
     * Charges incurred for processing refund.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFee() {
        return refundFee;
    }

    /**
     * Sets the value of the refundFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundFee()
     */
    public void setRefundFee(String value) {
        this.refundFee = value;
    }

    /**
     * Amount forfeited as a result of refund.
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
     * Gets the value of the providerLocatorCode property.
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
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Represents Carrier Code for ACH PNR Retrieve.
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

}
