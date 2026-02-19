
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="ReasonCode" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OutOfPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="PurposeOfTrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v54_0}typePolicy" />
 *       <attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="OutOfPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reasonCode"
})
@XmlRootElement(name = "PolicyInformation", namespace = "http://www.travelport.com/schema/common_v54_0")
public class PolicyInformation {

    /**
     * Reason Code
     * 
     */
    @XmlElement(name = "ReasonCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PolicyInformation.ReasonCode reasonCode;
    /**
     * Policy Type - Air, Hotel, Car, Rail,
     * 						Ticketing
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypePolicy type;
    /**
     * Policy Name
     * 
     */
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    /**
     * In Policy / Out of Policy Indicator
     * 
     */
    @XmlAttribute(name = "OutOfPolicy")
    protected Boolean outOfPolicy;
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;

    /**
     * Reason Code
     * 
     * @return
     *     possible object is
     *     {@link PolicyInformation.ReasonCode }
     *     
     */
    public PolicyInformation.ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyInformation.ReasonCode }
     *     
     * @see #getReasonCode()
     */
    public void setReasonCode(PolicyInformation.ReasonCode value) {
        this.reasonCode = value;
    }

    /**
     * Policy Type - Air, Hotel, Car, Rail,
     * 						Ticketing
     * 
     * @return
     *     possible object is
     *     {@link TypePolicy }
     *     
     */
    public TypePolicy getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePolicy }
     *     
     * @see #getType()
     */
    public void setType(TypePolicy value) {
        this.type = value;
    }

    /**
     * Policy Name
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * In Policy / Out of Policy Indicator
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfPolicy() {
        return outOfPolicy;
    }

    /**
     * Sets the value of the outOfPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOutOfPolicy()
     */
    public void setOutOfPolicy(Boolean value) {
        this.outOfPolicy = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
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
     *         <element name="OutOfPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="PurposeOfTrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" minOccurs="0"/>
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
        "outOfPolicy",
        "purposeOfTrip",
        "remark"
    })
    public static class ReasonCode {

        /**
         * Reason Code - Out of Policy
         * 
         */
        @XmlElement(name = "OutOfPolicy", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected String outOfPolicy;
        /**
         * Reason Code -Purpose of Trip
         * 
         */
        @XmlElement(name = "PurposeOfTrip", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected String purposeOfTrip;
        /**
         * A textual remark container to hold any printable text. (max 512 chars)
         * 
         */
        @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected Remark remark;

        /**
         * Reason Code - Out of Policy
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutOfPolicy() {
            return outOfPolicy;
        }

        /**
         * Sets the value of the outOfPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOutOfPolicy()
         */
        public void setOutOfPolicy(String value) {
            this.outOfPolicy = value;
        }

        /**
         * Reason Code -Purpose of Trip
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurposeOfTrip() {
            return purposeOfTrip;
        }

        /**
         * Sets the value of the purposeOfTrip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPurposeOfTrip()
         */
        public void setPurposeOfTrip(String value) {
            this.purposeOfTrip = value;
        }

        /**
         * A textual remark container to hold any printable text. (max 512 chars)
         * 
         * @return
         *     possible object is
         *     {@link Remark }
         *     
         */
        public Remark getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link Remark }
         *     
         * @see #getRemark()
         */
        public void setRemark(Remark value) {
            this.remark = value;
        }

    }

}
