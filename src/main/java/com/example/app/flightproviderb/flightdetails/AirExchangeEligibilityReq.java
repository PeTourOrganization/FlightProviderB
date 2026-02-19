
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="ProviderReservationInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservation"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationInfo"
})
@XmlRootElement(name = "AirExchangeEligibilityReq")
public class AirExchangeEligibilityReq
    extends BaseReq
{

    /**
     * Provider:1P - Represents a valid Provider Reservation/PNR whose itinerary is to be exchanged
     * 
     */
    @XmlElement(name = "ProviderReservationInfo", required = true)
    protected AirExchangeEligibilityReq.ProviderReservationInfo providerReservationInfo;
    /**
     * Type choices are "Detail" or "Summary"  Default will be Summary
     * 
     */
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Provider:1P - Represents a valid Provider Reservation/PNR whose itinerary is to be exchanged
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeEligibilityReq.ProviderReservationInfo }
     *     
     */
    public AirExchangeEligibilityReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeEligibilityReq.ProviderReservationInfo }
     *     
     * @see #getProviderReservationInfo()
     */
    public void setProviderReservationInfo(AirExchangeEligibilityReq.ProviderReservationInfo value) {
        this.providerReservationInfo = value;
    }

    /**
     * Type choices are "Detail" or "Summary"  Default will be Summary
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
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
