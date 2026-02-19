
package com.example.app.flightproviderb.flightdetails;

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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}LegDetail" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRailLocationCode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRailLocationCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "legDetail"
})
@XmlRootElement(name = "Leg")
public class Leg {

    /**
     * Information about the journey Leg,
     *                 Shared by Leg and LegPrice Elements
     * 
     */
    @XmlElement(name = "LegDetail")
    protected List<LegDetail> legDetail;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * Returns the Group Number for the leg.
     * 
     */
    @XmlAttribute(name = "Group", required = true)
    protected int group;
    /**
     * Returns the origin airport or city code
     *                         for the leg.
     * 
     */
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    /**
     * Returns the destination airport or city
     *                         code for the leg.
     * 
     */
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;

    /**
     * Information about the journey Leg,
     *                 Shared by Leg and LegPrice Elements
     * 
     * Gets the value of the legDetail property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legDetail property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLegDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegDetail }
     * </p>
     * 
     * 
     * @return
     *     The value of the legDetail property.
     */
    public List<LegDetail> getLegDetail() {
        if (legDetail == null) {
            legDetail = new ArrayList<>();
        }
        return this.legDetail;
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
     * Returns the Group Number for the leg.
     * 
     */
    public int getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     */
    public void setGroup(int value) {
        this.group = value;
    }

    /**
     * Returns the origin airport or city code
     *                         for the leg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrigin()
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Returns the destination airport or city
     *                         code for the leg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestination()
     */
    public void setDestination(String value) {
        this.destination = value;
    }

}
