
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
 *       <attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Position" type="{http://www.travelport.com/schema/air_v54_0}typePosition" />
 *       <attribute name="RowLocation" type="{http://www.travelport.com/schema/air_v54_0}typeRowLocation" />
 *       <attribute name="PADISCode" type="{http://www.travelport.com/schema/common_v54_0}StringLength1to99" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Characteristic")
public class Characteristic {

    @XmlAttribute(name = "Value", required = true)
    protected String value;
    @XmlAttribute(name = "Position")
    protected TypePosition position;
    @XmlAttribute(name = "RowLocation")
    protected TypeRowLocation rowLocation;
    /**
     * Industry standard code that defines seat and row characteristic.
     * 
     */
    @XmlAttribute(name = "PADISCode")
    protected String padisCode;

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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link TypePosition }
     *     
     */
    public TypePosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePosition }
     *     
     */
    public void setPosition(TypePosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the rowLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRowLocation }
     *     
     */
    public TypeRowLocation getRowLocation() {
        return rowLocation;
    }

    /**
     * Sets the value of the rowLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRowLocation }
     *     
     */
    public void setRowLocation(TypeRowLocation value) {
        this.rowLocation = value;
    }

    /**
     * Industry standard code that defines seat and row characteristic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADISCode() {
        return padisCode;
    }

    /**
     * Sets the value of the padisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPADISCode()
     */
    public void setPADISCode(String value) {
        this.padisCode = value;
    }

}
