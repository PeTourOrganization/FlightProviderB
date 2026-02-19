
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Provider"/>
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
    "provider"
})
@XmlRootElement(name = "PermittedProviders", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PermittedProviders {

    /**
     * Provider identifier
     * 
     */
    @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected Provider provider;

    /**
     * Provider identifier
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     * @see #getProvider()
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

}
