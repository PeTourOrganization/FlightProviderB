
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
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "StockControl", namespace = "http://www.travelport.com/schema/common_v54_0")
public class StockControl {

    /**
     * Stock control type valid options include: Pending, Failed, Plain Paper, Blank, Suppressed.
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;
    /**
     * Stock control number.
     * 
     */
    @XmlAttribute(name = "Number")
    protected String number;

    /**
     * Stock control type valid options include: Pending, Failed, Plain Paper, Blank, Suppressed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Stock control number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
