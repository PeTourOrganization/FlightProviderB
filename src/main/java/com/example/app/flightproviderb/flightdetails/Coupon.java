
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketDesignator" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="OperatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="OperatingFlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="MarketingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="MarketingFlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="StopoverCode" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="BookingClass" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Status" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SegmentGroup" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="MarriageGroup" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketDesignator"
})
@XmlRootElement(name = "Coupon")
public class Coupon {

    /**
     * Ticket Designator used to further qualify a
     *                 Fare Basis Code.
     * 
     */
    @XmlElement(name = "TicketDesignator")
    protected List<TicketDesignator> ticketDesignator;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The sequential number of this coupon.
     * 
     */
    @XmlAttribute(name = "CouponNumber")
    protected BigInteger couponNumber;
    /**
     * The true carrier.
     * 
     */
    @XmlAttribute(name = "OperatingCarrier")
    protected String operatingCarrier;
    /**
     * The true carrier's flight number.
     * 
     */
    @XmlAttribute(name = "OperatingFlightNumber")
    protected String operatingFlightNumber;
    /**
     * If codeshare applies to this, this is the
     *                         marketing carrier (as opposed to the operating carrier).
     * 
     */
    @XmlAttribute(name = "MarketingCarrier")
    protected String marketingCarrier;
    /**
     * If codeshare applies to this, this is the
     *                         marketing flight number (as opposed to the operating flight
     *                         number).
     * 
     */
    @XmlAttribute(name = "MarketingFlightNumber")
    protected String marketingFlightNumber;
    /**
     * Returns the airport or city code that
     *                         defines the origin market for this fare.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * Returns the airport or city code that
     *                         defines the destination market for this fare.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    /**
     * The date and time at which this entity
     *                         departs. This does not include time zone information since it can
     *                         be derived from the origin location. In case of open segment this
     *                         will not be returned.
     * 
     */
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    /**
     * The date and time at which this entity arrives
     *                         at the destination. This does not include time zone information
     *                         since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    /**
     * Stopover code - indicator that stopover
     *                         is allowed at Origin Airport or City.
     * 
     */
    @XmlAttribute(name = "StopoverCode", required = true)
    protected boolean stopoverCode;
    /**
     * Booked fare class for coupon.
     * 
     */
    @XmlAttribute(name = "BookingClass", required = true)
    protected String bookingClass;
    /**
     * The fare basis code for this fare
     * 
     */
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    /**
     * Fare not valid before this date.
     * 
     */
    @XmlAttribute(name = "NotValidBefore")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidBefore;
    /**
     * Fare not valid after this date.
     * 
     */
    @XmlAttribute(name = "NotValidAfter")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notValidAfter;
    /**
     * The status of this coupon returend from host is mapped as follows
     *                               Code="A" Status="Airport Controlled"
     *                               Code="C" Status="Checked In"
     *                               Code="F" Status="Flown/Used"
     *                               Code="L" Status="Boarded/Lifted"
     *                               Code="O" Status="Open"
     *                               Code="P" Status="Printed"
     *                               Code="R" Status="Refunded"
     *                               Code="E" Status="Exchanged"
     *                               Code="V" Status="Void"
     *                               Code="Z" Status="Archived/Carrier Modified"
     *                               Code="U" Status="Unavailable"
     *                               Code="S" Status="Suspended"
     *                               Code="I" Status="Irregular Ops"
     *                               Code="D" Status="Deleted/Removed"
     *                               Code="X" Status="Unknown"
     * 
     */
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    /**
     * Indicates the grouping in which this
     *                         segment resides based on Origin/Destination pairs in itinerary
     * 
     */
    @XmlAttribute(name = "SegmentGroup")
    protected BigInteger segmentGroup;
    /**
     * Airline Marrraige group indicator
     * 
     */
    @XmlAttribute(name = "MarriageGroup")
    protected BigInteger marriageGroup;
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
     * Ticket Designator used to further qualify a
     *                 Fare Basis Code.
     * 
     * Gets the value of the ticketDesignator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDesignator }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketDesignator property.
     */
    public List<TicketDesignator> getTicketDesignator() {
        if (ticketDesignator == null) {
            ticketDesignator = new ArrayList<>();
        }
        return this.ticketDesignator;
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
     * The sequential number of this coupon.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getCouponNumber()
     */
    public void setCouponNumber(BigInteger value) {
        this.couponNumber = value;
    }

    /**
     * The true carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingCarrier()
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

    /**
     * The true carrier's flight number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingFlightNumber()
     */
    public void setOperatingFlightNumber(String value) {
        this.operatingFlightNumber = value;
    }

    /**
     * If codeshare applies to this, this is the
     *                         marketing carrier (as opposed to the operating carrier).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMarketingCarrier()
     */
    public void setMarketingCarrier(String value) {
        this.marketingCarrier = value;
    }

    /**
     * If codeshare applies to this, this is the
     *                         marketing flight number (as opposed to the operating flight
     *                         number).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingFlightNumber() {
        return marketingFlightNumber;
    }

    /**
     * Sets the value of the marketingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMarketingFlightNumber()
     */
    public void setMarketingFlightNumber(String value) {
        this.marketingFlightNumber = value;
    }

    /**
     * Returns the airport or city code that
     *                         defines the origin market for this fare.
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
     * Returns the airport or city code that
     *                         defines the destination market for this fare.
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
     * The date and time at which this entity
     *                         departs. This does not include time zone information since it can
     *                         be derived from the origin location. In case of open segment this
     *                         will not be returned.
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
     * The date and time at which this entity arrives
     *                         at the destination. This does not include time zone information
     *                         since it can be derived from the origin location.
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
     * Stopover code - indicator that stopover
     *                         is allowed at Origin Airport or City.
     * 
     */
    public boolean isStopoverCode() {
        return stopoverCode;
    }

    /**
     * Sets the value of the stopoverCode property.
     * 
     */
    public void setStopoverCode(boolean value) {
        this.stopoverCode = value;
    }

    /**
     * Booked fare class for coupon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingClass()
     */
    public void setBookingClass(String value) {
        this.bookingClass = value;
    }

    /**
     * The fare basis code for this fare
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
     * Fare not valid before this date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidBefore()
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * Fare not valid after this date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNotValidAfter()
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

    /**
     * The status of this coupon returend from host is mapped as follows
     *                               Code="A" Status="Airport Controlled"
     *                               Code="C" Status="Checked In"
     *                               Code="F" Status="Flown/Used"
     *                               Code="L" Status="Boarded/Lifted"
     *                               Code="O" Status="Open"
     *                               Code="P" Status="Printed"
     *                               Code="R" Status="Refunded"
     *                               Code="E" Status="Exchanged"
     *                               Code="V" Status="Void"
     *                               Code="Z" Status="Archived/Carrier Modified"
     *                               Code="U" Status="Unavailable"
     *                               Code="S" Status="Suspended"
     *                               Code="I" Status="Irregular Ops"
     *                               Code="D" Status="Deleted/Removed"
     *                               Code="X" Status="Unknown"
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
     * Indicates the grouping in which this
     *                         segment resides based on Origin/Destination pairs in itinerary
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegmentGroup() {
        return segmentGroup;
    }

    /**
     * Sets the value of the segmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSegmentGroup()
     */
    public void setSegmentGroup(BigInteger value) {
        this.segmentGroup = value;
    }

    /**
     * Airline Marrraige group indicator
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarriageGroup() {
        return marriageGroup;
    }

    /**
     * Sets the value of the marriageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMarriageGroup()
     */
    public void setMarriageGroup(BigInteger value) {
        this.marriageGroup = value;
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
