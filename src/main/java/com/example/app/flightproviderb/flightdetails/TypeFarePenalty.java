
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Penalty applicable on a Fare for change/
 *                 cancellation etc- expressed in both Money and Percentage.
 * 
 * <p>Java class for typeFarePenalty complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeFarePenalty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" minOccurs="0"/>
 *         <element name="Percentage" type="{http://www.travelport.com/schema/common_v54_0}typePercentageWithDecimal" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PenaltyApplies">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Anytime"/>
 *             <enumeration value="Before Departure"/>
 *             <enumeration value="After Departure"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NoShow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFarePenalty", propOrder = {
    "amount",
    "percentage"
})
public class TypeFarePenalty {

    /**
     * The penalty (if any) - expressed as the actual
     *                         amount of money. Both Amount and Percentage can be present.
     * 
     */
    @XmlElement(name = "Amount")
    protected String amount;
    /**
     * The penalty (if any) - expressed in
     *                         percentage. Both Amount and Percentage can be present.
     * 
     */
    @XmlElement(name = "Percentage")
    protected String percentage;
    @XmlAttribute(name = "PenaltyApplies")
    protected String penaltyApplies;
    /**
     * The No Show penalty (if any) to change/cancel the fare.
     * 
     */
    @XmlAttribute(name = "NoShow")
    protected Boolean noShow;

    /**
     * The penalty (if any) - expressed as the actual
     *                         amount of money. Both Amount and Percentage can be present.
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
     * The penalty (if any) - expressed in
     *                         percentage. Both Amount and Percentage can be present.
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
     * Gets the value of the penaltyApplies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyApplies() {
        return penaltyApplies;
    }

    /**
     * Sets the value of the penaltyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyApplies(String value) {
        this.penaltyApplies = value;
    }

    /**
     * The No Show penalty (if any) to change/cancel the fare.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShow() {
        return noShow;
    }

    /**
     * Sets the value of the noShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoShow()
     */
    public void setNoShow(Boolean value) {
        this.noShow = value;
    }

}
