
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseReservation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseReservation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountingRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}GeneralRemark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Restriction" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PassiveInfo" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *       <attribute name="CreateDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ModifiedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReservation", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "accountingRemark",
    "generalRemark",
    "restriction",
    "passiveInfo"
})
@XmlSeeAlso({
    RailReservation.class,
    TypeBaseAirReservation.class
})
public class BaseReservation {

    /**
     * An accounting remark container to hold any
     *             printable text.
     * 
     */
    @XmlElement(name = "AccountingRemark")
    protected List<AccountingRemark> accountingRemark;
    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "GeneralRemark")
    protected List<GeneralRemark> generalRemark;
    /**
     * Which activities are supported for a particular element
     * 
     */
    @XmlElement(name = "Restriction")
    protected List<Restriction> restriction;
    /**
     * Used by CreateReservationReq for passing in elements normally found post-booking
     * 
     */
    @XmlElement(name = "PassiveInfo")
    protected PassiveInfo passiveInfo;
    /**
     * The unique identifier for this reservation. If this is this View Only UR LocatorCode is '999999'.
     * 
     */
    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;
    /**
     * The date and time that this reservation was created.
     * 
     */
    @XmlAttribute(name = "CreateDate", required = true)
    protected String createDate;
    /**
     * The date and time that this reservation was last modified for any reason.
     * 
     */
    @XmlAttribute(name = "ModifiedDate", required = true)
    protected String modifiedDate;
    @XmlAttribute(name = "CustomerNumber")
    protected String customerNumber;

    /**
     * An accounting remark container to hold any
     *             printable text.
     * 
     * Gets the value of the accountingRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountingRemark property.
     */
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<>();
        }
        return this.accountingRemark;
    }

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the generalRemark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * </p>
     * 
     * 
     * @return
     *     The value of the generalRemark property.
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<>();
        }
        return this.generalRemark;
    }

    /**
     * Which activities are supported for a particular element
     * 
     * Gets the value of the restriction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * </p>
     * 
     * 
     * @return
     *     The value of the restriction property.
     */
    public List<Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<>();
        }
        return this.restriction;
    }

    /**
     * Used by CreateReservationReq for passing in elements normally found post-booking
     * 
     * @return
     *     possible object is
     *     {@link PassiveInfo }
     *     
     */
    public PassiveInfo getPassiveInfo() {
        return passiveInfo;
    }

    /**
     * Sets the value of the passiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveInfo }
     *     
     * @see #getPassiveInfo()
     */
    public void setPassiveInfo(PassiveInfo value) {
        this.passiveInfo = value;
    }

    /**
     * The unique identifier for this reservation. If this is this View Only UR LocatorCode is '999999'.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocatorCode()
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * The date and time that this reservation was created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreateDate()
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * The date and time that this reservation was last modified for any reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModifiedDate()
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

}
