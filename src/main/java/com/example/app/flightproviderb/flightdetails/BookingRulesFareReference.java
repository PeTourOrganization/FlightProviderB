
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="ClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typeClassOfService" />
 *       <attribute name="TicketDesignatorCode" type="{http://www.travelport.com/schema/air_v54_0}typeTicketDesignator" />
 *       <attribute name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="UpgrageAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="UpgradeClassOfService" type="{http://www.travelport.com/schema/common_v54_0}typeClassOfService" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "BookingRulesFareReference")
public class BookingRulesFareReference {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;
    @XmlAttribute(name = "TicketDesignatorCode")
    protected String ticketDesignatorCode;
    @XmlAttribute(name = "AccountCode")
    protected String accountCode;
    @XmlAttribute(name = "UpgrageAllowed")
    protected Boolean upgrageAllowed;
    @XmlAttribute(name = "UpgradeClassOfService")
    protected String upgradeClassOfService;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the ticketDesignatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    /**
     * Sets the value of the ticketDesignatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignatorCode(String value) {
        this.ticketDesignatorCode = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the upgrageAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgrageAllowed() {
        return upgrageAllowed;
    }

    /**
     * Sets the value of the upgrageAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgrageAllowed(Boolean value) {
        this.upgrageAllowed = value;
    }

    /**
     * Gets the value of the upgradeClassOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeClassOfService() {
        return upgradeClassOfService;
    }

    /**
     * Sets the value of the upgradeClassOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeClassOfService(String value) {
        this.upgradeClassOfService = value;
    }

}
