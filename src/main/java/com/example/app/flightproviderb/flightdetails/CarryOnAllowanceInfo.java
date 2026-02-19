
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}BaseBaggageAllowanceInfo">
 *       <sequence>
 *         <element name="CarryOnDetails" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageRestriction" maxOccurs="99" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="ApplicableCarryOnBags" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="BasePrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *                 <attribute name="ApproximateBasePrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *                 <attribute name="Taxes" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *                 <attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *                 <attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carryOnDetails"
})
@XmlRootElement(name = "CarryOnAllowanceInfo")
public class CarryOnAllowanceInfo
    extends BaseBaggageAllowanceInfo
{

    /**
     * Information related to Carry-On Bag details .
     * 
     */
    @XmlElement(name = "CarryOnDetails")
    protected List<CarryOnAllowanceInfo.CarryOnDetails> carryOnDetails;

    /**
     * Information related to Carry-On Bag details .
     * 
     * Gets the value of the carryOnDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCarryOnDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarryOnAllowanceInfo.CarryOnDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the carryOnDetails property.
     */
    public List<CarryOnAllowanceInfo.CarryOnDetails> getCarryOnDetails() {
        if (carryOnDetails == null) {
            carryOnDetails = new ArrayList<>();
        }
        return this.carryOnDetails;
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
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageRestriction" maxOccurs="99" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="ApplicableCarryOnBags" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="BasePrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
     *       <attribute name="ApproximateBasePrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
     *       <attribute name="Taxes" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
     *       <attribute name="TotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
     *       <attribute name="ApproximateTotalPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baggageRestriction"
    })
    public static class CarryOnDetails {

        /**
         * Information related to  Baggage restriction rules .
         * 
         */
        @XmlElement(name = "BaggageRestriction")
        protected List<BaggageRestriction> baggageRestriction;
        /**
         * Applicable Carry-On baggage "First", "Second", "Third" etc
         * 
         */
        @XmlAttribute(name = "ApplicableCarryOnBags")
        protected String applicableCarryOnBags;
        @XmlAttribute(name = "BasePrice")
        protected String basePrice;
        @XmlAttribute(name = "ApproximateBasePrice")
        protected String approximateBasePrice;
        @XmlAttribute(name = "Taxes")
        protected String taxes;
        @XmlAttribute(name = "TotalPrice")
        protected String totalPrice;
        @XmlAttribute(name = "ApproximateTotalPrice")
        protected String approximateTotalPrice;

        /**
         * Information related to  Baggage restriction rules .
         * 
         * Gets the value of the baggageRestriction property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageRestriction property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBaggageRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageRestriction }
         * </p>
         * 
         * 
         * @return
         *     The value of the baggageRestriction property.
         */
        public List<BaggageRestriction> getBaggageRestriction() {
            if (baggageRestriction == null) {
                baggageRestriction = new ArrayList<>();
            }
            return this.baggageRestriction;
        }

        /**
         * Applicable Carry-On baggage "First", "Second", "Third" etc
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicableCarryOnBags() {
            return applicableCarryOnBags;
        }

        /**
         * Sets the value of the applicableCarryOnBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApplicableCarryOnBags()
         */
        public void setApplicableCarryOnBags(String value) {
            this.applicableCarryOnBags = value;
        }

        /**
         * Gets the value of the basePrice property.
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
         */
        public void setBasePrice(String value) {
            this.basePrice = value;
        }

        /**
         * Gets the value of the approximateBasePrice property.
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
         */
        public void setApproximateBasePrice(String value) {
            this.approximateBasePrice = value;
        }

        /**
         * Gets the value of the taxes property.
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
         */
        public void setTaxes(String value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the totalPrice property.
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
         */
        public void setTotalPrice(String value) {
            this.totalPrice = value;
        }

        /**
         * Gets the value of the approximateTotalPrice property.
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
         */
        public void setApproximateTotalPrice(String value) {
            this.approximateTotalPrice = value;
        }

    }

}
