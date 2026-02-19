
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *           <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSegment" maxOccurs="999"/>
 *           <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSegmentRef" maxOccurs="999"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}JourneyRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/rail_v54_0}attrRailSegmentOrigDestInfo"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="RouteDescription">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="JourneyDirection" type="{http://www.travelport.com/schema/rail_v54_0}typeJourneyDirection" />
 *       <attribute name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="RouteReference">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railSegment",
    "railSegmentRef",
    "journeyRemark",
    "hostToken"
})
@XmlRootElement(name = "RailJourney", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailJourney {

    /**
     * Rail Segment
     * 
     */
    @XmlElement(name = "RailSegment", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailSegment> railSegment;
    /**
     * Reference to a RaiLSegment
     * 
     */
    @XmlElement(name = "RailSegmentRef", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailSegmentRef> railSegmentRef;
    /**
     * A Remark for a Journey.
     * 
     */
    @XmlElement(name = "JourneyRemark", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<JourneyRemark> journeyRemark;
    /**
     * one or more hosts
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The description of the route.
     * 
     */
    @XmlAttribute(name = "RouteDescription")
    protected String routeDescription;
    /**
     * The direction of the Journey (Outward or Return).
     * 
     */
    @XmlAttribute(name = "JourneyDirection")
    protected TypeJourneyDirection journeyDirection;
    /**
     * The duration of the entire Journey in minutes
     * 
     */
    @XmlAttribute(name = "JourneyDuration")
    protected BigInteger journeyDuration;
    /**
     * Status of this Journey.
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Passive provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel/Rail segments/reservations/Journeys based on travel dates. This ordering is applicable across the UR not provider or traveler specific
     * 
     */
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;
    /**
     * RouteReference is required in seat assignment purpose
     * 
     */
    @XmlAttribute(name = "RouteReference")
    protected String routeReference;
    /**
     * "Type of exchange. Add - Add new Journey. Update - Modify existing Journey. Delete - Remove existing Journey"
     * 
     */
    @XmlAttribute(name = "Operation")
    protected String operation;
    /**
     * The IATA location code for this origination of this entity.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * The IATA location code for this destination of this entity.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * The date and time at which this entity departs. This does not include time zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "DepartureTime", required = true)
    protected String departureTime;
    /**
     * The date and time at which this entity arrives at the destination. This does not include time zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    /**
     * The origin station name for the Journey.
     * 
     */
    @XmlAttribute(name = "OriginStationName")
    protected String originStationName;
    /**
     * The destination station name for the Journey.
     * 
     */
    @XmlAttribute(name = "DestinationStationName")
    protected String destinationStationName;
    /**
     * RCH specific origin code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     */
    @XmlAttribute(name = "RailLocOrigin")
    protected String railLocOrigin;
    /**
     * RCH specific destination code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     */
    @XmlAttribute(name = "RailLocDestination")
    protected String railLocDestination;
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
     * Rail Segment
     * 
     * Gets the value of the railSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the railSegment property.
     */
    public List<RailSegment> getRailSegment() {
        if (railSegment == null) {
            railSegment = new ArrayList<>();
        }
        return this.railSegment;
    }

    /**
     * Reference to a RaiLSegment
     * 
     * Gets the value of the railSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSegmentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the railSegmentRef property.
     */
    public List<RailSegmentRef> getRailSegmentRef() {
        if (railSegmentRef == null) {
            railSegmentRef = new ArrayList<>();
        }
        return this.railSegmentRef;
    }

    /**
     * A Remark for a Journey.
     * 
     * Gets the value of the journeyRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getJourneyRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the journeyRemark property.
     */
    public List<JourneyRemark> getJourneyRemark() {
        if (journeyRemark == null) {
            journeyRemark = new ArrayList<>();
        }
        return this.journeyRemark;
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
     * The description of the route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDescription() {
        return routeDescription;
    }

    /**
     * Sets the value of the routeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRouteDescription()
     */
    public void setRouteDescription(String value) {
        this.routeDescription = value;
    }

    /**
     * The direction of the Journey (Outward or Return).
     * 
     * @return
     *     possible object is
     *     {@link TypeJourneyDirection }
     *     
     */
    public TypeJourneyDirection getJourneyDirection() {
        return journeyDirection;
    }

    /**
     * Sets the value of the journeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeJourneyDirection }
     *     
     * @see #getJourneyDirection()
     */
    public void setJourneyDirection(TypeJourneyDirection value) {
        this.journeyDirection = value;
    }

    /**
     * The duration of the entire Journey in minutes
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJourneyDuration() {
        return journeyDuration;
    }

    /**
     * Sets the value of the journeyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getJourneyDuration()
     */
    public void setJourneyDuration(BigInteger value) {
        this.journeyDuration = value;
    }

    /**
     * Status of this Journey.
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
     * Provider reservation reference key.
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
     * Passive provider reservation reference key.
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
     * To identify the appropriate travel sequence for Air/Car/Hotel/Rail segments/reservations/Journeys based on travel dates. This ordering is applicable across the UR not provider or traveler specific
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTravelOrder()
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }

    /**
     * RouteReference is required in seat assignment purpose
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteReference() {
        return routeReference;
    }

    /**
     * Sets the value of the routeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRouteReference()
     */
    public void setRouteReference(String value) {
        this.routeReference = value;
    }

    /**
     * "Type of exchange. Add - Add new Journey. Update - Modify existing Journey. Delete - Remove existing Journey"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperation()
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * The IATA location code for this origination of this entity.
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
     * The IATA location code for this destination of this entity.
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
     * The date and time at which this entity departs. This does not include time zone information since it can be derived from the origin location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDepartureTime()
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * The date and time at which this entity arrives at the destination. This does not include time zone information since it can be derived from the origin location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getArrivalTime()
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * The origin station name for the Journey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationName() {
        return originStationName;
    }

    /**
     * Sets the value of the originStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginStationName()
     */
    public void setOriginStationName(String value) {
        this.originStationName = value;
    }

    /**
     * The destination station name for the Journey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationName() {
        return destinationStationName;
    }

    /**
     * Sets the value of the destinationStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestinationStationName()
     */
    public void setDestinationStationName(String value) {
        this.destinationStationName = value;
    }

    /**
     * RCH specific origin code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocOrigin() {
        return railLocOrigin;
    }

    /**
     * Sets the value of the railLocOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailLocOrigin()
     */
    public void setRailLocOrigin(String value) {
        this.railLocOrigin = value;
    }

    /**
     * RCH specific destination code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocDestination() {
        return railLocDestination;
    }

    /**
     * Sets the value of the railLocDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailLocDestination()
     */
    public void setRailLocDestination(String value) {
        this.railLocDestination = value;
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
