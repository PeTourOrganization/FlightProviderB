
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="CarrierSubCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ServiceSubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Booking">
 *         <simpleType>
 *           <restriction base="{http://www.travelport.com/schema/air_v54_0}typeBooking">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Occurrence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BundledService")
public class BundledService {

    /**
     * Carrier the service is applicable.
     * 
     */
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    /**
     * Carrier sub code. True means the carrier used their own sub code. False means the carrier used an ATPCO sub code
     * 
     */
    @XmlAttribute(name = "CarrierSubCode")
    protected Boolean carrierSubCode;
    /**
     * The type of service or what the service is used for, e.g. F type is flight type, meaning the service is used on a flight
     * 
     */
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    /**
     * The sub code of the service, e.g. OAA for Pre paid baggage
     * 
     */
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    /**
     * Name of the bundled service.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * Booking method for the bundled service, e..g SSR.
     * 
     */
    @XmlAttribute(name = "Booking")
    protected TypeBooking booking;
    /**
     * How many of the service are included in the bundled service.
     * 
     */
    @XmlAttribute(name = "Occurrence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger occurrence;

    /**
     * Carrier the service is applicable.
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
     * Carrier sub code. True means the carrier used their own sub code. False means the carrier used an ATPCO sub code
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarrierSubCode() {
        return carrierSubCode;
    }

    /**
     * Sets the value of the carrierSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCarrierSubCode()
     */
    public void setCarrierSubCode(Boolean value) {
        this.carrierSubCode = value;
    }

    /**
     * The type of service or what the service is used for, e.g. F type is flight type, meaning the service is used on a flight
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * The sub code of the service, e.g. OAA for Pre paid baggage
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceSubCode()
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * Name of the bundled service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Booking method for the bundled service, e..g SSR.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooking }
     *     
     */
    public TypeBooking getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooking }
     *     
     * @see #getBooking()
     */
    public void setBooking(TypeBooking value) {
        this.booking = value;
    }

    /**
     * How many of the service are included in the bundled service.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getOccurrence()
     */
    public void setOccurrence(BigInteger value) {
        this.occurrence = value;
    }

}
