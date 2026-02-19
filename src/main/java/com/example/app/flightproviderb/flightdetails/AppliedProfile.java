
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TravelerID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TravelerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ImmediateParentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ImmediateParentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AppliedProfile", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AppliedProfile {

    /**
     * Key for update/delete of the element
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * The ID of the TravelerProfile that was applied
     * 
     */
    @XmlAttribute(name = "TravelerID")
    protected String travelerID;
    /**
     * The name from the TravelerProfile that was applied
     * 
     */
    @XmlAttribute(name = "TravelerName")
    protected String travelerName;
    /**
     * The ID of the AccountProfile that was applied
     * 
     */
    @XmlAttribute(name = "AccountID")
    protected String accountID;
    /**
     * The name from the AccountProfile that was applied
     * 
     */
    @XmlAttribute(name = "AccountName")
    protected String accountName;
    /**
     * The ID of the immediate parent that was applied
     * 
     */
    @XmlAttribute(name = "ImmediateParentID")
    protected String immediateParentID;
    /**
     * The name of the immediate parent that was applied
     * 
     */
    @XmlAttribute(name = "ImmediateParentName")
    protected String immediateParentName;
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
     * Key for update/delete of the element
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
     * The ID of the TravelerProfile that was applied
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerID() {
        return travelerID;
    }

    /**
     * Sets the value of the travelerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelerID()
     */
    public void setTravelerID(String value) {
        this.travelerID = value;
    }

    /**
     * The name from the TravelerProfile that was applied
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerName() {
        return travelerName;
    }

    /**
     * Sets the value of the travelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelerName()
     */
    public void setTravelerName(String value) {
        this.travelerName = value;
    }

    /**
     * The ID of the AccountProfile that was applied
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountID()
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * The name from the AccountProfile that was applied
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountName()
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * The ID of the immediate parent that was applied
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediateParentID() {
        return immediateParentID;
    }

    /**
     * Sets the value of the immediateParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getImmediateParentID()
     */
    public void setImmediateParentID(String value) {
        this.immediateParentID = value;
    }

    /**
     * The name of the immediate parent that was applied
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediateParentName() {
        return immediateParentName;
    }

    /**
     * Sets the value of the immediateParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getImmediateParentName()
     */
    public void setImmediateParentName(String value) {
        this.immediateParentName = value;
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
