
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeWeight complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeWeight">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Unit" type="{http://www.travelport.com/schema/air_v54_0}typeUnitWeight" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeWeight")
public class TypeWeight {

    @XmlAttribute(name = "Value")
    protected BigInteger value;
    @XmlAttribute(name = "Unit")
    protected TypeUnitWeight unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeUnitWeight }
     *     
     */
    public TypeUnitWeight getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeUnitWeight }
     *     
     */
    public void setUnit(TypeUnitWeight value) {
        this.unit = value;
    }

}
