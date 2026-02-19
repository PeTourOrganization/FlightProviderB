
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
 *         <element name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeGeneralReference" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="SupplierLocatorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlRootElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v54_0")
public class SupplierLocator {

    /**
     * Air/Passive Segment Reference
     * 
     */
    @XmlElement(name = "SegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<TypeGeneralReference> segmentRef;
    /**
     * Carrier Code
     * 
     */
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;
    /**
     * Carrier reservation locator code
     * 
     */
    @XmlAttribute(name = "SupplierLocatorCode", required = true)
    protected String supplierLocatorCode;
    /**
     * Provider Reservation  reference
     * 
     */
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    /**
     * The Date and Time which the reservation is received from the Vendor as a SupplierLocator creation Date.
     * 
     */
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;

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
     * Carrier Code
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
     * @see #getSupplierCode()
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Carrier reservation locator code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierLocatorCode() {
        return supplierLocatorCode;
    }

    /**
     * Sets the value of the supplierLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSupplierLocatorCode()
     */
    public void setSupplierLocatorCode(String value) {
        this.supplierLocatorCode = value;
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
     * The Date and Time which the reservation is received from the Vendor as a SupplierLocator creation Date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreateDateTime()
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

}
