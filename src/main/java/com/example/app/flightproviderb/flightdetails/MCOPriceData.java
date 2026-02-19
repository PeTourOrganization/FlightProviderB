
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
 *         <element name="TaxInfo" type="{http://www.travelport.com/schema/common_v54_0}typeTaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element name="Commission" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrAmountPercent"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="MCOAmount" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="MCOEquivalentFare" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="MCOTotalAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
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
    "commission"
})
@XmlRootElement(name = "MCOPriceData", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCOPriceData {

    @XmlElement(name = "TaxInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected MCOPriceData.Commission commission;
    /**
     * The total value of the MCO including any processing fees.
     * 
     */
    @XmlAttribute(name = "MCOAmount", required = true)
    protected String mcoAmount;
    /**
     * Exchange value of the currency actually collected.
     * 
     */
    @XmlAttribute(name = "MCOEquivalentFare")
    protected String mcoEquivalentFare;
    /**
     * The Total amount for the MCO.
     * 
     */
    @XmlAttribute(name = "MCOTotalAmount")
    protected String mcoTotalAmount;

    /**
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
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link MCOPriceData.Commission }
     *     
     */
    public MCOPriceData.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOPriceData.Commission }
     *     
     */
    public void setCommission(MCOPriceData.Commission value) {
        this.commission = value;
    }

    /**
     * The total value of the MCO including any processing fees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOAmount() {
        return mcoAmount;
    }

    /**
     * Sets the value of the mcoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOAmount()
     */
    public void setMCOAmount(String value) {
        this.mcoAmount = value;
    }

    /**
     * Exchange value of the currency actually collected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOEquivalentFare() {
        return mcoEquivalentFare;
    }

    /**
     * Sets the value of the mcoEquivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOEquivalentFare()
     */
    public void setMCOEquivalentFare(String value) {
        this.mcoEquivalentFare = value;
    }

    /**
     * The Total amount for the MCO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOTotalAmount() {
        return mcoTotalAmount;
    }

    /**
     * Sets the value of the mcoTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOTotalAmount()
     */
    public void setMCOTotalAmount(String value) {
        this.mcoTotalAmount = value;
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
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrAmountPercent"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Commission {

        /**
         * The monetary amount.
         * 
         */
        @XmlAttribute(name = "Amount")
        protected String amount;
        /**
         * The percentage.
         * 
         */
        @XmlAttribute(name = "Percentage")
        protected String percentage;

        /**
         * The monetary amount.
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
         * The percentage.
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

    }

}
