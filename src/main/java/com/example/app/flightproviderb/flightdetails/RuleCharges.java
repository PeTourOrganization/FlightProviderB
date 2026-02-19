
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
 *       <attribute name="PenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DepartureStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="MoreRulesPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RuleCharges")
public class RuleCharges {

    @XmlAttribute(name = "PenaltyType")
    protected String penaltyType;
    @XmlAttribute(name = "DepartureStatus")
    protected String departureStatus;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    /**
     * If true, specifies that advance purchase
     *                         information will be present in fare rules.
     * 
     */
    @XmlAttribute(name = "MoreRulesPresent")
    protected Boolean moreRulesPresent;

    /**
     * Gets the value of the penaltyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyType() {
        return penaltyType;
    }

    /**
     * Sets the value of the penaltyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyType(String value) {
        this.penaltyType = value;
    }

    /**
     * Gets the value of the departureStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Sets the value of the departureStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureStatus(String value) {
        this.departureStatus = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * If true, specifies that advance purchase
     *                         information will be present in fare rules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRulesPresent() {
        return moreRulesPresent;
    }

    /**
     * Sets the value of the moreRulesPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMoreRulesPresent()
     */
    public void setMoreRulesPresent(Boolean value) {
        this.moreRulesPresent = value;
    }

}
