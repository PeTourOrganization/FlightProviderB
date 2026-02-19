
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A textual remark container to hold Associated itinerary remarks with segment association
 * 
 * <p>Java class for typeAssociatedRemarkWithSegmentRef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeAssociatedRemarkWithSegmentRef">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeAssociatedRemark">
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAssociatedRemarkWithSegmentRef", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    PocketItineraryRemark.class,
    AssociatedRemark.class
})
public class TypeAssociatedRemarkWithSegmentRef
    extends TypeAssociatedRemark
{

    /**
     * Reference to an Air/Passive Segment
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;

    /**
     * Reference to an Air/Passive Segment
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
