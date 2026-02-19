
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="SearchOrigin" type="{http://www.travelport.com/schema/common_v54_0}typeSearchLocation" maxOccurs="999"/>
 *         <element name="SearchDestination" type="{http://www.travelport.com/schema/common_v54_0}typeSearchLocation" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSegmentList" minOccurs="0"/>
 *         <choice>
 *           <element name="SearchDepTime" type="{http://www.travelport.com/schema/common_v54_0}typeFlexibleTimeSpec" maxOccurs="999"/>
 *           <element name="SearchArvTime" type="{http://www.travelport.com/schema/common_v54_0}typeTimeSpec" maxOccurs="999"/>
 *         </choice>
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailLegModifiers" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchOrigin",
    "searchDestination",
    "railSegmentList",
    "searchDepTime",
    "searchArvTime",
    "railLegModifiers"
})
@XmlRootElement(name = "SearchRailLeg", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class SearchRailLeg {

    @XmlElement(name = "SearchOrigin", namespace = "http://www.travelport.com/schema/rail_v54_0", required = true)
    protected List<TypeSearchLocation> searchOrigin;
    @XmlElement(name = "SearchDestination", namespace = "http://www.travelport.com/schema/rail_v54_0", required = true)
    protected List<TypeSearchLocation> searchDestination;
    /**
     * List of Rail Segments
     * 
     */
    @XmlElement(name = "RailSegmentList", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailSegmentList railSegmentList;
    @XmlElement(name = "SearchDepTime", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<TypeFlexibleTimeSpec> searchDepTime;
    @XmlElement(name = "SearchArvTime", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected List<TypeTimeSpec> searchArvTime;
    @XmlElement(name = "RailLegModifiers", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailLegModifiers railLegModifiers;

    /**
     * Gets the value of the searchOrigin property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchOrigin property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSearchLocation }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchOrigin property.
     */
    public List<TypeSearchLocation> getSearchOrigin() {
        if (searchOrigin == null) {
            searchOrigin = new ArrayList<>();
        }
        return this.searchOrigin;
    }

    /**
     * Gets the value of the searchDestination property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDestination property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSearchLocation }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchDestination property.
     */
    public List<TypeSearchLocation> getSearchDestination() {
        if (searchDestination == null) {
            searchDestination = new ArrayList<>();
        }
        return this.searchDestination;
    }

    /**
     * List of Rail Segments
     * 
     * @return
     *     possible object is
     *     {@link RailSegmentList }
     *     
     */
    public RailSegmentList getRailSegmentList() {
        return railSegmentList;
    }

    /**
     * Sets the value of the railSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSegmentList }
     *     
     * @see #getRailSegmentList()
     */
    public void setRailSegmentList(RailSegmentList value) {
        this.railSegmentList = value;
    }

    /**
     * Gets the value of the searchDepTime property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDepTime property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchDepTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFlexibleTimeSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchDepTime property.
     */
    public List<TypeFlexibleTimeSpec> getSearchDepTime() {
        if (searchDepTime == null) {
            searchDepTime = new ArrayList<>();
        }
        return this.searchDepTime;
    }

    /**
     * Gets the value of the searchArvTime property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchArvTime property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchArvTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTimeSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchArvTime property.
     */
    public List<TypeTimeSpec> getSearchArvTime() {
        if (searchArvTime == null) {
            searchArvTime = new ArrayList<>();
        }
        return this.searchArvTime;
    }

    /**
     * Gets the value of the railLegModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RailLegModifiers }
     *     
     */
    public RailLegModifiers getRailLegModifiers() {
        return railLegModifiers;
    }

    /**
     * Sets the value of the railLegModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLegModifiers }
     *     
     */
    public void setRailLegModifiers(RailLegModifiers value) {
        this.railLegModifiers = value;
    }

}
