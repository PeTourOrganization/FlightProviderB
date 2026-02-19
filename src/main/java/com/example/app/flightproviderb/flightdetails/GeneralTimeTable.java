
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="FlightOrigin" type="{http://www.travelport.com/schema/common_v54_0}typeLocation"/>
 *         <element name="FlightDestination" type="{http://www.travelport.com/schema/common_v54_0}typeLocation"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CarrierList" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="StartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       <attribute name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       <attribute name="IncludeConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "flightOrigin",
    "flightDestination",
    "carrierList"
})
@XmlRootElement(name = "GeneralTimeTable")
public class GeneralTimeTable {

    @XmlElement(name = "DaysOfOperation")
    protected TypeDaysOfOperation daysOfOperation;
    @XmlElement(name = "FlightOrigin", required = true)
    protected TypeLocation flightOrigin;
    @XmlElement(name = "FlightDestination", required = true)
    protected TypeLocation flightDestination;
    @XmlElement(name = "CarrierList")
    protected CarrierList carrierList;
    @XmlAttribute(name = "StartDate", required = true)
    protected String startDate;
    @XmlAttribute(name = "EndDate")
    protected String endDate;
    /**
     * Flight start time of flight time tabel .
     * 
     */
    @XmlAttribute(name = "StartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    /**
     * Flight end time of flight time tabel .
     * 
     */
    @XmlAttribute(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    /**
     * Include or exclude connecting flights.
     * 
     */
    @XmlAttribute(name = "IncludeConnection")
    protected Boolean includeConnection;

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
     * Gets the value of the flightOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLocation }
     *     
     */
    public TypeLocation getFlightOrigin() {
        return flightOrigin;
    }

    /**
     * Sets the value of the flightOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLocation }
     *     
     */
    public void setFlightOrigin(TypeLocation value) {
        this.flightOrigin = value;
    }

    /**
     * Gets the value of the flightDestination property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLocation }
     *     
     */
    public TypeLocation getFlightDestination() {
        return flightDestination;
    }

    /**
     * Sets the value of the flightDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLocation }
     *     
     */
    public void setFlightDestination(TypeLocation value) {
        this.flightDestination = value;
    }

    /**
     * Gets the value of the carrierList property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierList }
     *     
     */
    public CarrierList getCarrierList() {
        return carrierList;
    }

    /**
     * Sets the value of the carrierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierList }
     *     
     */
    public void setCarrierList(CarrierList value) {
        this.carrierList = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Flight start time of flight time tabel .
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartTime()
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Flight end time of flight time tabel .
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndTime()
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Include or exclude connecting flights.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeConnection() {
        return includeConnection;
    }

    /**
     * Sets the value of the includeConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeConnection()
     */
    public void setIncludeConnection(Boolean value) {
        this.includeConnection = value;
    }

}
