
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Characteristic" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Status" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeStatusCode" />
 *       <attribute name="Seat" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="RailSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CoachNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "characteristic"
})
@XmlRootElement(name = "RailSeatAssignment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class RailSeatAssignment {

    /**
     * Identifies the characteristics of the seat with seat type, value and description.
     * 
     */
    @XmlElement(name = "Characteristic", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Characteristic2> characteristic;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "Seat", required = true)
    protected String seat;
    @XmlAttribute(name = "RailSegmentRef")
    protected String railSegmentRef;
    @XmlAttribute(name = "CoachNumber")
    protected String coachNumber;
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
     * Identifies the characteristics of the seat with seat type, value and description.
     * 
     * Gets the value of the characteristic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic2 }
     * </p>
     * 
     * 
     * @return
     *     The value of the characteristic property.
     */
    public List<Characteristic2> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<>();
        }
        return this.characteristic;
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
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeat(String value) {
        this.seat = value;
    }

    /**
     * Gets the value of the railSegmentRef property.
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
     */
    public void setRailSegmentRef(String value) {
        this.railSegmentRef = value;
    }

    /**
     * Gets the value of the coachNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachNumber() {
        return coachNumber;
    }

    /**
     * Sets the value of the coachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoachNumber(String value) {
        this.coachNumber = value;
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
