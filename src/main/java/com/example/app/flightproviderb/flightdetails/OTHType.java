
package com.example.app.flightproviderb.flightdetails;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTHType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OTHType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Cat0" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat1" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat2" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat3" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat4" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat5" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat6" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat7" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat8" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat9" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat10" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat11" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat12" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat13" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat14" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat15" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat16" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat17" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat18" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat19" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat20" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat21" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat22" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat23" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat24" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat25" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat26" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat27" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat28" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat29" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat30" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Cat31" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RestrictiveDt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="SurchargeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       <attribute name="NotUSACity" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="MissingRules" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTHType")
public class OTHType {

    /**
     * Category 0 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat0")
    protected Boolean cat0;
    /**
     * Category 1 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat1")
    protected Boolean cat1;
    /**
     * Category 2 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat2")
    protected Boolean cat2;
    /**
     * Category 3 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat3")
    protected Boolean cat3;
    /**
     * Category 4 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat4")
    protected Boolean cat4;
    /**
     * Category 5 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat5")
    protected Boolean cat5;
    /**
     * Category 6 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat6")
    protected Boolean cat6;
    /**
     * Category 7 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat7")
    protected Boolean cat7;
    /**
     * Category 8 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat8")
    protected Boolean cat8;
    /**
     * Category 9 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat9")
    protected Boolean cat9;
    /**
     * Category 10 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat10")
    protected Boolean cat10;
    /**
     * Category 11 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat11")
    protected Boolean cat11;
    /**
     * Category 12 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat12")
    protected Boolean cat12;
    /**
     * Category 13 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat13")
    protected Boolean cat13;
    /**
     * Category 14 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat14")
    protected Boolean cat14;
    /**
     * Category 15 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat15")
    protected Boolean cat15;
    /**
     * Category 16 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat16")
    protected Boolean cat16;
    /**
     * Category 17 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat17")
    protected Boolean cat17;
    /**
     * Category 18 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat18")
    protected Boolean cat18;
    /**
     * Category 19 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat19")
    protected Boolean cat19;
    /**
     * Category 20 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat20")
    protected Boolean cat20;
    /**
     * Category 21 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat21")
    protected Boolean cat21;
    /**
     * Category 22 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat22")
    protected Boolean cat22;
    /**
     * Category 23 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat23")
    protected Boolean cat23;
    /**
     * Category 24 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat24")
    protected Boolean cat24;
    /**
     * Category 25 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat25")
    protected Boolean cat25;
    /**
     * Category 26 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat26")
    protected Boolean cat26;
    /**
     * Category 27 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat27")
    protected Boolean cat27;
    /**
     * Category 28 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat28")
    protected Boolean cat28;
    /**
     * Category 29 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat29")
    protected Boolean cat29;
    /**
     * Category 30 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat30")
    protected Boolean cat30;
    /**
     * Category 31 rules. True if category applies.  False if rules do not apply.
     * 
     */
    @XmlAttribute(name = "Cat31")
    protected Boolean cat31;
    /**
     * Most restrictive ticketing date.
     * 
     */
    @XmlAttribute(name = "RestrictiveDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar restrictiveDt;
    /**
     * Surcharge amount
     * 
     */
    @XmlAttribute(name = "SurchargeAmt")
    protected BigDecimal surchargeAmt;
    /**
     * Not USA city.  True if Origin or final destination not a continental U.S. City. False if Origin or final destination a continental U.S. City.
     * 
     */
    @XmlAttribute(name = "NotUSACity")
    protected Boolean notUSACity;
    /**
     * Missing rules.  True if rules are missing.  False if rules are not missing.
     * 
     */
    @XmlAttribute(name = "MissingRules")
    protected Boolean missingRules;

    /**
     * Category 0 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat0() {
        return cat0;
    }

    /**
     * Sets the value of the cat0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat0()
     */
    public void setCat0(Boolean value) {
        this.cat0 = value;
    }

    /**
     * Category 1 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat1() {
        return cat1;
    }

    /**
     * Sets the value of the cat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat1()
     */
    public void setCat1(Boolean value) {
        this.cat1 = value;
    }

    /**
     * Category 2 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat2() {
        return cat2;
    }

    /**
     * Sets the value of the cat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat2()
     */
    public void setCat2(Boolean value) {
        this.cat2 = value;
    }

    /**
     * Category 3 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat3() {
        return cat3;
    }

    /**
     * Sets the value of the cat3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat3()
     */
    public void setCat3(Boolean value) {
        this.cat3 = value;
    }

    /**
     * Category 4 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat4() {
        return cat4;
    }

    /**
     * Sets the value of the cat4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat4()
     */
    public void setCat4(Boolean value) {
        this.cat4 = value;
    }

    /**
     * Category 5 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat5() {
        return cat5;
    }

    /**
     * Sets the value of the cat5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat5()
     */
    public void setCat5(Boolean value) {
        this.cat5 = value;
    }

    /**
     * Category 6 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat6() {
        return cat6;
    }

    /**
     * Sets the value of the cat6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat6()
     */
    public void setCat6(Boolean value) {
        this.cat6 = value;
    }

    /**
     * Category 7 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat7() {
        return cat7;
    }

    /**
     * Sets the value of the cat7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat7()
     */
    public void setCat7(Boolean value) {
        this.cat7 = value;
    }

    /**
     * Category 8 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat8() {
        return cat8;
    }

    /**
     * Sets the value of the cat8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat8()
     */
    public void setCat8(Boolean value) {
        this.cat8 = value;
    }

    /**
     * Category 9 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat9() {
        return cat9;
    }

    /**
     * Sets the value of the cat9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat9()
     */
    public void setCat9(Boolean value) {
        this.cat9 = value;
    }

    /**
     * Category 10 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat10() {
        return cat10;
    }

    /**
     * Sets the value of the cat10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat10()
     */
    public void setCat10(Boolean value) {
        this.cat10 = value;
    }

    /**
     * Category 11 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat11() {
        return cat11;
    }

    /**
     * Sets the value of the cat11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat11()
     */
    public void setCat11(Boolean value) {
        this.cat11 = value;
    }

    /**
     * Category 12 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat12() {
        return cat12;
    }

    /**
     * Sets the value of the cat12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat12()
     */
    public void setCat12(Boolean value) {
        this.cat12 = value;
    }

    /**
     * Category 13 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat13() {
        return cat13;
    }

    /**
     * Sets the value of the cat13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat13()
     */
    public void setCat13(Boolean value) {
        this.cat13 = value;
    }

    /**
     * Category 14 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat14() {
        return cat14;
    }

    /**
     * Sets the value of the cat14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat14()
     */
    public void setCat14(Boolean value) {
        this.cat14 = value;
    }

    /**
     * Category 15 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat15() {
        return cat15;
    }

    /**
     * Sets the value of the cat15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat15()
     */
    public void setCat15(Boolean value) {
        this.cat15 = value;
    }

    /**
     * Category 16 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat16() {
        return cat16;
    }

    /**
     * Sets the value of the cat16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat16()
     */
    public void setCat16(Boolean value) {
        this.cat16 = value;
    }

    /**
     * Category 17 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat17() {
        return cat17;
    }

    /**
     * Sets the value of the cat17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat17()
     */
    public void setCat17(Boolean value) {
        this.cat17 = value;
    }

    /**
     * Category 18 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat18() {
        return cat18;
    }

    /**
     * Sets the value of the cat18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat18()
     */
    public void setCat18(Boolean value) {
        this.cat18 = value;
    }

    /**
     * Category 19 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat19() {
        return cat19;
    }

    /**
     * Sets the value of the cat19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat19()
     */
    public void setCat19(Boolean value) {
        this.cat19 = value;
    }

    /**
     * Category 20 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat20() {
        return cat20;
    }

    /**
     * Sets the value of the cat20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat20()
     */
    public void setCat20(Boolean value) {
        this.cat20 = value;
    }

    /**
     * Category 21 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat21() {
        return cat21;
    }

    /**
     * Sets the value of the cat21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat21()
     */
    public void setCat21(Boolean value) {
        this.cat21 = value;
    }

    /**
     * Category 22 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat22() {
        return cat22;
    }

    /**
     * Sets the value of the cat22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat22()
     */
    public void setCat22(Boolean value) {
        this.cat22 = value;
    }

    /**
     * Category 23 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat23() {
        return cat23;
    }

    /**
     * Sets the value of the cat23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat23()
     */
    public void setCat23(Boolean value) {
        this.cat23 = value;
    }

    /**
     * Category 24 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat24() {
        return cat24;
    }

    /**
     * Sets the value of the cat24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat24()
     */
    public void setCat24(Boolean value) {
        this.cat24 = value;
    }

    /**
     * Category 25 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat25() {
        return cat25;
    }

    /**
     * Sets the value of the cat25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat25()
     */
    public void setCat25(Boolean value) {
        this.cat25 = value;
    }

    /**
     * Category 26 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat26() {
        return cat26;
    }

    /**
     * Sets the value of the cat26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat26()
     */
    public void setCat26(Boolean value) {
        this.cat26 = value;
    }

    /**
     * Category 27 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat27() {
        return cat27;
    }

    /**
     * Sets the value of the cat27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat27()
     */
    public void setCat27(Boolean value) {
        this.cat27 = value;
    }

    /**
     * Category 28 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat28() {
        return cat28;
    }

    /**
     * Sets the value of the cat28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat28()
     */
    public void setCat28(Boolean value) {
        this.cat28 = value;
    }

    /**
     * Category 29 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat29() {
        return cat29;
    }

    /**
     * Sets the value of the cat29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat29()
     */
    public void setCat29(Boolean value) {
        this.cat29 = value;
    }

    /**
     * Category 30 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat30() {
        return cat30;
    }

    /**
     * Sets the value of the cat30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat30()
     */
    public void setCat30(Boolean value) {
        this.cat30 = value;
    }

    /**
     * Category 31 rules. True if category applies.  False if rules do not apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCat31() {
        return cat31;
    }

    /**
     * Sets the value of the cat31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCat31()
     */
    public void setCat31(Boolean value) {
        this.cat31 = value;
    }

    /**
     * Most restrictive ticketing date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRestrictiveDt() {
        return restrictiveDt;
    }

    /**
     * Sets the value of the restrictiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getRestrictiveDt()
     */
    public void setRestrictiveDt(XMLGregorianCalendar value) {
        this.restrictiveDt = value;
    }

    /**
     * Surcharge amount
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeAmt() {
        return surchargeAmt;
    }

    /**
     * Sets the value of the surchargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSurchargeAmt()
     */
    public void setSurchargeAmt(BigDecimal value) {
        this.surchargeAmt = value;
    }

    /**
     * Not USA city.  True if Origin or final destination not a continental U.S. City. False if Origin or final destination a continental U.S. City.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotUSACity() {
        return notUSACity;
    }

    /**
     * Sets the value of the notUSACity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNotUSACity()
     */
    public void setNotUSACity(Boolean value) {
        this.notUSACity = value;
    }

    /**
     * Missing rules.  True if rules are missing.  False if rules are not missing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissingRules() {
        return missingRules;
    }

    /**
     * Sets the value of the missingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMissingRules()
     */
    public void setMissingRules(Boolean value) {
        this.missingRules = value;
    }

}
