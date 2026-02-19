
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element name="RulesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rulesText"
})
@XmlRootElement(name = "Rules")
public class Rules {

    /**
     * Rules text
     * 
     */
    @XmlElement(name = "RulesText")
    protected String rulesText;

    /**
     * Rules text
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesText() {
        return rulesText;
    }

    /**
     * Sets the value of the rulesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRulesText()
     */
    public void setRulesText(String value) {
        this.rulesText = value;
    }

}
