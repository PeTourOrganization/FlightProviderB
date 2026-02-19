
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
 *       <attribute name="CreditCardType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CreditCardNumber" type="{http://www.travelport.com/schema/common_v54_0}typeCreditCardNumber" />
 *       <attribute name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" />
 *       <attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Category" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="AcceptanceOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MiscFormOfPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MiscFormOfPayment {

    /**
     * The 2 letter credit/ debit card type or code which may not have been issued using the standard bank card types  - i.e. an airline issued card
     * 
     */
    @XmlAttribute(name = "CreditCardType")
    protected String creditCardType;
    @XmlAttribute(name = "CreditCardNumber")
    protected String creditCardNumber;
    /**
     * The Expiration date of this card in YYYY-MM format.
     * 
     */
    @XmlAttribute(name = "ExpDate")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar expDate;
    /**
     * Any free form text which may be associated with the Miscellaneous Form of Payment. This text may be provider or GDS specific
     * 
     */
    @XmlAttribute(name = "Text")
    protected String text;
    /**
     * Allowable values are
     *                         "Text"
     *                         "Credit"
     *                         "CreditCard"
     *                         "FreeFormCreditCard"
     *                         "Invoice"
     *                         "NonRefundable"
     *                         "MultipleReceivables"
     *                         "Exchange"
     *                         "Cash"
     * 
     */
    @XmlAttribute(name = "Category", required = true)
    protected String category;
    /**
     * Override airline restriction on the credit card.
     * 
     */
    @XmlAttribute(name = "AcceptanceOverride")
    protected Boolean acceptanceOverride;

    /**
     * The 2 letter credit/ debit card type or code which may not have been issued using the standard bank card types  - i.e. an airline issued card
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreditCardType()
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * The Expiration date of this card in YYYY-MM format.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExpDate()
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Any free form text which may be associated with the Miscellaneous Form of Payment. This text may be provider or GDS specific
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Allowable values are
     *                         "Text"
     *                         "Credit"
     *                         "CreditCard"
     *                         "FreeFormCreditCard"
     *                         "Invoice"
     *                         "NonRefundable"
     *                         "MultipleReceivables"
     *                         "Exchange"
     *                         "Cash"
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
     * Override airline restriction on the credit card.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptanceOverride() {
        return acceptanceOverride;
    }

    /**
     * Sets the value of the acceptanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAcceptanceOverride()
     */
    public void setAcceptanceOverride(Boolean value) {
        this.acceptanceOverride = value;
    }

}
