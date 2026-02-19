
package com.example.app.flightproviderb.flightdetails;

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
 *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Carrier" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Name">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="30"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SecondaryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Type" type="{http://www.travelport.com/schema/common_v54_0}typeMerchandisingService" />
 *       <attribute name="Url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="ServiceSubCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Embargo")
public class Embargo {

    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Carrier")
    protected String carrier;
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    /**
     * The commercial name of the optional service on
     *                     which the embargo applies. Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "Name")
    protected String name;
    /**
     * Brief description of the embargo. Provider: 1G,
     *                     1V, 1P
     * 
     */
    @XmlAttribute(name = "Text")
    protected String text;
    /**
     * The secondary type of the optional service on which the embargo applies.  Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "SecondaryType")
    protected String secondaryType;
    /**
     * The type of optional service on which the embargo applies.  Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Website of the operating carrier. Provider: 1G,
     *                     1V, 1P
     * 
     */
    @XmlAttribute(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    /**
     * The service sub code of the optional service on which the embargo applies.  Provider: 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;

    /**
     * Gets the value of the key property.
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
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * The commercial name of the optional service on
     *                     which the embargo applies. Provider: 1G, 1V, 1P
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
     * Brief description of the embargo. Provider: 1G,
     *                     1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getText()
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * The secondary type of the optional service on which the embargo applies.  Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSecondaryType()
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * The type of optional service on which the embargo applies.  Provider: 1G, 1V, 1P
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
     * Website of the operating carrier. Provider: 1G,
     *                     1V, 1P
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
     * @see #getUrl()
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * The service sub code of the optional service on which the embargo applies.  Provider: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceSubCode()
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

}
