
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         <element name="Destination" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" maxOccurs="59" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="AnyWhere"/>
 *             <enumeration value="Area"/>
 *             <enumeration value="Zone"/>
 *             <enumeration value="Country"/>
 *             <enumeration value="State"/>
 *             <enumeration value="DistanceInMiles"/>
 *             <enumeration value="DistanceInKilometers"/>
 *             <enumeration value="Destination"/>
 *             <enumeration value="Group"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Radius" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="GroupName">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="15"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "destination"
})
@XmlRootElement(name = "FlexExploreModifiers")
public class FlexExploreModifiers {

    /**
     * List of specific destinations for performing flex explore. Applicable only with flex explore type - Destination
     * 
     */
    @XmlElement(name = "Destination")
    protected List<String> destination;
    /**
     * Type of flex explore to be performed
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    /**
     * Radius around the destination of actual itinerary in which the search would be performed. Supported only with types - DistanceInMiles and DistanceInKilometers
     * 
     */
    @XmlAttribute(name = "Radius")
    protected BigInteger radius;
    /**
     * Group name for a set of destinations to be searched.  Use with Type=Group. Group names are defined in the Search Control Console. Supported Providers:  1G/1V/1P
     * 
     */
    @XmlAttribute(name = "GroupName")
    protected String groupName;

    /**
     * List of specific destinations for performing flex explore. Applicable only with flex explore type - Destination
     * 
     * Gets the value of the destination property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the destination property.
     */
    public List<String> getDestination() {
        if (destination == null) {
            destination = new ArrayList<>();
        }
        return this.destination;
    }

    /**
     * Type of flex explore to be performed
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
     * Radius around the destination of actual itinerary in which the search would be performed. Supported only with types - DistanceInMiles and DistanceInKilometers
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getRadius()
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    /**
     * Group name for a set of destinations to be searched.  Use with Type=Group. Group names are defined in the Search Control Console. Supported Providers:  1G/1V/1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGroupName()
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

}
