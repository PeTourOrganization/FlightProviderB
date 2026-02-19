
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
 *       <attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="IncludeExcludeUseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DocId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="AllowedIds" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DocumentRequired")
public class DocumentRequired {

    @XmlAttribute(name = "DocType")
    protected String docType;
    @XmlAttribute(name = "IncludeExcludeUseInd")
    protected Boolean includeExcludeUseInd;
    @XmlAttribute(name = "DocId")
    protected String docId;
    @XmlAttribute(name = "AllowedIds")
    protected String allowedIds;

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the includeExcludeUseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExcludeUseInd() {
        return includeExcludeUseInd;
    }

    /**
     * Sets the value of the includeExcludeUseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExcludeUseInd(Boolean value) {
        this.includeExcludeUseInd = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the allowedIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedIds() {
        return allowedIds;
    }

    /**
     * Sets the value of the allowedIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedIds(String value) {
        this.allowedIds = value;
    }

}
