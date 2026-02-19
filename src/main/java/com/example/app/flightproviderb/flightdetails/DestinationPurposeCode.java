
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
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeDestinationCode" />
 *       <attribute name="Purpose" use="required" type="{http://www.travelport.com/schema/air_v54_0}typePurposeCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DestinationPurposeCode")
public class DestinationPurposeCode {

    @XmlAttribute(name = "Destination", required = true)
    protected TypeDestinationCode destination;
    @XmlAttribute(name = "Purpose", required = true)
    protected TypePurposeCode purpose;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDestinationCode }
     *     
     */
    public TypeDestinationCode getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDestinationCode }
     *     
     */
    public void setDestination(TypeDestinationCode value) {
        this.destination = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link TypePurposeCode }
     *     
     */
    public TypePurposeCode getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePurposeCode }
     *     
     */
    public void setPurpose(TypePurposeCode value) {
        this.purpose = value;
    }

}
