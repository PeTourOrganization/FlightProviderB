
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProviderReservationSpecificInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeProviderReservationSpecificInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}OperatedBy" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationInfoRef" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ProviderReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeProviderReservationSpecificInfo", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "operatedBy",
    "providerReservationInfoRef"
})
public class TypeProviderReservationSpecificInfo {

    /**
     * Cross accrual carrier info
     * 
     */
    @XmlElement(name = "OperatedBy")
    protected List<OperatedBy> operatedBy;
    /**
     * Tagging provider reservation info with LoyaltyCard.
     * 
     */
    @XmlElement(name = "ProviderReservationInfoRef")
    protected ProviderReservationInfoRef providerReservationInfoRef;
    /**
     * If true means Loyalty card is applied at ProviderReservation level.
     * 
     */
    @XmlAttribute(name = "ProviderReservationLevel")
    protected Boolean providerReservationLevel;
    /**
     * If true means Loyalty card is applied at Universal Record Reservation level e.g. Hotel Reservation, Vehicle Reservation etc.
     * 
     */
    @XmlAttribute(name = "ReservationLevel")
    protected Boolean reservationLevel;

    /**
     * Cross accrual carrier info
     * 
     * Gets the value of the operatedBy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatedBy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatedBy }
     * </p>
     * 
     * 
     * @return
     *     The value of the operatedBy property.
     */
    public List<OperatedBy> getOperatedBy() {
        if (operatedBy == null) {
            operatedBy = new ArrayList<>();
        }
        return this.operatedBy;
    }

    /**
     * Tagging provider reservation info with LoyaltyCard.
     * 
     * @return
     *     possible object is
     *     {@link ProviderReservationInfoRef }
     *     
     */
    public ProviderReservationInfoRef getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderReservationInfoRef }
     *     
     * @see #getProviderReservationInfoRef()
     */
    public void setProviderReservationInfoRef(ProviderReservationInfoRef value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * If true means Loyalty card is applied at ProviderReservation level.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderReservationLevel() {
        return providerReservationLevel;
    }

    /**
     * Sets the value of the providerReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProviderReservationLevel()
     */
    public void setProviderReservationLevel(Boolean value) {
        this.providerReservationLevel = value;
    }

    /**
     * If true means Loyalty card is applied at Universal Record Reservation level e.g. Hotel Reservation, Vehicle Reservation etc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationLevel() {
        return reservationLevel;
    }

    /**
     * Sets the value of the reservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReservationLevel()
     */
    public void setReservationLevel(Boolean value) {
        this.reservationLevel = value;
    }

}
