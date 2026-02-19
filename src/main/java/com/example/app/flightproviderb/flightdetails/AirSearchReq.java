
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Base Request for Air Search
 * 
 * <p>Java class for AirSearchReq complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirSearchReq">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseSearchReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfCommencement" minOccurs="0"/>
 *         <choice>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}SearchAirLeg" maxOccurs="16"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}SearchSpecificAirSegment" maxOccurs="999"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSearchModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}JourneyData" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchReq", propOrder = {
    "pointOfCommencement",
    "searchAirLeg",
    "searchSpecificAirSegment",
    "airSearchModifiers",
    "journeyData"
})
@XmlSeeAlso({
    AvailabilitySearchReq.class,
    ScheduleSearchReq.class
})
public class AirSearchReq
    extends BaseSearchReq
{

    /**
     * Point of Commencement is optional. CityOrAirportCode and date portion of the Time attribute is mandatory.
     * 
     */
    @XmlElement(name = "PointOfCommencement", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PointOfCommencement pointOfCommencement;
    /**
     * Search version of AirLeg used to specify
     *                 search criteria
     * 
     */
    @XmlElement(name = "SearchAirLeg")
    protected List<SearchAirLeg> searchAirLeg;
    @XmlElement(name = "SearchSpecificAirSegment")
    protected List<SearchSpecificAirSegment> searchSpecificAirSegment;
    /**
     * Controls and switches for the Air Search
     *                 request
     * 
     */
    @XmlElement(name = "AirSearchModifiers")
    protected AirSearchModifiers airSearchModifiers;
    /**
     * Performs journey aware air availability
     * 
     */
    @XmlElement(name = "JourneyData")
    protected JourneyData journeyData;

    /**
     * Point of Commencement is optional. CityOrAirportCode and date portion of the Time attribute is mandatory.
     * 
     * @return
     *     possible object is
     *     {@link PointOfCommencement }
     *     
     */
    public PointOfCommencement getPointOfCommencement() {
        return pointOfCommencement;
    }

    /**
     * Sets the value of the pointOfCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfCommencement }
     *     
     * @see #getPointOfCommencement()
     */
    public void setPointOfCommencement(PointOfCommencement value) {
        this.pointOfCommencement = value;
    }

    /**
     * Search version of AirLeg used to specify
     *                 search criteria
     * 
     * Gets the value of the searchAirLeg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAirLeg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchAirLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAirLeg }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchAirLeg property.
     */
    public List<SearchAirLeg> getSearchAirLeg() {
        if (searchAirLeg == null) {
            searchAirLeg = new ArrayList<>();
        }
        return this.searchAirLeg;
    }

    /**
     * Gets the value of the searchSpecificAirSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchSpecificAirSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchSpecificAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchSpecificAirSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchSpecificAirSegment property.
     */
    public List<SearchSpecificAirSegment> getSearchSpecificAirSegment() {
        if (searchSpecificAirSegment == null) {
            searchSpecificAirSegment = new ArrayList<>();
        }
        return this.searchSpecificAirSegment;
    }

    /**
     * Controls and switches for the Air Search
     *                 request
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers }
     *     
     */
    public AirSearchModifiers getAirSearchModifiers() {
        return airSearchModifiers;
    }

    /**
     * Sets the value of the airSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers }
     *     
     * @see #getAirSearchModifiers()
     */
    public void setAirSearchModifiers(AirSearchModifiers value) {
        this.airSearchModifiers = value;
    }

    /**
     * Performs journey aware air availability
     * 
     * @return
     *     possible object is
     *     {@link JourneyData }
     *     
     */
    public JourneyData getJourneyData() {
        return journeyData;
    }

    /**
     * Sets the value of the journeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyData }
     *     
     * @see #getJourneyData()
     */
    public void setJourneyData(JourneyData value) {
        this.journeyData = value;
    }

}
