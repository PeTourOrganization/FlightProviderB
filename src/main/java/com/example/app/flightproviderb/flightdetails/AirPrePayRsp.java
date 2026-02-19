
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
 *     <extension base="{http://www.travelport.com/schema/common_v54_0}BaseRsp">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PrePayProfileInfo" maxOccurs="999"/>
 *       </sequence>
 *       <attribute name="MaxResults" type="{http://www.travelport.com/schema/common_v54_0}typeMaxResults" />
 *       <attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MoreDataStartIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prePayProfileInfo"
})
@XmlRootElement(name = "AirPrePayRsp")
public class AirPrePayRsp
    extends BaseRsp
{

    /**
     * Provider: ACH.
     * 
     */
    @XmlElement(name = "PrePayProfileInfo", required = true)
    protected List<PrePayProfileInfo> prePayProfileInfo;
    /**
     * Provider: ACH-Max Number of Flight Passes being returned.
     * 
     */
    @XmlAttribute(name = "MaxResults")
    protected Integer maxResults;
    /**
     * Provider: ACH-Indicates if there are more flight passes to be offered
     * 
     */
    @XmlAttribute(name = "MoreIndicator")
    protected Boolean moreIndicator;
    /**
     * Provider: ACH-Indicates start index of the next flight Passes
     * 
     */
    @XmlAttribute(name = "MoreDataStartIndex")
    protected String moreDataStartIndex;

    /**
     * Provider: ACH.
     * 
     * Gets the value of the prePayProfileInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePayProfileInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrePayProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrePayProfileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the prePayProfileInfo property.
     */
    public List<PrePayProfileInfo> getPrePayProfileInfo() {
        if (prePayProfileInfo == null) {
            prePayProfileInfo = new ArrayList<>();
        }
        return this.prePayProfileInfo;
    }

    /**
     * Provider: ACH-Max Number of Flight Passes being returned.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaxResults()
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Provider: ACH-Indicates if there are more flight passes to be offered
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreIndicator() {
        return moreIndicator;
    }

    /**
     * Sets the value of the moreIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMoreIndicator()
     */
    public void setMoreIndicator(Boolean value) {
        this.moreIndicator = value;
    }

    /**
     * Provider: ACH-Indicates start index of the next flight Passes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataStartIndex() {
        return moreDataStartIndex;
    }

    /**
     * Sets the value of the moreDataStartIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMoreDataStartIndex()
     */
    public void setMoreDataStartIndex(String value) {
        this.moreDataStartIndex = value;
    }

}
