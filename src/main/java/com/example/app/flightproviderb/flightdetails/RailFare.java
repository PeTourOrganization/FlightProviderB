
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
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareNoteRef" maxOccurs="999" minOccurs="0"/>
 *         <choice>
 *           <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareID" maxOccurs="999" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareIDRef" maxOccurs="999" minOccurs="0"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}FareValidity" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}FulFillmentType" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareComponent" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CabinClass" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRailCabin" />
 *       <attribute name="PassengerTypeCode" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="EffectiveDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="RouteDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TicketTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FareReference">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="32"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CrossCityFare" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="OriginStationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DestinationStationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ReservationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="JourneyDirection" type="{http://www.travelport.com/schema/rail_v54_0}typeJourneyDirection" />
 *       <attribute name="RailLocOrigin" type="{http://www.travelport.com/schema/common_v54_0}typeRailLocationCode" />
 *       <attribute name="RailLocDestination" type="{http://www.travelport.com/schema/common_v54_0}typeRailLocationCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railFareNoteRef",
    "railFareID",
    "railFareIDRef",
    "fareValidity",
    "hostToken",
    "fulFillmentType",
    "railFareComponent"
})
@XmlRootElement(name = "RailFare", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailFare {

    /**
     * Key reference to RailFareNote present in RailFareNotList
     * 
     */
    @XmlElement(name = "RailFareNoteRef", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailFareNoteRef> railFareNoteRef;
    @XmlElement(name = "RailFareID", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailFareID> railFareID;
    /**
     * Reference to a complete FareID from a shared list
     * 
     */
    @XmlElement(name = "RailFareIDRef", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailFareIDRef> railFareIDRef;
    /**
     * Associates fare validity dates with journeys.
     * 
     */
    @XmlElement(name = "FareValidity", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<FareValidity> fareValidity;
    /**
     * one or more hosts
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected HostToken hostToken;
    /**
     * Fulfillment options for this segment. the options will be one of "Ticket on Departure", "Ticketless", "Ticket By Email", "Travel Agency"
     * 
     */
    @XmlElement(name = "FulFillmentType", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<String> fulFillmentType;
    /**
     * Contains fare and discount information for each passenger type
     * 
     */
    @XmlElement(name = "RailFareComponent", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailFareComponent> railFareComponent;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The fare basis code  or fare description for this fare
     * 
     */
    @XmlAttribute(name = "FareBasis")
    protected String fareBasis;
    /**
     * The fare basis code or fare class for this fare
     * 
     */
    @XmlAttribute(name = "CabinClass", required = true)
    protected String cabinClass;
    /**
     * The PTC that is associated with this fare. Default to ADT
     * 
     */
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    /**
     * Returns the airport or city code that defines the origin market for this fare.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * Returns the airport or city code that defines the destination market for this fare.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * Returns the date on which this fare was quoted. Set as current date
     * 
     */
    @XmlAttribute(name = "EffectiveDate", required = true)
    protected String effectiveDate;
    @XmlAttribute(name = "Amount")
    protected String amount;
    /**
     * Describes the route of the train fare.
     * 
     */
    @XmlAttribute(name = "RouteDescription")
    protected String routeDescription;
    /**
     * Describes the main identifier code of the fare.
     * 
     */
    @XmlAttribute(name = "TicketTypeCode")
    protected String ticketTypeCode;
    /**
     * Unique reference for the fare that is required in RailExchangeQuote request.
     * 
     */
    @XmlAttribute(name = "FareReference")
    protected String fareReference;
    /**
     * Set to 'true' if the fare is valid across a Metropolitan Area, eg. Cross-London travel via the London Underground.
     * 
     */
    @XmlAttribute(name = "CrossCityFare")
    protected Boolean crossCityFare;
    /**
     * The origin station name for the Rail Fare.
     * 
     */
    @XmlAttribute(name = "OriginStationName")
    protected String originStationName;
    /**
     * The destination station name for the Rail Fare.
     * 
     */
    @XmlAttribute(name = "DestinationStationName")
    protected String destinationStationName;
    /**
     * Set to true if a seat reservation is required while booking.
     * 
     */
    @XmlAttribute(name = "ReservationRequired")
    protected Boolean reservationRequired;
    /**
     * The direction of the Journey (Outward or Return) associated with the Rail fare.
     * 
     */
    @XmlAttribute(name = "JourneyDirection")
    protected TypeJourneyDirection journeyDirection;
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

    /**
     * Key reference to RailFareNote present in RailFareNotList
     * 
     * Gets the value of the railFareNoteRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareNoteRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailFareNoteRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareNoteRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the railFareNoteRef property.
     */
    public List<RailFareNoteRef> getRailFareNoteRef() {
        if (railFareNoteRef == null) {
            railFareNoteRef = new ArrayList<>();
        }
        return this.railFareNoteRef;
    }

    /**
     * Gets the value of the railFareID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailFareID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareID }
     * </p>
     * 
     * 
     * @return
     *     The value of the railFareID property.
     */
    public List<RailFareID> getRailFareID() {
        if (railFareID == null) {
            railFareID = new ArrayList<>();
        }
        return this.railFareID;
    }

    /**
     * Reference to a complete FareID from a shared list
     * 
     * Gets the value of the railFareIDRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareIDRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailFareIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareIDRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the railFareIDRef property.
     */
    public List<RailFareIDRef> getRailFareIDRef() {
        if (railFareIDRef == null) {
            railFareIDRef = new ArrayList<>();
        }
        return this.railFareIDRef;
    }

    /**
     * Associates fare validity dates with journeys.
     * 
     * Gets the value of the fareValidity property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareValidity property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareValidity }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareValidity property.
     */
    public List<FareValidity> getFareValidity() {
        if (fareValidity == null) {
            fareValidity = new ArrayList<>();
        }
        return this.fareValidity;
    }

    /**
     * one or more hosts
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     * @see #getHostToken()
     */
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Fulfillment options for this segment. the options will be one of "Ticket on Departure", "Ticketless", "Ticket By Email", "Travel Agency"
     * 
     * Gets the value of the fulFillmentType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulFillmentType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFulFillmentType().add(newItem);
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
     *     The value of the fulFillmentType property.
     */
    public List<String> getFulFillmentType() {
        if (fulFillmentType == null) {
            fulFillmentType = new ArrayList<>();
        }
        return this.fulFillmentType;
    }

    /**
     * Contains fare and discount information for each passenger type
     * 
     * Gets the value of the railFareComponent property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareComponent property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareComponent }
     * </p>
     * 
     * 
     * @return
     *     The value of the railFareComponent property.
     */
    public List<RailFareComponent> getRailFareComponent() {
        if (railFareComponent == null) {
            railFareComponent = new ArrayList<>();
        }
        return this.railFareComponent;
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
     * The fare basis code  or fare description for this fare
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
     * @see #getFareBasis()
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * The fare basis code or fare class for this fare
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * The PTC that is associated with this fare. Default to ADT
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassengerTypeCode()
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Returns the airport or city code that defines the origin market for this fare.
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
     * Returns the airport or city code that defines the destination market for this fare.
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
     * Returns the date on which this fare was quoted. Set as current date
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEffectiveDate()
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
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
     * Describes the route of the train fare.
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
     * Describes the main identifier code of the fare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketTypeCode() {
        return ticketTypeCode;
    }

    /**
     * Sets the value of the ticketTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketTypeCode()
     */
    public void setTicketTypeCode(String value) {
        this.ticketTypeCode = value;
    }

    /**
     * Unique reference for the fare that is required in RailExchangeQuote request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareReference() {
        return fareReference;
    }

    /**
     * Sets the value of the fareReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareReference()
     */
    public void setFareReference(String value) {
        this.fareReference = value;
    }

    /**
     * Set to 'true' if the fare is valid across a Metropolitan Area, eg. Cross-London travel via the London Underground.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCrossCityFare() {
        if (crossCityFare == null) {
            return false;
        } else {
            return crossCityFare;
        }
    }

    /**
     * Sets the value of the crossCityFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCrossCityFare()
     */
    public void setCrossCityFare(Boolean value) {
        this.crossCityFare = value;
    }

    /**
     * The origin station name for the Rail Fare.
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
     * The destination station name for the Rail Fare.
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
     * Set to true if a seat reservation is required while booking.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationRequired() {
        return reservationRequired;
    }

    /**
     * Sets the value of the reservationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReservationRequired()
     */
    public void setReservationRequired(Boolean value) {
        this.reservationRequired = value;
    }

    /**
     * The direction of the Journey (Outward or Return) associated with the Rail fare.
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

}
