
package com.example.app.flightproviderb.flightdetails;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}AccountCode" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}PointOfSale" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeIATACode" />
 *       <attribute name="Carrier" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeCarrier" />
 *       <attribute name="FareBasis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeProviderCode" />
 *       <attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="TicketingDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountCode",
    "pointOfSale"
})
@XmlRootElement(name = "FareRuleLookup")
public class FareRuleLookup {

    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected AccountCode accountCode;
    /**
     * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
     * 
     */
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected PointOfSale pointOfSale;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "Carrier", required = true)
    protected String carrier;
    @XmlAttribute(name = "FareBasis", required = true)
    protected String fareBasis;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlAttribute(name = "TicketingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketingDate;

    /**
     * it will be considered a default AccounCode to be sent to all the Providers or Suppliers.
     * 
     * @return
     *     possible object is
     *     {@link AccountCode }
     *     
     */
    public AccountCode getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCode }
     *     
     * @see #getAccountCode()
     */
    public void setAccountCode(AccountCode value) {
        this.accountCode = value;
    }

    /**
     * User can use this node to send a specific PCC to access fares allowed only for that PCC. This node gives the capability for fare redistribution at UR level.  For fare redistribution at the stored fare level see AirPricingSolution/AirPricingInfo/AirPricingModifiers/PointOfSale.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     * @see #getPointOfSale()
     */
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the ticketingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketingDate() {
        return ticketingDate;
    }

    /**
     * Sets the value of the ticketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketingDate(XMLGregorianCalendar value) {
        this.ticketingDate = value;
    }

}
