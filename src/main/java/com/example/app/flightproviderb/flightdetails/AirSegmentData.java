
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BaggageAllowance" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Brand" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typeClassOfService" />
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
    "baggageAllowance",
    "brand"
})
@XmlRootElement(name = "AirSegmentData")
public class AirSegmentData {

    /**
     * Reference to a complete AirSegment from a
     *                 shared list
     * 
     */
    @XmlElement(name = "AirSegmentRef")
    protected List<AirSegmentRef> airSegmentRef;
    /**
     * Free Baggage Allowance
     * 
     */
    @XmlElement(name = "BaggageAllowance")
    protected List<BaggageAllowance> baggageAllowance;
    /**
     * Commercially recognized product offered by an airline
     * 
     */
    @XmlElement(name = "Brand")
    protected List<Brand> brand;
    /**
     * Specifies Cabin class for a group of class of services. Cabin class is not identified if it is not present.
     * 
     */
    @XmlAttribute(name = "CabinClass")
    protected String cabinClass;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;

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
     * Free Baggage Allowance
     * 
     * Gets the value of the baggageAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowance }
     * </p>
     * 
     * 
     * @return
     *     The value of the baggageAllowance property.
     */
    public List<BaggageAllowance> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<>();
        }
        return this.baggageAllowance;
    }

    /**
     * Commercially recognized product offered by an airline
     * 
     * Gets the value of the brand property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brand property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brand }
     * </p>
     * 
     * 
     * @return
     *     The value of the brand property.
     */
    public List<Brand> getBrand() {
        if (brand == null) {
            brand = new ArrayList<>();
        }
        return this.brand;
    }

    /**
     * Specifies Cabin class for a group of class of services. Cabin class is not identified if it is not present.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinClass()
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

}
