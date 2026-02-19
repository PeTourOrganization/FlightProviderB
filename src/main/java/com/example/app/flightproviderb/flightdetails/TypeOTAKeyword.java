
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A complexType for keyword information.
 * 
 * <p>Java class for typeOTAKeyword complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeOTAKeyword">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SubKey" type="{http://www.travelport.com/schema/common_v54_0}typeOTASubKey" maxOccurs="99" minOccurs="0"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Name" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="6"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOTAKeyword", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "subKey",
    "text"
})
public class TypeOTAKeyword {

    /**
     * A further breakdown of a keyword.
     * 
     */
    @XmlElement(name = "SubKey")
    protected List<TypeOTASubKey> subKey;
    /**
     * Information for a keyword.
     * 
     */
    @XmlElement(name = "Text")
    protected List<String> text;
    /**
     * The keyword name.
     * 
     */
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    /**
     * The number for this keyword.
     * 
     */
    @XmlAttribute(name = "Number")
    @XmlSchemaType(name = "anySimpleType")
    protected String number;
    /**
     * A brief description of the keyword
     * 
     */
    @XmlAttribute(name = "Description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;

    /**
     * A further breakdown of a keyword.
     * 
     * Gets the value of the subKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOTASubKey }
     * </p>
     * 
     * 
     * @return
     *     The value of the subKey property.
     */
    public List<TypeOTASubKey> getSubKey() {
        if (subKey == null) {
            subKey = new ArrayList<>();
        }
        return this.subKey;
    }

    /**
     * Information for a keyword.
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
     * The keyword name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The number for this keyword.
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
     * A brief description of the keyword
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
