
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrBookingTravelerName"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingTravelerName", namespace = "http://www.travelport.com/schema/common_v54_0")
public class BookingTravelerName {

    /**
     * Name prefix.
     * 
     */
    @XmlAttribute(name = "Prefix")
    protected String prefix;
    /**
     * First Name.
     * 
     */
    @XmlAttribute(name = "First", required = true)
    protected String first;
    /**
     * Midle name.
     * 
     */
    @XmlAttribute(name = "Middle")
    protected String middle;
    /**
     * Last Name.
     * 
     */
    @XmlAttribute(name = "Last", required = true)
    protected String last;
    /**
     * Name suffix.
     * 
     */
    @XmlAttribute(name = "Suffix")
    protected String suffix;

    /**
     * Name prefix.
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
     * First Name.
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
     * Midle name.
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
     * Last Name.
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
     * Name suffix.
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

}
