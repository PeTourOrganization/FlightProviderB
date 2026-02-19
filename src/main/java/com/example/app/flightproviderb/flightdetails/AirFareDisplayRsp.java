
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FareDisplay" maxOccurs="999" minOccurs="0"/>
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
    "fareDisplay"
})
@XmlRootElement(name = "AirFareDisplayRsp")
public class AirFareDisplayRsp
    extends BaseRsp
{

    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "FareDisplay")
    protected List<FareDisplay> fareDisplay;

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the fareDisplay property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDisplay property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDisplay }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareDisplay property.
     */
    public List<FareDisplay> getFareDisplay() {
        if (fareDisplay == null) {
            fareDisplay = new ArrayList<>();
        }
        return this.fareDisplay;
    }

}
