
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}SSR" maxOccurs="999" minOccurs="0"/>
 *         <element name="SSRRules" type="{http://www.travelport.com/schema/common_v54_0}ServiceRuleType" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}IndustryStandardSSR" maxOccurs="999" minOccurs="0"/>
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
    "ssr",
    "ssrRules",
    "industryStandardSSR"
})
@XmlRootElement(name = "AvailableSSR")
public class AvailableSSR {

    /**
     * Special serivces like wheel chair, or pet carrier.
     * 
     */
    @XmlElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<SSR> ssr;
    /**
     * Holds the rules for selecting the SSR in
     *                             the itinerary
     * 
     */
    @XmlElement(name = "SSRRules")
    protected List<ServiceRuleType> ssrRules;
    /**
     * Indicates Carrier Supports this industry standard.
     * 
     */
    @XmlElement(name = "IndustryStandardSSR", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<IndustryStandardSSR> industryStandardSSR;

    /**
     * Special serivces like wheel chair, or pet carrier.
     * 
     * Gets the value of the ssr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssr property.
     */
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<>();
        }
        return this.ssr;
    }

    /**
     * Holds the rules for selecting the SSR in
     *                             the itinerary
     * 
     * Gets the value of the ssrRules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrRules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSSRRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRuleType }
     * </p>
     * 
     * 
     * @return
     *     The value of the ssrRules property.
     */
    public List<ServiceRuleType> getSSRRules() {
        if (ssrRules == null) {
            ssrRules = new ArrayList<>();
        }
        return this.ssrRules;
    }

    /**
     * Indicates Carrier Supports this industry standard.
     * 
     * Gets the value of the industryStandardSSR property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryStandardSSR property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndustryStandardSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryStandardSSR }
     * </p>
     * 
     * 
     * @return
     *     The value of the industryStandardSSR property.
     */
    public List<IndustryStandardSSR> getIndustryStandardSSR() {
        if (industryStandardSSR == null) {
            industryStandardSSR = new ArrayList<>();
        }
        return this.industryStandardSSR;
    }

}
