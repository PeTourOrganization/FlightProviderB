
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAgencyHierarchyReference complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeAgencyHierarchyReference">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="ProfileID" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProfileID" />
 *       <attribute name="ProfileType" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeAgencyProfileLevel" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyHierarchyReference", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlSeeAlso({
    TypeAgencyHierarchyLongReference.class
})
public class TypeAgencyHierarchyReference {

    @XmlAttribute(name = "ProfileID", required = true)
    protected BigInteger profileID;
    @XmlAttribute(name = "ProfileType", required = true)
    protected TypeAgencyProfileLevel profileType;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfileID(BigInteger value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAgencyProfileLevel }
     *     
     */
    public TypeAgencyProfileLevel getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAgencyProfileLevel }
     *     
     */
    public void setProfileType(TypeAgencyProfileLevel value) {
        this.profileType = value;
    }

}
