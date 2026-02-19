
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareStatusFailureInfo" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Code" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeFareStatusCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareStatusFailureInfo"
})
@XmlRootElement(name = "FareStatus")
public class FareStatus {

    /**
     * Denotes the failure reason of a particular fare.
     * 
     */
    @XmlElement(name = "FareStatusFailureInfo")
    protected FareStatusFailureInfo fareStatusFailureInfo;
    /**
     * The status of the fare.
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected TypeFareStatusCode code;

    /**
     * Denotes the failure reason of a particular fare.
     * 
     * @return
     *     possible object is
     *     {@link FareStatusFailureInfo }
     *     
     */
    public FareStatusFailureInfo getFareStatusFailureInfo() {
        return fareStatusFailureInfo;
    }

    /**
     * Sets the value of the fareStatusFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStatusFailureInfo }
     *     
     * @see #getFareStatusFailureInfo()
     */
    public void setFareStatusFailureInfo(FareStatusFailureInfo value) {
        this.fareStatusFailureInfo = value;
    }

    /**
     * The status of the fare.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareStatusCode }
     *     
     */
    public TypeFareStatusCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareStatusCode }
     *     
     * @see #getCode()
     */
    public void setCode(TypeFareStatusCode value) {
        this.code = value;
    }

}
