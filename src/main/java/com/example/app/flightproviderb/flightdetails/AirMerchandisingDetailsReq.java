
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}MerchandisingDetails"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServiceModifiers"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}MerchandisingAvailabilityDetails"/>
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
    "merchandisingDetails",
    "optionalServiceModifiers",
    "merchandisingAvailabilityDetails"
})
@XmlRootElement(name = "AirMerchandisingDetailsReq")
public class AirMerchandisingDetailsReq
    extends BaseReq
{

    /**
     * Rich Content and Branding for a fare brand.
     * 
     */
    @XmlElement(name = "MerchandisingDetails")
    protected MerchandisingDetails merchandisingDetails;
    /**
     * Rich Content and Branding for an optional service
     * 
     */
    @XmlElement(name = "OptionalServiceModifiers")
    protected OptionalServiceModifiers optionalServiceModifiers;
    /**
     * Rich Content and Branding for an air segment
     * 
     */
    @XmlElement(name = "MerchandisingAvailabilityDetails")
    protected MerchandisingAvailabilityDetails merchandisingAvailabilityDetails;

    /**
     * Rich Content and Branding for a fare brand.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingDetails }
     *     
     */
    public MerchandisingDetails getMerchandisingDetails() {
        return merchandisingDetails;
    }

    /**
     * Sets the value of the merchandisingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingDetails }
     *     
     * @see #getMerchandisingDetails()
     */
    public void setMerchandisingDetails(MerchandisingDetails value) {
        this.merchandisingDetails = value;
    }

    /**
     * Rich Content and Branding for an optional service
     * 
     * @return
     *     possible object is
     *     {@link OptionalServiceModifiers }
     *     
     */
    public OptionalServiceModifiers getOptionalServiceModifiers() {
        return optionalServiceModifiers;
    }

    /**
     * Sets the value of the optionalServiceModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServiceModifiers }
     *     
     * @see #getOptionalServiceModifiers()
     */
    public void setOptionalServiceModifiers(OptionalServiceModifiers value) {
        this.optionalServiceModifiers = value;
    }

    /**
     * Rich Content and Branding for an air segment
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingAvailabilityDetails }
     *     
     */
    public MerchandisingAvailabilityDetails getMerchandisingAvailabilityDetails() {
        return merchandisingAvailabilityDetails;
    }

    /**
     * Sets the value of the merchandisingAvailabilityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingAvailabilityDetails }
     *     
     * @see #getMerchandisingAvailabilityDetails()
     */
    public void setMerchandisingAvailabilityDetails(MerchandisingAvailabilityDetails value) {
        this.merchandisingAvailabilityDetails = value;
    }

}
