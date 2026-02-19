
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDSummary" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDTravelerInfo"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Payment" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
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
    "emdSummary",
    "emdTravelerInfo",
    "payment"
})
@XmlRootElement(name = "EMDSummaryInfo")
public class EMDSummaryInfo {

    /**
     * Summary information for EMDs conjuncted to each other.
     * 
     */
    @XmlElement(name = "EMDSummary", required = true)
    protected List<EMDSummary> emdSummary;
    /**
     * EMD traveler information.
     * 
     */
    @XmlElement(name = "EMDTravelerInfo", required = true)
    protected EMDTravelerInfo emdTravelerInfo;
    /**
     * Payment charged to issue EMD.
     * 
     */
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected Payment payment;
    /**
     * A reference to the provider reservation with which the document is associated.Displayed when shown as part of UR.Not displayed in EMDRetrieveRsp
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
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

    /**
     * Summary information for EMDs conjuncted to each other.
     * 
     * Gets the value of the emdSummary property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdSummary property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEMDSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDSummary }
     * </p>
     * 
     * 
     * @return
     *     The value of the emdSummary property.
     */
    public List<EMDSummary> getEMDSummary() {
        if (emdSummary == null) {
            emdSummary = new ArrayList<>();
        }
        return this.emdSummary;
    }

    /**
     * EMD traveler information.
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
     * Payment charged to issue EMD.
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
     * A reference to the provider reservation with which the document is associated.Displayed when shown as part of UR.Not displayed in EMDRetrieveRsp
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

}
