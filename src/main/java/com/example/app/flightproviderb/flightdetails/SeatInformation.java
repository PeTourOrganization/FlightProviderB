
package com.example.app.flightproviderb.flightdetails;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Power" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Video" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Rating">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *                 <attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v54_0}typeRef" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "power",
    "video",
    "type",
    "description",
    "rating"
})
@XmlRootElement(name = "SeatInformation")
public class SeatInformation {

    /**
     * Detail about any electrical power the seat might have. For example: No Power Providers: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Power", required = true)
    protected String power;
    /**
     * Detail about any video components the seat might have. For example: No Video Providers: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Video", required = true)
    protected String video;
    /**
     * Detail about the type of seat. For example: Exit Row, Standard, etc. Providers: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Detailed description of the seat. Providers: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Description", required = true)
    protected String description;
    /**
     * Definition of the seat rating. Providers: 1G, 1V, 1P
     * 
     */
    @XmlElement(name = "Rating", required = true)
    protected SeatInformation.Rating rating;
    @XmlAttribute(name = "Key", required = true)
    protected String key;

    /**
     * Detail about any electrical power the seat might have. For example: No Power Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPower()
     */
    public void setPower(String value) {
        this.power = value;
    }

    /**
     * Detail about any video components the seat might have. For example: No Video Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVideo()
     */
    public void setVideo(String value) {
        this.video = value;
    }

    /**
     * Detail about the type of seat. For example: Exit Row, Standard, etc. Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Detailed description of the seat. Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Definition of the seat rating. Providers: 1G, 1V, 1P
     * 
     * @return
     *     possible object is
     *     {@link SeatInformation.Rating }
     *     
     */
    public SeatInformation.Rating getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatInformation.Rating }
     *     
     * @see #getRating()
     */
    public void setRating(SeatInformation.Rating value) {
        this.rating = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
     *       <attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class Rating {

        @XmlValue
        protected String value;
        /**
         * Numerical rating of the seat from 1 to 5 with 1 being bad and 5 being good. Providers: 1G, 1V, 1P
         * 
         */
        @XmlAttribute(name = "Number", required = true)
        protected BigInteger number;

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
         * Numerical rating of the seat from 1 to 5 with 1 being bad and 5 being good. Providers: 1G, 1V, 1P
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getNumber()
         */
        public void setNumber(BigInteger value) {
            this.number = value;
        }

    }

}
