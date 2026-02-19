
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}ServiceSubGroup" maxOccurs="15" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceSubGroup"
})
@XmlRootElement(name = "ServiceGroup")
public class ServiceGroup {

    /**
     * The Service Sub Group of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlElement(name = "ServiceSubGroup")
    protected List<ServiceSubGroup> serviceSubGroup;
    /**
     * The Service Group Code of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     */
    @XmlAttribute(name = "Code", required = true)
    protected String code;

    /**
     * The Service Sub Group of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * Gets the value of the serviceSubGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSubGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceSubGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSubGroup }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceSubGroup property.
     */
    public List<ServiceSubGroup> getServiceSubGroup() {
        if (serviceSubGroup == null) {
            serviceSubGroup = new ArrayList<>();
        }
        return this.serviceSubGroup;
    }

    /**
     * The Service Group Code of the Ancillary Service.  Providers: 1G, 1V, 1P, ACH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

}
