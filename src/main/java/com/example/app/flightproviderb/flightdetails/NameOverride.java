
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
 *       <attribute name="First" use="required">
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
 *       <attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "NameOverride", namespace = "http://www.travelport.com/schema/common_v54_0")
public class NameOverride {

    /**
     * First Name.
     * 
     */
    @XmlAttribute(name = "First", required = true)
    protected String first;
    /**
     * Last Name.
     * 
     */
    @XmlAttribute(name = "Last", required = true)
    protected String last;
    /**
     * Age.
     * 
     */
    @XmlAttribute(name = "Age")
    protected BigInteger age;

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
     * Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getAge()
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}
