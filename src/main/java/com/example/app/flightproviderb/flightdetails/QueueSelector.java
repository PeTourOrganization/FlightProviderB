
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
 *       <attGroup ref="{http://www.travelport.com/schema/common_v54_0}attrQueueInfo"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "QueueSelector", namespace = "http://www.travelport.com/schema/common_v54_0")
public class QueueSelector {

    /**
     * Queue Number . Possible values are 01, AA , A1 etc.
     * 
     */
    @XmlAttribute(name = "Queue")
    protected String queue;
    /**
     * If using for Sabre is mandatory and is Prefatory Instruction Code value of 0-999.
     * 
     */
    @XmlAttribute(name = "Category")
    protected String category;
    /**
     * Date range number where the PNR should be queued. Possible values are 1,2,1-4 etc.
     * 
     */
    @XmlAttribute(name = "DateRange")
    protected String dateRange;

    /**
     * Queue Number . Possible values are 01, AA , A1 etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQueue()
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * If using for Sabre is mandatory and is Prefatory Instruction Code value of 0-999.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategory()
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Date range number where the PNR should be queued. Possible values are 1,2,1-4 etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDateRange()
     */
    public void setDateRange(String value) {
        this.dateRange = value;
    }

}
