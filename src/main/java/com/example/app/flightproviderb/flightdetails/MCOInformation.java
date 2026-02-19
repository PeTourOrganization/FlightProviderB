
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCOInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MCOInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PassengerInfo" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="MCONumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="MCOType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCOInformation", namespace = "http://www.travelport.com/schema/common_v54_0", propOrder = {
    "passengerInfo"
})
@XmlSeeAlso({
    MCO.class
})
public class MCOInformation {

    /**
     * Booking Traveler information tied to invoice
     * 
     */
    @XmlElement(name = "PassengerInfo")
    protected List<PassengerInfo> passengerInfo;
    /**
     * The unique MCO number
     * 
     */
    @XmlAttribute(name = "MCONumber")
    protected String mcoNumber;
    /**
     * Current status of the MCO
     * 
     */
    @XmlAttribute(name = "Status")
    protected String status;
    /**
     * The Type of MCO. Once of Agency Fee, Airline Service Fee, or Residual value from an Exchange.
     * 
     */
    @XmlAttribute(name = "MCOType")
    protected String mcoType;

    /**
     * Booking Traveler information tied to invoice
     * 
     * Gets the value of the passengerInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerInfo property.
     */
    public List<PassengerInfo> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<>();
        }
        return this.passengerInfo;
    }

    /**
     * The unique MCO number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCONumber() {
        return mcoNumber;
    }

    /**
     * Sets the value of the mcoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCONumber()
     */
    public void setMCONumber(String value) {
        this.mcoNumber = value;
    }

    /**
     * Current status of the MCO
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * The Type of MCO. Once of Agency Fee, Airline Service Fee, or Residual value from an Exchange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCOType() {
        return mcoType;
    }

    /**
     * Sets the value of the mcoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMCOType()
     */
    public void setMCOType(String value) {
        this.mcoType = value;
    }

}
