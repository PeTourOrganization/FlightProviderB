
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
 *         <choice>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}CreditCard" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}DebitCard" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/common_v54_0}EnettVan" minOccurs="0"/>
 *           <group ref="{http://www.travelport.com/schema/common_v54_0}FormOfPaymentSequenceGroup"/>
 *         </choice>
 *         <element name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeFormOfPaymentPNRReference" maxOccurs="999" minOccurs="0"/>
 *         <element name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeGeneralReference" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BSPPayment" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ARCPayment" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="25"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FulfillmentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FulfillmentLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FulfillmentIDType" type="{http://www.travelport.com/schema/common_v54_0}typeFulfillmentIDType" />
 *       <attribute name="FulfillmentIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="IsAgentType" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="AgentText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ReuseFOP" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ExternalReference" type="{http://www.travelport.com/schema/common_v54_0}typeExternalReference" />
 *       <attribute name="Reusable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProfileKey" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "debitCard",
    "enettVan",
    "certificate",
    "ticketNumber",
    "check",
    "requisition",
    "miscFormOfPayment",
    "agencyPayment",
    "unitedNations",
    "directPayment",
    "agentVoucher",
    "paymentAdvice",
    "providerReservationInfoRef",
    "segmentRef",
    "bspPayment",
    "arcPayment"
})
@XmlRootElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class FormOfPayment {

    /**
     * Container for all credit card information.
     * 
     */
    @XmlElement(name = "CreditCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CreditCard creditCard;
    /**
     * Container for all debit card information.
     * 
     */
    @XmlElement(name = "DebitCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected DebitCard debitCard;
    /**
     * Container for all eNett Van information.
     * 
     */
    @XmlElement(name = "EnettVan", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected EnettVan enettVan;
    /**
     * Certificate Form of Payment
     * 
     */
    @XmlElement(name = "Certificate", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Certificate certificate;
    /**
     * The identifying number for the actual ticket
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String ticketNumber;
    /**
     * Check Form of Payment
     * 
     */
    @XmlElement(name = "Check", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Check check;
    /**
     * Requisition Form of Payment
     * 
     */
    @XmlElement(name = "Requisition", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Requisition requisition;
    /**
     * Miscellaneous Form of Payments
     * 
     */
    @XmlElement(name = "MiscFormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected MiscFormOfPayment miscFormOfPayment;
    /**
     * Container for Agency Payment
     * 
     */
    @XmlElement(name = "AgencyPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TypeAgencyPayment agencyPayment;
    /**
     * United Nations Form of Payments
     * 
     */
    @XmlElement(name = "UnitedNations", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected UnitedNations unitedNations;
    /**
     * Direct Payment Form of Payments
     * 
     */
    @XmlElement(name = "DirectPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected DirectPayment directPayment;
    /**
     * Agent Voucher Form of Payments
     * 
     */
    @XmlElement(name = "AgentVoucher", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AgentVoucher agentVoucher;
    /**
     * Contains other form of payment for Cruise
     * 				Reservations
     * 
     */
    @XmlElement(name = "PaymentAdvice", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PaymentAdvice paymentAdvice;
    @XmlElement(name = "ProviderReservationInfoRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeFormOfPaymentPNRReference> providerReservationInfoRef;
    @XmlElement(name = "SegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeGeneralReference> segmentRef;
    /**
     * BSP form of payment.ACH Only
     * 
     */
    @XmlElement(name = "BSPPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected BSPPayment bspPayment;
    /**
     * ARC form of payment.ACH Only
     * 
     */
    @XmlElement(name = "ARCPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected ARCPayment arcPayment;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Collect booking ticket at a Kiosk, print in agency.
     * 
     */
    @XmlAttribute(name = "FulfillmentType")
    protected String fulfillmentType;
    /**
     * Information about the location of the printer.
     * 
     */
    @XmlAttribute(name = "FulfillmentLocation")
    protected String fulfillmentLocation;
    /**
     * Identification type, e.g. credit card, to define how the customer will identify himself when collecting the ticket
     * 
     */
    @XmlAttribute(name = "FulfillmentIDType")
    protected TypeFulfillmentIDType fulfillmentIDType;
    /**
     * Identification number, e.g. card number, to define how the customer will identify himself when collecting the ticket
     * 
     */
    @XmlAttribute(name = "FulfillmentIDNumber")
    protected String fulfillmentIDNumber;
    /**
     * If this is true then FormOfPayment mention in Type is anAgent type FormOfPayment.
     * 
     */
    @XmlAttribute(name = "IsAgentType")
    protected Boolean isAgentType;
    /**
     * This is only relevent when IsAgentType is specified as true. Otherwise this will be ignored.
     * 
     */
    @XmlAttribute(name = "AgentText")
    protected String agentText;
    /**
     * Key of the FOP Key to be reused as this Form of Payment.Only Credit and Debit Card will be supported for FOP Reuse.
     * 
     */
    @XmlAttribute(name = "ReuseFOP")
    protected String reuseFOP;
    @XmlAttribute(name = "ExternalReference")
    protected String externalReference;
    /**
     * Indicates whether the form of payment can be reused or not. Currently applicable for Credit and Debit form of payment
     * 
     */
    @XmlAttribute(name = "Reusable")
    protected Boolean reusable;
    /**
     * The unique ID of the profile that contains the payment details to use.
     * 
     */
    @XmlAttribute(name = "ProfileID")
    protected String profileID;
    /**
     * The Key assigned to the payment details value from the specified profile.
     * 
     */
    @XmlAttribute(name = "ProfileKey")
    protected String profileKey;
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
     * Container for all credit card information.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     * @see #getCreditCard()
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Container for all debit card information.
     * 
     * @return
     *     possible object is
     *     {@link DebitCard }
     *     
     */
    public DebitCard getDebitCard() {
        return debitCard;
    }

    /**
     * Sets the value of the debitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCard }
     *     
     * @see #getDebitCard()
     */
    public void setDebitCard(DebitCard value) {
        this.debitCard = value;
    }

    /**
     * Container for all eNett Van information.
     * 
     * @return
     *     possible object is
     *     {@link EnettVan }
     *     
     */
    public EnettVan getEnettVan() {
        return enettVan;
    }

    /**
     * Sets the value of the enettVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnettVan }
     *     
     * @see #getEnettVan()
     */
    public void setEnettVan(EnettVan value) {
        this.enettVan = value;
    }

    /**
     * Certificate Form of Payment
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     * @see #getCertificate()
     */
    public void setCertificate(Certificate value) {
        this.certificate = value;
    }

    /**
     * The identifying number for the actual ticket
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
     * Check Form of Payment
     * 
     * @return
     *     possible object is
     *     {@link Check }
     *     
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link Check }
     *     
     * @see #getCheck()
     */
    public void setCheck(Check value) {
        this.check = value;
    }

    /**
     * Requisition Form of Payment
     * 
     * @return
     *     possible object is
     *     {@link Requisition }
     *     
     */
    public Requisition getRequisition() {
        return requisition;
    }

    /**
     * Sets the value of the requisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requisition }
     *     
     * @see #getRequisition()
     */
    public void setRequisition(Requisition value) {
        this.requisition = value;
    }

    /**
     * Miscellaneous Form of Payments
     * 
     * @return
     *     possible object is
     *     {@link MiscFormOfPayment }
     *     
     */
    public MiscFormOfPayment getMiscFormOfPayment() {
        return miscFormOfPayment;
    }

    /**
     * Sets the value of the miscFormOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscFormOfPayment }
     *     
     * @see #getMiscFormOfPayment()
     */
    public void setMiscFormOfPayment(MiscFormOfPayment value) {
        this.miscFormOfPayment = value;
    }

    /**
     * Container for Agency Payment
     * 
     * @return
     *     possible object is
     *     {@link TypeAgencyPayment }
     *     
     */
    public TypeAgencyPayment getAgencyPayment() {
        return agencyPayment;
    }

    /**
     * Sets the value of the agencyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAgencyPayment }
     *     
     * @see #getAgencyPayment()
     */
    public void setAgencyPayment(TypeAgencyPayment value) {
        this.agencyPayment = value;
    }

    /**
     * United Nations Form of Payments
     * 
     * @return
     *     possible object is
     *     {@link UnitedNations }
     *     
     */
    public UnitedNations getUnitedNations() {
        return unitedNations;
    }

    /**
     * Sets the value of the unitedNations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitedNations }
     *     
     * @see #getUnitedNations()
     */
    public void setUnitedNations(UnitedNations value) {
        this.unitedNations = value;
    }

    /**
     * Direct Payment Form of Payments
     * 
     * @return
     *     possible object is
     *     {@link DirectPayment }
     *     
     */
    public DirectPayment getDirectPayment() {
        return directPayment;
    }

    /**
     * Sets the value of the directPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPayment }
     *     
     * @see #getDirectPayment()
     */
    public void setDirectPayment(DirectPayment value) {
        this.directPayment = value;
    }

    /**
     * Agent Voucher Form of Payments
     * 
     * @return
     *     possible object is
     *     {@link AgentVoucher }
     *     
     */
    public AgentVoucher getAgentVoucher() {
        return agentVoucher;
    }

    /**
     * Sets the value of the agentVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentVoucher }
     *     
     * @see #getAgentVoucher()
     */
    public void setAgentVoucher(AgentVoucher value) {
        this.agentVoucher = value;
    }

    /**
     * Contains other form of payment for Cruise
     * 				Reservations
     * 
     * @return
     *     possible object is
     *     {@link PaymentAdvice }
     *     
     */
    public PaymentAdvice getPaymentAdvice() {
        return paymentAdvice;
    }

    /**
     * Sets the value of the paymentAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAdvice }
     *     
     * @see #getPaymentAdvice()
     */
    public void setPaymentAdvice(PaymentAdvice value) {
        this.paymentAdvice = value;
    }

    /**
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
     * {@link TypeFormOfPaymentPNRReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerReservationInfoRef property.
     */
    public List<TypeFormOfPaymentPNRReference> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the segmentRef property.
     */
    public List<TypeGeneralReference> getSegmentRef() {
        if (segmentRef == null) {
            segmentRef = new ArrayList<>();
        }
        return this.segmentRef;
    }

    /**
     * BSP form of payment.ACH Only
     * 
     * @return
     *     possible object is
     *     {@link BSPPayment }
     *     
     */
    public BSPPayment getBSPPayment() {
        return bspPayment;
    }

    /**
     * Sets the value of the bspPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BSPPayment }
     *     
     * @see #getBSPPayment()
     */
    public void setBSPPayment(BSPPayment value) {
        this.bspPayment = value;
    }

    /**
     * ARC form of payment.ACH Only
     * 
     * @return
     *     possible object is
     *     {@link ARCPayment }
     *     
     */
    public ARCPayment getARCPayment() {
        return arcPayment;
    }

    /**
     * Sets the value of the arcPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARCPayment }
     *     
     * @see #getARCPayment()
     */
    public void setARCPayment(ARCPayment value) {
        this.arcPayment = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Collect booking ticket at a Kiosk, print in agency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFulfillmentType()
     */
    public void setFulfillmentType(String value) {
        this.fulfillmentType = value;
    }

    /**
     * Information about the location of the printer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentLocation() {
        return fulfillmentLocation;
    }

    /**
     * Sets the value of the fulfillmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFulfillmentLocation()
     */
    public void setFulfillmentLocation(String value) {
        this.fulfillmentLocation = value;
    }

    /**
     * Identification type, e.g. credit card, to define how the customer will identify himself when collecting the ticket
     * 
     * @return
     *     possible object is
     *     {@link TypeFulfillmentIDType }
     *     
     */
    public TypeFulfillmentIDType getFulfillmentIDType() {
        return fulfillmentIDType;
    }

    /**
     * Sets the value of the fulfillmentIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFulfillmentIDType }
     *     
     * @see #getFulfillmentIDType()
     */
    public void setFulfillmentIDType(TypeFulfillmentIDType value) {
        this.fulfillmentIDType = value;
    }

    /**
     * Identification number, e.g. card number, to define how the customer will identify himself when collecting the ticket
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentIDNumber() {
        return fulfillmentIDNumber;
    }

    /**
     * Sets the value of the fulfillmentIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFulfillmentIDNumber()
     */
    public void setFulfillmentIDNumber(String value) {
        this.fulfillmentIDNumber = value;
    }

    /**
     * If this is true then FormOfPayment mention in Type is anAgent type FormOfPayment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAgentType() {
        if (isAgentType == null) {
            return false;
        } else {
            return isAgentType;
        }
    }

    /**
     * Sets the value of the isAgentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsAgentType()
     */
    public void setIsAgentType(Boolean value) {
        this.isAgentType = value;
    }

    /**
     * This is only relevent when IsAgentType is specified as true. Otherwise this will be ignored.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentText() {
        return agentText;
    }

    /**
     * Sets the value of the agentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgentText()
     */
    public void setAgentText(String value) {
        this.agentText = value;
    }

    /**
     * Key of the FOP Key to be reused as this Form of Payment.Only Credit and Debit Card will be supported for FOP Reuse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuseFOP() {
        return reuseFOP;
    }

    /**
     * Sets the value of the reuseFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReuseFOP()
     */
    public void setReuseFOP(String value) {
        this.reuseFOP = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Indicates whether the form of payment can be reused or not. Currently applicable for Credit and Debit form of payment
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReusable() {
        if (reusable == null) {
            return false;
        } else {
            return reusable;
        }
    }

    /**
     * Sets the value of the reusable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReusable()
     */
    public void setReusable(Boolean value) {
        this.reusable = value;
    }

    /**
     * The unique ID of the profile that contains the payment details to use.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileID()
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * The Key assigned to the payment details value from the specified profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileKey() {
        return profileKey;
    }

    /**
     * Sets the value of the profileKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileKey()
     */
    public void setProfileKey(String value) {
        this.profileKey = value;
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
