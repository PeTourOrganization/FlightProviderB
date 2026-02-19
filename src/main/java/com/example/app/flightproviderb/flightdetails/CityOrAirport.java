
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}Location">
 *       <attribute name="Code" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="PreferCity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CityOrAirport", namespace = "http://www.travelport.com/schema/common_v54_0")
public class CityOrAirport
    extends Location
{

    /**
     * The airport or city IATA code.
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    /**
     * Indicates that the search should prefer city results over airport results.
     * 
     */
    @XmlAttribute(name = "PreferCity")
    protected Boolean preferCity;

    /**
     * The airport or city IATA code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Indicates that the search should prefer city results over airport results.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferCity() {
        if (preferCity == null) {
            return false;
        } else {
            return preferCity;
        }
    }

    /**
     * Sets the value of the preferCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPreferCity()
     */
    public void setPreferCity(Boolean value) {
        this.preferCity = value;
    }

}
