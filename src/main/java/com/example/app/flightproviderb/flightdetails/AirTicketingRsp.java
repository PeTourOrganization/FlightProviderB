
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
 *       <choice>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirSolutionChangedInfo" minOccurs="0"/>
 *         <sequence>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}ETR" maxOccurs="999" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}TicketFailureInfo" maxOccurs="999" minOccurs="0"/>
 *           <element ref="{http://www.travelport.com/schema/air_v54_0}DetailedBillingInformation" maxOccurs="999" minOccurs="0"/>
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
@XmlRootElement(name = "AirTicketingRsp")
public class AirTicketingRsp
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
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "ETR")
    protected List<ETR> etr;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "TicketFailureInfo")
    protected List<TicketFailureInfo> ticketFailureInfo;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "DetailedBillingInformation")
    protected List<DetailedBillingInformation> detailedBillingInformation;

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
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the etr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getETR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETR }
     * </p>
     * 
     * 
     * @return
     *     The value of the etr property.
     */
    public List<ETR> getETR() {
        if (etr == null) {
            etr = new ArrayList<>();
        }
        return this.etr;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the ticketFailureInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketFailureInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketFailureInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketFailureInfo property.
     */
    public List<TicketFailureInfo> getTicketFailureInfo() {
        if (ticketFailureInfo == null) {
            ticketFailureInfo = new ArrayList<>();
        }
        return this.ticketFailureInfo;
    }

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the detailedBillingInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedBillingInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDetailedBillingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedBillingInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the detailedBillingInformation property.
     */
    public List<DetailedBillingInformation> getDetailedBillingInformation() {
        if (detailedBillingInformation == null) {
            detailedBillingInformation = new ArrayList<>();
        }
        return this.detailedBillingInformation;
    }

}
