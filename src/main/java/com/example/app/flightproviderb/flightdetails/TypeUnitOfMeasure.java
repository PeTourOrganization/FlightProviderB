
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeUnitOfMeasure complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeUnitOfMeasure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeUnitOfMeasure")
@XmlSeeAlso({
    Dimension.class
})
public class TypeUnitOfMeasure {

    @XmlAttribute(name = "Value")
    protected Float value;
    /**
     * Unit values would be lb,Lb,kg etc.
     * 
     */
    @XmlAttribute(name = "Unit")
    protected String unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Unit values would be lb,Lb,kg etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnit()
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
