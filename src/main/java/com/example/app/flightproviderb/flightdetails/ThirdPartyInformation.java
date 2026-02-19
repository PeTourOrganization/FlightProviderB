
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
 *         <element name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeGeneralReference" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="ThirdPartyCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="2"/>
 *             <maxLength value="5"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ThirdPartyLocatorCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="36"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ThirdPartyName" type="{http://www.travelport.com/schema/common_v54_0}typeThirdPartySupplier" />
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
    "segmentRef"
})
@XmlRootElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ThirdPartyInformation {

    /**
     * Air/Passive Segment Reference
     * 
     */
    @XmlElement(name = "SegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeGeneralReference> segmentRef;
    /**
     * Third party supplier code.
     * 
     */
    @XmlAttribute(name = "ThirdPartyCode")
    protected String thirdPartyCode;
    /**
     * Confirmation number for third party supplier.
     * 
     */
    @XmlAttribute(name = "ThirdPartyLocatorCode")
    protected String thirdPartyLocatorCode;
    /**
     * Third party supplier name.
     * 
     */
    @XmlAttribute(name = "ThirdPartyName")
    protected String thirdPartyName;
    /**
     * Provider Reservation  reference
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Unique identifier of the third party supplier. Key can be used to modify or delete saved third party information.
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
     * Air/Passive Segment Reference
     * 
     * Gets the value of the segmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGeneralReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the segmentRef property.
     */
    public List<TypeGeneralReference> getSegmentRef() {
        if (segmentRef == null) {
            segmentRef = new ArrayList<>();
        }
        return this.segmentRef;
    }

    /**
     * Third party supplier code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCode() {
        return thirdPartyCode;
    }

    /**
     * Sets the value of the thirdPartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getThirdPartyCode()
     */
    public void setThirdPartyCode(String value) {
        this.thirdPartyCode = value;
    }

    /**
     * Confirmation number for third party supplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyLocatorCode() {
        return thirdPartyLocatorCode;
    }

    /**
     * Sets the value of the thirdPartyLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getThirdPartyLocatorCode()
     */
    public void setThirdPartyLocatorCode(String value) {
        this.thirdPartyLocatorCode = value;
    }

    /**
     * Third party supplier name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyName() {
        return thirdPartyName;
    }

    /**
     * Sets the value of the thirdPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getThirdPartyName()
     */
    public void setThirdPartyName(String value) {
        this.thirdPartyName = value;
    }

    /**
     * Provider Reservation  reference
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
     * Unique identifier of the third party supplier. Key can be used to modify or delete saved third party information.
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
