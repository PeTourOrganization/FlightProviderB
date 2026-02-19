
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
 * <p>Java class for BaseCreateReservationReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseCreateReservationReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}LinkedUniversalRecord" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}BookingTraveler" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}OSI" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountingRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}GeneralRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}XMLRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}UnassociatedRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Postscript" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PassiveInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ContinuityCheckOverride" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgencyContactInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CustomerID" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FileFinishingInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CommissionRemark" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ConsolidatorRemark" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}InvoiceRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SSR" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}EmailNotification" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}QueuePlace" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RuleName">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="10"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *       <attribute name="ProviderLocatorCode" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *       <attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCreateReservationReq", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "linkedUniversalRecord",
    "bookingTraveler",
    "osi",
    "accountingRemark",
    "generalRemark",
    "xmlRemark",
    "unassociatedRemark",
    "postscript",
    "passiveInfo",
    "continuityCheckOverride",
    "agencyContactInfo",
    "customerID",
    "fileFinishingInfo",
    "commissionRemark",
    "consolidatorRemark",
    "invoiceRemark",
    "ssr",
    "emailNotification",
    "queuePlace"
})
@XmlSeeAlso({
    BaseCreateWithFormOfPaymentReq.class
})
public class BaseCreateReservationReq
    extends BaseReq
{

    @XmlElement(name = "LinkedUniversalRecord")
    protected List<LinkedUniversalRecord> linkedUniversalRecord;
    /**
     * A traveler and all their accompanying data.
     * 
     */
    @XmlElement(name = "BookingTraveler")
    protected List<BookingTraveler> bookingTraveler;
    /**
     * Other Service information sent to the carriers during air bookings
     * 
     */
    @XmlElement(name = "OSI")
    protected List<OSI> osi;
    /**
     * An accounting remark container to hold any
     *             printable text.
     * 
     */
    @XmlElement(name = "AccountingRemark")
    protected List<AccountingRemark> accountingRemark;
    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "GeneralRemark")
    protected List<GeneralRemark> generalRemark;
    /**
     * A remark container to hold an XML document. (max 1024 chars) This will be encoded with xml encoding.
     * 
     */
    @XmlElement(name = "XMLRemark")
    protected List<XMLRemark> xmlRemark;
    /**
     * A textual remark container to hold non-associated itinerary remarks
     * 
     */
    @XmlElement(name = "UnassociatedRemark")
    protected List<UnassociatedRemark> unassociatedRemark;
    /**
     * Postscript Notes
     * 
     */
    @XmlElement(name = "Postscript")
    protected Postscript postscript;
    /**
     * Used by CreateReservationReq for passing in elements normally found post-booking
     * 
     */
    @XmlElement(name = "PassiveInfo")
    protected PassiveInfo passiveInfo;
    /**
     * This element will be used if user wants to override segment continuity check.
     * 
     */
    @XmlElement(name = "ContinuityCheckOverride")
    protected ContinuityCheckOverride continuityCheckOverride;
    /**
     * Generic agency contact information container. It must contain  at least one phone number to be used by an agency
     * 
     */
    @XmlElement(name = "AgencyContactInfo")
    protected AgencyContactInfo agencyContactInfo;
    /**
     * A provider reservation field used to store customer information. It may be used to identify reservations which will/will not be available for access.
     * 
     */
    @XmlElement(name = "CustomerID")
    protected CustomerID customerID;
    /**
     * Misc Data required for File Finishing. This
     * 				data is transient and not saved in database.
     * 
     */
    @XmlElement(name = "FileFinishingInfo")
    protected FileFinishingInfo fileFinishingInfo;
    /**
     * Identifies the agency commision remarks.
     * 				Specifically used for Worldspan.
     * 
     */
    @XmlElement(name = "CommissionRemark")
    protected CommissionRemark commissionRemark;
    /**
     * Authorization remark for Consolidator access to a PNR . Contains PCC information created by retail agent to  allow a consolidator or other Axess users to service their PNR. PROVIDER SUPPORTED: Worldspan.
     * 
     */
    @XmlElement(name = "ConsolidatorRemark")
    protected ConsolidatorRemark consolidatorRemark;
    @XmlElement(name = "InvoiceRemark")
    protected List<InvoiceRemark> invoiceRemark;
    /**
     * SSR element outside Booking Traveler without any Segment Ref or Booking Traveler Ref.
     * 
     */
    @XmlElement(name = "SSR")
    protected List<SSR> ssr;
    /**
     * Send Email Notification to the emails specified in Booking Traveler. Supported Provider : 1G/1V
     * 
     */
    @XmlElement(name = "EmailNotification")
    protected EmailNotification emailNotification;
    /**
     * Allow queue placement of a PNR at the time of booking in AirCreateReservationReq,HotelCreateReservationReq,PassiveCreateReservationReq and VehicleCreateReservationReq for providers 1G,1V,1P.
     * 
     */
    @XmlElement(name = "QueuePlace")
    protected QueuePlace queuePlace;
    /**
     * This attribute is meant to attach a mandatory custom check rule name to a PNR. A non-mandatory custom check rule too can be attached to a PNR.
     * 
     */
    @XmlAttribute(name = "RuleName")
    protected String ruleName;
    /**
     * Which UniversalRecord should this new reservation be applied to.  If blank, then a new one is created.
     * 
     */
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;
    /**
     * Which Provider reservation does this reservation get added to.
     * 
     */
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    /**
     * To be used with ProviderLocatorCode, which host the reservation being added to belongs to.
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * Optional client centric customer identifier
     * 
     */
    @XmlAttribute(name = "CustomerNumber")
    protected String customerNumber;
    @XmlAttribute(name = "Version")
    protected BigInteger version;

    /**
     * Gets the value of the linkedUniversalRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedUniversalRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinkedUniversalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedUniversalRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the linkedUniversalRecord property.
     */
    public List<LinkedUniversalRecord> getLinkedUniversalRecord() {
        if (linkedUniversalRecord == null) {
            linkedUniversalRecord = new ArrayList<>();
        }
        return this.linkedUniversalRecord;
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
     * Other Service information sent to the carriers during air bookings
     * 
     * Gets the value of the osi property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osi property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSI }
     * </p>
     * 
     * 
     * @return
     *     The value of the osi property.
     */
    public List<OSI> getOSI() {
        if (osi == null) {
            osi = new ArrayList<>();
        }
        return this.osi;
    }

    /**
     * An accounting remark container to hold any
     *             printable text.
     * 
     * Gets the value of the accountingRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountingRemark property.
     */
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<>();
        }
        return this.accountingRemark;
    }

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the generalRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the generalRemark property.
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<>();
        }
        return this.generalRemark;
    }

    /**
     * A remark container to hold an XML document. (max 1024 chars) This will be encoded with xml encoding.
     * 
     * Gets the value of the xmlRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getXMLRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the xmlRemark property.
     */
    public List<XMLRemark> getXMLRemark() {
        if (xmlRemark == null) {
            xmlRemark = new ArrayList<>();
        }
        return this.xmlRemark;
    }

    /**
     * A textual remark container to hold non-associated itinerary remarks
     * 
     * Gets the value of the unassociatedRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unassociatedRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnassociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnassociatedRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the unassociatedRemark property.
     */
    public List<UnassociatedRemark> getUnassociatedRemark() {
        if (unassociatedRemark == null) {
            unassociatedRemark = new ArrayList<>();
        }
        return this.unassociatedRemark;
    }

    /**
     * Postscript Notes
     * 
     * @return
     *     possible object is
     *     {@link Postscript }
     *     
     */
    public Postscript getPostscript() {
        return postscript;
    }

    /**
     * Sets the value of the postscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postscript }
     *     
     * @see #getPostscript()
     */
    public void setPostscript(Postscript value) {
        this.postscript = value;
    }

    /**
     * Used by CreateReservationReq for passing in elements normally found post-booking
     * 
     * @return
     *     possible object is
     *     {@link PassiveInfo }
     *     
     */
    public PassiveInfo getPassiveInfo() {
        return passiveInfo;
    }

    /**
     * Sets the value of the passiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveInfo }
     *     
     * @see #getPassiveInfo()
     */
    public void setPassiveInfo(PassiveInfo value) {
        this.passiveInfo = value;
    }

    /**
     * This element will be used if user wants to override segment continuity check.
     * 
     * @return
     *     possible object is
     *     {@link ContinuityCheckOverride }
     *     
     */
    public ContinuityCheckOverride getContinuityCheckOverride() {
        return continuityCheckOverride;
    }

    /**
     * Sets the value of the continuityCheckOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuityCheckOverride }
     *     
     * @see #getContinuityCheckOverride()
     */
    public void setContinuityCheckOverride(ContinuityCheckOverride value) {
        this.continuityCheckOverride = value;
    }

    /**
     * Generic agency contact information container. It must contain  at least one phone number to be used by an agency
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactInfo }
     *     
     */
    public AgencyContactInfo getAgencyContactInfo() {
        return agencyContactInfo;
    }

    /**
     * Sets the value of the agencyContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactInfo }
     *     
     * @see #getAgencyContactInfo()
     */
    public void setAgencyContactInfo(AgencyContactInfo value) {
        this.agencyContactInfo = value;
    }

    /**
     * A provider reservation field used to store customer information. It may be used to identify reservations which will/will not be available for access.
     * 
     * @return
     *     possible object is
     *     {@link CustomerID }
     *     
     */
    public CustomerID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerID }
     *     
     * @see #getCustomerID()
     */
    public void setCustomerID(CustomerID value) {
        this.customerID = value;
    }

    /**
     * Misc Data required for File Finishing. This
     * 				data is transient and not saved in database.
     * 
     * @return
     *     possible object is
     *     {@link FileFinishingInfo }
     *     
     */
    public FileFinishingInfo getFileFinishingInfo() {
        return fileFinishingInfo;
    }

    /**
     * Sets the value of the fileFinishingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFinishingInfo }
     *     
     * @see #getFileFinishingInfo()
     */
    public void setFileFinishingInfo(FileFinishingInfo value) {
        this.fileFinishingInfo = value;
    }

    /**
     * Identifies the agency commision remarks.
     * 				Specifically used for Worldspan.
     * 
     * @return
     *     possible object is
     *     {@link CommissionRemark }
     *     
     */
    public CommissionRemark getCommissionRemark() {
        return commissionRemark;
    }

    /**
     * Sets the value of the commissionRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionRemark }
     *     
     * @see #getCommissionRemark()
     */
    public void setCommissionRemark(CommissionRemark value) {
        this.commissionRemark = value;
    }

    /**
     * Authorization remark for Consolidator access to a PNR . Contains PCC information created by retail agent to  allow a consolidator or other Axess users to service their PNR. PROVIDER SUPPORTED: Worldspan.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatorRemark }
     *     
     */
    public ConsolidatorRemark getConsolidatorRemark() {
        return consolidatorRemark;
    }

    /**
     * Sets the value of the consolidatorRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatorRemark }
     *     
     * @see #getConsolidatorRemark()
     */
    public void setConsolidatorRemark(ConsolidatorRemark value) {
        this.consolidatorRemark = value;
    }

    /**
     * Gets the value of the invoiceRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInvoiceRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the invoiceRemark property.
     */
    public List<InvoiceRemark> getInvoiceRemark() {
        if (invoiceRemark == null) {
            invoiceRemark = new ArrayList<>();
        }
        return this.invoiceRemark;
    }

    /**
     * SSR element outside Booking Traveler without any Segment Ref or Booking Traveler Ref.
     * 
     * Gets the value of the ssr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssr property.
     */
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<>();
        }
        return this.ssr;
    }

    /**
     * Send Email Notification to the emails specified in Booking Traveler. Supported Provider : 1G/1V
     * 
     * @return
     *     possible object is
     *     {@link EmailNotification }
     *     
     */
    public EmailNotification getEmailNotification() {
        return emailNotification;
    }

    /**
     * Sets the value of the emailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailNotification }
     *     
     * @see #getEmailNotification()
     */
    public void setEmailNotification(EmailNotification value) {
        this.emailNotification = value;
    }

    /**
     * Allow queue placement of a PNR at the time of booking in AirCreateReservationReq,HotelCreateReservationReq,PassiveCreateReservationReq and VehicleCreateReservationReq for providers 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link QueuePlace }
     *     
     */
    public QueuePlace getQueuePlace() {
        return queuePlace;
    }

    /**
     * Sets the value of the queuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueuePlace }
     *     
     * @see #getQueuePlace()
     */
    public void setQueuePlace(QueuePlace value) {
        this.queuePlace = value;
    }

    /**
     * This attribute is meant to attach a mandatory custom check rule name to a PNR. A non-mandatory custom check rule too can be attached to a PNR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets the value of the ruleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRuleName()
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Which UniversalRecord should this new reservation be applied to.  If blank, then a new one is created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUniversalRecordLocatorCode()
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Which Provider reservation does this reservation get added to.
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
     * To be used with ProviderLocatorCode, which host the reservation being added to belongs to.
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
     * Optional client centric customer identifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCustomerNumber()
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

}
