
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PenFee list will be populated
 * 
 * <p>Java class for CHGType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CHGType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PenFee" type="{http://www.travelport.com/schema/air_v54_0}PenFeeType" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHGType", propOrder = {
    "penFee"
})
public class CHGType {

    @XmlElement(name = "PenFee")
    protected List<PenFeeType> penFee;

    /**
     * Gets the value of the penFee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penFee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenFeeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the penFee property.
     */
    public List<PenFeeType> getPenFee() {
        if (penFee == null) {
            penFee = new ArrayList<>();
        }
        return this.penFee;
    }

}
