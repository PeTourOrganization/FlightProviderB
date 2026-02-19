
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareNote" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ChangeOfPlane" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ChangeOfTerminal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ChangeOfAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="StopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MinConnectionTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="FlightDetailsIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="IncludeStopOverToFareQuote" type="{http://www.travelport.com/schema/air_v54_0}typeIgnoreStopOver" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareNote"
})
@XmlRootElement(name = "Connection")
public class Connection {

    /**
     * A simple textual fare note. Used within several
     *                 other objects.
     * 
     */
    @XmlElement(name = "FareNote")
    protected FareNote fareNote;
    /**
     * Indicates the traveler must change
     *                         planes between flights.
     * 
     */
    @XmlAttribute(name = "ChangeOfPlane")
    protected Boolean changeOfPlane;
    /**
     * Indicates the traveler must change
     *                         terminals between flights.
     * 
     */
    @XmlAttribute(name = "ChangeOfTerminal")
    protected Boolean changeOfTerminal;
    /**
     * Indicates the traveler must change
     *                         airports between flights.
     * 
     */
    @XmlAttribute(name = "ChangeOfAirport")
    protected Boolean changeOfAirport;
    /**
     * Indicates that there is a significant
     *                         delay between flights (usually 12 hours or more)
     * 
     */
    @XmlAttribute(name = "StopOver")
    protected Boolean stopOver;
    /**
     * The minimum time needed to connect between the
     *                         two different destinations.
     * 
     */
    @XmlAttribute(name = "MinConnectionTime")
    protected Integer minConnectionTime;
    /**
     * The actual duration (in minutes) between
     *                         flights.
     * 
     */
    @XmlAttribute(name = "Duration")
    protected Integer duration;
    /**
     * The sequential AirSegment number that this
     *                         connection information applies to.
     * 
     */
    @XmlAttribute(name = "SegmentIndex")
    protected Integer segmentIndex;
    /**
     * The sequential FlightDetails number that this
     *                         connection information applies to.
     * 
     */
    @XmlAttribute(name = "FlightDetailsIndex")
    protected Integer flightDetailsIndex;
    /**
     * The field determines to quote fares with or
     *                         without stop overs,the values can be NoStopOver,StopOver and
     *                         IgnoreSegment.
     * 
     */
    @XmlAttribute(name = "IncludeStopOverToFareQuote")
    protected TypeIgnoreStopOver includeStopOverToFareQuote;

    /**
     * A simple textual fare note. Used within several
     *                 other objects.
     * 
     * @return
     *     possible object is
     *     {@link FareNote }
     *     
     */
    public FareNote getFareNote() {
        return fareNote;
    }

    /**
     * Sets the value of the fareNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNote }
     *     
     * @see #getFareNote()
     */
    public void setFareNote(FareNote value) {
        this.fareNote = value;
    }

    /**
     * Indicates the traveler must change
     *                         planes between flights.
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
     * Indicates the traveler must change
     *                         terminals between flights.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfTerminal() {
        if (changeOfTerminal == null) {
            return false;
        } else {
            return changeOfTerminal;
        }
    }

    /**
     * Sets the value of the changeOfTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChangeOfTerminal()
     */
    public void setChangeOfTerminal(Boolean value) {
        this.changeOfTerminal = value;
    }

    /**
     * Indicates the traveler must change
     *                         airports between flights.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfAirport() {
        if (changeOfAirport == null) {
            return false;
        } else {
            return changeOfAirport;
        }
    }

    /**
     * Sets the value of the changeOfAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChangeOfAirport()
     */
    public void setChangeOfAirport(Boolean value) {
        this.changeOfAirport = value;
    }

    /**
     * Indicates that there is a significant
     *                         delay between flights (usually 12 hours or more)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStopOver() {
        if (stopOver == null) {
            return false;
        } else {
            return stopOver;
        }
    }

    /**
     * Sets the value of the stopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isStopOver()
     */
    public void setStopOver(Boolean value) {
        this.stopOver = value;
    }

    /**
     * The minimum time needed to connect between the
     *                         two different destinations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinConnectionTime() {
        return minConnectionTime;
    }

    /**
     * Sets the value of the minConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMinConnectionTime()
     */
    public void setMinConnectionTime(Integer value) {
        this.minConnectionTime = value;
    }

    /**
     * The actual duration (in minutes) between
     *                         flights.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDuration()
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * The sequential AirSegment number that this
     *                         connection information applies to.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getSegmentIndex()
     */
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }

    /**
     * The sequential FlightDetails number that this
     *                         connection information applies to.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightDetailsIndex() {
        return flightDetailsIndex;
    }

    /**
     * Sets the value of the flightDetailsIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFlightDetailsIndex()
     */
    public void setFlightDetailsIndex(Integer value) {
        this.flightDetailsIndex = value;
    }

    /**
     * The field determines to quote fares with or
     *                         without stop overs,the values can be NoStopOver,StopOver and
     *                         IgnoreSegment.
     * 
     * @return
     *     possible object is
     *     {@link TypeIgnoreStopOver }
     *     
     */
    public TypeIgnoreStopOver getIncludeStopOverToFareQuote() {
        return includeStopOverToFareQuote;
    }

    /**
     * Sets the value of the includeStopOverToFareQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIgnoreStopOver }
     *     
     * @see #getIncludeStopOverToFareQuote()
     */
    public void setIncludeStopOverToFareQuote(TypeIgnoreStopOver value) {
        this.includeStopOverToFareQuote = value;
    }

}
