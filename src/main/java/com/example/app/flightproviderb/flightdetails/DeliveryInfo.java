
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
 *         <element name="ShippingAddress" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Email" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}GeneralRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationInfoRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SignatureRequired">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="10"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shippingAddress",
    "phoneNumber",
    "email",
    "generalRemark",
    "providerReservationInfoRef"
})
@XmlRootElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class DeliveryInfo {

    @XmlElement(name = "ShippingAddress", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected DeliveryInfo.ShippingAddress shippingAddress;
    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PhoneNumber phoneNumber;
    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     */
    @XmlElement(name = "Email", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Email email;
    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<GeneralRemark> generalRemark;
    /**
     * Tagging provider reservation info with Delivery Info.
     * 
     */
    @XmlElement(name = "ProviderReservationInfoRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ProviderReservationInfoRef> providerReservationInfoRef;
    /**
     * An arbitrary identifier to categorize this delivery info
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Indicates whether a signature shoud be required in order to make the delivery.
     * 
     */
    @XmlAttribute(name = "SignatureRequired")
    protected String signatureRequired;
    /**
     * The tracking number of the shipping company making the delivery.
     * 
     */
    @XmlAttribute(name = "TrackingNumber")
    protected String trackingNumber;

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInfo.ShippingAddress }
     *     
     */
    public DeliveryInfo.ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInfo.ShippingAddress }
     *     
     */
    public void setShippingAddress(DeliveryInfo.ShippingAddress value) {
        this.shippingAddress = value;
    }

    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     * @see #getPhoneNumber()
     */
    public void setPhoneNumber(PhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Container for an email address with a type specifier (max 128 chars)
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     * @see #getEmail()
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the generalRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the generalRemark property.
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<>();
        }
        return this.generalRemark;
    }

    /**
     * Tagging provider reservation info with Delivery Info.
     * 
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerReservationInfoRef property.
     */
    public List<ProviderReservationInfoRef> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * An arbitrary identifier to categorize this delivery info
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Indicates whether a signature shoud be required in order to make the delivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureRequired() {
        return signatureRequired;
    }

    /**
     * Sets the value of the signatureRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSignatureRequired()
     */
    public void setSignatureRequired(String value) {
        this.signatureRequired = value;
    }

    /**
     * The tracking number of the shipping company making the delivery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrackingNumber()
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShippingAddress
        extends TypeStructuredAddress
    {


    }

}
