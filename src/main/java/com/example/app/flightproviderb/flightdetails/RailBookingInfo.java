
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
 *       <attribute name="RailFareRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="RailJourneyRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="OptionalService" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailBookingInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailBookingInfo {

    /**
     * Reference to a fare that applies to the journey below.
     * 
     */
    @XmlAttribute(name = "RailFareRef", required = true)
    protected String railFareRef;
    /**
     * Reference to a journeys on which the above fare applies.
     * 
     */
    @XmlAttribute(name = "RailJourneyRef", required = true)
    protected String railJourneyRef;
    /**
     * Indicate the OfferFareItem elements  will be Optional or not.
     * 
     */
    @XmlAttribute(name = "OptionalService")
    protected Boolean optionalService;

    /**
     * Reference to a fare that applies to the journey below.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailFareRef() {
        return railFareRef;
    }

    /**
     * Sets the value of the railFareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailFareRef()
     */
    public void setRailFareRef(String value) {
        this.railFareRef = value;
    }

    /**
     * Reference to a journeys on which the above fare applies.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailJourneyRef() {
        return railJourneyRef;
    }

    /**
     * Sets the value of the railJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailJourneyRef()
     */
    public void setRailJourneyRef(String value) {
        this.railJourneyRef = value;
    }

    /**
     * Indicate the OfferFareItem elements  will be Optional or not.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptionalService() {
        if (optionalService == null) {
            return false;
        } else {
            return optionalService;
        }
    }

    /**
     * Sets the value of the optionalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOptionalService()
     */
    public void setOptionalService(Boolean value) {
        this.optionalService = value;
    }

}
