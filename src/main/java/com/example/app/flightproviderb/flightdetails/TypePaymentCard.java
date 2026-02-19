
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Container for all credit and debit card
 *                 information.
 * 
 * <p>Java class for typePaymentCard complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typePaymentCard">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber" minOccurs="0"/>
 *         <element name="BillingAddress" type="{http://www.travelport.com/schema/common_v54_0}typeStructuredAddress" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Type" type="{http://www.travelport.com/schema/common_v54_0}typeCardMerchantType" />
 *       <attribute name="Number" type="{http://www.travelport.com/schema/common_v54_0}typeCreditCardNumber" />
 *       <attribute name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" />
 *       <attribute name="Name">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CVV">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="4"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ApprovalCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="16"/>
 *             <minLength value="1"/>
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
@XmlType(name = "typePaymentCard", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "phoneNumber",
    "billingAddress"
})
@XmlSeeAlso({
    DebitCard.class,
    TypeCreditCardType.class
})
public class TypePaymentCard {

    /**
     * Consists of type (office, home, fax), location (city code), the country code, the number, and an extension.
     * 
     */
    @XmlElement(name = "PhoneNumber")
    protected PhoneNumber phoneNumber;
    /**
     * The address to where the billing statements
     *                         for this card are sent. Used for address verification purposes.
     * 
     */
    @XmlElement(name = "BillingAddress")
    protected TypeStructuredAddress billingAddress;
    /**
     * The 2 letter credit/ debit card type.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Number")
    protected String number;
    /**
     * The Expiration date of this card in YYYY-MM format.
     * 
     */
    @XmlAttribute(name = "ExpDate")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar expDate;
    /**
     * The name as it appears on the card.
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * Card Verification Code
     * 
     */
    @XmlAttribute(name = "CVV")
    protected String cvv;
    /**
     * This code is required for an authorization process from the Credit Card company directly,required for some of the CCH carriers.This attribute is also used for EMD retrieve and issuance transactions.
     * 
     */
    @XmlAttribute(name = "ApprovalCode")
    protected String approvalCode;

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
     * The address to where the billing statements
     *                         for this card are sent. Used for address verification purposes.
     * 
     * @return
     *     possible object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public TypeStructuredAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStructuredAddress }
     *     
     * @see #getBillingAddress()
     */
    public void setBillingAddress(TypeStructuredAddress value) {
        this.billingAddress = value;
    }

    /**
     * The 2 letter credit/ debit card type.
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
     * The Expiration date of this card in YYYY-MM format.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExpDate()
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * The name as it appears on the card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Card Verification Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCVV()
     */
    public void setCVV(String value) {
        this.cvv = value;
    }

    /**
     * This code is required for an authorization process from the Credit Card company directly,required for some of the CCH carriers.This attribute is also used for EMD retrieve and issuance transactions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApprovalCode()
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

}
