
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="FeeAppliesToInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FeeTypeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FeeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "feeAppliesToInd",
    "feeTypeInd",
    "feeValue"
})
@XmlRootElement(name = "PTATODFee", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PTATODFee {

    @XmlElement(name = "FeeAppliesToInd", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String feeAppliesToInd;
    @XmlElement(name = "FeeTypeInd", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String feeTypeInd;
    @XmlElement(name = "FeeValue", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String feeValue;

    /**
     * Gets the value of the feeAppliesToInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAppliesToInd() {
        return feeAppliesToInd;
    }

    /**
     * Sets the value of the feeAppliesToInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAppliesToInd(String value) {
        this.feeAppliesToInd = value;
    }

    /**
     * Gets the value of the feeTypeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeTypeInd() {
        return feeTypeInd;
    }

    /**
     * Sets the value of the feeTypeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeTypeInd(String value) {
        this.feeTypeInd = value;
    }

    /**
     * Gets the value of the feeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeValue() {
        return feeValue;
    }

    /**
     * Sets the value of the feeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeValue(String value) {
        this.feeValue = value;
    }

}
