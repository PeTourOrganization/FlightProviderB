
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *       <attribute name="Sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Document")
public class Document {

    /**
     * Sequence number for the document.
     * 
     */
    @XmlAttribute(name = "Sequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequence;
    /**
     * Type of the Document. Visa, Passport,
     *                         DriverLicense etc.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Applicability level of the Document.
     *                         Required, Supported, API_Supported or Unknown.
     * 
     */
    @XmlAttribute(name = "Level")
    protected String level;

    /**
     * Sequence number for the document.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSequence()
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Type of the Document. Visa, Passport,
     *                         DriverLicense etc.
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
     * Applicability level of the Document.
     *                         Required, Supported, API_Supported or Unknown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLevel()
     */
    public void setLevel(String value) {
        this.level = value;
    }

}
