
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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="AgentID" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="32"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AgentIDOverride", namespace = "http://www.travelport.com/schema/common_v54_0")
public class AgentIDOverride {

    /**
     * Supplier code to determine which vendor this AgentId belongs to.
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * Provider code to route the AgentId to proper provider.
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * The Agent ID for the applicable supplier/vendor
     * 
     */
    @XmlAttribute(name = "AgentID", required = true)
    protected String agentID;

    /**
     * Supplier code to determine which vendor this AgentId belongs to.
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

    /**
     * Provider code to route the AgentId to proper provider.
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
     * @see #getProviderCode()
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * The Agent ID for the applicable supplier/vendor
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Sets the value of the agentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgentID()
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

}
