
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
 *         <element name="PermittedConnectionPoints" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ProhibitedConnectionPoints" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedConnectionPoints",
    "prohibitedConnectionPoints"
})
@XmlRootElement(name = "RailLegModifiers", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailLegModifiers {

    @XmlElement(name = "PermittedConnectionPoints", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailLegModifiers.PermittedConnectionPoints permittedConnectionPoints;
    @XmlElement(name = "ProhibitedConnectionPoints", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailLegModifiers.ProhibitedConnectionPoints prohibitedConnectionPoints;
    @XmlAttribute(name = "Class")
    protected String clazz;

    /**
     * Gets the value of the permittedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link RailLegModifiers.PermittedConnectionPoints }
     *     
     */
    public RailLegModifiers.PermittedConnectionPoints getPermittedConnectionPoints() {
        return permittedConnectionPoints;
    }

    /**
     * Sets the value of the permittedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLegModifiers.PermittedConnectionPoints }
     *     
     */
    public void setPermittedConnectionPoints(RailLegModifiers.PermittedConnectionPoints value) {
        this.permittedConnectionPoints = value;
    }

    /**
     * Gets the value of the prohibitedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link RailLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public RailLegModifiers.ProhibitedConnectionPoints getProhibitedConnectionPoints() {
        return prohibitedConnectionPoints;
    }

    /**
     * Sets the value of the prohibitedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public void setProhibitedConnectionPoints(RailLegModifiers.ProhibitedConnectionPoints value) {
        this.prohibitedConnectionPoints = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
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
        "connectionPoint"
    })
    public static class PermittedConnectionPoints {

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         */
        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         * Gets the value of the connectionPoint property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * </p>
         * 
         * 
         * @return
         *     The value of the connectionPoint property.
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<>();
            }
            return this.connectionPoint;
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
     *       <sequence>
     *         <element ref="{http://www.travelport.com/schema/common_v54_0}ConnectionPoint" maxOccurs="999"/>
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
        "connectionPoint"
    })
    public static class ProhibitedConnectionPoints {

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         */
        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * A connection point can be eith an IATA airport or cir city code.
         * 
         * Gets the value of the connectionPoint property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * </p>
         * 
         * 
         * @return
         *     The value of the connectionPoint property.
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<>();
            }
            return this.connectionPoint;
        }

    }

}
