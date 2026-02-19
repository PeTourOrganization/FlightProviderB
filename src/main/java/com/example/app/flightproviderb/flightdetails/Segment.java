
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The base segment type
 * 
 * <p>Java class for Segment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Segment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SegmentRemark" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Passive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="ProviderSegmentOrder">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <maxInclusive value="999"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "segmentRemark"
})
@XmlSeeAlso({
    TypeBaseAirSegment.class,
    TravelSegment.class,
    RailSegment.class
})
public class Segment {

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "SegmentRemark")
    protected List<SegmentRemark> segmentRemark;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * Status of this segment.
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Passive")
    protected Boolean passive;
    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel segments/reservations based on travel dates. This ordering is applicable across the UR not provider or traveler specific
     * 
     */
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;
    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel/Rail segments/reservations in the provider reservation.
     * 
     */
    @XmlAttribute(name = "ProviderSegmentOrder")
    protected BigInteger providerSegmentOrder;
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
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the segmentRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSegmentRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the segmentRemark property.
     */
    public List<SegmentRemark> getSegmentRemark() {
        if (segmentRemark == null) {
            segmentRemark = new ArrayList<>();
        }
        return this.segmentRemark;
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
     * Status of this segment.
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
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassive() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassive(Boolean value) {
        this.passive = value;
    }

    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel segments/reservations based on travel dates. This ordering is applicable across the UR not provider or traveler specific
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTravelOrder()
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }

    /**
     * To identify the appropriate travel sequence for Air/Car/Hotel/Rail segments/reservations in the provider reservation.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProviderSegmentOrder() {
        return providerSegmentOrder;
    }

    /**
     * Sets the value of the providerSegmentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getProviderSegmentOrder()
     */
    public void setProviderSegmentOrder(BigInteger value) {
        this.providerSegmentOrder = value;
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
