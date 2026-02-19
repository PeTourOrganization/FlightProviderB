
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
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}Dimension" maxOccurs="999" minOccurs="0"/>
 *         <element name="MaxWeight" type="{http://www.travelport.com/schema/air_v54_0}typeUnitOfMeasure" maxOccurs="999" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/air_v54_0}TextInfo" maxOccurs="999" minOccurs="0"/>
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
    "dimension",
    "maxWeight",
    "textInfo"
})
@XmlRootElement(name = "BaggageRestriction")
public class BaggageRestriction {

    /**
     * Information related to Length,Height,Width of a baggage.
     * 
     */
    @XmlElement(name = "Dimension")
    protected List<Dimension> dimension;
    @XmlElement(name = "MaxWeight")
    protected List<TypeUnitOfMeasure> maxWeight;
    /**
     * Information on baggage as published by carrier.
     * 
     */
    @XmlElement(name = "TextInfo")
    protected List<TextInfo> textInfo;

    /**
     * Information related to Length,Height,Width of a baggage.
     * 
     * Gets the value of the dimension property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimension }
     * </p>
     * 
     * 
     * @return
     *     The value of the dimension property.
     */
    public List<Dimension> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<>();
        }
        return this.dimension;
    }

    /**
     * Gets the value of the maxWeight property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxWeight property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMaxWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeUnitOfMeasure }
     * </p>
     * 
     * 
     * @return
     *     The value of the maxWeight property.
     */
    public List<TypeUnitOfMeasure> getMaxWeight() {
        if (maxWeight == null) {
            maxWeight = new ArrayList<>();
        }
        return this.maxWeight;
    }

    /**
     * Information on baggage as published by carrier.
     * 
     * Gets the value of the textInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTextInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the textInfo property.
     */
    public List<TextInfo> getTextInfo() {
        if (textInfo == null) {
            textInfo = new ArrayList<>();
        }
        return this.textInfo;
    }

}
