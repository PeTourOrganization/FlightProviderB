
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Distance"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="SearchLocation" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="AlternateLocation" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "distance"
})
@XmlRootElement(name = "AlternateLocationDistance")
public class AlternateLocationDistance {

    /**
     * Container to encapsulate the a distance value with its unit of measure.
     * 
     */
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected Distance distance;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * The Searching City or Airport specified in the
     *                         Request.
     * 
     */
    @XmlAttribute(name = "SearchLocation", required = true)
    protected String searchLocation;
    /**
     * The nearby Alternate City or Airport to
     *                         SearchLocation.
     * 
     */
    @XmlAttribute(name = "AlternateLocation", required = true)
    protected String alternateLocation;

    /**
     * Container to encapsulate the a distance value with its unit of measure.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     * @see #getDistance()
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * The Searching City or Airport specified in the
     *                         Request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchLocation() {
        return searchLocation;
    }

    /**
     * Sets the value of the searchLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSearchLocation()
     */
    public void setSearchLocation(String value) {
        this.searchLocation = value;
    }

    /**
     * The nearby Alternate City or Airport to
     *                         SearchLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateLocation() {
        return alternateLocation;
    }

    /**
     * Sets the value of the alternateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAlternateLocation()
     */
    public void setAlternateLocation(String value) {
        this.alternateLocation = value;
    }

}
