
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyCard" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PersonName" minOccurs="0"/>
 *         <element name="CreditsUsed" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="UsedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 <attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyCard",
    "personName",
    "creditsUsed"
})
@XmlRootElement(name = "RelatedTraveler")
public class RelatedTraveler {

    /**
     * Traveler loyalty card detail
     * 
     */
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<LoyaltyCard> loyaltyCard;
    /**
     * Traveler name detail
     * 
     */
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    /**
     * Traveler pre pay credit detail
     * 
     */
    @XmlElement(name = "CreditsUsed")
    protected RelatedTraveler.CreditsUsed creditsUsed;
    /**
     * Traveler status code(One of Marked for deletion,Lapsed,Terminated,Active,Inactive)
     * 
     */
    @XmlAttribute(name = "StatusCode")
    protected String statusCode;
    /**
     * Relation to the pre pay id. Example flight pass user
     * 
     */
    @XmlAttribute(name = "Relation")
    protected String relation;

    /**
     * Traveler loyalty card detail
     * 
     * Gets the value of the loyaltyCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the loyaltyCard property.
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<>();
        }
        return this.loyaltyCard;
    }

    /**
     * Traveler name detail
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     * @see #getPersonName()
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Traveler pre pay credit detail
     * 
     * @return
     *     possible object is
     *     {@link RelatedTraveler.CreditsUsed }
     *     
     */
    public RelatedTraveler.CreditsUsed getCreditsUsed() {
        return creditsUsed;
    }

    /**
     * Sets the value of the creditsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTraveler.CreditsUsed }
     *     
     * @see #getCreditsUsed()
     */
    public void setCreditsUsed(RelatedTraveler.CreditsUsed value) {
        this.creditsUsed = value;
    }

    /**
     * Traveler status code(One of Marked for deletion,Lapsed,Terminated,Active,Inactive)
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
     * Relation to the pre pay id. Example flight pass user
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRelation()
     */
    public void setRelation(String value) {
        this.relation = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="UsedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       <attribute name="CurrencyCode" type="{http://www.travelport.com/schema/common_v54_0}typeCurrency" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreditsUsed {

        @XmlAttribute(name = "UsedCredit")
        protected BigDecimal usedCredit;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;

        /**
         * Gets the value of the usedCredit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUsedCredit() {
            return usedCredit;
        }

        /**
         * Sets the value of the usedCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUsedCredit(BigDecimal value) {
            this.usedCredit = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

    }

}
