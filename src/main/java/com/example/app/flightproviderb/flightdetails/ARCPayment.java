
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
 *       <attribute name="ARCIdentifier" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ARCPassword">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
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
@XmlRootElement(name = "ARCPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ARCPayment {

    /**
     * Value of the ARC Direct Bill id
     * 
     */
    @XmlAttribute(name = "ARCIdentifier", required = true)
    protected String arcIdentifier;
    /**
     * Value of the ARC Direct Bill id password
     * 
     */
    @XmlAttribute(name = "ARCPassword")
    protected String arcPassword;

    /**
     * Value of the ARC Direct Bill id
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCIdentifier() {
        return arcIdentifier;
    }

    /**
     * Sets the value of the arcIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getARCIdentifier()
     */
    public void setARCIdentifier(String value) {
        this.arcIdentifier = value;
    }

    /**
     * Value of the ARC Direct Bill id password
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARCPassword() {
        return arcPassword;
    }

    /**
     * Sets the value of the arcPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getARCPassword()
     */
    public void setARCPassword(String value) {
        this.arcPassword = value;
    }

}
