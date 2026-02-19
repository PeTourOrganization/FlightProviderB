
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
 *         <element name="PolicyCompliance" maxOccurs="2" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="InPolicy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="PolicyToken" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to128" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ContractCompliance" maxOccurs="2" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="InContract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="ContractToken" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to128" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PreferredSupplier" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Preferred" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProfileType" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="RailSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ReservationLocatorRef" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyCompliance",
    "contractCompliance",
    "preferredSupplier"
})
@XmlRootElement(name = "TravelComplianceData", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TravelComplianceData {

    @XmlElement(name = "PolicyCompliance", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TravelComplianceData.PolicyCompliance> policyCompliance;
    @XmlElement(name = "ContractCompliance", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TravelComplianceData.ContractCompliance> contractCompliance;
    @XmlElement(name = "PreferredSupplier", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TravelComplianceData.PreferredSupplier> preferredSupplier;
    /**
     * System generated key, returned back in the response. This can be used to modify or delete a saved TravelComplianceData.
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Refers to Air Segment. Applicable only for Air. Ignored for others.
     * 
     */
    @XmlAttribute(name = "AirSegmentRef")
    protected String airSegmentRef;
    /**
     * Refers to Passive Segment. Applicable only for Passive. Ignored for others.
     * 
     */
    @XmlAttribute(name = "PassiveSegmentRef")
    protected String passiveSegmentRef;
    /**
     * Refers to Rail Segment. Applicable only for Rail. Ignored for others.
     * 
     */
    @XmlAttribute(name = "RailSegmentRef")
    protected String railSegmentRef;
    /**
     * This is returned in the response. Any input will be ignored for this attribute. This represents the association of Travel Compliance Data with the uAPI reservation locator code, mainly relevant to Hotel and Vehicle.
     * 
     */
    @XmlAttribute(name = "ReservationLocatorRef")
    protected String reservationLocatorRef;
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
     * Gets the value of the policyCompliance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyCompliance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicyCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData.PolicyCompliance }
     * </p>
     * 
     * 
     * @return
     *     The value of the policyCompliance property.
     */
    public List<TravelComplianceData.PolicyCompliance> getPolicyCompliance() {
        if (policyCompliance == null) {
            policyCompliance = new ArrayList<>();
        }
        return this.policyCompliance;
    }

    /**
     * Gets the value of the contractCompliance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractCompliance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData.ContractCompliance }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractCompliance property.
     */
    public List<TravelComplianceData.ContractCompliance> getContractCompliance() {
        if (contractCompliance == null) {
            contractCompliance = new ArrayList<>();
        }
        return this.contractCompliance;
    }

    /**
     * Gets the value of the preferredSupplier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredSupplier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreferredSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData.PreferredSupplier }
     * </p>
     * 
     * 
     * @return
     *     The value of the preferredSupplier property.
     */
    public List<TravelComplianceData.PreferredSupplier> getPreferredSupplier() {
        if (preferredSupplier == null) {
            preferredSupplier = new ArrayList<>();
        }
        return this.preferredSupplier;
    }

    /**
     * System generated key, returned back in the response. This can be used to modify or delete a saved TravelComplianceData.
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
     * Refers to Air Segment. Applicable only for Air. Ignored for others.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirSegmentRef() {
        return airSegmentRef;
    }

    /**
     * Sets the value of the airSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirSegmentRef()
     */
    public void setAirSegmentRef(String value) {
        this.airSegmentRef = value;
    }

    /**
     * Refers to Passive Segment. Applicable only for Passive. Ignored for others.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveSegmentRef() {
        return passiveSegmentRef;
    }

    /**
     * Sets the value of the passiveSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassiveSegmentRef()
     */
    public void setPassiveSegmentRef(String value) {
        this.passiveSegmentRef = value;
    }

    /**
     * Refers to Rail Segment. Applicable only for Rail. Ignored for others.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailSegmentRef() {
        return railSegmentRef;
    }

    /**
     * Sets the value of the railSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRailSegmentRef()
     */
    public void setRailSegmentRef(String value) {
        this.railSegmentRef = value;
    }

    /**
     * This is returned in the response. Any input will be ignored for this attribute. This represents the association of Travel Compliance Data with the uAPI reservation locator code, mainly relevant to Hotel and Vehicle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorRef() {
        return reservationLocatorRef;
    }

    /**
     * Sets the value of the reservationLocatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReservationLocatorRef()
     */
    public void setReservationLocatorRef(String value) {
        this.reservationLocatorRef = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="InContract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="ContractToken" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to128" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContractCompliance {

        /**
         * Contract Compliance Indicator. For In-Contract set to 'true', For Out-Of-Contract set to 'false'.
         * 
         */
        @XmlAttribute(name = "InContract", required = true)
        protected boolean inContract;
        /**
         * Optional text message to set the rule or token for which it's In Contract or Out Of Contract.
         * 
         */
        @XmlAttribute(name = "ContractToken")
        protected String contractToken;

        /**
         * Contract Compliance Indicator. For In-Contract set to 'true', For Out-Of-Contract set to 'false'.
         * 
         */
        public boolean isInContract() {
            return inContract;
        }

        /**
         * Sets the value of the inContract property.
         * 
         */
        public void setInContract(boolean value) {
            this.inContract = value;
        }

        /**
         * Optional text message to set the rule or token for which it's In Contract or Out Of Contract.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractToken() {
            return contractToken;
        }

        /**
         * Sets the value of the contractToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractToken()
         */
        public void setContractToken(String value) {
            this.contractToken = value;
        }

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
     *       <attribute name="InPolicy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="PolicyToken" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to128" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PolicyCompliance {

        /**
         * Policy Compliance Indicator. For In-Policy set to 'true', For Out-Of-Policy set to 'false''.
         * 
         */
        @XmlAttribute(name = "InPolicy", required = true)
        protected boolean inPolicy;
        /**
         * Optional text message to set the rule or token for which it's In Policy or Out Of Policy.
         * 
         */
        @XmlAttribute(name = "PolicyToken")
        protected String policyToken;

        /**
         * Policy Compliance Indicator. For In-Policy set to 'true', For Out-Of-Policy set to 'false''.
         * 
         */
        public boolean isInPolicy() {
            return inPolicy;
        }

        /**
         * Sets the value of the inPolicy property.
         * 
         */
        public void setInPolicy(boolean value) {
            this.inPolicy = value;
        }

        /**
         * Optional text message to set the rule or token for which it's In Policy or Out Of Policy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyToken() {
            return policyToken;
        }

        /**
         * Sets the value of the policyToken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPolicyToken()
         */
        public void setPolicyToken(String value) {
            this.policyToken = value;
        }

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
     *       <attribute name="Preferred" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProfileType" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PreferredSupplier {

        /**
         * Preferred Supplier - 'true', 'false'.
         * 
         */
        @XmlAttribute(name = "Preferred", required = true)
        protected boolean preferred;
        /**
         * Indicate profile type. e.g. if Agency Preferred then pass Agency, if Traveler Preferred then pass Traveler.
         * 
         */
        @XmlAttribute(name = "ProfileType", required = true)
        protected TypeProfileType profileType;

        /**
         * Preferred Supplier - 'true', 'false'.
         * 
         */
        public boolean isPreferred() {
            return preferred;
        }

        /**
         * Sets the value of the preferred property.
         * 
         */
        public void setPreferred(boolean value) {
            this.preferred = value;
        }

        /**
         * Indicate profile type. e.g. if Agency Preferred then pass Agency, if Traveler Preferred then pass Traveler.
         * 
         * @return
         *     possible object is
         *     {@link TypeProfileType }
         *     
         */
        public TypeProfileType getProfileType() {
            return profileType;
        }

        /**
         * Sets the value of the profileType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeProfileType }
         *     
         * @see #getProfileType()
         */
        public void setProfileType(TypeProfileType value) {
            this.profileType = value;
        }

    }

}
