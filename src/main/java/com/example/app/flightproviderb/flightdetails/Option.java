
package com.example.app.flightproviderb.flightdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}BookingInfo" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Connection" maxOccurs="999" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *       <attribute name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingInfo",
    "connection"
})
@XmlRootElement(name = "Option")
public class Option {

    /**
     * Links segments and fares together
     * 
     */
    @XmlElement(name = "BookingInfo")
    protected List<BookingInfo> bookingInfo;
    /**
     * Flight Connection Information
     * 
     */
    @XmlElement(name = "Connection")
    protected List<Connection> connection;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    /**
     * Total traveling time that is difference between the departure time of the first segment and the arrival time of the last segments for that particular entire set of connection.
     * 
     */
    @XmlAttribute(name = "TravelTime")
    protected Duration travelTime;

    /**
     * Links segments and fares together
     * 
     * Gets the value of the bookingInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingInfo property.
     */
    public List<BookingInfo> getBookingInfo() {
        if (bookingInfo == null) {
            bookingInfo = new ArrayList<>();
        }
        return this.bookingInfo;
    }

    /**
     * Flight Connection Information
     * 
     * Gets the value of the connection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * </p>
     * 
     * 
     * @return
     *     The value of the connection property.
     */
    public List<Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Total traveling time that is difference between the departure time of the first segment and the arrival time of the last segments for that particular entire set of connection.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getTravelTime()
     */
    public void setTravelTime(Duration value) {
        this.travelTime = value;
    }

}
