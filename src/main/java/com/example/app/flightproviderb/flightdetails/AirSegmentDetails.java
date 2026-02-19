
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PassengerDetailsRef" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BrandID" maxOccurs="99" minOccurs="0"/>
 *         <element name="BookingCodeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="DepartureTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="ArrivalTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="Equipment" type="{http://www.travelport.com/schema/air_v54_0}typeEquipment" />
 *       <attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typeClassOfService" />
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="OperatingCarrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FlightNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengerDetailsRef",
    "brandID",
    "bookingCodeList"
})
@XmlRootElement(name = "AirSegmentDetails")
public class AirSegmentDetails {

    /**
     * Reference of the Passenger
     * 
     */
    @XmlElement(name = "PassengerDetailsRef", required = true)
    protected List<PassengerDetailsRef> passengerDetailsRef;
    /**
     * Brand ids for Merchandising details.
     * 
     */
    @XmlElement(name = "BrandID")
    protected List<BrandID> brandID;
    /**
     * Lists classes of service and their counts separated by delimiter |.
     * 
     */
    @XmlElement(name = "BookingCodeList")
    protected String bookingCodeList;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
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
     * The date and time at which this entity departs. This does not include time zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "DepartureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    /**
     * The date and time at which this entity arrives at the destination. This does not include time zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "ArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    /**
     * The actual carrier that is operating the flight.
     * 
     */
    @XmlAttribute(name = "OperatingCarrier")
    protected String operatingCarrier;
    /**
     * Flight Number for the Search Leg Detail.
     * 
     */
    @XmlAttribute(name = "FlightNumber", required = true)
    protected String flightNumber;

    /**
     * Reference of the Passenger
     * 
     * Gets the value of the passengerDetailsRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerDetailsRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerDetailsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerDetailsRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerDetailsRef property.
     */
    public List<PassengerDetailsRef> getPassengerDetailsRef() {
        if (passengerDetailsRef == null) {
            passengerDetailsRef = new ArrayList<>();
        }
        return this.passengerDetailsRef;
    }

    /**
     * Brand ids for Merchandising details.
     * 
     * Gets the value of the brandID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBrandID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandID }
     * </p>
     * 
     * 
     * @return
     *     The value of the brandID property.
     */
    public List<BrandID> getBrandID() {
        if (brandID == null) {
            brandID = new ArrayList<>();
        }
        return this.brandID;
    }

    /**
     * Lists classes of service and their counts separated by delimiter |.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCodeList() {
        return bookingCodeList;
    }

    /**
     * Sets the value of the bookingCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingCodeList()
     */
    public void setBookingCodeList(String value) {
        this.bookingCodeList = value;
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
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
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
     * The date and time at which this entity departs. This does not include time zone information since it can be derived from the origin location.
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
     * The date and time at which this entity arrives at the destination. This does not include time zone information since it can be derived from the origin location.
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
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * The actual carrier that is operating the flight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingCarrier()
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

    /**
     * Flight Number for the Search Leg Detail.
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
     * @see #getFlightNumber()
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

}
