
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFormOfPaymentPNRReference complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeFormOfPaymentPNRReference">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderReservationLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFormOfPaymentPNRReference", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TypeFormOfPaymentPNRReference {

    /**
     * Unique ID to identify a ProviderReservationInfo
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * It means that the form of payment is applied at ProviderReservation level.
     * 
     */
    @XmlAttribute(name = "ProviderReservationLevel")
    protected Boolean providerReservationLevel;

    /**
     * Unique ID to identify a ProviderReservationInfo
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
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * It means that the form of payment is applied at ProviderReservation level.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProviderReservationLevel() {
        if (providerReservationLevel == null) {
            return true;
        } else {
            return providerReservationLevel;
        }
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

}
