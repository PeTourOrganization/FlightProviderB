
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentRef" maxOccurs="999" minOccurs="0"/>
 *         <element name="SvcSegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="RFIC">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="1"/>
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
@XmlType(name = "", propOrder = {
    "airSegmentRef",
    "svcSegmentRef"
})
@XmlRootElement(name = "SelectionModifiers")
public class SelectionModifiers {

    /**
     * References to airsegments for which EMDs will be generated on all the associated services.
     * 
     */
    @XmlElement(name = "AirSegmentRef")
    protected List<AirSegmentRef> airSegmentRef;
    /**
     * SVC segment reference to which the EMD is being issued
     * 
     */
    @XmlElement(name = "SvcSegmentRef")
    protected List<String> svcSegmentRef;
    /**
     * Supplier/Vendor code for which EMDs will be generated on all the associated services. Required if PNR contains more than one supplier.
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * Reason for issuance code for which EMDs will be generated on all the associated services.
     * 
     */
    @XmlAttribute(name = "RFIC")
    protected String rfic;

    /**
     * References to airsegments for which EMDs will be generated on all the associated services.
     * 
     * Gets the value of the airSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentRef property.
     */
    public List<AirSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<>();
        }
        return this.airSegmentRef;
    }

    /**
     * SVC segment reference to which the EMD is being issued
     * 
     * Gets the value of the svcSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSvcSegmentRef().add(newItem);
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
     *     The value of the svcSegmentRef property.
     */
    public List<String> getSvcSegmentRef() {
        if (svcSegmentRef == null) {
            svcSegmentRef = new ArrayList<>();
        }
        return this.svcSegmentRef;
    }

    /**
     * Supplier/Vendor code for which EMDs will be generated on all the associated services. Required if PNR contains more than one supplier.
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
     * Reason for issuance code for which EMDs will be generated on all the associated services.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIC()
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

}
