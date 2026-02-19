
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrAmountPercent"/>
 *       <attribute name="FeeAppliesToInd">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Per-Person"/>
 *             <enumeration value="Per-MCO"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MCOFeeInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCOFeeInfo {

    /**
     * Indicates if PTA/TOD fee is for the entire MCO or is per person.
     * 
     */
    @XmlAttribute(name = "FeeAppliesToInd")
    protected String feeAppliesToInd;
    /**
     * The monetary amount.
     * 
     */
    @XmlAttribute(name = "Amount")
    protected String amount;
    /**
     * The percentage.
     * 
     */
    @XmlAttribute(name = "Percentage")
    protected String percentage;

    /**
     * Indicates if PTA/TOD fee is for the entire MCO or is per person.
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
     * @see #getFeeAppliesToInd()
     */
    public void setFeeAppliesToInd(String value) {
        this.feeAppliesToInd = value;
    }

    /**
     * The monetary amount.
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
     * The percentage.
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

}
