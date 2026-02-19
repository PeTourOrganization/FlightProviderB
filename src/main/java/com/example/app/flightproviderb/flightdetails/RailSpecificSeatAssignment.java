
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
 *       <attribute name="CoachLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PlaceLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Assignment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RailSegmentRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailSpecificSeatAssignment", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailSpecificSeatAssignment {

    /**
     * The coach number of the train being requested.
     * 
     */
    @XmlAttribute(name = "CoachLabel", required = true)
    protected String coachLabel;
    /**
     * The actual seat number or the close-to seat number based on the Assignment.
     * 
     */
    @XmlAttribute(name = "PlaceLabel", required = true)
    protected String placeLabel;
    /**
     * Defines how the PlaceLabel should be applied.  The values are 6.STP for actual seat or 2.STP for close-to seat. Default is 2.STP.
     * 
     */
    @XmlAttribute(name = "Assignment", required = true)
    protected String assignment;
    /**
     * The rail segment to which this assignment belongs.
     * 
     */
    @XmlAttribute(name = "RailSegmentRef", required = true)
    protected String railSegmentRef;
    /**
     * The BookingTraveler for this seat assignment.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;

    /**
     * The coach number of the train being requested.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachLabel() {
        return coachLabel;
    }

    /**
     * Sets the value of the coachLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCoachLabel()
     */
    public void setCoachLabel(String value) {
        this.coachLabel = value;
    }

    /**
     * The actual seat number or the close-to seat number based on the Assignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceLabel() {
        return placeLabel;
    }

    /**
     * Sets the value of the placeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlaceLabel()
     */
    public void setPlaceLabel(String value) {
        this.placeLabel = value;
    }

    /**
     * Defines how the PlaceLabel should be applied.  The values are 6.STP for actual seat or 2.STP for close-to seat. Default is 2.STP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssignment()
     */
    public void setAssignment(String value) {
        this.assignment = value;
    }

    /**
     * The rail segment to which this assignment belongs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailSegmentRef() {
        return railSegmentRef;
    }

    /**
     * Sets the value of the railSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailSegmentRef()
     */
    public void setRailSegmentRef(String value) {
        this.railSegmentRef = value;
    }

    /**
     * The BookingTraveler for this seat assignment.
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
