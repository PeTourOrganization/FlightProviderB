
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Most Restrictive Penalties
 * 
 * <p>Java class for typeMostRestrictivePenalties complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeMostRestrictivePenalties">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RestrictionType" type="{http://www.travelport.com/schema/air_v54_0}typeRestrictionData" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeMostRestrictivePenalties", propOrder = {
    "restrictionType"
})
public class TypeMostRestrictivePenalties {

    /**
     * Contain the type of restriction applicable
     * 
     */
    @XmlElement(name = "RestrictionType")
    protected List<TypeRestrictionData> restrictionType;

    /**
     * Contain the type of restriction applicable
     * 
     * Gets the value of the restrictionType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRestrictionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeRestrictionData }
     * </p>
     * 
     * 
     * @return
     *     The value of the restrictionType property.
     */
    public List<TypeRestrictionData> getRestrictionType() {
        if (restrictionType == null) {
            restrictionType = new ArrayList<>();
        }
        return this.restrictionType;
    }

}
