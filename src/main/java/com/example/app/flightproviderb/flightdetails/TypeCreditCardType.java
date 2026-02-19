
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCreditCardType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeCreditCardType">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typePaymentCard">
 *       <attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AcceptanceOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ThirdPartyPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BankCountryCode" type="{http://www.travelport.com/schema/common_v54_0}typeCountry" />
 *       <attribute name="BankStateCode" type="{http://www.travelport.com/schema/common_v54_0}typeState" />
 *       <attribute name="Enett" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeCreditCardType", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    CreditCard.class
})
public class TypeCreditCardType
    extends TypePaymentCard
{

    /**
     * Used for American Express (AX) and other credit cards, e.g., Visa (VI) and Master card (CA), that allow Extended Payment, subject to the BSP market rule.
     * 
     */
    @XmlAttribute(name = "ExtendedPayment")
    protected String extendedPayment;
    /**
     * Agencies use this to pass the traveler information to the credit card company.
     * 
     */
    @XmlAttribute(name = "CustomerReference")
    protected String customerReference;
    /**
     * Override airline restriction on the credit card.
     * 
     */
    @XmlAttribute(name = "AcceptanceOverride")
    protected Boolean acceptanceOverride;
    /**
     * If true, this indicates that the credit card holder is not one of the passengers.
     * 
     */
    @XmlAttribute(name = "ThirdPartyPayment")
    protected Boolean thirdPartyPayment;
    /**
     * Issuing bank name for this credit card
     * 
     */
    @XmlAttribute(name = "BankName")
    protected String bankName;
    /**
     * ISO Country code associated with the issuing bank
     * 
     */
    @XmlAttribute(name = "BankCountryCode")
    protected String bankCountryCode;
    /**
     * State code associated with the issuing bank.
     * 
     */
    @XmlAttribute(name = "BankStateCode")
    protected String bankStateCode;
    /**
     * Acceptable values are true or false. If set to true it will denote that the credit card used has been issued through Enett. For all other credit card payments this value will be set to false.
     * 
     */
    @XmlAttribute(name = "Enett")
    protected Boolean enett;

    /**
     * Used for American Express (AX) and other credit cards, e.g., Visa (VI) and Master card (CA), that allow Extended Payment, subject to the BSP market rule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedPayment() {
        return extendedPayment;
    }

    /**
     * Sets the value of the extendedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExtendedPayment()
     */
    public void setExtendedPayment(String value) {
        this.extendedPayment = value;
    }

    /**
     * Agencies use this to pass the traveler information to the credit card company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCustomerReference()
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Override airline restriction on the credit card.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptanceOverride() {
        return acceptanceOverride;
    }

    /**
     * Sets the value of the acceptanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAcceptanceOverride()
     */
    public void setAcceptanceOverride(Boolean value) {
        this.acceptanceOverride = value;
    }

    /**
     * If true, this indicates that the credit card holder is not one of the passengers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isThirdPartyPayment() {
        if (thirdPartyPayment == null) {
            return false;
        } else {
            return thirdPartyPayment;
        }
    }

    /**
     * Sets the value of the thirdPartyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isThirdPartyPayment()
     */
    public void setThirdPartyPayment(Boolean value) {
        this.thirdPartyPayment = value;
    }

    /**
     * Issuing bank name for this credit card
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankName()
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * ISO Country code associated with the issuing bank
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryCode() {
        return bankCountryCode;
    }

    /**
     * Sets the value of the bankCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankCountryCode()
     */
    public void setBankCountryCode(String value) {
        this.bankCountryCode = value;
    }

    /**
     * State code associated with the issuing bank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankStateCode() {
        return bankStateCode;
    }

    /**
     * Sets the value of the bankStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankStateCode()
     */
    public void setBankStateCode(String value) {
        this.bankStateCode = value;
    }

    /**
     * Acceptable values are true or false. If set to true it will denote that the credit card used has been issued through Enett. For all other credit card payments this value will be set to false.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnett() {
        if (enett == null) {
            return false;
        } else {
            return enett;
        }
    }

    /**
     * Sets the value of the enett property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isEnett()
     */
    public void setEnett(Boolean value) {
        this.enett = value;
    }

}
