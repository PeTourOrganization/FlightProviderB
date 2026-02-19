
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceFeeTaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CreditCardAuth" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Status" type="{http://www.travelport.com/schema/common_v54_0}typeStatus" />
 *       <attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TotalAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="BaseAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Taxes" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="BookingTravelerName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "serviceFeeTaxInfo",
    "creditCardAuth",
    "payment"
})
@XmlRootElement(name = "ServiceFeeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ServiceFeeInfo {

    /**
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPayment formOfPayment;
    /**
     * The taxes associated to a particular Service Fee.
     * 
     */
    @XmlElement(name = "ServiceFeeTaxInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ServiceFeeTaxInfo> serviceFeeTaxInfo;
    /**
     * The result of a Credit Auth Request. Will contain all the authorization info and result codes.
     * 
     */
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CreditCardAuth creditCardAuth;
    /**
     * Payment information - must be used in conjunction with credit card info
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Payment payment;
    /**
     * Status of the service fee. Possible Values – Issued, ReadyToIssue, IssueLater.
     * 
     */
    @XmlAttribute(name = "Status")
    protected TypeStatus status;
    /**
     * The description of the service fee.
     * 
     */
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The confirmation number of the service fee in the merchant host system.
     * 
     */
    @XmlAttribute(name = "Confirmation")
    protected String confirmation;
    /**
     * The ticket that this fee was issued in connection with.
     * 
     */
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    /**
     * A reference to a passenger.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    /**
     * A reference to the provider reservation info to which the service is tied.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * A reference to the passive provider reservation info to which the service is tied.
     * 
     */
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    /**
     * The total amount for this Service Fee including base amount and all taxes.
     * 
     */
    @XmlAttribute(name = "TotalAmount")
    protected String totalAmount;
    /**
     * Represents the base price for this entity. This does not include any taxes.
     * 
     */
    @XmlAttribute(name = "BaseAmount")
    protected String baseAmount;
    /**
     * The aggregated amount of all the taxes that are associated with this entity. See the associated Service Fee TaxInfo array for a breakdown of the individual taxes.
     * 
     */
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    /**
     * The name of the passenger.
     * 
     */
    @XmlAttribute(name = "BookingTravelerName")
    protected String bookingTravelerName;
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
     * A Form of Payment used to purchase all or part of
     *                 a booking.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     * @see #getFormOfPayment()
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * The taxes associated to a particular Service Fee.
     * 
     * Gets the value of the serviceFeeTaxInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeTaxInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceFeeTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeTaxInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceFeeTaxInfo property.
     */
    public List<ServiceFeeTaxInfo> getServiceFeeTaxInfo() {
        if (serviceFeeTaxInfo == null) {
            serviceFeeTaxInfo = new ArrayList<>();
        }
        return this.serviceFeeTaxInfo;
    }

    /**
     * The result of a Credit Auth Request. Will contain all the authorization info and result codes.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardAuth }
     *     
     */
    public CreditCardAuth getCreditCardAuth() {
        return creditCardAuth;
    }

    /**
     * Sets the value of the creditCardAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardAuth }
     *     
     * @see #getCreditCardAuth()
     */
    public void setCreditCardAuth(CreditCardAuth value) {
        this.creditCardAuth = value;
    }

    /**
     * Payment information - must be used in conjunction with credit card info
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     * @see #getPayment()
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Status of the service fee. Possible Values – Issued, ReadyToIssue, IssueLater.
     * 
     * @return
     *     possible object is
     *     {@link TypeStatus }
     *     
     */
    public TypeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(TypeStatus value) {
        this.status = value;
    }

    /**
     * The description of the service fee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
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
     * The confirmation number of the service fee in the merchant host system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfirmation()
     */
    public void setConfirmation(String value) {
        this.confirmation = value;
    }

    /**
     * The ticket that this fee was issued in connection with.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketNumber()
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * A reference to a passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * A reference to the provider reservation info to which the service is tied.
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
     * A reference to the passive provider reservation info to which the service is tied.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveProviderReservationInfoRef() {
        return passiveProviderReservationInfoRef;
    }

    /**
     * Sets the value of the passiveProviderReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassiveProviderReservationInfoRef()
     */
    public void setPassiveProviderReservationInfoRef(String value) {
        this.passiveProviderReservationInfoRef = value;
    }

    /**
     * The total amount for this Service Fee including base amount and all taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTotalAmount()
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Represents the base price for this entity. This does not include any taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaseAmount()
     */
    public void setBaseAmount(String value) {
        this.baseAmount = value;
    }

    /**
     * The aggregated amount of all the taxes that are associated with this entity. See the associated Service Fee TaxInfo array for a breakdown of the individual taxes.
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
     * The name of the passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerName() {
        return bookingTravelerName;
    }

    /**
     * Sets the value of the bookingTravelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerName()
     */
    public void setBookingTravelerName(String value) {
        this.bookingTravelerName = value;
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
