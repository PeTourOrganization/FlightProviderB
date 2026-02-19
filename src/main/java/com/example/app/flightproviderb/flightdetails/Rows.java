
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Row" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "Rows")
public class Rows {

    /**
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     */
    @XmlElement(name = "Row")
    protected List<Row> row;
    /**
     * Specifies the AirSegment the seat map is for. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;

    /**
     * Provider: 1G,1V,1P,ACH,MCH.
     * 
     * Gets the value of the row property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Row }
     * </p>
     * 
     * 
     * @return
     *     The value of the row property.
     */
    public List<Row> getRow() {
        if (row == null) {
            row = new ArrayList<>();
        }
        return this.row;
    }

    /**
     * Specifies the AirSegment the seat map is for. Providers: ACH, 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSegmentRef()
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

}
