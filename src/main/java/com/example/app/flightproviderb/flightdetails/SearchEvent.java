
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeTimeRange">
 *       <attribute name="Type" type="{http://www.travelport.com/schema/common_v54_0}typeEventType" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SearchEvent", namespace = "http://www.travelport.com/schema/common_v54_0")
public class SearchEvent
    extends TypeTimeRange
{

    @XmlAttribute(name = "Type")
    protected TypeEventType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEventType }
     *     
     */
    public TypeEventType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEventType }
     *     
     */
    public void setType(TypeEventType value) {
        this.type = value;
    }

}
