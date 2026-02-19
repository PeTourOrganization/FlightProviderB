
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used as an override in a booking.
 * 
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Code" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Type" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="PseudoCityCode"/>
 *             <enumeration value="ArcNumber"/>
 *             <enumeration value="IataNumber"/>
 *             <enumeration value="CustomerId"/>
 *             <enumeration value="BookingSourceOverride"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingSource", namespace = "http://www.travelport.com/schema/common_v54_0")
public class BookingSource {

    /**
     * Alternate booking source code or number.
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    /**
     * Type of booking source sent in the Code attribute. Possible values are “PseudoCityCode”,” ArcNumber”,” IataNumber”, “CustomerId” and “BookingSourceOverrride”. “BookingSourceOverrride” is only applicable in VehicleCreateReservationReq. 1P.
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected String type;

    /**
     * Alternate booking source code or number.
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
     * Type of booking source sent in the Code attribute. Possible values are “PseudoCityCode”,” ArcNumber”,” IataNumber”, “CustomerId” and “BookingSourceOverrride”. “BookingSourceOverrride” is only applicable in VehicleCreateReservationReq. 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

}
