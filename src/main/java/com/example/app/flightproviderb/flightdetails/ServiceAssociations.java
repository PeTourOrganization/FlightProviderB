
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
 *         <element name="ApplicableSegment" maxOccurs="999">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ResponseMessage" minOccurs="0"/>
 *                   <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServiceRef" minOccurs="0"/>
 *                 </choice>
 *                 <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "", propOrder = {
    "applicableSegment"
})
@XmlRootElement(name = "ServiceAssociations")
public class ServiceAssociations {

    /**
     * Applicable air segment associated with this brand.
     * 
     */
    @XmlElement(name = "ApplicableSegment", required = true)
    protected List<ServiceAssociations.ApplicableSegment> applicableSegment;

    /**
     * Applicable air segment associated with this brand.
     * 
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
     * {@link ServiceAssociations.ApplicableSegment }
     * </p>
     * 
     * 
     * @return
     *     The value of the applicableSegment property.
     */
    public List<ServiceAssociations.ApplicableSegment> getApplicableSegment() {
        if (applicableSegment == null) {
            applicableSegment = new ArrayList<>();
        }
        return this.applicableSegment;
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
     *       <choice>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ResponseMessage" minOccurs="0"/>
     *         <element ref="{http://www.travelport.com/schema/air_v54_0}OptionalServiceRef" minOccurs="0"/>
     *       </choice>
     *       <attribute name="Key" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "responseMessage",
        "optionalServiceRef"
    })
    public static class ApplicableSegment {

        /**
         * A simple textual fare note. Used within several other objects.
         * 
         */
        @XmlElement(name = "ResponseMessage", namespace = "http://www.travelport.com/schema/common_v54_0")
        protected ResponseMessage responseMessage;
        /**
         * Reference to optional service
         * 
         */
        @XmlElement(name = "OptionalServiceRef")
        protected String optionalServiceRef;
        /**
         * Applicable air segment key
         * 
         */
        @XmlAttribute(name = "Key")
        protected String key;

        /**
         * A simple textual fare note. Used within several other objects.
         * 
         * @return
         *     possible object is
         *     {@link ResponseMessage }
         *     
         */
        public ResponseMessage getResponseMessage() {
            return responseMessage;
        }

        /**
         * Sets the value of the responseMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseMessage }
         *     
         * @see #getResponseMessage()
         */
        public void setResponseMessage(ResponseMessage value) {
            this.responseMessage = value;
        }

        /**
         * Reference to optional service
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalServiceRef() {
            return optionalServiceRef;
        }

        /**
         * Sets the value of the optionalServiceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOptionalServiceRef()
         */
        public void setOptionalServiceRef(String value) {
            this.optionalServiceRef = value;
        }

        /**
         * Applicable air segment key
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getKey()
         */
        public void setKey(String value) {
            this.key = value;
        }

    }

}
