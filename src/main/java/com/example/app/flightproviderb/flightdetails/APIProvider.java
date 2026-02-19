
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}TransactionType" minOccurs="0"/>
 *         <element name="AvailablePseudoCityCode" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="SupplierCode" type="{http://www.travelport.com/schema/common_v54_0}typeSupplierCode" />
 *       <attribute name="IATACode" type="{http://www.travelport.com/schema/common_v54_0}typeIATA" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionType",
    "availablePseudoCityCode"
})
@XmlRootElement(name = "APIProvider", namespace = "http://www.travelport.com/schema/common_v54_0")
public class APIProvider {

    /**
     * Configuration for products by type. Inheritable.
     * 
     */
    @XmlElement(name = "TransactionType", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected TransactionType transactionType;
    @XmlElement(name = "AvailablePseudoCityCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<APIProvider.AvailablePseudoCityCode> availablePseudoCityCode;
    /**
     * The Provider Code of the host
     * 
     */
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    /**
     * The Supplier Code of the host
     * 
     */
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    /**
     * Agency IATA or ARC code, used as an ID with airlines.
     * 
     */
    @XmlAttribute(name = "IATACode")
    protected String iataCode;

    /**
     * Configuration for products by type. Inheritable.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     * @see #getTransactionType()
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the availablePseudoCityCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePseudoCityCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAvailablePseudoCityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProvider.AvailablePseudoCityCode }
     * </p>
     * 
     * 
     * @return
     *     The value of the availablePseudoCityCode property.
     */
    public List<APIProvider.AvailablePseudoCityCode> getAvailablePseudoCityCode() {
        if (availablePseudoCityCode == null) {
            availablePseudoCityCode = new ArrayList<>();
        }
        return this.availablePseudoCityCode;
    }

    /**
     * The Provider Code of the host
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
     * The Supplier Code of the host
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
     * Agency IATA or ARC code, used as an ID with airlines.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATACode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATACode()
     */
    public void setIATACode(String value) {
        this.iataCode = value;
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
     *       <attribute name="PseudoCityCode" type="{http://www.travelport.com/schema/common_v54_0}typePCC" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AvailablePseudoCityCode {

        /**
         * The PseudoCityCode used to connect to the host.
         * 
         */
        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;

        /**
         * The PseudoCityCode used to connect to the host.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * Sets the value of the pseudoCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPseudoCityCode()
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

    }

}
