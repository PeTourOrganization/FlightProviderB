
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAgencyHierarchyLongReference complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typeAgencyHierarchyLongReference">
 *   <complexContent>
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}typeAgencyHierarchyReference">
 *       <attribute name="ProfileVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="ProfileName" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="102"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyHierarchyLongReference", namespace = "http://www.travelport.com/schema/common_v54_0")
public class TypeAgencyHierarchyLongReference
    extends TypeAgencyHierarchyReference
{

    @XmlAttribute(name = "ProfileVersion", required = true)
    protected int profileVersion;
    /**
     * Initially: Agent: Last, First, Branch: BranchCode, Agency: Name. After new profile  implementation: Agent: UserName, others levels: Name.
     * 
     */
    @XmlAttribute(name = "ProfileName", required = true)
    protected String profileName;

    /**
     * Gets the value of the profileVersion property.
     * 
     */
    public int getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     */
    public void setProfileVersion(int value) {
        this.profileVersion = value;
    }

    /**
     * Initially: Agent: Last, First, Branch: BranchCode, Agency: Name. After new profile  implementation: Agent: UserName, others levels: Name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileName()
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

}
