
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
 *       <attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="SegmentRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FlightDetailRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="SeatId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RailCoachNumber">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="4"/>
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
@XmlType(name = "")
@XmlRootElement(name = "SpecificSeatAssignment")
public class SpecificSeatAssignment {

    /**
     * The passenger that this seat assignment is for
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;
    /**
     * The segment that we will assign this seat on
     * 
     */
    @XmlAttribute(name = "SegmentRef", required = true)
    protected String segmentRef;
    /**
     * The Flight Detail ref of the AirSegment used
     *                         when requesting seats on Change of Guage flights
     * 
     */
    @XmlAttribute(name = "FlightDetailRef")
    protected String flightDetailRef;
    /**
     * The actual seat ID that is being requested.
     *                         Special Characters are not supported in this field.
     * 
     */
    @XmlAttribute(name = "SeatId", required = true)
    protected String seatId;
    /**
     * Coach number for which rail seatmap/coachmap is returned.
     * 
     */
    @XmlAttribute(name = "RailCoachNumber")
    protected String railCoachNumber;

    /**
     * The passenger that this seat assignment is for
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

    /**
     * The segment that we will assign this seat on
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
     * The Flight Detail ref of the AirSegment used
     *                         when requesting seats on Change of Guage flights
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDetailRef() {
        return flightDetailRef;
    }

    /**
     * Sets the value of the flightDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightDetailRef()
     */
    public void setFlightDetailRef(String value) {
        this.flightDetailRef = value;
    }

    /**
     * The actual seat ID that is being requested.
     *                         Special Characters are not supported in this field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatId() {
        return seatId;
    }

    /**
     * Sets the value of the seatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatId()
     */
    public void setSeatId(String value) {
        this.seatId = value;
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

}
