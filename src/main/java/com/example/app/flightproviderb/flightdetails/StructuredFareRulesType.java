
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredFareRulesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StructuredFareRulesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FareRuleCategoryType" type="{http://www.travelport.com/schema/air_v54_0}FareRuleCategoryTypes" maxOccurs="99" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredFareRulesType", propOrder = {
    "fareRuleCategoryType"
})
public class StructuredFareRulesType {

    /**
     * For FareRulesType element
     * 
     */
    @XmlElement(name = "FareRuleCategoryType")
    protected List<FareRuleCategoryTypes> fareRuleCategoryType;

    /**
     * For FareRulesType element
     * 
     * Gets the value of the fareRuleCategoryType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRuleCategoryType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRuleCategoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleCategoryTypes }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRuleCategoryType property.
     */
    public List<FareRuleCategoryTypes> getFareRuleCategoryType() {
        if (fareRuleCategoryType == null) {
            fareRuleCategoryType = new ArrayList<>();
        }
        return this.fareRuleCategoryType;
    }

}
