
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegmentRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Connection" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegmentRef",
    "connection"
})
@XmlRootElement(name = "AirItinerarySolution")
public class AirItinerarySolution {

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     */
    @XmlElement(name = "AirSegmentRef")
    protected List<AirSegmentRef> airSegmentRef;
    /**
     * Flight Connection Information
     * 
     */
    @XmlElement(name = "Connection")
    protected List<Connection> connection;
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     * Gets the value of the airSegmentRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegmentRef property.
     */
    public List<AirSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<>();
        }
        return this.airSegmentRef;
    }

    /**
     * Flight Connection Information
     * 
     * Gets the value of the connection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * </p>
     * 
     * 
     * @return
     *     The value of the connection property.
     */
    public List<Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<>();
        }
        return this.connection;
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

}
