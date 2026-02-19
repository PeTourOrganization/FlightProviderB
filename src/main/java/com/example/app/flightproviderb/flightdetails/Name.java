
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *       <attribute name="Prefix">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="20"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="First" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="256"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Middle">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="256"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Last" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="256"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Suffix">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="256"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TravelerProfileId" type="{http://www.travelport.com/schema/common_v54_0}typeProfileID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Name {

    /**
     * Name prefix. Size can be up to 20 characters
     * 
     */
    @XmlAttribute(name = "Prefix")
    protected String prefix;
    /**
     * First Name. Size can be up to 256 characters
     * 
     */
    @XmlAttribute(name = "First", required = true)
    protected String first;
    /**
     * Midle name. Size can be up to 256 characters
     * 
     */
    @XmlAttribute(name = "Middle")
    protected String middle;
    /**
     * Last Name. Size can be up to 256 characters
     * 
     */
    @XmlAttribute(name = "Last", required = true)
    protected String last;
    /**
     * Name suffix. Size can be up to 256 characters
     * 
     */
    @XmlAttribute(name = "Suffix")
    protected String suffix;
    /**
     * Traveler Applied Profile ID.
     * 
     */
    @XmlAttribute(name = "TravelerProfileId")
    protected BigInteger travelerProfileId;

    /**
     * Name prefix. Size can be up to 20 characters
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrefix()
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * First Name. Size can be up to 256 characters
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFirst()
     */
    public void setFirst(String value) {
        this.first = value;
    }

    /**
     * Midle name. Size can be up to 256 characters
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the value of the middle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMiddle()
     */
    public void setMiddle(String value) {
        this.middle = value;
    }

    /**
     * Last Name. Size can be up to 256 characters
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLast()
     */
    public void setLast(String value) {
        this.last = value;
    }

    /**
     * Name suffix. Size can be up to 256 characters
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSuffix()
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Traveler Applied Profile ID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelerProfileId() {
        return travelerProfileId;
    }

    /**
     * Sets the value of the travelerProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getTravelerProfileId()
     */
    public void setTravelerProfileId(BigInteger value) {
        this.travelerProfileId = value;
    }

}
