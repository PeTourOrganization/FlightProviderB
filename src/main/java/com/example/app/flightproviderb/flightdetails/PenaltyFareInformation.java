
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
 *         <element name="PenaltyInfo" type="{http://www.travelport.com/schema/air_v54_0}typeFarePenalty" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProhibitPenaltyFares" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "penaltyInfo"
})
@XmlRootElement(name = "PenaltyFareInformation")
public class PenaltyFareInformation {

    /**
     * Penalty Limit if requested.
     * 
     */
    @XmlElement(name = "PenaltyInfo")
    protected TypeFarePenalty penaltyInfo;
    /**
     * Indicates whether user wants penalty
     *                         fares to be returned.
     * 
     */
    @XmlAttribute(name = "ProhibitPenaltyFares", required = true)
    protected boolean prohibitPenaltyFares;

    /**
     * Penalty Limit if requested.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getPenaltyInfo() {
        return penaltyInfo;
    }

    /**
     * Sets the value of the penaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     * @see #getPenaltyInfo()
     */
    public void setPenaltyInfo(TypeFarePenalty value) {
        this.penaltyInfo = value;
    }

    /**
     * Indicates whether user wants penalty
     *                         fares to be returned.
     * 
     */
    public boolean isProhibitPenaltyFares() {
        return prohibitPenaltyFares;
    }

    /**
     * Sets the value of the prohibitPenaltyFares property.
     * 
     */
    public void setProhibitPenaltyFares(boolean value) {
        this.prohibitPenaltyFares = value;
    }

}
