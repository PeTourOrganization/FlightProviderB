
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
 *       <choice>
 *         <element name="ProviderReservationLevel">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrCommissionRemark"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PassengerTypeLevel" maxOccurs="4">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrCommissionRemark"/>
 *                 <attribute name="TravelerType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationLevel",
    "passengerTypeLevel"
})
@XmlRootElement(name = "CommissionRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
public class CommissionRemark {

    /**
     * Specify commission which is applicable to
     * 							PNR level.
     * 
     */
    @XmlElement(name = "ProviderReservationLevel", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CommissionRemark.ProviderReservationLevel providerReservationLevel;
    /**
     * Specify commission which is applicable to
     * 							per PTC level.
     * 
     */
    @XmlElement(name = "PassengerTypeLevel", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<CommissionRemark.PassengerTypeLevel> passengerTypeLevel;
    /**
     * Key to be used for internal processing.
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Contains the Provider Code of the provider
     * 						for which this accounting remark is used
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     */
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     */
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Specify commission which is applicable to
     * 							PNR level.
     * 
     * @return
     *     possible object is
     *     {@link CommissionRemark.ProviderReservationLevel }
     *     
     */
    public CommissionRemark.ProviderReservationLevel getProviderReservationLevel() {
        return providerReservationLevel;
    }

    /**
     * Sets the value of the providerReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionRemark.ProviderReservationLevel }
     *     
     * @see #getProviderReservationLevel()
     */
    public void setProviderReservationLevel(CommissionRemark.ProviderReservationLevel value) {
        this.providerReservationLevel = value;
    }

    /**
     * Specify commission which is applicable to
     * 							per PTC level.
     * 
     * Gets the value of the passengerTypeLevel property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeLevel property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerTypeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionRemark.PassengerTypeLevel }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerTypeLevel property.
     */
    public List<CommissionRemark.PassengerTypeLevel> getPassengerTypeLevel() {
        if (passengerTypeLevel == null) {
            passengerTypeLevel = new ArrayList<>();
        }
        return this.passengerTypeLevel;
    }

    /**
     * Key to be used for internal processing.
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
     * Provider reservation reference key.
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
     * @see #getProviderReservationInfoRef()
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Contains the Provider Code of the provider
     * 						for which this accounting remark is used
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
     * This attribute is used to show the action results of an element. 
     *               Possible values are "A" (when elements have been added to the UR) and "M" (when existing elements have been modified). Response only.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     * @see #getElStat()
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * If a duplicate key is found where we are adding elements in some cases like URAdd, then instead of erroring out set this attribute to true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isKeyOverride()
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
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
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrCommissionRemark"/>
     *       <attribute name="TravelerType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerTypeLevel {

        @XmlAttribute(name = "TravelerType", required = true)
        protected String travelerType;
        /**
         * The monetary amount of the commission.
         * 
         */
        @XmlAttribute(name = "Amount")
        protected String amount;
        /**
         * The percent of the commission.
         * 
         */
        @XmlAttribute(name = "Percentage")
        protected String percentage;
        /**
         * Commission cap for the Airline.
         * 
         */
        @XmlAttribute(name = "CommissionCap")
        protected String commissionCap;

        /**
         * Gets the value of the travelerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerType() {
            return travelerType;
        }

        /**
         * Sets the value of the travelerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerType(String value) {
            this.travelerType = value;
        }

        /**
         * The monetary amount of the commission.
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
         * The percent of the commission.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPercentage()
         */
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Commission cap for the Airline.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionCap() {
            return commissionCap;
        }

        /**
         * Sets the value of the commissionCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCommissionCap()
         */
        public void setCommissionCap(String value) {
            this.commissionCap = value;
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
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrCommissionRemark"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProviderReservationLevel {

        /**
         * The monetary amount of the commission.
         * 
         */
        @XmlAttribute(name = "Amount")
        protected String amount;
        /**
         * The percent of the commission.
         * 
         */
        @XmlAttribute(name = "Percentage")
        protected String percentage;
        /**
         * Commission cap for the Airline.
         * 
         */
        @XmlAttribute(name = "CommissionCap")
        protected String commissionCap;

        /**
         * The monetary amount of the commission.
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
         * The percent of the commission.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPercentage()
         */
        public void setPercentage(String value) {
            this.percentage = value;
        }

        /**
         * Commission cap for the Airline.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionCap() {
            return commissionCap;
        }

        /**
         * Sets the value of the commissionCap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCommissionCap()
         */
        public void setCommissionCap(String value) {
            this.commissionCap = value;
        }

    }

}
