
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
 *       <attribute name="ElementName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="OriginalKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="NewKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "KeyMapping", namespace = "http://www.travelport.com/schema/common_v54_0")
public class KeyMapping {

    /**
     * Name of the element.
     * 
     */
    @XmlAttribute(name = "ElementName", required = true)
    protected String elementName;
    /**
     * The mapping key which is sent in the request.
     * 
     */
    @XmlAttribute(name = "OriginalKey", required = true)
    protected String originalKey;
    /**
     * The mapping key that comes in the response.
     * 
     */
    @XmlAttribute(name = "NewKey", required = true)
    protected String newKey;

    /**
     * Name of the element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getElementName()
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

    /**
     * The mapping key which is sent in the request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalKey() {
        return originalKey;
    }

    /**
     * Sets the value of the originalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginalKey()
     */
    public void setOriginalKey(String value) {
        this.originalKey = value;
    }

    /**
     * The mapping key that comes in the response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewKey() {
        return newKey;
    }

    /**
     * Sets the value of the newKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNewKey()
     */
    public void setNewKey(String value) {
        this.newKey = value;
    }

}
