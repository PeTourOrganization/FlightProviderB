
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}APISRequirements" maxOccurs="999"/>
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
    "apisRequirements"
})
@XmlRootElement(name = "APISRequirementsList")
public class APISRequirementsList {

    /**
     * Specific details for APIS Requirements.
     * 
     */
    @XmlElement(name = "APISRequirements", required = true)
    protected List<APISRequirements> apisRequirements;

    /**
     * Specific details for APIS Requirements.
     * 
     * Gets the value of the apisRequirements property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apisRequirements property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAPISRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISRequirements }
     * </p>
     * 
     * 
     * @return
     *     The value of the apisRequirements property.
     */
    public List<APISRequirements> getAPISRequirements() {
        if (apisRequirements == null) {
            apisRequirements = new ArrayList<>();
        }
        return this.apisRequirements;
    }

}
