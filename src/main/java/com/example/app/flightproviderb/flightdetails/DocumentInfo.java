
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TicketInfo" maxOccurs="999" minOccurs="0"/>
 *         <element name="MCOInfo" type="{http://www.travelport.com/schema/common_v54_0}MCOInformation" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TCRInfo" maxOccurs="999" minOccurs="0"/>
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
    "ticketInfo",
    "mcoInfo",
    "tcrInfo"
})
@XmlRootElement(name = "DocumentInfo")
public class DocumentInfo {

    @XmlElement(name = "TicketInfo")
    protected List<TicketInfo> ticketInfo;
    @XmlElement(name = "MCOInfo")
    protected List<MCOInformation> mcoInfo;
    @XmlElement(name = "TCRInfo")
    protected List<TCRInfo> tcrInfo;

    /**
     * Gets the value of the ticketInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTicketInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ticketInfo property.
     */
    public List<TicketInfo> getTicketInfo() {
        if (ticketInfo == null) {
            ticketInfo = new ArrayList<>();
        }
        return this.ticketInfo;
    }

    /**
     * Gets the value of the mcoInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcoInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMCOInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCOInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the mcoInfo property.
     */
    public List<MCOInformation> getMCOInfo() {
        if (mcoInfo == null) {
            mcoInfo = new ArrayList<>();
        }
        return this.mcoInfo;
    }

    /**
     * Gets the value of the tcrInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTCRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the tcrInfo property.
     */
    public List<TCRInfo> getTCRInfo() {
        if (tcrInfo == null) {
            tcrInfo = new ArrayList<>();
        }
        return this.tcrInfo;
    }

}
