
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PrePayId"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PrePayCustomer" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PrePayAccount" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Affiliations" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AccountRelatedRules" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CreatorID" type="{http://www.travelport.com/schema/common_v54_0}typeCardNumber" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePayId",
    "prePayCustomer",
    "prePayAccount",
    "affiliations",
    "accountRelatedRules"
})
@XmlRootElement(name = "PrePayProfileInfo")
public class PrePayProfileInfo {

    /**
     * Pre pay unique identifier detail.This information block is returned both in list and  detail retrieve transactions.Example flight pass number
     * 
     */
    @XmlElement(name = "PrePayId", required = true)
    protected PrePayId prePayId;
    /**
     * Pre pay customer detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     */
    @XmlElement(name = "PrePayCustomer")
    protected PrePayCustomer prePayCustomer;
    /**
     * Pre pay account detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     */
    @XmlElement(name = "PrePayAccount")
    protected PrePayAccount prePayAccount;
    /**
     * Pre pay affiliations detail.This information block is returned only in detail retrieve transactions.
     * 
     */
    @XmlElement(name = "Affiliations")
    protected Affiliations affiliations;
    /**
     * Pre pay account related rules.This information block is returned only in detail retrieve transactions.
     * 
     */
    @XmlElement(name = "AccountRelatedRules")
    protected AccountRelatedRules accountRelatedRules;
    /**
     * Customer pre pay profile status code(One of Marked for deletion,Lapsed,Terminated,Active,Inactive)
     * 
     */
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    /**
     * This is the loyalty card number of the person who originally purchased/setup the flight pass
     * 
     */
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;

    /**
     * Pre pay unique identifier detail.This information block is returned both in list and  detail retrieve transactions.Example flight pass number
     * 
     * @return
     *     possible object is
     *     {@link PrePayId }
     *     
     */
    public PrePayId getPrePayId() {
        return prePayId;
    }

    /**
     * Sets the value of the prePayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayId }
     *     
     * @see #getPrePayId()
     */
    public void setPrePayId(PrePayId value) {
        this.prePayId = value;
    }

    /**
     * Pre pay customer detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayCustomer }
     *     
     */
    public PrePayCustomer getPrePayCustomer() {
        return prePayCustomer;
    }

    /**
     * Sets the value of the prePayCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayCustomer }
     *     
     * @see #getPrePayCustomer()
     */
    public void setPrePayCustomer(PrePayCustomer value) {
        this.prePayCustomer = value;
    }

    /**
     * Pre pay account detail.This information block is returned both in list and  detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link PrePayAccount }
     *     
     */
    public PrePayAccount getPrePayAccount() {
        return prePayAccount;
    }

    /**
     * Sets the value of the prePayAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayAccount }
     *     
     * @see #getPrePayAccount()
     */
    public void setPrePayAccount(PrePayAccount value) {
        this.prePayAccount = value;
    }

    /**
     * Pre pay affiliations detail.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link Affiliations }
     *     
     */
    public Affiliations getAffiliations() {
        return affiliations;
    }

    /**
     * Sets the value of the affiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliations }
     *     
     * @see #getAffiliations()
     */
    public void setAffiliations(Affiliations value) {
        this.affiliations = value;
    }

    /**
     * Pre pay account related rules.This information block is returned only in detail retrieve transactions.
     * 
     * @return
     *     possible object is
     *     {@link AccountRelatedRules }
     *     
     */
    public AccountRelatedRules getAccountRelatedRules() {
        return accountRelatedRules;
    }

    /**
     * Sets the value of the accountRelatedRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRelatedRules }
     *     
     * @see #getAccountRelatedRules()
     */
    public void setAccountRelatedRules(AccountRelatedRules value) {
        this.accountRelatedRules = value;
    }

    /**
     * Customer pre pay profile status code(One of Marked for deletion,Lapsed,Terminated,Active,Inactive)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusCode()
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * This is the loyalty card number of the person who originally purchased/setup the flight pass
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreatorID()
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

}
