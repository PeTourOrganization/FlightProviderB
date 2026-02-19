
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
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeBackOffice" />
 *       <attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BackOfficeHandOff")
public class BackOfficeHandOff {

    /**
     * The type of back office document,valid options
     *                         are Accounting,Global,NonAccounting,NonAccountingRemote,Dual.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypeBackOffice type;
    /**
     * This is required for NonAccountingRemote,Dual
     *                         and Global type back office.
     * 
     */
    @XmlAttribute(name = "Location")
    protected String location;
    /**
     * The PCC of the host system where it would be
     *                         routed.
     * 
     */
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;

    /**
     * The type of back office document,valid options
     *                         are Accounting,Global,NonAccounting,NonAccountingRemote,Dual.
     * 
     * @return
     *     possible object is
     *     {@link TypeBackOffice }
     *     
     */
    public TypeBackOffice getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBackOffice }
     *     
     * @see #getType()
     */
    public void setType(TypeBackOffice value) {
        this.type = value;
    }

    /**
     * This is required for NonAccountingRemote,Dual
     *                         and Global type back office.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLocation()
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * The PCC of the host system where it would be
     *                         routed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPseudoCityCode()
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

}
