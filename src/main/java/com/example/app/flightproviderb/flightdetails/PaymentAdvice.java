
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="DocumentNumber" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="22"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="IssueDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="IssueCity" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="OriginalFOP">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="19"/>
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
@XmlType(name = "")
@XmlRootElement(name = "PaymentAdvice", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PaymentAdvice {

    /**
     * Other Payment Yype. Possible Values: AGC - Agency
     * 						Check, AGG - Agency Guarantee, AWC - Award Check, CSH - Cash
     * 						Equivalent, DBC - Denied Boarding Compensation, MCO -
     * 						Miscellaneous Charge Order, TOO - Tour Order, TOV - Tour Voucher
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Payment Document Number Examples: 1234567890,
     * 						R7777
     * 
     */
    @XmlAttribute(name = "DocumentNumber", required = true)
    protected String documentNumber;
    /**
     * Document Issuance date
     * 
     */
    @XmlAttribute(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    /**
     * City code of document issuance
     * 
     */
    @XmlAttribute(name = "IssueCity", required = true)
    protected String issueCity;
    /**
     * Original form of payment Examples: CHECK 3500
     * 
     */
    @XmlAttribute(name = "OriginalFOP")
    protected String originalFOP;

    /**
     * Other Payment Yype. Possible Values: AGC - Agency
     * 						Check, AGG - Agency Guarantee, AWC - Award Check, CSH - Cash
     * 						Equivalent, DBC - Denied Boarding Compensation, MCO -
     * 						Miscellaneous Charge Order, TOO - Tour Order, TOV - Tour Voucher
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Payment Document Number Examples: 1234567890,
     * 						R7777
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
     * Document Issuance date
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
     * City code of document issuance
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCity() {
        return issueCity;
    }

    /**
     * Sets the value of the issueCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssueCity()
     */
    public void setIssueCity(String value) {
        this.issueCity = value;
    }

    /**
     * Original form of payment Examples: CHECK 3500
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFOP() {
        return originalFOP;
    }

    /**
     * Sets the value of the originalFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalFOP()
     */
    public void setOriginalFOP(String value) {
        this.originalFOP = value;
    }

}
