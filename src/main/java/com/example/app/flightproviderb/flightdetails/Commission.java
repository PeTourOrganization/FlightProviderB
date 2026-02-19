
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
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Level" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCommissionLevel" />
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCommissionType" />
 *       <attribute name="Modifier" type="{http://www.travelport.com/schema/common_v54_0}typeCommissionModifier" />
 *       <attribute name="Amount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Value">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="15"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Percentage" type="{http://www.travelport.com/schema/common_v54_0}typePercentageWithDecimal" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CommissionOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Commission {

    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The commission percentage level.
     * 
     */
    @XmlAttribute(name = "Level", required = true)
    protected TypeCommissionLevel level;
    /**
     * The commission type.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypeCommissionType type;
    /**
     * Optional commission modifier.
     * 
     */
    @XmlAttribute(name = "Modifier")
    protected TypeCommissionModifier modifier;
    /**
     * The monetary amount of the commission.
     * 
     */
    @XmlAttribute(name = "Amount")
    protected String amount;
    /**
     * Contains alphanumeric or alpha characters intended as 1G Value Code as applicable by BSP of client.
     * 
     */
    @XmlAttribute(name = "Value")
    protected String value;
    /**
     * The percent of the commission.
     * 
     */
    @XmlAttribute(name = "Percentage")
    protected String percentage;
    /**
     * A reference to a passenger.
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    /**
     * This is enabled to override CAT-35 commission error during air ticketing. PROVIDER SUPPORTED:Worldspan,Galileo
     * 
     */
    @XmlAttribute(name = "CommissionOverride")
    protected Boolean commissionOverride;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * The commission percentage level.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommissionLevel }
     *     
     */
    public TypeCommissionLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommissionLevel }
     *     
     * @see #getLevel()
     */
    public void setLevel(TypeCommissionLevel value) {
        this.level = value;
    }

    /**
     * The commission type.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommissionType }
     *     
     */
    public TypeCommissionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommissionType }
     *     
     * @see #getType()
     */
    public void setType(TypeCommissionType value) {
        this.type = value;
    }

    /**
     * Optional commission modifier.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommissionModifier }
     *     
     */
    public TypeCommissionModifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommissionModifier }
     *     
     * @see #getModifier()
     */
    public void setModifier(TypeCommissionModifier value) {
        this.modifier = value;
    }

    /**
     * The monetary amount of the commission.
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
     * Contains alphanumeric or alpha characters intended as 1G Value Code as applicable by BSP of client.
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

    /**
     * The percent of the commission.
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
     * A reference to a passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * This is enabled to override CAT-35 commission error during air ticketing. PROVIDER SUPPORTED:Worldspan,Galileo
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCommissionOverride() {
        if (commissionOverride == null) {
            return false;
        } else {
            return commissionOverride;
        }
    }

    /**
     * Sets the value of the commissionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCommissionOverride()
     */
    public void setCommissionOverride(Boolean value) {
        this.commissionOverride = value;
    }

}
