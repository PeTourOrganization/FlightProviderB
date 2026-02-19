
package com.example.app.flightproviderb.flightdetails;

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
 *       <choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}GeneralTimeTable"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}SpecificTimeTable"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generalTimeTable",
    "specificTimeTable"
})
@XmlRootElement(name = "FlightTimeTableCriteria")
public class FlightTimeTableCriteria {

    @XmlElement(name = "GeneralTimeTable")
    protected GeneralTimeTable generalTimeTable;
    @XmlElement(name = "SpecificTimeTable")
    protected SpecificTimeTable specificTimeTable;

    /**
     * Gets the value of the generalTimeTable property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralTimeTable }
     *     
     */
    public GeneralTimeTable getGeneralTimeTable() {
        return generalTimeTable;
    }

    /**
     * Sets the value of the generalTimeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralTimeTable }
     *     
     */
    public void setGeneralTimeTable(GeneralTimeTable value) {
        this.generalTimeTable = value;
    }

    /**
     * Gets the value of the specificTimeTable property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTimeTable }
     *     
     */
    public SpecificTimeTable getSpecificTimeTable() {
        return specificTimeTable;
    }

    /**
     * Sets the value of the specificTimeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTimeTable }
     *     
     */
    public void setSpecificTimeTable(SpecificTimeTable value) {
        this.specificTimeTable = value;
    }

}
