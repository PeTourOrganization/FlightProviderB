
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ExpertSolution" maxOccurs="999"/>
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
    "expertSolution"
})
@XmlRootElement(name = "ExpertSolutionList")
public class ExpertSolutionList {

    /**
     * Information about Expert Solution Route
     *                 component retrieved from Knowledge Base
     * 
     */
    @XmlElement(name = "ExpertSolution", required = true)
    protected List<ExpertSolution> expertSolution;

    /**
     * Information about Expert Solution Route
     *                 component retrieved from Knowledge Base
     * 
     * Gets the value of the expertSolution property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expertSolution property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExpertSolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpertSolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the expertSolution property.
     */
    public List<ExpertSolution> getExpertSolution() {
        if (expertSolution == null) {
            expertSolution = new ArrayList<>();
        }
        return this.expertSolution;
    }

}
