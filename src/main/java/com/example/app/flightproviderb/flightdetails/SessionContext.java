
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
 *       <choice>
 *         <element name="SessTok">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SessProp" maxOccurs="999">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="nm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessTok",
    "sessProp"
})
@XmlRootElement(name = "SessionContext", namespace = "http://www.travelport.com/soa/common/security/SessionContext_v1_0")
public class SessionContext {

    /**
     * A Session Token provided by Travelport
     * 
     */
    @XmlElement(name = "SessTok", namespace = "http://www.travelport.com/soa/common/security/SessionContext_v1_0")
    protected SessionContext.SessTok sessTok;
    /**
     * A session property combination
     * 
     */
    @XmlElement(name = "SessProp", namespace = "http://www.travelport.com/soa/common/security/SessionContext_v1_0")
    protected List<SessionContext.SessProp> sessProp;

    /**
     * A Session Token provided by Travelport
     * 
     * @return
     *     possible object is
     *     {@link SessionContext.SessTok }
     *     
     */
    public SessionContext.SessTok getSessTok() {
        return sessTok;
    }

    /**
     * Sets the value of the sessTok property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionContext.SessTok }
     *     
     * @see #getSessTok()
     */
    public void setSessTok(SessionContext.SessTok value) {
        this.sessTok = value;
    }

    /**
     * A session property combination
     * 
     * Gets the value of the sessProp property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessProp property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSessProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionContext.SessProp }
     * </p>
     * 
     * 
     * @return
     *     The value of the sessProp property.
     */
    public List<SessionContext.SessProp> getSessProp() {
        if (sessProp == null) {
            sessProp = new ArrayList<>();
        }
        return this.sessProp;
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
     *       <attribute name="nm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="val" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SessProp {

        /**
         * Name of the Session Property
         * 
         */
        @XmlAttribute(name = "nm", required = true)
        protected String nm;
        /**
         * Value of the Session Property
         * 
         */
        @XmlAttribute(name = "val", required = true)
        protected String val;

        /**
         * Name of the Session Property
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNm() {
            return nm;
        }

        /**
         * Sets the value of the nm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNm()
         */
        public void setNm(String value) {
            this.nm = value;
        }

        /**
         * Value of the Session Property
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getVal()
         */
        public void setVal(String value) {
            this.val = value;
        }

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
     *       <attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SessTok {

        /**
         * ID of the Session Token
         * 
         */
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * ID of the Session Token
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getId()
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
