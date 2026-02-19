
package com.example.app.flightproviderb.flightdetails;

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
 *       <choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSolutionChangedInfo" minOccurs="0"/>
 *         <sequence>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}ETR" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}TicketFailureInfo" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}DetailedBillingInformation" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSolutionChangedInfo",
    "etr",
    "ticketFailureInfo",
    "detailedBillingInformation"
})
@XmlRootElement(name = "AirExchangeTicketingRsp")
public class AirExchangeTicketingRsp
    extends BaseRsp
{

    /**
     * If RetainReservation is None, this will contain
     *                 the new values returned from the provider. If RetainReservation is
     *                 Price, Schedule, or Both and there is a price/schedule change, this
     *                 will contain the new values that were returned from the provider. If
     *                 RetainReservation is Price, Schedule, or Both and there isn’t a
     *                 price/schedule change, this element will not be returned.
     * 
     */
    @XmlElement(name = "AirSolutionChangedInfo")
    protected AirSolutionChangedInfo airSolutionChangedInfo;
    /**
     * Provider 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "ETR")
    protected ETR etr;
    /**
     * Provider 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "TicketFailureInfo")
    protected TicketFailureInfo ticketFailureInfo;
    /**
     * Providers 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "DetailedBillingInformation")
    protected DetailedBillingInformation detailedBillingInformation;

    /**
     * If RetainReservation is None, this will contain
     *                 the new values returned from the provider. If RetainReservation is
     *                 Price, Schedule, or Both and there is a price/schedule change, this
     *                 will contain the new values that were returned from the provider. If
     *                 RetainReservation is Price, Schedule, or Both and there isn’t a
     *                 price/schedule change, this element will not be returned.
     * 
     * @return
     *     possible object is
     *     {@link AirSolutionChangedInfo }
     *     
     */
    public AirSolutionChangedInfo getAirSolutionChangedInfo() {
        return airSolutionChangedInfo;
    }

    /**
     * Sets the value of the airSolutionChangedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSolutionChangedInfo }
     *     
     * @see #getAirSolutionChangedInfo()
     */
    public void setAirSolutionChangedInfo(AirSolutionChangedInfo value) {
        this.airSolutionChangedInfo = value;
    }

    /**
     * Provider 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link ETR }
     *     
     */
    public ETR getETR() {
        return etr;
    }

    /**
     * Sets the value of the etr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETR }
     *     
     * @see #getETR()
     */
    public void setETR(ETR value) {
        this.etr = value;
    }

    /**
     * Provider 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link TicketFailureInfo }
     *     
     */
    public TicketFailureInfo getTicketFailureInfo() {
        return ticketFailureInfo;
    }

    /**
     * Sets the value of the ticketFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketFailureInfo }
     *     
     * @see #getTicketFailureInfo()
     */
    public void setTicketFailureInfo(TicketFailureInfo value) {
        this.ticketFailureInfo = value;
    }

    /**
     * Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link DetailedBillingInformation }
     *     
     */
    public DetailedBillingInformation getDetailedBillingInformation() {
        return detailedBillingInformation;
    }

    /**
     * Sets the value of the detailedBillingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedBillingInformation }
     *     
     * @see #getDetailedBillingInformation()
     */
    public void setDetailedBillingInformation(DetailedBillingInformation value) {
        this.detailedBillingInformation = value;
    }

}
