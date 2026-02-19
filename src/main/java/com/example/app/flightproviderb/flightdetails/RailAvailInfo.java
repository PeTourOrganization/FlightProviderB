
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *       <attribute name="ClassCode" type="{http://www.travelport.com/schema/common_v54_0}typeRailClass" />
 *       <attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="CabinClass" type="{http://www.travelport.com/schema/common_v54_0}typeRailCabin" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailAvailInfo", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailAvailInfo {

    /**
     * A booking code or fare basis code or fare class.
     * 
     */
    @XmlAttribute(name = "ClassCode")
    protected String classCode;
    /**
     * Available fare basis code or fare class quantity.
     * 
     */
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    /**
     * The fare basis code or fare class for this fare.
     * 
     */
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;

    /**
     * A booking code or fare basis code or fare class.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getClassCode()
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Available fare basis code or fare class quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getQuantity()
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * The fare basis code or fare class for this fare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

}
