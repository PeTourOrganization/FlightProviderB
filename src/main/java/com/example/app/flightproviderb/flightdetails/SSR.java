
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeSSRCode" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="FreeText" type="{http://www.travelport.com/schema/common_v54_0}typeSSRFreeText" />
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="CarrierSpecificText">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="64"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderDefinedType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="16"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SSRRuleRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProfileSecureFlightDocKey" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v54_0")
public class SSR {

    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * Reference to the air segment. May be required for some Types.
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    /**
     * Reference to the passive segment.
     * 
     */
    @XmlAttribute(name = "PassiveSegmentRef")
    protected String passiveSegmentRef;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Programmatic SSRs use codes recognized by the provider/supplier (example, VGML=vegetarian meal code). Manual SSRs do not have an associated programmatic code.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Status")
    protected String status;
    /**
     * Certain SSR types will require a free text message. For example MAAS (Meet and assist).
     * 
     */
    @XmlAttribute(name = "FreeText")
    protected String freeText;
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    /**
     * Carrier specific information which are not captured in the FreeText field(not present in IATA's standard SSR DOCO format). An example is VISA Expiration Date.
     * 
     */
    @XmlAttribute(name = "CarrierSpecificText")
    protected String carrierSpecificText;
    @XmlAttribute(name = "Description")
    protected String description;
    /**
     * Original Type as sent by the provider
     * 
     */
    @XmlAttribute(name = "ProviderDefinedType")
    protected String providerDefinedType;
    /**
     * UniqueID to associate a rule to the SSR
     * 
     */
    @XmlAttribute(name = "SSRRuleRef")
    protected String ssrRuleRef;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    /**
     * Key assigned for Secure Flight Document value from the specified profile
     * 
     */
    @XmlAttribute(name = "ProfileID")
    protected String profileID;
    /**
     * Unique ID of Booking Traveler's Profile that contains the Secure flight Detail
     * 
     */
    @XmlAttribute(name = "ProfileSecureFlightDocKey")
    protected String profileSecureFlightDocKey;
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
     * Reference to the air segment. May be required for some Types.
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
     * Reference to the passive segment.
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
     * Provider reservation reference key.
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
     * Programmatic SSRs use codes recognized by the provider/supplier (example, VGML=vegetarian meal code). Manual SSRs do not have an associated programmatic code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
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
     * Certain SSR types will require a free text message. For example MAAS (Meet and assist).
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
     * @see #getFreeText()
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Carrier specific information which are not captured in the FreeText field(not present in IATA's standard SSR DOCO format). An example is VISA Expiration Date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierSpecificText() {
        return carrierSpecificText;
    }

    /**
     * Sets the value of the carrierSpecificText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierSpecificText()
     */
    public void setCarrierSpecificText(String value) {
        this.carrierSpecificText = value;
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
     * Original Type as sent by the provider
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderDefinedType()
     */
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
    }

    /**
     * UniqueID to associate a rule to the SSR
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRRuleRef() {
        return ssrRuleRef;
    }

    /**
     * Sets the value of the ssrRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSSRRuleRef()
     */
    public void setSSRRuleRef(String value) {
        this.ssrRuleRef = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Key assigned for Secure Flight Document value from the specified profile
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileID()
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Unique ID of Booking Traveler's Profile that contains the Secure flight Detail
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileSecureFlightDocKey() {
        return profileSecureFlightDocKey;
    }

    /**
     * Sets the value of the profileSecureFlightDocKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileSecureFlightDocKey()
     */
    public void setProfileSecureFlightDocKey(String value) {
        this.profileSecureFlightDocKey = value;
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
