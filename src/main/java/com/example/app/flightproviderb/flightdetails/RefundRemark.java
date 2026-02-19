
package com.example.app.flightproviderb.flightdetails;

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
 *         <element name="RemarkData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "remarkData"
})
@XmlRootElement(name = "RefundRemark", namespace = "http://www.travelport.com/schema/common_v54_0")
public class RefundRemark {

    /**
     * Actual remark data.
     * 
     */
    @XmlElement(name = "RemarkData", namespace = "http://www.travelport.com/schema/common_v54_0", required = true)
    protected String remarkData;

    /**
     * Actual remark data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkData() {
        return remarkData;
    }

    /**
     * Sets the value of the remarkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRemarkData()
     */
    public void setRemarkData(String value) {
        this.remarkData = value;
    }

}
