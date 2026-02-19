
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
 *       <attribute name="SeatType">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SeatDescription">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SeatValue">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SeatValueDescription">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="0"/>
 *             <maxLength value="255"/>
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
@XmlRootElement(name = "Characteristic", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Characteristic2 {

    /**
     * Indicates codeset of values such as Seat Type like Place,Position, Smoking Choice, Place Arrangement, Place Direction, Compartment.
     * 
     */
    @XmlAttribute(name = "SeatType")
    protected String seatType;
    /**
     * Description of the seat type.
     * 
     */
    @XmlAttribute(name = "SeatDescription")
    protected String seatDescription;
    /**
     * Indicates the value specific to the selected type.
     * 
     */
    @XmlAttribute(name = "SeatValue")
    protected String seatValue;
    /**
     * Description of the seat value.
     * 
     */
    @XmlAttribute(name = "SeatValueDescription")
    protected String seatValueDescription;

    /**
     * Indicates codeset of values such as Seat Type like Place,Position, Smoking Choice, Place Arrangement, Place Direction, Compartment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatType()
     */
    public void setSeatType(String value) {
        this.seatType = value;
    }

    /**
     * Description of the seat type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatDescription() {
        return seatDescription;
    }

    /**
     * Sets the value of the seatDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatDescription()
     */
    public void setSeatDescription(String value) {
        this.seatDescription = value;
    }

    /**
     * Indicates the value specific to the selected type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatValue() {
        return seatValue;
    }

    /**
     * Sets the value of the seatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatValue()
     */
    public void setSeatValue(String value) {
        this.seatValue = value;
    }

    /**
     * Description of the seat value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatValueDescription() {
        return seatValueDescription;
    }

    /**
     * Sets the value of the seatValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatValueDescription()
     */
    public void setSeatValueDescription(String value) {
        this.seatValueDescription = value;
    }

}
