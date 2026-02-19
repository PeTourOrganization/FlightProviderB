
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}BaseBaggageAllowanceInfo">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BagDetails" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v54_0}typePTC" />
 *       <attribute name="FareInfoRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bagDetails"
})
@XmlRootElement(name = "BaggageAllowanceInfo")
public class BaggageAllowanceInfo
    extends BaseBaggageAllowanceInfo
{

    /**
     * Information related to Bag details .
     * 
     */
    @XmlElement(name = "BagDetails")
    protected List<BagDetails> bagDetails;
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    @XmlAttribute(name = "FareInfoRef")
    protected String fareInfoRef;

    /**
     * Information related to Bag details .
     * 
     * Gets the value of the bagDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBagDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the bagDetails property.
     */
    public List<BagDetails> getBagDetails() {
        if (bagDetails == null) {
            bagDetails = new ArrayList<>();
        }
        return this.bagDetails;
    }

    /**
     * Gets the value of the travelerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerType() {
        return travelerType;
    }

    /**
     * Sets the value of the travelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

}
