
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ticketing Modifier used to alter a fare
 *                 percentage before or during the ticketing operation.
 * 
 * <p>Java class for typeTicketModifierPercentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeTicketModifierPercentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Percent" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePercentageWithDecimal" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTicketModifierPercentType")
public class TypeTicketModifierPercentType {

    /**
     * Percent associated with a ticketing
     *                     modifier
     * 
     */
    @XmlAttribute(name = "Percent", required = true)
    protected String percent;

    /**
     * Percent associated with a ticketing
     *                     modifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPercent()
     */
    public void setPercent(String value) {
        this.percent = value;
    }

}
