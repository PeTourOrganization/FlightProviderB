
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the list of available data types for modifications
 * 
 * <p>Java class for typeElement</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeElement">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Payment"/>
 *     <enumeration value="CreditCardAuthorization"/>
 *     <enumeration value="DeliveryInfo"/>
 *     <enumeration value="FormOfPayment"/>
 *     <enumeration value="ActionStatus"/>
 *     <enumeration value="OSI"/>
 *     <enumeration value="GeneralRemark"/>
 *     <enumeration value="UnassociatedRemark"/>
 *     <enumeration value="AccountingRemark"/>
 *     <enumeration value="PostScript"/>
 *     <enumeration value="AirReservationAirSegmentUpdate"/>
 *     <enumeration value="AirSegment"/>
 *     <enumeration value="PhoneNumber"/>
 *     <enumeration value="Email"/>
 *     <enumeration value="LoyaltyCard"/>
 *     <enumeration value="SSR"/>
 *     <enumeration value="SeatAssignment"/>
 *     <enumeration value="SpecificSeatAssignment"/>
 *     <enumeration value="AutoSeatAssignment"/>
 *     <enumeration value="AirPricingInfo"/>
 *     <enumeration value="VehicleSpecialRequest"/>
 *     <enumeration value="SpecialEquipment"/>
 *     <enumeration value="XMLRemark"/>
 *     <enumeration value="Address"/>
 *     <enumeration value="TicketingModifiers"/>
 *     <enumeration value="Guarantee"/>
 *     <enumeration value="DeliveryAddress"/>
 *     <enumeration value="ServiceFeeInfo"/>
 *     <enumeration value="LinkedUniversalRecord"/>
 *     <enumeration value="NameRemark"/>
 *     <enumeration value="PassiveSegment"/>
 *     <enumeration value="PaymentInformation"/>
 *     <enumeration value="CustomerID"/>
 *     <enumeration value="DriversLicense"/>
 *     <enumeration value="AssociatedRemark"/>
 *     <enumeration value="CollectionAddress"/>
 *     <enumeration value="HotelSpecialRequest"/>
 *     <enumeration value="CorporateDiscountID"/>
 *     <enumeration value="CommissionRemark"/>
 *     <enumeration value="PocketItineraryRemark"/>
 *     <enumeration value="CustomizedNameData"/>
 *     <enumeration value="InvoiceRemark"/>
 *     <enumeration value="ThirdPartyInformation"/>
 *     <enumeration value="TravelCompliance"/>
 *     <enumeration value="ReviewBooking"/>
 *     <enumeration value="ConsolidatorRemark"/>
 *     <enumeration value="BookingTraveler"/>
 *     <enumeration value="AppliedProfile"/>
 *     <enumeration value="TripName"/>
 *     <enumeration value="TravelPurpose"/>
 *     <enumeration value="BookingConfirmation"/>
 *     <enumeration value="Brand"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeElement", namespace = "http://www.travelport.com/schema/common_v54_0")
@XmlEnum
public enum TypeElement {

    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("CreditCardAuthorization")
    CREDIT_CARD_AUTHORIZATION("CreditCardAuthorization"),
    @XmlEnumValue("DeliveryInfo")
    DELIVERY_INFO("DeliveryInfo"),
    @XmlEnumValue("FormOfPayment")
    FORM_OF_PAYMENT("FormOfPayment"),
    @XmlEnumValue("ActionStatus")
    ACTION_STATUS("ActionStatus"),
    OSI("OSI"),
    @XmlEnumValue("GeneralRemark")
    GENERAL_REMARK("GeneralRemark"),
    @XmlEnumValue("UnassociatedRemark")
    UNASSOCIATED_REMARK("UnassociatedRemark"),
    @XmlEnumValue("AccountingRemark")
    ACCOUNTING_REMARK("AccountingRemark"),
    @XmlEnumValue("PostScript")
    POST_SCRIPT("PostScript"),
    @XmlEnumValue("AirReservationAirSegmentUpdate")
    AIR_RESERVATION_AIR_SEGMENT_UPDATE("AirReservationAirSegmentUpdate"),
    @XmlEnumValue("AirSegment")
    AIR_SEGMENT("AirSegment"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("LoyaltyCard")
    LOYALTY_CARD("LoyaltyCard"),
    SSR("SSR"),
    @XmlEnumValue("SeatAssignment")
    SEAT_ASSIGNMENT("SeatAssignment"),
    @XmlEnumValue("SpecificSeatAssignment")
    SPECIFIC_SEAT_ASSIGNMENT("SpecificSeatAssignment"),
    @XmlEnumValue("AutoSeatAssignment")
    AUTO_SEAT_ASSIGNMENT("AutoSeatAssignment"),
    @XmlEnumValue("AirPricingInfo")
    AIR_PRICING_INFO("AirPricingInfo"),
    @XmlEnumValue("VehicleSpecialRequest")
    VEHICLE_SPECIAL_REQUEST("VehicleSpecialRequest"),
    @XmlEnumValue("SpecialEquipment")
    SPECIAL_EQUIPMENT("SpecialEquipment"),
    @XmlEnumValue("XMLRemark")
    XML_REMARK("XMLRemark"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("TicketingModifiers")
    TICKETING_MODIFIERS("TicketingModifiers"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee"),
    @XmlEnumValue("DeliveryAddress")
    DELIVERY_ADDRESS("DeliveryAddress"),
    @XmlEnumValue("ServiceFeeInfo")
    SERVICE_FEE_INFO("ServiceFeeInfo"),
    @XmlEnumValue("LinkedUniversalRecord")
    LINKED_UNIVERSAL_RECORD("LinkedUniversalRecord"),
    @XmlEnumValue("NameRemark")
    NAME_REMARK("NameRemark"),
    @XmlEnumValue("PassiveSegment")
    PASSIVE_SEGMENT("PassiveSegment"),
    @XmlEnumValue("PaymentInformation")
    PAYMENT_INFORMATION("PaymentInformation"),
    @XmlEnumValue("CustomerID")
    CUSTOMER_ID("CustomerID"),
    @XmlEnumValue("DriversLicense")
    DRIVERS_LICENSE("DriversLicense"),
    @XmlEnumValue("AssociatedRemark")
    ASSOCIATED_REMARK("AssociatedRemark"),
    @XmlEnumValue("CollectionAddress")
    COLLECTION_ADDRESS("CollectionAddress"),
    @XmlEnumValue("HotelSpecialRequest")
    HOTEL_SPECIAL_REQUEST("HotelSpecialRequest"),
    @XmlEnumValue("CorporateDiscountID")
    CORPORATE_DISCOUNT_ID("CorporateDiscountID"),
    @XmlEnumValue("CommissionRemark")
    COMMISSION_REMARK("CommissionRemark"),
    @XmlEnumValue("PocketItineraryRemark")
    POCKET_ITINERARY_REMARK("PocketItineraryRemark"),
    @XmlEnumValue("CustomizedNameData")
    CUSTOMIZED_NAME_DATA("CustomizedNameData"),
    @XmlEnumValue("InvoiceRemark")
    INVOICE_REMARK("InvoiceRemark"),
    @XmlEnumValue("ThirdPartyInformation")
    THIRD_PARTY_INFORMATION("ThirdPartyInformation"),
    @XmlEnumValue("TravelCompliance")
    TRAVEL_COMPLIANCE("TravelCompliance"),
    @XmlEnumValue("ReviewBooking")
    REVIEW_BOOKING("ReviewBooking"),
    @XmlEnumValue("ConsolidatorRemark")
    CONSOLIDATOR_REMARK("ConsolidatorRemark"),
    @XmlEnumValue("BookingTraveler")
    BOOKING_TRAVELER("BookingTraveler"),
    @XmlEnumValue("AppliedProfile")
    APPLIED_PROFILE("AppliedProfile"),
    @XmlEnumValue("TripName")
    TRIP_NAME("TripName"),
    @XmlEnumValue("TravelPurpose")
    TRAVEL_PURPOSE("TravelPurpose"),
    @XmlEnumValue("BookingConfirmation")
    BOOKING_CONFIRMATION("BookingConfirmation"),
    @XmlEnumValue("Brand")
    BRAND("Brand");
    private final String value;

    TypeElement(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TypeElement fromValue(String v) {
        for (TypeElement c: TypeElement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
