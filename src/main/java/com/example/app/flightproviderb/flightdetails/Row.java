
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Facility" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Characteristic" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="SearchTravelerRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facility",
    "characteristic"
})
@XmlRootElement(name = "Row")
public class Row {

    /**
     * The facility definition for a part of a row or a
     *                 seat map
     * 
     */
    @XmlElement(name = "Facility")
    protected List<Facility> facility;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlAttribute(name = "Number", required = true)
    protected BigInteger number;
    @XmlAttribute(name = "SearchTravelerRef")
    protected String searchTravelerRef;

    /**
     * The facility definition for a part of a row or a
     *                 seat map
     * 
     * Gets the value of the facility property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facility property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facility }
     * </p>
     * 
     * 
     * @return
     *     The value of the facility property.
     */
    public List<Facility> getFacility() {
        if (facility == null) {
            facility = new ArrayList<>();
        }
        return this.facility;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * </p>
     * 
     * 
     * @return
     *     The value of the characteristic property.
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the searchTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTravelerRef() {
        return searchTravelerRef;
    }

    /**
     * Sets the value of the searchTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTravelerRef(String value) {
        this.searchTravelerRef = value;
    }

}
