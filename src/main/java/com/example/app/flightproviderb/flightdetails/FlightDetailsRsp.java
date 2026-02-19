
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSegment" maxOccurs="999"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}CO2Emissions" maxOccurs="99" minOccurs="0"/>
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
    "airSegment",
    "co2Emissions"
})
@XmlRootElement(name = "FlightDetailsRsp")
public class FlightDetailsRsp
    extends BaseRsp
{

    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirSegment", required = true)
    protected List<TypeBaseAirSegment> airSegment;
    /**
     * The carbon emissions produced by the journey
     * 
     */
    @XmlElement(name = "CO2Emissions")
    protected List<CO2Emissions> co2Emissions;

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the airSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the airSegment property.
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<>();
        }
        return this.airSegment;
    }

    /**
     * The carbon emissions produced by the journey
     * 
     * Gets the value of the co2Emissions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the co2Emissions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCO2Emissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CO2Emissions }
     * </p>
     * 
     * 
     * @return
     *     The value of the co2Emissions property.
     */
    public List<CO2Emissions> getCO2Emissions() {
        if (co2Emissions == null) {
            co2Emissions = new ArrayList<>();
        }
        return this.co2Emissions;
    }

}
