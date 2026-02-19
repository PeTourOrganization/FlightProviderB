
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Availability Search response
 * 
 * <p>Java class for BaseAvailabilitySearchRsp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseAvailabilitySearchRsp">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseSearchRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightDetailsList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareInfoList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareRemarkList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirItinerarySolution" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}HostTokenList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}APISRequirementsList" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AmenitiesList" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="DistanceUnits" type="{http://www.travelport.com/schema/common_v54_0}typeDistance" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAvailabilitySearchRsp", propOrder = {
    "flightDetailsList",
    "airSegmentList",
    "fareInfoList",
    "fareRemarkList",
    "airItinerarySolution",
    "hostTokenList",
    "apisRequirementsList",
    "amenitiesList"
})
@XmlSeeAlso({
    AvailabilitySearchRsp.class,
    AirSearchRsp.class
})
public class BaseAvailabilitySearchRsp
    extends BaseSearchRsp
{

    /**
     * The shared object list of FlightDetails
     * 
     */
    @XmlElement(name = "FlightDetailsList")
    protected FlightDetailsList flightDetailsList;
    /**
     * The shared object list of AirSegments
     * 
     */
    @XmlElement(name = "AirSegmentList")
    protected AirSegmentList airSegmentList;
    /**
     * The shared object list of FareInfos
     * 
     */
    @XmlElement(name = "FareInfoList")
    protected FareInfoList fareInfoList;
    /**
     * The shared object list of FareInfos
     * 
     */
    @XmlElement(name = "FareRemarkList")
    protected FareRemarkList fareRemarkList;
    /**
     * The pricing container for an air travel
     *                 itinerary
     * 
     */
    @XmlElement(name = "AirItinerarySolution")
    protected List<AirItinerarySolution> airItinerarySolution;
    /**
     * The shared object list of Host Tokens
     * 
     */
    @XmlElement(name = "HostTokenList")
    protected HostTokenList hostTokenList;
    /**
     * The shared object list of APISRequirements
     * 
     */
    @XmlElement(name = "APISRequirementsList")
    protected APISRequirementsList apisRequirementsList;
    /**
     * List of Amenities for the itinerary.
     * 
     */
    @XmlElement(name = "AmenitiesList")
    protected List<AmenitiesList> amenitiesList;
    @XmlAttribute(name = "DistanceUnits")
    protected TypeDistance distanceUnits;

    /**
     * The shared object list of FlightDetails
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsList }
     *     
     */
    public FlightDetailsList getFlightDetailsList() {
        return flightDetailsList;
    }

    /**
     * Sets the value of the flightDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsList }
     *     
     * @see #getFlightDetailsList()
     */
    public void setFlightDetailsList(FlightDetailsList value) {
        this.flightDetailsList = value;
    }

    /**
     * The shared object list of AirSegments
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentList }
     *     
     */
    public AirSegmentList getAirSegmentList() {
        return airSegmentList;
    }

    /**
     * Sets the value of the airSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentList }
     *     
     * @see #getAirSegmentList()
     */
    public void setAirSegmentList(AirSegmentList value) {
        this.airSegmentList = value;
    }

    /**
     * The shared object list of FareInfos
     * 
     * @return
     *     possible object is
     *     {@link FareInfoList }
     *     
     */
    public FareInfoList getFareInfoList() {
        return fareInfoList;
    }

    /**
     * Sets the value of the fareInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoList }
     *     
     * @see #getFareInfoList()
     */
    public void setFareInfoList(FareInfoList value) {
        this.fareInfoList = value;
    }

    /**
     * The shared object list of FareInfos
     * 
     * @return
     *     possible object is
     *     {@link FareRemarkList }
     *     
     */
    public FareRemarkList getFareRemarkList() {
        return fareRemarkList;
    }

    /**
     * Sets the value of the fareRemarkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRemarkList }
     *     
     * @see #getFareRemarkList()
     */
    public void setFareRemarkList(FareRemarkList value) {
        this.fareRemarkList = value;
    }

    /**
     * The pricing container for an air travel
     *                 itinerary
     * 
     * Gets the value of the airItinerarySolution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItinerarySolution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirItinerarySolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItinerarySolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the airItinerarySolution property.
     */
    public List<AirItinerarySolution> getAirItinerarySolution() {
        if (airItinerarySolution == null) {
            airItinerarySolution = new ArrayList<>();
        }
        return this.airItinerarySolution;
    }

    /**
     * The shared object list of Host Tokens
     * 
     * @return
     *     possible object is
     *     {@link HostTokenList }
     *     
     */
    public HostTokenList getHostTokenList() {
        return hostTokenList;
    }

    /**
     * Sets the value of the hostTokenList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostTokenList }
     *     
     * @see #getHostTokenList()
     */
    public void setHostTokenList(HostTokenList value) {
        this.hostTokenList = value;
    }

    /**
     * The shared object list of APISRequirements
     * 
     * @return
     *     possible object is
     *     {@link APISRequirementsList }
     *     
     */
    public APISRequirementsList getAPISRequirementsList() {
        return apisRequirementsList;
    }

    /**
     * Sets the value of the apisRequirementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISRequirementsList }
     *     
     * @see #getAPISRequirementsList()
     */
    public void setAPISRequirementsList(APISRequirementsList value) {
        this.apisRequirementsList = value;
    }

    /**
     * List of Amenities for the itinerary.
     * 
     * Gets the value of the amenitiesList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenitiesList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAmenitiesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenitiesList }
     * </p>
     * 
     * 
     * @return
     *     The value of the amenitiesList property.
     */
    public List<AmenitiesList> getAmenitiesList() {
        if (amenitiesList == null) {
            amenitiesList = new ArrayList<>();
        }
        return this.amenitiesList;
    }

    /**
     * Gets the value of the distanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getDistanceUnits() {
        return distanceUnits;
    }

    /**
     * Sets the value of the distanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setDistanceUnits(TypeDistance value) {
        this.distanceUnits = value;
    }

}
