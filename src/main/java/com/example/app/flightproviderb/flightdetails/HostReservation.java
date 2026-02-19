
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
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="CarrierLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="ProviderLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderLocatorCode" />
 *       <attribute name="UniversalLocatorCode" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *       <attribute name="ETicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HostReservation")
public class HostReservation {

    /**
     * The carrier code (e.g. YX, UA, ...) that is
     *                         providing the merchandising
     * 
     */
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    /**
     * The locator code in the supplier system (also
     *                         could be defined as locator in the carrier host system).
     * 
     */
    @XmlAttribute(name = "CarrierLocatorCode", required = true)
    protected String carrierLocatorCode;
    /**
     * Contains the GDS or other provider code
     *                         of the entity actually housing the reservation. This is optional
     *                         when used on Merchandising Availability but required on
     *                         MerchandisingFulfillment.
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * Contains the locator of the reservation
     *                         actually housed in the provider.
     * 
     */
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;
    /**
     * The locator of the Universal Record, if one
     *                         exists.
     * 
     */
    @XmlAttribute(name = "UniversalLocatorCode")
    protected String universalLocatorCode;
    /**
     * An flag to indicate if ticket has been issued for the PNR.
     * 
     */
    @XmlAttribute(name = "ETicket")
    protected Boolean eTicket;

    /**
     * The carrier code (e.g. YX, UA, ...) that is
     *                         providing the merchandising
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * The locator code in the supplier system (also
     *                         could be defined as locator in the carrier host system).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierLocatorCode() {
        return carrierLocatorCode;
    }

    /**
     * Sets the value of the carrierLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierLocatorCode()
     */
    public void setCarrierLocatorCode(String value) {
        this.carrierLocatorCode = value;
    }

    /**
     * Contains the GDS or other provider code
     *                         of the entity actually housing the reservation. This is optional
     *                         when used on Merchandising Availability but required on
     *                         MerchandisingFulfillment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderCode()
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Contains the locator of the reservation
     *                         actually housed in the provider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderLocatorCode()
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * The locator of the Universal Record, if one
     *                         exists.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalLocatorCode() {
        return universalLocatorCode;
    }

    /**
     * Sets the value of the universalLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUniversalLocatorCode()
     */
    public void setUniversalLocatorCode(String value) {
        this.universalLocatorCode = value;
    }

    /**
     * An flag to indicate if ticket has been issued for the PNR.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isETicket() {
        if (eTicket == null) {
            return false;
        } else {
            return eTicket;
        }
    }

    /**
     * Sets the value of the eTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isETicket()
     */
    public void setETicket(Boolean value) {
        this.eTicket = value;
    }

}
