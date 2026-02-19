
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains the rules for applying service rules
 * 
 * <p>Java class for ServiceRuleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceRuleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicationRules" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="RequiredForAllTravelers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="RequiredForAllSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="RequiredForAllSegmentsInOD" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="UnselectedOptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="SecondaryOptionCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ApplicationLevel" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ApplicationLimits" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicationLimitType" maxOccurs="10"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceData" maxOccurs="999" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="ApplicableLevels">
 *                   <simpleType>
 *                     <list itemType="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicabilityType" />
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="ProviderDefinedApplicableLevels" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ModifyRules" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ModifyRule" maxOccurs="999">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ModificationRulesGroup"/>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="SupportedModifications">
 *                   <simpleType>
 *                     <list itemType="{http://www.travelport.com/schema/common_v54_0}ModificationType" />
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="ProviderDefinedModificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SecondaryTypeRules" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="SecondaryTypeRule" maxOccurs="999">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/>
 *                           </sequence>
 *                           <attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Remarks" type="{http://www.travelport.com/schema/common_v54_0}FormattedTextTextType" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRuleType", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "applicationRules",
    "applicationLevel",
    "modifyRules",
    "secondaryTypeRules",
    "remarks"
})
public class ServiceRuleType {

    /**
     * The rules to apply the rule to the itinerary
     * 
     */
    @XmlElement(name = "ApplicationRules")
    protected ServiceRuleType.ApplicationRules applicationRules;
    /**
     * Lists the levels where the option is applied in the itinerary. Some options are applied for the entire itinerary, some for entire segments, etc.
     * 
     */
    @XmlElement(name = "ApplicationLevel")
    protected ServiceRuleType.ApplicationLevel applicationLevel;
    /**
     * Groups the modification rules for the Option
     * 
     */
    @XmlElement(name = "ModifyRules")
    protected ServiceRuleType.ModifyRules modifyRules;
    /**
     * Lists the supported Secondary Codes for the optional / additional service.
     * 
     */
    @XmlElement(name = "SecondaryTypeRules")
    protected ServiceRuleType.SecondaryTypeRules secondaryTypeRules;
    /**
     * Adds text remarks / rules for the optional / additional service
     * 
     */
    @XmlElement(name = "Remarks")
    protected List<FormattedTextTextType> remarks;
    /**
     * Unique ID to identify an optional service rule
     * 
     */
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * The rules to apply the rule to the itinerary
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ApplicationRules }
     *     
     */
    public ServiceRuleType.ApplicationRules getApplicationRules() {
        return applicationRules;
    }

    /**
     * Sets the value of the applicationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ApplicationRules }
     *     
     * @see #getApplicationRules()
     */
    public void setApplicationRules(ServiceRuleType.ApplicationRules value) {
        this.applicationRules = value;
    }

    /**
     * Lists the levels where the option is applied in the itinerary. Some options are applied for the entire itinerary, some for entire segments, etc.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ApplicationLevel }
     *     
     */
    public ServiceRuleType.ApplicationLevel getApplicationLevel() {
        return applicationLevel;
    }

    /**
     * Sets the value of the applicationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ApplicationLevel }
     *     
     * @see #getApplicationLevel()
     */
    public void setApplicationLevel(ServiceRuleType.ApplicationLevel value) {
        this.applicationLevel = value;
    }

    /**
     * Groups the modification rules for the Option
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ModifyRules }
     *     
     */
    public ServiceRuleType.ModifyRules getModifyRules() {
        return modifyRules;
    }

    /**
     * Sets the value of the modifyRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ModifyRules }
     *     
     * @see #getModifyRules()
     */
    public void setModifyRules(ServiceRuleType.ModifyRules value) {
        this.modifyRules = value;
    }

    /**
     * Lists the supported Secondary Codes for the optional / additional service.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.SecondaryTypeRules }
     *     
     */
    public ServiceRuleType.SecondaryTypeRules getSecondaryTypeRules() {
        return secondaryTypeRules;
    }

    /**
     * Sets the value of the secondaryTypeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.SecondaryTypeRules }
     *     
     * @see #getSecondaryTypeRules()
     */
    public void setSecondaryTypeRules(ServiceRuleType.SecondaryTypeRules value) {
        this.secondaryTypeRules = value;
    }

    /**
     * Adds text remarks / rules for the optional / additional service
     * 
     * Gets the value of the remarks property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType }
     * </p>
     * 
     * 
     * @return
     *     The value of the remarks property.
     */
    public List<FormattedTextTextType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<>();
        }
        return this.remarks;
    }

    /**
     * Unique ID to identify an optional service rule
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="ApplicationLimits" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicationLimitType" maxOccurs="10"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceData" maxOccurs="999" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="ApplicableLevels">
     *         <simpleType>
     *           <list itemType="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicabilityType" />
     *         </simpleType>
     *       </attribute>
     *       <attribute name="ProviderDefinedApplicableLevels" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicationLimits",
        "serviceData"
    })
    public static class ApplicationLevel {

        /**
         * Adds the limits on the number of options that can be selected for a particular type
         * 
         */
        @XmlElement(name = "ApplicationLimits", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected ServiceRuleType.ApplicationLevel.ApplicationLimits applicationLimits;
        @XmlElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected List<ServiceData> serviceData;
        /**
         * Indicates the level in the itinerary when the option is applied.
         * 
         */
        @XmlAttribute(name = "ApplicableLevels")
        protected List<OptionalServiceApplicabilityType> applicableLevels;
        /**
         * Indicates the actual provider defined ApplicableLevels which is mapped to Other
         * 
         */
        @XmlAttribute(name = "ProviderDefinedApplicableLevels")
        protected String providerDefinedApplicableLevels;

        /**
         * Adds the limits on the number of options that can be selected for a particular type
         * 
         * @return
         *     possible object is
         *     {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
         *     
         */
        public ServiceRuleType.ApplicationLevel.ApplicationLimits getApplicationLimits() {
            return applicationLimits;
        }

        /**
         * Sets the value of the applicationLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
         *     
         * @see #getApplicationLimits()
         */
        public void setApplicationLimits(ServiceRuleType.ApplicationLevel.ApplicationLimits value) {
            this.applicationLimits = value;
        }

        /**
         * Gets the value of the serviceData property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceData property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getServiceData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceData }
         * </p>
         * 
         * 
         * @return
         *     The value of the serviceData property.
         */
        public List<ServiceData> getServiceData() {
            if (serviceData == null) {
                serviceData = new ArrayList<>();
            }
            return this.serviceData;
        }

        /**
         * Indicates the level in the itinerary when the option is applied.
         * 
         * Gets the value of the applicableLevels property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicableLevels property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getApplicableLevels().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OptionalServiceApplicabilityType }
         * </p>
         * 
         * 
         * @return
         *     The value of the applicableLevels property.
         */
        public List<OptionalServiceApplicabilityType> getApplicableLevels() {
            if (applicableLevels == null) {
                applicableLevels = new ArrayList<>();
            }
            return this.applicableLevels;
        }

        /**
         * Indicates the actual provider defined ApplicableLevels which is mapped to Other
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderDefinedApplicableLevels() {
            return providerDefinedApplicableLevels;
        }

        /**
         * Sets the value of the providerDefinedApplicableLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getProviderDefinedApplicableLevels()
         */
        public void setProviderDefinedApplicableLevels(String value) {
            this.providerDefinedApplicableLevels = value;
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
         *         <element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicationLimitType" maxOccurs="10"/>
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
            "applicationLimit"
        })
        public static class ApplicationLimits {

            /**
             * The application limits for a particular level
             * 
             */
            @XmlElement(name = "ApplicationLimit", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
            protected List<OptionalServiceApplicationLimitType> applicationLimit;

            /**
             * The application limits for a particular level
             * 
             * Gets the value of the applicationLimit property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationLimit property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getApplicationLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionalServiceApplicationLimitType }
             * </p>
             * 
             * 
             * @return
             *     The value of the applicationLimit property.
             */
            public List<OptionalServiceApplicationLimitType> getApplicationLimit() {
                if (applicationLimit == null) {
                    applicationLimit = new ArrayList<>();
                }
                return this.applicationLimit;
            }

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
     *       <attribute name="RequiredForAllTravelers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="RequiredForAllSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="RequiredForAllSegmentsInOD" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="UnselectedOptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="SecondaryOptionCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ApplicationRules {

        /**
         * Indicates if the option needs to be applied to all travelers in the itinerary if selected
         * 
         */
        @XmlAttribute(name = "RequiredForAllTravelers")
        protected Boolean requiredForAllTravelers;
        /**
         * Indicates if the option needs to be applied to all segments in the itinerary if selected
         * 
         */
        @XmlAttribute(name = "RequiredForAllSegments")
        protected Boolean requiredForAllSegments;
        /**
         * Indicates if the option needs to be applied to all segments in a origin / destination (connection flights) if selected for one segment in the OD
         * 
         */
        @XmlAttribute(name = "RequiredForAllSegmentsInOD")
        protected Boolean requiredForAllSegmentsInOD;
        /**
         * If an UnselectedOption is present in the option, then the Unselected option  needs to be selected even if the option is not selected when this flag is set to true
         * 
         */
        @XmlAttribute(name = "UnselectedOptionRequired")
        protected Boolean unselectedOptionRequired;
        /**
         * If set to true, the secondary option code is required for this option
         * 
         */
        @XmlAttribute(name = "SecondaryOptionCodeRequired")
        protected Boolean secondaryOptionCodeRequired;

        /**
         * Indicates if the option needs to be applied to all travelers in the itinerary if selected
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredForAllTravelers() {
            return requiredForAllTravelers;
        }

        /**
         * Sets the value of the requiredForAllTravelers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isRequiredForAllTravelers()
         */
        public void setRequiredForAllTravelers(Boolean value) {
            this.requiredForAllTravelers = value;
        }

        /**
         * Indicates if the option needs to be applied to all segments in the itinerary if selected
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredForAllSegments() {
            return requiredForAllSegments;
        }

        /**
         * Sets the value of the requiredForAllSegments property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isRequiredForAllSegments()
         */
        public void setRequiredForAllSegments(Boolean value) {
            this.requiredForAllSegments = value;
        }

        /**
         * Indicates if the option needs to be applied to all segments in a origin / destination (connection flights) if selected for one segment in the OD
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredForAllSegmentsInOD() {
            return requiredForAllSegmentsInOD;
        }

        /**
         * Sets the value of the requiredForAllSegmentsInOD property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isRequiredForAllSegmentsInOD()
         */
        public void setRequiredForAllSegmentsInOD(Boolean value) {
            this.requiredForAllSegmentsInOD = value;
        }

        /**
         * If an UnselectedOption is present in the option, then the Unselected option  needs to be selected even if the option is not selected when this flag is set to true
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUnselectedOptionRequired() {
            return unselectedOptionRequired;
        }

        /**
         * Sets the value of the unselectedOptionRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isUnselectedOptionRequired()
         */
        public void setUnselectedOptionRequired(Boolean value) {
            this.unselectedOptionRequired = value;
        }

        /**
         * If set to true, the secondary option code is required for this option
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSecondaryOptionCodeRequired() {
            return secondaryOptionCodeRequired;
        }

        /**
         * Sets the value of the secondaryOptionCodeRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isSecondaryOptionCodeRequired()
         */
        public void setSecondaryOptionCodeRequired(Boolean value) {
            this.secondaryOptionCodeRequired = value;
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
     *       <sequence>
     *         <element name="ModifyRule" maxOccurs="999">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ModificationRulesGroup"/>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="SupportedModifications">
     *         <simpleType>
     *           <list itemType="{http://www.travelport.com/schema/common_v54_0}ModificationType" />
     *         </simpleType>
     *       </attribute>
     *       <attribute name="ProviderDefinedModificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modifyRule"
    })
    public static class ModifyRules {

        /**
         * Indicates modification rules for the particular modification type.
         * 
         */
        @XmlElement(name = "ModifyRule", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<ServiceRuleType.ModifyRules.ModifyRule> modifyRule;
        /**
         * Lists the supported modifications for the itinerary.
         * 
         */
        @XmlAttribute(name = "SupportedModifications")
        protected List<ModificationType> supportedModifications;
        /**
         * Indicates the actual provider defined modification type which is mapped to Other
         * 
         */
        @XmlAttribute(name = "ProviderDefinedModificationType")
        protected String providerDefinedModificationType;

        /**
         * Indicates modification rules for the particular modification type.
         * 
         * Gets the value of the modifyRule property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyRule property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getModifyRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRuleType.ModifyRules.ModifyRule }
         * </p>
         * 
         * 
         * @return
         *     The value of the modifyRule property.
         */
        public List<ServiceRuleType.ModifyRules.ModifyRule> getModifyRule() {
            if (modifyRule == null) {
                modifyRule = new ArrayList<>();
            }
            return this.modifyRule;
        }

        /**
         * Lists the supported modifications for the itinerary.
         * 
         * Gets the value of the supportedModifications property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedModifications property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSupportedModifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModificationType }
         * </p>
         * 
         * 
         * @return
         *     The value of the supportedModifications property.
         */
        public List<ModificationType> getSupportedModifications() {
            if (supportedModifications == null) {
                supportedModifications = new ArrayList<>();
            }
            return this.supportedModifications;
        }

        /**
         * Indicates the actual provider defined modification type which is mapped to Other
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderDefinedModificationType() {
            return providerDefinedModificationType;
        }

        /**
         * Sets the value of the providerDefinedModificationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getProviderDefinedModificationType()
         */
        public void setProviderDefinedModificationType(String value) {
            this.providerDefinedModificationType = value;
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
         *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ModificationRulesGroup"/>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ModifyRule {

            /**
             * The modificaiton for which this rule group applies.
             * 
             */
            @XmlAttribute(name = "Modification", required = true)
            protected ModificationType modification;
            /**
             * Indicates if the option will be automatically added to new segments / passengers in the itinerary.
             * 
             */
            @XmlAttribute(name = "AutomaticallyAppliedOnAdd")
            protected Boolean automaticallyAppliedOnAdd;
            /**
             * Indicates if the option can be deleted from the itinerary without segment or passenger modifications
             * 
             */
            @XmlAttribute(name = "CanDelete")
            protected Boolean canDelete;
            /**
             * Indicates if the option can be added to the itinerary without segment or passenger modification
             * 
             */
            @XmlAttribute(name = "CanAdd")
            protected Boolean canAdd;
            /**
             * Indicates if the price of the option is refundable.
             * 
             */
            @XmlAttribute(name = "Refundable")
            protected Boolean refundable;
            /**
             * Indicates the actual provider defined modification type which is mapped to Other
             * 
             */
            @XmlAttribute(name = "ProviderDefinedModificationType")
            protected String providerDefinedModificationType;

            /**
             * The modificaiton for which this rule group applies.
             * 
             * @return
             *     possible object is
             *     {@link ModificationType }
             *     
             */
            public ModificationType getModification() {
                return modification;
            }

            /**
             * Sets the value of the modification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ModificationType }
             *     
             * @see #getModification()
             */
            public void setModification(ModificationType value) {
                this.modification = value;
            }

            /**
             * Indicates if the option will be automatically added to new segments / passengers in the itinerary.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isAutomaticallyAppliedOnAdd() {
                if (automaticallyAppliedOnAdd == null) {
                    return false;
                } else {
                    return automaticallyAppliedOnAdd;
                }
            }

            /**
             * Sets the value of the automaticallyAppliedOnAdd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isAutomaticallyAppliedOnAdd()
             */
            public void setAutomaticallyAppliedOnAdd(Boolean value) {
                this.automaticallyAppliedOnAdd = value;
            }

            /**
             * Indicates if the option can be deleted from the itinerary without segment or passenger modifications
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCanDelete() {
                return canDelete;
            }

            /**
             * Sets the value of the canDelete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isCanDelete()
             */
            public void setCanDelete(Boolean value) {
                this.canDelete = value;
            }

            /**
             * Indicates if the option can be added to the itinerary without segment or passenger modification
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCanAdd() {
                return canAdd;
            }

            /**
             * Sets the value of the canAdd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isCanAdd()
             */
            public void setCanAdd(Boolean value) {
                this.canAdd = value;
            }

            /**
             * Indicates if the price of the option is refundable.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRefundable() {
                return refundable;
            }

            /**
             * Sets the value of the refundable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isRefundable()
             */
            public void setRefundable(Boolean value) {
                this.refundable = value;
            }

            /**
             * Indicates the actual provider defined modification type which is mapped to Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderDefinedModificationType() {
                return providerDefinedModificationType;
            }

            /**
             * Sets the value of the providerDefinedModificationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getProviderDefinedModificationType()
             */
            public void setProviderDefinedModificationType(String value) {
                this.providerDefinedModificationType = value;
            }

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
     *       <sequence>
     *         <element name="SecondaryTypeRule" maxOccurs="999">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/>
     *                 </sequence>
     *                 <attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "secondaryTypeRule"
    })
    public static class SecondaryTypeRules {

        /**
         * Lists a single secondary code for the optional / additional service.
         * 
         */
        @XmlElement(name = "SecondaryTypeRule", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule> secondaryTypeRule;

        /**
         * Lists a single secondary code for the optional / additional service.
         * 
         * Gets the value of the secondaryTypeRule property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondaryTypeRule property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSecondaryTypeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule }
         * </p>
         * 
         * 
         * @return
         *     The value of the secondaryTypeRule property.
         */
        public List<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule> getSecondaryTypeRule() {
            if (secondaryTypeRule == null) {
                secondaryTypeRule = new ArrayList<>();
            }
            return this.secondaryTypeRule;
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
         *         <element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v54_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/>
         *       </sequence>
         *       <attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicationLimit"
        })
        public static class SecondaryTypeRule {

            @XmlElement(name = "ApplicationLimit", namespace = "http://www.travelport.com/schema/common_v54_0")
            protected List<OptionalServiceApplicationLimitType> applicationLimit;
            /**
             * The unique type to associate a secondary type in an optional service
             * 
             */
            @XmlAttribute(name = "SecondaryType", required = true)
            protected String secondaryType;

            /**
             * Gets the value of the applicationLimit property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationLimit property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getApplicationLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionalServiceApplicationLimitType }
             * </p>
             * 
             * 
             * @return
             *     The value of the applicationLimit property.
             */
            public List<OptionalServiceApplicationLimitType> getApplicationLimit() {
                if (applicationLimit == null) {
                    applicationLimit = new ArrayList<>();
                }
                return this.applicationLimit;
            }

            /**
             * The unique type to associate a secondary type in an optional service
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecondaryType() {
                return secondaryType;
            }

            /**
             * Sets the value of the secondaryType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getSecondaryType()
             */
            public void setSecondaryType(String value) {
                this.secondaryType = value;
            }

        }

    }

}
