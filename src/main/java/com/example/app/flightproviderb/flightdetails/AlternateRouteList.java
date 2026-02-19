
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AlternateRoute" maxOccurs="999"/>
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
    "alternateRoute"
})
@XmlRootElement(name = "AlternateRouteList")
public class AlternateRouteList {

    /**
     * Information about this Alternate Route
     *                 component
     * 
     */
    @XmlElement(name = "AlternateRoute", required = true)
    protected List<AlternateRoute> alternateRoute;

    /**
     * Information about this Alternate Route
     *                 component
     * 
     * Gets the value of the alternateRoute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateRoute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlternateRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateRoute }
     * </p>
     * 
     * 
     * @return
     *     The value of the alternateRoute property.
     */
    public List<AlternateRoute> getAlternateRoute() {
        if (alternateRoute == null) {
            alternateRoute = new ArrayList<>();
        }
        return this.alternateRoute;
    }

}
