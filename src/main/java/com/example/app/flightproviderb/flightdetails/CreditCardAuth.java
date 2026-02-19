
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
 *       <attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TransId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Number" type="{http://www.travelport.com/schema/common_v54_0}typeCreditCardNumber" />
 *       <attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AuthResultCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AVSResultCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FormOfPaymentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v54_0")
public class CreditCardAuth {

    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "PaymentRef")
    protected String paymentRef;
    /**
     * The transaction id from the credit processing system
     * 
     */
    @XmlAttribute(name = "TransId")
    protected String transId;
    @XmlAttribute(name = "Number")
    protected String number;
    /**
     * The amount that was authorized.
     * 
     */
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    /**
     * The authorization code to confirm card acceptance
     * 
     */
    @XmlAttribute(name = "AuthCode")
    protected String authCode;
    /**
     * The result code of the authorization command.
     * 
     */
    @XmlAttribute(name = "AuthResultCode", required = true)
    protected String authResultCode;
    /**
     * The address verification result code (if AVS was requested)
     * 
     */
    @XmlAttribute(name = "AVSResultCode")
    protected String avsResultCode;
    /**
     * The message explains the result of the authorization command.
     * 
     */
    @XmlAttribute(name = "Message")
    protected String message;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "FormOfPaymentRef")
    protected String formOfPaymentRef;

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
     * Gets the value of the paymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * The transaction id from the credit processing system
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransId()
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * The amount that was authorized.
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
     * The authorization code to confirm card acceptance
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuthCode()
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * The result code of the authorization command.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthResultCode() {
        return authResultCode;
    }

    /**
     * Sets the value of the authResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuthResultCode()
     */
    public void setAuthResultCode(String value) {
        this.authResultCode = value;
    }

    /**
     * The address verification result code (if AVS was requested)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSResultCode() {
        return avsResultCode;
    }

    /**
     * Sets the value of the avsResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAVSResultCode()
     */
    public void setAVSResultCode(String value) {
        this.avsResultCode = value;
    }

    /**
     * The message explains the result of the authorization command.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessage()
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the formOfPaymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfPaymentRef(String value) {
        this.formOfPaymentRef = value;
    }

}
