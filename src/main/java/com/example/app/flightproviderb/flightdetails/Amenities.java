
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="Text" type="{http://www.travelport.com/schema/air_v54_0}AmenitiesTextType" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="Key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "text"
})
@XmlRootElement(name = "Amenities")
public class Amenities {

    @XmlElement(name = "Text", required = true)
    protected List<AmenitiesTextType> text;
    /**
     * Identifies the Amenity Reference for the Amenity.
     * 
     */
    @XmlAttribute(name = "Key")
    protected String key;
    /**
     * ISO code for language
     * 
     */
    @XmlAttribute(name = "LanguageCode")
    protected String languageCode;

    /**
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
     * {@link AmenitiesTextType }
     * </p>
     * 
     * 
     * @return
     *     The value of the text property.
     */
    public List<AmenitiesTextType> getText() {
        if (text == null) {
            text = new ArrayList<>();
        }
        return this.text;
    }

    /**
     * Identifies the Amenity Reference for the Amenity.
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
     * ISO code for language
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLanguageCode()
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
