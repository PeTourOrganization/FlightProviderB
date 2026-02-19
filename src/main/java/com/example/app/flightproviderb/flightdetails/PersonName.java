
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
 *       <attribute name="First" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to64" />
 *       <attribute name="Last" use="required" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to64" />
 *       <attribute name="Prefix" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to16" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PersonName")
public class PersonName {

    /**
     * Person First Name.
     * 
     */
    @XmlAttribute(name = "First")
    protected String first;
    /**
     * Person Last Name.
     * 
     */
    @XmlAttribute(name = "Last", required = true)
    protected String last;
    /**
     * Person Name prefix.
     * 
     */
    @XmlAttribute(name = "Prefix")
    protected String prefix;

    /**
     * Person First Name.
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
     * Person Last Name.
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
     * Person Name prefix.
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

}
