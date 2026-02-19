
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Journey" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LegRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareNote" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareNoteRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Connection" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}MetaData" maxOccurs="999" minOccurs="0"/>
 *         <element name="AirPricingResultMessage" type="{http://www.travelport.com/schema/common_v54_0}typeResultMessage" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirItinerarySolutionRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AvailableSSR" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PricingDetails" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CompleteItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       <attribute name="QuoteDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Itinerary">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="New"/>
 *             <enumeration value="Original"/>
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
    "airSegment",
    "airSegmentRef",
    "journey",
    "legRef",
    "airPricingInfo",
    "fareNote",
    "fareNoteRef",
    "connection",
    "metaData",
    "airPricingResultMessage",
    "feeInfo",
    "taxInfo",
    "airItinerarySolutionRef",
    "hostToken",
    "optionalServices",
    "availableSSR",
    "pricingDetails"
})
@XmlRootElement(name = "AirPricingSolution")
public class AirPricingSolution {

    /**
     * An Air marketable travel segment.
     * 
     */
    @XmlElement(name = "AirSegment")
    protected List<TypeBaseAirSegment> airSegment;
    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     */
    @XmlElement(name = "AirSegmentRef")
    protected List<AirSegmentRef> airSegmentRef;
    /**
     * Information about all connecting segment list and total traveling time
     * 
     */
    @XmlElement(name = "Journey")
    protected List<Journey> journey;
    /**
     * Reference to a Leg
     * 
     */
    @XmlElement(name = "LegRef")
    protected List<LegRef> legRef;
    /**
     * Per traveler type pricing breakdown. This will
     *                 reflect the pricing for all travelers of the specified type.
     * 
     */
    @XmlElement(name = "AirPricingInfo")
    protected List<AirPricingInfo> airPricingInfo;
    /**
     * A simple textual fare note. Used within several
     *                 other objects.
     * 
     */
    @XmlElement(name = "FareNote")
    protected List<FareNote> fareNote;
    /**
     * A reference to a fare note from a shared list.
     *                 Used to minimize xml results.
     * 
     */
    @XmlElement(name = "FareNoteRef")
    protected List<FareNoteRef> fareNoteRef;
    /**
     * Flight Connection Information
     * 
     */
    @XmlElement(name = "Connection")
    protected List<Connection> connection;
    /**
     * Extra data to elaborate the parent element. This data is primarily informative and is not persisted.
     * 
     */
    @XmlElement(name = "MetaData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<MetaData> metaData;
    @XmlElement(name = "AirPricingResultMessage")
    protected List<TypeResultMessage> airPricingResultMessage;
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
    protected List<TypeTaxInfo> taxInfo;
    /**
     * Reference to a complete
     *                 AirItinerarySolution from a shared list
     * 
     */
    @XmlElement(name = "AirItinerarySolutionRef")
    protected List<AirItinerarySolutionRef> airItinerarySolutionRef;
    /**
     * one or more hosts
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * A wrapper for all the information regarding each
     *                 of the available SSR
     * 
     */
    @XmlElement(name = "AvailableSSR")
    protected AvailableSSR availableSSR;
    /**
     * Used for rapid reprice. This is a response element.  Additional information about how pricing was obtain, messages, etc.  Providers: 1G/1V/1P/1S/1A
     * 
     */
    @XmlElement(name = "PricingDetails")
    protected PricingDetails pricingDetails;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * This attribute is used to return whether complete Itinerary is present in the AirPricingSolution structure or not. If set to true means AirPricingSolution contains the result for full requested itinerary.
     * 
     */
    @XmlAttribute(name = "CompleteItinerary")
    protected Boolean completeItinerary;
    /**
     * This date will be equal to the date of the transaction unless the request included a modified ticket date.
     * 
     */
    @XmlAttribute(name = "QuoteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar quoteDate;
    /**
     * For an exchange request this tells if the itinerary is the original one or new one. A value of Original will only apply to 1G/1V/1P/1S/1A. A value of New will apply to 1G/1V/1P/1S/1A/ACH.
     * 
     */
    @XmlAttribute(name = "Itinerary")
    protected String itinerary;
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
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     * Gets the value of the airSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentRef property.
     */
    public List<AirSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<>();
        }
        return this.airSegmentRef;
    }

    /**
     * Information about all connecting segment list and total traveling time
     * 
     * Gets the value of the journey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Journey }
     * </p>
     * 
     * 
     * @return
     *     The value of the journey property.
     */
    public List<Journey> getJourney() {
        if (journey == null) {
            journey = new ArrayList<>();
        }
        return this.journey;
    }

    /**
     * Reference to a Leg
     * 
     * Gets the value of the legRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLegRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the legRef property.
     */
    public List<LegRef> getLegRef() {
        if (legRef == null) {
            legRef = new ArrayList<>();
        }
        return this.legRef;
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
     * A reference to a fare note from a shared list.
     *                 Used to minimize xml results.
     * 
     * Gets the value of the fareNoteRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareNoteRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareNoteRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareNoteRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareNoteRef property.
     */
    public List<FareNoteRef> getFareNoteRef() {
        if (fareNoteRef == null) {
            fareNoteRef = new ArrayList<>();
        }
        return this.fareNoteRef;
    }

    /**
     * Flight Connection Information
     * 
     * Gets the value of the connection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * </p>
     * 
     * 
     * @return
     *     The value of the connection property.
     */
    public List<Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<>();
        }
        return this.connection;
    }

    /**
     * Extra data to elaborate the parent element. This data is primarily informative and is not persisted.
     * 
     * Gets the value of the metaData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaData }
     * </p>
     * 
     * 
     * @return
     *     The value of the metaData property.
     */
    public List<MetaData> getMetaData() {
        if (metaData == null) {
            metaData = new ArrayList<>();
        }
        return this.metaData;
    }

    /**
     * Gets the value of the airPricingResultMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingResultMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingResultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingResultMessage property.
     */
    public List<TypeResultMessage> getAirPricingResultMessage() {
        if (airPricingResultMessage == null) {
            airPricingResultMessage = new ArrayList<>();
        }
        return this.airPricingResultMessage;
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
     * Reference to a complete
     *                 AirItinerarySolution from a shared list
     * 
     * Gets the value of the airItinerarySolutionRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItinerarySolutionRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirItinerarySolutionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItinerarySolutionRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airItinerarySolutionRef property.
     */
    public List<AirItinerarySolutionRef> getAirItinerarySolutionRef() {
        if (airItinerarySolutionRef == null) {
            airItinerarySolutionRef = new ArrayList<>();
        }
        return this.airItinerarySolutionRef;
    }

    /**
     * one or more hosts
     * 
     * Gets the value of the hostToken property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostToken property.
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<>();
        }
        return this.hostToken;
    }

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
     * A wrapper for all the information regarding each
     *                 of the available SSR
     * 
     * @return
     *     possible object is
     *     {@link AvailableSSR }
     *     
     */
    public AvailableSSR getAvailableSSR() {
        return availableSSR;
    }

    /**
     * Sets the value of the availableSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSSR }
     *     
     * @see #getAvailableSSR()
     */
    public void setAvailableSSR(AvailableSSR value) {
        this.availableSSR = value;
    }

    /**
     * Used for rapid reprice. This is a response element.  Additional information about how pricing was obtain, messages, etc.  Providers: 1G/1V/1P/1S/1A
     * 
     * @return
     *     possible object is
     *     {@link PricingDetails }
     *     
     */
    public PricingDetails getPricingDetails() {
        return pricingDetails;
    }

    /**
     * Sets the value of the pricingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingDetails }
     *     
     * @see #getPricingDetails()
     */
    public void setPricingDetails(PricingDetails value) {
        this.pricingDetails = value;
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
     * This attribute is used to return whether complete Itinerary is present in the AirPricingSolution structure or not. If set to true means AirPricingSolution contains the result for full requested itinerary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompleteItinerary() {
        if (completeItinerary == null) {
            return true;
        } else {
            return completeItinerary;
        }
    }

    /**
     * Sets the value of the completeItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCompleteItinerary()
     */
    public void setCompleteItinerary(Boolean value) {
        this.completeItinerary = value;
    }

    /**
     * This date will be equal to the date of the transaction unless the request included a modified ticket date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuoteDate() {
        return quoteDate;
    }

    /**
     * Sets the value of the quoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getQuoteDate()
     */
    public void setQuoteDate(XMLGregorianCalendar value) {
        this.quoteDate = value;
    }

    /**
     * For an exchange request this tells if the itinerary is the original one or new one. A value of Original will only apply to 1G/1V/1P/1S/1A. A value of New will apply to 1G/1V/1P/1S/1A/ACH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getItinerary()
     */
    public void setItinerary(String value) {
        this.itinerary = value;
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
