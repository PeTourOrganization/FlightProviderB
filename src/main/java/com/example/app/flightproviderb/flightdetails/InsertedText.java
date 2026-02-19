
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
 *       <attribute name="Offset" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Len" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "InsertedText", namespace = "http://www.travelport.com/schema/common_v54_0")
public class InsertedText {

    /**
     * Location of start of inserted text in Error Text field.
     * 
     */
    @XmlAttribute(name = "Offset", required = true)
    protected String offset;
    /**
     * Length of inserted text.
     * 
     */
    @XmlAttribute(name = "Len", required = true)
    protected String len;

    /**
     * Location of start of inserted text in Error Text field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOffset()
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Length of inserted text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLen()
     */
    public void setLen(String value) {
        this.len = value;
    }

}
