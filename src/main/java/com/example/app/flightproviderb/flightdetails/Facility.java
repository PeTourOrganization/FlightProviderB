
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Characteristic" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}Remark" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}PassengerSeatPrice" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TaxInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}EMD" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}ServiceData" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TourCode" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v54_0}typeFacility" />
 *       <attribute name="SeatCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Availability" type="{http://www.travelport.com/schema/air_v54_0}typeSeatAvailability" />
 *       <attribute name="SeatPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Paid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="ServiceSubCode">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <maxLength value="3"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SSRCode" type="{http://www.travelport.com/schema/common_v54_0}typeSSRCode" />
 *       <attribute name="IssuanceReason">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="BaseSeatPrice" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Taxes" type="{http://www.travelport.com/schema/common_v54_0}typeMoney" />
 *       <attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="InclusiveOfTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="InterlineSettlementAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="GeographySpecification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="OptionalServiceRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="SeatInformationRef" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "characteristic",
    "remark",
    "passengerSeatPrice",
    "taxInfo",
    "emd",
    "serviceData",
    "tourCode"
})
@XmlRootElement(name = "Facility")
public class Facility {

    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<Remark> remark;
    /**
     * Only used when a passenger has a different
     *                 price than the default.
     * 
     */
    @XmlElement(name = "PassengerSeatPrice")
    protected List<PassengerSeatPrice> passengerSeatPrice;
    /**
     * Tax information related to seat price. This is presently populated for MCH and ACH content. Applicable providers are MCH/ACH
     * 
     */
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "EMD")
    protected EMD emd;
    @XmlElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<ServiceData> serviceData;
    /**
     * Tour Code Fare Basis
     * 
     */
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    /**
     * The type of facility
     * 
     */
    @XmlAttribute(name = "Type", required = true)
    protected TypeFacility type;
    /**
     * If a seat type, the seat identifier
     * 
     */
    @XmlAttribute(name = "SeatCode")
    protected String seatCode;
    /**
     * If a seat type, the availability of the seat
     * 
     */
    @XmlAttribute(name = "Availability")
    protected TypeSeatAvailability availability;
    /**
     * The price of the seat, if applicable.
     * 
     */
    @XmlAttribute(name = "SeatPrice")
    protected String seatPrice;
    /**
     * Set to True if either SeatPrice or GroupSeatPrice are returned.
     * 
     */
    @XmlAttribute(name = "Paid")
    protected Boolean paid;
    /**
     * The service subcode associated with the
     *                         Facility
     * 
     */
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    /**
     * The SSR Code associated with the
     *                         Facility
     * 
     */
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    /**
     * A one-letter RFIC value filed by the airline in each Optional Service will be mapped to this attribute. 
     *                        RFIC is IATA Reason for Issuance Code. Possible codes are A (Air transportation),B (Surface Transportation),C(Bagage),
     *                        D(Financial Impact),E(Airport Services),F(Merchandise),G(Inflight Services),I (Individual Airline use).
     * 
     */
    @XmlAttribute(name = "IssuanceReason")
    protected String issuanceReason;
    /**
     * Price of the seats excluding Taxes.
     * 
     */
    @XmlAttribute(name = "BaseSeatPrice")
    protected String baseSeatPrice;
    /**
     * Tax amount for the seat price.
     * 
     */
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    /**
     * The number of units availed for each optional
     *                         service (e.g. 2 baggage availed will be specified as 2 in quantity
     *                         for optional service BAGGAGE)
     * 
     */
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    /**
     * The sequence number associated with the
     *                         OptionalService
     * 
     */
    @XmlAttribute(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    /**
     * Identifies if the service was filed with a fee that is inclusive of tax.
     * 
     */
    @XmlAttribute(name = "InclusiveOfTax")
    protected Boolean inclusiveOfTax;
    /**
     * Identifies if the interline settlement is allowed in service .
     * 
     */
    @XmlAttribute(name = "InterlineSettlementAllowed")
    protected Boolean interlineSettlementAllowed;
    /**
     * Sector, Portion, Journey.
     * 
     */
    @XmlAttribute(name = "GeographySpecification")
    protected String geographySpecification;
    /**
     * The Source of the optional service. The source can be ACH, MCE, or MCH.
     * 
     */
    @XmlAttribute(name = "Source")
    protected String source;
    /**
     * References the OptionalService for the Row/Facility. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "OptionalServiceRef")
    protected String optionalServiceRef;
    /**
     * Specifies the seat information for the seat. Providers: ACH, 1G, 1V, 1P
     * 
     */
    @XmlAttribute(name = "SeatInformationRef")
    protected String seatInformationRef;

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * </p>
     * 
     * 
     * @return
     *     The value of the characteristic property.
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<>();
        }
        return this.characteristic;
    }

    /**
     * A textual remark container to hold any printable text. (max 512 chars)
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

    /**
     * Only used when a passenger has a different
     *                 price than the default.
     * 
     * Gets the value of the passengerSeatPrice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerSeatPrice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPassengerSeatPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerSeatPrice }
     * </p>
     * 
     * 
     * @return
     *     The value of the passengerSeatPrice property.
     */
    public List<PassengerSeatPrice> getPassengerSeatPrice() {
        if (passengerSeatPrice == null) {
            passengerSeatPrice = new ArrayList<>();
        }
        return this.passengerSeatPrice;
    }

    /**
     * Tax information related to seat price. This is presently populated for MCH and ACH content. Applicable providers are MCH/ACH
     * 
     * Gets the value of the taxInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxInfo property.
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the emd property.
     * 
     * @return
     *     possible object is
     *     {@link EMD }
     *     
     */
    public EMD getEMD() {
        return emd;
    }

    /**
     * Sets the value of the emd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMD }
     *     
     */
    public void setEMD(EMD value) {
        this.emd = value;
    }

    /**
     * Gets the value of the serviceData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceData }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceData property.
     */
    public List<ServiceData> getServiceData() {
        if (serviceData == null) {
            serviceData = new ArrayList<>();
        }
        return this.serviceData;
    }

    /**
     * Tour Code Fare Basis
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     * @see #getTourCode()
     */
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * The type of facility
     * 
     * @return
     *     possible object is
     *     {@link TypeFacility }
     *     
     */
    public TypeFacility getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFacility }
     *     
     * @see #getType()
     */
    public void setType(TypeFacility value) {
        this.type = value;
    }

    /**
     * If a seat type, the seat identifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatCode() {
        return seatCode;
    }

    /**
     * Sets the value of the seatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatCode()
     */
    public void setSeatCode(String value) {
        this.seatCode = value;
    }

    /**
     * If a seat type, the availability of the seat
     * 
     * @return
     *     possible object is
     *     {@link TypeSeatAvailability }
     *     
     */
    public TypeSeatAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSeatAvailability }
     *     
     * @see #getAvailability()
     */
    public void setAvailability(TypeSeatAvailability value) {
        this.availability = value;
    }

    /**
     * The price of the seat, if applicable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPrice() {
        return seatPrice;
    }

    /**
     * Sets the value of the seatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatPrice()
     */
    public void setSeatPrice(String value) {
        this.seatPrice = value;
    }

    /**
     * Set to True if either SeatPrice or GroupSeatPrice are returned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPaid()
     */
    public void setPaid(Boolean value) {
        this.paid = value;
    }

    /**
     * The service subcode associated with the
     *                         Facility
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceSubCode()
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * The SSR Code associated with the
     *                         Facility
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSSRCode()
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * A one-letter RFIC value filed by the airline in each Optional Service will be mapped to this attribute. 
     *                        RFIC is IATA Reason for Issuance Code. Possible codes are A (Air transportation),B (Surface Transportation),C(Bagage),
     *                        D(Financial Impact),E(Airport Services),F(Merchandise),G(Inflight Services),I (Individual Airline use).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceReason() {
        return issuanceReason;
    }

    /**
     * Sets the value of the issuanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssuanceReason()
     */
    public void setIssuanceReason(String value) {
        this.issuanceReason = value;
    }

    /**
     * Price of the seats excluding Taxes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSeatPrice() {
        return baseSeatPrice;
    }

    /**
     * Sets the value of the baseSeatPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaseSeatPrice()
     */
    public void setBaseSeatPrice(String value) {
        this.baseSeatPrice = value;
    }

    /**
     * Tax amount for the seat price.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxes()
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * The number of units availed for each optional
     *                         service (e.g. 2 baggage availed will be specified as 2 in quantity
     *                         for optional service BAGGAGE)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getQuantity()
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * The sequence number associated with the
     *                         OptionalService
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSequenceNumber()
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Identifies if the service was filed with a fee that is inclusive of tax.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveOfTax() {
        return inclusiveOfTax;
    }

    /**
     * Sets the value of the inclusiveOfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInclusiveOfTax()
     */
    public void setInclusiveOfTax(Boolean value) {
        this.inclusiveOfTax = value;
    }

    /**
     * Identifies if the interline settlement is allowed in service .
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterlineSettlementAllowed() {
        return interlineSettlementAllowed;
    }

    /**
     * Sets the value of the interlineSettlementAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInterlineSettlementAllowed()
     */
    public void setInterlineSettlementAllowed(Boolean value) {
        this.interlineSettlementAllowed = value;
    }

    /**
     * Sector, Portion, Journey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographySpecification() {
        return geographySpecification;
    }

    /**
     * Sets the value of the geographySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGeographySpecification()
     */
    public void setGeographySpecification(String value) {
        this.geographySpecification = value;
    }

    /**
     * The Source of the optional service. The source can be ACH, MCE, or MCH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSource()
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * References the OptionalService for the Row/Facility. Providers: ACH, 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServiceRef() {
        return optionalServiceRef;
    }

    /**
     * Sets the value of the optionalServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOptionalServiceRef()
     */
    public void setOptionalServiceRef(String value) {
        this.optionalServiceRef = value;
    }

    /**
     * Specifies the seat information for the seat. Providers: ACH, 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatInformationRef() {
        return seatInformationRef;
    }

    /**
     * Sets the value of the seatInformationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatInformationRef()
     */
    public void setSeatInformationRef(String value) {
        this.seatInformationRef = value;
    }

}
