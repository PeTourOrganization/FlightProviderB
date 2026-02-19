
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CodeshareInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Meals" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}InFlightServices" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Variance" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="ScheduledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v54_0}typeEticketability" />
 *       <attribute name="Equipment" type="{http://www.travelport.com/schema/air_v54_0}typeEquipment" />
 *       <attribute name="OriginTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="OriginGate">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="6"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="DestinationTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DestinationGate">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="6"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
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
    "codeshareInfo",
    "meals",
    "inFlightServices",
    "variance"
})
@XmlRootElement(name = "FlightInfoDetail")
public class FlightInfoDetail {

    /**
     * Describes the codeshare disclosure (simple
     *                 text string) or the specific operating flight information (as
     *                 attributes).
     * 
     */
    @XmlElement(name = "CodeshareInfo")
    protected CodeshareInfo codeshareInfo;
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
    /**
     * Indicates any variance in the requested
     *                 flight.
     * 
     */
    @XmlElement(name = "Variance")
    protected List<Variance> variance;
    /**
     * The IATA location code for this origination of
     *                         this entity.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * The IATA location code for this destination of
     *                         this entity.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    /**
     * The date and time at which this entity is
     *                         scheduled to depart. This does not include time zone information
     *                         since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "ScheduledDepartureTime")
    protected String scheduledDepartureTime;
    /**
     * The date and time at which this entity is
     *                         scheduled to arrive at the destination. This does not include time
     *                         zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "ScheduledArrivalTime")
    protected String scheduledArrivalTime;
    /**
     * Total time spent (minutes) traveling
     *                         including flight time and ground time.
     * 
     */
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    /**
     * Identifies if this particular segment
     *                         is E-Ticketable
     * 
     */
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "OriginTerminal")
    protected String originTerminal;
    /**
     * To be used to display origin flight gate number
     * 
     */
    @XmlAttribute(name = "OriginGate")
    protected String originGate;
    @XmlAttribute(name = "DestinationTerminal")
    protected String destinationTerminal;
    /**
     * To be used to display destination flight gate number
     * 
     */
    @XmlAttribute(name = "DestinationGate")
    protected String destinationGate;
    /**
     * “True” indicates that the flight allows automated check-in. The default is “False”.
     * 
     */
    @XmlAttribute(name = "AutomatedCheckin")
    protected Boolean automatedCheckin;

    /**
     * Describes the codeshare disclosure (simple
     *                 text string) or the specific operating flight information (as
     *                 attributes).
     * 
     * @return
     *     possible object is
     *     {@link CodeshareInfo }
     *     
     */
    public CodeshareInfo getCodeshareInfo() {
        return codeshareInfo;
    }

    /**
     * Sets the value of the codeshareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeshareInfo }
     *     
     * @see #getCodeshareInfo()
     */
    public void setCodeshareInfo(CodeshareInfo value) {
        this.codeshareInfo = value;
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
     * Indicates any variance in the requested
     *                 flight.
     * 
     * Gets the value of the variance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variance }
     * </p>
     * 
     * 
     * @return
     *     The value of the variance property.
     */
    public List<Variance> getVariance() {
        if (variance == null) {
            variance = new ArrayList<>();
        }
        return this.variance;
    }

    /**
     * The IATA location code for this origination of
     *                         this entity.
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
     * The IATA location code for this destination of
     *                         this entity.
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
     * The date and time at which this entity is
     *                         scheduled to depart. This does not include time zone information
     *                         since it can be derived from the origin location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Sets the value of the scheduledDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getScheduledDepartureTime()
     */
    public void setScheduledDepartureTime(String value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * The date and time at which this entity is
     *                         scheduled to arrive at the destination. This does not include time
     *                         zone information since it can be derived from the origin location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * Sets the value of the scheduledArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getScheduledArrivalTime()
     */
    public void setScheduledArrivalTime(String value) {
        this.scheduledArrivalTime = value;
    }

    /**
     * Total time spent (minutes) traveling
     *                         including flight time and ground time.
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
     * Identifies if this particular segment
     *                         is E-Ticketable
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     * @see #getETicketability()
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
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
     * To be used to display origin flight gate number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginGate() {
        return originGate;
    }

    /**
     * Sets the value of the originGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginGate()
     */
    public void setOriginGate(String value) {
        this.originGate = value;
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
     * To be used to display destination flight gate number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationGate() {
        return destinationGate;
    }

    /**
     * Sets the value of the destinationGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestinationGate()
     */
    public void setDestinationGate(String value) {
        this.destinationGate = value;
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

}
