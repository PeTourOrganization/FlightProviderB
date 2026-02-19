
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
 *         <element name="LNameNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *         <element name="PsgrNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
 *         <element name="AbsNameNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="999" minOccurs="0"/>
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
    "lNameNum",
    "psgrNum",
    "absNameNum"
})
@XmlRootElement(name = "Psgr", namespace = "http://www.travelport.com/schema/common_v54_0")
public class Psgr {

    @XmlElement(name = "LNameNum", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> lNameNum;
    @XmlElement(name = "PsgrNum", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> psgrNum;
    @XmlElement(name = "AbsNameNum", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<String> absNameNum;

    /**
     * Gets the value of the lNameNum property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lNameNum property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLNameNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the lNameNum property.
     */
    public List<String> getLNameNum() {
        if (lNameNum == null) {
            lNameNum = new ArrayList<>();
        }
        return this.lNameNum;
    }

    /**
     * Gets the value of the psgrNum property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the psgrNum property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPsgrNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the psgrNum property.
     */
    public List<String> getPsgrNum() {
        if (psgrNum == null) {
            psgrNum = new ArrayList<>();
        }
        return this.psgrNum;
    }

    /**
     * Gets the value of the absNameNum property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absNameNum property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAbsNameNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the absNameNum property.
     */
    public List<String> getAbsNameNum() {
        if (absNameNum == null) {
            absNameNum = new ArrayList<>();
        }
        return this.absNameNum;
    }

}
