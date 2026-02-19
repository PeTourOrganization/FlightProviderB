
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FlightNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeFlightNumber" />
 *       <attribute name="Origin" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="DepartureDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typeClassOfService" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FlightInfoCriteria")
public class FlightInfoCriteria {

    /**
     * An identifier to link the flightinfo responses
     *                         to the criteria. The value passed here will be returned in the
     *                         resulting flightinfo(s) from this command.
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The carrier that is marketing this segment
     * 
     */
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    /**
     * The flight number under which the marketing
     *                         carrier is marketing this flight
     * 
     */
    @XmlAttribute(name = "FlightNumber", required = true)
    protected String flightNumber;
    /**
     * The IATA location code for this origination of
     *                         this entity.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * The IATA location code for this destination of
     *                         this entity.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * The date at which this entity departs. This
     *                         does not include time zone information since it can be derived
     *                         from the origin location.
     * 
     */
    @XmlAttribute(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;

    /**
     * An identifier to link the flightinfo responses
     *                         to the criteria. The value passed here will be returned in the
     *                         resulting flightinfo(s) from this command.
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
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * The carrier that is marketing this segment
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
     * @see #getCarrier()
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * The flight number under which the marketing
     *                         carrier is marketing this flight
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
     * The date at which this entity departs. This
     *                         does not include time zone information since it can be derived
     *                         from the origin location.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDepartureDate()
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
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

}
