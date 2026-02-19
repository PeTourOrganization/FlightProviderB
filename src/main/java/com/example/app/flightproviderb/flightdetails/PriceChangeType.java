
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Indicates a price change is found in Fare Control Manager
 * 
 * <p>Java class for PriceChangeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceChangeType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceChangeType", propOrder = {
    "value"
})
public class PriceChangeType {

    @XmlValue
    protected String value;
    /**
     * Contains the currency and amount information.  
     *                         Assume the amount is added unless a hyphen is present to indicate subtraction.
     * 
     */
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    /**
     * Contains carrier code information
     * 
     */
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    /**
     * Contains segment reference information
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Contains the currency and amount information.  
     *                         Assume the amount is added unless a hyphen is present to indicate subtraction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAmount()
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Contains carrier code information
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
     * Contains segment reference information
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSegmentRef()
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

}
