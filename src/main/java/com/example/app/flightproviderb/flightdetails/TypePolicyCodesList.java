
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePolicyCodesList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="typePolicyCodesList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PolicyCode" maxOccurs="10" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MinPolicyCode" maxOccurs="10" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MaxPolicyCode" maxOccurs="10" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePolicyCodesList", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "policyCode",
    "minPolicyCode",
    "maxPolicyCode"
})
public class TypePolicyCodesList {

    /**
     * A code that indicates why an item was determined to be ‘out of policy’.
     * 
     */
    @XmlElement(name = "PolicyCode")
    protected List<String> policyCode;
    /**
     * A code that indicates why the minimum fare or rate was determined to be ‘out of policy’.
     * 
     */
    @XmlElement(name = "MinPolicyCode")
    protected List<String> minPolicyCode;
    /**
     * A code that indicates why the maximum fare or rate was determined to be ‘out of policy’.
     * 
     */
    @XmlElement(name = "MaxPolicyCode")
    protected List<String> maxPolicyCode;

    /**
     * A code that indicates why an item was determined to be ‘out of policy’.
     * 
     * Gets the value of the policyCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the policyCode property.
     */
    public List<String> getPolicyCode() {
        if (policyCode == null) {
            policyCode = new ArrayList<>();
        }
        return this.policyCode;
    }

    /**
     * A code that indicates why the minimum fare or rate was determined to be ‘out of policy’.
     * 
     * Gets the value of the minPolicyCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minPolicyCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMinPolicyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the minPolicyCode property.
     */
    public List<String> getMinPolicyCode() {
        if (minPolicyCode == null) {
            minPolicyCode = new ArrayList<>();
        }
        return this.minPolicyCode;
    }

    /**
     * A code that indicates why the maximum fare or rate was determined to be ‘out of policy’.
     * 
     * Gets the value of the maxPolicyCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxPolicyCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMaxPolicyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the maxPolicyCode property.
     */
    public List<String> getMaxPolicyCode() {
        if (maxPolicyCode == null) {
            maxPolicyCode = new ArrayList<>();
        }
        return this.maxPolicyCode;
    }

}
