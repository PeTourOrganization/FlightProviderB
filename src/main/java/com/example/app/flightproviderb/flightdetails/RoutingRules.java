
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
 *         <element name="Routing" maxOccurs="999" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DirectionInfo" maxOccurs="999" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *                           <attribute name="Direction">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <enumeration value="To"/>
 *                                 <enumeration value="From"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="RoutingConstructedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 <attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="RoutingRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "routing"
})
@XmlRootElement(name = "RoutingRules")
public class RoutingRules {

    @XmlElement(name = "Routing")
    protected List<RoutingRules.Routing> routing;

    /**
     * Gets the value of the routing property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routing property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingRules.Routing }
     * </p>
     * 
     * 
     * @return
     *     The value of the routing property.
     */
    public List<RoutingRules.Routing> getRouting() {
        if (routing == null) {
            routing = new ArrayList<>();
        }
        return this.routing;
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
     *         <element name="DirectionInfo" maxOccurs="999" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
     *                 <attribute name="Direction">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <enumeration value="To"/>
     *                       <enumeration value="From"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="RoutingConstructedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       <attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="RoutingRestriction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "directionInfo"
    })
    public static class Routing {

        @XmlElement(name = "DirectionInfo")
        protected List<RoutingRules.Routing.DirectionInfo> directionInfo;
        @XmlAttribute(name = "RoutingConstructedInd")
        protected Boolean routingConstructedInd;
        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "RoutingRestriction")
        protected String routingRestriction;

        /**
         * Gets the value of the directionInfo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the directionInfo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDirectionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoutingRules.Routing.DirectionInfo }
         * </p>
         * 
         * 
         * @return
         *     The value of the directionInfo property.
         */
        public List<RoutingRules.Routing.DirectionInfo> getDirectionInfo() {
            if (directionInfo == null) {
                directionInfo = new ArrayList<>();
            }
            return this.directionInfo;
        }

        /**
         * Gets the value of the routingConstructedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRoutingConstructedInd() {
            return routingConstructedInd;
        }

        /**
         * Sets the value of the routingConstructedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRoutingConstructedInd(Boolean value) {
            this.routingConstructedInd = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the routingRestriction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingRestriction() {
            return routingRestriction;
        }

        /**
         * Sets the value of the routingRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingRestriction(String value) {
            this.routingRestriction = value;
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
         *       <attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
         *       <attribute name="Direction">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <enumeration value="To"/>
         *             <enumeration value="From"/>
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
        public static class DirectionInfo {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "Direction")
            protected String direction;

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * Gets the value of the direction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirection() {
                return direction;
            }

            /**
             * Sets the value of the direction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirection(String value) {
                this.direction = value;
            }

        }

    }

}
