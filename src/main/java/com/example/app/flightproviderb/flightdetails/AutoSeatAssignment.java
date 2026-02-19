
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Smoking" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="SeatType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeReqSeat" />
 *       <attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AutoSeatAssignment")
public class AutoSeatAssignment {

    /**
     * The segment that this assignment belongs to
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    /**
     * Indicates that the requested seat type
     *                         should be a smoking seat.
     * 
     */
    @XmlAttribute(name = "Smoking")
    protected Boolean smoking;
    /**
     * The type of seat that is requested
     * 
     */
    @XmlAttribute(name = "SeatType", required = true)
    protected TypeReqSeat seatType;
    /**
     * Indicates that this seat request is for
     *                         group seating for all passengers. If no SegmentRef is included,
     *                         group seating will be requested for all segments.
     * 
     */
    @XmlAttribute(name = "Group")
    protected Boolean group;
    /**
     * The booking traveler that this seat assignment
     *                         is for. If not entered, this applies to the primary booking
     *                         traveler and other passengers are adjacent.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * The segment that this assignment belongs to
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSegmentRef()
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Indicates that the requested seat type
     *                         should be a smoking seat.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmoking() {
        if (smoking == null) {
            return false;
        } else {
            return smoking;
        }
    }

    /**
     * Sets the value of the smoking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSmoking()
     */
    public void setSmoking(Boolean value) {
        this.smoking = value;
    }

    /**
     * The type of seat that is requested
     * 
     * @return
     *     possible object is
     *     {@link TypeReqSeat }
     *     
     */
    public TypeReqSeat getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReqSeat }
     *     
     * @see #getSeatType()
     */
    public void setSeatType(TypeReqSeat value) {
        this.seatType = value;
    }

    /**
     * Indicates that this seat request is for
     *                         group seating for all passengers. If no SegmentRef is included,
     *                         group seating will be requested for all segments.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGroup() {
        if (group == null) {
            return false;
        } else {
            return group;
        }
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isGroup()
     */
    public void setGroup(Boolean value) {
        this.group = value;
    }

    /**
     * The booking traveler that this seat assignment
     *                         is for. If not entered, this applies to the primary booking
     *                         traveler and other passengers are adjacent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
