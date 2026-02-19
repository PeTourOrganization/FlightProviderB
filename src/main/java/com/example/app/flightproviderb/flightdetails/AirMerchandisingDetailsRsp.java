
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServices" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Brand" maxOccurs="99" minOccurs="0"/>
 *         <element name="UnassociatedBookingCodeList" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ApplicableSegment" type="{http://www.travelport.com/schema/air_v54_0}typeApplicableSegment" maxOccurs="99" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "optionalServices",
    "brand",
    "unassociatedBookingCodeList"
})
@XmlRootElement(name = "AirMerchandisingDetailsRsp")
public class AirMerchandisingDetailsRsp
    extends BaseRsp
{

    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     */
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    /**
     * Commercially recognized product offered by an airline
     * 
     */
    @XmlElement(name = "Brand")
    protected List<Brand> brand;
    /**
     * Lists classes of service by segment sent in the request which are not associated to a brand.
     * 
     */
    @XmlElement(name = "UnassociatedBookingCodeList")
    protected AirMerchandisingDetailsRsp.UnassociatedBookingCodeList unassociatedBookingCodeList;

    /**
     * A wrapper for all the information regarding each
     *                 of the Optional services
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     * @see #getOptionalServices()
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Commercially recognized product offered by an airline
     * 
     * Gets the value of the brand property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brand property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBrand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brand }
     * </p>
     * 
     * 
     * @return
     *     The value of the brand property.
     */
    public List<Brand> getBrand() {
        if (brand == null) {
            brand = new ArrayList<>();
        }
        return this.brand;
    }

    /**
     * Lists classes of service by segment sent in the request which are not associated to a brand.
     * 
     * @return
     *     possible object is
     *     {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     *     
     */
    public AirMerchandisingDetailsRsp.UnassociatedBookingCodeList getUnassociatedBookingCodeList() {
        return unassociatedBookingCodeList;
    }

    /**
     * Sets the value of the unassociatedBookingCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     *     
     * @see #getUnassociatedBookingCodeList()
     */
    public void setUnassociatedBookingCodeList(AirMerchandisingDetailsRsp.UnassociatedBookingCodeList value) {
        this.unassociatedBookingCodeList = value;
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
     *         <element name="ApplicableSegment" type="{http://www.travelport.com/schema/air_v54_0}typeApplicableSegment" maxOccurs="99" minOccurs="0"/>
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
        "applicableSegment"
    })
    public static class UnassociatedBookingCodeList {

        @XmlElement(name = "ApplicableSegment")
        protected List<TypeApplicableSegment> applicableSegment;

        /**
         * Gets the value of the applicableSegment property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicableSegment property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getApplicableSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeApplicableSegment }
         * </p>
         * 
         * 
         * @return
         *     The value of the applicableSegment property.
         */
        public List<TypeApplicableSegment> getApplicableSegment() {
            if (applicableSegment == null) {
                applicableSegment = new ArrayList<>();
            }
            return this.applicableSegment;
        }

    }

}
