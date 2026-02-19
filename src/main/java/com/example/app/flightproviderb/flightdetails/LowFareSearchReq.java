
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}BaseLowFareSearchReq">
 *       <attribute name="PolicyReference" type="{http://www.travelport.com/schema/common_v54_0}typePolicyReference" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LowFareSearchReq")
public class LowFareSearchReq
    extends BaseLowFareSearchReq
{

    /**
     * This attribute will be used to pass in a value on the request which would be used to link to a ‘Policy Group’ in a policy engine external to UAPI.
     * 
     */
    @XmlAttribute(name = "PolicyReference")
    protected String policyReference;

    /**
     * This attribute will be used to pass in a value on the request which would be used to link to a ‘Policy Group’ in a policy engine external to UAPI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPolicyReference()
     */
    public void setPolicyReference(String value) {
        this.policyReference = value;
    }

}
