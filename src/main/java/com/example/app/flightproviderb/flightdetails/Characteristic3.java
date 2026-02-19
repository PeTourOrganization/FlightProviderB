
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
 *       <attribute name="Smoking" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="Class" type="{http://www.travelport.com/schema/rail_v54_0}typeCoachClassType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Characteristic", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class Characteristic3 {

    @XmlAttribute(name = "Smoking")
    protected Boolean smoking;
    @XmlAttribute(name = "Class")
    protected TypeCoachClassType clazz;

    /**
     * Gets the value of the smoking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmoking() {
        if (smoking == null) {
            return false;
        } else {
            return smoking;
        }
    }

    /**
     * Sets the value of the smoking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmoking(Boolean value) {
        this.smoking = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCoachClassType }
     *     
     */
    public TypeCoachClassType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCoachClassType }
     *     
     */
    public void setClazz(TypeCoachClassType value) {
        this.clazz = value;
    }

}
