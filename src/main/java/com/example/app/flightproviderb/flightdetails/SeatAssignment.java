
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatAssignment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatAssignment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Status" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeStatusCode" />
 *       <attribute name="Seat" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SeatTypeCode" type="{http://www.travelport.com/schema/common_v54_0}typeSeatTypeCode" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FlightDetailsRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="RailCoachNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAssignment", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    AirSeatAssignment.class
})
public class SeatAssignment {

    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "Seat", required = true)
    protected String seat;
    /**
     * The 4 letter SSR code like SMSW,NSSW,SMST etc.
     * 
     */
    @XmlAttribute(name = "SeatTypeCode")
    protected String seatTypeCode;
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    @XmlAttribute(name = "FlightDetailsRef")
    protected String flightDetailsRef;
    /**
     * Coach number for which rail seatmap/coachmap is returned.
     * 
     */
    @XmlAttribute(name = "RailCoachNumber")
    protected String railCoachNumber;
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
     * Gets the value of the status property.
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
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeat(String value) {
        this.seat = value;
    }

    /**
     * The 4 letter SSR code like SMSW,NSSW,SMST etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatTypeCode() {
        return seatTypeCode;
    }

    /**
     * Sets the value of the seatTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatTypeCode()
     */
    public void setSeatTypeCode(String value) {
        this.seatTypeCode = value;
    }

    /**
     * Gets the value of the segmentRef property.
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
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the flightDetailsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDetailsRef() {
        return flightDetailsRef;
    }

    /**
     * Sets the value of the flightDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDetailsRef(String value) {
        this.flightDetailsRef = value;
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
