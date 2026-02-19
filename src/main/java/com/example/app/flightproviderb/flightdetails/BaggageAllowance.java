
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="MaxWeight" type="{http://www.travelport.com/schema/air_v54_0}typeWeight" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberOfPieces",
    "maxWeight"
})
@XmlRootElement(name = "BaggageAllowance")
public class BaggageAllowance {

    @XmlElement(name = "NumberOfPieces")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "MaxWeight")
    protected TypeWeight maxWeight;

    /**
     * Gets the value of the numberOfPieces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Sets the value of the numberOfPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPieces(BigInteger value) {
        this.numberOfPieces = value;
    }

    /**
     * Gets the value of the maxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link TypeWeight }
     *     
     */
    public TypeWeight getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets the value of the maxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWeight }
     *     
     */
    public void setMaxWeight(TypeWeight value) {
        this.maxWeight = value;
    }

}
