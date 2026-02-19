
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
 *         <element name="ProviderReservationSpecificInfo" type="{http://www.travelport.com/schema/common_v54_0}typeProviderReservationSpecificInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrLoyalty"/>
 *       <attribute name="CardNumber" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCardNumber" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SupplierType" type="{http://www.travelport.com/schema/common_v54_0}typeProduct" />
 *       <attribute name="Level">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <pattern value="[a-zA-Z0-9]{1,1}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="PriorityCode" type="{http://www.travelport.com/schema/common_v54_0}typePriorityCode" />
 *       <attribute name="VendorLocationRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationSpecificInfo"
})
@XmlRootElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v54_0")
public class LoyaltyCard {

    @XmlElement(name = "ProviderReservationSpecificInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeProviderReservationSpecificInfo> providerReservationSpecificInfo;
    @XmlAttribute(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "MembershipStatus")
    protected String membershipStatus;
    @XmlAttribute(name = "FreeText")
    protected String freeText;
    @XmlAttribute(name = "SupplierType")
    protected TypeProduct supplierType;
    @XmlAttribute(name = "Level")
    protected String level;
    @XmlAttribute(name = "PriorityCode")
    protected String priorityCode;
    @XmlAttribute(name = "VendorLocationRef")
    protected String vendorLocationRef;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The code used to identify the Loyalty supplier, e.g. AA, ZE, MC
     * 
     */
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    @XmlAttribute(name = "AllianceLevel")
    protected String allianceLevel;
    /**
     * Loyalty Program membership Id of the traveler specific to Amtrak(2V) Guest Rewards
     * 
     */
    @XmlAttribute(name = "MembershipProgram")
    protected String membershipProgram;
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
     * Gets the value of the providerReservationSpecificInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationSpecificInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderReservationSpecificInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProviderReservationSpecificInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerReservationSpecificInfo property.
     */
    public List<TypeProviderReservationSpecificInfo> getProviderReservationSpecificInfo() {
        if (providerReservationSpecificInfo == null) {
            providerReservationSpecificInfo = new ArrayList<>();
        }
        return this.providerReservationSpecificInfo;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the membershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * Sets the value of the membershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipStatus(String value) {
        this.membershipStatus = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the supplierType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProduct }
     *     
     */
    public TypeProduct getSupplierType() {
        return supplierType;
    }

    /**
     * Sets the value of the supplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProduct }
     *     
     */
    public void setSupplierType(TypeProduct value) {
        this.supplierType = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the vendorLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorLocationRef() {
        return vendorLocationRef;
    }

    /**
     * Sets the value of the vendorLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorLocationRef(String value) {
        this.vendorLocationRef = value;
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
     * The code used to identify the Loyalty supplier, e.g. AA, ZE, MC
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
     * Gets the value of the allianceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllianceLevel() {
        return allianceLevel;
    }

    /**
     * Sets the value of the allianceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllianceLevel(String value) {
        this.allianceLevel = value;
    }

    /**
     * Loyalty Program membership Id of the traveler specific to Amtrak(2V) Guest Rewards
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipProgram() {
        return membershipProgram;
    }

    /**
     * Sets the value of the membershipProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMembershipProgram()
     */
    public void setMembershipProgram(String value) {
        this.membershipProgram = value;
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

}
