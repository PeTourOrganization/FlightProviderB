
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The attributes and elements in a SubKey.
 * 
 * <p>Java class for typeOTASubKey complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeOTASubKey">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Name" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeOTACode" />
 *       <attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOTASubKey", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "text"
})
public class TypeOTASubKey {

    /**
     * Information for a sub key.
     * 
     */
    @XmlElement(name = "Text")
    protected List<String> text;
    /**
     * A subkey to identify the special equipment codes. Applicable when Policy/@Name is EQUIP. Uses OTA CODE "EQP". 1P.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected BigInteger name;
    /**
     * A brief description of a subkey.
     * 
     */
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Information for a sub key.
     * 
     * Gets the value of the text property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the text property.
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<>();
        }
        return this.text;
    }

    /**
     * A subkey to identify the special equipment codes. Applicable when Policy/@Name is EQUIP. Uses OTA CODE "EQP". 1P.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getName()
     */
    public void setName(BigInteger value) {
        this.name = value;
    }

    /**
     * A brief description of a subkey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
