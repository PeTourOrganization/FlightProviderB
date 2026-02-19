
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
 *       <attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="DiscountMethod" type="{http://www.travelport.com/schema/air_v54_0}typeFareDiscount" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AirFareDiscount")
public class AirFareDiscount {

    @XmlAttribute(name = "Percentage")
    protected Double percentage;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "DiscountMethod")
    protected TypeFareDiscount discountMethod;

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentage(Double value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the amount property.
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
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the discountMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareDiscount }
     *     
     */
    public TypeFareDiscount getDiscountMethod() {
        return discountMethod;
    }

    /**
     * Sets the value of the discountMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareDiscount }
     *     
     */
    public void setDiscountMethod(TypeFareDiscount value) {
        this.discountMethod = value;
    }

}
