
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
 *       <attribute name="OptionalServiceRef" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GroupedOption")
public class GroupedOption {

    /**
     * Reference to a optionalService which is paired with other optional services in the parent PairedOptions element.
     * 
     */
    @XmlAttribute(name = "OptionalServiceRef", required = true)
    protected String optionalServiceRef;

    /**
     * Reference to a optionalService which is paired with other optional services in the parent PairedOptions element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServiceRef() {
        return optionalServiceRef;
    }

    /**
     * Sets the value of the optionalServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOptionalServiceRef()
     */
    public void setOptionalServiceRef(String value) {
        this.optionalServiceRef = value;
    }

}
