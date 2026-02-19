
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 * Describes a merchandising service of a
 *                     given type (e.g. Seat) that can be purchased for the indicated
 *                     amount. If this service is for only a given passenger or segment
 *                     the references will indicate the restrictions. If this service
 *                     applies to all passenger or the entire itinerary, the references
 *                     will not be present.
 * 
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceData" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMD" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BundledServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AdditionalInfo" maxOccurs="16" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeApplication" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Text" maxOccurs="4" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PriceRange" maxOccurs="5" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TourCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BrandingInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Title" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attribute name="OptionalServicesRuleRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMerchandisingService" />
 *       <attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SecondaryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PurchaseWindow" type="{http://www.travelport.com/schema/common_v54_0}typePurchaseWindow" />
 *       <attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Entitled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="PerTraveler" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="ServiceSubCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SSRCode" type="{http://www.travelport.com/schema/common_v54_0}typeSSRCode" />
 *       <attribute name="IssuanceReason">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ProviderDefinedType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="16"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AssessIndicator" type="{http://www.travelport.com/schema/air_v54_0}typeAssessIndicator" />
 *       <attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="ApplicableFFLevel">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="0"/>
 *             <maxInclusive value="9"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SSRFreeText" type="{http://www.travelport.com/schema/common_v54_0}typeSSRFreeText" />
 *       <attribute name="IsPricingApproximate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Chargeable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="InclusiveOfTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="InterlineSettlementAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GeographySpecification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ExcessWeightRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ViewableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="WeightInExcess" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TotalWeight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BaggageUnitPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="FirstPiece" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="LastPiece" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Restricted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="IsRepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="BookedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *       <attribute name="Tag">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="256"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="DisplayOrder">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="0"/>
 *             <maxInclusive value="999"/>
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
    "serviceData",
    "serviceInfo",
    "remark",
    "taxInfo",
    "feeInfo",
    "emd",
    "bundledServices",
    "additionalInfo",
    "feeApplication",
    "text",
    "priceRange",
    "tourCode",
    "brandingInfo",
    "title"
})
@XmlRootElement(name = "OptionalService")
public class OptionalService {

    @XmlElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ServiceData> serviceData;
    @XmlElement(name = "ServiceInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected ServiceInfo serviceInfo;
    /**
     * Information regarding any specific
     *                             for this service.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Remark> remark;
    /**
     * The tax information for a
     * 
     */
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    /**
     * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
     * 
     */
    @XmlElement(name = "FeeInfo")
    protected List<TypeFeeInfo> feeInfo;
    @XmlElement(name = "EMD")
    protected EMD emd;
    @XmlElement(name = "BundledServices")
    protected BundledServices bundledServices;
    @XmlElement(name = "AdditionalInfo")
    protected List<AdditionalInfo> additionalInfo;
    /**
     * Specifies how the Optional Service fee is to be applied.  The choices are Per One Way, Per Round Trip, Per Item (Per Piece), Per Travel, Per Ticket, Per 1 Kilo, Per 5 Kilos.  Provider: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "FeeApplication")
    protected FeeApplication feeApplication;
    /**
     * Type of Text, Eg-'Upsell','Marketing Agent','Marketing Consumer','Strapline','Rule'.
     * 
     */
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    @XmlElement(name = "PriceRange")
    protected List<PriceRange> priceRange;
    /**
     * Tour Code Fare Basis
     * 
     */
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    /**
     * Branding information for the Ancillary Service.  Returned in Seat Map only.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlElement(name = "BrandingInfo")
    protected BrandingInfo brandingInfo;
    /**
     * The additional titles associated to the brand or optional service. Providers: ACH, RCH, 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "Title")
    protected List<TypeTextElement> title;
    /**
     * UniqueID to associate a rule to the
     *                         Optional Service
     * 
     */
    @XmlAttribute(name = "OptionalServicesRuleRef")
    protected String optionalServicesRuleRef;
    /**
     * Specify the type of service offered (e.g.
     *                         seats, baggage, etc.)
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Confirmation number provided by the
     *                         supplier
     * 
     */
    @XmlAttribute(name = "Confirmation")
    protected String confirmation;
    /**
     * The secondary option code type required for
     *                         certain options
     * 
     */
    @XmlAttribute(name = "SecondaryType")
    protected String secondaryType;
    /**
     * Describes when the Service is available
     *                         for confirmation or purchase (e.g. Booking Only, Check-in Only,
     *                         Anytime, etc.)
     * 
     */
    @XmlAttribute(name = "PurchaseWindow")
    protected TypePurchaseWindow purchaseWindow;
    /**
     * Numeric value that represents the priority
     *                         order of the Service
     * 
     */
    @XmlAttribute(name = "Priority")
    protected BigInteger priority;
    /**
     * Boolean to describe whether the Service is
     *                         available for sale or not
     * 
     */
    @XmlAttribute(name = "Available")
    protected Boolean available;
    /**
     * Boolean to describe whether the passenger
     *                         is entitled for the service without charge or not
     * 
     */
    @XmlAttribute(name = "Entitled")
    protected Boolean entitled;
    /**
     * Boolean to describe whether the Amount on
     *                         the Service is charged per traveler.
     * 
     */
    @XmlAttribute(name = "PerTraveler")
    protected Boolean perTraveler;
    /**
     * Timestamp when this service/offer got
     *                         created.
     * 
     */
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    /**
     * Reference to a payment for merchandising
     *                         services.
     * 
     */
    @XmlAttribute(name = "PaymentRef")
    protected String paymentRef;
    /**
     * Specify the service status (e.g. active,
     *                         canceled, etc.)
     * 
     */
    @XmlAttribute(name = "ServiceStatus")
    protected String serviceStatus;
    /**
     * The number of units availed for each optional
     *                         service (e.g. 2 baggage availed will be specified as 2 in quantity
     *                         for optional service BAGGAGE)
     * 
     */
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    /**
     * The sequence number associated with the
     *                         OptionalService
     * 
     */
    @XmlAttribute(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    /**
     * The service subcode associated with the
     *                         OptionalService
     * 
     */
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    /**
     * The SSR Code associated with the
     *                         OptionalService
     * 
     */
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    /**
     * A one-letter code specifying the reason for
     *                         issuance of the OptionalService
     * 
     */
    @XmlAttribute(name = "IssuanceReason")
    protected String issuanceReason;
    /**
     * Original Type as sent by the provider
     * 
     */
    @XmlAttribute(name = "ProviderDefinedType")
    protected String providerDefinedType;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Indicates whether price is assessed by mileage or currency or both
     * 
     */
    @XmlAttribute(name = "AssessIndicator")
    protected TypeAssessIndicator assessIndicator;
    /**
     * Indicates mileage fee/amount
     * 
     */
    @XmlAttribute(name = "Mileage")
    protected BigInteger mileage;
    /**
     * Numerical value of the loyalty card level for which this service is available.
     * 
     */
    @XmlAttribute(name = "ApplicableFFLevel")
    protected Integer applicableFFLevel;
    /**
     * Describes if service is private or not.
     * 
     */
    @XmlAttribute(name = "Private")
    protected Boolean _private;
    /**
     * Certain SSR types sent in OptionalService SSRCode require a free text message. For example, PETC Pet in Cabin.
     * 
     */
    @XmlAttribute(name = "SSRFreeText")
    protected String ssrFreeText;
    /**
     * When set to True indicates that the pricing returned is approximate. Supported providers are MCH/ACH
     * 
     */
    @XmlAttribute(name = "IsPricingApproximate")
    protected Boolean isPricingApproximate;
    /**
     * Indicates if the optional service is not offered, is available for a charge, or is included in the brand
     * 
     */
    @XmlAttribute(name = "Chargeable")
    protected String chargeable;
    /**
     * Identifies if the service was filed with a fee that is inclusive of tax.
     * 
     */
    @XmlAttribute(name = "InclusiveOfTax")
    protected Boolean inclusiveOfTax;
    /**
     * Identifies if the interline settlement is allowed in service .
     * 
     */
    @XmlAttribute(name = "InterlineSettlementAllowed")
    protected Boolean interlineSettlementAllowed;
    /**
     * Sector, Portion, Journey.
     * 
     */
    @XmlAttribute(name = "GeographySpecification")
    protected String geographySpecification;
    /**
     * The cost of the bag per unit weight.
     * 
     */
    @XmlAttribute(name = "ExcessWeightRate")
    protected String excessWeightRate;
    /**
     * The Source of the optional service. The source can be ACH, MCE, or MCH.
     * 
     */
    @XmlAttribute(name = "Source")
    protected String source;
    /**
     * Describes if the OptionalService is viewable only or not.
     *                            If viewable only then the service cannot be sold.
     * 
     */
    @XmlAttribute(name = "ViewableOnly")
    protected Boolean viewableOnly;
    /**
     * Title of the Optional Service.  Provider: ACH
     * 
     */
    @XmlAttribute(name = "DisplayText")
    protected String displayText;
    /**
     * The excess weight of a bag. Providers: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "WeightInExcess")
    protected String weightInExcess;
    /**
     * The total weight of a bag. Providers: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "TotalWeight")
    protected String totalWeight;
    /**
     * The per unit price of baggage. Providers: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "BaggageUnitPrice")
    protected String baggageUnitPrice;
    /**
     * Indicates the minimum occurrence of excess baggage.Provider: 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "FirstPiece")
    protected Integer firstPiece;
    /**
     * Indicates the maximum occurrence of excess baggage. Provider: 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "LastPiece")
    protected Integer lastPiece;
    /**
     * When set to “true”, the Optional Service is restricted by an embargo. Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "Restricted")
    protected Boolean restricted;
    /**
     * When set to “true”, the Optional Service must be re-priced. Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "IsRepriceRequired")
    protected Boolean isRepriceRequired;
    /**
     * Indicates the Optional Service quantity already booked. Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "BookedQuantity")
    protected String bookedQuantity;
    /**
     * Associates Optional Services with the same ServiceSub Code, Air Segment, Passenger, and EMD Associated Item. Provider:1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "Group")
    protected String group;
    /**
     * The PCC or SID that booked the Optional Service.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    /**
     * Optional service group name.
     * 
     */
    @XmlAttribute(name = "Tag")
    protected String tag;
    /**
     * Optional service group display order.
     * 
     */
    @XmlAttribute(name = "DisplayOrder")
    protected Integer displayOrder;
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
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * Gets the value of the serviceData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceData }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceData property.
     */
    public List<ServiceData> getServiceData() {
        if (serviceData == null) {
            serviceData = new ArrayList<>();
        }
        return this.serviceData;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfo }
     *     
     */
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfo }
     *     
     */
    public void setServiceInfo(ServiceInfo value) {
        this.serviceInfo = value;
    }

    /**
     * Information regarding any specific
     *                             for this service.
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
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
     * Gets the value of the emd property.
     * 
     * @return
     *     possible object is
     *     {@link EMD }
     *     
     */
    public EMD getEMD() {
        return emd;
    }

    /**
     * Sets the value of the emd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMD }
     *     
     */
    public void setEMD(EMD value) {
        this.emd = value;
    }

    /**
     * Gets the value of the bundledServices property.
     * 
     * @return
     *     possible object is
     *     {@link BundledServices }
     *     
     */
    public BundledServices getBundledServices() {
        return bundledServices;
    }

    /**
     * Sets the value of the bundledServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundledServices }
     *     
     */
    public void setBundledServices(BundledServices value) {
        this.bundledServices = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the additionalInfo property.
     */
    public List<AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<>();
        }
        return this.additionalInfo;
    }

    /**
     * Specifies how the Optional Service fee is to be applied.  The choices are Per One Way, Per Round Trip, Per Item (Per Piece), Per Travel, Per Ticket, Per 1 Kilo, Per 5 Kilos.  Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link FeeApplication }
     *     
     */
    public FeeApplication getFeeApplication() {
        return feeApplication;
    }

    /**
     * Sets the value of the feeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplication }
     *     
     * @see #getFeeApplication()
     */
    public void setFeeApplication(FeeApplication value) {
        this.feeApplication = value;
    }

    /**
     * Type of Text, Eg-'Upsell','Marketing Agent','Marketing Consumer','Strapline','Rule'.
     * 
     * Gets the value of the text property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the text property.
     */
    public List<TypeTextElement> getText() {
        if (text == null) {
            text = new ArrayList<>();
        }
        return this.text;
    }

    /**
     * Gets the value of the priceRange property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRange property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRange }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceRange property.
     */
    public List<PriceRange> getPriceRange() {
        if (priceRange == null) {
            priceRange = new ArrayList<>();
        }
        return this.priceRange;
    }

    /**
     * Tour Code Fare Basis
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
     * Branding information for the Ancillary Service.  Returned in Seat Map only.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link BrandingInfo }
     *     
     */
    public BrandingInfo getBrandingInfo() {
        return brandingInfo;
    }

    /**
     * Sets the value of the brandingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingInfo }
     *     
     * @see #getBrandingInfo()
     */
    public void setBrandingInfo(BrandingInfo value) {
        this.brandingInfo = value;
    }

    /**
     * The additional titles associated to the brand or optional service. Providers: ACH, RCH, 1G, 1V, 1P.
     * 
     * Gets the value of the title property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the title property.
     */
    public List<TypeTextElement> getTitle() {
        if (title == null) {
            title = new ArrayList<>();
        }
        return this.title;
    }

    /**
     * UniqueID to associate a rule to the
     *                         Optional Service
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServicesRuleRef() {
        return optionalServicesRuleRef;
    }

    /**
     * Sets the value of the optionalServicesRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOptionalServicesRuleRef()
     */
    public void setOptionalServicesRuleRef(String value) {
        this.optionalServicesRuleRef = value;
    }

    /**
     * Specify the type of service offered (e.g.
     *                         seats, baggage, etc.)
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
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Confirmation number provided by the
     *                         supplier
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
     * The secondary option code type required for
     *                         certain options
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSecondaryType()
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * Describes when the Service is available
     *                         for confirmation or purchase (e.g. Booking Only, Check-in Only,
     *                         Anytime, etc.)
     * 
     * @return
     *     possible object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public TypePurchaseWindow getPurchaseWindow() {
        return purchaseWindow;
    }

    /**
     * Sets the value of the purchaseWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePurchaseWindow }
     *     
     * @see #getPurchaseWindow()
     */
    public void setPurchaseWindow(TypePurchaseWindow value) {
        this.purchaseWindow = value;
    }

    /**
     * Numeric value that represents the priority
     *                         order of the Service
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getPriority()
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Boolean to describe whether the Service is
     *                         available for sale or not
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAvailable()
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

    /**
     * Boolean to describe whether the passenger
     *                         is entitled for the service without charge or not
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitled() {
        return entitled;
    }

    /**
     * Sets the value of the entitled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEntitled()
     */
    public void setEntitled(Boolean value) {
        this.entitled = value;
    }

    /**
     * Boolean to describe whether the Amount on
     *                         the Service is charged per traveler.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPerTraveler() {
        if (perTraveler == null) {
            return true;
        } else {
            return perTraveler;
        }
    }

    /**
     * Sets the value of the perTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPerTraveler()
     */
    public void setPerTraveler(Boolean value) {
        this.perTraveler = value;
    }

    /**
     * Timestamp when this service/offer got
     *                         created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreateDate()
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Reference to a payment for merchandising
     *                         services.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentRef()
     */
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * Specify the service status (e.g. active,
     *                         canceled, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceStatus()
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * The number of units availed for each optional
     *                         service (e.g. 2 baggage availed will be specified as 2 in quantity
     *                         for optional service BAGGAGE)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getQuantity()
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * The sequence number associated with the
     *                         OptionalService
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSequenceNumber()
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * The service subcode associated with the
     *                         OptionalService
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceSubCode()
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * The SSR Code associated with the
     *                         OptionalService
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSSRCode()
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * A one-letter code specifying the reason for
     *                         issuance of the OptionalService
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceReason() {
        return issuanceReason;
    }

    /**
     * Sets the value of the issuanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssuanceReason()
     */
    public void setIssuanceReason(String value) {
        this.issuanceReason = value;
    }

    /**
     * Original Type as sent by the provider
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderDefinedType()
     */
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
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
     * Indicates whether price is assessed by mileage or currency or both
     * 
     * @return
     *     possible object is
     *     {@link TypeAssessIndicator }
     *     
     */
    public TypeAssessIndicator getAssessIndicator() {
        return assessIndicator;
    }

    /**
     * Sets the value of the assessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAssessIndicator }
     *     
     * @see #getAssessIndicator()
     */
    public void setAssessIndicator(TypeAssessIndicator value) {
        this.assessIndicator = value;
    }

    /**
     * Indicates mileage fee/amount
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMileage()
     */
    public void setMileage(BigInteger value) {
        this.mileage = value;
    }

    /**
     * Numerical value of the loyalty card level for which this service is available.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicableFFLevel() {
        return applicableFFLevel;
    }

    /**
     * Sets the value of the applicableFFLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getApplicableFFLevel()
     */
    public void setApplicableFFLevel(Integer value) {
        this.applicableFFLevel = value;
    }

    /**
     * Describes if service is private or not.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivate() {
        return _private;
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrivate()
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Certain SSR types sent in OptionalService SSRCode require a free text message. For example, PETC Pet in Cabin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRFreeText() {
        return ssrFreeText;
    }

    /**
     * Sets the value of the ssrFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSSRFreeText()
     */
    public void setSSRFreeText(String value) {
        this.ssrFreeText = value;
    }

    /**
     * When set to True indicates that the pricing returned is approximate. Supported providers are MCH/ACH
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPricingApproximate() {
        return isPricingApproximate;
    }

    /**
     * Sets the value of the isPricingApproximate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsPricingApproximate()
     */
    public void setIsPricingApproximate(Boolean value) {
        this.isPricingApproximate = value;
    }

    /**
     * Indicates if the optional service is not offered, is available for a charge, or is included in the brand
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeable() {
        return chargeable;
    }

    /**
     * Sets the value of the chargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChargeable()
     */
    public void setChargeable(String value) {
        this.chargeable = value;
    }

    /**
     * Identifies if the service was filed with a fee that is inclusive of tax.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveOfTax() {
        return inclusiveOfTax;
    }

    /**
     * Sets the value of the inclusiveOfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInclusiveOfTax()
     */
    public void setInclusiveOfTax(Boolean value) {
        this.inclusiveOfTax = value;
    }

    /**
     * Identifies if the interline settlement is allowed in service .
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterlineSettlementAllowed() {
        return interlineSettlementAllowed;
    }

    /**
     * Sets the value of the interlineSettlementAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInterlineSettlementAllowed()
     */
    public void setInterlineSettlementAllowed(Boolean value) {
        this.interlineSettlementAllowed = value;
    }

    /**
     * Sector, Portion, Journey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographySpecification() {
        return geographySpecification;
    }

    /**
     * Sets the value of the geographySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGeographySpecification()
     */
    public void setGeographySpecification(String value) {
        this.geographySpecification = value;
    }

    /**
     * The cost of the bag per unit weight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcessWeightRate() {
        return excessWeightRate;
    }

    /**
     * Sets the value of the excessWeightRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExcessWeightRate()
     */
    public void setExcessWeightRate(String value) {
        this.excessWeightRate = value;
    }

    /**
     * The Source of the optional service. The source can be ACH, MCE, or MCH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Describes if the OptionalService is viewable only or not.
     *                            If viewable only then the service cannot be sold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewableOnly() {
        return viewableOnly;
    }

    /**
     * Sets the value of the viewableOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isViewableOnly()
     */
    public void setViewableOnly(Boolean value) {
        this.viewableOnly = value;
    }

    /**
     * Title of the Optional Service.  Provider: ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisplayText()
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * The excess weight of a bag. Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightInExcess() {
        return weightInExcess;
    }

    /**
     * Sets the value of the weightInExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWeightInExcess()
     */
    public void setWeightInExcess(String value) {
        this.weightInExcess = value;
    }

    /**
     * The total weight of a bag. Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTotalWeight()
     */
    public void setTotalWeight(String value) {
        this.totalWeight = value;
    }

    /**
     * The per unit price of baggage. Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageUnitPrice() {
        return baggageUnitPrice;
    }

    /**
     * Sets the value of the baggageUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageUnitPrice()
     */
    public void setBaggageUnitPrice(String value) {
        this.baggageUnitPrice = value;
    }

    /**
     * Indicates the minimum occurrence of excess baggage.Provider: 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstPiece() {
        return firstPiece;
    }

    /**
     * Sets the value of the firstPiece property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFirstPiece()
     */
    public void setFirstPiece(Integer value) {
        this.firstPiece = value;
    }

    /**
     * Indicates the maximum occurrence of excess baggage. Provider: 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastPiece() {
        return lastPiece;
    }

    /**
     * Sets the value of the lastPiece property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getLastPiece()
     */
    public void setLastPiece(Integer value) {
        this.lastPiece = value;
    }

    /**
     * When set to “true”, the Optional Service is restricted by an embargo. Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRestricted() {
        if (restricted == null) {
            return false;
        } else {
            return restricted;
        }
    }

    /**
     * Sets the value of the restricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRestricted()
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * When set to “true”, the Optional Service must be re-priced. Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsRepriceRequired() {
        if (isRepriceRequired == null) {
            return false;
        } else {
            return isRepriceRequired;
        }
    }

    /**
     * Sets the value of the isRepriceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRepriceRequired()
     */
    public void setIsRepriceRequired(Boolean value) {
        this.isRepriceRequired = value;
    }

    /**
     * Indicates the Optional Service quantity already booked. Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedQuantity() {
        return bookedQuantity;
    }

    /**
     * Sets the value of the bookedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookedQuantity()
     */
    public void setBookedQuantity(String value) {
        this.bookedQuantity = value;
    }

    /**
     * Associates Optional Services with the same ServiceSub Code, Air Segment, Passenger, and EMD Associated Item. Provider:1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGroup()
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * The PCC or SID that booked the Optional Service.
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
     * Optional service group name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTag()
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Optional service group display order.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDisplayOrder()
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
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

}
