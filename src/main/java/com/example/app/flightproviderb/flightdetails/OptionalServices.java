
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
 *         <element name="OptionalServicesTotal" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
 *                 </sequence>
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalService" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}GroupedOptionInfo" maxOccurs="999" minOccurs="0"/>
 *         <element name="OptionalServiceRules" type="{http://www.travelport.com/schema/common_v54_0}ServiceRuleType" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalServicesTotal",
    "optionalService",
    "groupedOptionInfo",
    "optionalServiceRules"
})
@XmlRootElement(name = "OptionalServices")
public class OptionalServices {

    /**
     * The total fares, fees and taxes associated
     *                             with the Optional Services
     * 
     */
    @XmlElement(name = "OptionalServicesTotal")
    protected OptionalServices.OptionalServicesTotal optionalServicesTotal;
    @XmlElement(name = "OptionalService", required = true)
    protected List<OptionalService> optionalService;
    /**
     * Details about an unselected or "other" option when optional services are grouped together.
     * 
     */
    @XmlElement(name = "GroupedOptionInfo")
    protected List<GroupedOptionInfo> groupedOptionInfo;
    /**
     * Holds the rules for selecting the optional
     *                             service in the itinerary
     * 
     */
    @XmlElement(name = "OptionalServiceRules")
    protected List<ServiceRuleType> optionalServiceRules;

    /**
     * The total fares, fees and taxes associated
     *                             with the Optional Services
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices.OptionalServicesTotal }
     *     
     */
    public OptionalServices.OptionalServicesTotal getOptionalServicesTotal() {
        return optionalServicesTotal;
    }

    /**
     * Sets the value of the optionalServicesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices.OptionalServicesTotal }
     *     
     * @see #getOptionalServicesTotal()
     */
    public void setOptionalServicesTotal(OptionalServices.OptionalServicesTotal value) {
        this.optionalServicesTotal = value;
    }

    /**
     * Gets the value of the optionalService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOptionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalService }
     * </p>
     * 
     * 
     * @return
     *     The value of the optionalService property.
     */
    public List<OptionalService> getOptionalService() {
        if (optionalService == null) {
            optionalService = new ArrayList<>();
        }
        return this.optionalService;
    }

    /**
     * Details about an unselected or "other" option when optional services are grouped together.
     * 
     * Gets the value of the groupedOptionInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupedOptionInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGroupedOptionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupedOptionInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the groupedOptionInfo property.
     */
    public List<GroupedOptionInfo> getGroupedOptionInfo() {
        if (groupedOptionInfo == null) {
            groupedOptionInfo = new ArrayList<>();
        }
        return this.groupedOptionInfo;
    }

    /**
     * Holds the rules for selecting the optional
     *                             service in the itinerary
     * 
     * Gets the value of the optionalServiceRules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalServiceRules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOptionalServiceRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRuleType }
     * </p>
     * 
     * 
     * @return
     *     The value of the optionalServiceRules property.
     */
    public List<ServiceRuleType> getOptionalServiceRules() {
        if (optionalServiceRules == null) {
            optionalServiceRules = new ArrayList<>();
        }
        return this.optionalServiceRules;
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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}FeeInfo" maxOccurs="999" minOccurs="0"/>
     *       </sequence>
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrPrices"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxInfo",
        "feeInfo"
    })
    public static class OptionalServicesTotal {

        /**
         * The tax information for a
         * 
         */
        @XmlElement(name = "TaxInfo")
        protected List<TypeTaxInfo> taxInfo;
        /**
         * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
         * 
         */
        @XmlElement(name = "FeeInfo")
        protected List<TypeFeeInfo> feeInfo;
        /**
         * The total price for this entity including base price and all taxes.
         * 
         */
        @XmlAttribute(name = "TotalPrice")
        protected String totalPrice;
        /**
         * Represents the base price for this entity. This does not include any taxes or surcharges.
         * 
         */
        @XmlAttribute(name = "BasePrice")
        protected String basePrice;
        /**
         * The Converted total price in Default Currency for this entity including base price and all taxes.
         * 
         */
        @XmlAttribute(name = "ApproximateTotalPrice")
        protected String approximateTotalPrice;
        /**
         * The Converted base price in Default Currency for this entity. This does not include any taxes or surcharges.
         * 
         */
        @XmlAttribute(name = "ApproximateBasePrice")
        protected String approximateBasePrice;
        /**
         * Represents the base price in the related currency for this entity. This does not include any taxes or surcharges.
         * 
         */
        @XmlAttribute(name = "EquivalentBasePrice")
        protected String equivalentBasePrice;
        /**
         * The aggregated amount of all the taxes that are associated with this entity. See the associated TaxInfo array for a breakdown of the individual taxes.
         * 
         */
        @XmlAttribute(name = "Taxes")
        protected String taxes;
        /**
         * The aggregated amount of all the fees that are associated with this entity. See the associated FeeInfo array for a breakdown of the individual fees.
         * 
         */
        @XmlAttribute(name = "Fees")
        protected String fees;
        /**
         * The total cost for all optional services.
         * 
         */
        @XmlAttribute(name = "Services")
        protected String services;
        /**
         * The Converted tax amount in Default Currency.
         * 
         */
        @XmlAttribute(name = "ApproximateTaxes")
        protected String approximateTaxes;
        /**
         * The Converted fee amount in Default Currency.
         * 
         */
        @XmlAttribute(name = "ApproximateFees")
        protected String approximateFees;

        /**
         * The tax information for a
         * 
         * Gets the value of the taxInfo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInfo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getTaxInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeTaxInfo }
         * </p>
         * 
         * 
         * @return
         *     The value of the taxInfo property.
         */
        public List<TypeTaxInfo> getTaxInfo() {
            if (taxInfo == null) {
                taxInfo = new ArrayList<>();
            }
            return this.taxInfo;
        }

        /**
         * A generic type of fee for those charges which are incurred by the passenger, but not necessarily shown on tickets
         * 
         * Gets the value of the feeInfo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeInfo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFeeInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeFeeInfo }
         * </p>
         * 
         * 
         * @return
         *     The value of the feeInfo property.
         */
        public List<TypeFeeInfo> getFeeInfo() {
            if (feeInfo == null) {
                feeInfo = new ArrayList<>();
            }
            return this.feeInfo;
        }

        /**
         * The total price for this entity including base price and all taxes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalPrice() {
            return totalPrice;
        }

        /**
         * Sets the value of the totalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTotalPrice()
         */
        public void setTotalPrice(String value) {
            this.totalPrice = value;
        }

        /**
         * Represents the base price for this entity. This does not include any taxes or surcharges.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBasePrice() {
            return basePrice;
        }

        /**
         * Sets the value of the basePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBasePrice()
         */
        public void setBasePrice(String value) {
            this.basePrice = value;
        }

        /**
         * The Converted total price in Default Currency for this entity including base price and all taxes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateTotalPrice() {
            return approximateTotalPrice;
        }

        /**
         * Sets the value of the approximateTotalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApproximateTotalPrice()
         */
        public void setApproximateTotalPrice(String value) {
            this.approximateTotalPrice = value;
        }

        /**
         * The Converted base price in Default Currency for this entity. This does not include any taxes or surcharges.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateBasePrice() {
            return approximateBasePrice;
        }

        /**
         * Sets the value of the approximateBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApproximateBasePrice()
         */
        public void setApproximateBasePrice(String value) {
            this.approximateBasePrice = value;
        }

        /**
         * Represents the base price in the related currency for this entity. This does not include any taxes or surcharges.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquivalentBasePrice() {
            return equivalentBasePrice;
        }

        /**
         * Sets the value of the equivalentBasePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getEquivalentBasePrice()
         */
        public void setEquivalentBasePrice(String value) {
            this.equivalentBasePrice = value;
        }

        /**
         * The aggregated amount of all the taxes that are associated with this entity. See the associated TaxInfo array for a breakdown of the individual taxes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTaxes()
         */
        public void setTaxes(String value) {
            this.taxes = value;
        }

        /**
         * The aggregated amount of all the fees that are associated with this entity. See the associated FeeInfo array for a breakdown of the individual fees.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFees()
         */
        public void setFees(String value) {
            this.fees = value;
        }

        /**
         * The total cost for all optional services.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServices() {
            return services;
        }

        /**
         * Sets the value of the services property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getServices()
         */
        public void setServices(String value) {
            this.services = value;
        }

        /**
         * The Converted tax amount in Default Currency.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateTaxes() {
            return approximateTaxes;
        }

        /**
         * Sets the value of the approximateTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApproximateTaxes()
         */
        public void setApproximateTaxes(String value) {
            this.approximateTaxes = value;
        }

        /**
         * The Converted fee amount in Default Currency.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApproximateFees() {
            return approximateFees;
        }

        /**
         * Sets the value of the approximateFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApproximateFees()
         */
        public void setApproximateFees(String value) {
            this.approximateFees = value;
        }

    }

}
