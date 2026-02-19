
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A generic type of fee for those charges which are
 *                incurred by the passenger, but not necessarily shown on tickets
 * 
 * <p>Java class for typeFeeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeFeeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxInfoRef" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}IncludedInBase" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attribute name="BaseAmount" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FeeToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassengerTypeCode" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="Text" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFeeInfo", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "taxInfoRef",
    "includedInBase"
})
public class TypeFeeInfo {

    /**
     * This reference elements will associate relevant taxes to this fee
     * 
     */
    @XmlElement(name = "TaxInfoRef")
    protected List<TypeFeeInfo.TaxInfoRef> taxInfoRef;
    /**
     * Shows the taxes and fees included in the base fare. (ACH only)
     * 
     */
    @XmlElement(name = "IncludedInBase")
    protected IncludedInBase includedInBase;
    @XmlAttribute(name = "BaseAmount")
    protected String baseAmount;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "FeeToken")
    protected String feeToken;
    /**
     * The reference to the one of the air
     *                   reservation payments if fee included in charge
     * 
     */
    @XmlAttribute(name = "PaymentRef")
    protected String paymentRef;
    /**
     * Reference to booking traveler
     * 
     */
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    /**
     * Additional Information returned from Supplier.(ACH  only)
     * 
     */
    @XmlAttribute(name = "Text")
    protected String text;
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
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * This reference elements will associate relevant taxes to this fee
     * 
     * Gets the value of the taxInfoRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfoRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFeeInfo.TaxInfoRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxInfoRef property.
     */
    public List<TypeFeeInfo.TaxInfoRef> getTaxInfoRef() {
        if (taxInfoRef == null) {
            taxInfoRef = new ArrayList<>();
        }
        return this.taxInfoRef;
    }

    /**
     * Shows the taxes and fees included in the base fare. (ACH only)
     * 
     * @return
     *     possible object is
     *     {@link IncludedInBase }
     *     
     */
    public IncludedInBase getIncludedInBase() {
        return includedInBase;
    }

    /**
     * Sets the value of the includedInBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedInBase }
     *     
     * @see #getIncludedInBase()
     */
    public void setIncludedInBase(IncludedInBase value) {
        this.includedInBase = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmount(String value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the amount property.
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
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the feeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeToken() {
        return feeToken;
    }

    /**
     * Sets the value of the feeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeToken(String value) {
        this.feeToken = value;
    }

    /**
     * The reference to the one of the air
     *                   reservation payments if fee included in charge
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentRef()
     */
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * Reference to booking traveler
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingTravelerRef()
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Additional Information returned from Supplier.(ACH  only)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
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
     * Gets the value of the providerCode property.
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
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
     *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TaxInfoRef {

        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the key property.
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
         */
        public void setKey(String value) {
            this.key = value;
        }

    }

}
