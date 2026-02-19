
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TicketNumber" maxOccurs="999" minOccurs="0"/>
 *         <element name="TCRNumber" type="{http://www.travelport.com/schema/air_v54_0}typeTCRNumber" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}AirRefundModifiers" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}HostToken" maxOccurs="999" minOccurs="0"/>
 *         <element name="ProviderReservationInfo" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Ignore" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticketNumber",
    "tcrNumber",
    "airRefundModifiers",
    "hostToken",
    "providerReservationInfo"
})
@XmlRootElement(name = "AirRefundQuoteReq")
public class AirRefundQuoteReq
    extends BaseReq
{

    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> ticketNumber;
    /**
     * Provider: ACH-The identifying number for a Ticketless Air Reservation
     * 
     */
    @XmlElement(name = "TCRNumber")
    protected List<String> tcrNumber;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "AirRefundModifiers")
    protected AirRefundModifiers airRefundModifiers;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<HostToken> hostToken;
    /**
     * Provider: 1P - Represents a valid Provider Reservation/PNR whose itinerary is to be requested
     * 
     */
    @XmlElement(name = "ProviderReservationInfo")
    protected List<AirRefundQuoteReq.ProviderReservationInfo> providerReservationInfo;
    /**
     * Provider: ACH.
     * 
     */
    @XmlAttribute(name = "Ignore")
    protected Boolean ignore;

    /**
     * Provider: ACH.
     * 
     * Gets the value of the ticketNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketNumber property.
     */
    public List<String> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<>();
        }
        return this.ticketNumber;
    }

    /**
     * Provider: ACH-The identifying number for a Ticketless Air Reservation
     * 
     * Gets the value of the tcrNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTCRNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the tcrNumber property.
     */
    public List<String> getTCRNumber() {
        if (tcrNumber == null) {
            tcrNumber = new ArrayList<>();
        }
        return this.tcrNumber;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirRefundModifiers }
     *     
     */
    public AirRefundModifiers getAirRefundModifiers() {
        return airRefundModifiers;
    }

    /**
     * Sets the value of the airRefundModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRefundModifiers }
     *     
     * @see #getAirRefundModifiers()
     */
    public void setAirRefundModifiers(AirRefundModifiers value) {
        this.airRefundModifiers = value;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the hostToken property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostToken property.
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<>();
        }
        return this.hostToken;
    }

    /**
     * Provider: 1P - Represents a valid Provider Reservation/PNR whose itinerary is to be requested
     * 
     * Gets the value of the providerReservationInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderReservationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRefundQuoteReq.ProviderReservationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerReservationInfo property.
     */
    public List<AirRefundQuoteReq.ProviderReservationInfo> getProviderReservationInfo() {
        if (providerReservationInfo == null) {
            providerReservationInfo = new ArrayList<>();
        }
        return this.providerReservationInfo;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnore() {
        if (ignore == null) {
            return false;
        } else {
            return ignore;
        }
    }

    /**
     * Sets the value of the ignore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIgnore()
     */
    public void setIgnore(Boolean value) {
        this.ignore = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProviderReservationInfo {

        @XmlAttribute(name = "ProviderCode", required = true)
        protected String providerCode;
        @XmlAttribute(name = "ProviderLocatorCode", required = true)
        protected String providerLocatorCode;
        /**
         * Represents Carrier Code for ACH PNR Retrieve.
         * 
         */
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;

        /**
         * Gets the value of the providerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderCode() {
            return providerCode;
        }

        /**
         * Sets the value of the providerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderCode(String value) {
            this.providerCode = value;
        }

        /**
         * Gets the value of the providerLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProviderLocatorCode() {
            return providerLocatorCode;
        }

        /**
         * Sets the value of the providerLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProviderLocatorCode(String value) {
            this.providerLocatorCode = value;
        }

        /**
         * Represents Carrier Code for ACH PNR Retrieve.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * Sets the value of the supplierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSupplierCode()
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

    }

}
