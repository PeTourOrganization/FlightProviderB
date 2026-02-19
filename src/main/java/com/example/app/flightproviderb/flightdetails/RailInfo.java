
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <attGroup ref="{http://www.travelport.com/schema/rail_v54_0}attrRailInfoOrgDesAndRailLoc"/>
 *       <attribute name="TrainNumber" use="required" type="{http://www.travelport.com/schema/rail_v54_0}typeTrainNumber" />
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailInfo {

    @XmlAttribute(name = "TrainNumber", required = true)
    protected String trainNumber;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    /**
     * The IATA location code for this origination of this entity.
     * 
     */
    @XmlAttribute(name = "Origin")
    protected String origin;
    /**
     * RCH specific origin code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     */
    @XmlAttribute(name = "RailLocOrigin")
    protected String railLocOrigin;
    /**
     * The IATA location code for this destination of this entity.
     * 
     */
    @XmlAttribute(name = "Destination")
    protected String destination;
    /**
     * RCH specific destination code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     */
    @XmlAttribute(name = "RailLocDestination")
    protected String railLocDestination;
    /**
     * The date and time at which this entity departs. This does not include time zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "DepartureTime", required = true)
    protected String departureTime;
    /**
     * The date and time at which this entity arrives at the destination. This does not include time zone information since it can be derived from the origin location.
     * 
     */
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
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
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
     * RCH specific origin code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocOrigin() {
        return railLocOrigin;
    }

    /**
     * Sets the value of the railLocOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailLocOrigin()
     */
    public void setRailLocOrigin(String value) {
        this.railLocOrigin = value;
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
     * RCH specific destination code (a.k.a UCodes) which uniquely identifies a train station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocDestination() {
        return railLocDestination;
    }

    /**
     * Sets the value of the railLocDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailLocDestination()
     */
    public void setRailLocDestination(String value) {
        this.railLocDestination = value;
    }

    /**
     * The date and time at which this entity departs. This does not include time zone information since it can be derived from the origin location.
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
     * The date and time at which this entity arrives at the destination. This does not include time zone information since it can be derived from the origin location.
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

}
