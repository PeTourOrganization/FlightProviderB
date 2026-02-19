
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
 *       <attribute name="AppliedOn" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeAdjustmentTarget" />
 *       <attribute name="AdjustmentType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeAdjustmentType" />
 *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="PassengerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TicketDesignator" type="{http://www.travelport.com/schema/air_v54_0}typeTicketDesignator" />
 *       <attribute name="FareType" type="{http://www.travelport.com/schema/air_v54_0}typeFareTypeCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ManualFareAdjustment")
public class ManualFareAdjustment {

    /**
     * Represents pricing component upon which manual increment/discount to be applied. Presently supported values are Base and Total. Other is present as a future place holder but presently no request processing logic is available for value Other
     * 
     */
    @XmlAttribute(name = "AppliedOn", required = true)
    protected TypeAdjustmentTarget appliedOn;
    /**
     * Represents process used for applying manual discount/increment. Presently supported values are Flat, Percentage.
     * 
     */
    @XmlAttribute(name = "AdjustmentType", required = true)
    protected TypeAdjustmentType adjustmentType;
    /**
     * Represents value of increment/discount applied. Negative value is considered as discount whereas positive value represents increment
     * 
     */
    @XmlAttribute(name = "Value", required = true)
    protected BigDecimal value;
    /**
     * Represents passenger association.
     * 
     */
    @XmlAttribute(name = "PassengerRef")
    protected String passengerRef;
    /**
     * Providers: 1p
     * 
     */
    @XmlAttribute(name = "TicketDesignator")
    protected String ticketDesignator;
    /**
     * Providers: 1p
     * 
     */
    @XmlAttribute(name = "FareType")
    protected String fareType;

    /**
     * Represents pricing component upon which manual increment/discount to be applied. Presently supported values are Base and Total. Other is present as a future place holder but presently no request processing logic is available for value Other
     * 
     * @return
     *     possible object is
     *     {@link TypeAdjustmentTarget }
     *     
     */
    public TypeAdjustmentTarget getAppliedOn() {
        return appliedOn;
    }

    /**
     * Sets the value of the appliedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAdjustmentTarget }
     *     
     * @see #getAppliedOn()
     */
    public void setAppliedOn(TypeAdjustmentTarget value) {
        this.appliedOn = value;
    }

    /**
     * Represents process used for applying manual discount/increment. Presently supported values are Flat, Percentage.
     * 
     * @return
     *     possible object is
     *     {@link TypeAdjustmentType }
     *     
     */
    public TypeAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAdjustmentType }
     *     
     * @see #getAdjustmentType()
     */
    public void setAdjustmentType(TypeAdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * Represents value of increment/discount applied. Negative value is considered as discount whereas positive value represents increment
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
     * Represents passenger association.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerRef() {
        return passengerRef;
    }

    /**
     * Sets the value of the passengerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassengerRef()
     */
    public void setPassengerRef(String value) {
        this.passengerRef = value;
    }

    /**
     * Providers: 1p
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketDesignator()
     */
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
    }

    /**
     * Providers: 1p
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareType()
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

}
