
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="NegotiatedRateCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v54_0")
public class CorporateDiscountID {

    @XmlValue
    protected String value;
    /**
     * When set to true,
     *                             the data in the CorporateDiscountID is a negotiated rate code.
     *                             Otherwise, this data is a Corporate Discount ID rate.
     * 
     */
    @XmlAttribute(name = "NegotiatedRateCode")
    protected Boolean negotiatedRateCode;

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
     * When set to true,
     *                             the data in the CorporateDiscountID is a negotiated rate code.
     *                             Otherwise, this data is a Corporate Discount ID rate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedRateCode() {
        return negotiatedRateCode;
    }

    /**
     * Sets the value of the negotiatedRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNegotiatedRateCode()
     */
    public void setNegotiatedRateCode(Boolean value) {
        this.negotiatedRateCode = value;
    }

}
