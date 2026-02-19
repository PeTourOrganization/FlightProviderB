
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
 *       <attribute name="Name" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeBillingDetailsName" />
 *       <attribute name="DataType" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeBillingDetailsDataType" />
 *       <attribute name="MinLength" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MaxLength" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BillingDetailItem")
public class BillingDetailItem {

    /**
     * Detailed Billing Information Name(e.g
     *                         Personal ID, Account Number)
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected TypeBillingDetailsName name;
    /**
     * Detailed Billing Information DataType
     *                         (Alpha, Numeric, etc.)
     * 
     */
    @XmlAttribute(name = "DataType", required = true)
    protected TypeBillingDetailsDataType dataType;
    /**
     * Detailed Billing Information Minimum
     *                         Length.
     * 
     */
    @XmlAttribute(name = "MinLength", required = true)
    protected String minLength;
    /**
     * Detailed Billing Information Maximum
     *                         Length.
     * 
     */
    @XmlAttribute(name = "MaxLength", required = true)
    protected String maxLength;
    /**
     * Detailed Billing Information Value
     * 
     */
    @XmlAttribute(name = "Value")
    protected String value;

    /**
     * Detailed Billing Information Name(e.g
     *                         Personal ID, Account Number)
     * 
     * @return
     *     possible object is
     *     {@link TypeBillingDetailsName }
     *     
     */
    public TypeBillingDetailsName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBillingDetailsName }
     *     
     * @see #getName()
     */
    public void setName(TypeBillingDetailsName value) {
        this.name = value;
    }

    /**
     * Detailed Billing Information DataType
     *                         (Alpha, Numeric, etc.)
     * 
     * @return
     *     possible object is
     *     {@link TypeBillingDetailsDataType }
     *     
     */
    public TypeBillingDetailsDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBillingDetailsDataType }
     *     
     * @see #getDataType()
     */
    public void setDataType(TypeBillingDetailsDataType value) {
        this.dataType = value;
    }

    /**
     * Detailed Billing Information Minimum
     *                         Length.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMinLength()
     */
    public void setMinLength(String value) {
        this.minLength = value;
    }

    /**
     * Detailed Billing Information Maximum
     *                         Length.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaxLength()
     */
    public void setMaxLength(String value) {
        this.maxLength = value;
    }

    /**
     * Detailed Billing Information Value
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
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

}
