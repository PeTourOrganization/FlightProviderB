
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseReq">
 *       <choice>
 *         <element name="ListRetrieve">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationDetail"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DetailRetrieve">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationDetail" minOccurs="0"/>
 *                   <element name="EMDNumber" type="{http://www.travelport.com/schema/air_v54_0}typeEMDNumber"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "listRetrieve",
    "detailRetrieve"
})
@XmlRootElement(name = "EMDRetrieveReq")
public class EMDRetrieveReq
    extends BaseReq
{

    /**
     * Provider: 1G/1V/1P-Information required for retrieval of list of EMDs
     * 
     */
    @XmlElement(name = "ListRetrieve")
    protected EMDRetrieveReq.ListRetrieve listRetrieve;
    /**
     * Provider: 1G/1V/1P-Information required for a detailed EMD retrieve
     * 
     */
    @XmlElement(name = "DetailRetrieve")
    protected EMDRetrieveReq.DetailRetrieve detailRetrieve;

    /**
     * Provider: 1G/1V/1P-Information required for retrieval of list of EMDs
     * 
     * @return
     *     possible object is
     *     {@link EMDRetrieveReq.ListRetrieve }
     *     
     */
    public EMDRetrieveReq.ListRetrieve getListRetrieve() {
        return listRetrieve;
    }

    /**
     * Sets the value of the listRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDRetrieveReq.ListRetrieve }
     *     
     * @see #getListRetrieve()
     */
    public void setListRetrieve(EMDRetrieveReq.ListRetrieve value) {
        this.listRetrieve = value;
    }

    /**
     * Provider: 1G/1V/1P-Information required for a detailed EMD retrieve
     * 
     * @return
     *     possible object is
     *     {@link EMDRetrieveReq.DetailRetrieve }
     *     
     */
    public EMDRetrieveReq.DetailRetrieve getDetailRetrieve() {
        return detailRetrieve;
    }

    /**
     * Sets the value of the detailRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDRetrieveReq.DetailRetrieve }
     *     
     * @see #getDetailRetrieve()
     */
    public void setDetailRetrieve(EMDRetrieveReq.DetailRetrieve value) {
        this.detailRetrieve = value;
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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationDetail" minOccurs="0"/>
     *         <element name="EMDNumber" type="{http://www.travelport.com/schema/air_v54_0}typeEMDNumber"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerReservationDetail",
        "emdNumber"
    })
    public static class DetailRetrieve {

        /**
         * Provider reservation locator to be specified for display operation, if mentioned along woth the EMD number then synchronization of that EMD is performed considering the same to be associated with the mentioned PNR.
         * 
         */
        @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected TypeProviderReservationDetail providerReservationDetail;
        /**
         * EMD number to be specified for display operation. If mentioned along with provider reservation detail then synchronization of that EMD is performed considering the same to be associated with the mentioned PNR.
         * 
         */
        @XmlElement(name = "EMDNumber", required = true)
        protected String emdNumber;

        /**
         * Provider reservation locator to be specified for display operation, if mentioned along woth the EMD number then synchronization of that EMD is performed considering the same to be associated with the mentioned PNR.
         * 
         * @return
         *     possible object is
         *     {@link TypeProviderReservationDetail }
         *     
         */
        public TypeProviderReservationDetail getProviderReservationDetail() {
            return providerReservationDetail;
        }

        /**
         * Sets the value of the providerReservationDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeProviderReservationDetail }
         *     
         * @see #getProviderReservationDetail()
         */
        public void setProviderReservationDetail(TypeProviderReservationDetail value) {
            this.providerReservationDetail = value;
        }

        /**
         * EMD number to be specified for display operation. If mentioned along with provider reservation detail then synchronization of that EMD is performed considering the same to be associated with the mentioned PNR.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDNumber() {
            return emdNumber;
        }

        /**
         * Sets the value of the emdNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getEMDNumber()
         */
        public void setEMDNumber(String value) {
            this.emdNumber = value;
        }

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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ProviderReservationDetail"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerReservationDetail"
    })
    public static class ListRetrieve {

        /**
         * Provider reservation details to be provided to fetch list of EMDs associated with it.
         * 
         */
        @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected TypeProviderReservationDetail providerReservationDetail;

        /**
         * Provider reservation details to be provided to fetch list of EMDs associated with it.
         * 
         * @return
         *     possible object is
         *     {@link TypeProviderReservationDetail }
         *     
         */
        public TypeProviderReservationDetail getProviderReservationDetail() {
            return providerReservationDetail;
        }

        /**
         * Sets the value of the providerReservationDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeProviderReservationDetail }
         *     
         * @see #getProviderReservationDetail()
         */
        public void setProviderReservationDetail(TypeProviderReservationDetail value) {
            this.providerReservationDetail = value;
        }

    }

}
