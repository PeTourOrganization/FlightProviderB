
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTaxInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTaxInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TaxDetail" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}IncludedInBase" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrTaxDetail"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CarrierDefinedCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="FlightDetailsRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CouponRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TaxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="Text" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to128" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTaxInfo", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "taxDetail",
    "includedInBase"
})
@XmlSeeAlso({
    TypeTaxInfoWithPaymentRef.class
})
public class TypeTaxInfo {

    /**
     * The tax idetail nformation for a fare quote tax.
     * 
     */
    @XmlElement(name = "TaxDetail")
    protected List<TaxDetail> taxDetail;
    /**
     * Shows the taxes and fees included in the base fare. (ACH only)
     * 
     */
    @XmlElement(name = "IncludedInBase")
    protected IncludedInBase includedInBase;
    /**
     * The tax key represents a valid key of tax
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The tax category represents a valid IATA tax
     *                  code.
     * 
     */
    @XmlAttribute(name = "Category", required = true)
    protected String category;
    /**
     * Optional category, where a carrier has
     *                    used a non-standard IATA tax category. The tax category will be
     *                    set to "DU"
     * 
     */
    @XmlAttribute(name = "CarrierDefinedCategory")
    protected String carrierDefinedCategory;
    /**
     * The segment to which that tax is relative (if
     *                    applicable)
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    /**
     * The flight details that this tax is relative
     *                  to (if applicable)
     * 
     */
    @XmlAttribute(name = "FlightDetailsRef")
    protected String flightDetailsRef;
    /**
     * The coupon to which that tax is relative (if
     *                  applicable)
     * 
     */
    @XmlAttribute(name = "CouponRef")
    protected String couponRef;
    /**
     * This indicates whether the tax specified by
     *                  tax category is exempted.
     * 
     */
    @XmlAttribute(name = "TaxExempted")
    protected Boolean taxExempted;
    /**
     * Code of the provider returning this TaxInfo.
     * 
     */
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    /**
     * Code of the supplier returning this TaxInfo.
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * Additional Information returned from Supplier.(ACH  only)
     * 
     */
    @XmlAttribute(name = "Text")
    protected String text;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    @XmlAttribute(name = "OriginAirport")
    protected String originAirport;
    @XmlAttribute(name = "DestinationAirport")
    protected String destinationAirport;
    @XmlAttribute(name = "CountryCode")
    protected String countryCode;
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * The tax idetail nformation for a fare quote tax.
     * 
     * Gets the value of the taxDetail property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetail property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetail }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxDetail property.
     */
    public List<TaxDetail> getTaxDetail() {
        if (taxDetail == null) {
            taxDetail = new ArrayList<>();
        }
        return this.taxDetail;
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
     * The tax key represents a valid key of tax
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
     * The tax category represents a valid IATA tax
     *                  code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategory()
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Optional category, where a carrier has
     *                    used a non-standard IATA tax category. The tax category will be
     *                    set to "DU"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDefinedCategory() {
        return carrierDefinedCategory;
    }

    /**
     * Sets the value of the carrierDefinedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierDefinedCategory()
     */
    public void setCarrierDefinedCategory(String value) {
        this.carrierDefinedCategory = value;
    }

    /**
     * The segment to which that tax is relative (if
     *                    applicable)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSegmentRef()
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * The flight details that this tax is relative
     *                  to (if applicable)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDetailsRef() {
        return flightDetailsRef;
    }

    /**
     * Sets the value of the flightDetailsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightDetailsRef()
     */
    public void setFlightDetailsRef(String value) {
        this.flightDetailsRef = value;
    }

    /**
     * The coupon to which that tax is relative (if
     *                  applicable)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponRef() {
        return couponRef;
    }

    /**
     * Sets the value of the couponRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCouponRef()
     */
    public void setCouponRef(String value) {
        this.couponRef = value;
    }

    /**
     * This indicates whether the tax specified by
     *                  tax category is exempted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempted() {
        return taxExempted;
    }

    /**
     * Sets the value of the taxExempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTaxExempted()
     */
    public void setTaxExempted(Boolean value) {
        this.taxExempted = value;
    }

    /**
     * Code of the provider returning this TaxInfo.
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
     * Code of the supplier returning this TaxInfo.
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
     * @see #getSupplierCode()
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
     * Gets the value of the originAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirport() {
        return originAirport;
    }

    /**
     * Sets the value of the originAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirport(String value) {
        this.originAirport = value;
    }

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirport(String value) {
        this.destinationAirport = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
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

}
