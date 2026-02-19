
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Kestrel Long Fare Rule Category Codes
 * 
 * <p>Java class for typeFareRuleCategoryCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeFareRuleCategoryCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APP"/>
 *     <enumeration value="WHO"/>
 *     <enumeration value="DAY"/>
 *     <enumeration value="SEA"/>
 *     <enumeration value="FLT"/>
 *     <enumeration value="ADV"/>
 *     <enumeration value="MIN"/>
 *     <enumeration value="MAX"/>
 *     <enumeration value="STP"/>
 *     <enumeration value="TRF"/>
 *     <enumeration value="CMB"/>
 *     <enumeration value="BLA"/>
 *     <enumeration value="SUR"/>
 *     <enumeration value="ACC"/>
 *     <enumeration value="TVL"/>
 *     <enumeration value="TKT"/>
 *     <enumeration value="CHG"/>
 *     <enumeration value="HIP"/>
 *     <enumeration value="END"/>
 *     <enumeration value="CHD"/>
 *     <enumeration value="TUC"/>
 *     <enumeration value="AGT"/>
 *     <enumeration value="DSC"/>
 *     <enumeration value="MIS"/>
 *     <enumeration value="FBR"/>
 *     <enumeration value="GRP"/>
 *     <enumeration value="TUR"/>
 *     <enumeration value="VAC"/>
 *     <enumeration value="DEP"/>
 *     <enumeration value="VOL"/>
 *     <enumeration value="IVE"/>
 *     <enumeration value="VOR"/>
 *     <enumeration value="IVR"/>
 *     <enumeration value="NET"/>
 *     <enumeration value="OTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeFareRuleCategoryCode")
@XmlEnum
public enum TypeFareRuleCategoryCode {


    /**
     * Rule App/Other Conditions
     * 
     */
    APP,

    /**
     * Eligibility
     * 
     */
    WHO,

    /**
     * Day/Time
     * 
     */
    DAY,

    /**
     * Seasonal
     * 
     */
    SEA,

    /**
     * Flight App
     * 
     */
    FLT,

    /**
     * Advance Res/Tkt
     * 
     */
    ADV,

    /**
     * Minimum Stay
     * 
     */
    MIN,

    /**
     * Maximum Stay
     * 
     */
    MAX,

    /**
     * Stopovers
     * 
     */
    STP,

    /**
     * Transfers/Routing
     * 
     */
    TRF,

    /**
     * Combinability
     * 
     */
    CMB,

    /**
     * Blackouts
     * 
     */
    BLA,

    /**
     * Surcharges
     * 
     */
    SUR,

    /**
     * Accompanied
     * 
     */
    ACC,

    /**
     * Travel Restrictions
     * 
     */
    TVL,

    /**
     * Sales Restrictions
     * 
     */
    TKT,

    /**
     * Penalties
     * 
     */
    CHG,

    /**
     * HIP and Mileage Exceptions
     * 
     */
    HIP,

    /**
     * Ticket Endorsements
     * 
     */
    END,

    /**
     * Children"s Discounts
     * 
     */
    CHD,

    /**
     * Tour Conductor Disc
     * 
     */
    TUC,

    /**
     * Agent Discounts
     * 
     */
    AGT,

    /**
     * All Other Disc
     * 
     */
    DSC,

    /**
     * Misc Fare Tags
     * 
     */
    MIS,

    /**
     * Fare By Rule
     * 
     */
    FBR,

    /**
     * Groups
     * 
     */
    GRP,

    /**
     * Tours
     * 
     */
    TUR,

    /**
     * Visit Another Country
     * 
     */
    VAC,

    /**
     * Deposits
     * 
     */
    DEP,

    /**
     * Voluntary Changes
     * 
     */
    VOL,

    /**
     * Involuntary Exchanges
     * 
     */
    IVE,

    /**
     * Voluntary Refunds
     * 
     */
    VOR,

    /**
     * Involuntary Refunds
     * 
     */
    IVR,

    /**
     * Negotiated Fares
     * 
     */
    NET,

    /**
     * Other
     * 
     */
    OTH;

    public String value() {
        return name();
    }

    public static TypeFareRuleCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
