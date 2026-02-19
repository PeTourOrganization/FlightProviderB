
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ShopInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PolicyInformation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AgencyInformation" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TravelerInformation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CustomProfileInformation" minOccurs="0"/>
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
    "shopInformation",
    "policyInformation",
    "accountInformation",
    "agencyInformation",
    "travelerInformation",
    "customProfileInformation"
})
@XmlRootElement(name = "FileFinishingInfo", namespace = "http://www.travelport.com/schema/common_v54_0")
public class FileFinishingInfo {

    /**
     * Shopping Information required for File
     * 				Finishing
     * 
     */
    @XmlElement(name = "ShopInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected ShopInformation shopInformation;
    /**
     * Policy Information required for File
     * 							Finishing. Would repeat per Policy Type
     * 
     */
    @XmlElement(name = "PolicyInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PolicyInformation> policyInformation;
    /**
     * Account Information required for File
     * 				Finishing
     * 
     */
    @XmlElement(name = "AccountInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AccountInformation accountInformation;
    /**
     * Agency Information required for File
     * 				Finishing
     * 
     */
    @XmlElement(name = "AgencyInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AgencyInformation agencyInformation;
    /**
     * Traveler Information required for File
     * 				Finishing
     * 
     */
    @XmlElement(name = "TravelerInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TravelerInformation> travelerInformation;
    /**
     * Custom Profile Field Data required for File
     * 				Finishing
     * 
     */
    @XmlElement(name = "CustomProfileInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected CustomProfileInformation customProfileInformation;

    /**
     * Shopping Information required for File
     * 				Finishing
     * 
     * @return
     *     possible object is
     *     {@link ShopInformation }
     *     
     */
    public ShopInformation getShopInformation() {
        return shopInformation;
    }

    /**
     * Sets the value of the shopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopInformation }
     *     
     * @see #getShopInformation()
     */
    public void setShopInformation(ShopInformation value) {
        this.shopInformation = value;
    }

    /**
     * Policy Information required for File
     * 							Finishing. Would repeat per Policy Type
     * 
     * Gets the value of the policyInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the policyInformation property.
     */
    public List<PolicyInformation> getPolicyInformation() {
        if (policyInformation == null) {
            policyInformation = new ArrayList<>();
        }
        return this.policyInformation;
    }

    /**
     * Account Information required for File
     * 				Finishing
     * 
     * @return
     *     possible object is
     *     {@link AccountInformation }
     *     
     */
    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInformation }
     *     
     * @see #getAccountInformation()
     */
    public void setAccountInformation(AccountInformation value) {
        this.accountInformation = value;
    }

    /**
     * Agency Information required for File
     * 				Finishing
     * 
     * @return
     *     possible object is
     *     {@link AgencyInformation }
     *     
     */
    public AgencyInformation getAgencyInformation() {
        return agencyInformation;
    }

    /**
     * Sets the value of the agencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInformation }
     *     
     * @see #getAgencyInformation()
     */
    public void setAgencyInformation(AgencyInformation value) {
        this.agencyInformation = value;
    }

    /**
     * Traveler Information required for File
     * 				Finishing
     * 
     * Gets the value of the travelerInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTravelerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the travelerInformation property.
     */
    public List<TravelerInformation> getTravelerInformation() {
        if (travelerInformation == null) {
            travelerInformation = new ArrayList<>();
        }
        return this.travelerInformation;
    }

    /**
     * Custom Profile Field Data required for File
     * 				Finishing
     * 
     * @return
     *     possible object is
     *     {@link CustomProfileInformation }
     *     
     */
    public CustomProfileInformation getCustomProfileInformation() {
        return customProfileInformation;
    }

    /**
     * Sets the value of the customProfileInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomProfileInformation }
     *     
     * @see #getCustomProfileInformation()
     */
    public void setCustomProfileInformation(CustomProfileInformation value) {
        this.customProfileInformation = value;
    }

}
