
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PhoneNumber"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TermConditions" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="IncludeCoverSheet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="To" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="From" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DeptBillingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phoneNumber",
    "termConditions",
    "remark"
})
@XmlRootElement(name = "FaxDetails")
public class FaxDetails {

    /**
     * Send type as Fax for fax number.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected PhoneNumber phoneNumber;
    /**
     * Term and Conditions for the fax .
     * 
     */
    @XmlElement(name = "TermConditions")
    protected TermConditions termConditions;
    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Remark> remark;
    /**
     * Specifies whether to include a cover page with fax or not.
     * 
     */
    @XmlAttribute(name = "IncludeCoverSheet")
    protected Boolean includeCoverSheet;
    /**
     * To address.
     * 
     */
    @XmlAttribute(name = "To")
    protected String to;
    /**
     * From address.
     * 
     */
    @XmlAttribute(name = "From")
    protected String from;
    /**
     * Department billing code.
     * 
     */
    @XmlAttribute(name = "DeptBillingCode")
    protected String deptBillingCode;
    /**
     * Invoice number.
     * 
     */
    @XmlAttribute(name = "InvoiceNumber")
    protected String invoiceNumber;

    /**
     * Send type as Fax for fax number.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     * @see #getPhoneNumber()
     */
    public void setPhoneNumber(PhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Term and Conditions for the fax .
     * 
     * @return
     *     possible object is
     *     {@link TermConditions }
     *     
     */
    public TermConditions getTermConditions() {
        return termConditions;
    }

    /**
     * Sets the value of the termConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermConditions }
     *     
     * @see #getTermConditions()
     */
    public void setTermConditions(TermConditions value) {
        this.termConditions = value;
    }

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

    /**
     * Specifies whether to include a cover page with fax or not.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCoverSheet() {
        return includeCoverSheet;
    }

    /**
     * Sets the value of the includeCoverSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeCoverSheet()
     */
    public void setIncludeCoverSheet(Boolean value) {
        this.includeCoverSheet = value;
    }

    /**
     * To address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTo()
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * From address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFrom()
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Department billing code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptBillingCode() {
        return deptBillingCode;
    }

    /**
     * Sets the value of the deptBillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeptBillingCode()
     */
    public void setDeptBillingCode(String value) {
        this.deptBillingCode = value;
    }

    /**
     * Invoice number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInvoiceNumber()
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

}
