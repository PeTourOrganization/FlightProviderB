
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}Segment">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSegmentInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}OperatingCompany" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailAvailInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}FulFillmentType" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/rail_v54_0}attrRailSegmentOrigDestInfo"/>
 *       <attribute name="TrainNumber" type="{http://www.travelport.com/schema/rail_v54_0}typeTrainNumber" />
 *       <attribute name="TrainType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TrainTypeCode" type="{http://www.travelport.com/schema/rail_v54_0}typeTrainType" />
 *       <attribute name="TransportMode" type="{http://www.travelport.com/schema/rail_v54_0}typeTransportMode" />
 *       <attribute name="SeatAssignable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TransportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ReservationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="HostTokenRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CabinClass" type="{http://www.travelport.com/schema/common_v54_0}typeRailCabin" />
 *       <attribute name="ClassCode" type="{http://www.travelport.com/schema/common_v54_0}typeRailClass" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railSegmentInfo",
    "operatingCompany",
    "railAvailInfo",
    "fulFillmentType"
})
@XmlRootElement(name = "RailSegment", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailSegment
    extends Segment
{

    /**
     * Holds the ExtraSegmentInfo and VendorMessages from RCH response.
     * 
     */
    @XmlElement(name = "RailSegmentInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailSegmentInfo> railSegmentInfo;
    /**
     * A textual remark identifying the OperatingCompany/Train Service other than BN orTL
     * 
     */
    @XmlElement(name = "OperatingCompany", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected OperatingCompany operatingCompany;
    @XmlElement(name = "RailAvailInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailAvailInfo> railAvailInfo;
    /**
     * Fulfillment options for this segment. the options will be one of "Ticket on Departure", "Ticketless", "Ticket By Email", "Travel Agency"
     * 
     */
    @XmlElement(name = "FulFillmentType", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<String> fulFillmentType;
    @XmlAttribute(name = "TrainNumber")
    protected String trainNumber;
    /**
     * Type of train used. Same as TrainServiceType.
     * 
     */
    @XmlAttribute(name = "TrainType")
    protected String trainType;
    /**
     * Code for type of train used. Same as TrainServiceType.
     * 
     */
    @XmlAttribute(name = "TrainTypeCode")
    protected String trainTypeCode;
    /**
     * Type of Transport Mode used.
     * 
     */
    @XmlAttribute(name = "TransportMode")
    protected TypeTransportMode transportMode;
    /**
     * Set to true if there exists seats to be booked
     * 
     */
    @XmlAttribute(name = "SeatAssignable")
    protected Boolean seatAssignable;
    /**
     * Supplier specific train code
     * 
     */
    @XmlAttribute(name = "TransportCode")
    protected String transportCode;
    /**
     * Set to true if a reservation is required for booking.
     * 
     */
    @XmlAttribute(name = "ReservationRequired")
    protected Boolean reservationRequired;
    /**
     * Total time spent (minutes) traveling
     * 
     */
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    /**
     * The reference key for the host token. From the HostTokenList Providers RCH.
     * 
     */
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;
    /**
     * Rail Cabin class specification. The valid values are Economy, Business, First and Other
     * 
     */
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    /**
     * A booking code or fare basis code or fare class.
     * 
     */
    @XmlAttribute(name = "ClassCode")
    protected String classCode;
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
     * Holds the ExtraSegmentInfo and VendorMessages from RCH response.
     * 
     * Gets the value of the railSegmentInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSegmentInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSegmentInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the railSegmentInfo property.
     */
    public List<RailSegmentInfo> getRailSegmentInfo() {
        if (railSegmentInfo == null) {
            railSegmentInfo = new ArrayList<>();
        }
        return this.railSegmentInfo;
    }

    /**
     * A textual remark identifying the OperatingCompany/Train Service other than BN orTL
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompany }
     *     
     */
    public OperatingCompany getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompany }
     *     
     * @see #getOperatingCompany()
     */
    public void setOperatingCompany(OperatingCompany value) {
        this.operatingCompany = value;
    }

    /**
     * Gets the value of the railAvailInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railAvailInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailAvailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAvailInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the railAvailInfo property.
     */
    public List<RailAvailInfo> getRailAvailInfo() {
        if (railAvailInfo == null) {
            railAvailInfo = new ArrayList<>();
        }
        return this.railAvailInfo;
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
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Type of train used. Same as TrainServiceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainType() {
        return trainType;
    }

    /**
     * Sets the value of the trainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrainType()
     */
    public void setTrainType(String value) {
        this.trainType = value;
    }

    /**
     * Code for type of train used. Same as TrainServiceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    /**
     * Sets the value of the trainTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrainTypeCode()
     */
    public void setTrainTypeCode(String value) {
        this.trainTypeCode = value;
    }

    /**
     * Type of Transport Mode used.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransportMode }
     *     
     */
    public TypeTransportMode getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransportMode }
     *     
     * @see #getTransportMode()
     */
    public void setTransportMode(TypeTransportMode value) {
        this.transportMode = value;
    }

    /**
     * Set to true if there exists seats to be booked
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeatAssignable() {
        return seatAssignable;
    }

    /**
     * Sets the value of the seatAssignable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSeatAssignable()
     */
    public void setSeatAssignable(Boolean value) {
        this.seatAssignable = value;
    }

    /**
     * Supplier specific train code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCode() {
        return transportCode;
    }

    /**
     * Sets the value of the transportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransportCode()
     */
    public void setTransportCode(String value) {
        this.transportCode = value;
    }

    /**
     * Set to true if a reservation is required for booking.
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
     * Total time spent (minutes) traveling
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
     * The reference key for the host token. From the HostTokenList Providers RCH.
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
     * Rail Cabin class specification. The valid values are Economy, Business, First and Other
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
     * A booking code or fare basis code or fare class.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getClassCode()
     */
    public void setClassCode(String value) {
        this.classCode = value;
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

}
