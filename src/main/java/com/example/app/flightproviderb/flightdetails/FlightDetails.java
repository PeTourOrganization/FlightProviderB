
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Connection" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Meals" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}InFlightServices" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrOrigDestDepatureInfo"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrFlightTimes"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Equipment" type="{http://www.travelport.com/schema/air_v54_0}typeEquipment" />
 *       <attribute name="OnTimePerformance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="OriginTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DestinationTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="AutomatedCheckin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "connection",
    "meals",
    "inFlightServices"
})
@XmlRootElement(name = "FlightDetails")
public class FlightDetails {

    /**
     * Flight Connection Information
     * 
     */
    @XmlElement(name = "Connection")
    protected Connection connection;
    /**
     * Available Meal Service.
     * 
     */
    @XmlElement(name = "Meals")
    @XmlSchemaType(name = "string")
    protected List<TypeMealService> meals;
    /**
     * Available InFlight Services. They are: 'Movie', 'Telephone', 'Telex', 'AudioProgramming', 'Television' ,'ResvBookingService' ,'DutyFreeSales' ,'Smoking' ,'NonSmoking' ,'ShortFeatureVideo' ,'NoDutyFree' ,'InSeatPowerSource' ,'InternetAccess' ,'Email' ,'Library' ,'LieFlatSeat' ,'Additional service(s) exists' ,'WiFi' ,'Lie-Flat seat first' ,'Lie-Flat seat business' ,'Lie-Flat seat premium economy' ,'Amenities subject to change' etc.. These follow the IATA standard. Please see the IATA standards for a more complete list.
     * 
     */
    @XmlElement(name = "InFlightServices")
    protected List<String> inFlightServices;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    /**
     * Represents flight on time performance
     *                         as a percentage from 0 to 100
     * 
     */
    @XmlAttribute(name = "OnTimePerformance")
    protected BigInteger onTimePerformance;
    @XmlAttribute(name = "OriginTerminal")
    protected String originTerminal;
    @XmlAttribute(name = "DestinationTerminal")
    protected String destinationTerminal;
    @XmlAttribute(name = "GroundTime")
    protected BigInteger groundTime;
    /**
     * “True” indicates that the flight allows automated check-in. The default is “False”.
     * 
     */
    @XmlAttribute(name = "AutomatedCheckin")
    protected Boolean automatedCheckin;
    /**
     * The IATA location code for this origination of this entity.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * The IATA location code for this destination of this entity.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    /**
     * The date and time at which this entity departs. Date and time are represented as Airport Local Time at the place of departure. The correct time zone offset is also included.
     * 
     */
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    /**
     * The date and time at which this entity arrives at the destination. Date and time are represented as Airport Local Time at the place of arrival. The correct time zone offset is also included.
     * 
     */
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
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
     * Time spent (minutes) traveling in flight, including airport taxi time.
     * 
     */
    @XmlAttribute(name = "FlightTime")
    protected BigInteger flightTime;
    /**
     * Total time spent (minutes) traveling including flight time and ground time.
     * 
     */
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    /**
     * The distance traveled. Units are specified in the parent response element.
     * 
     */
    @XmlAttribute(name = "Distance")
    protected BigInteger distance;

    /**
     * Flight Connection Information
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     * @see #getConnection()
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Available Meal Service.
     * 
     * Gets the value of the meals property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meals property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMeals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMealService }
     * </p>
     * 
     * 
     * @return
     *     The value of the meals property.
     */
    public List<TypeMealService> getMeals() {
        if (meals == null) {
            meals = new ArrayList<>();
        }
        return this.meals;
    }

    /**
     * Available InFlight Services. They are: 'Movie', 'Telephone', 'Telex', 'AudioProgramming', 'Television' ,'ResvBookingService' ,'DutyFreeSales' ,'Smoking' ,'NonSmoking' ,'ShortFeatureVideo' ,'NoDutyFree' ,'InSeatPowerSource' ,'InternetAccess' ,'Email' ,'Library' ,'LieFlatSeat' ,'Additional service(s) exists' ,'WiFi' ,'Lie-Flat seat first' ,'Lie-Flat seat business' ,'Lie-Flat seat premium economy' ,'Amenities subject to change' etc.. These follow the IATA standard. Please see the IATA standards for a more complete list.
     * 
     * Gets the value of the inFlightServices property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFlightServices property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInFlightServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the inFlightServices property.
     */
    public List<String> getInFlightServices() {
        if (inFlightServices == null) {
            inFlightServices = new ArrayList<>();
        }
        return this.inFlightServices;
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
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Represents flight on time performance
     *                         as a percentage from 0 to 100
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getOnTimePerformance()
     */
    public void setOnTimePerformance(BigInteger value) {
        this.onTimePerformance = value;
    }

    /**
     * Gets the value of the originTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTerminal() {
        return originTerminal;
    }

    /**
     * Sets the value of the originTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTerminal(String value) {
        this.originTerminal = value;
    }

    /**
     * Gets the value of the destinationTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    /**
     * Sets the value of the destinationTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTerminal(String value) {
        this.destinationTerminal = value;
    }

    /**
     * Gets the value of the groundTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroundTime() {
        return groundTime;
    }

    /**
     * Sets the value of the groundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroundTime(BigInteger value) {
        this.groundTime = value;
    }

    /**
     * “True” indicates that the flight allows automated check-in. The default is “False”.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutomatedCheckin() {
        if (automatedCheckin == null) {
            return false;
        } else {
            return automatedCheckin;
        }
    }

    /**
     * Sets the value of the automatedCheckin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutomatedCheckin()
     */
    public void setAutomatedCheckin(Boolean value) {
        this.automatedCheckin = value;
    }

    /**
     * The IATA location code for this origination of this entity.
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
     * The IATA location code for this destination of this entity.
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
     * The date and time at which this entity departs. Date and time are represented as Airport Local Time at the place of departure. The correct time zone offset is also included.
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
     * The date and time at which this entity arrives at the destination. Date and time are represented as Airport Local Time at the place of arrival. The correct time zone offset is also included.
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

    /**
     * Time spent (minutes) traveling in flight, including airport taxi time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightTime() {
        return flightTime;
    }

    /**
     * Sets the value of the flightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getFlightTime()
     */
    public void setFlightTime(BigInteger value) {
        this.flightTime = value;
    }

    /**
     * Total time spent (minutes) traveling including flight time and ground time.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTravelTime()
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * The distance traveled. Units are specified in the parent response element.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getDistance()
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

}
