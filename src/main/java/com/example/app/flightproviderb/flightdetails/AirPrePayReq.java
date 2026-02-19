
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *       <choice>
 *         <element name="ListSearch">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice minOccurs="0">
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}PersonNameSearch"/>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyCard" maxOccurs="999"/>
 *                 </choice>
 *                 <attribute name="StartFromResult" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeStartFromResult" />
 *                 <attribute name="MaxResults" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMaxResults" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PrePayRetrieve">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Id" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCardNumber" />
 *                 <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listSearch",
    "prePayRetrieve"
})
@XmlRootElement(name = "AirPrePayReq")
public class AirPrePayReq
    extends BaseReq
{

    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "ListSearch")
    protected AirPrePayReq.ListSearch listSearch;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "PrePayRetrieve")
    protected AirPrePayReq.PrePayRetrieve prePayRetrieve;

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirPrePayReq.ListSearch }
     *     
     */
    public AirPrePayReq.ListSearch getListSearch() {
        return listSearch;
    }

    /**
     * Sets the value of the listSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPrePayReq.ListSearch }
     *     
     * @see #getListSearch()
     */
    public void setListSearch(AirPrePayReq.ListSearch value) {
        this.listSearch = value;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirPrePayReq.PrePayRetrieve }
     *     
     */
    public AirPrePayReq.PrePayRetrieve getPrePayRetrieve() {
        return prePayRetrieve;
    }

    /**
     * Sets the value of the prePayRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPrePayReq.PrePayRetrieve }
     *     
     * @see #getPrePayRetrieve()
     */
    public void setPrePayRetrieve(AirPrePayReq.PrePayRetrieve value) {
        this.prePayRetrieve = value;
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
     *       <choice minOccurs="0">
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}PersonNameSearch"/>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}LoyaltyCard" maxOccurs="999"/>
     *       </choice>
     *       <attribute name="StartFromResult" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeStartFromResult" />
     *       <attribute name="MaxResults" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMaxResults" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "personNameSearch",
        "loyaltyCard"
    })
    public static class ListSearch {

        /**
         * Customer name detail for searching flight pass content.
         * 
         */
        @XmlElement(name = "PersonNameSearch")
        protected PersonNameSearch personNameSearch;
        /**
         * Customer loyalty card for searching flight pass content.
         * 
         */
        @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected List<LoyaltyCard> loyaltyCard;
        /**
         * Start index of the section of flight pass numbers that is being requested.
         * 
         */
        @XmlAttribute(name = "StartFromResult", required = true)
        protected BigInteger startFromResult;
        /**
         * Max Number of Flight Passes being requested for.
         * 
         */
        @XmlAttribute(name = "MaxResults", required = true)
        protected int maxResults;

        /**
         * Customer name detail for searching flight pass content.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameSearch }
         *     
         */
        public PersonNameSearch getPersonNameSearch() {
            return personNameSearch;
        }

        /**
         * Sets the value of the personNameSearch property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameSearch }
         *     
         * @see #getPersonNameSearch()
         */
        public void setPersonNameSearch(PersonNameSearch value) {
            this.personNameSearch = value;
        }

        /**
         * Customer loyalty card for searching flight pass content.
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
         * Start index of the section of flight pass numbers that is being requested.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStartFromResult() {
            return startFromResult;
        }

        /**
         * Sets the value of the startFromResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getStartFromResult()
         */
        public void setStartFromResult(BigInteger value) {
            this.startFromResult = value;
        }

        /**
         * Max Number of Flight Passes being requested for.
         * 
         */
        public int getMaxResults() {
            return maxResults;
        }

        /**
         * Sets the value of the maxResults property.
         * 
         */
        public void setMaxResults(int value) {
            this.maxResults = value;
        }

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
     *       <attribute name="Id" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCardNumber" />
     *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrePayRetrieve {

        /**
         * Pre pay id to retrieved,example flight pass  number
         * 
         */
        @XmlAttribute(name = "Id", required = true)
        protected String id;
        /**
         * Pre pay id type,example 'FlightPass'
         * 
         */
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Pre pay id to retrieved,example flight pass  number
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getId()
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Pre pay id type,example 'FlightPass'
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

    }

}
