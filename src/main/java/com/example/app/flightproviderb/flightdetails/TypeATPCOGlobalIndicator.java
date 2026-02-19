
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration of ATPCO global indicators
 * 
 * <p>Java class for typeATPCOGlobalIndicator</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeATPCOGlobalIndicator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AL"/>
 *     <enumeration value="AP"/>
 *     <enumeration value="AT"/>
 *     <enumeration value="CA"/>
 *     <enumeration value="CT"/>
 *     <enumeration value="EH"/>
 *     <enumeration value="FE"/>
 *     <enumeration value="IN"/>
 *     <enumeration value="NA"/>
 *     <enumeration value="PA"/>
 *     <enumeration value="PN"/>
 *     <enumeration value="PO"/>
 *     <enumeration value="RU"/>
 *     <enumeration value="RW"/>
 *     <enumeration value="SA"/>
 *     <enumeration value="SP"/>
 *     <enumeration value="TB"/>
 *     <enumeration value="TS"/>
 *     <enumeration value="US"/>
 *     <enumeration value="WH"/>
 *     <enumeration value="ZZ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeATPCOGlobalIndicator")
@XmlEnum
public enum TypeATPCOGlobalIndicator {


    /**
     * FareByRule -- All fares incl. EH/TS
     * 
     */
    AL,

    /**
     * Via Atlantic Pacific
     * 
     */
    AP,

    /**
     * Via Atlantic
     * 
     */
    AT,

    /**
     * Within Canada.
     * 
     */
    CA,

    /**
     * Circle trip.
     * 
     */
    CT,

    /**
     * Within Eastern Hemisphere
     * 
     */
    EH,

    /**
     * Far East
     * 
     */
    FE,

    /**
     * FareByRule - For int'l incl.
     *                         AT/PA/WH/CT/RW
     * 
     */
    IN,

    /**
     * FareByRule for North America incl
     *                         US/CA/TB/PV
     * 
     */
    NA,

    /**
     * Via Pacific
     * 
     */
    PA,

    /**
     * Via Pacific and via North America
     * 
     */
    PN,

    /**
     * Via Polar Route.
     * 
     */
    PO,

    /**
     * Russia - Area 3
     * 
     */
    RU,

    /**
     * Round The World.
     * 
     */
    RW,

    /**
     * South Atlantic only
     * 
     */
    SA,

    /**
     * Via South Polar Route
     * 
     */
    SP,

    /**
     * Trans-border
     * 
     */
    TB,

    /**
     * Via Siberia.
     * 
     */
    TS,

    /**
     * Within the United States.
     * 
     */
    US,

    /**
     * Within Western Hemisphere
     * 
     */
    WH,

    /**
     * Any Global
     * 
     */
    ZZ;

    public String value() {
        return name();
    }

    public static TypeATPCOGlobalIndicator fromValue(String v) {
        return valueOf(v);
    }

}
