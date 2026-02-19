
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
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
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeAdjustmentType" />
 *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EMDCommission")
public class EMDCommission {

    /**
     * Type of the commission applied.One of Amount/Percentage
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypeAdjustmentType type;
    /**
     * Value of the commission applied for EMD issuance.Could represent amount or percentage depending on the type
     * 
     */
    @XmlAttribute(name = "Value", required = true)
    protected BigDecimal value;
    /**
     * Currency of the commission amount applied.Applicable only with type - Amount
     * 
     */
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;

    /**
     * Type of the commission applied.One of Amount/Percentage
     * 
     * @return
     *     possible object is
     *     {@link TypeAdjustmentType }
     *     
     */
    public TypeAdjustmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAdjustmentType }
     *     
     * @see #getType()
     */
    public void setType(TypeAdjustmentType value) {
        this.type = value;
    }

    /**
     * Value of the commission applied for EMD issuance.Could represent amount or percentage depending on the type
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getValue()
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Currency of the commission amount applied.Applicable only with type - Amount
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurrencyCode()
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
