
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Restriction data
 * 
 * <p>Java class for typeRestrictionData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeRestrictionData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" minOccurs="0"/>
 *         <element name="Percentage" type="{http://www.travelport.com/schema/common_v54_0}typePercentageWithDecimal" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRestrictionData", propOrder = {
    "amount",
    "percentage"
})
public class TypeRestrictionData {

    /**
     * Implies a flat amount to be adjusted.
     * 					Negative value implies a discount.
     * 
     */
    @XmlElement(name = "Amount")
    protected String amount;
    /**
     * Implies an adjustment to be made on
     * 					original price. Negative value implies a discount.
     * 
     */
    @XmlElement(name = "Percentage")
    protected String percentage;
    /**
     * Possible value for restriction name "Non-Refundable","Non-Changeable","Cancellation","Changes",
     * 			"Non-Refundable marked with No Show","No Show","Non-Changeable marked with No Show"
     * 
     */
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    /**
     * Possible value for restriction value "After Departure","Anytime" and "Before Departure"
     * 
     */
    @XmlAttribute(name = "Value")
    @XmlSchemaType(name = "anySimpleType")
    protected String value;

    /**
     * Implies a flat amount to be adjusted.
     * 					Negative value implies a discount.
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
     * Implies an adjustment to be made on
     * 					original price. Negative value implies a discount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPercentage()
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Possible value for restriction name "Non-Refundable","Non-Changeable","Cancellation","Changes",
     * 			"Non-Refundable marked with No Show","No Show","Non-Changeable marked with No Show"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Possible value for restriction value "After Departure","Anytime" and "Before Departure"
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
