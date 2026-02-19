
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
 *       <attribute name="BSPIdentifier" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="128"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="BSPPassword">
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
@XmlRootElement(name = "BSPPayment", namespace = "http://www.travelport.com/schema/common_v54_0")
public class BSPPayment {

    /**
     * Value of the BSP Direct Bill id
     * 
     */
    @XmlAttribute(name = "BSPIdentifier", required = true)
    protected String bspIdentifier;
    /**
     * Value of the BSP Direct Bill id password
     * 
     */
    @XmlAttribute(name = "BSPPassword")
    protected String bspPassword;

    /**
     * Value of the BSP Direct Bill id
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSPIdentifier() {
        return bspIdentifier;
    }

    /**
     * Sets the value of the bspIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBSPIdentifier()
     */
    public void setBSPIdentifier(String value) {
        this.bspIdentifier = value;
    }

    /**
     * Value of the BSP Direct Bill id password
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSPPassword() {
        return bspPassword;
    }

    /**
     * Sets the value of the bspPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBSPPassword()
     */
    public void setBSPPassword(String value) {
        this.bspPassword = value;
    }

}
