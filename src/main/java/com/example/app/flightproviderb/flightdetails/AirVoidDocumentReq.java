
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}VoidDocumentInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ShowETR" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="ProviderLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ValidateSpanishResidency" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "voidDocumentInfo"
})
@XmlRootElement(name = "AirVoidDocumentReq")
public class AirVoidDocumentReq
    extends BaseReq
{

    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode")
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * Provider: 1G,1V-All tickets that belong to this PNR must be enumerated here. Voiding only some tickets of a multi-ticket PNR not currently supported.
     * 
     */
    @XmlElement(name = "VoidDocumentInfo")
    protected List<VoidDocumentInfo> voidDocumentInfo;
    /**
     * Provider: 1G,1V-If set as true, response will display the detailed ETR for successfully voided E-Tickets.
     * 
     */
    @XmlAttribute(name = "ShowETR")
    protected Boolean showETR;
    /**
     * Provider: 1G,1V-Provider code of a specific host.
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * Provider: 1G,1V-Contains the locator of the host reservation.
     * 
     */
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    /**
     * Provider: 1G - If set as true, Spanish Residency will be validated for
     *                                 Provisioned Customers.
     * 
     */
    @XmlAttribute(name = "ValidateSpanishResidency")
    protected Boolean validateSpanishResidency;

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     * @see #getAirReservationLocatorCode()
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Provider: 1G,1V-All tickets that belong to this PNR must be enumerated here. Voiding only some tickets of a multi-ticket PNR not currently supported.
     * 
     * Gets the value of the voidDocumentInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voidDocumentInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVoidDocumentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoidDocumentInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the voidDocumentInfo property.
     */
    public List<VoidDocumentInfo> getVoidDocumentInfo() {
        if (voidDocumentInfo == null) {
            voidDocumentInfo = new ArrayList<>();
        }
        return this.voidDocumentInfo;
    }

    /**
     * Provider: 1G,1V-If set as true, response will display the detailed ETR for successfully voided E-Tickets.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowETR() {
        if (showETR == null) {
            return false;
        } else {
            return showETR;
        }
    }

    /**
     * Sets the value of the showETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShowETR()
     */
    public void setShowETR(Boolean value) {
        this.showETR = value;
    }

    /**
     * Provider: 1G,1V-Provider code of a specific host.
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
     * Provider: 1G,1V-Contains the locator of the host reservation.
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
     * Provider: 1G - If set as true, Spanish Residency will be validated for
     *                                 Provisioned Customers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValidateSpanishResidency() {
        if (validateSpanishResidency == null) {
            return false;
        } else {
            return validateSpanishResidency;
        }
    }

    /**
     * Sets the value of the validateSpanishResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isValidateSpanishResidency()
     */
    public void setValidateSpanishResidency(Boolean value) {
        this.validateSpanishResidency = value;
    }

}
