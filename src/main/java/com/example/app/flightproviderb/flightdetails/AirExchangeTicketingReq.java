
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirReservationLocatorCode"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber"/>
 *         <element name="TicketingModifiersRef" type="{http://www.travelport.com/schema/air_v54_0}typeTicketingModifiersRef" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}WaiverCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}DetailedBillingInformation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirTicketingModifiers" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ChangeFeeOnTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "ticketNumber",
    "ticketingModifiersRef",
    "waiverCode",
    "detailedBillingInformation",
    "airTicketingModifiers"
})
@XmlRootElement(name = "AirExchangeTicketingReq")
public class AirExchangeTicketingReq
    extends BaseReq
{

    /**
     * Identifies the PNR to ticket. Providers 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "AirReservationLocatorCode", required = true)
    protected AirReservationLocatorCode airReservationLocatorCode;
    /**
     * Ticket number to reissue. Providers 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected String ticketNumber;
    /**
     * Provider: 1P-Reference to a shared list of Ticketing Modifiers. This is supported for Worldspan provider only. When AirPricingInfoRef is used along with TicketingModifiersRef means that particular TicketingModifiers will to be applied while ticketing the Stored fare corresponding to the AirPricingInfo. Absence of AirPricingInfoRef means that particular TicketingModifiers will be applied to all Stored fares which are requested to be ticketed.
     * 
     */
    @XmlElement(name = "TicketingModifiersRef")
    protected List<TypeTicketingModifiersRef> ticketingModifiersRef;
    /**
     * Waiver code to override fare validations
     * 
     */
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    /**
     * Providers 1G, 1V, 1P.
     * 
     */
    @XmlElement(name = "DetailedBillingInformation")
    protected List<DetailedBillingInformation> detailedBillingInformation;
    /**
     * Provider: 1G,1V,1P.
     * 
     */
    @XmlElement(name = "AirTicketingModifiers")
    protected List<AirTicketingModifiers> airTicketingModifiers;
    /**
     * Providers 1G, 1V, 1P.
     * 
     */
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;
    /**
     * Applies the change fee/penalty to the original form of payment. Providers: 1V
     * 
     */
    @XmlAttribute(name = "ChangeFeeOnTicket")
    protected Boolean changeFeeOnTicket;

    /**
     * Identifies the PNR to ticket. Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     * @see #getAirReservationLocatorCode()
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Ticket number to reissue. Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketNumber()
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Provider: 1P-Reference to a shared list of Ticketing Modifiers. This is supported for Worldspan provider only. When AirPricingInfoRef is used along with TicketingModifiersRef means that particular TicketingModifiers will to be applied while ticketing the Stored fare corresponding to the AirPricingInfo. Absence of AirPricingInfoRef means that particular TicketingModifiers will be applied to all Stored fares which are requested to be ticketed.
     * 
     * Gets the value of the ticketingModifiersRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiersRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketingModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketingModifiersRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketingModifiersRef property.
     */
    public List<TypeTicketingModifiersRef> getTicketingModifiersRef() {
        if (ticketingModifiersRef == null) {
            ticketingModifiersRef = new ArrayList<>();
        }
        return this.ticketingModifiersRef;
    }

    /**
     * Waiver code to override fare validations
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     * @see #getWaiverCode()
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * Providers 1G, 1V, 1P.
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

    /**
     * Provider: 1G,1V,1P.
     * 
     * Gets the value of the airTicketingModifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTicketingModifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAirTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingModifiers }
     * </p>
     * 
     * 
     * @return
     *     The value of the airTicketingModifiers property.
     */
    public List<AirTicketingModifiers> getAirTicketingModifiers() {
        if (airTicketingModifiers == null) {
            airTicketingModifiers = new ArrayList<>();
        }
        return this.airTicketingModifiers;
    }

    /**
     * Providers 1G, 1V, 1P.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBulkTicket()
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
    }

    /**
     * Applies the change fee/penalty to the original form of payment. Providers: 1V
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeFeeOnTicket() {
        if (changeFeeOnTicket == null) {
            return true;
        } else {
            return changeFeeOnTicket;
        }
    }

    /**
     * Sets the value of the changeFeeOnTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChangeFeeOnTicket()
     */
    public void setChangeFeeOnTicket(Boolean value) {
        this.changeFeeOnTicket = value;
    }

}
