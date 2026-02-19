
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrDocument"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VoidDocumentInfo")
public class VoidDocumentInfo {

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
