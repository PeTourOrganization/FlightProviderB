
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ImageWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="ImageHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ImageLocation")
public class ImageLocation {

    @XmlValue
    protected String value;
    /**
     * Type of Image Location. E.g., "Agent", "Consumer".
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * The width of the image
     * 
     */
    @XmlAttribute(name = "ImageWidth", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imageWidth;
    /**
     * The height of the image
     * 
     */
    @XmlAttribute(name = "ImageHeight", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger imageHeight;

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
     * Type of Image Location. E.g., "Agent", "Consumer".
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
     * The width of the image
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getImageWidth()
     */
    public void setImageWidth(BigInteger value) {
        this.imageWidth = value;
    }

    /**
     * The height of the image
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getImageHeight()
     */
    public void setImageHeight(BigInteger value) {
        this.imageHeight = value;
    }

}
