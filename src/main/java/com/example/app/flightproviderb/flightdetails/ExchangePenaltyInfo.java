
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PenaltyInformation" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="PTC" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="MinimumChangeFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="MaximumChangeFee" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "penaltyInformation"
})
@XmlRootElement(name = "ExchangePenaltyInfo")
public class ExchangePenaltyInfo {

    @XmlElement(name = "PenaltyInformation")
    protected List<PenaltyInformation> penaltyInformation;
    @XmlAttribute(name = "PTC")
    protected String ptc;
    /**
     * Minimum change fee for changes to the itinerary.
     * 
     */
    @XmlAttribute(name = "MinimumChangeFee")
    protected String minimumChangeFee;
    /**
     * Maximum change fee for changes  to the itinerary.
     * 
     */
    @XmlAttribute(name = "MaximumChangeFee")
    protected String maximumChangeFee;

    /**
     * Gets the value of the penaltyInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenaltyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the penaltyInformation property.
     */
    public List<PenaltyInformation> getPenaltyInformation() {
        if (penaltyInformation == null) {
            penaltyInformation = new ArrayList<>();
        }
        return this.penaltyInformation;
    }

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Minimum change fee for changes to the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumChangeFee() {
        return minimumChangeFee;
    }

    /**
     * Sets the value of the minimumChangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMinimumChangeFee()
     */
    public void setMinimumChangeFee(String value) {
        this.minimumChangeFee = value;
    }

    /**
     * Maximum change fee for changes  to the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumChangeFee() {
        return maximumChangeFee;
    }

    /**
     * Sets the value of the maximumChangeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaximumChangeFee()
     */
    public void setMaximumChangeFee(String value) {
        this.maximumChangeFee = value;
    }

}
