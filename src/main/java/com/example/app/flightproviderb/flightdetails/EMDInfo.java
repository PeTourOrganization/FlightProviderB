
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDTravelerInfo"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SupplierLocator" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ElectronicMiscDocument" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}FormOfPayment" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDPricingInfo" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDEndorsement" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareCalc" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDCommission" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emdTravelerInfo",
    "supplierLocator",
    "electronicMiscDocument",
    "payment",
    "formOfPayment",
    "emdPricingInfo",
    "emdEndorsement",
    "fareCalc",
    "emdCommission"
})
@XmlRootElement(name = "EMDInfo")
public class EMDInfo {

    /**
     * Basic information of the traveler associated with this EMDInfo.
     * 
     */
    @XmlElement(name = "EMDTravelerInfo", required = true)
    protected EMDTravelerInfo emdTravelerInfo;
    /**
     * List of Supplier Locator information that is associated with this document
     * 
     */
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SupplierLocator> supplierLocator;
    /**
     * Electronic miscellaneous documents.As an EMDInfo container displays all the EMDs which are in conjunction, there can be maximum 4 ElectronicMiscDocuments present in an EMDInfo
     * 
     */
    @XmlElement(name = "ElectronicMiscDocument", required = true)
    protected List<ElectronicMiscDocument> electronicMiscDocument;
    /**
     * Payment charged for EMD isuance
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Payment payment;
    /**
     * FormOfPayment used for issuing these electronic miscellaneous documents
     * 
     */
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected FormOfPayment formOfPayment;
    /**
     * Fare related information for these electronic miscellaneous documents
     * 
     */
    @XmlElement(name = "EMDPricingInfo")
    protected EMDPricingInfo emdPricingInfo;
    /**
     * Endorsement for EMD. Supported providers are 1V/1G/1P
     * 
     */
    @XmlElement(name = "EMDEndorsement")
    protected List<String> emdEndorsement;
    /**
     * Infomration about the fare calculation
     * 
     */
    @XmlElement(name = "FareCalc")
    protected String fareCalc;
    /**
     * Commission information applied during EMD issuance
     * 
     */
    @XmlElement(name = "EMDCommission")
    protected EMDCommission emdCommission;
    /**
     * System generated Key
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
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
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode", required = true)
    protected String providerLocatorCode;
    /**
     * Represents Carrier Code for ACH PNR Retrieve.
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * Basic information of the traveler associated with this EMDInfo.
     * 
     * @return
     *     possible object is
     *     {@link EMDTravelerInfo }
     *     
     */
    public EMDTravelerInfo getEMDTravelerInfo() {
        return emdTravelerInfo;
    }

    /**
     * Sets the value of the emdTravelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDTravelerInfo }
     *     
     * @see #getEMDTravelerInfo()
     */
    public void setEMDTravelerInfo(EMDTravelerInfo value) {
        this.emdTravelerInfo = value;
    }

    /**
     * List of Supplier Locator information that is associated with this document
     * 
     * Gets the value of the supplierLocator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * </p>
     * 
     * 
     * @return
     *     The value of the supplierLocator property.
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<>();
        }
        return this.supplierLocator;
    }

    /**
     * Electronic miscellaneous documents.As an EMDInfo container displays all the EMDs which are in conjunction, there can be maximum 4 ElectronicMiscDocuments present in an EMDInfo
     * 
     * Gets the value of the electronicMiscDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicMiscDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElectronicMiscDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicMiscDocument }
     * </p>
     * 
     * 
     * @return
     *     The value of the electronicMiscDocument property.
     */
    public List<ElectronicMiscDocument> getElectronicMiscDocument() {
        if (electronicMiscDocument == null) {
            electronicMiscDocument = new ArrayList<>();
        }
        return this.electronicMiscDocument;
    }

    /**
     * Payment charged for EMD isuance
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     * @see #getPayment()
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * FormOfPayment used for issuing these electronic miscellaneous documents
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     * @see #getFormOfPayment()
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Fare related information for these electronic miscellaneous documents
     * 
     * @return
     *     possible object is
     *     {@link EMDPricingInfo }
     *     
     */
    public EMDPricingInfo getEMDPricingInfo() {
        return emdPricingInfo;
    }

    /**
     * Sets the value of the emdPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDPricingInfo }
     *     
     * @see #getEMDPricingInfo()
     */
    public void setEMDPricingInfo(EMDPricingInfo value) {
        this.emdPricingInfo = value;
    }

    /**
     * Endorsement for EMD. Supported providers are 1V/1G/1P
     * 
     * Gets the value of the emdEndorsement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdEndorsement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEMDEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the emdEndorsement property.
     */
    public List<String> getEMDEndorsement() {
        if (emdEndorsement == null) {
            emdEndorsement = new ArrayList<>();
        }
        return this.emdEndorsement;
    }

    /**
     * Infomration about the fare calculation
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalc() {
        return fareCalc;
    }

    /**
     * Sets the value of the fareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareCalc()
     */
    public void setFareCalc(String value) {
        this.fareCalc = value;
    }

    /**
     * Commission information applied during EMD issuance
     * 
     * @return
     *     possible object is
     *     {@link EMDCommission }
     *     
     */
    public EMDCommission getEMDCommission() {
        return emdCommission;
    }

    /**
     * Sets the value of the emdCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDCommission }
     *     
     * @see #getEMDCommission()
     */
    public void setEMDCommission(EMDCommission value) {
        this.emdCommission = value;
    }

    /**
     * System generated Key
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
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Represents Carrier Code for ACH PNR Retrieve.
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

}
