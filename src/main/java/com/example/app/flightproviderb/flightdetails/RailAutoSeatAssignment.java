
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
 *       <attribute name="SeatType" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SeatValue" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="RailSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
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
@XmlRootElement(name = "RailAutoSeatAssignment", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailAutoSeatAssignment {

    /**
     * Indicates codeset of values such as Seat Type like Place,Position, Smoking Choice, Place Arrangement, Place Direction, Compartment.
     * 
     */
    @XmlAttribute(name = "SeatType", required = true)
    protected String seatType;
    /**
     * Indicates the value specific to the selected type.
     * 
     */
    @XmlAttribute(name = "SeatValue", required = true)
    protected String seatValue;
    /**
     * The rail segment that this assignment belongs to
     * 
     */
    @XmlAttribute(name = "RailSegmentRef")
    protected String railSegmentRef;
    /**
     * The booking traveler that this seat assignment is for. If not entered, this applies to the primary booking traveler and other passengers are adjacent.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Indicates codeset of values such as Seat Type like Place,Position, Smoking Choice, Place Arrangement, Place Direction, Compartment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatType()
     */
    public void setSeatType(String value) {
        this.seatType = value;
    }

    /**
     * Indicates the value specific to the selected type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatValue() {
        return seatValue;
    }

    /**
     * Sets the value of the seatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatValue()
     */
    public void setSeatValue(String value) {
        this.seatValue = value;
    }

    /**
     * The rail segment that this assignment belongs to
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
     * The booking traveler that this seat assignment is for. If not entered, this applies to the primary booking traveler and other passengers are adjacent.
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
