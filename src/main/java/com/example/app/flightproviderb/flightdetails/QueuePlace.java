
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
 *         <element name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}QueueSelector" maxOccurs="999" minOccurs="0"/>
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
    "pseudoCityCode",
    "queueSelector"
})
@XmlRootElement(name = "QueuePlace", namespace = "http://www.travelport.com/schema/common_v54_0")
public class QueuePlace {

    /**
     * Pseudo City Code
     * 
     */
    @XmlElement(name = "PseudoCityCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String pseudoCityCode;
    /**
     * Identifies the Queue Information to be selected for placing the UR
     * 
     */
    @XmlElement(name = "QueueSelector", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<QueueSelector> queueSelector;

    /**
     * Pseudo City Code
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

    /**
     * Identifies the Queue Information to be selected for placing the UR
     * 
     * Gets the value of the queueSelector property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueSelector property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQueueSelector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueueSelector }
     * </p>
     * 
     * 
     * @return
     *     The value of the queueSelector property.
     */
    public List<QueueSelector> getQueueSelector() {
        if (queueSelector == null) {
            queueSelector = new ArrayList<>();
        }
        return this.queueSelector;
    }

}
