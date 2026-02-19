
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <attribute name="AdditionalRmk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlRootElement(name = "MCORemark", namespace = "http://www.travelport.com/schema/common_v54_0")
public class MCORemark {

    @XmlValue
    protected String value;
    /**
     * Indicates if the remark is additional remark or not.
     * 
     */
    @XmlAttribute(name = "AdditionalRmk")
    protected Boolean additionalRmk;

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
     * Indicates if the remark is additional remark or not.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalRmk() {
        return additionalRmk;
    }

    /**
     * Sets the value of the additionalRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAdditionalRmk()
     */
    public void setAdditionalRmk(Boolean value) {
        this.additionalRmk = value;
    }

}
