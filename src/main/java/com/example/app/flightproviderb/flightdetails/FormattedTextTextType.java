
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides text and indicates whether it is formatted or not.
 * 
 * <p>Java class for FormattedTextTextType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FormattedTextTextType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}LanguageGroup"/>
 *       <attribute name="Formatted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TextFormat">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="PlainText"/>
 *             <enumeration value="HTML"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextTextType", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "value"
})
public class FormattedTextTextType {

    @XmlValue
    protected String value;
    /**
     * Textual information, which may be formatted as a line of information, or unformatted, as a paragraph of text.
     * 
     */
    @XmlAttribute(name = "Formatted")
    protected Boolean formatted;
    /**
     * Indicates the format of text used in the description e.g. unformatted  or html.
     * 
     */
    @XmlAttribute(name = "TextFormat")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textFormat;
    /**
     * Language identification.
     * 
     */
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Textual information, which may be formatted as a line of information, or unformatted, as a paragraph of text.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormatted() {
        return formatted;
    }

    /**
     * Sets the value of the formatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFormatted()
     */
    public void setFormatted(Boolean value) {
        this.formatted = value;
    }

    /**
     * Indicates the format of text used in the description e.g. unformatted  or html.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFormat() {
        return textFormat;
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTextFormat()
     */
    public void setTextFormat(String value) {
        this.textFormat = value;
    }

    /**
     * Language identification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLanguage()
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
