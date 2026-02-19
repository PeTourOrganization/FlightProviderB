
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FareBasis")
public class FareBasis {

    /**
     * The fare basis code for this fare
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    /**
     * The segment to which this FareBasis Code is to
     *                         connected
     * 
     */
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;

    /**
     * The fare basis code for this fare
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
     * The segment to which this FareBasis Code is to
     *                         connected
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
