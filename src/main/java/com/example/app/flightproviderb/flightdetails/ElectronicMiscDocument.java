
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMDCoupon" maxOccurs="999"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/air_v54_0}attrEMDSummary"/>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrElementKeyResults"/>
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "emdCoupon"
})
@XmlRootElement(name = "ElectronicMiscDocument")
public class ElectronicMiscDocument {

    /**
     * The coupon information for the EMD issued.
     * 
     */
    @XmlElement(name = "EMDCoupon", required = true)
    protected List<EMDCoupon> emdCoupon;
    /**
     * Status of the EMD calculated on the basis of coupon status. Possible values Open, Void, Refunded, Exchanged, Irregular Operations,Airport Control, Checked In, Flown/Used, Boarded/Lifted, Suspended, Unknown
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;
    /**
     * System generated Key
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * EMD Number
     * 
     */
    @XmlAttribute(name = "Number", required = true)
    protected String number;
    /**
     * Indicates whether the EMD is a primary EMD.
     * 
     */
    @XmlAttribute(name = "PrimaryDocumentIndicator")
    protected Boolean primaryDocumentIndicator;
    /**
     * Returns the number of the Primary EMD, if this EMD is a conjunctive EMD
     * 
     */
    @XmlAttribute(name = "InConjunctionWith")
    protected String inConjunctionWith;
    /**
     * This number indicates the e-Ticket number associated with this EMD
     * 
     */
    @XmlAttribute(name = "AssociatedTicketNumber")
    protected String associatedTicketNumber;
    /**
     * Plating carrier code for which this EMD is issued
     * 
     */
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    /**
     * Issue Date for this EMD
     * 
     */
    @XmlAttribute(name = "IssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
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
     * The coupon information for the EMD issued.
     * 
     * Gets the value of the emdCoupon property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdCoupon property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEMDCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDCoupon }
     * </p>
     * 
     * 
     * @return
     *     The value of the emdCoupon property.
     */
    public List<EMDCoupon> getEMDCoupon() {
        if (emdCoupon == null) {
            emdCoupon = new ArrayList<>();
        }
        return this.emdCoupon;
    }

    /**
     * Status of the EMD calculated on the basis of coupon status. Possible values Open, Void, Refunded, Exchanged, Irregular Operations,Airport Control, Checked In, Flown/Used, Boarded/Lifted, Suspended, Unknown
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
     * System generated Key
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
     * EMD Number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Indicates whether the EMD is a primary EMD.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryDocumentIndicator() {
        return primaryDocumentIndicator;
    }

    /**
     * Sets the value of the primaryDocumentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrimaryDocumentIndicator()
     */
    public void setPrimaryDocumentIndicator(Boolean value) {
        this.primaryDocumentIndicator = value;
    }

    /**
     * Returns the number of the Primary EMD, if this EMD is a conjunctive EMD
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConjunctionWith() {
        return inConjunctionWith;
    }

    /**
     * Sets the value of the inConjunctionWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInConjunctionWith()
     */
    public void setInConjunctionWith(String value) {
        this.inConjunctionWith = value;
    }

    /**
     * This number indicates the e-Ticket number associated with this EMD
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedTicketNumber() {
        return associatedTicketNumber;
    }

    /**
     * Sets the value of the associatedTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssociatedTicketNumber()
     */
    public void setAssociatedTicketNumber(String value) {
        this.associatedTicketNumber = value;
    }

    /**
     * Plating carrier code for which this EMD is issued
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlatingCarrier()
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Issue Date for this EMD
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getIssueDate()
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
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
