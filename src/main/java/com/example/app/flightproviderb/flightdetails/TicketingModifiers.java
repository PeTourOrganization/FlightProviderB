
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
 *         <element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" maxOccurs="999" minOccurs="0"/>
 *         <element name="NetRemit" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierAmountType" minOccurs="0"/>
 *         <element name="NetFare" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierAmountType" minOccurs="0"/>
 *         <element name="ActualSellingFare" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierAmountType" minOccurs="0"/>
 *         <element name="InvoiceFare" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierAccountingType" minOccurs="0"/>
 *         <element name="CorporateDiscount" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierAccountingType" minOccurs="0"/>
 *         <element name="AccountingInfo" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierAccountingType" minOccurs="0"/>
 *         <element name="BulkTicket" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.travelport.com/schema/air_v54_0}typeBulkTicketModifierType">
 *                 <attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="GroupTour" type="{http://www.travelport.com/schema/air_v54_0}typeBulkTicketModifierType" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Commission" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TourCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketEndorsement" maxOccurs="3" minOccurs="0"/>
 *         <element name="ValueModifier" type="{http://www.travelport.com/schema/air_v54_0}typeTicketModifierValueType" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DocumentSelect" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DocumentOptions" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SegmentSelect" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SegmentModifiers" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SupplierLocator" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DestinationPurposeCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LanguageOption" maxOccurs="2" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LandCharges" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PrintBlankFormItinerary" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExemptOBFee" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="IsPrimaryDI" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="DocumentInstructionNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Reference" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to30" />
 *       <attribute name="Status">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="30"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FreeText">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="756"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TicketRecord" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="ExemptVAT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NetRemitApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="FreeTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="CurrencyOverrideCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "netRemit",
    "netFare",
    "actualSellingFare",
    "invoiceFare",
    "corporateDiscount",
    "accountingInfo",
    "bulkTicket",
    "groupTour",
    "commission",
    "tourCode",
    "ticketEndorsement",
    "valueModifier",
    "documentSelect",
    "documentOptions",
    "segmentSelect",
    "segmentModifiers",
    "supplierLocator",
    "destinationPurposeCode",
    "languageOption",
    "landCharges",
    "printBlankFormItinerary",
    "exemptOBFee"
})
@XmlRootElement(name = "TicketingModifiers")
public class TicketingModifiers {

    /**
     * Reference to a booking traveler for which ticketing modifier is applied.
     * 
     */
    @XmlElement(name = "BookingTravelerRef")
    protected List<String> bookingTravelerRef;
    /**
     * Allows an agency to override the net
     *                      remittance amount - varies by BSP agreement
     * 
     */
    @XmlElement(name = "NetRemit")
    protected TypeTicketModifierAmountType netRemit;
    /**
     * Net Fare amount for a ticketed fare
     * 
     */
    @XmlElement(name = "NetFare")
    protected TypeTicketModifierAmountType netFare;
    /**
     * Allows an agency to report an Actual
     *                      Selling Fare as part of the net remittance BSP agreement
     * 
     */
    @XmlElement(name = "ActualSellingFare")
    protected TypeTicketModifierAmountType actualSellingFare;
    /**
     * Allows an agency to report an Invoice Fare
     *                      as part of the net remittance BSP agreement
     * 
     */
    @XmlElement(name = "InvoiceFare")
    protected TypeTicketModifierAccountingType invoiceFare;
    /**
     * Allows an agency to add a corporate
     *                      discount to the itinerary to be ticketed
     * 
     */
    @XmlElement(name = "CorporateDiscount")
    protected TypeTicketModifierAccountingType corporateDiscount;
    /**
     * Allows an agency to report Accounting
     *                      Information as part of the net remittance BSP agreement
     * 
     */
    @XmlElement(name = "AccountingInfo")
    protected TypeTicketModifierAccountingType accountingInfo;
    /**
     * Allows an agency to update the fare as a
     *                      Bulk ticket - Optional SuppressOnFareCalc attribute will control
     *                      how fare calculation is printed on the ticket
     * 
     */
    @XmlElement(name = "BulkTicket")
    protected TicketingModifiers.BulkTicket bulkTicket;
    /**
     * Allows an agency to update the fare as a
     *                      Group Tour (inclusive tour) ticket - Optional SuppressOnFareCalc
     *                      attribute will control how fare calculation is printed on the
     *                      ticket
     * 
     */
    @XmlElement(name = "GroupTour")
    protected TypeBulkTicketModifierType groupTour;
    /**
     * Allows an agency to update the commission
     *                      to a new or different commission rate which will be applied at
     *                      time of ticketing. The commission Modifier allows the user
     *                      specify how the commission change is to applied
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Commission commission;
    /**
     * Allows an agency to modify the tour code
     *                      information on the ticket
     * 
     */
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    /**
     * Allows an agency to add user defined
     *                      ticketing endorsements the ticket
     * 
     */
    @XmlElement(name = "TicketEndorsement")
    protected List<TicketEndorsement> ticketEndorsement;
    /**
     * Allows an agency to modify value or
     *                      commission of the ticket. The modifier is generic and depends on
     *                      the specific GDS and BSP implementation
     * 
     */
    @XmlElement(name = "ValueModifier")
    protected TypeTicketModifierValueType valueModifier;
    /**
     * Allows an agency to select the documents to
     *                 produce for the itinerary.
     * 
     */
    @XmlElement(name = "DocumentSelect")
    protected DocumentSelect documentSelect;
    /**
     * Allows an agency to set different document
     *                 options for the itinerary.
     * 
     */
    @XmlElement(name = "DocumentOptions")
    protected DocumentOptions documentOptions;
    /**
     * To be used to pass the selected segment.
     * 
     */
    @XmlElement(name = "SegmentSelect")
    protected SegmentSelect segmentSelect;
    /**
     * To be used to modify the ticket modifiers for air
     *                 segment
     * 
     */
    @XmlElement(name = "SegmentModifiers")
    protected List<SegmentModifiers> segmentModifiers;
    /**
     * Locator code on the host carrier system
     * 
     */
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected SupplierLocator supplierLocator;
    /**
     * This code is required to indicate destination
     *                 and purpose of Travel. It is applicable for Canada and Bermuda
     *                 agency
     *                 only. This is used by Worldspan.
     * 
     */
    @XmlElement(name = "DestinationPurposeCode")
    protected DestinationPurposeCode destinationPurposeCode;
    /**
     * Enables itineraries and invoices to print in different languages.
     * 
     */
    @XmlElement(name = "LanguageOption")
    protected List<LanguageOption> languageOption;
    /**
     * Prints non-air charges on a document.
     * 
     */
    @XmlElement(name = "LandCharges")
    protected LandCharges landCharges;
    /**
     * Produce a customized itinerary/Invoice document in blank form format.
     * 
     */
    @XmlElement(name = "PrintBlankFormItinerary")
    protected PrintBlankFormItinerary printBlankFormItinerary;
    /**
     * Used to specify which OB fees are exempt; if none are listed, it means all should be exempt.
     * 
     */
    @XmlElement(name = "ExemptOBFee")
    protected ExemptOBFee exemptOBFee;
    /**
     * Indicates if the DI is Primary DI. 1P only
     * 
     */
    @XmlAttribute(name = "IsPrimaryDI")
    protected Boolean isPrimaryDI;
    /**
     * The Document Instruction line number. 1P only
     * 
     */
    @XmlAttribute(name = "DocumentInstructionNumber")
    protected String documentInstructionNumber;
    /**
     * Identifies if TicketingModifiers contains DI line information. 1P only.
     * 
     */
    @XmlAttribute(name = "Reference")
    protected String reference;
    /**
     * DI line status - ex:Ticketed
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;
    /**
     * DI line information shown as free text as in Host. 1P only
     * 
     */
    @XmlAttribute(name = "FreeText")
    protected String freeText;
    /**
     * Host Name Number
     * 
     */
    @XmlAttribute(name = "NameNumber")
    protected String nameNumber;
    /**
     * Ticket Record Number
     * 
     */
    @XmlAttribute(name = "TicketRecord")
    protected String ticketRecord;
    /**
     * Allows an agency to specify the Plating
     *                   Carrier for ticketing
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * Allows an agency to update if VAT is
     *                   Exemtped on the fare.
     * 
     */
    @XmlAttribute(name = "ExemptVAT")
    protected Boolean exemptVAT;
    /**
     * Indicator to the BSP net remittance
     *                   scheme applies to ticketed fare.
     * 
     */
    @XmlAttribute(name = "NetRemitApplied")
    protected Boolean netRemitApplied;
    /**
     * Indicates free ticket.
     * 
     */
    @XmlAttribute(name = "FreeTicket")
    protected Boolean freeTicket;
    /**
     * This modifier allows an agency to specify the currency like L for Local, E for Euro, U for USD, C for CAD (Canadian dollars).
     * 
     */
    @XmlAttribute(name = "CurrencyOverrideCode")
    protected String currencyOverrideCode;
    @XmlAttribute(name = "Key")
    protected String key;
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
     * Reference to a booking traveler for which ticketing modifier is applied.
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
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerRef property.
     */
    public List<String> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Allows an agency to override the net
     *                      remittance amount - varies by BSP agreement
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public TypeTicketModifierAmountType getNetRemit() {
        return netRemit;
    }

    /**
     * Sets the value of the netRemit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     * @see #getNetRemit()
     */
    public void setNetRemit(TypeTicketModifierAmountType value) {
        this.netRemit = value;
    }

    /**
     * Net Fare amount for a ticketed fare
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public TypeTicketModifierAmountType getNetFare() {
        return netFare;
    }

    /**
     * Sets the value of the netFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     * @see #getNetFare()
     */
    public void setNetFare(TypeTicketModifierAmountType value) {
        this.netFare = value;
    }

    /**
     * Allows an agency to report an Actual
     *                      Selling Fare as part of the net remittance BSP agreement
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAmountType }
     *     
     */
    public TypeTicketModifierAmountType getActualSellingFare() {
        return actualSellingFare;
    }

    /**
     * Sets the value of the actualSellingFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAmountType }
     *     
     * @see #getActualSellingFare()
     */
    public void setActualSellingFare(TypeTicketModifierAmountType value) {
        this.actualSellingFare = value;
    }

    /**
     * Allows an agency to report an Invoice Fare
     *                      as part of the net remittance BSP agreement
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public TypeTicketModifierAccountingType getInvoiceFare() {
        return invoiceFare;
    }

    /**
     * Sets the value of the invoiceFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     * @see #getInvoiceFare()
     */
    public void setInvoiceFare(TypeTicketModifierAccountingType value) {
        this.invoiceFare = value;
    }

    /**
     * Allows an agency to add a corporate
     *                      discount to the itinerary to be ticketed
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public TypeTicketModifierAccountingType getCorporateDiscount() {
        return corporateDiscount;
    }

    /**
     * Sets the value of the corporateDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     * @see #getCorporateDiscount()
     */
    public void setCorporateDiscount(TypeTicketModifierAccountingType value) {
        this.corporateDiscount = value;
    }

    /**
     * Allows an agency to report Accounting
     *                      Information as part of the net remittance BSP agreement
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     */
    public TypeTicketModifierAccountingType getAccountingInfo() {
        return accountingInfo;
    }

    /**
     * Sets the value of the accountingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierAccountingType }
     *     
     * @see #getAccountingInfo()
     */
    public void setAccountingInfo(TypeTicketModifierAccountingType value) {
        this.accountingInfo = value;
    }

    /**
     * Allows an agency to update the fare as a
     *                      Bulk ticket - Optional SuppressOnFareCalc attribute will control
     *                      how fare calculation is printed on the ticket
     * 
     * @return
     *     possible object is
     *     {@link TicketingModifiers.BulkTicket }
     *     
     */
    public TicketingModifiers.BulkTicket getBulkTicket() {
        return bulkTicket;
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingModifiers.BulkTicket }
     *     
     * @see #getBulkTicket()
     */
    public void setBulkTicket(TicketingModifiers.BulkTicket value) {
        this.bulkTicket = value;
    }

    /**
     * Allows an agency to update the fare as a
     *                      Group Tour (inclusive tour) ticket - Optional SuppressOnFareCalc
     *                      attribute will control how fare calculation is printed on the
     *                      ticket
     * 
     * @return
     *     possible object is
     *     {@link TypeBulkTicketModifierType }
     *     
     */
    public TypeBulkTicketModifierType getGroupTour() {
        return groupTour;
    }

    /**
     * Sets the value of the groupTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBulkTicketModifierType }
     *     
     * @see #getGroupTour()
     */
    public void setGroupTour(TypeBulkTicketModifierType value) {
        this.groupTour = value;
    }

    /**
     * Allows an agency to update the commission
     *                      to a new or different commission rate which will be applied at
     *                      time of ticketing. The commission Modifier allows the user
     *                      specify how the commission change is to applied
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
     * Allows an agency to modify the tour code
     *                      information on the ticket
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     * @see #getTourCode()
     */
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Allows an agency to add user defined
     *                      ticketing endorsements the ticket
     * 
     * Gets the value of the ticketEndorsement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketEndorsement property.
     */
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Allows an agency to modify value or
     *                      commission of the ticket. The modifier is generic and depends on
     *                      the specific GDS and BSP implementation
     * 
     * @return
     *     possible object is
     *     {@link TypeTicketModifierValueType }
     *     
     */
    public TypeTicketModifierValueType getValueModifier() {
        return valueModifier;
    }

    /**
     * Sets the value of the valueModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTicketModifierValueType }
     *     
     * @see #getValueModifier()
     */
    public void setValueModifier(TypeTicketModifierValueType value) {
        this.valueModifier = value;
    }

    /**
     * Allows an agency to select the documents to
     *                 produce for the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSelect }
     *     
     */
    public DocumentSelect getDocumentSelect() {
        return documentSelect;
    }

    /**
     * Sets the value of the documentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSelect }
     *     
     * @see #getDocumentSelect()
     */
    public void setDocumentSelect(DocumentSelect value) {
        this.documentSelect = value;
    }

    /**
     * Allows an agency to set different document
     *                 options for the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOptions }
     *     
     */
    public DocumentOptions getDocumentOptions() {
        return documentOptions;
    }

    /**
     * Sets the value of the documentOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOptions }
     *     
     * @see #getDocumentOptions()
     */
    public void setDocumentOptions(DocumentOptions value) {
        this.documentOptions = value;
    }

    /**
     * To be used to pass the selected segment.
     * 
     * @return
     *     possible object is
     *     {@link SegmentSelect }
     *     
     */
    public SegmentSelect getSegmentSelect() {
        return segmentSelect;
    }

    /**
     * Sets the value of the segmentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentSelect }
     *     
     * @see #getSegmentSelect()
     */
    public void setSegmentSelect(SegmentSelect value) {
        this.segmentSelect = value;
    }

    /**
     * To be used to modify the ticket modifiers for air
     *                 segment
     * 
     * Gets the value of the segmentModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSegmentModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the segmentModifiers property.
     */
    public List<SegmentModifiers> getSegmentModifiers() {
        if (segmentModifiers == null) {
            segmentModifiers = new ArrayList<>();
        }
        return this.segmentModifiers;
    }

    /**
     * Locator code on the host carrier system
     * 
     * @return
     *     possible object is
     *     {@link SupplierLocator }
     *     
     */
    public SupplierLocator getSupplierLocator() {
        return supplierLocator;
    }

    /**
     * Sets the value of the supplierLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierLocator }
     *     
     * @see #getSupplierLocator()
     */
    public void setSupplierLocator(SupplierLocator value) {
        this.supplierLocator = value;
    }

    /**
     * This code is required to indicate destination
     *                 and purpose of Travel. It is applicable for Canada and Bermuda
     *                 agency
     *                 only. This is used by Worldspan.
     * 
     * @return
     *     possible object is
     *     {@link DestinationPurposeCode }
     *     
     */
    public DestinationPurposeCode getDestinationPurposeCode() {
        return destinationPurposeCode;
    }

    /**
     * Sets the value of the destinationPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPurposeCode }
     *     
     * @see #getDestinationPurposeCode()
     */
    public void setDestinationPurposeCode(DestinationPurposeCode value) {
        this.destinationPurposeCode = value;
    }

    /**
     * Enables itineraries and invoices to print in different languages.
     * 
     * Gets the value of the languageOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLanguageOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the languageOption property.
     */
    public List<LanguageOption> getLanguageOption() {
        if (languageOption == null) {
            languageOption = new ArrayList<>();
        }
        return this.languageOption;
    }

    /**
     * Prints non-air charges on a document.
     * 
     * @return
     *     possible object is
     *     {@link LandCharges }
     *     
     */
    public LandCharges getLandCharges() {
        return landCharges;
    }

    /**
     * Sets the value of the landCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandCharges }
     *     
     * @see #getLandCharges()
     */
    public void setLandCharges(LandCharges value) {
        this.landCharges = value;
    }

    /**
     * Produce a customized itinerary/Invoice document in blank form format.
     * 
     * @return
     *     possible object is
     *     {@link PrintBlankFormItinerary }
     *     
     */
    public PrintBlankFormItinerary getPrintBlankFormItinerary() {
        return printBlankFormItinerary;
    }

    /**
     * Sets the value of the printBlankFormItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintBlankFormItinerary }
     *     
     * @see #getPrintBlankFormItinerary()
     */
    public void setPrintBlankFormItinerary(PrintBlankFormItinerary value) {
        this.printBlankFormItinerary = value;
    }

    /**
     * Used to specify which OB fees are exempt; if none are listed, it means all should be exempt.
     * 
     * @return
     *     possible object is
     *     {@link ExemptOBFee }
     *     
     */
    public ExemptOBFee getExemptOBFee() {
        return exemptOBFee;
    }

    /**
     * Sets the value of the exemptOBFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptOBFee }
     *     
     * @see #getExemptOBFee()
     */
    public void setExemptOBFee(ExemptOBFee value) {
        this.exemptOBFee = value;
    }

    /**
     * Indicates if the DI is Primary DI. 1P only
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPrimaryDI() {
        if (isPrimaryDI == null) {
            return false;
        } else {
            return isPrimaryDI;
        }
    }

    /**
     * Sets the value of the isPrimaryDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsPrimaryDI()
     */
    public void setIsPrimaryDI(Boolean value) {
        this.isPrimaryDI = value;
    }

    /**
     * The Document Instruction line number. 1P only
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentInstructionNumber() {
        return documentInstructionNumber;
    }

    /**
     * Sets the value of the documentInstructionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentInstructionNumber()
     */
    public void setDocumentInstructionNumber(String value) {
        this.documentInstructionNumber = value;
    }

    /**
     * Identifies if TicketingModifiers contains DI line information. 1P only.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReference()
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * DI line status - ex:Ticketed
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * DI line information shown as free text as in Host. 1P only
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFreeText()
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Host Name Number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNumber() {
        return nameNumber;
    }

    /**
     * Sets the value of the nameNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNameNumber()
     */
    public void setNameNumber(String value) {
        this.nameNumber = value;
    }

    /**
     * Ticket Record Number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketRecord() {
        return ticketRecord;
    }

    /**
     * Sets the value of the ticketRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketRecord()
     */
    public void setTicketRecord(String value) {
        this.ticketRecord = value;
    }

    /**
     * Allows an agency to specify the Plating
     *                   Carrier for ticketing
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
     * Allows an agency to update if VAT is
     *                   Exemtped on the fare.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptVAT() {
        return exemptVAT;
    }

    /**
     * Sets the value of the exemptVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExemptVAT()
     */
    public void setExemptVAT(Boolean value) {
        this.exemptVAT = value;
    }

    /**
     * Indicator to the BSP net remittance
     *                   scheme applies to ticketed fare.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetRemitApplied() {
        return netRemitApplied;
    }

    /**
     * Sets the value of the netRemitApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNetRemitApplied()
     */
    public void setNetRemitApplied(Boolean value) {
        this.netRemitApplied = value;
    }

    /**
     * Indicates free ticket.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeTicket() {
        return freeTicket;
    }

    /**
     * Sets the value of the freeTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFreeTicket()
     */
    public void setFreeTicket(Boolean value) {
        this.freeTicket = value;
    }

    /**
     * This modifier allows an agency to specify the currency like L for Local, E for Euro, U for USD, C for CAD (Canadian dollars).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyOverrideCode() {
        return currencyOverrideCode;
    }

    /**
     * Sets the value of the currencyOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrencyOverrideCode()
     */
    public void setCurrencyOverrideCode(String value) {
        this.currencyOverrideCode = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.travelport.com/schema/air_v54_0}typeBulkTicketModifierType">
     *       <attribute name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BulkTicket
        extends TypeBulkTicketModifierType
    {

        /**
         * Indicates bulk ticket being
         *                                  non-refundable
         * 
         */
        @XmlAttribute(name = "NonRefundable")
        protected Boolean nonRefundable;

        /**
         * Indicates bulk ticket being
         *                                  non-refundable
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundable() {
            return nonRefundable;
        }

        /**
         * Sets the value of the nonRefundable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNonRefundable()
         */
        public void setNonRefundable(Boolean value) {
            this.nonRefundable = value;
        }

    }

}
