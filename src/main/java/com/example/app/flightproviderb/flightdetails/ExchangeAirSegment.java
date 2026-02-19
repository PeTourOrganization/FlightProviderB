
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CabinClass"/>
 *       </sequence>
 *       <attribute name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegment",
    "cabinClass"
})
@XmlRootElement(name = "ExchangeAirSegment")
public class ExchangeAirSegment {

    /**
     * An Air marketable travel segment.
     * 
     */
    @XmlElement(name = "AirSegment", required = true)
    protected TypeBaseAirSegment airSegment;
    /**
     * Requests cabin class (First, Business and Economy, etc.) as supported by the provider or supplier.
     * 
     */
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected CabinClass cabinClass;
    /**
     * The fare basis code to be used for exchange of
     *                         this segment.
     * 
     */
    @XmlAttribute(name = "FareBasisCode")
    protected String fareBasisCode;

    /**
     * An Air marketable travel segment.
     * 
     * @return
     *     possible object is
     *     {@link TypeBaseAirSegment }
     *     
     */
    public TypeBaseAirSegment getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBaseAirSegment }
     *     
     * @see #getAirSegment()
     */
    public void setAirSegment(TypeBaseAirSegment value) {
        this.airSegment = value;
    }

    /**
     * Requests cabin class (First, Business and Economy, etc.) as supported by the provider or supplier.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * The fare basis code to be used for exchange of
     *                         this segment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisCode()
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

}
