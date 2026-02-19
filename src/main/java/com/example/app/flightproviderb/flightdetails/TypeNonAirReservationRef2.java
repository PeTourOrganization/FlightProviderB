
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeNonAirReservationRef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeNonAirReservationRef">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeLocatorCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeNonAirReservationRef", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TypeNonAirReservationRef2 {

    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

}
