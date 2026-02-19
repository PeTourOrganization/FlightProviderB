
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
 *         <element name="Err" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KlrInErr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element ref="{http://www.travelport.com/schema/common_v54_0}InsertedText" maxOccurs="999" minOccurs="0"/>
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
    "err",
    "klrInErr",
    "text",
    "insertedText"
})
@XmlRootElement(name = "ErrText", namespace = "http://www.travelport.com/schema/common_v54_0")
public class ErrText {

    @XmlElement(name = "Err", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String err;
    @XmlElement(name = "KlrInErr", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String klrInErr;
    @XmlElement(name = "Text", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected String text;
    /**
     * Inserted text information in Error
     * 
     */
    @XmlElement(name = "InsertedText", namespace = "http://www.travelport.com/schema/common_v54_0")
    protected List<InsertedText> insertedText;

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr(String value) {
        this.err = value;
    }

    /**
     * Gets the value of the klrInErr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlrInErr() {
        return klrInErr;
    }

    /**
     * Sets the value of the klrInErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlrInErr(String value) {
        this.klrInErr = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Inserted text information in Error
     * 
     * Gets the value of the insertedText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertedText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInsertedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertedText }
     * </p>
     * 
     * 
     * @return
     *     The value of the insertedText property.
     */
    public List<InsertedText> getInsertedText() {
        if (insertedText == null) {
            insertedText = new ArrayList<>();
        }
        return this.insertedText;
    }

}
