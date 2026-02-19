
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}AirBaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirPricingSolution"/>
 *       </sequence>
 *       <attribute name="FareRuleType" type="{http://www.travelport.com/schema/air_v54_0}typeFareRuleType" default="none" />
 *       <attribute name="IgnoreAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "airPricingSolution"
})
@XmlRootElement(name = "AirRepriceReq")
public class AirRepriceReq
    extends AirBaseReq
{

    /**
     * Identifies the AirReservation LocatorCode
     *                 within the Universal Record
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode")
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     */
    @XmlElement(name = "AirPricingSolution", required = true)
    protected AirPricingSolution airPricingSolution;
    @XmlAttribute(name = "FareRuleType")
    protected TypeFareRuleType fareRuleType;
    @XmlAttribute(name = "IgnoreAvailability")
    protected Boolean ignoreAvailability;

    /**
     * Identifies the AirReservation LocatorCode
     *                 within the Universal Record
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     * @see #getAirReservationLocatorCode()
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * The pricing container for an air travel
     *             itinerary
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     * @see #getAirPricingSolution()
     */
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
    }

    /**
     * Gets the value of the fareRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRuleType }
     *     
     */
    public TypeFareRuleType getFareRuleType() {
        if (fareRuleType == null) {
            return TypeFareRuleType.NONE;
        } else {
            return fareRuleType;
        }
    }

    /**
     * Sets the value of the fareRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRuleType }
     *     
     */
    public void setFareRuleType(TypeFareRuleType value) {
        this.fareRuleType = value;
    }

    /**
     * Gets the value of the ignoreAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreAvailability() {
        if (ignoreAvailability == null) {
            return false;
        } else {
            return ignoreAvailability;
        }
    }

    /**
     * Sets the value of the ignoreAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAvailability(Boolean value) {
        this.ignoreAvailability = value;
    }

}
