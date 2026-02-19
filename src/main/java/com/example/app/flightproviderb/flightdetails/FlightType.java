
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
 *       <attribute name="RequireSingleCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="MaxConnections" default="-1">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="-1"/>
 *             <maxInclusive value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="MaxStops" default="-1">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <minInclusive value="-1"/>
 *             <maxInclusive value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NonStopDirects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="StopDirects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SingleOnlineCon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DoubleOnlineCon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TripleOnlineCon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="SingleInterlineCon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DoubleInterlineCon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="TripleInterlineCon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FlightType")
public class FlightType {

    @XmlAttribute(name = "RequireSingleCarrier")
    protected Boolean requireSingleCarrier;
    /**
     * The maximum number of connections within a
     *                         segment group.
     * 
     */
    @XmlAttribute(name = "MaxConnections")
    protected Integer maxConnections;
    /**
     * The maximum number of stops within a
     *                         connection.
     * 
     */
    @XmlAttribute(name = "MaxStops")
    protected Integer maxStops;
    @XmlAttribute(name = "NonStopDirects")
    protected Boolean nonStopDirects;
    @XmlAttribute(name = "StopDirects")
    protected Boolean stopDirects;
    @XmlAttribute(name = "SingleOnlineCon")
    protected Boolean singleOnlineCon;
    @XmlAttribute(name = "DoubleOnlineCon")
    protected Boolean doubleOnlineCon;
    @XmlAttribute(name = "TripleOnlineCon")
    protected Boolean tripleOnlineCon;
    @XmlAttribute(name = "SingleInterlineCon")
    protected Boolean singleInterlineCon;
    @XmlAttribute(name = "DoubleInterlineCon")
    protected Boolean doubleInterlineCon;
    @XmlAttribute(name = "TripleInterlineCon")
    protected Boolean tripleInterlineCon;

    /**
     * Gets the value of the requireSingleCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRequireSingleCarrier() {
        if (requireSingleCarrier == null) {
            return false;
        } else {
            return requireSingleCarrier;
        }
    }

    /**
     * Sets the value of the requireSingleCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireSingleCarrier(Boolean value) {
        this.requireSingleCarrier = value;
    }

    /**
     * The maximum number of connections within a
     *                         segment group.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxConnections() {
        if (maxConnections == null) {
            return -1;
        } else {
            return maxConnections;
        }
    }

    /**
     * Sets the value of the maxConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxConnections()
     */
    public void setMaxConnections(Integer value) {
        this.maxConnections = value;
    }

    /**
     * The maximum number of stops within a
     *                         connection.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxStops() {
        if (maxStops == null) {
            return -1;
        } else {
            return maxStops;
        }
    }

    /**
     * Sets the value of the maxStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxStops()
     */
    public void setMaxStops(Integer value) {
        this.maxStops = value;
    }

    /**
     * Gets the value of the nonStopDirects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStopDirects() {
        return nonStopDirects;
    }

    /**
     * Sets the value of the nonStopDirects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStopDirects(Boolean value) {
        this.nonStopDirects = value;
    }

    /**
     * Gets the value of the stopDirects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopDirects() {
        return stopDirects;
    }

    /**
     * Sets the value of the stopDirects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopDirects(Boolean value) {
        this.stopDirects = value;
    }

    /**
     * Gets the value of the singleOnlineCon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleOnlineCon() {
        return singleOnlineCon;
    }

    /**
     * Sets the value of the singleOnlineCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleOnlineCon(Boolean value) {
        this.singleOnlineCon = value;
    }

    /**
     * Gets the value of the doubleOnlineCon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleOnlineCon() {
        return doubleOnlineCon;
    }

    /**
     * Sets the value of the doubleOnlineCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleOnlineCon(Boolean value) {
        this.doubleOnlineCon = value;
    }

    /**
     * Gets the value of the tripleOnlineCon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripleOnlineCon() {
        return tripleOnlineCon;
    }

    /**
     * Sets the value of the tripleOnlineCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripleOnlineCon(Boolean value) {
        this.tripleOnlineCon = value;
    }

    /**
     * Gets the value of the singleInterlineCon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleInterlineCon() {
        return singleInterlineCon;
    }

    /**
     * Sets the value of the singleInterlineCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleInterlineCon(Boolean value) {
        this.singleInterlineCon = value;
    }

    /**
     * Gets the value of the doubleInterlineCon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleInterlineCon() {
        return doubleInterlineCon;
    }

    /**
     * Sets the value of the doubleInterlineCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoubleInterlineCon(Boolean value) {
        this.doubleInterlineCon = value;
    }

    /**
     * Gets the value of the tripleInterlineCon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripleInterlineCon() {
        return tripleInterlineCon;
    }

    /**
     * Sets the value of the tripleInterlineCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripleInterlineCon(Boolean value) {
        this.tripleInterlineCon = value;
    }

}
