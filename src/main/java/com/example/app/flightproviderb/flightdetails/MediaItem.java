
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
 *       <attribute name="caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="height" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="width" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       <attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="icon" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="sizeCode" type="{http://www.travelport.com/schema/common_v54_0}typeResponseImageSize" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MediaItem", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MediaItem {

    @XmlAttribute(name = "caption")
    protected String caption;
    @XmlAttribute(name = "height")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger height;
    @XmlAttribute(name = "width")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger width;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "icon")
    @XmlSchemaType(name = "anyURI")
    protected String icon;
    @XmlAttribute(name = "sizeCode")
    protected String sizeCode;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the type property.
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
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the sizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCode() {
        return sizeCode;
    }

    /**
     * Sets the value of the sizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCode(String value) {
        this.sizeCode = value;
    }

}
