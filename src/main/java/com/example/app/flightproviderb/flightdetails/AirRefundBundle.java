
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirRefundInfo"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Name" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}WaiverCode" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PTC" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="RefundType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Auto"/>
 *             <enumeration value="Manual"/>
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
    "airRefundInfo",
    "name",
    "taxInfo",
    "waiverCode"
})
@XmlRootElement(name = "AirRefundBundle")
public class AirRefundBundle {

    /**
     * Provides results of a refund quote
     * 
     */
    @XmlElement(name = "AirRefundInfo", required = true)
    protected AirRefundInfo airRefundInfo;
    /**
     * Complete name fields
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Name> name;
    /**
     * The tax information for a
     * 
     */
    @XmlElement(name = "TaxInfo", required = true)
    protected List<TypeTaxInfo> taxInfo;
    /**
     * Waiver code to override fare validations
     * 
     */
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    /**
     * Specifies the passenger type code for 1P
     * 
     */
    @XmlAttribute(name = "PTC")
    @XmlSchemaType(name = "anySimpleType")
    protected String ptc;
    /**
     * Specifies whether this bundle was auto
     *                         or manually generated
     * 
     */
    @XmlAttribute(name = "RefundType")
    protected String refundType;

    /**
     * Provides results of a refund quote
     * 
     * @return
     *     possible object is
     *     {@link AirRefundInfo }
     *     
     */
    public AirRefundInfo getAirRefundInfo() {
        return airRefundInfo;
    }

    /**
     * Sets the value of the airRefundInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundInfo }
     *     
     * @see #getAirRefundInfo()
     */
    public void setAirRefundInfo(AirRefundInfo value) {
        this.airRefundInfo = value;
    }

    /**
     * Complete name fields
     * 
     * Gets the value of the name property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * </p>
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * The tax information for a
     * 
     * Gets the value of the taxInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxInfo property.
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<>();
        }
        return this.taxInfo;
    }

    /**
     * Waiver code to override fare validations
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     * @see #getWaiverCode()
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Specifies the passenger type code for 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPTC()
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Specifies whether this bundle was auto
     *                         or manually generated
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundType()
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

}
