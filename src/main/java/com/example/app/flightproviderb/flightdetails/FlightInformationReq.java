
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightInfoCriteria" maxOccurs="999"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightInfoCriteria"
})
@XmlRootElement(name = "FlightInformationReq")
public class FlightInformationReq
    extends BaseReq
{

    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "FlightInfoCriteria", required = true)
    protected List<FlightInfoCriteria> flightInfoCriteria;

    /**
     * Provider: 1G,1V.
     * 
     * Gets the value of the flightInfoCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfoCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFlightInfoCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInfoCriteria }
     * </p>
     * 
     * 
     * @return
     *     The value of the flightInfoCriteria property.
     */
    public List<FlightInfoCriteria> getFlightInfoCriteria() {
        if (flightInfoCriteria == null) {
            flightInfoCriteria = new ArrayList<>();
        }
        return this.flightInfoCriteria;
    }

}
