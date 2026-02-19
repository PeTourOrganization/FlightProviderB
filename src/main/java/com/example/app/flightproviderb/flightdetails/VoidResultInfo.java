
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="FailureRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrDocument"/>
 *       <attribute name="ResultType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "failureRemark"
})
@XmlRootElement(name = "VoidResultInfo")
public class VoidResultInfo {

    /**
     * Container to show all provider failure information.
     * 
     */
    @XmlElement(name = "FailureRemark")
    protected String failureRemark;
    /**
     * Successful Or Failed result indicator.
     * 
     */
    @XmlAttribute(name = "ResultType")
    protected String resultType;
    /**
     * Identifies the document number to be voided.
     * 
     */
    @XmlAttribute(name = "DocumentNumber")
    protected String documentNumber;
    /**
     * Identifies the document type to be voided, Document Type can have four values like Service Fee, Paper Ticket , MCO and E-Ticket.
     * 
     */
    @XmlAttribute(name = "DocumentType")
    protected String documentType;

    /**
     * Container to show all provider failure information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureRemark() {
        return failureRemark;
    }

    /**
     * Sets the value of the failureRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFailureRemark()
     */
    public void setFailureRemark(String value) {
        this.failureRemark = value;
    }

    /**
     * Successful Or Failed result indicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResultType()
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

    /**
     * Identifies the document number to be voided.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentNumber()
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Identifies the document type to be voided, Document Type can have four values like Service Fee, Paper Ticket , MCO and E-Ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentType()
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

}
