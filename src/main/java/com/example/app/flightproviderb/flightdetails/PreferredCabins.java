
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}CabinClass"/>
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
    "cabinClass"
})
@XmlRootElement(name = "PreferredCabins")
public class PreferredCabins {

    /**
     * Requests cabin class (First, Business and Economy, etc.) as supported by the provider or supplier.
     * 
     */
    @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected CabinClass cabinClass;

    /**
     * Requests cabin class (First, Business and Economy, etc.) as supported by the provider or supplier.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

}
