
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
 *         <element ref="{http://www.travelport.com/schema/rail_v54_0}Characteristic" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CoachNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "characteristic",
    "remark"
})
@XmlRootElement(name = "Coach", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class Coach {

    /**
     * Defines coach characteristics such as accommodation class, smoking choice, etc.
     * 
     */
    @XmlElement(name = "Characteristic", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected Characteristic3 characteristic;
    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Remark> remark;
    /**
     * Coach number for which seat map/coach map is returned.
     * 
     */
    @XmlAttribute(name = "CoachNumber")
    protected String coachNumber;

    /**
     * Defines coach characteristics such as accommodation class, smoking choice, etc.
     * 
     * @return
     *     possible object is
     *     {@link Characteristic3 }
     *     
     */
    public Characteristic3 getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristic3 }
     *     
     * @see #getCharacteristic()
     */
    public void setCharacteristic(Characteristic3 value) {
        this.characteristic = value;
    }

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

    /**
     * Coach number for which seat map/coach map is returned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachNumber() {
        return coachNumber;
    }

    /**
     * Sets the value of the coachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCoachNumber()
     */
    public void setCoachNumber(String value) {
        this.coachNumber = value;
    }

}
