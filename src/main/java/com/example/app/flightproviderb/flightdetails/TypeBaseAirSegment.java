
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBaseAirSegment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeBaseAirSegment">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}Segment">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SponsoredFltInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CodeshareInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirAvailInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightDetails" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightDetailsRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AlternateLocationDistanceRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Connection" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SellMessage" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RailCoachDetails" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrOrigDestDepatureInfo"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attGroup ref="{http://www.travelport.com/schema/air_v54_0}attrLinkInfo"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrFlightTimes"/>
 *       <attribute name="OpenSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typeClassOfService" />
 *       <attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v54_0}typeEticketability" />
 *       <attribute name="Equipment" type="{http://www.travelport.com/schema/air_v54_0}typeEquipment" />
 *       <attribute name="MarriageGroup" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Seamless" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ChangeOfPlane" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="GuaranteedPaymentCarrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="HostTokenRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="OptionalServicesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AvailabilitySource" type="{http://www.travelport.com/schema/air_v54_0}typeAvailabilitySource" />
 *       <attribute name="APISRequirementsRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BlackListed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NumberInParty">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             <minInclusive value="1"/>
 *             <maxInclusive value="99"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="RailCoachNumber">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="4"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="FlownSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ScheduleChange" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="BrandIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBaseAirSegment", propOrder = {
    "sponsoredFltInfo",
    "codeshareInfo",
    "airAvailInfo",
    "flightDetails",
    "flightDetailsRef",
    "alternateLocationDistanceRef",
    "connection",
    "sellMessage",
    "railCoachDetails"
})
public class TypeBaseAirSegment
    extends Segment
{

    /**
     * This describes whether the segment is determined to be a sponsored flight. The SponsoredFltInfo node will only come back for Travelport UIs and not for other customers.
     * 
     */
    @XmlElement(name = "SponsoredFltInfo")
    protected SponsoredFltInfo sponsoredFltInfo;
    /**
     * Describes the codeshare disclosure (simple
     *                 text string) or the specific operating flight information (as
     *                 attributes).
     * 
     */
    @XmlElement(name = "CodeshareInfo")
    protected CodeshareInfo codeshareInfo;
    /**
     * Matches class of service information with
     *                 availability counts. Only provided on search results.
     * 
     */
    @XmlElement(name = "AirAvailInfo")
    protected List<AirAvailInfo> airAvailInfo;
    /**
     * Specific details within a flight segment.
     * 
     */
    @XmlElement(name = "FlightDetails")
    protected List<FlightDetails> flightDetails;
    /**
     * Reference to a complete FlightDetails from
     *                 a shared list
     * 
     */
    @XmlElement(name = "FlightDetailsRef")
    protected List<FlightDetailsRef> flightDetailsRef;
    /**
     * Reference to a AlternateLocationDistance
     * 
     */
    @XmlElement(name = "AlternateLocationDistanceRef")
    protected List<AlternateLocationDistanceRef> alternateLocationDistanceRef;
    /**
     * Flight Connection Information
     * 
     */
    @XmlElement(name = "Connection")
    protected Connection connection;
    /**
     * Sell Message from Vendor. This is applicable in response messages only, any input in request message will be ignored.
     * 
     */
    @XmlElement(name = "SellMessage", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> sellMessage;
    @XmlElement(name = "RailCoachDetails")
    protected List<RailCoachDetails> railCoachDetails;
    /**
     * Indicates OpenSegment when True
     * 
     */
    @XmlAttribute(name = "OpenSegment")
    protected Boolean openSegment;
    /**
     * The Origin Destination Grouping of this
     *                                 segment.
     * 
     */
    @XmlAttribute(name = "Group", required = true)
    protected int group;
    /**
     * The carrier that is marketing this segment
     * 
     */
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    /**
     * Specifies Cabin class for a group of
     *                                 class of services. Cabin class is not identified if it is not
     *                                 present.
     * 
     */
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    /**
     * The flight number under which the marketing
     *                                 carrier is marketing this flight
     * 
     */
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;
    /**
     * Identifies if this particular segment
     *                                 is E-Ticketable
     * 
     */
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    /**
     * Identifies the equipment that this
     *                                 segment is operating under.
     * 
     */
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    /**
     * Identifies this segment as being a
     *                                 married segment. It is paired with other segments of the same
     *                                 value.
     * 
     */
    @XmlAttribute(name = "MarriageGroup")
    protected Integer marriageGroup;
    /**
     * Identifies the number of stops for
     *                                 each within the segment.
     * 
     */
    @XmlAttribute(name = "NumberOfStops")
    protected Integer numberOfStops;
    /**
     * Identifies that this segment was sold
     *                                 via a direct access channel to the marketing carrier.
     * 
     */
    @XmlAttribute(name = "Seamless")
    protected Boolean seamless;
    /**
     * Indicates the traveler must change
     *                                 planes between flights.
     * 
     */
    @XmlAttribute(name = "ChangeOfPlane")
    protected Boolean changeOfPlane;
    /**
     * Identifies that this segment has
     *                                 Guaranteed Payment Carrier.
     * 
     */
    @XmlAttribute(name = "GuaranteedPaymentCarrier")
    protected String guaranteedPaymentCarrier;
    /**
     * Identifies that this segment has
     *                                 Guaranteed Payment Carrier.
     * 
     */
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    /**
     * Indicates true if flight provides
     *                                 optional services.
     * 
     */
    @XmlAttribute(name = "OptionalServicesIndicator")
    protected Boolean optionalServicesIndicator;
    /**
     * Indicates Availability source of
     *                                 AirSegment.
     * 
     */
    @XmlAttribute(name = "AvailabilitySource")
    protected String availabilitySource;
    /**
     * Reference to the APIS Requirements for
     *                                 this AirSegment.
     * 
     */
    @XmlAttribute(name = "APISRequirementsRef")
    protected String apisRequirementsRef;
    /**
     * Indicates blacklisted carriers which are banned from servicing points to, from and within the European Community.
     * 
     */
    @XmlAttribute(name = "BlackListed")
    protected Boolean blackListed;
    /**
     * Refers to the flight operational status for the segment.
     *                             This attribute will only be returned in the AvailabilitySearchRsp and not used/returned in any other request/responses.
     *                             If this attribute is not returned back in the response, it means the flight is operational and not past scheduled departure.
     * 
     */
    @XmlAttribute(name = "OperationalStatus")
    protected String operationalStatus;
    /**
     * Number of person traveling in this air segment excluding the number of infants on lap.
     * 
     */
    @XmlAttribute(name = "NumberInParty")
    protected Integer numberInParty;
    /**
     * Coach number for which rail seatmap/coachmap is returned.
     * 
     */
    @XmlAttribute(name = "RailCoachNumber")
    protected String railCoachNumber;
    /**
     * Used for rapid reprice. The date the booking was made. 
     *                         Providers: 1G/1V/1P/1S/1A
     * 
     */
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingDate;
    /**
     * Used for rapid reprice. Tells whether or not the air segment has been flown. 
     *                         Providers: 1G/1V/1P/1S/1A
     * 
     */
    @XmlAttribute(name = "FlownSegment")
    protected Boolean flownSegment;
    /**
     * Used for rapid reprice. Tells whether or not the air segment had a 
     *                         schedule change by the carrier. This tells rapid reprice that the change in the air 
     *                         segment was involuntary and because of a schedule change, not because the user is 
     *                         changing the segment. Providers: 1G/1V/1P/1S/1A
     * 
     */
    @XmlAttribute(name = "ScheduleChange")
    protected Boolean scheduleChange;
    /**
     * Value “B” specifies that the carrier supports Rich Content and Branding.  The Brand Indicator is only returned in the availability search response.  Provider: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "BrandIndicator")
    protected String brandIndicator;
    /**
     * The IATA location code for this origination of this entity.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * The IATA location code for this destination of this entity.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    /**
     * The date and time at which this entity departs. Date and time are represented as Airport Local Time at the place of departure. The correct time zone offset is also included.
     * 
     */
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    /**
     * The date and time at which this entity arrives at the destination. Date and time are represented as Airport Local Time at the place of arrival. The correct time zone offset is also included.
     * 
     */
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * Type of sell agreement between host and link
     *                     carrier.
     * 
     */
    @XmlAttribute(name = "ParticipantLevel")
    protected String participantLevel;
    /**
     * Indicates if carrier has link (carrier
     *                     specific) display option.
     * 
     */
    @XmlAttribute(name = "LinkAvailability")
    protected Boolean linkAvailability;
    /**
     * Indicates if carrier has Inside
     *                     (polled)Availability option.
     * 
     */
    @XmlAttribute(name = "PolledAvailabilityOption")
    protected String polledAvailabilityOption;
    /**
     * The type of availability from which the segment is sold.Possible Values (List):
     *                                     G - General
     *                                     S - Flight Specific
     *                                     L - Carrier Specific/Direct Access
     *                                     M - Manual Sell
     *                                     F - Fare Shop/Optimal Shop
     *                                     Q - Fare Specific Fare Quote unbooked
     *                                     R - Redemption Availability used to complete the sell. Supported Providers: 1G,1V.
     * 
     */
    @XmlAttribute(name = "AvailabilityDisplayType")
    protected String availabilityDisplayType;
    /**
     * Time spent (minutes) traveling in flight, including airport taxi time.
     * 
     */
    @XmlAttribute(name = "FlightTime")
    protected BigInteger flightTime;
    /**
     * Total time spent (minutes) traveling including flight time and ground time.
     * 
     */
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    /**
     * The distance traveled. Units are specified in the parent response element.
     * 
     */
    @XmlAttribute(name = "Distance")
    protected BigInteger distance;

    /**
     * This describes whether the segment is determined to be a sponsored flight. The SponsoredFltInfo node will only come back for Travelport UIs and not for other customers.
     * 
     * @return
     *     possible object is
     *     {@link SponsoredFltInfo }
     *     
     */
    public SponsoredFltInfo getSponsoredFltInfo() {
        return sponsoredFltInfo;
    }

    /**
     * Sets the value of the sponsoredFltInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SponsoredFltInfo }
     *     
     * @see #getSponsoredFltInfo()
     */
    public void setSponsoredFltInfo(SponsoredFltInfo value) {
        this.sponsoredFltInfo = value;
    }

    /**
     * Describes the codeshare disclosure (simple
     *                 text string) or the specific operating flight information (as
     *                 attributes).
     * 
     * @return
     *     possible object is
     *     {@link CodeshareInfo }
     *     
     */
    public CodeshareInfo getCodeshareInfo() {
        return codeshareInfo;
    }

    /**
     * Sets the value of the codeshareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeshareInfo }
     *     
     * @see #getCodeshareInfo()
     */
    public void setCodeshareInfo(CodeshareInfo value) {
        this.codeshareInfo = value;
    }

    /**
     * Matches class of service information with
     *                 availability counts. Only provided on search results.
     * 
     * Gets the value of the airAvailInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airAvailInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirAvailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the airAvailInfo property.
     */
    public List<AirAvailInfo> getAirAvailInfo() {
        if (airAvailInfo == null) {
            airAvailInfo = new ArrayList<>();
        }
        return this.airAvailInfo;
    }

    /**
     * Specific details within a flight segment.
     * 
     * Gets the value of the flightDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFlightDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the flightDetails property.
     */
    public List<FlightDetails> getFlightDetails() {
        if (flightDetails == null) {
            flightDetails = new ArrayList<>();
        }
        return this.flightDetails;
    }

    /**
     * Reference to a complete FlightDetails from
     *                 a shared list
     * 
     * Gets the value of the flightDetailsRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightDetailsRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFlightDetailsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetailsRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the flightDetailsRef property.
     */
    public List<FlightDetailsRef> getFlightDetailsRef() {
        if (flightDetailsRef == null) {
            flightDetailsRef = new ArrayList<>();
        }
        return this.flightDetailsRef;
    }

    /**
     * Reference to a AlternateLocationDistance
     * 
     * Gets the value of the alternateLocationDistanceRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateLocationDistanceRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlternateLocationDistanceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateLocationDistanceRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the alternateLocationDistanceRef property.
     */
    public List<AlternateLocationDistanceRef> getAlternateLocationDistanceRef() {
        if (alternateLocationDistanceRef == null) {
            alternateLocationDistanceRef = new ArrayList<>();
        }
        return this.alternateLocationDistanceRef;
    }

    /**
     * Flight Connection Information
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     * @see #getConnection()
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Sell Message from Vendor. This is applicable in response messages only, any input in request message will be ignored.
     * 
     * Gets the value of the sellMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSellMessage().add(newItem);
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
     *     The value of the sellMessage property.
     */
    public List<String> getSellMessage() {
        if (sellMessage == null) {
            sellMessage = new ArrayList<>();
        }
        return this.sellMessage;
    }

    /**
     * Gets the value of the railCoachDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railCoachDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailCoachDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailCoachDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the railCoachDetails property.
     */
    public List<RailCoachDetails> getRailCoachDetails() {
        if (railCoachDetails == null) {
            railCoachDetails = new ArrayList<>();
        }
        return this.railCoachDetails;
    }

    /**
     * Indicates OpenSegment when True
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpenSegment() {
        return openSegment;
    }

    /**
     * Sets the value of the openSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOpenSegment()
     */
    public void setOpenSegment(Boolean value) {
        this.openSegment = value;
    }

    /**
     * The Origin Destination Grouping of this
     *                                 segment.
     * 
     */
    public int getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     */
    public void setGroup(int value) {
        this.group = value;
    }

    /**
     * The carrier that is marketing this segment
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Specifies Cabin class for a group of
     *                                 class of services. Cabin class is not identified if it is not
     *                                 present.
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
     * The flight number under which the marketing
     *                                 carrier is marketing this flight
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightNumber()
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Identifies if this particular segment
     *                                 is E-Ticketable
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     * @see #getETicketability()
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
    }

    /**
     * Identifies the equipment that this
     *                                 segment is operating under.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEquipment()
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Identifies this segment as being a
     *                                 married segment. It is paired with other segments of the same
     *                                 value.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarriageGroup() {
        return marriageGroup;
    }

    /**
     * Sets the value of the marriageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMarriageGroup()
     */
    public void setMarriageGroup(Integer value) {
        this.marriageGroup = value;
    }

    /**
     * Identifies the number of stops for
     *                                 each within the segment.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Sets the value of the numberOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getNumberOfStops()
     */
    public void setNumberOfStops(Integer value) {
        this.numberOfStops = value;
    }

    /**
     * Identifies that this segment was sold
     *                                 via a direct access channel to the marketing carrier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeamless() {
        return seamless;
    }

    /**
     * Sets the value of the seamless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSeamless()
     */
    public void setSeamless(Boolean value) {
        this.seamless = value;
    }

    /**
     * Indicates the traveler must change
     *                                 planes between flights.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfPlane() {
        if (changeOfPlane == null) {
            return false;
        } else {
            return changeOfPlane;
        }
    }

    /**
     * Sets the value of the changeOfPlane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChangeOfPlane()
     */
    public void setChangeOfPlane(Boolean value) {
        this.changeOfPlane = value;
    }

    /**
     * Identifies that this segment has
     *                                 Guaranteed Payment Carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteedPaymentCarrier() {
        return guaranteedPaymentCarrier;
    }

    /**
     * Sets the value of the guaranteedPaymentCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGuaranteedPaymentCarrier()
     */
    public void setGuaranteedPaymentCarrier(String value) {
        this.guaranteedPaymentCarrier = value;
    }

    /**
     * Identifies that this segment has
     *                                 Guaranteed Payment Carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTokenRef() {
        return hostTokenRef;
    }

    /**
     * Sets the value of the hostTokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHostTokenRef()
     */
    public void setHostTokenRef(String value) {
        this.hostTokenRef = value;
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
     * Provider reservation reference key.
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
     * Indicates true if flight provides
     *                                 optional services.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionalServicesIndicator() {
        return optionalServicesIndicator;
    }

    /**
     * Sets the value of the optionalServicesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOptionalServicesIndicator()
     */
    public void setOptionalServicesIndicator(Boolean value) {
        this.optionalServicesIndicator = value;
    }

    /**
     * Indicates Availability source of
     *                                 AirSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilitySource() {
        return availabilitySource;
    }

    /**
     * Sets the value of the availabilitySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvailabilitySource()
     */
    public void setAvailabilitySource(String value) {
        this.availabilitySource = value;
    }

    /**
     * Reference to the APIS Requirements for
     *                                 this AirSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPISRequirementsRef() {
        return apisRequirementsRef;
    }

    /**
     * Sets the value of the apisRequirementsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAPISRequirementsRef()
     */
    public void setAPISRequirementsRef(String value) {
        this.apisRequirementsRef = value;
    }

    /**
     * Indicates blacklisted carriers which are banned from servicing points to, from and within the European Community.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackListed() {
        return blackListed;
    }

    /**
     * Sets the value of the blackListed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBlackListed()
     */
    public void setBlackListed(Boolean value) {
        this.blackListed = value;
    }

    /**
     * Refers to the flight operational status for the segment.
     *                             This attribute will only be returned in the AvailabilitySearchRsp and not used/returned in any other request/responses.
     *                             If this attribute is not returned back in the response, it means the flight is operational and not past scheduled departure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperationalStatus()
     */
    public void setOperationalStatus(String value) {
        this.operationalStatus = value;
    }

    /**
     * Number of person traveling in this air segment excluding the number of infants on lap.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberInParty() {
        return numberInParty;
    }

    /**
     * Sets the value of the numberInParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getNumberInParty()
     */
    public void setNumberInParty(Integer value) {
        this.numberInParty = value;
    }

    /**
     * Coach number for which rail seatmap/coachmap is returned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCoachNumber() {
        return railCoachNumber;
    }

    /**
     * Sets the value of the railCoachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailCoachNumber()
     */
    public void setRailCoachNumber(String value) {
        this.railCoachNumber = value;
    }

    /**
     * Used for rapid reprice. The date the booking was made. 
     *                         Providers: 1G/1V/1P/1S/1A
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getBookingDate()
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * Used for rapid reprice. Tells whether or not the air segment has been flown. 
     *                         Providers: 1G/1V/1P/1S/1A
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFlownSegment() {
        if (flownSegment == null) {
            return false;
        } else {
            return flownSegment;
        }
    }

    /**
     * Sets the value of the flownSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFlownSegment()
     */
    public void setFlownSegment(Boolean value) {
        this.flownSegment = value;
    }

    /**
     * Used for rapid reprice. Tells whether or not the air segment had a 
     *                         schedule change by the carrier. This tells rapid reprice that the change in the air 
     *                         segment was involuntary and because of a schedule change, not because the user is 
     *                         changing the segment. Providers: 1G/1V/1P/1S/1A
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduleChange() {
        if (scheduleChange == null) {
            return false;
        } else {
            return scheduleChange;
        }
    }

    /**
     * Sets the value of the scheduleChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isScheduleChange()
     */
    public void setScheduleChange(Boolean value) {
        this.scheduleChange = value;
    }

    /**
     * Value “B” specifies that the carrier supports Rich Content and Branding.  The Brand Indicator is only returned in the availability search response.  Provider: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandIndicator() {
        return brandIndicator;
    }

    /**
     * Sets the value of the brandIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrandIndicator()
     */
    public void setBrandIndicator(String value) {
        this.brandIndicator = value;
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
     * The date and time at which this entity departs. Date and time are represented as Airport Local Time at the place of departure. The correct time zone offset is also included.
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
     * The date and time at which this entity arrives at the destination. Date and time are represented as Airport Local Time at the place of arrival. The correct time zone offset is also included.
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
     * Type of sell agreement between host and link
     *                     carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantLevel() {
        return participantLevel;
    }

    /**
     * Sets the value of the participantLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getParticipantLevel()
     */
    public void setParticipantLevel(String value) {
        this.participantLevel = value;
    }

    /**
     * Indicates if carrier has link (carrier
     *                     specific) display option.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkAvailability() {
        return linkAvailability;
    }

    /**
     * Sets the value of the linkAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLinkAvailability()
     */
    public void setLinkAvailability(Boolean value) {
        this.linkAvailability = value;
    }

    /**
     * Indicates if carrier has Inside
     *                     (polled)Availability option.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolledAvailabilityOption() {
        return polledAvailabilityOption;
    }

    /**
     * Sets the value of the polledAvailabilityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPolledAvailabilityOption()
     */
    public void setPolledAvailabilityOption(String value) {
        this.polledAvailabilityOption = value;
    }

    /**
     * The type of availability from which the segment is sold.Possible Values (List):
     *                                     G - General
     *                                     S - Flight Specific
     *                                     L - Carrier Specific/Direct Access
     *                                     M - Manual Sell
     *                                     F - Fare Shop/Optimal Shop
     *                                     Q - Fare Specific Fare Quote unbooked
     *                                     R - Redemption Availability used to complete the sell. Supported Providers: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityDisplayType() {
        return availabilityDisplayType;
    }

    /**
     * Sets the value of the availabilityDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvailabilityDisplayType()
     */
    public void setAvailabilityDisplayType(String value) {
        this.availabilityDisplayType = value;
    }

    /**
     * Time spent (minutes) traveling in flight, including airport taxi time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightTime() {
        return flightTime;
    }

    /**
     * Sets the value of the flightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getFlightTime()
     */
    public void setFlightTime(BigInteger value) {
        this.flightTime = value;
    }

    /**
     * Total time spent (minutes) traveling including flight time and ground time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTravelTime()
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * The distance traveled. Units are specified in the parent response element.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getDistance()
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

}
