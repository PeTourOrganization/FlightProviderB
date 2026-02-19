
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PassengerInfo" maxOccurs="999" minOccurs="0"/>
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
 *       <attribute name="MCOCurrency" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MCOEquivFarePaid" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="MCOEquivCurrency" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="BankSellRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PlatingCarrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="RelatedTktNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ValidFor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TourOperator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MCOTax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengerInfo",
    "taxInfo",
    "commission"
})
@XmlRootElement(name = "MCOMainData", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCOMainData {

    /**
     * Booking Traveler information tied to invoice
     * 
     */
    @XmlElement(name = "PassengerInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PassengerInfo> passengerInfo;
    @XmlElement(name = "TaxInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected MCOMainData.Commission commission;
    /**
     * The total value of the MCO including any processing fees.
     * 
     */
    @XmlAttribute(name = "MCOAmount", required = true)
    protected String mcoAmount;
    /**
     * Currency code for amount.
     * 
     */
    @XmlAttribute(name = "MCOCurrency", required = true)
    protected String mcoCurrency;
    /**
     * Exchange value of the currency actually collected.
     * 
     */
    @XmlAttribute(name = "MCOEquivFarePaid")
    protected String mcoEquivFarePaid;
    /**
     * Exchange value of the currency actually collected.
     * 
     */
    @XmlAttribute(name = "MCOEquivCurrency")
    protected String mcoEquivCurrency;
    /**
     * Pertinent banker's exchange rates used to calculate the amount(s) to be collected in the currency of payment.
     * 
     */
    @XmlAttribute(name = "BankSellRate")
    protected String bankSellRate;
    /**
     * The Plating Carrier for this MCO
     * 
     */
    @XmlAttribute(name = "PlatingCarrier", required = true)
    protected String platingCarrier;
    /**
     * The ticket that this MCO was issued in connection with. Could be the ticket that caused the fee, a residual from an exchange, or an airline service fee.
     * 
     */
    @XmlAttribute(name = "RelatedTktNum")
    protected String relatedTktNum;
    /**
     * Type of service or purpose for which the MCO is issued.
     * 
     */
    @XmlAttribute(name = "ValidFor", required = true)
    protected String validFor;
    /**
     * Tour Operator - name of honoring carrier or operator.
     * 
     */
    @XmlAttribute(name = "TourOperator")
    protected String tourOperator;
    /**
     * Location of honoring carrier or operator.
     * 
     */
    @XmlAttribute(name = "Location")
    protected String location;
    /**
     * Amount of taxes or fees levied by the local government for the issuance of the MCO in the country where the MCO is issued.
     * 
     */
    @XmlAttribute(name = "MCOTax")
    protected String mcoTax;

    /**
     * Booking Traveler information tied to invoice
     * 
     * Gets the value of the passengerInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerInfo property.
     */
    public List<PassengerInfo> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<>();
        }
        return this.passengerInfo;
    }

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
     *     {@link MCOMainData.Commission }
     *     
     */
    public MCOMainData.Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCOMainData.Commission }
     *     
     */
    public void setCommission(MCOMainData.Commission value) {
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
     * Currency code for amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOCurrency() {
        return mcoCurrency;
    }

    /**
     * Sets the value of the mcoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOCurrency()
     */
    public void setMCOCurrency(String value) {
        this.mcoCurrency = value;
    }

    /**
     * Exchange value of the currency actually collected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOEquivFarePaid() {
        return mcoEquivFarePaid;
    }

    /**
     * Sets the value of the mcoEquivFarePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOEquivFarePaid()
     */
    public void setMCOEquivFarePaid(String value) {
        this.mcoEquivFarePaid = value;
    }

    /**
     * Exchange value of the currency actually collected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOEquivCurrency() {
        return mcoEquivCurrency;
    }

    /**
     * Sets the value of the mcoEquivCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOEquivCurrency()
     */
    public void setMCOEquivCurrency(String value) {
        this.mcoEquivCurrency = value;
    }

    /**
     * Pertinent banker's exchange rates used to calculate the amount(s) to be collected in the currency of payment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSellRate() {
        return bankSellRate;
    }

    /**
     * Sets the value of the bankSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankSellRate()
     */
    public void setBankSellRate(String value) {
        this.bankSellRate = value;
    }

    /**
     * The Plating Carrier for this MCO
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * The ticket that this MCO was issued in connection with. Could be the ticket that caused the fee, a residual from an exchange, or an airline service fee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedTktNum() {
        return relatedTktNum;
    }

    /**
     * Sets the value of the relatedTktNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRelatedTktNum()
     */
    public void setRelatedTktNum(String value) {
        this.relatedTktNum = value;
    }

    /**
     * Type of service or purpose for which the MCO is issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValidFor()
     */
    public void setValidFor(String value) {
        this.validFor = value;
    }

    /**
     * Tour Operator - name of honoring carrier or operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperator() {
        return tourOperator;
    }

    /**
     * Sets the value of the tourOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTourOperator()
     */
    public void setTourOperator(String value) {
        this.tourOperator = value;
    }

    /**
     * Location of honoring carrier or operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocation()
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Amount of taxes or fees levied by the local government for the issuance of the MCO in the country where the MCO is issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOTax() {
        return mcoTax;
    }

    /**
     * Sets the value of the mcoTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOTax()
     */
    public void setMCOTax(String value) {
        this.mcoTax = value;
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
