
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element name="PreferredSuppliers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSupplier" maxOccurs="999"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="MaxChanges" default="2">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="0"/>
 *             <maxInclusive value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Direction" type="{http://www.travelport.com/schema/rail_v54_0}typeRailDirection" />
 *       <attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MaxSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" default="300" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preferredSuppliers"
})
@XmlRootElement(name = "RailSearchModifiers", namespace = "http://www.travelport.com/schema/rail_v54_0")
public class RailSearchModifiers {

    @XmlElement(name = "PreferredSuppliers", namespace = "http://www.travelport.com/schema/rail_v54_0")
    protected RailSearchModifiers.PreferredSuppliers preferredSuppliers;
    /**
     * The maximum number of stops within a connection.
     * 
     */
    @XmlAttribute(name = "MaxChanges")
    protected Integer maxChanges;
    /**
     * The direction of travel.
     * 
     */
    @XmlAttribute(name = "Direction")
    protected TypeRailDirection direction;
    @XmlAttribute(name = "Class")
    protected String clazz;
    /**
     * The maximum number of solutions to return. Decreasing this number
     * 
     */
    @XmlAttribute(name = "MaxSolutions")
    protected BigInteger maxSolutions;

    /**
     * Gets the value of the preferredSuppliers property.
     * 
     * @return
     *     possible object is
     *     {@link RailSearchModifiers.PreferredSuppliers }
     *     
     */
    public RailSearchModifiers.PreferredSuppliers getPreferredSuppliers() {
        return preferredSuppliers;
    }

    /**
     * Sets the value of the preferredSuppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSearchModifiers.PreferredSuppliers }
     *     
     */
    public void setPreferredSuppliers(RailSearchModifiers.PreferredSuppliers value) {
        this.preferredSuppliers = value;
    }

    /**
     * The maximum number of stops within a connection.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxChanges() {
        if (maxChanges == null) {
            return  2;
        } else {
            return maxChanges;
        }
    }

    /**
     * Sets the value of the maxChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxChanges()
     */
    public void setMaxChanges(Integer value) {
        this.maxChanges = value;
    }

    /**
     * The direction of travel.
     * 
     * @return
     *     possible object is
     *     {@link TypeRailDirection }
     *     
     */
    public TypeRailDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRailDirection }
     *     
     * @see #getDirection()
     */
    public void setDirection(TypeRailDirection value) {
        this.direction = value;
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
     * The maximum number of solutions to return. Decreasing this number
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSolutions() {
        if (maxSolutions == null) {
            return new BigInteger("300");
        } else {
            return maxSolutions;
        }
    }

    /**
     * Sets the value of the maxSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxSolutions()
     */
    public void setMaxSolutions(BigInteger value) {
        this.maxSolutions = value;
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
     *         <element ref="{http://www.travelport.com/schema/rail_v54_0}RailSupplier" maxOccurs="999"/>
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
        "railSupplier"
    })
    public static class PreferredSuppliers {

        @XmlElement(name = "RailSupplier", namespace = "http://www.travelport.com/schema/rail_v54_0", required = true)
        protected List<RailSupplier> railSupplier;

        /**
         * Gets the value of the railSupplier property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the railSupplier property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRailSupplier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RailSupplier }
         * </p>
         * 
         * 
         * @return
         *     The value of the railSupplier property.
         */
        public List<RailSupplier> getRailSupplier() {
            if (railSupplier == null) {
                railSupplier = new ArrayList<>();
            }
            return this.railSupplier;
        }

    }

}
