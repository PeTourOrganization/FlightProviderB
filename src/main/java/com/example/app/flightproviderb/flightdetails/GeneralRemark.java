
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element name="RemarkData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrProviderSupplier"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Category">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="20"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TypeInGds" type="{http://www.travelport.com/schema/common_v54_0}typeGdsRemark" />
 *       <attribute name="SupplierType" type="{http://www.travelport.com/schema/common_v54_0}typeProduct" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Direction" type="{http://www.travelport.com/schema/common_v54_0}typeDirection" />
 *       <attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="UseProviderNativeMode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "remarkData",
    "bookingTravelerRef"
})
@XmlRootElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
public class GeneralRemark {

    /**
     * Actual remarks data.
     * 
     */
    @XmlElement(name = "RemarkData", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected String remarkData;
    /**
     * Reference to Booking Traveler.
     * 
     */
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> bookingTravelerRef;
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * A category to group and organize the various remarks. This is not required, but it is recommended.
     * 
     */
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "TypeInGds")
    protected String typeInGds;
    /**
     * The type of product this reservation is relative to
     * 
     */
    @XmlAttribute(name = "SupplierType")
    protected TypeProduct supplierType;
    /**
     * Provider reservation reference key.
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * Direction Incoming or Outgoing of the GeneralRemark.
     * 
     */
    @XmlAttribute(name = "Direction")
    protected TypeDirection direction;
    /**
     * The date and time that this GeneralRemark was created.
     * 
     */
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    /**
     * Will be true when terminal process required, else false
     * 
     */
    @XmlAttribute(name = "UseProviderNativeMode")
    protected Boolean useProviderNativeMode;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
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
     * Actual remarks data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkData() {
        return remarkData;
    }

    /**
     * Sets the value of the remarkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRemarkData()
     */
    public void setRemarkData(String value) {
        this.remarkData = value;
    }

    /**
     * Reference to Booking Traveler.
     * 
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingTravelerRef property.
     */
    public List<String> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<>();
        }
        return this.bookingTravelerRef;
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
     * A category to group and organize the various remarks. This is not required, but it is recommended.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategory()
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the typeInGds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInGds() {
        return typeInGds;
    }

    /**
     * Sets the value of the typeInGds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInGds(String value) {
        this.typeInGds = value;
    }

    /**
     * The type of product this reservation is relative to
     * 
     * @return
     *     possible object is
     *     {@link TypeProduct }
     *     
     */
    public TypeProduct getSupplierType() {
        return supplierType;
    }

    /**
     * Sets the value of the supplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProduct }
     *     
     * @see #getSupplierType()
     */
    public void setSupplierType(TypeProduct value) {
        this.supplierType = value;
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
     * Direction Incoming or Outgoing of the GeneralRemark.
     * 
     * @return
     *     possible object is
     *     {@link TypeDirection }
     *     
     */
    public TypeDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDirection }
     *     
     * @see #getDirection()
     */
    public void setDirection(TypeDirection value) {
        this.direction = value;
    }

    /**
     * The date and time that this GeneralRemark was created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreateDate()
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Will be true when terminal process required, else false
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseProviderNativeMode() {
        if (useProviderNativeMode == null) {
            return false;
        } else {
            return useProviderNativeMode;
        }
    }

    /**
     * Sets the value of the useProviderNativeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUseProviderNativeMode()
     */
    public void setUseProviderNativeMode(Boolean value) {
        this.useProviderNativeMode = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
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
