
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
 *     <extension base="{http://www.travelport.com/schema/air_v54_0}AirSearchReq">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SearchPassenger" maxOccurs="18" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="ReturnBrandIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="ChannelId">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="2"/>
 *             <maxLength value="4"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NSCC">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchPassenger",
    "pointOfSale"
})
@XmlRootElement(name = "AvailabilitySearchReq")
public class AvailabilitySearchReq
    extends AirSearchReq
{

    /**
     * Provider: 1G,1V,1P,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 						passenger
     * 
     */
    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SearchPassenger> searchPassenger;
    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<PointOfSale> pointOfSale;
    /**
     * When set to “true”, the Brand Indicator can be returned in the availability search response. Provider: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "ReturnBrandIndicator")
    protected Boolean returnBrandIndicator;
    /**
     * A Channel ID is 4 alpha-numeric characters used to activate the Search Control Console filter for a specific group of travelers being served by the agency credential.
     * 
     */
    @XmlAttribute(name = "ChannelId")
    protected String channelId;
    /**
     * Allows the agency to bypass/override the Search Control Console rule.
     * 
     */
    @XmlAttribute(name = "NSCC")
    protected String nscc;

    /**
     * Provider: 1G,1V,1P,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 						passenger
     * 
     * Gets the value of the searchPassenger property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchPassenger property.
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<>();
        }
        return this.searchPassenger;
    }

    /**
     * Provider: ACH.
     * 
     * Gets the value of the pointOfSale property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * </p>
     * 
     * 
     * @return
     *     The value of the pointOfSale property.
     */
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<>();
        }
        return this.pointOfSale;
    }

    /**
     * When set to “true”, the Brand Indicator can be returned in the availability search response. Provider: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnBrandIndicator() {
        if (returnBrandIndicator == null) {
            return false;
        } else {
            return returnBrandIndicator;
        }
    }

    /**
     * Sets the value of the returnBrandIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReturnBrandIndicator()
     */
    public void setReturnBrandIndicator(Boolean value) {
        this.returnBrandIndicator = value;
    }

    /**
     * A Channel ID is 4 alpha-numeric characters used to activate the Search Control Console filter for a specific group of travelers being served by the agency credential.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChannelId()
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Allows the agency to bypass/override the Search Control Console rule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSCC() {
        return nscc;
    }

    /**
     * Sets the value of the nscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNSCC()
     */
    public void setNSCC(String value) {
        this.nscc = value;
    }

}
