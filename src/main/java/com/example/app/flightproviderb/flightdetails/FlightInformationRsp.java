
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}FlightInfo" maxOccurs="999"/>
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
    "flightInfo"
})
@XmlRootElement(name = "FlightInformationRsp")
public class FlightInformationRsp
    extends BaseRsp
{

    /**
     * Provider: 1G,1V.
     * 
     */
    @XmlElement(name = "FlightInfo", required = true)
    protected List<FlightInfo> flightInfo;

    /**
     * Provider: 1G,1V.
     * 
     * Gets the value of the flightInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFlightInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the flightInfo property.
     */
    public List<FlightInfo> getFlightInfo() {
        if (flightInfo == null) {
            flightInfo = new ArrayList<>();
        }
        return this.flightInfo;
    }

}
