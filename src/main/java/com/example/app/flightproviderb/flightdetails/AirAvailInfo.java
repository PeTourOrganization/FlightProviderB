
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingCodeInfo" maxOccurs="999" minOccurs="0"/>
 *         <element name="FareTokenInfo" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="FareInfoRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="HostTokenRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="ProviderCode" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="HostTokenRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingCodeInfo",
    "fareTokenInfo"
})
@XmlRootElement(name = "AirAvailInfo")
public class AirAvailInfo {

    /**
     * Details Cabin class info and class of
     *                 service information with availability counts. Only provided on
     *                 search results and grouped by Cabin class
     * 
     */
    @XmlElement(name = "BookingCodeInfo")
    protected List<BookingCodeInfo> bookingCodeInfo;
    /**
     * Associates Fare with HostToken
     * 
     */
    @XmlElement(name = "FareTokenInfo")
    protected List<AirAvailInfo.FareTokenInfo> fareTokenInfo;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "HostTokenRef")
    protected String hostTokenRef;

    /**
     * Details Cabin class info and class of
     *                 service information with availability counts. Only provided on
     *                 search results and grouped by Cabin class
     * 
     * Gets the value of the bookingCodeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingCodeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCodeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingCodeInfo property.
     */
    public List<BookingCodeInfo> getBookingCodeInfo() {
        if (bookingCodeInfo == null) {
            bookingCodeInfo = new ArrayList<>();
        }
        return this.bookingCodeInfo;
    }

    /**
     * Associates Fare with HostToken
     * 
     * Gets the value of the fareTokenInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTokenInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareTokenInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAvailInfo.FareTokenInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareTokenInfo property.
     */
    public List<AirAvailInfo.FareTokenInfo> getFareTokenInfo() {
        if (fareTokenInfo == null) {
            fareTokenInfo = new ArrayList<>();
        }
        return this.fareTokenInfo;
    }

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
     * Gets the value of the hostTokenRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTokenRef() {
        return hostTokenRef;
    }

    /**
     * Sets the value of the hostTokenRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTokenRef(String value) {
        this.hostTokenRef = value;
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
     *       <attribute name="FareInfoRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="HostTokenRef" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareTokenInfo {

        @XmlAttribute(name = "FareInfoRef", required = true)
        protected String fareInfoRef;
        @XmlAttribute(name = "HostTokenRef", required = true)
        protected String hostTokenRef;

        /**
         * Gets the value of the fareInfoRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareInfoRef() {
            return fareInfoRef;
        }

        /**
         * Sets the value of the fareInfoRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareInfoRef(String value) {
            this.fareInfoRef = value;
        }

        /**
         * Gets the value of the hostTokenRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostTokenRef() {
            return hostTokenRef;
        }

        /**
         * Sets the value of the hostTokenRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostTokenRef(String value) {
            this.hostTokenRef = value;
        }

    }

}
