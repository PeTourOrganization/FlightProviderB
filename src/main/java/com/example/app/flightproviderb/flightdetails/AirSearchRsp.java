
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base Response for Air Search
 * 
 * <p>Java class for AirSearchRsp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirSearchRsp">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}BaseAvailabilitySearchRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareNoteList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExpertSolutionList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}RouteList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AlternateRouteList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AlternateLocationDistanceList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareInfoMessage" maxOccurs="99" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution" maxOccurs="999" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricePointList" minOccurs="0"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSegmentList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailJourneyList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareNoteList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareIDList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailFareList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailPricingSolution" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchRsp", propOrder = {
    "fareNoteList",
    "expertSolutionList",
    "routeList",
    "alternateRouteList",
    "alternateLocationDistanceList",
    "fareInfoMessage",
    "airPricingSolution",
    "airPricePointList",
    "railSegmentList",
    "railJourneyList",
    "railFareNoteList",
    "railFareIDList",
    "railFareList",
    "railPricingSolution"
})
@XmlSeeAlso({
    LowFareSearchRsp.class,
    ScheduleSearchRsp.class
})
public class AirSearchRsp
    extends BaseAvailabilitySearchRsp
{

    /**
     * The shared object list of Notes
     * 
     */
    @XmlElement(name = "FareNoteList")
    protected FareNoteList fareNoteList;
    /**
     * Identifies the Expert Solutions retrieved
     *                 from the Knowledge Base.
     * 
     */
    @XmlElement(name = "ExpertSolutionList")
    protected ExpertSolutionList expertSolutionList;
    /**
     * Identifies the routes and sub-routes that
     *                 were requested
     * 
     */
    @XmlElement(name = "RouteList")
    protected RouteList routeList;
    /**
     * Identifies the alternate routes for the
     *                 request
     * 
     */
    @XmlElement(name = "AlternateRouteList")
    protected AlternateRouteList alternateRouteList;
    /**
     * Provides the Distance Information between
     *                 Original Search Airports or City to Alternate Search Airports
     * 
     */
    @XmlElement(name = "AlternateLocationDistanceList")
    protected AlternateLocationDistanceList alternateLocationDistanceList;
    /**
     * A simple textual fare information message.Providers supported : 1G/1V/1P
     * 
     */
    @XmlElement(name = "FareInfoMessage")
    protected List<FareInfoMessage> fareInfoMessage;
    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution")
    protected List<AirPricingSolution> airPricingSolution;
    /**
     * Provides the list of AirPricePoint (Non Solutioned Result)
     * 
     */
    @XmlElement(name = "AirPricePointList")
    protected AirPricePointList airPricePointList;
    /**
     * List of Rail Segments
     * 
     */
    @XmlElement(name = "RailSegmentList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailSegmentList railSegmentList;
    /**
     * List of Rail Journeys
     * 
     */
    @XmlElement(name = "RailJourneyList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailJourneyList railJourneyList;
    /**
     * The shared object list of Notes
     * 
     */
    @XmlElement(name = "RailFareNoteList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailFareNoteList railFareNoteList;
    /**
     * The shared object list of FareIDs
     * 
     */
    @XmlElement(name = "RailFareIDList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailFareIDList railFareIDList;
    /**
     * The shared object list of FareInfos
     * 
     */
    @XmlElement(name = "RailFareList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailFareList railFareList;
    /**
     * Contains the fares and segments for a particular offer.
     * 
     */
    @XmlElement(name = "RailPricingSolution", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<RailPricingSolution> railPricingSolution;

    /**
     * The shared object list of Notes
     * 
     * @return
     *     possible object is
     *     {@link FareNoteList }
     *     
     */
    public FareNoteList getFareNoteList() {
        return fareNoteList;
    }

    /**
     * Sets the value of the fareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNoteList }
     *     
     * @see #getFareNoteList()
     */
    public void setFareNoteList(FareNoteList value) {
        this.fareNoteList = value;
    }

    /**
     * Identifies the Expert Solutions retrieved
     *                 from the Knowledge Base.
     * 
     * @return
     *     possible object is
     *     {@link ExpertSolutionList }
     *     
     */
    public ExpertSolutionList getExpertSolutionList() {
        return expertSolutionList;
    }

    /**
     * Sets the value of the expertSolutionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpertSolutionList }
     *     
     * @see #getExpertSolutionList()
     */
    public void setExpertSolutionList(ExpertSolutionList value) {
        this.expertSolutionList = value;
    }

    /**
     * Identifies the routes and sub-routes that
     *                 were requested
     * 
     * @return
     *     possible object is
     *     {@link RouteList }
     *     
     */
    public RouteList getRouteList() {
        return routeList;
    }

    /**
     * Sets the value of the routeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteList }
     *     
     * @see #getRouteList()
     */
    public void setRouteList(RouteList value) {
        this.routeList = value;
    }

    /**
     * Identifies the alternate routes for the
     *                 request
     * 
     * @return
     *     possible object is
     *     {@link AlternateRouteList }
     *     
     */
    public AlternateRouteList getAlternateRouteList() {
        return alternateRouteList;
    }

    /**
     * Sets the value of the alternateRouteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateRouteList }
     *     
     * @see #getAlternateRouteList()
     */
    public void setAlternateRouteList(AlternateRouteList value) {
        this.alternateRouteList = value;
    }

    /**
     * Provides the Distance Information between
     *                 Original Search Airports or City to Alternate Search Airports
     * 
     * @return
     *     possible object is
     *     {@link AlternateLocationDistanceList }
     *     
     */
    public AlternateLocationDistanceList getAlternateLocationDistanceList() {
        return alternateLocationDistanceList;
    }

    /**
     * Sets the value of the alternateLocationDistanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateLocationDistanceList }
     *     
     * @see #getAlternateLocationDistanceList()
     */
    public void setAlternateLocationDistanceList(AlternateLocationDistanceList value) {
        this.alternateLocationDistanceList = value;
    }

    /**
     * A simple textual fare information message.Providers supported : 1G/1V/1P
     * 
     * Gets the value of the fareInfoMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfoMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareInfoMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareInfoMessage property.
     */
    public List<FareInfoMessage> getFareInfoMessage() {
        if (fareInfoMessage == null) {
            fareInfoMessage = new ArrayList<>();
        }
        return this.fareInfoMessage;
    }

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     * Gets the value of the airPricingSolution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingSolution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingSolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the airPricingSolution property.
     */
    public List<AirPricingSolution> getAirPricingSolution() {
        if (airPricingSolution == null) {
            airPricingSolution = new ArrayList<>();
        }
        return this.airPricingSolution;
    }

    /**
     * Provides the list of AirPricePoint (Non Solutioned Result)
     * 
     * @return
     *     possible object is
     *     {@link AirPricePointList }
     *     
     */
    public AirPricePointList getAirPricePointList() {
        return airPricePointList;
    }

    /**
     * Sets the value of the airPricePointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricePointList }
     *     
     * @see #getAirPricePointList()
     */
    public void setAirPricePointList(AirPricePointList value) {
        this.airPricePointList = value;
    }

    /**
     * List of Rail Segments
     * 
     * @return
     *     possible object is
     *     {@link RailSegmentList }
     *     
     */
    public RailSegmentList getRailSegmentList() {
        return railSegmentList;
    }

    /**
     * Sets the value of the railSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSegmentList }
     *     
     * @see #getRailSegmentList()
     */
    public void setRailSegmentList(RailSegmentList value) {
        this.railSegmentList = value;
    }

    /**
     * List of Rail Journeys
     * 
     * @return
     *     possible object is
     *     {@link RailJourneyList }
     *     
     */
    public RailJourneyList getRailJourneyList() {
        return railJourneyList;
    }

    /**
     * Sets the value of the railJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailJourneyList }
     *     
     * @see #getRailJourneyList()
     */
    public void setRailJourneyList(RailJourneyList value) {
        this.railJourneyList = value;
    }

    /**
     * The shared object list of Notes
     * 
     * @return
     *     possible object is
     *     {@link RailFareNoteList }
     *     
     */
    public RailFareNoteList getRailFareNoteList() {
        return railFareNoteList;
    }

    /**
     * Sets the value of the railFareNoteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareNoteList }
     *     
     * @see #getRailFareNoteList()
     */
    public void setRailFareNoteList(RailFareNoteList value) {
        this.railFareNoteList = value;
    }

    /**
     * The shared object list of FareIDs
     * 
     * @return
     *     possible object is
     *     {@link RailFareIDList }
     *     
     */
    public RailFareIDList getRailFareIDList() {
        return railFareIDList;
    }

    /**
     * Sets the value of the railFareIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareIDList }
     *     
     * @see #getRailFareIDList()
     */
    public void setRailFareIDList(RailFareIDList value) {
        this.railFareIDList = value;
    }

    /**
     * The shared object list of FareInfos
     * 
     * @return
     *     possible object is
     *     {@link RailFareList }
     *     
     */
    public RailFareList getRailFareList() {
        return railFareList;
    }

    /**
     * Sets the value of the railFareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareList }
     *     
     * @see #getRailFareList()
     */
    public void setRailFareList(RailFareList value) {
        this.railFareList = value;
    }

    /**
     * Contains the fares and segments for a particular offer.
     * 
     * Gets the value of the railPricingSolution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railPricingSolution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRailPricingSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPricingSolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the railPricingSolution property.
     */
    public List<RailPricingSolution> getRailPricingSolution() {
        if (railPricingSolution == null) {
            railPricingSolution = new ArrayList<>();
        }
        return this.railPricingSolution;
    }

}
