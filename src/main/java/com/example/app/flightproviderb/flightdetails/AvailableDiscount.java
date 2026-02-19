
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyProgram" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Percent" type="{http://www.travelport.com/schema/common_v54_0}typePercentageWithDecimal" />
 *       <attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DiscountQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyProgram"
})
@XmlRootElement(name = "AvailableDiscount")
public class AvailableDiscount {

    /**
     * Customer Loyalty Program Detail.
     * 
     */
    @XmlElement(name = "LoyaltyProgram", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<LoyaltyProgram> loyaltyProgram;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "Percent")
    protected String percent;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DiscountQualifier")
    protected String discountQualifier;

    /**
     * Customer Loyalty Program Detail.
     * 
     * Gets the value of the loyaltyProgram property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgram property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLoyaltyProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgram }
     * </p>
     * 
     * 
     * @return
     *     The value of the loyaltyProgram property.
     */
    public List<LoyaltyProgram> getLoyaltyProgram() {
        if (loyaltyProgram == null) {
            loyaltyProgram = new ArrayList<>();
        }
        return this.loyaltyProgram;
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
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the discountQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountQualifier() {
        return discountQualifier;
    }

    /**
     * Sets the value of the discountQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountQualifier(String value) {
        this.discountQualifier = value;
    }

}
