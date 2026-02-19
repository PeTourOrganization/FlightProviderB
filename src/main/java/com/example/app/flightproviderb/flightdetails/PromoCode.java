
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
 *       <attribute name="Code" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="64"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="SupplierCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PromoCode")
public class PromoCode {

    /**
     * To be used to specify Promotional Code.
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    /**
     * To be used to specify Provider Code.
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * To be used to specify Supplier Code.
     * 
     */
    @XmlAttribute(name = "SupplierCode", required = true)
    protected String supplierCode;

    /**
     * To be used to specify Promotional Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * To be used to specify Provider Code.
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
     * To be used to specify Supplier Code.
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
