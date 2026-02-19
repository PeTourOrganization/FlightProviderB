
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Document" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="GenderRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DateOfBirthRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RequiredDocuments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NationalityRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document"
})
@XmlRootElement(name = "APISRequirements")
public class APISRequirements {

    /**
     * APIS Document Details.
     * 
     */
    @XmlElement(name = "Document")
    protected List<Document> document;
    /**
     * Unique identifier for this APIS
     *                         Requirements - use this key when a single APIS Requirements is
     *                         shared by multiple elements.
     * 
     */
    @XmlAttribute(name = "Key")
    @XmlSchemaType(name = "anySimpleType")
    protected String key;
    /**
     * Applicability level of the Document.
     *                         Required, Supported, API_Supported or Unknown
     * 
     */
    @XmlAttribute(name = "Level")
    protected String level;
    @XmlAttribute(name = "GenderRequired")
    protected Boolean genderRequired;
    @XmlAttribute(name = "DateOfBirthRequired")
    protected Boolean dateOfBirthRequired;
    /**
     * What are required documents for the APIS
     *                         Requirement. One, FirstAndOneOther or All
     * 
     */
    @XmlAttribute(name = "RequiredDocuments")
    protected String requiredDocuments;
    /**
     * Nationality of the traveler is required for booking for some suppliers.
     * 
     */
    @XmlAttribute(name = "NationalityRequired")
    protected Boolean nationalityRequired;

    /**
     * APIS Document Details.
     * 
     * Gets the value of the document property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * </p>
     * 
     * 
     * @return
     *     The value of the document property.
     */
    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<>();
        }
        return this.document;
    }

    /**
     * Unique identifier for this APIS
     *                         Requirements - use this key when a single APIS Requirements is
     *                         shared by multiple elements.
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
     * Applicability level of the Document.
     *                         Required, Supported, API_Supported or Unknown
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

    /**
     * Gets the value of the genderRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenderRequired() {
        return genderRequired;
    }

    /**
     * Sets the value of the genderRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenderRequired(Boolean value) {
        this.genderRequired = value;
    }

    /**
     * Gets the value of the dateOfBirthRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateOfBirthRequired() {
        return dateOfBirthRequired;
    }

    /**
     * Sets the value of the dateOfBirthRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateOfBirthRequired(Boolean value) {
        this.dateOfBirthRequired = value;
    }

    /**
     * What are required documents for the APIS
     *                         Requirement. One, FirstAndOneOther or All
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDocuments() {
        return requiredDocuments;
    }

    /**
     * Sets the value of the requiredDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequiredDocuments()
     */
    public void setRequiredDocuments(String value) {
        this.requiredDocuments = value;
    }

    /**
     * Nationality of the traveler is required for booking for some suppliers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNationalityRequired() {
        return nationalityRequired;
    }

    /**
     * Sets the value of the nationalityRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNationalityRequired()
     */
    public void setNationalityRequired(Boolean value) {
        this.nationalityRequired = value;
    }

}
