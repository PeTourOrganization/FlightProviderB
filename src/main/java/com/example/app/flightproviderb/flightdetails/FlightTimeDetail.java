
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         <element name="DaysOfOperation" type="{http://www.travelport.com/schema/air_v54_0}typeDaysOfOperation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Connection" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeAirport" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeAirport" />
 *       <attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       <attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       <attribute name="StopCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Equipment" type="{http://www.travelport.com/schema/air_v54_0}typeEquipment" />
 *       <attribute name="ScheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="DisplayOption" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="OnTimePerformance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="DayChange" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="FlightTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="StartTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EndTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FirstIntermediateStop" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="LastIntermediateStop" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="InsideAvailability">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SecureSell">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AvailabilitySource" type="{http://www.travelport.com/schema/air_v54_0}typeAvailabilitySource" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "daysOfOperation",
    "connection"
})
@XmlRootElement(name = "FlightTimeDetail")
public class FlightTimeDetail {

    @XmlElement(name = "DaysOfOperation")
    protected TypeDaysOfOperation daysOfOperation;
    /**
     * Flight Connection Information
     * 
     */
    @XmlElement(name = "Connection")
    protected Connection connection;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * Flight departure time
     * 
     */
    @XmlAttribute(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    /**
     * Flight arrival time
     * 
     */
    @XmlAttribute(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "StopCount")
    protected BigInteger stopCount;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    /**
     * Flight time table search start date
     * 
     */
    @XmlAttribute(name = "ScheduleStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleStartDate;
    /**
     * Flight time table search end date
     * 
     */
    @XmlAttribute(name = "ScheduleEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleEndDate;
    /**
     * Indicates if carrier has link (carrier specific) display option.
     * 
     */
    @XmlAttribute(name = "DisplayOption")
    protected Boolean displayOption;
    /**
     * On time performance indicator in percentage.
     * 
     */
    @XmlAttribute(name = "OnTimePerformance")
    protected BigInteger onTimePerformance;
    /**
     * Indicates if flight arrives on same day as departure, previous day, or next day. Like values  00 means Same day ,  01 means next day, -1 mean Previous day etc.
     * 
     */
    @XmlAttribute(name = "DayChange")
    protected BigInteger dayChange;
    /**
     * Indicates total journey time in minutes.
     * 
     */
    @XmlAttribute(name = "JourneyTime")
    protected BigInteger journeyTime;
    /**
     * Indicates total flight time in minutes.
     * 
     */
    @XmlAttribute(name = "FlightTime")
    protected BigInteger flightTime;
    /**
     * Flight start terminal code.
     * 
     */
    @XmlAttribute(name = "StartTerminal")
    protected String startTerminal;
    /**
     * Flight end terminal code.
     * 
     */
    @XmlAttribute(name = "EndTerminal")
    protected String endTerminal;
    /**
     * First intermediate stop after board point.
     * 
     */
    @XmlAttribute(name = "FirstIntermediateStop")
    protected String firstIntermediateStop;
    /**
     * Last intermediate stop before off point.
     * 
     */
    @XmlAttribute(name = "LastIntermediateStop")
    protected String lastIntermediateStop;
    @XmlAttribute(name = "InsideAvailability")
    protected String insideAvailability;
    @XmlAttribute(name = "SecureSell")
    protected String secureSell;
    @XmlAttribute(name = "AvailabilitySource")
    protected String availabilitySource;

    /**
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public TypeDaysOfOperation getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public void setDaysOfOperation(TypeDaysOfOperation value) {
        this.daysOfOperation = value;
    }

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
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the origin property.
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
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
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
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Flight departure time
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDepartureTime()
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Flight arrival time
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getArrivalTime()
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the stopCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopCount() {
        return stopCount;
    }

    /**
     * Sets the value of the stopCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopCount(BigInteger value) {
        this.stopCount = value;
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
     * Flight time table search start date
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getScheduleStartDate()
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * Flight time table search end date
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * Sets the value of the scheduleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getScheduleEndDate()
     */
    public void setScheduleEndDate(XMLGregorianCalendar value) {
        this.scheduleEndDate = value;
    }

    /**
     * Indicates if carrier has link (carrier specific) display option.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOption() {
        return displayOption;
    }

    /**
     * Sets the value of the displayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDisplayOption()
     */
    public void setDisplayOption(Boolean value) {
        this.displayOption = value;
    }

    /**
     * On time performance indicator in percentage.
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
     * Indicates if flight arrives on same day as departure, previous day, or next day. Like values  00 means Same day ,  01 means next day, -1 mean Previous day etc.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayChange() {
        return dayChange;
    }

    /**
     * Sets the value of the dayChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getDayChange()
     */
    public void setDayChange(BigInteger value) {
        this.dayChange = value;
    }

    /**
     * Indicates total journey time in minutes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJourneyTime() {
        return journeyTime;
    }

    /**
     * Sets the value of the journeyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getJourneyTime()
     */
    public void setJourneyTime(BigInteger value) {
        this.journeyTime = value;
    }

    /**
     * Indicates total flight time in minutes.
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
     * Flight start terminal code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTerminal() {
        return startTerminal;
    }

    /**
     * Sets the value of the startTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStartTerminal()
     */
    public void setStartTerminal(String value) {
        this.startTerminal = value;
    }

    /**
     * Flight end terminal code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTerminal() {
        return endTerminal;
    }

    /**
     * Sets the value of the endTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEndTerminal()
     */
    public void setEndTerminal(String value) {
        this.endTerminal = value;
    }

    /**
     * First intermediate stop after board point.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstIntermediateStop() {
        return firstIntermediateStop;
    }

    /**
     * Sets the value of the firstIntermediateStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFirstIntermediateStop()
     */
    public void setFirstIntermediateStop(String value) {
        this.firstIntermediateStop = value;
    }

    /**
     * Last intermediate stop before off point.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastIntermediateStop() {
        return lastIntermediateStop;
    }

    /**
     * Sets the value of the lastIntermediateStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLastIntermediateStop()
     */
    public void setLastIntermediateStop(String value) {
        this.lastIntermediateStop = value;
    }

    /**
     * Gets the value of the insideAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideAvailability() {
        return insideAvailability;
    }

    /**
     * Sets the value of the insideAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideAvailability(String value) {
        this.insideAvailability = value;
    }

    /**
     * Gets the value of the secureSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureSell() {
        return secureSell;
    }

    /**
     * Sets the value of the secureSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureSell(String value) {
        this.secureSell = value;
    }

    /**
     * Gets the value of the availabilitySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilitySource() {
        return availabilitySource;
    }

    /**
     * Sets the value of the availabilitySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilitySource(String value) {
        this.availabilitySource = value;
    }

}
