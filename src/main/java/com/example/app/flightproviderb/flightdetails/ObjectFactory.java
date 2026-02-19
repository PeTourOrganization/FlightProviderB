
package com.example.app.flightproviderb.flightdetails;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.app.flightproviderb.flightdetails package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _TaxInfo_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "TaxInfo");
    private static final QName _FeeInfo_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "FeeInfo");
    private static final QName _Text_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "Text");
    private static final QName _Title_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "Title");
    private static final QName _AirSegment_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "AirSegment");
    private static final QName _DefaultBrandDetail_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "DefaultBrandDetail");
    private static final QName _FareCalc_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "FareCalc");
    private static final QName _EmbargoInfo_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "EmbargoInfo");
    private static final QName _TicketNumber_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "TicketNumber");
    private static final QName _AgencyPayment_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "AgencyPayment");
    private static final QName _Meals_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "Meals");
    private static final QName _InFlightServices_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "InFlightServices");
    private static final QName _FareRoutingInformation_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "FareRoutingInformation");
    private static final QName _FareMileageInformation_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "FareMileageInformation");
    private static final QName _OverrideCode_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "OverrideCode");
    private static final QName _OptionalServiceRef_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "OptionalServiceRef");
    private static final QName _SegmentIndex_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "SegmentIndex");
    private static final QName _EMDEndorsement_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "EMDEndorsement");
    private static final QName _ApplicableSegment_QNAME = new QName("http://www.travelport.com/schema/air_v54_0", "ApplicableSegment");
    private static final QName _TerminalSessionInfo_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "TerminalSessionInfo");
    private static final QName _FulFillmentType_QNAME = new QName("http://www.travelport.com/schema/rail_v54_0", "FulFillmentType");
    private static final QName _ProviderReservationDetail_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "ProviderReservationDetail");
    private static final QName _LocatorCode_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "LocatorCode");
    private static final QName _GuaranteeType_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "GuaranteeType");
    private static final QName _SimpleName_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "SimpleName");
    private static final QName _LocationAddress_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "LocationAddress");
    private static final QName _ConnectionPoint_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "ConnectionPoint");
    private static final QName _ReferencePoint_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "ReferencePoint");
    private static final QName _SellMessage_QNAME = new QName("http://www.travelport.com/schema/common_v54_0", "SellMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.app.flightproviderb.flightdetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionalServices }
     * 
     * @return
     *     the new instance of {@link OptionalServices }
     */
    public OptionalServices createOptionalServices() {
        return new OptionalServices();
    }

    /**
     * Create an instance of {@link ServiceAssociations }
     * 
     * @return
     *     the new instance of {@link ServiceAssociations }
     */
    public ServiceAssociations createServiceAssociations() {
        return new ServiceAssociations();
    }

    /**
     * Create an instance of {@link FareRulesFilter }
     * 
     * @return
     *     the new instance of {@link FareRulesFilter }
     */
    public FareRulesFilter createFareRulesFilter() {
        return new FareRulesFilter();
    }

    /**
     * Create an instance of {@link AirPricingModifiers }
     * 
     * @return
     *     the new instance of {@link AirPricingModifiers }
     */
    public AirPricingModifiers createAirPricingModifiers() {
        return new AirPricingModifiers();
    }

    /**
     * Create an instance of {@link BrandModifiers }
     * 
     * @return
     *     the new instance of {@link BrandModifiers }
     */
    public BrandModifiers createBrandModifiers() {
        return new BrandModifiers();
    }

    /**
     * Create an instance of {@link AirSegmentPricingModifiers }
     * 
     * @return
     *     the new instance of {@link AirSegmentPricingModifiers }
     */
    public AirSegmentPricingModifiers createAirSegmentPricingModifiers() {
        return new AirSegmentPricingModifiers();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceInfo }
     * 
     * @return
     *     the new instance of {@link CarryOnAllowanceInfo }
     */
    public CarryOnAllowanceInfo createCarryOnAllowanceInfo() {
        return new CarryOnAllowanceInfo();
    }

    /**
     * Create an instance of {@link TicketingModifiers }
     * 
     * @return
     *     the new instance of {@link TicketingModifiers }
     */
    public TicketingModifiers createTicketingModifiers() {
        return new TicketingModifiers();
    }

    /**
     * Create an instance of {@link AirExchangeInfo }
     * 
     * @return
     *     the new instance of {@link AirExchangeInfo }
     */
    public AirExchangeInfo createAirExchangeInfo() {
        return new AirExchangeInfo();
    }

    /**
     * Create an instance of {@link SolutionGroup }
     * 
     * @return
     *     the new instance of {@link SolutionGroup }
     */
    public SolutionGroup createSolutionGroup() {
        return new SolutionGroup();
    }

    /**
     * Create an instance of {@link AirExchangeModifiers }
     * 
     * @return
     *     the new instance of {@link AirExchangeModifiers }
     */
    public AirExchangeModifiers createAirExchangeModifiers() {
        return new AirExchangeModifiers();
    }

    /**
     * Create an instance of {@link AirSearchModifiers }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers }
     */
    public AirSearchModifiers createAirSearchModifiers() {
        return new AirSearchModifiers();
    }

    /**
     * Create an instance of {@link DeliveryInfo }
     * 
     * @return
     *     the new instance of {@link DeliveryInfo }
     */
    public DeliveryInfo createDeliveryInfo() {
        return new DeliveryInfo();
    }

    /**
     * Create an instance of {@link TravelComplianceData }
     * 
     * @return
     *     the new instance of {@link TravelComplianceData }
     */
    public TravelComplianceData createTravelComplianceData() {
        return new TravelComplianceData();
    }

    /**
     * Create an instance of {@link AirLegModifiers }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers }
     */
    public AirLegModifiers createAirLegModifiers() {
        return new AirLegModifiers();
    }

    /**
     * Create an instance of {@link SeatInformation }
     * 
     * @return
     *     the new instance of {@link SeatInformation }
     */
    public SeatInformation createSeatInformation() {
        return new SeatInformation();
    }

    /**
     * Create an instance of {@link AirSearchAsynchModifiers }
     * 
     * @return
     *     the new instance of {@link AirSearchAsynchModifiers }
     */
    public AirSearchAsynchModifiers createAirSearchAsynchModifiers() {
        return new AirSearchAsynchModifiers();
    }

    /**
     * Create an instance of {@link AirAvailInfo }
     * 
     * @return
     *     the new instance of {@link AirAvailInfo }
     */
    public AirAvailInfo createAirAvailInfo() {
        return new AirAvailInfo();
    }

    /**
     * Create an instance of {@link SpecificTimeTable }
     * 
     * @return
     *     the new instance of {@link SpecificTimeTable }
     */
    public SpecificTimeTable createSpecificTimeTable() {
        return new SpecificTimeTable();
    }

    /**
     * Create an instance of {@link RelatedTraveler }
     * 
     * @return
     *     the new instance of {@link RelatedTraveler }
     */
    public RelatedTraveler createRelatedTraveler() {
        return new RelatedTraveler();
    }

    /**
     * Create an instance of {@link BookingRules }
     * 
     * @return
     *     the new instance of {@link BookingRules }
     */
    public BookingRules createBookingRules() {
        return new BookingRules();
    }

    /**
     * Create an instance of {@link Restriction2 }
     * 
     * @return
     *     the new instance of {@link Restriction2 }
     */
    public Restriction2 createRestriction2() {
        return new Restriction2();
    }

    /**
     * Create an instance of {@link RoutingRules }
     * 
     * @return
     *     the new instance of {@link RoutingRules }
     */
    public RoutingRules createRoutingRules() {
        return new RoutingRules();
    }

    /**
     * Create an instance of {@link ChargesRules }
     * 
     * @return
     *     the new instance of {@link ChargesRules }
     */
    public ChargesRules createChargesRules() {
        return new ChargesRules();
    }

    /**
     * Create an instance of {@link Auxdata }
     * 
     * @return
     *     the new instance of {@link Auxdata }
     */
    public Auxdata createAuxdata() {
        return new Auxdata();
    }

    /**
     * Create an instance of {@link EMDTravelerInfo }
     * 
     * @return
     *     the new instance of {@link EMDTravelerInfo }
     */
    public EMDTravelerInfo createEMDTravelerInfo() {
        return new EMDTravelerInfo();
    }

    /**
     * Create an instance of {@link RepricingModifiers }
     * 
     * @return
     *     the new instance of {@link RepricingModifiers }
     */
    public RepricingModifiers createRepricingModifiers() {
        return new RepricingModifiers();
    }

    /**
     * Create an instance of {@link AirTicketingReq }
     * 
     * @return
     *     the new instance of {@link AirTicketingReq }
     */
    public AirTicketingReq createAirTicketingReq() {
        return new AirTicketingReq();
    }

    /**
     * Create an instance of {@link BaseAirExchangeQuoteReq }
     * 
     * @return
     *     the new instance of {@link BaseAirExchangeQuoteReq }
     */
    public BaseAirExchangeQuoteReq createBaseAirExchangeQuoteReq() {
        return new BaseAirExchangeQuoteReq();
    }

    /**
     * Create an instance of {@link AirRefundQuoteReq }
     * 
     * @return
     *     the new instance of {@link AirRefundQuoteReq }
     */
    public AirRefundQuoteReq createAirRefundQuoteReq() {
        return new AirRefundQuoteReq();
    }

    /**
     * Create an instance of {@link AirFareRulesReq }
     * 
     * @return
     *     the new instance of {@link AirFareRulesReq }
     */
    public AirFareRulesReq createAirFareRulesReq() {
        return new AirFareRulesReq();
    }

    /**
     * Create an instance of {@link RailFareComponent }
     * 
     * @return
     *     the new instance of {@link RailFareComponent }
     */
    public RailFareComponent createRailFareComponent() {
        return new RailFareComponent();
    }

    /**
     * Create an instance of {@link MCOPriceData }
     * 
     * @return
     *     the new instance of {@link MCOPriceData }
     */
    public MCOPriceData createMCOPriceData() {
        return new MCOPriceData();
    }

    /**
     * Create an instance of {@link FlightTimeTableRsp }
     * 
     * @return
     *     the new instance of {@link FlightTimeTableRsp }
     */
    public FlightTimeTableRsp createFlightTimeTableRsp() {
        return new FlightTimeTableRsp();
    }

    /**
     * Create an instance of {@link AirPrePayReq }
     * 
     * @return
     *     the new instance of {@link AirPrePayReq }
     */
    public AirPrePayReq createAirPrePayReq() {
        return new AirPrePayReq();
    }

    /**
     * Create an instance of {@link EMDRetrieveReq }
     * 
     * @return
     *     the new instance of {@link EMDRetrieveReq }
     */
    public EMDRetrieveReq createEMDRetrieveReq() {
        return new EMDRetrieveReq();
    }

    /**
     * Create an instance of {@link AirMerchandisingDetailsRsp }
     * 
     * @return
     *     the new instance of {@link AirMerchandisingDetailsRsp }
     */
    public AirMerchandisingDetailsRsp createAirMerchandisingDetailsRsp() {
        return new AirMerchandisingDetailsRsp();
    }

    /**
     * Create an instance of {@link AirExchangeEligibilityReq }
     * 
     * @return
     *     the new instance of {@link AirExchangeEligibilityReq }
     */
    public AirExchangeEligibilityReq createAirExchangeEligibilityReq() {
        return new AirExchangeEligibilityReq();
    }

    /**
     * Create an instance of {@link BaseAirExchangeMultiQuoteReq }
     * 
     * @return
     *     the new instance of {@link BaseAirExchangeMultiQuoteReq }
     */
    public BaseAirExchangeMultiQuoteReq createBaseAirExchangeMultiQuoteReq() {
        return new BaseAirExchangeMultiQuoteReq();
    }

    /**
     * Create an instance of {@link ProviderARNKSegment }
     * 
     * @return
     *     the new instance of {@link ProviderARNKSegment }
     */
    public ProviderARNKSegment createProviderARNKSegment() {
        return new ProviderARNKSegment();
    }

    /**
     * Create an instance of {@link CommissionRemark }
     * 
     * @return
     *     the new instance of {@link CommissionRemark }
     */
    public CommissionRemark createCommissionRemark() {
        return new CommissionRemark();
    }

    /**
     * Create an instance of {@link ShopInformation }
     * 
     * @return
     *     the new instance of {@link ShopInformation }
     */
    public ShopInformation createShopInformation() {
        return new ShopInformation();
    }

    /**
     * Create an instance of {@link PolicyInformation }
     * 
     * @return
     *     the new instance of {@link PolicyInformation }
     */
    public PolicyInformation createPolicyInformation() {
        return new PolicyInformation();
    }

    /**
     * Create an instance of {@link TravelerInformation }
     * 
     * @return
     *     the new instance of {@link TravelerInformation }
     */
    public TravelerInformation createTravelerInformation() {
        return new TravelerInformation();
    }

    /**
     * Create an instance of {@link TransactionType }
     * 
     * @return
     *     the new instance of {@link TransactionType }
     */
    public TransactionType createTransactionType() {
        return new TransactionType();
    }

    /**
     * Create an instance of {@link APIProvider }
     * 
     * @return
     *     the new instance of {@link APIProvider }
     */
    public APIProvider createAPIProvider() {
        return new APIProvider();
    }

    /**
     * Create an instance of {@link Group }
     * 
     * @return
     *     the new instance of {@link Group }
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link MCOMainData }
     * 
     * @return
     *     the new instance of {@link MCOMainData }
     */
    public MCOMainData createMCOMainData() {
        return new MCOMainData();
    }

    /**
     * Create an instance of {@link RailLegModifiers }
     * 
     * @return
     *     the new instance of {@link RailLegModifiers }
     */
    public RailLegModifiers createRailLegModifiers() {
        return new RailLegModifiers();
    }

    /**
     * Create an instance of {@link RailSearchModifiers }
     * 
     * @return
     *     the new instance of {@link RailSearchModifiers }
     */
    public RailSearchModifiers createRailSearchModifiers() {
        return new RailSearchModifiers();
    }

    /**
     * Create an instance of {@link SessionContext }
     * 
     * @return
     *     the new instance of {@link SessionContext }
     */
    public SessionContext createSessionContext() {
        return new SessionContext();
    }

    /**
     * Create an instance of {@link RoutingRules.Routing }
     * 
     * @return
     *     the new instance of {@link RoutingRules.Routing }
     */
    public RoutingRules.Routing createRoutingRulesRouting() {
        return new RoutingRules.Routing();
    }

    /**
     * Create an instance of {@link TypeFlexibleTimeSpec }
     * 
     * @return
     *     the new instance of {@link TypeFlexibleTimeSpec }
     */
    public TypeFlexibleTimeSpec createTypeFlexibleTimeSpec() {
        return new TypeFlexibleTimeSpec();
    }

    /**
     * Create an instance of {@link ServiceRuleType }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType }
     */
    public ServiceRuleType createServiceRuleType() {
        return new ServiceRuleType();
    }

    /**
     * Create an instance of {@link ServiceRuleType.SecondaryTypeRules }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.SecondaryTypeRules }
     */
    public ServiceRuleType.SecondaryTypeRules createServiceRuleTypeSecondaryTypeRules() {
        return new ServiceRuleType.SecondaryTypeRules();
    }

    /**
     * Create an instance of {@link ServiceRuleType.ModifyRules }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.ModifyRules }
     */
    public ServiceRuleType.ModifyRules createServiceRuleTypeModifyRules() {
        return new ServiceRuleType.ModifyRules();
    }

    /**
     * Create an instance of {@link ServiceRuleType.ApplicationLevel }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.ApplicationLevel }
     */
    public ServiceRuleType.ApplicationLevel createServiceRuleTypeApplicationLevel() {
        return new ServiceRuleType.ApplicationLevel();
    }

    /**
     * Create an instance of {@link TypeFeeInfo }
     * 
     * @return
     *     the new instance of {@link TypeFeeInfo }
     */
    public TypeFeeInfo createTypeFeeInfo() {
        return new TypeFeeInfo();
    }

    /**
     * Create an instance of {@link AirReservation }
     * 
     * @return
     *     the new instance of {@link AirReservation }
     */
    public AirReservation createAirReservation() {
        return new AirReservation();
    }

    /**
     * Create an instance of {@link TypeBaseAirReservation }
     * 
     * @return
     *     the new instance of {@link TypeBaseAirReservation }
     */
    public TypeBaseAirReservation createTypeBaseAirReservation() {
        return new TypeBaseAirReservation();
    }

    /**
     * Create an instance of {@link BaseReservation }
     * 
     * @return
     *     the new instance of {@link BaseReservation }
     */
    public BaseReservation createBaseReservation() {
        return new BaseReservation();
    }

    /**
     * Create an instance of {@link AccountingRemark }
     * 
     * @return
     *     the new instance of {@link AccountingRemark }
     */
    public AccountingRemark createAccountingRemark() {
        return new AccountingRemark();
    }

    /**
     * Create an instance of {@link GeneralRemark }
     * 
     * @return
     *     the new instance of {@link GeneralRemark }
     */
    public GeneralRemark createGeneralRemark() {
        return new GeneralRemark();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     * @return
     *     the new instance of {@link Restriction }
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link PassiveInfo }
     * 
     * @return
     *     the new instance of {@link PassiveInfo }
     */
    public PassiveInfo createPassiveInfo() {
        return new PassiveInfo();
    }

    /**
     * Create an instance of {@link com.example.app.flightproviderb.flightdetails.Commission }
     * 
     * @return
     *     the new instance of {@link com.example.app.flightproviderb.flightdetails.Commission }
     */
    public com.example.app.flightproviderb.flightdetails.Commission createCommission() {
        return new com.example.app.flightproviderb.flightdetails.Commission();
    }

    /**
     * Create an instance of {@link OptionalServices.OptionalServicesTotal }
     * 
     * @return
     *     the new instance of {@link OptionalServices.OptionalServicesTotal }
     */
    public OptionalServices.OptionalServicesTotal createOptionalServicesOptionalServicesTotal() {
        return new OptionalServices.OptionalServicesTotal();
    }

    /**
     * Create an instance of {@link OptionalService }
     * 
     * @return
     *     the new instance of {@link OptionalService }
     */
    public OptionalService createOptionalService() {
        return new OptionalService();
    }

    /**
     * Create an instance of {@link ServiceData }
     * 
     * @return
     *     the new instance of {@link ServiceData }
     */
    public ServiceData createServiceData() {
        return new ServiceData();
    }

    /**
     * Create an instance of {@link SeatAttributes }
     * 
     * @return
     *     the new instance of {@link SeatAttributes }
     */
    public SeatAttributes createSeatAttributes() {
        return new SeatAttributes();
    }

    /**
     * Create an instance of {@link SeatAttribute }
     * 
     * @return
     *     the new instance of {@link SeatAttribute }
     */
    public SeatAttribute createSeatAttribute() {
        return new SeatAttribute();
    }

    /**
     * Create an instance of {@link CabinClass }
     * 
     * @return
     *     the new instance of {@link CabinClass }
     */
    public CabinClass createCabinClass() {
        return new CabinClass();
    }

    /**
     * Create an instance of {@link TypeKeyBasedReference }
     * 
     * @return
     *     the new instance of {@link TypeKeyBasedReference }
     */
    public TypeKeyBasedReference createTypeKeyBasedReference() {
        return new TypeKeyBasedReference();
    }

    /**
     * Create an instance of {@link ServiceInfo }
     * 
     * @return
     *     the new instance of {@link ServiceInfo }
     */
    public ServiceInfo createServiceInfo() {
        return new ServiceInfo();
    }

    /**
     * Create an instance of {@link MediaItem }
     * 
     * @return
     *     the new instance of {@link MediaItem }
     */
    public MediaItem createMediaItem() {
        return new MediaItem();
    }

    /**
     * Create an instance of {@link Remark }
     * 
     * @return
     *     the new instance of {@link Remark }
     */
    public Remark createRemark() {
        return new Remark();
    }

    /**
     * Create an instance of {@link TypeTaxInfo }
     * 
     * @return
     *     the new instance of {@link TypeTaxInfo }
     */
    public TypeTaxInfo createTypeTaxInfo() {
        return new TypeTaxInfo();
    }

    /**
     * Create an instance of {@link EMD }
     * 
     * @return
     *     the new instance of {@link EMD }
     */
    public EMD createEMD() {
        return new EMD();
    }

    /**
     * Create an instance of {@link BundledServices }
     * 
     * @return
     *     the new instance of {@link BundledServices }
     */
    public BundledServices createBundledServices() {
        return new BundledServices();
    }

    /**
     * Create an instance of {@link BundledService }
     * 
     * @return
     *     the new instance of {@link BundledService }
     */
    public BundledService createBundledService() {
        return new BundledService();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     * @return
     *     the new instance of {@link AdditionalInfo }
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

    /**
     * Create an instance of {@link FeeApplication }
     * 
     * @return
     *     the new instance of {@link FeeApplication }
     */
    public FeeApplication createFeeApplication() {
        return new FeeApplication();
    }

    /**
     * Create an instance of {@link TypeTextElement }
     * 
     * @return
     *     the new instance of {@link TypeTextElement }
     */
    public TypeTextElement createTypeTextElement() {
        return new TypeTextElement();
    }

    /**
     * Create an instance of {@link PriceRange }
     * 
     * @return
     *     the new instance of {@link PriceRange }
     */
    public PriceRange createPriceRange() {
        return new PriceRange();
    }

    /**
     * Create an instance of {@link TourCode }
     * 
     * @return
     *     the new instance of {@link TourCode }
     */
    public TourCode createTourCode() {
        return new TourCode();
    }

    /**
     * Create an instance of {@link BrandingInfo }
     * 
     * @return
     *     the new instance of {@link BrandingInfo }
     */
    public BrandingInfo createBrandingInfo() {
        return new BrandingInfo();
    }

    /**
     * Create an instance of {@link ImageLocation }
     * 
     * @return
     *     the new instance of {@link ImageLocation }
     */
    public ImageLocation createImageLocation() {
        return new ImageLocation();
    }

    /**
     * Create an instance of {@link ServiceGroup }
     * 
     * @return
     *     the new instance of {@link ServiceGroup }
     */
    public ServiceGroup createServiceGroup() {
        return new ServiceGroup();
    }

    /**
     * Create an instance of {@link ServiceSubGroup }
     * 
     * @return
     *     the new instance of {@link ServiceSubGroup }
     */
    public ServiceSubGroup createServiceSubGroup() {
        return new ServiceSubGroup();
    }

    /**
     * Create an instance of {@link TypeSegmentRef }
     * 
     * @return
     *     the new instance of {@link TypeSegmentRef }
     */
    public TypeSegmentRef createTypeSegmentRef() {
        return new TypeSegmentRef();
    }

    /**
     * Create an instance of {@link GroupedOptionInfo }
     * 
     * @return
     *     the new instance of {@link GroupedOptionInfo }
     */
    public GroupedOptionInfo createGroupedOptionInfo() {
        return new GroupedOptionInfo();
    }

    /**
     * Create an instance of {@link GroupedOption }
     * 
     * @return
     *     the new instance of {@link GroupedOption }
     */
    public GroupedOption createGroupedOption() {
        return new GroupedOption();
    }

    /**
     * Create an instance of {@link SupplierLocator }
     * 
     * @return
     *     the new instance of {@link SupplierLocator }
     */
    public SupplierLocator createSupplierLocator() {
        return new SupplierLocator();
    }

    /**
     * Create an instance of {@link TypeGeneralReference }
     * 
     * @return
     *     the new instance of {@link TypeGeneralReference }
     */
    public TypeGeneralReference createTypeGeneralReference() {
        return new TypeGeneralReference();
    }

    /**
     * Create an instance of {@link ThirdPartyInformation }
     * 
     * @return
     *     the new instance of {@link ThirdPartyInformation }
     */
    public ThirdPartyInformation createThirdPartyInformation() {
        return new ThirdPartyInformation();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     * @return
     *     the new instance of {@link DocumentInfo }
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link TicketInfo }
     * 
     * @return
     *     the new instance of {@link TicketInfo }
     */
    public TicketInfo createTicketInfo() {
        return new TicketInfo();
    }

    /**
     * Create an instance of {@link com.example.app.flightproviderb.flightdetails.Name }
     * 
     * @return
     *     the new instance of {@link com.example.app.flightproviderb.flightdetails.Name }
     */
    public com.example.app.flightproviderb.flightdetails.Name createName() {
        return new com.example.app.flightproviderb.flightdetails.Name();
    }

    /**
     * Create an instance of {@link ConjunctedTicketInfo }
     * 
     * @return
     *     the new instance of {@link ConjunctedTicketInfo }
     */
    public ConjunctedTicketInfo createConjunctedTicketInfo() {
        return new ConjunctedTicketInfo();
    }

    /**
     * Create an instance of {@link ExchangedTicketInfo }
     * 
     * @return
     *     the new instance of {@link ExchangedTicketInfo }
     */
    public ExchangedTicketInfo createExchangedTicketInfo() {
        return new ExchangedTicketInfo();
    }

    /**
     * Create an instance of {@link MCOInformation }
     * 
     * @return
     *     the new instance of {@link MCOInformation }
     */
    public MCOInformation createMCOInformation() {
        return new MCOInformation();
    }

    /**
     * Create an instance of {@link TCRInfo }
     * 
     * @return
     *     the new instance of {@link TCRInfo }
     */
    public TCRInfo createTCRInfo() {
        return new TCRInfo();
    }

    /**
     * Create an instance of {@link com.example.app.flightproviderb.flightdetails.BookingTravelerRef }
     * 
     * @return
     *     the new instance of {@link com.example.app.flightproviderb.flightdetails.BookingTravelerRef }
     */
    public com.example.app.flightproviderb.flightdetails.BookingTravelerRef createBookingTravelerRef() {
        return new com.example.app.flightproviderb.flightdetails.BookingTravelerRef();
    }

    /**
     * Create an instance of {@link LoyaltyCardRef }
     * 
     * @return
     *     the new instance of {@link LoyaltyCardRef }
     */
    public LoyaltyCardRef createLoyaltyCardRef() {
        return new LoyaltyCardRef();
    }

    /**
     * Create an instance of {@link DriversLicenseRef }
     * 
     * @return
     *     the new instance of {@link DriversLicenseRef }
     */
    public DriversLicenseRef createDriversLicenseRef() {
        return new DriversLicenseRef();
    }

    /**
     * Create an instance of {@link DiscountCardRef }
     * 
     * @return
     *     the new instance of {@link DiscountCardRef }
     */
    public DiscountCardRef createDiscountCardRef() {
        return new DiscountCardRef();
    }

    /**
     * Create an instance of {@link PaymentRef }
     * 
     * @return
     *     the new instance of {@link PaymentRef }
     */
    public PaymentRef createPaymentRef() {
        return new PaymentRef();
    }

    /**
     * Create an instance of {@link ProviderReservationInfoRef }
     * 
     * @return
     *     the new instance of {@link ProviderReservationInfoRef }
     */
    public ProviderReservationInfoRef createProviderReservationInfoRef() {
        return new ProviderReservationInfoRef();
    }

    /**
     * Create an instance of {@link TypeBaseAirSegment }
     * 
     * @return
     *     the new instance of {@link TypeBaseAirSegment }
     */
    public TypeBaseAirSegment createTypeBaseAirSegment() {
        return new TypeBaseAirSegment();
    }

    /**
     * Create an instance of {@link SvcSegment }
     * 
     * @return
     *     the new instance of {@link SvcSegment }
     */
    public SvcSegment createSvcSegment() {
        return new SvcSegment();
    }

    /**
     * Create an instance of {@link AirPricingInfo }
     * 
     * @return
     *     the new instance of {@link AirPricingInfo }
     */
    public AirPricingInfo createAirPricingInfo() {
        return new AirPricingInfo();
    }

    /**
     * Create an instance of {@link FareInfo }
     * 
     * @return
     *     the new instance of {@link FareInfo }
     */
    public FareInfo createFareInfo() {
        return new FareInfo();
    }

    /**
     * Create an instance of {@link FareTicketDesignator }
     * 
     * @return
     *     the new instance of {@link FareTicketDesignator }
     */
    public FareTicketDesignator createFareTicketDesignator() {
        return new FareTicketDesignator();
    }

    /**
     * Create an instance of {@link TicketingCode }
     * 
     * @return
     *     the new instance of {@link TicketingCode }
     */
    public TicketingCode createTicketingCode() {
        return new TicketingCode();
    }

    /**
     * Create an instance of {@link FareSurcharge }
     * 
     * @return
     *     the new instance of {@link FareSurcharge }
     */
    public FareSurcharge createFareSurcharge() {
        return new FareSurcharge();
    }

    /**
     * Create an instance of {@link AccountCode }
     * 
     * @return
     *     the new instance of {@link AccountCode }
     */
    public AccountCode createAccountCode() {
        return new AccountCode();
    }

    /**
     * Create an instance of {@link ContractCode }
     * 
     * @return
     *     the new instance of {@link ContractCode }
     */
    public ContractCode createContractCode() {
        return new ContractCode();
    }

    /**
     * Create an instance of {@link Endorsement }
     * 
     * @return
     *     the new instance of {@link Endorsement }
     */
    public Endorsement createEndorsement() {
        return new Endorsement();
    }

    /**
     * Create an instance of {@link BaggageAllowance }
     * 
     * @return
     *     the new instance of {@link BaggageAllowance }
     */
    public BaggageAllowance createBaggageAllowance() {
        return new BaggageAllowance();
    }

    /**
     * Create an instance of {@link TypeWeight }
     * 
     * @return
     *     the new instance of {@link TypeWeight }
     */
    public TypeWeight createTypeWeight() {
        return new TypeWeight();
    }

    /**
     * Create an instance of {@link FareRuleKey }
     * 
     * @return
     *     the new instance of {@link FareRuleKey }
     */
    public FareRuleKey createFareRuleKey() {
        return new FareRuleKey();
    }

    /**
     * Create an instance of {@link FareRuleFailureInfo }
     * 
     * @return
     *     the new instance of {@link FareRuleFailureInfo }
     */
    public FareRuleFailureInfo createFareRuleFailureInfo() {
        return new FareRuleFailureInfo();
    }

    /**
     * Create an instance of {@link FareRemarkRef }
     * 
     * @return
     *     the new instance of {@link FareRemarkRef }
     */
    public FareRemarkRef createFareRemarkRef() {
        return new FareRemarkRef();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     * @return
     *     the new instance of {@link Brand }
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link Rules }
     * 
     * @return
     *     the new instance of {@link Rules }
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link ServiceAssociations.ApplicableSegment }
     * 
     * @return
     *     the new instance of {@link ServiceAssociations.ApplicableSegment }
     */
    public ServiceAssociations.ApplicableSegment createServiceAssociationsApplicableSegment() {
        return new ServiceAssociations.ApplicableSegment();
    }

    /**
     * Create an instance of {@link UpsellBrand }
     * 
     * @return
     *     the new instance of {@link UpsellBrand }
     */
    public UpsellBrand createUpsellBrand() {
        return new UpsellBrand();
    }

    /**
     * Create an instance of {@link TypeApplicableSegment }
     * 
     * @return
     *     the new instance of {@link TypeApplicableSegment }
     */
    public TypeApplicableSegment createTypeApplicableSegment() {
        return new TypeApplicableSegment();
    }

    /**
     * Create an instance of {@link TypeDefaultBrandDetail }
     * 
     * @return
     *     the new instance of {@link TypeDefaultBrandDetail }
     */
    public TypeDefaultBrandDetail createTypeDefaultBrandDetail() {
        return new TypeDefaultBrandDetail();
    }

    /**
     * Create an instance of {@link TypeFarePenalty }
     * 
     * @return
     *     the new instance of {@link TypeFarePenalty }
     */
    public TypeFarePenalty createTypeFarePenalty() {
        return new TypeFarePenalty();
    }

    /**
     * Create an instance of {@link FareRulesFilter.Refundability }
     * 
     * @return
     *     the new instance of {@link FareRulesFilter.Refundability }
     */
    public FareRulesFilter.Refundability createFareRulesFilterRefundability() {
        return new FareRulesFilter.Refundability();
    }

    /**
     * Create an instance of {@link CHGType }
     * 
     * @return
     *     the new instance of {@link CHGType }
     */
    public CHGType createCHGType() {
        return new CHGType();
    }

    /**
     * Create an instance of {@link MINType }
     * 
     * @return
     *     the new instance of {@link MINType }
     */
    public MINType createMINType() {
        return new MINType();
    }

    /**
     * Create an instance of {@link MAXType }
     * 
     * @return
     *     the new instance of {@link MAXType }
     */
    public MAXType createMAXType() {
        return new MAXType();
    }

    /**
     * Create an instance of {@link ADVType }
     * 
     * @return
     *     the new instance of {@link ADVType }
     */
    public ADVType createADVType() {
        return new ADVType();
    }

    /**
     * Create an instance of {@link OTHType }
     * 
     * @return
     *     the new instance of {@link OTHType }
     */
    public OTHType createOTHType() {
        return new OTHType();
    }

    /**
     * Create an instance of {@link FareStatus }
     * 
     * @return
     *     the new instance of {@link FareStatus }
     */
    public FareStatus createFareStatus() {
        return new FareStatus();
    }

    /**
     * Create an instance of {@link FareStatusFailureInfo }
     * 
     * @return
     *     the new instance of {@link FareStatusFailureInfo }
     */
    public FareStatusFailureInfo createFareStatusFailureInfo() {
        return new FareStatusFailureInfo();
    }

    /**
     * Create an instance of {@link FareInfoRef }
     * 
     * @return
     *     the new instance of {@link FareInfoRef }
     */
    public FareInfoRef createFareInfoRef() {
        return new FareInfoRef();
    }

    /**
     * Create an instance of {@link BookingInfo }
     * 
     * @return
     *     the new instance of {@link BookingInfo }
     */
    public BookingInfo createBookingInfo() {
        return new BookingInfo();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     * @return
     *     the new instance of {@link PassengerType }
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link TypePassengerType }
     * 
     * @return
     *     the new instance of {@link TypePassengerType }
     */
    public TypePassengerType createTypePassengerType() {
        return new TypePassengerType();
    }

    /**
     * Create an instance of {@link LoyaltyCard }
     * 
     * @return
     *     the new instance of {@link LoyaltyCard }
     */
    public LoyaltyCard createLoyaltyCard() {
        return new LoyaltyCard();
    }

    /**
     * Create an instance of {@link TypeProviderReservationSpecificInfo }
     * 
     * @return
     *     the new instance of {@link TypeProviderReservationSpecificInfo }
     */
    public TypeProviderReservationSpecificInfo createTypeProviderReservationSpecificInfo() {
        return new TypeProviderReservationSpecificInfo();
    }

    /**
     * Create an instance of {@link DiscountCard }
     * 
     * @return
     *     the new instance of {@link DiscountCard }
     */
    public DiscountCard createDiscountCard() {
        return new DiscountCard();
    }

    /**
     * Create an instance of {@link PersonalGeography }
     * 
     * @return
     *     the new instance of {@link PersonalGeography }
     */
    public PersonalGeography createPersonalGeography() {
        return new PersonalGeography();
    }

    /**
     * Create an instance of {@link FareGuaranteeInfo }
     * 
     * @return
     *     the new instance of {@link FareGuaranteeInfo }
     */
    public FareGuaranteeInfo createFareGuaranteeInfo() {
        return new FareGuaranteeInfo();
    }

    /**
     * Create an instance of {@link WaiverCode }
     * 
     * @return
     *     the new instance of {@link WaiverCode }
     */
    public WaiverCode createWaiverCode() {
        return new WaiverCode();
    }

    /**
     * Create an instance of {@link PaymentRef2 }
     * 
     * @return
     *     the new instance of {@link PaymentRef2 }
     */
    public PaymentRef2 createPaymentRef2() {
        return new PaymentRef2();
    }

    /**
     * Create an instance of {@link TypeMostRestrictivePenalties }
     * 
     * @return
     *     the new instance of {@link TypeMostRestrictivePenalties }
     */
    public TypeMostRestrictivePenalties createTypeMostRestrictivePenalties() {
        return new TypeMostRestrictivePenalties();
    }

    /**
     * Create an instance of {@link Adjustment }
     * 
     * @return
     *     the new instance of {@link Adjustment }
     */
    public Adjustment createAdjustment() {
        return new Adjustment();
    }

    /**
     * Create an instance of {@link Yield }
     * 
     * @return
     *     the new instance of {@link Yield }
     */
    public Yield createYield() {
        return new Yield();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.ProhibitedRuleCategories }
     * 
     * @return
     *     the new instance of {@link AirPricingModifiers.ProhibitedRuleCategories }
     */
    public AirPricingModifiers.ProhibitedRuleCategories createAirPricingModifiersProhibitedRuleCategories() {
        return new AirPricingModifiers.ProhibitedRuleCategories();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.AccountCodes }
     * 
     * @return
     *     the new instance of {@link AirPricingModifiers.AccountCodes }
     */
    public AirPricingModifiers.AccountCodes createAirPricingModifiersAccountCodes() {
        return new AirPricingModifiers.AccountCodes();
    }

    /**
     * Create an instance of {@link PermittedCabins }
     * 
     * @return
     *     the new instance of {@link PermittedCabins }
     */
    public PermittedCabins createPermittedCabins() {
        return new PermittedCabins();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.ContractCodes }
     * 
     * @return
     *     the new instance of {@link AirPricingModifiers.ContractCodes }
     */
    public AirPricingModifiers.ContractCodes createAirPricingModifiersContractCodes() {
        return new AirPricingModifiers.ContractCodes();
    }

    /**
     * Create an instance of {@link ExemptTaxes }
     * 
     * @return
     *     the new instance of {@link ExemptTaxes }
     */
    public ExemptTaxes createExemptTaxes() {
        return new ExemptTaxes();
    }

    /**
     * Create an instance of {@link PenaltyFareInformation }
     * 
     * @return
     *     the new instance of {@link PenaltyFareInformation }
     */
    public PenaltyFareInformation createPenaltyFareInformation() {
        return new PenaltyFareInformation();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.PromoCodes }
     * 
     * @return
     *     the new instance of {@link AirPricingModifiers.PromoCodes }
     */
    public AirPricingModifiers.PromoCodes createAirPricingModifiersPromoCodes() {
        return new AirPricingModifiers.PromoCodes();
    }

    /**
     * Create an instance of {@link ManualFareAdjustment }
     * 
     * @return
     *     the new instance of {@link ManualFareAdjustment }
     */
    public ManualFareAdjustment createManualFareAdjustment() {
        return new ManualFareAdjustment();
    }

    /**
     * Create an instance of {@link PointOfSale }
     * 
     * @return
     *     the new instance of {@link PointOfSale }
     */
    public PointOfSale createPointOfSale() {
        return new PointOfSale();
    }

    /**
     * Create an instance of {@link BrandModifiers.FareFamilyDisplay }
     * 
     * @return
     *     the new instance of {@link BrandModifiers.FareFamilyDisplay }
     */
    public BrandModifiers.FareFamilyDisplay createBrandModifiersFareFamilyDisplay() {
        return new BrandModifiers.FareFamilyDisplay();
    }

    /**
     * Create an instance of {@link BrandModifiers.BasicDetailsOnly }
     * 
     * @return
     *     the new instance of {@link BrandModifiers.BasicDetailsOnly }
     */
    public BrandModifiers.BasicDetailsOnly createBrandModifiersBasicDetailsOnly() {
        return new BrandModifiers.BasicDetailsOnly();
    }

    /**
     * Create an instance of {@link MultiGDSSearchIndicator }
     * 
     * @return
     *     the new instance of {@link MultiGDSSearchIndicator }
     */
    public MultiGDSSearchIndicator createMultiGDSSearchIndicator() {
        return new MultiGDSSearchIndicator();
    }

    /**
     * Create an instance of {@link PreferredCabins }
     * 
     * @return
     *     the new instance of {@link PreferredCabins }
     */
    public PreferredCabins createPreferredCabins() {
        return new PreferredCabins();
    }

    /**
     * Create an instance of {@link TicketingModifiersRef }
     * 
     * @return
     *     the new instance of {@link TicketingModifiersRef }
     */
    public TicketingModifiersRef createTicketingModifiersRef() {
        return new TicketingModifiersRef();
    }

    /**
     * Create an instance of {@link AirSegmentPricingModifiers.PermittedBookingCodes }
     * 
     * @return
     *     the new instance of {@link AirSegmentPricingModifiers.PermittedBookingCodes }
     */
    public AirSegmentPricingModifiers.PermittedBookingCodes createAirSegmentPricingModifiersPermittedBookingCodes() {
        return new AirSegmentPricingModifiers.PermittedBookingCodes();
    }

    /**
     * Create an instance of {@link FlightOptionsList }
     * 
     * @return
     *     the new instance of {@link FlightOptionsList }
     */
    public FlightOptionsList createFlightOptionsList() {
        return new FlightOptionsList();
    }

    /**
     * Create an instance of {@link FlightOption }
     * 
     * @return
     *     the new instance of {@link FlightOption }
     */
    public FlightOption createFlightOption() {
        return new FlightOption();
    }

    /**
     * Create an instance of {@link Option }
     * 
     * @return
     *     the new instance of {@link Option }
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Connection }
     * 
     * @return
     *     the new instance of {@link Connection }
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link FareNote }
     * 
     * @return
     *     the new instance of {@link FareNote }
     */
    public FareNote createFareNote() {
        return new FareNote();
    }

    /**
     * Create an instance of {@link BaggageAllowances }
     * 
     * @return
     *     the new instance of {@link BaggageAllowances }
     */
    public BaggageAllowances createBaggageAllowances() {
        return new BaggageAllowances();
    }

    /**
     * Create an instance of {@link BaggageAllowanceInfo }
     * 
     * @return
     *     the new instance of {@link BaggageAllowanceInfo }
     */
    public BaggageAllowanceInfo createBaggageAllowanceInfo() {
        return new BaggageAllowanceInfo();
    }

    /**
     * Create an instance of {@link BaseBaggageAllowanceInfo }
     * 
     * @return
     *     the new instance of {@link BaseBaggageAllowanceInfo }
     */
    public BaseBaggageAllowanceInfo createBaseBaggageAllowanceInfo() {
        return new BaseBaggageAllowanceInfo();
    }

    /**
     * Create an instance of {@link URLInfo }
     * 
     * @return
     *     the new instance of {@link URLInfo }
     */
    public URLInfo createURLInfo() {
        return new URLInfo();
    }

    /**
     * Create an instance of {@link TextInfo }
     * 
     * @return
     *     the new instance of {@link TextInfo }
     */
    public TextInfo createTextInfo() {
        return new TextInfo();
    }

    /**
     * Create an instance of {@link BagDetails }
     * 
     * @return
     *     the new instance of {@link BagDetails }
     */
    public BagDetails createBagDetails() {
        return new BagDetails();
    }

    /**
     * Create an instance of {@link BaggageRestriction }
     * 
     * @return
     *     the new instance of {@link BaggageRestriction }
     */
    public BaggageRestriction createBaggageRestriction() {
        return new BaggageRestriction();
    }

    /**
     * Create an instance of {@link Dimension }
     * 
     * @return
     *     the new instance of {@link Dimension }
     */
    public Dimension createDimension() {
        return new Dimension();
    }

    /**
     * Create an instance of {@link TypeUnitOfMeasure }
     * 
     * @return
     *     the new instance of {@link TypeUnitOfMeasure }
     */
    public TypeUnitOfMeasure createTypeUnitOfMeasure() {
        return new TypeUnitOfMeasure();
    }

    /**
     * Create an instance of {@link AvailableDiscount }
     * 
     * @return
     *     the new instance of {@link AvailableDiscount }
     */
    public AvailableDiscount createAvailableDiscount() {
        return new AvailableDiscount();
    }

    /**
     * Create an instance of {@link LoyaltyProgram }
     * 
     * @return
     *     the new instance of {@link LoyaltyProgram }
     */
    public LoyaltyProgram createLoyaltyProgram() {
        return new LoyaltyProgram();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceInfo.CarryOnDetails }
     * 
     * @return
     *     the new instance of {@link CarryOnAllowanceInfo.CarryOnDetails }
     */
    public CarryOnAllowanceInfo.CarryOnDetails createCarryOnAllowanceInfoCarryOnDetails() {
        return new CarryOnAllowanceInfo.CarryOnDetails();
    }

    /**
     * Create an instance of {@link PolicyCodesList }
     * 
     * @return
     *     the new instance of {@link PolicyCodesList }
     */
    public PolicyCodesList createPolicyCodesList() {
        return new PolicyCodesList();
    }

    /**
     * Create an instance of {@link PriceChangeType }
     * 
     * @return
     *     the new instance of {@link PriceChangeType }
     */
    public PriceChangeType createPriceChangeType() {
        return new PriceChangeType();
    }

    /**
     * Create an instance of {@link ActionDetails }
     * 
     * @return
     *     the new instance of {@link ActionDetails }
     */
    public ActionDetails createActionDetails() {
        return new ActionDetails();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     * @return
     *     the new instance of {@link Payment }
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link CreditCardAuth }
     * 
     * @return
     *     the new instance of {@link CreditCardAuth }
     */
    public CreditCardAuth createCreditCardAuth() {
        return new CreditCardAuth();
    }

    /**
     * Create an instance of {@link TypeTaxInfoWithPaymentRef }
     * 
     * @return
     *     the new instance of {@link TypeTaxInfoWithPaymentRef }
     */
    public TypeTaxInfoWithPaymentRef createTypeTaxInfoWithPaymentRef() {
        return new TypeTaxInfoWithPaymentRef();
    }

    /**
     * Create an instance of {@link TypeTicketModifierAmountType }
     * 
     * @return
     *     the new instance of {@link TypeTicketModifierAmountType }
     */
    public TypeTicketModifierAmountType createTypeTicketModifierAmountType() {
        return new TypeTicketModifierAmountType();
    }

    /**
     * Create an instance of {@link TypeTicketModifierAccountingType }
     * 
     * @return
     *     the new instance of {@link TypeTicketModifierAccountingType }
     */
    public TypeTicketModifierAccountingType createTypeTicketModifierAccountingType() {
        return new TypeTicketModifierAccountingType();
    }

    /**
     * Create an instance of {@link TicketingModifiers.BulkTicket }
     * 
     * @return
     *     the new instance of {@link TicketingModifiers.BulkTicket }
     */
    public TicketingModifiers.BulkTicket createTicketingModifiersBulkTicket() {
        return new TicketingModifiers.BulkTicket();
    }

    /**
     * Create an instance of {@link TypeBulkTicketModifierType }
     * 
     * @return
     *     the new instance of {@link TypeBulkTicketModifierType }
     */
    public TypeBulkTicketModifierType createTypeBulkTicketModifierType() {
        return new TypeBulkTicketModifierType();
    }

    /**
     * Create an instance of {@link TicketEndorsement }
     * 
     * @return
     *     the new instance of {@link TicketEndorsement }
     */
    public TicketEndorsement createTicketEndorsement() {
        return new TicketEndorsement();
    }

    /**
     * Create an instance of {@link TypeTicketModifierValueType }
     * 
     * @return
     *     the new instance of {@link TypeTicketModifierValueType }
     */
    public TypeTicketModifierValueType createTypeTicketModifierValueType() {
        return new TypeTicketModifierValueType();
    }

    /**
     * Create an instance of {@link DocumentSelect }
     * 
     * @return
     *     the new instance of {@link DocumentSelect }
     */
    public DocumentSelect createDocumentSelect() {
        return new DocumentSelect();
    }

    /**
     * Create an instance of {@link BackOfficeHandOff }
     * 
     * @return
     *     the new instance of {@link BackOfficeHandOff }
     */
    public BackOfficeHandOff createBackOfficeHandOff() {
        return new BackOfficeHandOff();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     * @return
     *     the new instance of {@link Itinerary }
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link DocumentOptions }
     * 
     * @return
     *     the new instance of {@link DocumentOptions }
     */
    public DocumentOptions createDocumentOptions() {
        return new DocumentOptions();
    }

    /**
     * Create an instance of {@link PassengerReceiptOverride }
     * 
     * @return
     *     the new instance of {@link PassengerReceiptOverride }
     */
    public PassengerReceiptOverride createPassengerReceiptOverride() {
        return new PassengerReceiptOverride();
    }

    /**
     * Create an instance of {@link SegmentSelect }
     * 
     * @return
     *     the new instance of {@link SegmentSelect }
     */
    public SegmentSelect createSegmentSelect() {
        return new SegmentSelect();
    }

    /**
     * Create an instance of {@link TypeSegmentRef2 }
     * 
     * @return
     *     the new instance of {@link TypeSegmentRef2 }
     */
    public TypeSegmentRef2 createTypeSegmentRef2() {
        return new TypeSegmentRef2();
    }

    /**
     * Create an instance of {@link TypeNonAirReservationRef }
     * 
     * @return
     *     the new instance of {@link TypeNonAirReservationRef }
     */
    public TypeNonAirReservationRef createTypeNonAirReservationRef() {
        return new TypeNonAirReservationRef();
    }

    /**
     * Create an instance of {@link SegmentModifiers }
     * 
     * @return
     *     the new instance of {@link SegmentModifiers }
     */
    public SegmentModifiers createSegmentModifiers() {
        return new SegmentModifiers();
    }

    /**
     * Create an instance of {@link AirSegmentRef }
     * 
     * @return
     *     the new instance of {@link AirSegmentRef }
     */
    public AirSegmentRef createAirSegmentRef() {
        return new AirSegmentRef();
    }

    /**
     * Create an instance of {@link TicketValidity }
     * 
     * @return
     *     the new instance of {@link TicketValidity }
     */
    public TicketValidity createTicketValidity() {
        return new TicketValidity();
    }

    /**
     * Create an instance of {@link DestinationPurposeCode }
     * 
     * @return
     *     the new instance of {@link DestinationPurposeCode }
     */
    public DestinationPurposeCode createDestinationPurposeCode() {
        return new DestinationPurposeCode();
    }

    /**
     * Create an instance of {@link LanguageOption }
     * 
     * @return
     *     the new instance of {@link LanguageOption }
     */
    public LanguageOption createLanguageOption() {
        return new LanguageOption();
    }

    /**
     * Create an instance of {@link LandCharges }
     * 
     * @return
     *     the new instance of {@link LandCharges }
     */
    public LandCharges createLandCharges() {
        return new LandCharges();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     * @return
     *     the new instance of {@link Tax }
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link PrintBlankFormItinerary }
     * 
     * @return
     *     the new instance of {@link PrintBlankFormItinerary }
     */
    public PrintBlankFormItinerary createPrintBlankFormItinerary() {
        return new PrintBlankFormItinerary();
    }

    /**
     * Create an instance of {@link ExemptOBFee }
     * 
     * @return
     *     the new instance of {@link ExemptOBFee }
     */
    public ExemptOBFee createExemptOBFee() {
        return new ExemptOBFee();
    }

    /**
     * Create an instance of {@link AssociatedRemark }
     * 
     * @return
     *     the new instance of {@link AssociatedRemark }
     */
    public AssociatedRemark createAssociatedRemark() {
        return new AssociatedRemark();
    }

    /**
     * Create an instance of {@link TypeAssociatedRemarkWithSegmentRef }
     * 
     * @return
     *     the new instance of {@link TypeAssociatedRemarkWithSegmentRef }
     */
    public TypeAssociatedRemarkWithSegmentRef createTypeAssociatedRemarkWithSegmentRef() {
        return new TypeAssociatedRemarkWithSegmentRef();
    }

    /**
     * Create an instance of {@link TypeAssociatedRemark }
     * 
     * @return
     *     the new instance of {@link TypeAssociatedRemark }
     */
    public TypeAssociatedRemark createTypeAssociatedRemark() {
        return new TypeAssociatedRemark();
    }

    /**
     * Create an instance of {@link TypeRemarkWithTravelerRef }
     * 
     * @return
     *     the new instance of {@link TypeRemarkWithTravelerRef }
     */
    public TypeRemarkWithTravelerRef createTypeRemarkWithTravelerRef() {
        return new TypeRemarkWithTravelerRef();
    }

    /**
     * Create an instance of {@link PocketItineraryRemark }
     * 
     * @return
     *     the new instance of {@link PocketItineraryRemark }
     */
    public PocketItineraryRemark createPocketItineraryRemark() {
        return new PocketItineraryRemark();
    }

    /**
     * Create an instance of {@link AirExchangeBundleTotal }
     * 
     * @return
     *     the new instance of {@link AirExchangeBundleTotal }
     */
    public AirExchangeBundleTotal createAirExchangeBundleTotal() {
        return new AirExchangeBundleTotal();
    }

    /**
     * Create an instance of {@link AirExchangeInfo.TotalPenaltyTaxInfo }
     * 
     * @return
     *     the new instance of {@link AirExchangeInfo.TotalPenaltyTaxInfo }
     */
    public AirExchangeInfo.TotalPenaltyTaxInfo createAirExchangeInfoTotalPenaltyTaxInfo() {
        return new AirExchangeInfo.TotalPenaltyTaxInfo();
    }

    /**
     * Create an instance of {@link TypeTax }
     * 
     * @return
     *     the new instance of {@link TypeTax }
     */
    public TypeTax createTypeTax() {
        return new TypeTax();
    }

    /**
     * Create an instance of {@link AirExchangeInfo.TicketFeeInfo }
     * 
     * @return
     *     the new instance of {@link AirExchangeInfo.TicketFeeInfo }
     */
    public AirExchangeInfo.TicketFeeInfo createAirExchangeInfoTicketFeeInfo() {
        return new AirExchangeInfo.TicketFeeInfo();
    }

    /**
     * Create an instance of {@link Penalty }
     * 
     * @return
     *     the new instance of {@link Penalty }
     */
    public Penalty createPenalty() {
        return new Penalty();
    }

    /**
     * Create an instance of {@link AirExchangeBundle }
     * 
     * @return
     *     the new instance of {@link AirExchangeBundle }
     */
    public AirExchangeBundle createAirExchangeBundle() {
        return new AirExchangeBundle();
    }

    /**
     * Create an instance of {@link com.example.app.flightproviderb.flightdetails.AirPricingInfoRef }
     * 
     * @return
     *     the new instance of {@link com.example.app.flightproviderb.flightdetails.AirPricingInfoRef }
     */
    public com.example.app.flightproviderb.flightdetails.AirPricingInfoRef createAirPricingInfoRef() {
        return new com.example.app.flightproviderb.flightdetails.AirPricingInfoRef();
    }

    /**
     * Create an instance of {@link AmenitiesList }
     * 
     * @return
     *     the new instance of {@link AmenitiesList }
     */
    public AmenitiesList createAmenitiesList() {
        return new AmenitiesList();
    }

    /**
     * Create an instance of {@link Amenities }
     * 
     * @return
     *     the new instance of {@link Amenities }
     */
    public Amenities createAmenities() {
        return new Amenities();
    }

    /**
     * Create an instance of {@link AmenitiesTextType }
     * 
     * @return
     *     the new instance of {@link AmenitiesTextType }
     */
    public AmenitiesTextType createAmenitiesTextType() {
        return new AmenitiesTextType();
    }

    /**
     * Create an instance of {@link AirPricingInfoList }
     * 
     * @return
     *     the new instance of {@link AirPricingInfoList }
     */
    public AirPricingInfoList createAirPricingInfoList() {
        return new AirPricingInfoList();
    }

    /**
     * Create an instance of {@link AirPricingCommand }
     * 
     * @return
     *     the new instance of {@link AirPricingCommand }
     */
    public AirPricingCommand createAirPricingCommand() {
        return new AirPricingCommand();
    }

    /**
     * Create an instance of {@link ExchangeAirSegment }
     * 
     * @return
     *     the new instance of {@link ExchangeAirSegment }
     */
    public ExchangeAirSegment createExchangeAirSegment() {
        return new ExchangeAirSegment();
    }

    /**
     * Create an instance of {@link TCRExchangeBundle }
     * 
     * @return
     *     the new instance of {@link TCRExchangeBundle }
     */
    public TCRExchangeBundle createTCRExchangeBundle() {
        return new TCRExchangeBundle();
    }

    /**
     * Create an instance of {@link AirExchangeTicketBundle }
     * 
     * @return
     *     the new instance of {@link AirExchangeTicketBundle }
     */
    public AirExchangeTicketBundle createAirExchangeTicketBundle() {
        return new AirExchangeTicketBundle();
    }

    /**
     * Create an instance of {@link FormOfPayment }
     * 
     * @return
     *     the new instance of {@link FormOfPayment }
     */
    public FormOfPayment createFormOfPayment() {
        return new FormOfPayment();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     * @return
     *     the new instance of {@link CreditCard }
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link TypeCreditCardType }
     * 
     * @return
     *     the new instance of {@link TypeCreditCardType }
     */
    public TypeCreditCardType createTypeCreditCardType() {
        return new TypeCreditCardType();
    }

    /**
     * Create an instance of {@link TypePaymentCard }
     * 
     * @return
     *     the new instance of {@link TypePaymentCard }
     */
    public TypePaymentCard createTypePaymentCard() {
        return new TypePaymentCard();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     * @return
     *     the new instance of {@link PhoneNumber }
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link TypeStructuredAddress }
     * 
     * @return
     *     the new instance of {@link TypeStructuredAddress }
     */
    public TypeStructuredAddress createTypeStructuredAddress() {
        return new TypeStructuredAddress();
    }

    /**
     * Create an instance of {@link DebitCard }
     * 
     * @return
     *     the new instance of {@link DebitCard }
     */
    public DebitCard createDebitCard() {
        return new DebitCard();
    }

    /**
     * Create an instance of {@link EnettVan }
     * 
     * @return
     *     the new instance of {@link EnettVan }
     */
    public EnettVan createEnettVan() {
        return new EnettVan();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     * @return
     *     the new instance of {@link Certificate }
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link Check }
     * 
     * @return
     *     the new instance of {@link Check }
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link Requisition }
     * 
     * @return
     *     the new instance of {@link Requisition }
     */
    public Requisition createRequisition() {
        return new Requisition();
    }

    /**
     * Create an instance of {@link MiscFormOfPayment }
     * 
     * @return
     *     the new instance of {@link MiscFormOfPayment }
     */
    public MiscFormOfPayment createMiscFormOfPayment() {
        return new MiscFormOfPayment();
    }

    /**
     * Create an instance of {@link TypeAgencyPayment }
     * 
     * @return
     *     the new instance of {@link TypeAgencyPayment }
     */
    public TypeAgencyPayment createTypeAgencyPayment() {
        return new TypeAgencyPayment();
    }

    /**
     * Create an instance of {@link UnitedNations }
     * 
     * @return
     *     the new instance of {@link UnitedNations }
     */
    public UnitedNations createUnitedNations() {
        return new UnitedNations();
    }

    /**
     * Create an instance of {@link DirectPayment }
     * 
     * @return
     *     the new instance of {@link DirectPayment }
     */
    public DirectPayment createDirectPayment() {
        return new DirectPayment();
    }

    /**
     * Create an instance of {@link AgentVoucher }
     * 
     * @return
     *     the new instance of {@link AgentVoucher }
     */
    public AgentVoucher createAgentVoucher() {
        return new AgentVoucher();
    }

    /**
     * Create an instance of {@link PaymentAdvice }
     * 
     * @return
     *     the new instance of {@link PaymentAdvice }
     */
    public PaymentAdvice createPaymentAdvice() {
        return new PaymentAdvice();
    }

    /**
     * Create an instance of {@link TypeFormOfPaymentPNRReference }
     * 
     * @return
     *     the new instance of {@link TypeFormOfPaymentPNRReference }
     */
    public TypeFormOfPaymentPNRReference createTypeFormOfPaymentPNRReference() {
        return new TypeFormOfPaymentPNRReference();
    }

    /**
     * Create an instance of {@link BSPPayment }
     * 
     * @return
     *     the new instance of {@link BSPPayment }
     */
    public BSPPayment createBSPPayment() {
        return new BSPPayment();
    }

    /**
     * Create an instance of {@link ARCPayment }
     * 
     * @return
     *     the new instance of {@link ARCPayment }
     */
    public ARCPayment createARCPayment() {
        return new ARCPayment();
    }

    /**
     * Create an instance of {@link FormOfPaymentRef }
     * 
     * @return
     *     the new instance of {@link FormOfPaymentRef }
     */
    public FormOfPaymentRef createFormOfPaymentRef() {
        return new FormOfPaymentRef();
    }

    /**
     * Create an instance of {@link Enumeration }
     * 
     * @return
     *     the new instance of {@link Enumeration }
     */
    public Enumeration createEnumeration() {
        return new Enumeration();
    }

    /**
     * Create an instance of {@link SolutionGroup.PermittedAccountCodes }
     * 
     * @return
     *     the new instance of {@link SolutionGroup.PermittedAccountCodes }
     */
    public SolutionGroup.PermittedAccountCodes createSolutionGroupPermittedAccountCodes() {
        return new SolutionGroup.PermittedAccountCodes();
    }

    /**
     * Create an instance of {@link SolutionGroup.PreferredAccountCodes }
     * 
     * @return
     *     the new instance of {@link SolutionGroup.PreferredAccountCodes }
     */
    public SolutionGroup.PreferredAccountCodes createSolutionGroupPreferredAccountCodes() {
        return new SolutionGroup.PreferredAccountCodes();
    }

    /**
     * Create an instance of {@link SolutionGroup.ProhibitedAccountCodes }
     * 
     * @return
     *     the new instance of {@link SolutionGroup.ProhibitedAccountCodes }
     */
    public SolutionGroup.ProhibitedAccountCodes createSolutionGroupProhibitedAccountCodes() {
        return new SolutionGroup.ProhibitedAccountCodes();
    }

    /**
     * Create an instance of {@link SolutionGroup.PermittedPointOfSales }
     * 
     * @return
     *     the new instance of {@link SolutionGroup.PermittedPointOfSales }
     */
    public SolutionGroup.PermittedPointOfSales createSolutionGroupPermittedPointOfSales() {
        return new SolutionGroup.PermittedPointOfSales();
    }

    /**
     * Create an instance of {@link SolutionGroup.ProhibitedPointOfSales }
     * 
     * @return
     *     the new instance of {@link SolutionGroup.ProhibitedPointOfSales }
     */
    public SolutionGroup.ProhibitedPointOfSales createSolutionGroupProhibitedPointOfSales() {
        return new SolutionGroup.ProhibitedPointOfSales();
    }

    /**
     * Create an instance of {@link AirSegmentList }
     * 
     * @return
     *     the new instance of {@link AirSegmentList }
     */
    public AirSegmentList createAirSegmentList() {
        return new AirSegmentList();
    }

    /**
     * Create an instance of {@link AirScheduleChangedInfo }
     * 
     * @return
     *     the new instance of {@link AirScheduleChangedInfo }
     */
    public AirScheduleChangedInfo createAirScheduleChangedInfo() {
        return new AirScheduleChangedInfo();
    }

    /**
     * Create an instance of {@link AirPricingSolution }
     * 
     * @return
     *     the new instance of {@link AirPricingSolution }
     */
    public AirPricingSolution createAirPricingSolution() {
        return new AirPricingSolution();
    }

    /**
     * Create an instance of {@link Journey }
     * 
     * @return
     *     the new instance of {@link Journey }
     */
    public Journey createJourney() {
        return new Journey();
    }

    /**
     * Create an instance of {@link LegRef }
     * 
     * @return
     *     the new instance of {@link LegRef }
     */
    public LegRef createLegRef() {
        return new LegRef();
    }

    /**
     * Create an instance of {@link FareNoteRef }
     * 
     * @return
     *     the new instance of {@link FareNoteRef }
     */
    public FareNoteRef createFareNoteRef() {
        return new FareNoteRef();
    }

    /**
     * Create an instance of {@link MetaData }
     * 
     * @return
     *     the new instance of {@link MetaData }
     */
    public MetaData createMetaData() {
        return new MetaData();
    }

    /**
     * Create an instance of {@link TypeResultMessage }
     * 
     * @return
     *     the new instance of {@link TypeResultMessage }
     */
    public TypeResultMessage createTypeResultMessage() {
        return new TypeResultMessage();
    }

    /**
     * Create an instance of {@link AirItinerarySolutionRef }
     * 
     * @return
     *     the new instance of {@link AirItinerarySolutionRef }
     */
    public AirItinerarySolutionRef createAirItinerarySolutionRef() {
        return new AirItinerarySolutionRef();
    }

    /**
     * Create an instance of {@link HostToken }
     * 
     * @return
     *     the new instance of {@link HostToken }
     */
    public HostToken createHostToken() {
        return new HostToken();
    }

    /**
     * Create an instance of {@link AvailableSSR }
     * 
     * @return
     *     the new instance of {@link AvailableSSR }
     */
    public AvailableSSR createAvailableSSR() {
        return new AvailableSSR();
    }

    /**
     * Create an instance of {@link SSR }
     * 
     * @return
     *     the new instance of {@link SSR }
     */
    public SSR createSSR() {
        return new SSR();
    }

    /**
     * Create an instance of {@link IndustryStandardSSR }
     * 
     * @return
     *     the new instance of {@link IndustryStandardSSR }
     */
    public IndustryStandardSSR createIndustryStandardSSR() {
        return new IndustryStandardSSR();
    }

    /**
     * Create an instance of {@link PricingDetails }
     * 
     * @return
     *     the new instance of {@link PricingDetails }
     */
    public PricingDetails createPricingDetails() {
        return new PricingDetails();
    }

    /**
     * Create an instance of {@link AirSolutionChangedInfo }
     * 
     * @return
     *     the new instance of {@link AirSolutionChangedInfo }
     */
    public AirSolutionChangedInfo createAirSolutionChangedInfo() {
        return new AirSolutionChangedInfo();
    }

    /**
     * Create an instance of {@link AirPriceResult }
     * 
     * @return
     *     the new instance of {@link AirPriceResult }
     */
    public AirPriceResult createAirPriceResult() {
        return new AirPriceResult();
    }

    /**
     * Create an instance of {@link FareRule }
     * 
     * @return
     *     the new instance of {@link FareRule }
     */
    public FareRule createFareRule() {
        return new FareRule();
    }

    /**
     * Create an instance of {@link FareRuleLong }
     * 
     * @return
     *     the new instance of {@link FareRuleLong }
     */
    public FareRuleLong createFareRuleLong() {
        return new FareRuleLong();
    }

    /**
     * Create an instance of {@link FareRuleShort }
     * 
     * @return
     *     the new instance of {@link FareRuleShort }
     */
    public FareRuleShort createFareRuleShort() {
        return new FareRuleShort();
    }

    /**
     * Create an instance of {@link FareRuleNameValue }
     * 
     * @return
     *     the new instance of {@link FareRuleNameValue }
     */
    public FareRuleNameValue createFareRuleNameValue() {
        return new FareRuleNameValue();
    }

    /**
     * Create an instance of {@link RuleAdvancedPurchase }
     * 
     * @return
     *     the new instance of {@link RuleAdvancedPurchase }
     */
    public RuleAdvancedPurchase createRuleAdvancedPurchase() {
        return new RuleAdvancedPurchase();
    }

    /**
     * Create an instance of {@link RuleLengthOfStay }
     * 
     * @return
     *     the new instance of {@link RuleLengthOfStay }
     */
    public RuleLengthOfStay createRuleLengthOfStay() {
        return new RuleLengthOfStay();
    }

    /**
     * Create an instance of {@link TypeRestrictionLengthOfStay }
     * 
     * @return
     *     the new instance of {@link TypeRestrictionLengthOfStay }
     */
    public TypeRestrictionLengthOfStay createTypeRestrictionLengthOfStay() {
        return new TypeRestrictionLengthOfStay();
    }

    /**
     * Create an instance of {@link RuleCharges }
     * 
     * @return
     *     the new instance of {@link RuleCharges }
     */
    public RuleCharges createRuleCharges() {
        return new RuleCharges();
    }

    /**
     * Create an instance of {@link StructuredFareRulesType }
     * 
     * @return
     *     the new instance of {@link StructuredFareRulesType }
     */
    public StructuredFareRulesType createStructuredFareRulesType() {
        return new StructuredFareRulesType();
    }

    /**
     * Create an instance of {@link FareInfoList }
     * 
     * @return
     *     the new instance of {@link FareInfoList }
     */
    public FareInfoList createFareInfoList() {
        return new FareInfoList();
    }

    /**
     * Create an instance of {@link FareRemarkList }
     * 
     * @return
     *     the new instance of {@link FareRemarkList }
     */
    public FareRemarkList createFareRemarkList() {
        return new FareRemarkList();
    }

    /**
     * Create an instance of {@link FareRemark }
     * 
     * @return
     *     the new instance of {@link FareRemark }
     */
    public FareRemark createFareRemark() {
        return new FareRemark();
    }

    /**
     * Create an instance of {@link URL }
     * 
     * @return
     *     the new instance of {@link URL }
     */
    public URL createURL() {
        return new URL();
    }

    /**
     * Create an instance of {@link FlightDetailsList }
     * 
     * @return
     *     the new instance of {@link FlightDetailsList }
     */
    public FlightDetailsList createFlightDetailsList() {
        return new FlightDetailsList();
    }

    /**
     * Create an instance of {@link FlightDetails }
     * 
     * @return
     *     the new instance of {@link FlightDetails }
     */
    public FlightDetails createFlightDetails() {
        return new FlightDetails();
    }

    /**
     * Create an instance of {@link FareNoteList }
     * 
     * @return
     *     the new instance of {@link FareNoteList }
     */
    public FareNoteList createFareNoteList() {
        return new FareNoteList();
    }

    /**
     * Create an instance of {@link HostTokenList }
     * 
     * @return
     *     the new instance of {@link HostTokenList }
     */
    public HostTokenList createHostTokenList() {
        return new HostTokenList();
    }

    /**
     * Create an instance of {@link Rows }
     * 
     * @return
     *     the new instance of {@link Rows }
     */
    public Rows createRows() {
        return new Rows();
    }

    /**
     * Create an instance of {@link Row }
     * 
     * @return
     *     the new instance of {@link Row }
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link Facility }
     * 
     * @return
     *     the new instance of {@link Facility }
     */
    public Facility createFacility() {
        return new Facility();
    }

    /**
     * Create an instance of {@link Characteristic }
     * 
     * @return
     *     the new instance of {@link Characteristic }
     */
    public Characteristic createCharacteristic() {
        return new Characteristic();
    }

    /**
     * Create an instance of {@link PassengerSeatPrice }
     * 
     * @return
     *     the new instance of {@link PassengerSeatPrice }
     */
    public PassengerSeatPrice createPassengerSeatPrice() {
        return new PassengerSeatPrice();
    }

    /**
     * Create an instance of {@link FareDisplay }
     * 
     * @return
     *     the new instance of {@link FareDisplay }
     */
    public FareDisplay createFareDisplay() {
        return new FareDisplay();
    }

    /**
     * Create an instance of {@link FareDisplayRule }
     * 
     * @return
     *     the new instance of {@link FareDisplayRule }
     */
    public FareDisplayRule createFareDisplayRule() {
        return new FareDisplayRule();
    }

    /**
     * Create an instance of {@link FarePricing }
     * 
     * @return
     *     the new instance of {@link FarePricing }
     */
    public FarePricing createFarePricing() {
        return new FarePricing();
    }

    /**
     * Create an instance of {@link FareRestriction }
     * 
     * @return
     *     the new instance of {@link FareRestriction }
     */
    public FareRestriction createFareRestriction() {
        return new FareRestriction();
    }

    /**
     * Create an instance of {@link FareRestrictionDaysOfWeek }
     * 
     * @return
     *     the new instance of {@link FareRestrictionDaysOfWeek }
     */
    public FareRestrictionDaysOfWeek createFareRestrictionDaysOfWeek() {
        return new FareRestrictionDaysOfWeek();
    }

    /**
     * Create an instance of {@link FareRestrictionDate }
     * 
     * @return
     *     the new instance of {@link FareRestrictionDate }
     */
    public FareRestrictionDate createFareRestrictionDate() {
        return new FareRestrictionDate();
    }

    /**
     * Create an instance of {@link FareRestrictionSaleDate }
     * 
     * @return
     *     the new instance of {@link FareRestrictionSaleDate }
     */
    public FareRestrictionSaleDate createFareRestrictionSaleDate() {
        return new FareRestrictionSaleDate();
    }

    /**
     * Create an instance of {@link FareRestrictionSeasonal }
     * 
     * @return
     *     the new instance of {@link FareRestrictionSeasonal }
     */
    public FareRestrictionSeasonal createFareRestrictionSeasonal() {
        return new FareRestrictionSeasonal();
    }

    /**
     * Create an instance of {@link AirFareDisplayRuleKey }
     * 
     * @return
     *     the new instance of {@link AirFareDisplayRuleKey }
     */
    public AirFareDisplayRuleKey createAirFareDisplayRuleKey() {
        return new AirFareDisplayRuleKey();
    }

    /**
     * Create an instance of {@link BookingCode }
     * 
     * @return
     *     the new instance of {@link BookingCode }
     */
    public BookingCode createBookingCode() {
        return new BookingCode();
    }

    /**
     * Create an instance of {@link AddlBookingCodeInformation }
     * 
     * @return
     *     the new instance of {@link AddlBookingCodeInformation }
     */
    public AddlBookingCodeInformation createAddlBookingCodeInformation() {
        return new AddlBookingCodeInformation();
    }

    /**
     * Create an instance of {@link FareRuleLookup }
     * 
     * @return
     *     the new instance of {@link FareRuleLookup }
     */
    public FareRuleLookup createFareRuleLookup() {
        return new FareRuleLookup();
    }

    /**
     * Create an instance of {@link AirExchangeModifiers.ContractCodes }
     * 
     * @return
     *     the new instance of {@link AirExchangeModifiers.ContractCodes }
     */
    public AirExchangeModifiers.ContractCodes createAirExchangeModifiersContractCodes() {
        return new AirExchangeModifiers.ContractCodes();
    }

    /**
     * Create an instance of {@link FlexExploreModifiers }
     * 
     * @return
     *     the new instance of {@link FlexExploreModifiers }
     */
    public FlexExploreModifiers createFlexExploreModifiers() {
        return new FlexExploreModifiers();
    }

    /**
     * Create an instance of {@link AirFareDisplayModifiers }
     * 
     * @return
     *     the new instance of {@link AirFareDisplayModifiers }
     */
    public AirFareDisplayModifiers createAirFareDisplayModifiers() {
        return new AirFareDisplayModifiers();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.DisfavoredProviders }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.DisfavoredProviders }
     */
    public AirSearchModifiers.DisfavoredProviders createAirSearchModifiersDisfavoredProviders() {
        return new AirSearchModifiers.DisfavoredProviders();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.PreferredProviders }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.PreferredProviders }
     */
    public AirSearchModifiers.PreferredProviders createAirSearchModifiersPreferredProviders() {
        return new AirSearchModifiers.PreferredProviders();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.DisfavoredCarriers }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.DisfavoredCarriers }
     */
    public AirSearchModifiers.DisfavoredCarriers createAirSearchModifiersDisfavoredCarriers() {
        return new AirSearchModifiers.DisfavoredCarriers();
    }

    /**
     * Create an instance of {@link PermittedCarriers }
     * 
     * @return
     *     the new instance of {@link PermittedCarriers }
     */
    public PermittedCarriers createPermittedCarriers() {
        return new PermittedCarriers();
    }

    /**
     * Create an instance of {@link Carrier }
     * 
     * @return
     *     the new instance of {@link Carrier }
     */
    public Carrier createCarrier() {
        return new Carrier();
    }

    /**
     * Create an instance of {@link ProhibitedCarriers }
     * 
     * @return
     *     the new instance of {@link ProhibitedCarriers }
     */
    public ProhibitedCarriers createProhibitedCarriers() {
        return new ProhibitedCarriers();
    }

    /**
     * Create an instance of {@link PreferredCarriers }
     * 
     * @return
     *     the new instance of {@link PreferredCarriers }
     */
    public PreferredCarriers createPreferredCarriers() {
        return new PreferredCarriers();
    }

    /**
     * Create an instance of {@link ProhibitedValidatingCarriers }
     * 
     * @return
     *     the new instance of {@link ProhibitedValidatingCarriers }
     */
    public ProhibitedValidatingCarriers createProhibitedValidatingCarriers() {
        return new ProhibitedValidatingCarriers();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.PreferredAlliances }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.PreferredAlliances }
     */
    public AirSearchModifiers.PreferredAlliances createAirSearchModifiersPreferredAlliances() {
        return new AirSearchModifiers.PreferredAlliances();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.DisfavoredAlliances }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.DisfavoredAlliances }
     */
    public AirSearchModifiers.DisfavoredAlliances createAirSearchModifiersDisfavoredAlliances() {
        return new AirSearchModifiers.DisfavoredAlliances();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.PermittedBookingCodes }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.PermittedBookingCodes }
     */
    public AirSearchModifiers.PermittedBookingCodes createAirSearchModifiersPermittedBookingCodes() {
        return new AirSearchModifiers.PermittedBookingCodes();
    }

    /**
     * Create an instance of {@link PreferredBookingCodes }
     * 
     * @return
     *     the new instance of {@link PreferredBookingCodes }
     */
    public PreferredBookingCodes createPreferredBookingCodes() {
        return new PreferredBookingCodes();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.ProhibitedBookingCodes }
     * 
     * @return
     *     the new instance of {@link AirSearchModifiers.ProhibitedBookingCodes }
     */
    public AirSearchModifiers.ProhibitedBookingCodes createAirSearchModifiersProhibitedBookingCodes() {
        return new AirSearchModifiers.ProhibitedBookingCodes();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     * @return
     *     the new instance of {@link FlightType }
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link MaxLayoverDurationType }
     * 
     * @return
     *     the new instance of {@link MaxLayoverDurationType }
     */
    public MaxLayoverDurationType createMaxLayoverDurationType() {
        return new MaxLayoverDurationType();
    }

    /**
     * Create an instance of {@link TypeNativeSearchModifier }
     * 
     * @return
     *     the new instance of {@link TypeNativeSearchModifier }
     */
    public TypeNativeSearchModifier createTypeNativeSearchModifier() {
        return new TypeNativeSearchModifier();
    }

    /**
     * Create an instance of {@link OfferAvailabilityModifiers }
     * 
     * @return
     *     the new instance of {@link OfferAvailabilityModifiers }
     */
    public OfferAvailabilityModifiers createOfferAvailabilityModifiers() {
        return new OfferAvailabilityModifiers();
    }

    /**
     * Create an instance of {@link Alliance }
     * 
     * @return
     *     the new instance of {@link Alliance }
     */
    public Alliance createAlliance() {
        return new Alliance();
    }

    /**
     * Create an instance of {@link AirSolution }
     * 
     * @return
     *     the new instance of {@link AirSolution }
     */
    public AirSolution createAirSolution() {
        return new AirSolution();
    }

    /**
     * Create an instance of {@link SearchTraveler }
     * 
     * @return
     *     the new instance of {@link SearchTraveler }
     */
    public SearchTraveler createSearchTraveler() {
        return new SearchTraveler();
    }

    /**
     * Create an instance of {@link AirSeatAssignment }
     * 
     * @return
     *     the new instance of {@link AirSeatAssignment }
     */
    public AirSeatAssignment createAirSeatAssignment() {
        return new AirSeatAssignment();
    }

    /**
     * Create an instance of {@link SeatAssignment }
     * 
     * @return
     *     the new instance of {@link SeatAssignment }
     */
    public SeatAssignment createSeatAssignment() {
        return new SeatAssignment();
    }

    /**
     * Create an instance of {@link FareBasis }
     * 
     * @return
     *     the new instance of {@link FareBasis }
     */
    public FareBasis createFareBasis() {
        return new FareBasis();
    }

    /**
     * Create an instance of {@link HostReservation }
     * 
     * @return
     *     the new instance of {@link HostReservation }
     */
    public HostReservation createHostReservation() {
        return new HostReservation();
    }

    /**
     * Create an instance of {@link AirPricePointList }
     * 
     * @return
     *     the new instance of {@link AirPricePointList }
     */
    public AirPricePointList createAirPricePointList() {
        return new AirPricePointList();
    }

    /**
     * Create an instance of {@link AirPricePoint }
     * 
     * @return
     *     the new instance of {@link AirPricePoint }
     */
    public AirPricePoint createAirPricePoint() {
        return new AirPricePoint();
    }

    /**
     * Create an instance of {@link AirItinerarySolution }
     * 
     * @return
     *     the new instance of {@link AirItinerarySolution }
     */
    public AirItinerarySolution createAirItinerarySolution() {
        return new AirItinerarySolution();
    }

    /**
     * Create an instance of {@link AirItinerary }
     * 
     * @return
     *     the new instance of {@link AirItinerary }
     */
    public AirItinerary createAirItinerary() {
        return new AirItinerary();
    }

    /**
     * Create an instance of {@link APISRequirements }
     * 
     * @return
     *     the new instance of {@link APISRequirements }
     */
    public APISRequirements createAPISRequirements() {
        return new APISRequirements();
    }

    /**
     * Create an instance of {@link Document }
     * 
     * @return
     *     the new instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ETR }
     * 
     * @return
     *     the new instance of {@link ETR }
     */
    public ETR createETR() {
        return new ETR();
    }

    /**
     * Create an instance of {@link AirReservationLocatorCode }
     * 
     * @return
     *     the new instance of {@link AirReservationLocatorCode }
     */
    public AirReservationLocatorCode createAirReservationLocatorCode() {
        return new AirReservationLocatorCode();
    }

    /**
     * Create an instance of {@link AgencyInfo }
     * 
     * @return
     *     the new instance of {@link AgencyInfo }
     */
    public AgencyInfo createAgencyInfo() {
        return new AgencyInfo();
    }

    /**
     * Create an instance of {@link AgentAction }
     * 
     * @return
     *     the new instance of {@link AgentAction }
     */
    public AgentAction createAgentAction() {
        return new AgentAction();
    }

    /**
     * Create an instance of {@link BookingTraveler }
     * 
     * @return
     *     the new instance of {@link BookingTraveler }
     */
    public BookingTraveler createBookingTraveler() {
        return new BookingTraveler();
    }

    /**
     * Create an instance of {@link BookingTravelerName }
     * 
     * @return
     *     the new instance of {@link BookingTravelerName }
     */
    public BookingTravelerName createBookingTravelerName() {
        return new BookingTravelerName();
    }

    /**
     * Create an instance of {@link DeliveryInfo.ShippingAddress }
     * 
     * @return
     *     the new instance of {@link DeliveryInfo.ShippingAddress }
     */
    public DeliveryInfo.ShippingAddress createDeliveryInfoShippingAddress() {
        return new DeliveryInfo.ShippingAddress();
    }

    /**
     * Create an instance of {@link Email }
     * 
     * @return
     *     the new instance of {@link Email }
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link NameRemark }
     * 
     * @return
     *     the new instance of {@link NameRemark }
     */
    public NameRemark createNameRemark() {
        return new NameRemark();
    }

    /**
     * Create an instance of {@link RailSeatAssignment }
     * 
     * @return
     *     the new instance of {@link RailSeatAssignment }
     */
    public RailSeatAssignment createRailSeatAssignment() {
        return new RailSeatAssignment();
    }

    /**
     * Create an instance of {@link Characteristic2 }
     * 
     * @return
     *     the new instance of {@link Characteristic2 }
     */
    public Characteristic2 createCharacteristic2() {
        return new Characteristic2();
    }

    /**
     * Create an instance of {@link DriversLicense }
     * 
     * @return
     *     the new instance of {@link DriversLicense }
     */
    public DriversLicense createDriversLicense() {
        return new DriversLicense();
    }

    /**
     * Create an instance of {@link AppliedProfile }
     * 
     * @return
     *     the new instance of {@link AppliedProfile }
     */
    public AppliedProfile createAppliedProfile() {
        return new AppliedProfile();
    }

    /**
     * Create an instance of {@link CustomizedNameData }
     * 
     * @return
     *     the new instance of {@link CustomizedNameData }
     */
    public CustomizedNameData createCustomizedNameData() {
        return new CustomizedNameData();
    }

    /**
     * Create an instance of {@link TravelComplianceData.PolicyCompliance }
     * 
     * @return
     *     the new instance of {@link TravelComplianceData.PolicyCompliance }
     */
    public TravelComplianceData.PolicyCompliance createTravelComplianceDataPolicyCompliance() {
        return new TravelComplianceData.PolicyCompliance();
    }

    /**
     * Create an instance of {@link TravelComplianceData.ContractCompliance }
     * 
     * @return
     *     the new instance of {@link TravelComplianceData.ContractCompliance }
     */
    public TravelComplianceData.ContractCompliance createTravelComplianceDataContractCompliance() {
        return new TravelComplianceData.ContractCompliance();
    }

    /**
     * Create an instance of {@link TravelComplianceData.PreferredSupplier }
     * 
     * @return
     *     the new instance of {@link TravelComplianceData.PreferredSupplier }
     */
    public TravelComplianceData.PreferredSupplier createTravelComplianceDataPreferredSupplier() {
        return new TravelComplianceData.PreferredSupplier();
    }

    /**
     * Create an instance of {@link TravelInfo }
     * 
     * @return
     *     the new instance of {@link TravelInfo }
     */
    public TravelInfo createTravelInfo() {
        return new TravelInfo();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     * @return
     *     the new instance of {@link Ticket }
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Coupon }
     * 
     * @return
     *     the new instance of {@link Coupon }
     */
    public Coupon createCoupon() {
        return new Coupon();
    }

    /**
     * Create an instance of {@link TicketDesignator }
     * 
     * @return
     *     the new instance of {@link TicketDesignator }
     */
    public TicketDesignator createTicketDesignator() {
        return new TicketDesignator();
    }

    /**
     * Create an instance of {@link AuditData }
     * 
     * @return
     *     the new instance of {@link AuditData }
     */
    public AuditData createAuditData() {
        return new AuditData();
    }

    /**
     * Create an instance of {@link TicketFailureInfo }
     * 
     * @return
     *     the new instance of {@link TicketFailureInfo }
     */
    public TicketFailureInfo createTicketFailureInfo() {
        return new TicketFailureInfo();
    }

    /**
     * Create an instance of {@link RefundFailureInfo }
     * 
     * @return
     *     the new instance of {@link RefundFailureInfo }
     */
    public RefundFailureInfo createRefundFailureInfo() {
        return new RefundFailureInfo();
    }

    /**
     * Create an instance of {@link VoidFailureInfo }
     * 
     * @return
     *     the new instance of {@link VoidFailureInfo }
     */
    public VoidFailureInfo createVoidFailureInfo() {
        return new VoidFailureInfo();
    }

    /**
     * Create an instance of {@link TCR }
     * 
     * @return
     *     the new instance of {@link TCR }
     */
    public TCR createTCR() {
        return new TCR();
    }

    /**
     * Create an instance of {@link PassengerTicketNumber }
     * 
     * @return
     *     the new instance of {@link PassengerTicketNumber }
     */
    public PassengerTicketNumber createPassengerTicketNumber() {
        return new PassengerTicketNumber();
    }

    /**
     * Create an instance of {@link RefundRemark }
     * 
     * @return
     *     the new instance of {@link RefundRemark }
     */
    public RefundRemark createRefundRemark() {
        return new RefundRemark();
    }

    /**
     * Create an instance of {@link AirFareDiscount }
     * 
     * @return
     *     the new instance of {@link AirFareDiscount }
     */
    public AirFareDiscount createAirFareDiscount() {
        return new AirFareDiscount();
    }

    /**
     * Create an instance of {@link SearchAirLeg }
     * 
     * @return
     *     the new instance of {@link SearchAirLeg }
     */
    public SearchAirLeg createSearchAirLeg() {
        return new SearchAirLeg();
    }

    /**
     * Create an instance of {@link TypeSearchLocation }
     * 
     * @return
     *     the new instance of {@link TypeSearchLocation }
     */
    public TypeSearchLocation createTypeSearchLocation() {
        return new TypeSearchLocation();
    }

    /**
     * Create an instance of {@link TypeTimeSpec }
     * 
     * @return
     *     the new instance of {@link TypeTimeSpec }
     */
    public TypeTimeSpec createTypeTimeSpec() {
        return new TypeTimeSpec();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PermittedConnectionPoints }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.PermittedConnectionPoints }
     */
    public AirLegModifiers.PermittedConnectionPoints createAirLegModifiersPermittedConnectionPoints() {
        return new AirLegModifiers.PermittedConnectionPoints();
    }

    /**
     * Create an instance of {@link AirLegModifiers.ProhibitedConnectionPoints }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.ProhibitedConnectionPoints }
     */
    public AirLegModifiers.ProhibitedConnectionPoints createAirLegModifiersProhibitedConnectionPoints() {
        return new AirLegModifiers.ProhibitedConnectionPoints();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PreferredConnectionPoints }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.PreferredConnectionPoints }
     */
    public AirLegModifiers.PreferredConnectionPoints createAirLegModifiersPreferredConnectionPoints() {
        return new AirLegModifiers.PreferredConnectionPoints();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PermittedBookingCodes }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.PermittedBookingCodes }
     */
    public AirLegModifiers.PermittedBookingCodes createAirLegModifiersPermittedBookingCodes() {
        return new AirLegModifiers.PermittedBookingCodes();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PreferredAlliances }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.PreferredAlliances }
     */
    public AirLegModifiers.PreferredAlliances createAirLegModifiersPreferredAlliances() {
        return new AirLegModifiers.PreferredAlliances();
    }

    /**
     * Create an instance of {@link AirLegModifiers.ProhibitedBookingCodes }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.ProhibitedBookingCodes }
     */
    public AirLegModifiers.ProhibitedBookingCodes createAirLegModifiersProhibitedBookingCodes() {
        return new AirLegModifiers.ProhibitedBookingCodes();
    }

    /**
     * Create an instance of {@link AirLegModifiers.DisfavoredAlliances }
     * 
     * @return
     *     the new instance of {@link AirLegModifiers.DisfavoredAlliances }
     */
    public AirLegModifiers.DisfavoredAlliances createAirLegModifiersDisfavoredAlliances() {
        return new AirLegModifiers.DisfavoredAlliances();
    }

    /**
     * Create an instance of {@link TypeAnchorFlightData }
     * 
     * @return
     *     the new instance of {@link TypeAnchorFlightData }
     */
    public TypeAnchorFlightData createTypeAnchorFlightData() {
        return new TypeAnchorFlightData();
    }

    /**
     * Create an instance of {@link AirRefundBundle }
     * 
     * @return
     *     the new instance of {@link AirRefundBundle }
     */
    public AirRefundBundle createAirRefundBundle() {
        return new AirRefundBundle();
    }

    /**
     * Create an instance of {@link AirRefundInfo }
     * 
     * @return
     *     the new instance of {@link AirRefundInfo }
     */
    public AirRefundInfo createAirRefundInfo() {
        return new AirRefundInfo();
    }

    /**
     * Create an instance of {@link TCRRefundBundle }
     * 
     * @return
     *     the new instance of {@link TCRRefundBundle }
     */
    public TCRRefundBundle createTCRRefundBundle() {
        return new TCRRefundBundle();
    }

    /**
     * Create an instance of {@link AirRefundModifiers }
     * 
     * @return
     *     the new instance of {@link AirRefundModifiers }
     */
    public AirRefundModifiers createAirRefundModifiers() {
        return new AirRefundModifiers();
    }

    /**
     * Create an instance of {@link AutoSeatAssignment }
     * 
     * @return
     *     the new instance of {@link AutoSeatAssignment }
     */
    public AutoSeatAssignment createAutoSeatAssignment() {
        return new AutoSeatAssignment();
    }

    /**
     * Create an instance of {@link RouteList }
     * 
     * @return
     *     the new instance of {@link RouteList }
     */
    public RouteList createRouteList() {
        return new RouteList();
    }

    /**
     * Create an instance of {@link Route }
     * 
     * @return
     *     the new instance of {@link Route }
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     * @return
     *     the new instance of {@link Leg }
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link LegDetail }
     * 
     * @return
     *     the new instance of {@link LegDetail }
     */
    public LegDetail createLegDetail() {
        return new LegDetail();
    }

    /**
     * Create an instance of {@link AlternateRouteList }
     * 
     * @return
     *     the new instance of {@link AlternateRouteList }
     */
    public AlternateRouteList createAlternateRouteList() {
        return new AlternateRouteList();
    }

    /**
     * Create an instance of {@link AlternateRoute }
     * 
     * @return
     *     the new instance of {@link AlternateRoute }
     */
    public AlternateRoute createAlternateRoute() {
        return new AlternateRoute();
    }

    /**
     * Create an instance of {@link AlternateLocationDistanceList }
     * 
     * @return
     *     the new instance of {@link AlternateLocationDistanceList }
     */
    public AlternateLocationDistanceList createAlternateLocationDistanceList() {
        return new AlternateLocationDistanceList();
    }

    /**
     * Create an instance of {@link AlternateLocationDistance }
     * 
     * @return
     *     the new instance of {@link AlternateLocationDistance }
     */
    public AlternateLocationDistance createAlternateLocationDistance() {
        return new AlternateLocationDistance();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     * @return
     *     the new instance of {@link Distance }
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link ExpertSolutionList }
     * 
     * @return
     *     the new instance of {@link ExpertSolutionList }
     */
    public ExpertSolutionList createExpertSolutionList() {
        return new ExpertSolutionList();
    }

    /**
     * Create an instance of {@link ExpertSolution }
     * 
     * @return
     *     the new instance of {@link ExpertSolution }
     */
    public ExpertSolution createExpertSolution() {
        return new ExpertSolution();
    }

    /**
     * Create an instance of {@link LegPrice }
     * 
     * @return
     *     the new instance of {@link LegPrice }
     */
    public LegPrice createLegPrice() {
        return new LegPrice();
    }

    /**
     * Create an instance of {@link FareInfoMessage }
     * 
     * @return
     *     the new instance of {@link FareInfoMessage }
     */
    public FareInfoMessage createFareInfoMessage() {
        return new FareInfoMessage();
    }

    /**
     * Create an instance of {@link FareRuleShortRef }
     * 
     * @return
     *     the new instance of {@link FareRuleShortRef }
     */
    public FareRuleShortRef createFareRuleShortRef() {
        return new FareRuleShortRef();
    }

    /**
     * Create an instance of {@link FareRuleLongRef }
     * 
     * @return
     *     the new instance of {@link FareRuleLongRef }
     */
    public FareRuleLongRef createFareRuleLongRef() {
        return new FareRuleLongRef();
    }

    /**
     * Create an instance of {@link BrandInfo }
     * 
     * @return
     *     the new instance of {@link BrandInfo }
     */
    public BrandInfo createBrandInfo() {
        return new BrandInfo();
    }

    /**
     * Create an instance of {@link SeatInformation.Rating }
     * 
     * @return
     *     the new instance of {@link SeatInformation.Rating }
     */
    public SeatInformation.Rating createSeatInformationRating() {
        return new SeatInformation.Rating();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     * @return
     *     the new instance of {@link FareType }
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link FlightDetailsRef }
     * 
     * @return
     *     the new instance of {@link FlightDetailsRef }
     */
    public FlightDetailsRef createFlightDetailsRef() {
        return new FlightDetailsRef();
    }

    /**
     * Create an instance of {@link AlternateLocationDistanceRef }
     * 
     * @return
     *     the new instance of {@link AlternateLocationDistanceRef }
     */
    public AlternateLocationDistanceRef createAlternateLocationDistanceRef() {
        return new AlternateLocationDistanceRef();
    }

    /**
     * Create an instance of {@link SpecificSeatAssignment }
     * 
     * @return
     *     the new instance of {@link SpecificSeatAssignment }
     */
    public SpecificSeatAssignment createSpecificSeatAssignment() {
        return new SpecificSeatAssignment();
    }

    /**
     * Create an instance of {@link AirSearchAsynchModifiers.InitialAsynchResult }
     * 
     * @return
     *     the new instance of {@link AirSearchAsynchModifiers.InitialAsynchResult }
     */
    public AirSearchAsynchModifiers.InitialAsynchResult createAirSearchAsynchModifiersInitialAsynchResult() {
        return new AirSearchAsynchModifiers.InitialAsynchResult();
    }

    /**
     * Create an instance of {@link FareRuleCategory }
     * 
     * @return
     *     the new instance of {@link FareRuleCategory }
     */
    public FareRuleCategory createFareRuleCategory() {
        return new FareRuleCategory();
    }

    /**
     * Create an instance of {@link BookingCodeInfo }
     * 
     * @return
     *     the new instance of {@link BookingCodeInfo }
     */
    public BookingCodeInfo createBookingCodeInfo() {
        return new BookingCodeInfo();
    }

    /**
     * Create an instance of {@link AirAvailInfo.FareTokenInfo }
     * 
     * @return
     *     the new instance of {@link AirAvailInfo.FareTokenInfo }
     */
    public AirAvailInfo.FareTokenInfo createAirAvailInfoFareTokenInfo() {
        return new AirAvailInfo.FareTokenInfo();
    }

    /**
     * Create an instance of {@link SponsoredFltInfo }
     * 
     * @return
     *     the new instance of {@link SponsoredFltInfo }
     */
    public SponsoredFltInfo createSponsoredFltInfo() {
        return new SponsoredFltInfo();
    }

    /**
     * Create an instance of {@link CodeshareInfo }
     * 
     * @return
     *     the new instance of {@link CodeshareInfo }
     */
    public CodeshareInfo createCodeshareInfo() {
        return new CodeshareInfo();
    }

    /**
     * Create an instance of {@link PromoCode }
     * 
     * @return
     *     the new instance of {@link PromoCode }
     */
    public PromoCode createPromoCode() {
        return new PromoCode();
    }

    /**
     * Create an instance of {@link ProhibitedCabins }
     * 
     * @return
     *     the new instance of {@link ProhibitedCabins }
     */
    public ProhibitedCabins createProhibitedCabins() {
        return new ProhibitedCabins();
    }

    /**
     * Create an instance of {@link AirPricingPayment }
     * 
     * @return
     *     the new instance of {@link AirPricingPayment }
     */
    public AirPricingPayment createAirPricingPayment() {
        return new AirPricingPayment();
    }

    /**
     * Create an instance of {@link AirFareRulesModifier }
     * 
     * @return
     *     the new instance of {@link AirFareRulesModifier }
     */
    public AirFareRulesModifier createAirFareRulesModifier() {
        return new AirFareRulesModifier();
    }

    /**
     * Create an instance of {@link AirFareRuleCategory }
     * 
     * @return
     *     the new instance of {@link AirFareRuleCategory }
     */
    public AirFareRuleCategory createAirFareRuleCategory() {
        return new AirFareRuleCategory();
    }

    /**
     * Create an instance of {@link AirPricingTicketingModifiers }
     * 
     * @return
     *     the new instance of {@link AirPricingTicketingModifiers }
     */
    public AirPricingTicketingModifiers createAirPricingTicketingModifiers() {
        return new AirPricingTicketingModifiers();
    }

    /**
     * Create an instance of {@link OptionalServicesInfo }
     * 
     * @return
     *     the new instance of {@link OptionalServicesInfo }
     */
    public OptionalServicesInfo createOptionalServicesInfo() {
        return new OptionalServicesInfo();
    }

    /**
     * Create an instance of {@link IncludeAddlBookingCodeInfo }
     * 
     * @return
     *     the new instance of {@link IncludeAddlBookingCodeInfo }
     */
    public IncludeAddlBookingCodeInfo createIncludeAddlBookingCodeInfo() {
        return new IncludeAddlBookingCodeInfo();
    }

    /**
     * Create an instance of {@link FaxDetailsInformation }
     * 
     * @return
     *     the new instance of {@link FaxDetailsInformation }
     */
    public FaxDetailsInformation createFaxDetailsInformation() {
        return new FaxDetailsInformation();
    }

    /**
     * Create an instance of {@link FaxDetails }
     * 
     * @return
     *     the new instance of {@link FaxDetails }
     */
    public FaxDetails createFaxDetails() {
        return new FaxDetails();
    }

    /**
     * Create an instance of {@link TermConditions }
     * 
     * @return
     *     the new instance of {@link TermConditions }
     */
    public TermConditions createTermConditions() {
        return new TermConditions();
    }

    /**
     * Create an instance of {@link DetailedBillingInformation }
     * 
     * @return
     *     the new instance of {@link DetailedBillingInformation }
     */
    public DetailedBillingInformation createDetailedBillingInformation() {
        return new DetailedBillingInformation();
    }

    /**
     * Create an instance of {@link BillingDetailItem }
     * 
     * @return
     *     the new instance of {@link BillingDetailItem }
     */
    public BillingDetailItem createBillingDetailItem() {
        return new BillingDetailItem();
    }

    /**
     * Create an instance of {@link AirPricingAdjustment }
     * 
     * @return
     *     the new instance of {@link AirPricingAdjustment }
     */
    public AirPricingAdjustment createAirPricingAdjustment() {
        return new AirPricingAdjustment();
    }

    /**
     * Create an instance of {@link APISRequirementsList }
     * 
     * @return
     *     the new instance of {@link APISRequirementsList }
     */
    public APISRequirementsList createAPISRequirementsList() {
        return new APISRequirementsList();
    }

    /**
     * Create an instance of {@link Variance }
     * 
     * @return
     *     the new instance of {@link Variance }
     */
    public Variance createVariance() {
        return new Variance();
    }

    /**
     * Create an instance of {@link FlightInfo }
     * 
     * @return
     *     the new instance of {@link FlightInfo }
     */
    public FlightInfo createFlightInfo() {
        return new FlightInfo();
    }

    /**
     * Create an instance of {@link FlightInfoDetail }
     * 
     * @return
     *     the new instance of {@link FlightInfoDetail }
     */
    public FlightInfoDetail createFlightInfoDetail() {
        return new FlightInfoDetail();
    }

    /**
     * Create an instance of {@link FlightInfoCriteria }
     * 
     * @return
     *     the new instance of {@link FlightInfoCriteria }
     */
    public FlightInfoCriteria createFlightInfoCriteria() {
        return new FlightInfoCriteria();
    }

    /**
     * Create an instance of {@link FlightTimeTableCriteria }
     * 
     * @return
     *     the new instance of {@link FlightTimeTableCriteria }
     */
    public FlightTimeTableCriteria createFlightTimeTableCriteria() {
        return new FlightTimeTableCriteria();
    }

    /**
     * Create an instance of {@link GeneralTimeTable }
     * 
     * @return
     *     the new instance of {@link GeneralTimeTable }
     */
    public GeneralTimeTable createGeneralTimeTable() {
        return new GeneralTimeTable();
    }

    /**
     * Create an instance of {@link TypeDaysOfOperation }
     * 
     * @return
     *     the new instance of {@link TypeDaysOfOperation }
     */
    public TypeDaysOfOperation createTypeDaysOfOperation() {
        return new TypeDaysOfOperation();
    }

    /**
     * Create an instance of {@link TypeLocation }
     * 
     * @return
     *     the new instance of {@link TypeLocation }
     */
    public TypeLocation createTypeLocation() {
        return new TypeLocation();
    }

    /**
     * Create an instance of {@link CarrierList }
     * 
     * @return
     *     the new instance of {@link CarrierList }
     */
    public CarrierList createCarrierList() {
        return new CarrierList();
    }

    /**
     * Create an instance of {@link CarrierCode }
     * 
     * @return
     *     the new instance of {@link CarrierCode }
     */
    public CarrierCode createCarrierCode() {
        return new CarrierCode();
    }

    /**
     * Create an instance of {@link SpecificTimeTable.FlightOrigin }
     * 
     * @return
     *     the new instance of {@link SpecificTimeTable.FlightOrigin }
     */
    public SpecificTimeTable.FlightOrigin createSpecificTimeTableFlightOrigin() {
        return new SpecificTimeTable.FlightOrigin();
    }

    /**
     * Create an instance of {@link SpecificTimeTable.FlightDestination }
     * 
     * @return
     *     the new instance of {@link SpecificTimeTable.FlightDestination }
     */
    public SpecificTimeTable.FlightDestination createSpecificTimeTableFlightDestination() {
        return new SpecificTimeTable.FlightDestination();
    }

    /**
     * Create an instance of {@link FlightTimeDetail }
     * 
     * @return
     *     the new instance of {@link FlightTimeDetail }
     */
    public FlightTimeDetail createFlightTimeDetail() {
        return new FlightTimeDetail();
    }

    /**
     * Create an instance of {@link AirSegmentError }
     * 
     * @return
     *     the new instance of {@link AirSegmentError }
     */
    public AirSegmentError createAirSegmentError() {
        return new AirSegmentError();
    }

    /**
     * Create an instance of {@link AirSegmentSellFailureInfo }
     * 
     * @return
     *     the new instance of {@link AirSegmentSellFailureInfo }
     */
    public AirSegmentSellFailureInfo createAirSegmentSellFailureInfo() {
        return new AirSegmentSellFailureInfo();
    }

    /**
     * Create an instance of {@link PrePayProfileInfo }
     * 
     * @return
     *     the new instance of {@link PrePayProfileInfo }
     */
    public PrePayProfileInfo createPrePayProfileInfo() {
        return new PrePayProfileInfo();
    }

    /**
     * Create an instance of {@link PrePayId }
     * 
     * @return
     *     the new instance of {@link PrePayId }
     */
    public PrePayId createPrePayId() {
        return new PrePayId();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     * @return
     *     the new instance of {@link CompanyName }
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link PrePayCustomer }
     * 
     * @return
     *     the new instance of {@link PrePayCustomer }
     */
    public PrePayCustomer createPrePayCustomer() {
        return new PrePayCustomer();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     * @return
     *     the new instance of {@link PersonName }
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link RelatedTraveler.CreditsUsed }
     * 
     * @return
     *     the new instance of {@link RelatedTraveler.CreditsUsed }
     */
    public RelatedTraveler.CreditsUsed createRelatedTravelerCreditsUsed() {
        return new RelatedTraveler.CreditsUsed();
    }

    /**
     * Create an instance of {@link PrePayAccount }
     * 
     * @return
     *     the new instance of {@link PrePayAccount }
     */
    public PrePayAccount createPrePayAccount() {
        return new PrePayAccount();
    }

    /**
     * Create an instance of {@link CreditSummary }
     * 
     * @return
     *     the new instance of {@link CreditSummary }
     */
    public CreditSummary createCreditSummary() {
        return new CreditSummary();
    }

    /**
     * Create an instance of {@link PrePayPriceInfo }
     * 
     * @return
     *     the new instance of {@link PrePayPriceInfo }
     */
    public PrePayPriceInfo createPrePayPriceInfo() {
        return new PrePayPriceInfo();
    }

    /**
     * Create an instance of {@link Affiliations }
     * 
     * @return
     *     the new instance of {@link Affiliations }
     */
    public Affiliations createAffiliations() {
        return new Affiliations();
    }

    /**
     * Create an instance of {@link TravelArranger }
     * 
     * @return
     *     the new instance of {@link TravelArranger }
     */
    public TravelArranger createTravelArranger() {
        return new TravelArranger();
    }

    /**
     * Create an instance of {@link AccountRelatedRules }
     * 
     * @return
     *     the new instance of {@link AccountRelatedRules }
     */
    public AccountRelatedRules createAccountRelatedRules() {
        return new AccountRelatedRules();
    }

    /**
     * Create an instance of {@link BookingRulesFareReference }
     * 
     * @return
     *     the new instance of {@link BookingRulesFareReference }
     */
    public BookingRulesFareReference createBookingRulesFareReference() {
        return new BookingRulesFareReference();
    }

    /**
     * Create an instance of {@link BookingRules.RuleInfo }
     * 
     * @return
     *     the new instance of {@link BookingRules.RuleInfo }
     */
    public BookingRules.RuleInfo createBookingRulesRuleInfo() {
        return new BookingRules.RuleInfo();
    }

    /**
     * Create an instance of {@link Restriction2 .DaysOfWeekRestriction }
     * 
     * @return
     *     the new instance of {@link Restriction2 .DaysOfWeekRestriction }
     */
    public Restriction2 .DaysOfWeekRestriction createRestriction2DaysOfWeekRestriction() {
        return new Restriction2 .DaysOfWeekRestriction();
    }

    /**
     * Create an instance of {@link Restriction2 .RestrictionPassengerTypes }
     * 
     * @return
     *     the new instance of {@link Restriction2 .RestrictionPassengerTypes }
     */
    public Restriction2 .RestrictionPassengerTypes createRestriction2RestrictionPassengerTypes() {
        return new Restriction2 .RestrictionPassengerTypes();
    }

    /**
     * Create an instance of {@link DocumentRequired }
     * 
     * @return
     *     the new instance of {@link DocumentRequired }
     */
    public DocumentRequired createDocumentRequired() {
        return new DocumentRequired();
    }

    /**
     * Create an instance of {@link CustomerSearch }
     * 
     * @return
     *     the new instance of {@link CustomerSearch }
     */
    public CustomerSearch createCustomerSearch() {
        return new CustomerSearch();
    }

    /**
     * Create an instance of {@link PersonNameSearch }
     * 
     * @return
     *     the new instance of {@link PersonNameSearch }
     */
    public PersonNameSearch createPersonNameSearch() {
        return new PersonNameSearch();
    }

    /**
     * Create an instance of {@link ChargesRules.VoluntaryChanges }
     * 
     * @return
     *     the new instance of {@link ChargesRules.VoluntaryChanges }
     */
    public ChargesRules.VoluntaryChanges createChargesRulesVoluntaryChanges() {
        return new ChargesRules.VoluntaryChanges();
    }

    /**
     * Create an instance of {@link ChargesRules.VoluntaryRefunds }
     * 
     * @return
     *     the new instance of {@link ChargesRules.VoluntaryRefunds }
     */
    public ChargesRules.VoluntaryRefunds createChargesRulesVoluntaryRefunds() {
        return new ChargesRules.VoluntaryRefunds();
    }

    /**
     * Create an instance of {@link Penalty2 }
     * 
     * @return
     *     the new instance of {@link Penalty2 }
     */
    public Penalty2 createPenalty2() {
        return new Penalty2();
    }

    /**
     * Create an instance of {@link AvailabilityErrorInfo }
     * 
     * @return
     *     the new instance of {@link AvailabilityErrorInfo }
     */
    public AvailabilityErrorInfo createAvailabilityErrorInfo() {
        return new AvailabilityErrorInfo();
    }

    /**
     * Create an instance of {@link TypeErrorInfo }
     * 
     * @return
     *     the new instance of {@link TypeErrorInfo }
     */
    public TypeErrorInfo createTypeErrorInfo() {
        return new TypeErrorInfo();
    }

    /**
     * Create an instance of {@link Auxdata.Entry }
     * 
     * @return
     *     the new instance of {@link Auxdata.Entry }
     */
    public Auxdata.Entry createAuxdataEntry() {
        return new Auxdata.Entry();
    }

    /**
     * Create an instance of {@link AirTicketingModifiers }
     * 
     * @return
     *     the new instance of {@link AirTicketingModifiers }
     */
    public AirTicketingModifiers createAirTicketingModifiers() {
        return new AirTicketingModifiers();
    }

    /**
     * Create an instance of {@link DocumentModifiers }
     * 
     * @return
     *     the new instance of {@link DocumentModifiers }
     */
    public DocumentModifiers createDocumentModifiers() {
        return new DocumentModifiers();
    }

    /**
     * Create an instance of {@link VoidResultInfo }
     * 
     * @return
     *     the new instance of {@link VoidResultInfo }
     */
    public VoidResultInfo createVoidResultInfo() {
        return new VoidResultInfo();
    }

    /**
     * Create an instance of {@link VoidDocumentInfo }
     * 
     * @return
     *     the new instance of {@link VoidDocumentInfo }
     */
    public VoidDocumentInfo createVoidDocumentInfo() {
        return new VoidDocumentInfo();
    }

    /**
     * Create an instance of {@link AutoPricingInfo }
     * 
     * @return
     *     the new instance of {@link AutoPricingInfo }
     */
    public AutoPricingInfo createAutoPricingInfo() {
        return new AutoPricingInfo();
    }

    /**
     * Create an instance of {@link RailCoachDetails }
     * 
     * @return
     *     the new instance of {@link RailCoachDetails }
     */
    public RailCoachDetails createRailCoachDetails() {
        return new RailCoachDetails();
    }

    /**
     * Create an instance of {@link EMDInfo }
     * 
     * @return
     *     the new instance of {@link EMDInfo }
     */
    public EMDInfo createEMDInfo() {
        return new EMDInfo();
    }

    /**
     * Create an instance of {@link EMDTravelerInfo.NameInfo }
     * 
     * @return
     *     the new instance of {@link EMDTravelerInfo.NameInfo }
     */
    public EMDTravelerInfo.NameInfo createEMDTravelerInfoNameInfo() {
        return new EMDTravelerInfo.NameInfo();
    }

    /**
     * Create an instance of {@link ElectronicMiscDocument }
     * 
     * @return
     *     the new instance of {@link ElectronicMiscDocument }
     */
    public ElectronicMiscDocument createElectronicMiscDocument() {
        return new ElectronicMiscDocument();
    }

    /**
     * Create an instance of {@link EMDCoupon }
     * 
     * @return
     *     the new instance of {@link EMDCoupon }
     */
    public EMDCoupon createEMDCoupon() {
        return new EMDCoupon();
    }

    /**
     * Create an instance of {@link EMDPricingInfo }
     * 
     * @return
     *     the new instance of {@link EMDPricingInfo }
     */
    public EMDPricingInfo createEMDPricingInfo() {
        return new EMDPricingInfo();
    }

    /**
     * Create an instance of {@link EMDCommission }
     * 
     * @return
     *     the new instance of {@link EMDCommission }
     */
    public EMDCommission createEMDCommission() {
        return new EMDCommission();
    }

    /**
     * Create an instance of {@link EMDSummaryInfo }
     * 
     * @return
     *     the new instance of {@link EMDSummaryInfo }
     */
    public EMDSummaryInfo createEMDSummaryInfo() {
        return new EMDSummaryInfo();
    }

    /**
     * Create an instance of {@link EMDSummary }
     * 
     * @return
     *     the new instance of {@link EMDSummary }
     */
    public EMDSummary createEMDSummary() {
        return new EMDSummary();
    }

    /**
     * Create an instance of {@link IssuanceModifiers }
     * 
     * @return
     *     the new instance of {@link IssuanceModifiers }
     */
    public IssuanceModifiers createIssuanceModifiers() {
        return new IssuanceModifiers();
    }

    /**
     * Create an instance of {@link CustomerReceiptInfo }
     * 
     * @return
     *     the new instance of {@link CustomerReceiptInfo }
     */
    public CustomerReceiptInfo createCustomerReceiptInfo() {
        return new CustomerReceiptInfo();
    }

    /**
     * Create an instance of {@link SelectionModifiers }
     * 
     * @return
     *     the new instance of {@link SelectionModifiers }
     */
    public SelectionModifiers createSelectionModifiers() {
        return new SelectionModifiers();
    }

    /**
     * Create an instance of {@link MerchandisingDetails }
     * 
     * @return
     *     the new instance of {@link MerchandisingDetails }
     */
    public MerchandisingDetails createMerchandisingDetails() {
        return new MerchandisingDetails();
    }

    /**
     * Create an instance of {@link AirItineraryDetails }
     * 
     * @return
     *     the new instance of {@link AirItineraryDetails }
     */
    public AirItineraryDetails createAirItineraryDetails() {
        return new AirItineraryDetails();
    }

    /**
     * Create an instance of {@link AirSegmentDetails }
     * 
     * @return
     *     the new instance of {@link AirSegmentDetails }
     */
    public AirSegmentDetails createAirSegmentDetails() {
        return new AirSegmentDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRef }
     * 
     * @return
     *     the new instance of {@link PassengerDetailsRef }
     */
    public PassengerDetailsRef createPassengerDetailsRef() {
        return new PassengerDetailsRef();
    }

    /**
     * Create an instance of {@link BrandID }
     * 
     * @return
     *     the new instance of {@link BrandID }
     */
    public BrandID createBrandID() {
        return new BrandID();
    }

    /**
     * Create an instance of {@link PassengerDetails }
     * 
     * @return
     *     the new instance of {@link PassengerDetails }
     */
    public PassengerDetails createPassengerDetails() {
        return new PassengerDetails();
    }

    /**
     * Create an instance of {@link LoyaltyCardDetails }
     * 
     * @return
     *     the new instance of {@link LoyaltyCardDetails }
     */
    public LoyaltyCardDetails createLoyaltyCardDetails() {
        return new LoyaltyCardDetails();
    }

    /**
     * Create an instance of {@link MerchandisingAvailabilityDetails }
     * 
     * @return
     *     the new instance of {@link MerchandisingAvailabilityDetails }
     */
    public MerchandisingAvailabilityDetails createMerchandisingAvailabilityDetails() {
        return new MerchandisingAvailabilityDetails();
    }

    /**
     * Create an instance of {@link FareDetailsRef }
     * 
     * @return
     *     the new instance of {@link FareDetailsRef }
     */
    public FareDetailsRef createFareDetailsRef() {
        return new FareDetailsRef();
    }

    /**
     * Create an instance of {@link FareDetails }
     * 
     * @return
     *     the new instance of {@link FareDetails }
     */
    public FareDetails createFareDetails() {
        return new FareDetails();
    }

    /**
     * Create an instance of {@link OptionalServiceModifiers }
     * 
     * @return
     *     the new instance of {@link OptionalServiceModifiers }
     */
    public OptionalServiceModifiers createOptionalServiceModifiers() {
        return new OptionalServiceModifiers();
    }

    /**
     * Create an instance of {@link OptionalServiceModifier }
     * 
     * @return
     *     the new instance of {@link OptionalServiceModifier }
     */
    public OptionalServiceModifier createOptionalServiceModifier() {
        return new OptionalServiceModifier();
    }

    /**
     * Create an instance of {@link JourneyData }
     * 
     * @return
     *     the new instance of {@link JourneyData }
     */
    public JourneyData createJourneyData() {
        return new JourneyData();
    }

    /**
     * Create an instance of {@link PCC }
     * 
     * @return
     *     the new instance of {@link PCC }
     */
    public PCC createPCC() {
        return new PCC();
    }

    /**
     * Create an instance of {@link OverridePCC }
     * 
     * @return
     *     the new instance of {@link OverridePCC }
     */
    public OverridePCC createOverridePCC() {
        return new OverridePCC();
    }

    /**
     * Create an instance of {@link TicketAgency }
     * 
     * @return
     *     the new instance of {@link TicketAgency }
     */
    public TicketAgency createTicketAgency() {
        return new TicketAgency();
    }

    /**
     * Create an instance of {@link RepricingModifiers.OverrideCurrency }
     * 
     * @return
     *     the new instance of {@link RepricingModifiers.OverrideCurrency }
     */
    public RepricingModifiers.OverrideCurrency createRepricingModifiersOverrideCurrency() {
        return new RepricingModifiers.OverrideCurrency();
    }

    /**
     * Create an instance of {@link OriginalItineraryDetails }
     * 
     * @return
     *     the new instance of {@link OriginalItineraryDetails }
     */
    public OriginalItineraryDetails createOriginalItineraryDetails() {
        return new OriginalItineraryDetails();
    }

    /**
     * Create an instance of {@link com.example.app.flightproviderb.flightdetails.FareRulesFilterCategory }
     * 
     * @return
     *     the new instance of {@link com.example.app.flightproviderb.flightdetails.FareRulesFilterCategory }
     */
    public com.example.app.flightproviderb.flightdetails.FareRulesFilterCategory createFareRulesFilterCategory() {
        return new com.example.app.flightproviderb.flightdetails.FareRulesFilterCategory();
    }

    /**
     * Create an instance of {@link MerchandisingPricingModifiers }
     * 
     * @return
     *     the new instance of {@link MerchandisingPricingModifiers }
     */
    public MerchandisingPricingModifiers createMerchandisingPricingModifiers() {
        return new MerchandisingPricingModifiers();
    }

    /**
     * Create an instance of {@link Embargo }
     * 
     * @return
     *     the new instance of {@link Embargo }
     */
    public Embargo createEmbargo() {
        return new Embargo();
    }

    /**
     * Create an instance of {@link EmbargoList }
     * 
     * @return
     *     the new instance of {@link EmbargoList }
     */
    public EmbargoList createEmbargoList() {
        return new EmbargoList();
    }

    /**
     * Create an instance of {@link CO2Emissions }
     * 
     * @return
     *     the new instance of {@link CO2Emissions }
     */
    public CO2Emissions createCO2Emissions() {
        return new CO2Emissions();
    }

    /**
     * Create an instance of {@link CO2Emission }
     * 
     * @return
     *     the new instance of {@link CO2Emission }
     */
    public CO2Emission createCO2Emission() {
        return new CO2Emission();
    }

    /**
     * Create an instance of {@link SplitTicketingSearch }
     * 
     * @return
     *     the new instance of {@link SplitTicketingSearch }
     */
    public SplitTicketingSearch createSplitTicketingSearch() {
        return new SplitTicketingSearch();
    }

    /**
     * Create an instance of {@link ExchangeEligibilityInfo }
     * 
     * @return
     *     the new instance of {@link ExchangeEligibilityInfo }
     */
    public ExchangeEligibilityInfo createExchangeEligibilityInfo() {
        return new ExchangeEligibilityInfo();
    }

    /**
     * Create an instance of {@link ExchangePenaltyInfo }
     * 
     * @return
     *     the new instance of {@link ExchangePenaltyInfo }
     */
    public ExchangePenaltyInfo createExchangePenaltyInfo() {
        return new ExchangePenaltyInfo();
    }

    /**
     * Create an instance of {@link PenaltyInformation }
     * 
     * @return
     *     the new instance of {@link PenaltyInformation }
     */
    public PenaltyInformation createPenaltyInformation() {
        return new PenaltyInformation();
    }

    /**
     * Create an instance of {@link AirSegmentTicketingModifiers }
     * 
     * @return
     *     the new instance of {@link AirSegmentTicketingModifiers }
     */
    public AirSegmentTicketingModifiers createAirSegmentTicketingModifiers() {
        return new AirSegmentTicketingModifiers();
    }

    /**
     * Create an instance of {@link AirExchangeMulitQuoteList }
     * 
     * @return
     *     the new instance of {@link AirExchangeMulitQuoteList }
     */
    public AirExchangeMulitQuoteList createAirExchangeMulitQuoteList() {
        return new AirExchangeMulitQuoteList();
    }

    /**
     * Create an instance of {@link AirExchangeMultiQuoteOption }
     * 
     * @return
     *     the new instance of {@link AirExchangeMultiQuoteOption }
     */
    public AirExchangeMultiQuoteOption createAirExchangeMultiQuoteOption() {
        return new AirExchangeMultiQuoteOption();
    }

    /**
     * Create an instance of {@link AirSegmentData }
     * 
     * @return
     *     the new instance of {@link AirSegmentData }
     */
    public AirSegmentData createAirSegmentData() {
        return new AirSegmentData();
    }

    /**
     * Create an instance of {@link AirExchangeBundleList }
     * 
     * @return
     *     the new instance of {@link AirExchangeBundleList }
     */
    public AirExchangeBundleList createAirExchangeBundleList() {
        return new AirExchangeBundleList();
    }

    /**
     * Create an instance of {@link InvoluntaryChange }
     * 
     * @return
     *     the new instance of {@link InvoluntaryChange }
     */
    public InvoluntaryChange createInvoluntaryChange() {
        return new InvoluntaryChange();
    }

    /**
     * Create an instance of {@link AmenitiesRef }
     * 
     * @return
     *     the new instance of {@link AmenitiesRef }
     */
    public AmenitiesRef createAmenitiesRef() {
        return new AmenitiesRef();
    }

    /**
     * Create an instance of {@link AirPriceReq }
     * 
     * @return
     *     the new instance of {@link AirPriceReq }
     */
    public AirPriceReq createAirPriceReq() {
        return new AirPriceReq();
    }

    /**
     * Create an instance of {@link BaseAirPriceReq }
     * 
     * @return
     *     the new instance of {@link BaseAirPriceReq }
     */
    public BaseAirPriceReq createBaseAirPriceReq() {
        return new BaseAirPriceReq();
    }

    /**
     * Create an instance of {@link BaseCoreReq }
     * 
     * @return
     *     the new instance of {@link BaseCoreReq }
     */
    public BaseCoreReq createBaseCoreReq() {
        return new BaseCoreReq();
    }

    /**
     * Create an instance of {@link BillingPointOfSaleInfo }
     * 
     * @return
     *     the new instance of {@link BillingPointOfSaleInfo }
     */
    public BillingPointOfSaleInfo createBillingPointOfSaleInfo() {
        return new BillingPointOfSaleInfo();
    }

    /**
     * Create an instance of {@link AgentIDOverride }
     * 
     * @return
     *     the new instance of {@link AgentIDOverride }
     */
    public AgentIDOverride createAgentIDOverride() {
        return new AgentIDOverride();
    }

    /**
     * Create an instance of {@link SearchPassenger }
     * 
     * @return
     *     the new instance of {@link SearchPassenger }
     */
    public SearchPassenger createSearchPassenger() {
        return new SearchPassenger();
    }

    /**
     * Create an instance of {@link AirPriceRsp }
     * 
     * @return
     *     the new instance of {@link AirPriceRsp }
     */
    public AirPriceRsp createAirPriceRsp() {
        return new AirPriceRsp();
    }

    /**
     * Create an instance of {@link BaseAirPriceRsp }
     * 
     * @return
     *     the new instance of {@link BaseAirPriceRsp }
     */
    public BaseAirPriceRsp createBaseAirPriceRsp() {
        return new BaseAirPriceRsp();
    }

    /**
     * Create an instance of {@link BaseRsp }
     * 
     * @return
     *     the new instance of {@link BaseRsp }
     */
    public BaseRsp createBaseRsp() {
        return new BaseRsp();
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     * @return
     *     the new instance of {@link ResponseMessage }
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link AirRepriceReq }
     * 
     * @return
     *     the new instance of {@link AirRepriceReq }
     */
    public AirRepriceReq createAirRepriceReq() {
        return new AirRepriceReq();
    }

    /**
     * Create an instance of {@link AirBaseReq }
     * 
     * @return
     *     the new instance of {@link AirBaseReq }
     */
    public AirBaseReq createAirBaseReq() {
        return new AirBaseReq();
    }

    /**
     * Create an instance of {@link BaseReq }
     * 
     * @return
     *     the new instance of {@link BaseReq }
     */
    public BaseReq createBaseReq() {
        return new BaseReq();
    }

    /**
     * Create an instance of {@link AirRepriceRsp }
     * 
     * @return
     *     the new instance of {@link AirRepriceRsp }
     */
    public AirRepriceRsp createAirRepriceRsp() {
        return new AirRepriceRsp();
    }

    /**
     * Create an instance of {@link AirTicketingReq.AirPricingInfoRef }
     * 
     * @return
     *     the new instance of {@link AirTicketingReq.AirPricingInfoRef }
     */
    public AirTicketingReq.AirPricingInfoRef createAirTicketingReqAirPricingInfoRef() {
        return new AirTicketingReq.AirPricingInfoRef();
    }

    /**
     * Create an instance of {@link TypeTicketingModifiersRef }
     * 
     * @return
     *     the new instance of {@link TypeTicketingModifiersRef }
     */
    public TypeTicketingModifiersRef createTypeTicketingModifiersRef() {
        return new TypeTicketingModifiersRef();
    }

    /**
     * Create an instance of {@link AirTicketingRsp }
     * 
     * @return
     *     the new instance of {@link AirTicketingRsp }
     */
    public AirTicketingRsp createAirTicketingRsp() {
        return new AirTicketingRsp();
    }

    /**
     * Create an instance of {@link AirExchangeQuoteReq }
     * 
     * @return
     *     the new instance of {@link AirExchangeQuoteReq }
     */
    public AirExchangeQuoteReq createAirExchangeQuoteReq() {
        return new AirExchangeQuoteReq();
    }

    /**
     * Create an instance of {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     * 
     * @return
     *     the new instance of {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     */
    public BaseAirExchangeQuoteReq.ProviderReservationInfo createBaseAirExchangeQuoteReqProviderReservationInfo() {
        return new BaseAirExchangeQuoteReq.ProviderReservationInfo();
    }

    /**
     * Create an instance of {@link AirExchangeQuoteRsp }
     * 
     * @return
     *     the new instance of {@link AirExchangeQuoteRsp }
     */
    public AirExchangeQuoteRsp createAirExchangeQuoteRsp() {
        return new AirExchangeQuoteRsp();
    }

    /**
     * Create an instance of {@link AirExchangeReq }
     * 
     * @return
     *     the new instance of {@link AirExchangeReq }
     */
    public AirExchangeReq createAirExchangeReq() {
        return new AirExchangeReq();
    }

    /**
     * Create an instance of {@link SSRInfo }
     * 
     * @return
     *     the new instance of {@link SSRInfo }
     */
    public SSRInfo createSSRInfo() {
        return new SSRInfo();
    }

    /**
     * Create an instance of {@link AddSvc }
     * 
     * @return
     *     the new instance of {@link AddSvc }
     */
    public AddSvc createAddSvc() {
        return new AddSvc();
    }

    /**
     * Create an instance of {@link AirExchangeRsp }
     * 
     * @return
     *     the new instance of {@link AirExchangeRsp }
     */
    public AirExchangeRsp createAirExchangeRsp() {
        return new AirExchangeRsp();
    }

    /**
     * Create an instance of {@link TypeAirReservationWithFOP }
     * 
     * @return
     *     the new instance of {@link TypeAirReservationWithFOP }
     */
    public TypeAirReservationWithFOP createTypeAirReservationWithFOP() {
        return new TypeAirReservationWithFOP();
    }

    /**
     * Create an instance of {@link TypeTicketFailureInfo }
     * 
     * @return
     *     the new instance of {@link TypeTicketFailureInfo }
     */
    public TypeTicketFailureInfo createTypeTicketFailureInfo() {
        return new TypeTicketFailureInfo();
    }

    /**
     * Create an instance of {@link AirExchangeTicketingReq }
     * 
     * @return
     *     the new instance of {@link AirExchangeTicketingReq }
     */
    public AirExchangeTicketingReq createAirExchangeTicketingReq() {
        return new AirExchangeTicketingReq();
    }

    /**
     * Create an instance of {@link AirExchangeTicketingRsp }
     * 
     * @return
     *     the new instance of {@link AirExchangeTicketingRsp }
     */
    public AirExchangeTicketingRsp createAirExchangeTicketingRsp() {
        return new AirExchangeTicketingRsp();
    }

    /**
     * Create an instance of {@link AirRefundQuoteReq.ProviderReservationInfo }
     * 
     * @return
     *     the new instance of {@link AirRefundQuoteReq.ProviderReservationInfo }
     */
    public AirRefundQuoteReq.ProviderReservationInfo createAirRefundQuoteReqProviderReservationInfo() {
        return new AirRefundQuoteReq.ProviderReservationInfo();
    }

    /**
     * Create an instance of {@link AirRefundQuoteRsp }
     * 
     * @return
     *     the new instance of {@link AirRefundQuoteRsp }
     */
    public AirRefundQuoteRsp createAirRefundQuoteRsp() {
        return new AirRefundQuoteRsp();
    }

    /**
     * Create an instance of {@link AirRefundReq }
     * 
     * @return
     *     the new instance of {@link AirRefundReq }
     */
    public AirRefundReq createAirRefundReq() {
        return new AirRefundReq();
    }

    /**
     * Create an instance of {@link AirRefundRsp }
     * 
     * @return
     *     the new instance of {@link AirRefundRsp }
     */
    public AirRefundRsp createAirRefundRsp() {
        return new AirRefundRsp();
    }

    /**
     * Create an instance of {@link AirFareDisplayReq }
     * 
     * @return
     *     the new instance of {@link AirFareDisplayReq }
     */
    public AirFareDisplayReq createAirFareDisplayReq() {
        return new AirFareDisplayReq();
    }

    /**
     * Create an instance of {@link AirFareDisplayRsp }
     * 
     * @return
     *     the new instance of {@link AirFareDisplayRsp }
     */
    public AirFareDisplayRsp createAirFareDisplayRsp() {
        return new AirFareDisplayRsp();
    }

    /**
     * Create an instance of {@link AirFareRulesReq.AirReservationSelector }
     * 
     * @return
     *     the new instance of {@link AirFareRulesReq.AirReservationSelector }
     */
    public AirFareRulesReq.AirReservationSelector createAirFareRulesReqAirReservationSelector() {
        return new AirFareRulesReq.AirReservationSelector();
    }

    /**
     * Create an instance of {@link AirFareRulesReq.FareRulesFilterCategory }
     * 
     * @return
     *     the new instance of {@link AirFareRulesReq.FareRulesFilterCategory }
     */
    public AirFareRulesReq.FareRulesFilterCategory createAirFareRulesReqFareRulesFilterCategory() {
        return new AirFareRulesReq.FareRulesFilterCategory();
    }

    /**
     * Create an instance of {@link AirFareRulesRsp }
     * 
     * @return
     *     the new instance of {@link AirFareRulesRsp }
     */
    public AirFareRulesRsp createAirFareRulesRsp() {
        return new AirFareRulesRsp();
    }

    /**
     * Create an instance of {@link FlightDetailsReq }
     * 
     * @return
     *     the new instance of {@link FlightDetailsReq }
     */
    public FlightDetailsReq createFlightDetailsReq() {
        return new FlightDetailsReq();
    }

    /**
     * Create an instance of {@link FlightDetailsRsp }
     * 
     * @return
     *     the new instance of {@link FlightDetailsRsp }
     */
    public FlightDetailsRsp createFlightDetailsRsp() {
        return new FlightDetailsRsp();
    }

    /**
     * Create an instance of {@link SeatMapReq }
     * 
     * @return
     *     the new instance of {@link SeatMapReq }
     */
    public SeatMapReq createSeatMapReq() {
        return new SeatMapReq();
    }

    /**
     * Create an instance of {@link AgencySellInfo }
     * 
     * @return
     *     the new instance of {@link AgencySellInfo }
     */
    public AgencySellInfo createAgencySellInfo() {
        return new AgencySellInfo();
    }

    /**
     * Create an instance of {@link SeatMapRsp }
     * 
     * @return
     *     the new instance of {@link SeatMapRsp }
     */
    public SeatMapRsp createSeatMapRsp() {
        return new SeatMapRsp();
    }

    /**
     * Create an instance of {@link PaymentRestriction }
     * 
     * @return
     *     the new instance of {@link PaymentRestriction }
     */
    public PaymentRestriction createPaymentRestriction() {
        return new PaymentRestriction();
    }

    /**
     * Create an instance of {@link CardRestriction }
     * 
     * @return
     *     the new instance of {@link CardRestriction }
     */
    public CardRestriction createCardRestriction() {
        return new CardRestriction();
    }

    /**
     * Create an instance of {@link RequiredField }
     * 
     * @return
     *     the new instance of {@link RequiredField }
     */
    public RequiredField createRequiredField() {
        return new RequiredField();
    }

    /**
     * Create an instance of {@link AddressRestriction }
     * 
     * @return
     *     the new instance of {@link AddressRestriction }
     */
    public AddressRestriction createAddressRestriction() {
        return new AddressRestriction();
    }

    /**
     * Create an instance of {@link SearchSpecificAirSegment }
     * 
     * @return
     *     the new instance of {@link SearchSpecificAirSegment }
     */
    public SearchSpecificAirSegment createSearchSpecificAirSegment() {
        return new SearchSpecificAirSegment();
    }

    /**
     * Create an instance of {@link ScheduleSearchReq }
     * 
     * @return
     *     the new instance of {@link ScheduleSearchReq }
     */
    public ScheduleSearchReq createScheduleSearchReq() {
        return new ScheduleSearchReq();
    }

    /**
     * Create an instance of {@link AirSearchReq }
     * 
     * @return
     *     the new instance of {@link AirSearchReq }
     */
    public AirSearchReq createAirSearchReq() {
        return new AirSearchReq();
    }

    /**
     * Create an instance of {@link BaseSearchReq }
     * 
     * @return
     *     the new instance of {@link BaseSearchReq }
     */
    public BaseSearchReq createBaseSearchReq() {
        return new BaseSearchReq();
    }

    /**
     * Create an instance of {@link NextResultReference }
     * 
     * @return
     *     the new instance of {@link NextResultReference }
     */
    public NextResultReference createNextResultReference() {
        return new NextResultReference();
    }

    /**
     * Create an instance of {@link PointOfCommencement }
     * 
     * @return
     *     the new instance of {@link PointOfCommencement }
     */
    public PointOfCommencement createPointOfCommencement() {
        return new PointOfCommencement();
    }

    /**
     * Create an instance of {@link ScheduleSearchRsp }
     * 
     * @return
     *     the new instance of {@link ScheduleSearchRsp }
     */
    public ScheduleSearchRsp createScheduleSearchRsp() {
        return new ScheduleSearchRsp();
    }

    /**
     * Create an instance of {@link AirSearchRsp }
     * 
     * @return
     *     the new instance of {@link AirSearchRsp }
     */
    public AirSearchRsp createAirSearchRsp() {
        return new AirSearchRsp();
    }

    /**
     * Create an instance of {@link BaseAvailabilitySearchRsp }
     * 
     * @return
     *     the new instance of {@link BaseAvailabilitySearchRsp }
     */
    public BaseAvailabilitySearchRsp createBaseAvailabilitySearchRsp() {
        return new BaseAvailabilitySearchRsp();
    }

    /**
     * Create an instance of {@link BaseSearchRsp }
     * 
     * @return
     *     the new instance of {@link BaseSearchRsp }
     */
    public BaseSearchRsp createBaseSearchRsp() {
        return new BaseSearchRsp();
    }

    /**
     * Create an instance of {@link RailSegmentList }
     * 
     * @return
     *     the new instance of {@link RailSegmentList }
     */
    public RailSegmentList createRailSegmentList() {
        return new RailSegmentList();
    }

    /**
     * Create an instance of {@link RailSegment }
     * 
     * @return
     *     the new instance of {@link RailSegment }
     */
    public RailSegment createRailSegment() {
        return new RailSegment();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     * @return
     *     the new instance of {@link Segment }
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link SegmentRemark }
     * 
     * @return
     *     the new instance of {@link SegmentRemark }
     */
    public SegmentRemark createSegmentRemark() {
        return new SegmentRemark();
    }

    /**
     * Create an instance of {@link RailSegmentInfo }
     * 
     * @return
     *     the new instance of {@link RailSegmentInfo }
     */
    public RailSegmentInfo createRailSegmentInfo() {
        return new RailSegmentInfo();
    }

    /**
     * Create an instance of {@link OperatingCompany }
     * 
     * @return
     *     the new instance of {@link OperatingCompany }
     */
    public OperatingCompany createOperatingCompany() {
        return new OperatingCompany();
    }

    /**
     * Create an instance of {@link RailAvailInfo }
     * 
     * @return
     *     the new instance of {@link RailAvailInfo }
     */
    public RailAvailInfo createRailAvailInfo() {
        return new RailAvailInfo();
    }

    /**
     * Create an instance of {@link RailJourneyList }
     * 
     * @return
     *     the new instance of {@link RailJourneyList }
     */
    public RailJourneyList createRailJourneyList() {
        return new RailJourneyList();
    }

    /**
     * Create an instance of {@link RailJourney }
     * 
     * @return
     *     the new instance of {@link RailJourney }
     */
    public RailJourney createRailJourney() {
        return new RailJourney();
    }

    /**
     * Create an instance of {@link RailSegmentRef }
     * 
     * @return
     *     the new instance of {@link RailSegmentRef }
     */
    public RailSegmentRef createRailSegmentRef() {
        return new RailSegmentRef();
    }

    /**
     * Create an instance of {@link JourneyRemark }
     * 
     * @return
     *     the new instance of {@link JourneyRemark }
     */
    public JourneyRemark createJourneyRemark() {
        return new JourneyRemark();
    }

    /**
     * Create an instance of {@link RailFareNoteList }
     * 
     * @return
     *     the new instance of {@link RailFareNoteList }
     */
    public RailFareNoteList createRailFareNoteList() {
        return new RailFareNoteList();
    }

    /**
     * Create an instance of {@link RailFareNote }
     * 
     * @return
     *     the new instance of {@link RailFareNote }
     */
    public RailFareNote createRailFareNote() {
        return new RailFareNote();
    }

    /**
     * Create an instance of {@link RailFareIDList }
     * 
     * @return
     *     the new instance of {@link RailFareIDList }
     */
    public RailFareIDList createRailFareIDList() {
        return new RailFareIDList();
    }

    /**
     * Create an instance of {@link RailFareID }
     * 
     * @return
     *     the new instance of {@link RailFareID }
     */
    public RailFareID createRailFareID() {
        return new RailFareID();
    }

    /**
     * Create an instance of {@link RailFareList }
     * 
     * @return
     *     the new instance of {@link RailFareList }
     */
    public RailFareList createRailFareList() {
        return new RailFareList();
    }

    /**
     * Create an instance of {@link RailFare }
     * 
     * @return
     *     the new instance of {@link RailFare }
     */
    public RailFare createRailFare() {
        return new RailFare();
    }

    /**
     * Create an instance of {@link RailFareNoteRef }
     * 
     * @return
     *     the new instance of {@link RailFareNoteRef }
     */
    public RailFareNoteRef createRailFareNoteRef() {
        return new RailFareNoteRef();
    }

    /**
     * Create an instance of {@link RailFareIDRef }
     * 
     * @return
     *     the new instance of {@link RailFareIDRef }
     */
    public RailFareIDRef createRailFareIDRef() {
        return new RailFareIDRef();
    }

    /**
     * Create an instance of {@link FareValidity }
     * 
     * @return
     *     the new instance of {@link FareValidity }
     */
    public FareValidity createFareValidity() {
        return new FareValidity();
    }

    /**
     * Create an instance of {@link RailFareComponent.Discount }
     * 
     * @return
     *     the new instance of {@link RailFareComponent.Discount }
     */
    public RailFareComponent.Discount createRailFareComponentDiscount() {
        return new RailFareComponent.Discount();
    }

    /**
     * Create an instance of {@link RailPricingSolution }
     * 
     * @return
     *     the new instance of {@link RailPricingSolution }
     */
    public RailPricingSolution createRailPricingSolution() {
        return new RailPricingSolution();
    }

    /**
     * Create an instance of {@link RailJourneyRef }
     * 
     * @return
     *     the new instance of {@link RailJourneyRef }
     */
    public RailJourneyRef createRailJourneyRef() {
        return new RailJourneyRef();
    }

    /**
     * Create an instance of {@link RailPricingInfo }
     * 
     * @return
     *     the new instance of {@link RailPricingInfo }
     */
    public RailPricingInfo createRailPricingInfo() {
        return new RailPricingInfo();
    }

    /**
     * Create an instance of {@link RailFareRef }
     * 
     * @return
     *     the new instance of {@link RailFareRef }
     */
    public RailFareRef createRailFareRef() {
        return new RailFareRef();
    }

    /**
     * Create an instance of {@link RailBookingInfo }
     * 
     * @return
     *     the new instance of {@link RailBookingInfo }
     */
    public RailBookingInfo createRailBookingInfo() {
        return new RailBookingInfo();
    }

    /**
     * Create an instance of {@link AvailabilitySearchReq }
     * 
     * @return
     *     the new instance of {@link AvailabilitySearchReq }
     */
    public AvailabilitySearchReq createAvailabilitySearchReq() {
        return new AvailabilitySearchReq();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRsp }
     * 
     * @return
     *     the new instance of {@link AvailabilitySearchRsp }
     */
    public AvailabilitySearchRsp createAvailabilitySearchRsp() {
        return new AvailabilitySearchRsp();
    }

    /**
     * Create an instance of {@link LowFareSearchReq }
     * 
     * @return
     *     the new instance of {@link LowFareSearchReq }
     */
    public LowFareSearchReq createLowFareSearchReq() {
        return new LowFareSearchReq();
    }

    /**
     * Create an instance of {@link BaseLowFareSearchReq }
     * 
     * @return
     *     the new instance of {@link BaseLowFareSearchReq }
     */
    public BaseLowFareSearchReq createBaseLowFareSearchReq() {
        return new BaseLowFareSearchReq();
    }

    /**
     * Create an instance of {@link BaseAirSearchReq }
     * 
     * @return
     *     the new instance of {@link BaseAirSearchReq }
     */
    public BaseAirSearchReq createBaseAirSearchReq() {
        return new BaseAirSearchReq();
    }

    /**
     * Create an instance of {@link BaseCoreSearchReq }
     * 
     * @return
     *     the new instance of {@link BaseCoreSearchReq }
     */
    public BaseCoreSearchReq createBaseCoreSearchReq() {
        return new BaseCoreSearchReq();
    }

    /**
     * Create an instance of {@link LowFareSearchRsp }
     * 
     * @return
     *     the new instance of {@link LowFareSearchRsp }
     */
    public LowFareSearchRsp createLowFareSearchRsp() {
        return new LowFareSearchRsp();
    }

    /**
     * Create an instance of {@link BrandList }
     * 
     * @return
     *     the new instance of {@link BrandList }
     */
    public BrandList createBrandList() {
        return new BrandList();
    }

    /**
     * Create an instance of {@link AirVoidDocumentReq }
     * 
     * @return
     *     the new instance of {@link AirVoidDocumentReq }
     */
    public AirVoidDocumentReq createAirVoidDocumentReq() {
        return new AirVoidDocumentReq();
    }

    /**
     * Create an instance of {@link AirVoidDocumentRsp }
     * 
     * @return
     *     the new instance of {@link AirVoidDocumentRsp }
     */
    public AirVoidDocumentRsp createAirVoidDocumentRsp() {
        return new AirVoidDocumentRsp();
    }

    /**
     * Create an instance of {@link AirRetrieveDocumentReq }
     * 
     * @return
     *     the new instance of {@link AirRetrieveDocumentReq }
     */
    public AirRetrieveDocumentReq createAirRetrieveDocumentReq() {
        return new AirRetrieveDocumentReq();
    }

    /**
     * Create an instance of {@link AirRetrieveDocumentRsp }
     * 
     * @return
     *     the new instance of {@link AirRetrieveDocumentRsp }
     */
    public AirRetrieveDocumentRsp createAirRetrieveDocumentRsp() {
        return new AirRetrieveDocumentRsp();
    }

    /**
     * Create an instance of {@link MCO }
     * 
     * @return
     *     the new instance of {@link MCO }
     */
    public MCO createMCO() {
        return new MCO();
    }

    /**
     * Create an instance of {@link PassengerInfo }
     * 
     * @return
     *     the new instance of {@link PassengerInfo }
     */
    public PassengerInfo createPassengerInfo() {
        return new PassengerInfo();
    }

    /**
     * Create an instance of {@link MCOExchangeInfo }
     * 
     * @return
     *     the new instance of {@link MCOExchangeInfo }
     */
    public MCOExchangeInfo createMCOExchangeInfo() {
        return new MCOExchangeInfo();
    }

    /**
     * Create an instance of {@link ExchangedCoupon }
     * 
     * @return
     *     the new instance of {@link ExchangedCoupon }
     */
    public ExchangedCoupon createExchangedCoupon() {
        return new ExchangedCoupon();
    }

    /**
     * Create an instance of {@link MCOFeeInfo }
     * 
     * @return
     *     the new instance of {@link MCOFeeInfo }
     */
    public MCOFeeInfo createMCOFeeInfo() {
        return new MCOFeeInfo();
    }

    /**
     * Create an instance of {@link MCORemark }
     * 
     * @return
     *     the new instance of {@link MCORemark }
     */
    public MCORemark createMCORemark() {
        return new MCORemark();
    }

    /**
     * Create an instance of {@link MCOPriceData.Commission }
     * 
     * @return
     *     the new instance of {@link MCOPriceData.Commission }
     */
    public MCOPriceData.Commission createMCOPriceDataCommission() {
        return new MCOPriceData.Commission();
    }

    /**
     * Create an instance of {@link StockControl }
     * 
     * @return
     *     the new instance of {@link StockControl }
     */
    public StockControl createStockControl() {
        return new StockControl();
    }

    /**
     * Create an instance of {@link MCOText }
     * 
     * @return
     *     the new instance of {@link MCOText }
     */
    public MCOText createMCOText() {
        return new MCOText();
    }

    /**
     * Create an instance of {@link TypeFreeFormText }
     * 
     * @return
     *     the new instance of {@link TypeFreeFormText }
     */
    public TypeFreeFormText createTypeFreeFormText() {
        return new TypeFreeFormText();
    }

    /**
     * Create an instance of {@link TypeFailureInfo }
     * 
     * @return
     *     the new instance of {@link TypeFailureInfo }
     */
    public TypeFailureInfo createTypeFailureInfo() {
        return new TypeFailureInfo();
    }

    /**
     * Create an instance of {@link ServiceFeeInfo }
     * 
     * @return
     *     the new instance of {@link ServiceFeeInfo }
     */
    public ServiceFeeInfo createServiceFeeInfo() {
        return new ServiceFeeInfo();
    }

    /**
     * Create an instance of {@link ServiceFeeTaxInfo }
     * 
     * @return
     *     the new instance of {@link ServiceFeeTaxInfo }
     */
    public ServiceFeeTaxInfo createServiceFeeTaxInfo() {
        return new ServiceFeeTaxInfo();
    }

    /**
     * Create an instance of {@link AirMerchandisingOfferAvailabilityReq }
     * 
     * @return
     *     the new instance of {@link AirMerchandisingOfferAvailabilityReq }
     */
    public AirMerchandisingOfferAvailabilityReq createAirMerchandisingOfferAvailabilityReq() {
        return new AirMerchandisingOfferAvailabilityReq();
    }

    /**
     * Create an instance of {@link AirMerchandisingOfferAvailabilityRsp }
     * 
     * @return
     *     the new instance of {@link AirMerchandisingOfferAvailabilityRsp }
     */
    public AirMerchandisingOfferAvailabilityRsp createAirMerchandisingOfferAvailabilityRsp() {
        return new AirMerchandisingOfferAvailabilityRsp();
    }

    /**
     * Create an instance of {@link AirUpsellSearchReq }
     * 
     * @return
     *     the new instance of {@link AirUpsellSearchReq }
     */
    public AirUpsellSearchReq createAirUpsellSearchReq() {
        return new AirUpsellSearchReq();
    }

    /**
     * Create an instance of {@link AirUpsellSearchRsp }
     * 
     * @return
     *     the new instance of {@link AirUpsellSearchRsp }
     */
    public AirUpsellSearchRsp createAirUpsellSearchRsp() {
        return new AirUpsellSearchRsp();
    }

    /**
     * Create an instance of {@link FlightInformationReq }
     * 
     * @return
     *     the new instance of {@link FlightInformationReq }
     */
    public FlightInformationReq createFlightInformationReq() {
        return new FlightInformationReq();
    }

    /**
     * Create an instance of {@link FlightInformationRsp }
     * 
     * @return
     *     the new instance of {@link FlightInformationRsp }
     */
    public FlightInformationRsp createFlightInformationRsp() {
        return new FlightInformationRsp();
    }

    /**
     * Create an instance of {@link FlightTimeTableReq }
     * 
     * @return
     *     the new instance of {@link FlightTimeTableReq }
     */
    public FlightTimeTableReq createFlightTimeTableReq() {
        return new FlightTimeTableReq();
    }

    /**
     * Create an instance of {@link FlightTimeTableRsp.FlightTimeTableList }
     * 
     * @return
     *     the new instance of {@link FlightTimeTableRsp.FlightTimeTableList }
     */
    public FlightTimeTableRsp.FlightTimeTableList createFlightTimeTableRspFlightTimeTableList() {
        return new FlightTimeTableRsp.FlightTimeTableList();
    }

    /**
     * Create an instance of {@link AirPrePayReq.ListSearch }
     * 
     * @return
     *     the new instance of {@link AirPrePayReq.ListSearch }
     */
    public AirPrePayReq.ListSearch createAirPrePayReqListSearch() {
        return new AirPrePayReq.ListSearch();
    }

    /**
     * Create an instance of {@link AirPrePayReq.PrePayRetrieve }
     * 
     * @return
     *     the new instance of {@link AirPrePayReq.PrePayRetrieve }
     */
    public AirPrePayReq.PrePayRetrieve createAirPrePayReqPrePayRetrieve() {
        return new AirPrePayReq.PrePayRetrieve();
    }

    /**
     * Create an instance of {@link AirPrePayRsp }
     * 
     * @return
     *     the new instance of {@link AirPrePayRsp }
     */
    public AirPrePayRsp createAirPrePayRsp() {
        return new AirPrePayRsp();
    }

    /**
     * Create an instance of {@link EMDRetrieveReq.ListRetrieve }
     * 
     * @return
     *     the new instance of {@link EMDRetrieveReq.ListRetrieve }
     */
    public EMDRetrieveReq.ListRetrieve createEMDRetrieveReqListRetrieve() {
        return new EMDRetrieveReq.ListRetrieve();
    }

    /**
     * Create an instance of {@link EMDRetrieveReq.DetailRetrieve }
     * 
     * @return
     *     the new instance of {@link EMDRetrieveReq.DetailRetrieve }
     */
    public EMDRetrieveReq.DetailRetrieve createEMDRetrieveReqDetailRetrieve() {
        return new EMDRetrieveReq.DetailRetrieve();
    }

    /**
     * Create an instance of {@link EMDRetrieveRsp }
     * 
     * @return
     *     the new instance of {@link EMDRetrieveRsp }
     */
    public EMDRetrieveRsp createEMDRetrieveRsp() {
        return new EMDRetrieveRsp();
    }

    /**
     * Create an instance of {@link EMDIssuanceReq }
     * 
     * @return
     *     the new instance of {@link EMDIssuanceReq }
     */
    public EMDIssuanceReq createEMDIssuanceReq() {
        return new EMDIssuanceReq();
    }

    /**
     * Create an instance of {@link TypeProviderReservationDetail }
     * 
     * @return
     *     the new instance of {@link TypeProviderReservationDetail }
     */
    public TypeProviderReservationDetail createTypeProviderReservationDetail() {
        return new TypeProviderReservationDetail();
    }

    /**
     * Create an instance of {@link EMDIssuanceRsp }
     * 
     * @return
     *     the new instance of {@link EMDIssuanceRsp }
     */
    public EMDIssuanceRsp createEMDIssuanceRsp() {
        return new EMDIssuanceRsp();
    }

    /**
     * Create an instance of {@link AirMerchandisingDetailsReq }
     * 
     * @return
     *     the new instance of {@link AirMerchandisingDetailsReq }
     */
    public AirMerchandisingDetailsReq createAirMerchandisingDetailsReq() {
        return new AirMerchandisingDetailsReq();
    }

    /**
     * Create an instance of {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     * 
     * @return
     *     the new instance of {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     */
    public AirMerchandisingDetailsRsp.UnassociatedBookingCodeList createAirMerchandisingDetailsRspUnassociatedBookingCodeList() {
        return new AirMerchandisingDetailsRsp.UnassociatedBookingCodeList();
    }

    /**
     * Create an instance of {@link AirExchangeEligibilityReq.ProviderReservationInfo }
     * 
     * @return
     *     the new instance of {@link AirExchangeEligibilityReq.ProviderReservationInfo }
     */
    public AirExchangeEligibilityReq.ProviderReservationInfo createAirExchangeEligibilityReqProviderReservationInfo() {
        return new AirExchangeEligibilityReq.ProviderReservationInfo();
    }

    /**
     * Create an instance of {@link AirExchangeEligibilityRsp }
     * 
     * @return
     *     the new instance of {@link AirExchangeEligibilityRsp }
     */
    public AirExchangeEligibilityRsp createAirExchangeEligibilityRsp() {
        return new AirExchangeEligibilityRsp();
    }

    /**
     * Create an instance of {@link AirExchangeMultiQuoteReq }
     * 
     * @return
     *     the new instance of {@link AirExchangeMultiQuoteReq }
     */
    public AirExchangeMultiQuoteReq createAirExchangeMultiQuoteReq() {
        return new AirExchangeMultiQuoteReq();
    }

    /**
     * Create an instance of {@link BaseAirExchangeMultiQuoteReq.ProviderReservationInfo }
     * 
     * @return
     *     the new instance of {@link BaseAirExchangeMultiQuoteReq.ProviderReservationInfo }
     */
    public BaseAirExchangeMultiQuoteReq.ProviderReservationInfo createBaseAirExchangeMultiQuoteReqProviderReservationInfo() {
        return new BaseAirExchangeMultiQuoteReq.ProviderReservationInfo();
    }

    /**
     * Create an instance of {@link AirExchangeMultiQuoteRsp }
     * 
     * @return
     *     the new instance of {@link AirExchangeMultiQuoteRsp }
     */
    public AirExchangeMultiQuoteRsp createAirExchangeMultiQuoteRsp() {
        return new AirExchangeMultiQuoteRsp();
    }

    /**
     * Create an instance of {@link FareRuleCategoryTypes }
     * 
     * @return
     *     the new instance of {@link FareRuleCategoryTypes }
     */
    public FareRuleCategoryTypes createFareRuleCategoryTypes() {
        return new FareRuleCategoryTypes();
    }

    /**
     * Create an instance of {@link ValueDetails }
     * 
     * @return
     *     the new instance of {@link ValueDetails }
     */
    public ValueDetails createValueDetails() {
        return new ValueDetails();
    }

    /**
     * Create an instance of {@link VariableCategoryType }
     * 
     * @return
     *     the new instance of {@link VariableCategoryType }
     */
    public VariableCategoryType createVariableCategoryType() {
        return new VariableCategoryType();
    }

    /**
     * Create an instance of {@link CategoryDetailsType }
     * 
     * @return
     *     the new instance of {@link CategoryDetailsType }
     */
    public CategoryDetailsType createCategoryDetailsType() {
        return new CategoryDetailsType();
    }

    /**
     * Create an instance of {@link TypeTicketModifierPercentType }
     * 
     * @return
     *     the new instance of {@link TypeTicketModifierPercentType }
     */
    public TypeTicketModifierPercentType createTypeTicketModifierPercentType() {
        return new TypeTicketModifierPercentType();
    }

    /**
     * Create an instance of {@link PenFeeType }
     * 
     * @return
     *     the new instance of {@link PenFeeType }
     */
    public PenFeeType createPenFeeType() {
        return new PenFeeType();
    }

    /**
     * Create an instance of {@link TypeRestrictionData }
     * 
     * @return
     *     the new instance of {@link TypeRestrictionData }
     */
    public TypeRestrictionData createTypeRestrictionData() {
        return new TypeRestrictionData();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     * @return
     *     the new instance of {@link Airport }
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link Location }
     * 
     * @return
     *     the new instance of {@link Location }
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link VendorLocation }
     * 
     * @return
     *     the new instance of {@link VendorLocation }
     */
    public VendorLocation createVendorLocation() {
        return new VendorLocation();
    }

    /**
     * Create an instance of {@link TypeVendorLocation }
     * 
     * @return
     *     the new instance of {@link TypeVendorLocation }
     */
    public TypeVendorLocation createTypeVendorLocation() {
        return new TypeVendorLocation();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     * @return
     *     the new instance of {@link Provider }
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link City }
     * 
     * @return
     *     the new instance of {@link City }
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link CityOrAirport }
     * 
     * @return
     *     the new instance of {@link CityOrAirport }
     */
    public CityOrAirport createCityOrAirport() {
        return new CityOrAirport();
    }

    /**
     * Create an instance of {@link CoordinateLocation }
     * 
     * @return
     *     the new instance of {@link CoordinateLocation }
     */
    public CoordinateLocation createCoordinateLocation() {
        return new CoordinateLocation();
    }

    /**
     * Create an instance of {@link RailLocation }
     * 
     * @return
     *     the new instance of {@link RailLocation }
     */
    public RailLocation createRailLocation() {
        return new RailLocation();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     * @return
     *     the new instance of {@link Credentials }
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link MealRequest }
     * 
     * @return
     *     the new instance of {@link MealRequest }
     */
    public MealRequest createMealRequest() {
        return new MealRequest();
    }

    /**
     * Create an instance of {@link ProviderARNKSegment.PreviousSegment }
     * 
     * @return
     *     the new instance of {@link ProviderARNKSegment.PreviousSegment }
     */
    public ProviderARNKSegment.PreviousSegment createProviderARNKSegmentPreviousSegment() {
        return new ProviderARNKSegment.PreviousSegment();
    }

    /**
     * Create an instance of {@link ProviderARNKSegment.NextSegment }
     * 
     * @return
     *     the new instance of {@link ProviderARNKSegment.NextSegment }
     */
    public ProviderARNKSegment.NextSegment createProviderARNKSegmentNextSegment() {
        return new ProviderARNKSegment.NextSegment();
    }

    /**
     * Create an instance of {@link State }
     * 
     * @return
     *     the new instance of {@link State }
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link CommissionRemark.ProviderReservationLevel }
     * 
     * @return
     *     the new instance of {@link CommissionRemark.ProviderReservationLevel }
     */
    public CommissionRemark.ProviderReservationLevel createCommissionRemarkProviderReservationLevel() {
        return new CommissionRemark.ProviderReservationLevel();
    }

    /**
     * Create an instance of {@link CommissionRemark.PassengerTypeLevel }
     * 
     * @return
     *     the new instance of {@link CommissionRemark.PassengerTypeLevel }
     */
    public CommissionRemark.PassengerTypeLevel createCommissionRemarkPassengerTypeLevel() {
        return new CommissionRemark.PassengerTypeLevel();
    }

    /**
     * Create an instance of {@link XMLRemark }
     * 
     * @return
     *     the new instance of {@link XMLRemark }
     */
    public XMLRemark createXMLRemark() {
        return new XMLRemark();
    }

    /**
     * Create an instance of {@link HostTokenList2 }
     * 
     * @return
     *     the new instance of {@link HostTokenList2 }
     */
    public HostTokenList2 createHostTokenList2() {
        return new HostTokenList2();
    }

    /**
     * Create an instance of {@link AirSearchParameters }
     * 
     * @return
     *     the new instance of {@link AirSearchParameters }
     */
    public AirSearchParameters createAirSearchParameters() {
        return new AirSearchParameters();
    }

    /**
     * Create an instance of {@link ActionStatus }
     * 
     * @return
     *     the new instance of {@link ActionStatus }
     */
    public ActionStatus createActionStatus() {
        return new ActionStatus();
    }

    /**
     * Create an instance of {@link OperatedBy }
     * 
     * @return
     *     the new instance of {@link OperatedBy }
     */
    public OperatedBy createOperatedBy() {
        return new OperatedBy();
    }

    /**
     * Create an instance of {@link TravelerType }
     * 
     * @return
     *     the new instance of {@link TravelerType }
     */
    public TravelerType createTravelerType() {
        return new TravelerType();
    }

    /**
     * Create an instance of {@link UnassociatedRemark }
     * 
     * @return
     *     the new instance of {@link UnassociatedRemark }
     */
    public UnassociatedRemark createUnassociatedRemark() {
        return new UnassociatedRemark();
    }

    /**
     * Create an instance of {@link CustomerID }
     * 
     * @return
     *     the new instance of {@link CustomerID }
     */
    public CustomerID createCustomerID() {
        return new CustomerID();
    }

    /**
     * Create an instance of {@link TypeRemark }
     * 
     * @return
     *     the new instance of {@link TypeRemark }
     */
    public TypeRemark createTypeRemark() {
        return new TypeRemark();
    }

    /**
     * Create an instance of {@link TaxDetail }
     * 
     * @return
     *     the new instance of {@link TaxDetail }
     */
    public TaxDetail createTaxDetail() {
        return new TaxDetail();
    }

    /**
     * Create an instance of {@link RoleInfo }
     * 
     * @return
     *     the new instance of {@link RoleInfo }
     */
    public RoleInfo createRoleInfo() {
        return new RoleInfo();
    }

    /**
     * Create an instance of {@link OSI }
     * 
     * @return
     *     the new instance of {@link OSI }
     */
    public OSI createOSI() {
        return new OSI();
    }

    /**
     * Create an instance of {@link TravelSegment }
     * 
     * @return
     *     the new instance of {@link TravelSegment }
     */
    public TravelSegment createTravelSegment() {
        return new TravelSegment();
    }

    /**
     * Create an instance of {@link SearchEvent }
     * 
     * @return
     *     the new instance of {@link SearchEvent }
     */
    public SearchEvent createSearchEvent() {
        return new SearchEvent();
    }

    /**
     * Create an instance of {@link TypeTimeRange }
     * 
     * @return
     *     the new instance of {@link TypeTimeRange }
     */
    public TypeTimeRange createTypeTimeRange() {
        return new TypeTimeRange();
    }

    /**
     * Create an instance of {@link SearchTicketing }
     * 
     * @return
     *     the new instance of {@link SearchTicketing }
     */
    public SearchTicketing createSearchTicketing() {
        return new SearchTicketing();
    }

    /**
     * Create an instance of {@link SpecialEquipment }
     * 
     * @return
     *     the new instance of {@link SpecialEquipment }
     */
    public SpecialEquipment createSpecialEquipment() {
        return new SpecialEquipment();
    }

    /**
     * Create an instance of {@link ContinuityCheckOverride }
     * 
     * @return
     *     the new instance of {@link ContinuityCheckOverride }
     */
    public ContinuityCheckOverride createContinuityCheckOverride() {
        return new ContinuityCheckOverride();
    }

    /**
     * Create an instance of {@link BookingTravelerInfo }
     * 
     * @return
     *     the new instance of {@link BookingTravelerInfo }
     */
    public BookingTravelerInfo createBookingTravelerInfo() {
        return new BookingTravelerInfo();
    }

    /**
     * Create an instance of {@link BookingSource }
     * 
     * @return
     *     the new instance of {@link BookingSource }
     */
    public BookingSource createBookingSource() {
        return new BookingSource();
    }

    /**
     * Create an instance of {@link Guarantee }
     * 
     * @return
     *     the new instance of {@link Guarantee }
     */
    public Guarantee createGuarantee() {
        return new Guarantee();
    }

    /**
     * Create an instance of {@link OtherGuaranteeInfo }
     * 
     * @return
     *     the new instance of {@link OtherGuaranteeInfo }
     */
    public OtherGuaranteeInfo createOtherGuaranteeInfo() {
        return new OtherGuaranteeInfo();
    }

    /**
     * Create an instance of {@link CorporateDiscountID }
     * 
     * @return
     *     the new instance of {@link CorporateDiscountID }
     */
    public CorporateDiscountID createCorporateDiscountID() {
        return new CorporateDiscountID();
    }

    /**
     * Create an instance of {@link AgencyContactInfo }
     * 
     * @return
     *     the new instance of {@link AgencyContactInfo }
     */
    public AgencyContactInfo createAgencyContactInfo() {
        return new AgencyContactInfo();
    }

    /**
     * Create an instance of {@link LinkedUniversalRecord }
     * 
     * @return
     *     the new instance of {@link LinkedUniversalRecord }
     */
    public LinkedUniversalRecord createLinkedUniversalRecord() {
        return new LinkedUniversalRecord();
    }

    /**
     * Create an instance of {@link MarketingInformation }
     * 
     * @return
     *     the new instance of {@link MarketingInformation }
     */
    public MarketingInformation createMarketingInformation() {
        return new MarketingInformation();
    }

    /**
     * Create an instance of {@link Postscript }
     * 
     * @return
     *     the new instance of {@link Postscript }
     */
    public Postscript createPostscript() {
        return new Postscript();
    }

    /**
     * Create an instance of {@link ShopInformation.SearchRequest }
     * 
     * @return
     *     the new instance of {@link ShopInformation.SearchRequest }
     */
    public ShopInformation.SearchRequest createShopInformationSearchRequest() {
        return new ShopInformation.SearchRequest();
    }

    /**
     * Create an instance of {@link ShopInformation.FlightsOffered }
     * 
     * @return
     *     the new instance of {@link ShopInformation.FlightsOffered }
     */
    public ShopInformation.FlightsOffered createShopInformationFlightsOffered() {
        return new ShopInformation.FlightsOffered();
    }

    /**
     * Create an instance of {@link PolicyInformation.ReasonCode }
     * 
     * @return
     *     the new instance of {@link PolicyInformation.ReasonCode }
     */
    public PolicyInformation.ReasonCode createPolicyInformationReasonCode() {
        return new PolicyInformation.ReasonCode();
    }

    /**
     * Create an instance of {@link AgencyInformation }
     * 
     * @return
     *     the new instance of {@link AgencyInformation }
     */
    public AgencyInformation createAgencyInformation() {
        return new AgencyInformation();
    }

    /**
     * Create an instance of {@link AccountInformation }
     * 
     * @return
     *     the new instance of {@link AccountInformation }
     */
    public AccountInformation createAccountInformation() {
        return new AccountInformation();
    }

    /**
     * Create an instance of {@link TravelerInformation.EmergencyContact }
     * 
     * @return
     *     the new instance of {@link TravelerInformation.EmergencyContact }
     */
    public TravelerInformation.EmergencyContact createTravelerInformationEmergencyContact() {
        return new TravelerInformation.EmergencyContact();
    }

    /**
     * Create an instance of {@link CustomProfileInformation }
     * 
     * @return
     *     the new instance of {@link CustomProfileInformation }
     */
    public CustomProfileInformation createCustomProfileInformation() {
        return new CustomProfileInformation();
    }

    /**
     * Create an instance of {@link FileFinishingInfo }
     * 
     * @return
     *     the new instance of {@link FileFinishingInfo }
     */
    public FileFinishingInfo createFileFinishingInfo() {
        return new FileFinishingInfo();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     * @return
     *     the new instance of {@link Keyword }
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link TypeKeyword }
     * 
     * @return
     *     the new instance of {@link TypeKeyword }
     */
    public TypeKeyword createTypeKeyword() {
        return new TypeKeyword();
    }

    /**
     * Create an instance of {@link TypeSubKey }
     * 
     * @return
     *     the new instance of {@link TypeSubKey }
     */
    public TypeSubKey createTypeSubKey() {
        return new TypeSubKey();
    }

    /**
     * Create an instance of {@link BookingDates }
     * 
     * @return
     *     the new instance of {@link BookingDates }
     */
    public BookingDates createBookingDates() {
        return new BookingDates();
    }

    /**
     * Create an instance of {@link InvoiceRemark }
     * 
     * @return
     *     the new instance of {@link InvoiceRemark }
     */
    public InvoiceRemark createInvoiceRemark() {
        return new InvoiceRemark();
    }

    /**
     * Create an instance of {@link TypeNonAirReservationRef2 }
     * 
     * @return
     *     the new instance of {@link TypeNonAirReservationRef2 }
     */
    public TypeNonAirReservationRef2 createTypeNonAirReservationRef2() {
        return new TypeNonAirReservationRef2();
    }

    /**
     * Create an instance of {@link RequestKeyMappings }
     * 
     * @return
     *     the new instance of {@link RequestKeyMappings }
     */
    public RequestKeyMappings createRequestKeyMappings() {
        return new RequestKeyMappings();
    }

    /**
     * Create an instance of {@link KeyMapping }
     * 
     * @return
     *     the new instance of {@link KeyMapping }
     */
    public KeyMapping createKeyMapping() {
        return new KeyMapping();
    }

    /**
     * Create an instance of {@link ReservationName }
     * 
     * @return
     *     the new instance of {@link ReservationName }
     */
    public ReservationName createReservationName() {
        return new ReservationName();
    }

    /**
     * Create an instance of {@link NameOverride }
     * 
     * @return
     *     the new instance of {@link NameOverride }
     */
    public NameOverride createNameOverride() {
        return new NameOverride();
    }

    /**
     * Create an instance of {@link TransactionType.Air }
     * 
     * @return
     *     the new instance of {@link TransactionType.Air }
     */
    public TransactionType.Air createTransactionTypeAir() {
        return new TransactionType.Air();
    }

    /**
     * Create an instance of {@link TypeTransactionsAllowed }
     * 
     * @return
     *     the new instance of {@link TypeTransactionsAllowed }
     */
    public TypeTransactionsAllowed createTypeTransactionsAllowed() {
        return new TypeTransactionsAllowed();
    }

    /**
     * Create an instance of {@link TypeBookingTransactionsAllowed }
     * 
     * @return
     *     the new instance of {@link TypeBookingTransactionsAllowed }
     */
    public TypeBookingTransactionsAllowed createTypeBookingTransactionsAllowed() {
        return new TypeBookingTransactionsAllowed();
    }

    /**
     * Create an instance of {@link APIProvider.AvailablePseudoCityCode }
     * 
     * @return
     *     the new instance of {@link APIProvider.AvailablePseudoCityCode }
     */
    public APIProvider.AvailablePseudoCityCode createAPIProviderAvailablePseudoCityCode() {
        return new APIProvider.AvailablePseudoCityCode();
    }

    /**
     * Create an instance of {@link PermittedProviders }
     * 
     * @return
     *     the new instance of {@link PermittedProviders }
     */
    public PermittedProviders createPermittedProviders() {
        return new PermittedProviders();
    }

    /**
     * Create an instance of {@link ReviewBooking }
     * 
     * @return
     *     the new instance of {@link ReviewBooking }
     */
    public ReviewBooking createReviewBooking() {
        return new ReviewBooking();
    }

    /**
     * Create an instance of {@link Group.Name }
     * 
     * @return
     *     the new instance of {@link Group.Name }
     */
    public Group.Name createGroupName() {
        return new Group.Name();
    }

    /**
     * Create an instance of {@link Group.SSRRef }
     * 
     * @return
     *     the new instance of {@link Group.SSRRef }
     */
    public Group.SSRRef createGroupSSRRef() {
        return new Group.SSRRef();
    }

    /**
     * Create an instance of {@link Group.BookingTravelerRef }
     * 
     * @return
     *     the new instance of {@link Group.BookingTravelerRef }
     */
    public Group.BookingTravelerRef createGroupBookingTravelerRef() {
        return new Group.BookingTravelerRef();
    }

    /**
     * Create an instance of {@link ConsolidatorRemark }
     * 
     * @return
     *     the new instance of {@link ConsolidatorRemark }
     */
    public ConsolidatorRemark createConsolidatorRemark() {
        return new ConsolidatorRemark();
    }

    /**
     * Create an instance of {@link PseudoCityCode }
     * 
     * @return
     *     the new instance of {@link PseudoCityCode }
     */
    public PseudoCityCode createPseudoCityCode() {
        return new PseudoCityCode();
    }

    /**
     * Create an instance of {@link InvoiceData }
     * 
     * @return
     *     the new instance of {@link InvoiceData }
     */
    public InvoiceData createInvoiceData() {
        return new InvoiceData();
    }

    /**
     * Create an instance of {@link BookingTravelerInformation }
     * 
     * @return
     *     the new instance of {@link BookingTravelerInformation }
     */
    public BookingTravelerInformation createBookingTravelerInformation() {
        return new BookingTravelerInformation();
    }

    /**
     * Create an instance of {@link OwnershipChange }
     * 
     * @return
     *     the new instance of {@link OwnershipChange }
     */
    public OwnershipChange createOwnershipChange() {
        return new OwnershipChange();
    }

    /**
     * Create an instance of {@link EmailNotification }
     * 
     * @return
     *     the new instance of {@link EmailNotification }
     */
    public EmailNotification createEmailNotification() {
        return new EmailNotification();
    }

    /**
     * Create an instance of {@link QueuePlace }
     * 
     * @return
     *     the new instance of {@link QueuePlace }
     */
    public QueuePlace createQueuePlace() {
        return new QueuePlace();
    }

    /**
     * Create an instance of {@link QueueSelector }
     * 
     * @return
     *     the new instance of {@link QueueSelector }
     */
    public QueueSelector createQueueSelector() {
        return new QueueSelector();
    }

    /**
     * Create an instance of {@link IncludedInBase }
     * 
     * @return
     *     the new instance of {@link IncludedInBase }
     */
    public IncludedInBase createIncludedInBase() {
        return new IncludedInBase();
    }

    /**
     * Create an instance of {@link PriceMatchError }
     * 
     * @return
     *     the new instance of {@link PriceMatchError }
     */
    public PriceMatchError createPriceMatchError() {
        return new PriceMatchError();
    }

    /**
     * Create an instance of {@link MCOMainData.Commission }
     * 
     * @return
     *     the new instance of {@link MCOMainData.Commission }
     */
    public MCOMainData.Commission createMCOMainDataCommission() {
        return new MCOMainData.Commission();
    }

    /**
     * Create an instance of {@link MCOExchangeData }
     * 
     * @return
     *     the new instance of {@link MCOExchangeData }
     */
    public MCOExchangeData createMCOExchangeData() {
        return new MCOExchangeData();
    }

    /**
     * Create an instance of {@link PTATODFee }
     * 
     * @return
     *     the new instance of {@link PTATODFee }
     */
    public PTATODFee createPTATODFee() {
        return new PTATODFee();
    }

    /**
     * Create an instance of {@link Psgr }
     * 
     * @return
     *     the new instance of {@link Psgr }
     */
    public Psgr createPsgr() {
        return new Psgr();
    }

    /**
     * Create an instance of {@link ErrText }
     * 
     * @return
     *     the new instance of {@link ErrText }
     */
    public ErrText createErrText() {
        return new ErrText();
    }

    /**
     * Create an instance of {@link InsertedText }
     * 
     * @return
     *     the new instance of {@link InsertedText }
     */
    public InsertedText createInsertedText() {
        return new InsertedText();
    }

    /**
     * Create an instance of {@link TermsAndConditions }
     * 
     * @return
     *     the new instance of {@link TermsAndConditions }
     */
    public TermsAndConditions createTermsAndConditions() {
        return new TermsAndConditions();
    }

    /**
     * Create an instance of {@link TypeTerms }
     * 
     * @return
     *     the new instance of {@link TypeTerms }
     */
    public TypeTerms createTypeTerms() {
        return new TypeTerms();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     * @return
     *     the new instance of {@link ErrorInfo }
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link TypeVoucherInformation }
     * 
     * @return
     *     the new instance of {@link TypeVoucherInformation }
     */
    public TypeVoucherInformation createTypeVoucherInformation() {
        return new TypeVoucherInformation();
    }

    /**
     * Create an instance of {@link TypeGuaranteeInformation }
     * 
     * @return
     *     the new instance of {@link TypeGuaranteeInformation }
     */
    public TypeGuaranteeInformation createTypeGuaranteeInformation() {
        return new TypeGuaranteeInformation();
    }

    /**
     * Create an instance of {@link TypeAgentInfo }
     * 
     * @return
     *     the new instance of {@link TypeAgentInfo }
     */
    public TypeAgentInfo createTypeAgentInfo() {
        return new TypeAgentInfo();
    }

    /**
     * Create an instance of {@link TypeSearchTimeSpec }
     * 
     * @return
     *     the new instance of {@link TypeSearchTimeSpec }
     */
    public TypeSearchTimeSpec createTypeSearchTimeSpec() {
        return new TypeSearchTimeSpec();
    }

    /**
     * Create an instance of {@link TypeRateDescription }
     * 
     * @return
     *     the new instance of {@link TypeRateDescription }
     */
    public TypeRateDescription createTypeRateDescription() {
        return new TypeRateDescription();
    }

    /**
     * Create an instance of {@link TypeSpecificTime }
     * 
     * @return
     *     the new instance of {@link TypeSpecificTime }
     */
    public TypeSpecificTime createTypeSpecificTime() {
        return new TypeSpecificTime();
    }

    /**
     * Create an instance of {@link OptionalServiceApplicationLimitType }
     * 
     * @return
     *     the new instance of {@link OptionalServiceApplicationLimitType }
     */
    public OptionalServiceApplicationLimitType createOptionalServiceApplicationLimitType() {
        return new OptionalServiceApplicationLimitType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     * @return
     *     the new instance of {@link FormattedTextTextType }
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link TypeProfileRef }
     * 
     * @return
     *     the new instance of {@link TypeProfileRef }
     */
    public TypeProfileRef createTypeProfileRef() {
        return new TypeProfileRef();
    }

    /**
     * Create an instance of {@link TypeDateRange }
     * 
     * @return
     *     the new instance of {@link TypeDateRange }
     */
    public TypeDateRange createTypeDateRange() {
        return new TypeDateRange();
    }

    /**
     * Create an instance of {@link TypeAgencyHierarchyReference }
     * 
     * @return
     *     the new instance of {@link TypeAgencyHierarchyReference }
     */
    public TypeAgencyHierarchyReference createTypeAgencyHierarchyReference() {
        return new TypeAgencyHierarchyReference();
    }

    /**
     * Create an instance of {@link TypeAgencyHierarchyLongReference }
     * 
     * @return
     *     the new instance of {@link TypeAgencyHierarchyLongReference }
     */
    public TypeAgencyHierarchyLongReference createTypeAgencyHierarchyLongReference() {
        return new TypeAgencyHierarchyLongReference();
    }

    /**
     * Create an instance of {@link TypeOTAKeyword }
     * 
     * @return
     *     the new instance of {@link TypeOTAKeyword }
     */
    public TypeOTAKeyword createTypeOTAKeyword() {
        return new TypeOTAKeyword();
    }

    /**
     * Create an instance of {@link TypeOTASubKey }
     * 
     * @return
     *     the new instance of {@link TypeOTASubKey }
     */
    public TypeOTASubKey createTypeOTASubKey() {
        return new TypeOTASubKey();
    }

    /**
     * Create an instance of {@link TypePolicyCodesList }
     * 
     * @return
     *     the new instance of {@link TypePolicyCodesList }
     */
    public TypePolicyCodesList createTypePolicyCodesList() {
        return new TypePolicyCodesList();
    }

    /**
     * Create an instance of {@link TypeStructuredAddressInfo }
     * 
     * @return
     *     the new instance of {@link TypeStructuredAddressInfo }
     */
    public TypeStructuredAddressInfo createTypeStructuredAddressInfo() {
        return new TypeStructuredAddressInfo();
    }

    /**
     * Create an instance of {@link BaseCreateReservationReq }
     * 
     * @return
     *     the new instance of {@link BaseCreateReservationReq }
     */
    public BaseCreateReservationReq createBaseCreateReservationReq() {
        return new BaseCreateReservationReq();
    }

    /**
     * Create an instance of {@link BaseCreateWithFormOfPaymentReq }
     * 
     * @return
     *     the new instance of {@link BaseCreateWithFormOfPaymentReq }
     */
    public BaseCreateWithFormOfPaymentReq createBaseCreateWithFormOfPaymentReq() {
        return new BaseCreateWithFormOfPaymentReq();
    }

    /**
     * Create an instance of {@link RailReservation }
     * 
     * @return
     *     the new instance of {@link RailReservation }
     */
    public RailReservation createRailReservation() {
        return new RailReservation();
    }

    /**
     * Create an instance of {@link RailTicketInfo }
     * 
     * @return
     *     the new instance of {@link RailTicketInfo }
     */
    public RailTicketInfo createRailTicketInfo() {
        return new RailTicketInfo();
    }

    /**
     * Create an instance of {@link TicketAdvisory }
     * 
     * @return
     *     the new instance of {@link TicketAdvisory }
     */
    public TicketAdvisory createTicketAdvisory() {
        return new TicketAdvisory();
    }

    /**
     * Create an instance of {@link SearchRailLeg }
     * 
     * @return
     *     the new instance of {@link SearchRailLeg }
     */
    public SearchRailLeg createSearchRailLeg() {
        return new SearchRailLeg();
    }

    /**
     * Create an instance of {@link RailLegModifiers.PermittedConnectionPoints }
     * 
     * @return
     *     the new instance of {@link RailLegModifiers.PermittedConnectionPoints }
     */
    public RailLegModifiers.PermittedConnectionPoints createRailLegModifiersPermittedConnectionPoints() {
        return new RailLegModifiers.PermittedConnectionPoints();
    }

    /**
     * Create an instance of {@link RailLegModifiers.ProhibitedConnectionPoints }
     * 
     * @return
     *     the new instance of {@link RailLegModifiers.ProhibitedConnectionPoints }
     */
    public RailLegModifiers.ProhibitedConnectionPoints createRailLegModifiersProhibitedConnectionPoints() {
        return new RailLegModifiers.ProhibitedConnectionPoints();
    }

    /**
     * Create an instance of {@link RailExchangeSolution }
     * 
     * @return
     *     the new instance of {@link RailExchangeSolution }
     */
    public RailExchangeSolution createRailExchangeSolution() {
        return new RailExchangeSolution();
    }

    /**
     * Create an instance of {@link RailExchangeInfo }
     * 
     * @return
     *     the new instance of {@link RailExchangeInfo }
     */
    public RailExchangeInfo createRailExchangeInfo() {
        return new RailExchangeInfo();
    }

    /**
     * Create an instance of {@link RailRefundInfo }
     * 
     * @return
     *     the new instance of {@link RailRefundInfo }
     */
    public RailRefundInfo createRailRefundInfo() {
        return new RailRefundInfo();
    }

    /**
     * Create an instance of {@link RailSearchModifiers.PreferredSuppliers }
     * 
     * @return
     *     the new instance of {@link RailSearchModifiers.PreferredSuppliers }
     */
    public RailSearchModifiers.PreferredSuppliers createRailSearchModifiersPreferredSuppliers() {
        return new RailSearchModifiers.PreferredSuppliers();
    }

    /**
     * Create an instance of {@link RailPricingModifiers }
     * 
     * @return
     *     the new instance of {@link RailPricingModifiers }
     */
    public RailPricingModifiers createRailPricingModifiers() {
        return new RailPricingModifiers();
    }

    /**
     * Create an instance of {@link RailInfo }
     * 
     * @return
     *     the new instance of {@link RailInfo }
     */
    public RailInfo createRailInfo() {
        return new RailInfo();
    }

    /**
     * Create an instance of {@link Coach }
     * 
     * @return
     *     the new instance of {@link Coach }
     */
    public Coach createCoach() {
        return new Coach();
    }

    /**
     * Create an instance of {@link Characteristic3 }
     * 
     * @return
     *     the new instance of {@link Characteristic3 }
     */
    public Characteristic3 createCharacteristic3() {
        return new Characteristic3();
    }

    /**
     * Create an instance of {@link RailSupplier }
     * 
     * @return
     *     the new instance of {@link RailSupplier }
     */
    public RailSupplier createRailSupplier() {
        return new RailSupplier();
    }

    /**
     * Create an instance of {@link RailSolutionChangedInfo }
     * 
     * @return
     *     the new instance of {@link RailSolutionChangedInfo }
     */
    public RailSolutionChangedInfo createRailSolutionChangedInfo() {
        return new RailSolutionChangedInfo();
    }

    /**
     * Create an instance of {@link RailAutoSeatAssignment }
     * 
     * @return
     *     the new instance of {@link RailAutoSeatAssignment }
     */
    public RailAutoSeatAssignment createRailAutoSeatAssignment() {
        return new RailAutoSeatAssignment();
    }

    /**
     * Create an instance of {@link RailSpecificSeatAssignment }
     * 
     * @return
     *     the new instance of {@link RailSpecificSeatAssignment }
     */
    public RailSpecificSeatAssignment createRailSpecificSeatAssignment() {
        return new RailSpecificSeatAssignment();
    }

    /**
     * Create an instance of {@link SessionContext.SessTok }
     * 
     * @return
     *     the new instance of {@link SessionContext.SessTok }
     */
    public SessionContext.SessTok createSessionContextSessTok() {
        return new SessionContext.SessTok();
    }

    /**
     * Create an instance of {@link SessionContext.SessProp }
     * 
     * @return
     *     the new instance of {@link SessionContext.SessProp }
     */
    public SessionContext.SessProp createSessionContextSessProp() {
        return new SessionContext.SessProp();
    }

    /**
     * Create an instance of {@link RoutingRules.Routing.DirectionInfo }
     * 
     * @return
     *     the new instance of {@link RoutingRules.Routing.DirectionInfo }
     */
    public RoutingRules.Routing.DirectionInfo createRoutingRulesRoutingDirectionInfo() {
        return new RoutingRules.Routing.DirectionInfo();
    }

    /**
     * Create an instance of {@link TypeFlexibleTimeSpec.SearchExtraDays }
     * 
     * @return
     *     the new instance of {@link TypeFlexibleTimeSpec.SearchExtraDays }
     */
    public TypeFlexibleTimeSpec.SearchExtraDays createTypeFlexibleTimeSpecSearchExtraDays() {
        return new TypeFlexibleTimeSpec.SearchExtraDays();
    }

    /**
     * Create an instance of {@link ServiceRuleType.ApplicationRules }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.ApplicationRules }
     */
    public ServiceRuleType.ApplicationRules createServiceRuleTypeApplicationRules() {
        return new ServiceRuleType.ApplicationRules();
    }

    /**
     * Create an instance of {@link ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule }
     */
    public ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule createServiceRuleTypeSecondaryTypeRulesSecondaryTypeRule() {
        return new ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule();
    }

    /**
     * Create an instance of {@link ServiceRuleType.ModifyRules.ModifyRule }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.ModifyRules.ModifyRule }
     */
    public ServiceRuleType.ModifyRules.ModifyRule createServiceRuleTypeModifyRulesModifyRule() {
        return new ServiceRuleType.ModifyRules.ModifyRule();
    }

    /**
     * Create an instance of {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
     * 
     * @return
     *     the new instance of {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
     */
    public ServiceRuleType.ApplicationLevel.ApplicationLimits createServiceRuleTypeApplicationLevelApplicationLimits() {
        return new ServiceRuleType.ApplicationLevel.ApplicationLimits();
    }

    /**
     * Create an instance of {@link TypeFeeInfo.TaxInfoRef }
     * 
     * @return
     *     the new instance of {@link TypeFeeInfo.TaxInfoRef }
     */
    public TypeFeeInfo.TaxInfoRef createTypeFeeInfoTaxInfoRef() {
        return new TypeFeeInfo.TaxInfoRef();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeTaxInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeTaxInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "TaxInfo")
    public JAXBElement<TypeTaxInfo> createTaxInfo(TypeTaxInfo value) {
        return new JAXBElement<>(_TaxInfo_QNAME, TypeTaxInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeFeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeFeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "FeeInfo")
    public JAXBElement<TypeFeeInfo> createFeeInfo(TypeFeeInfo value) {
        return new JAXBElement<>(_FeeInfo_QNAME, TypeFeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeTextElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeTextElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "Text")
    public JAXBElement<TypeTextElement> createText(TypeTextElement value) {
        return new JAXBElement<>(_Text_QNAME, TypeTextElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeTextElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeTextElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "Title")
    public JAXBElement<TypeTextElement> createTitle(TypeTextElement value) {
        return new JAXBElement<>(_Title_QNAME, TypeTextElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeBaseAirSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeBaseAirSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "AirSegment")
    public JAXBElement<TypeBaseAirSegment> createAirSegment(TypeBaseAirSegment value) {
        return new JAXBElement<>(_AirSegment_QNAME, TypeBaseAirSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeDefaultBrandDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeDefaultBrandDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "DefaultBrandDetail")
    public JAXBElement<TypeDefaultBrandDetail> createDefaultBrandDetail(TypeDefaultBrandDetail value) {
        return new JAXBElement<>(_DefaultBrandDetail_QNAME, TypeDefaultBrandDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "FareCalc")
    public JAXBElement<String> createFareCalc(String value) {
        return new JAXBElement<>(_FareCalc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseBaggageAllowanceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseBaggageAllowanceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "EmbargoInfo")
    public JAXBElement<BaseBaggageAllowanceInfo> createEmbargoInfo(BaseBaggageAllowanceInfo value) {
        return new JAXBElement<>(_EmbargoInfo_QNAME, BaseBaggageAllowanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "TicketNumber")
    public JAXBElement<String> createTicketNumber(String value) {
        return new JAXBElement<>(_TicketNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAgencyPayment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeAgencyPayment }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "AgencyPayment")
    public JAXBElement<TypeAgencyPayment> createAgencyPayment(TypeAgencyPayment value) {
        return new JAXBElement<>(_AgencyPayment_QNAME, TypeAgencyPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeMealService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeMealService }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "Meals")
    public JAXBElement<TypeMealService> createMeals(TypeMealService value) {
        return new JAXBElement<>(_Meals_QNAME, TypeMealService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "InFlightServices")
    public JAXBElement<String> createInFlightServices(String value) {
        return new JAXBElement<>(_InFlightServices_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "FareRoutingInformation")
    public JAXBElement<String> createFareRoutingInformation(String value) {
        return new JAXBElement<>(_FareRoutingInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "FareMileageInformation")
    public JAXBElement<String> createFareMileageInformation(String value) {
        return new JAXBElement<>(_FareMileageInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "OverrideCode")
    public JAXBElement<String> createOverrideCode(String value) {
        return new JAXBElement<>(_OverrideCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "OptionalServiceRef")
    public JAXBElement<String> createOptionalServiceRef(String value) {
        return new JAXBElement<>(_OptionalServiceRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "SegmentIndex")
    public JAXBElement<Integer> createSegmentIndex(Integer value) {
        return new JAXBElement<>(_SegmentIndex_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "EMDEndorsement")
    public JAXBElement<String> createEMDEndorsement(String value) {
        return new JAXBElement<>(_EMDEndorsement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeApplicableSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeApplicableSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v54_0", name = "ApplicableSegment")
    public JAXBElement<TypeApplicableSegment> createApplicableSegment(TypeApplicableSegment value) {
        return new JAXBElement<>(_ApplicableSegment_QNAME, TypeApplicableSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "TerminalSessionInfo")
    public JAXBElement<String> createTerminalSessionInfo(String value) {
        return new JAXBElement<>(_TerminalSessionInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/rail_v54_0", name = "FulFillmentType")
    public JAXBElement<String> createFulFillmentType(String value) {
        return new JAXBElement<>(_FulFillmentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeProviderReservationDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeProviderReservationDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "ProviderReservationDetail")
    public JAXBElement<TypeProviderReservationDetail> createProviderReservationDetail(TypeProviderReservationDetail value) {
        return new JAXBElement<>(_ProviderReservationDetail_QNAME, TypeProviderReservationDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "LocatorCode")
    public JAXBElement<String> createLocatorCode(String value) {
        return new JAXBElement<>(_LocatorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "GuaranteeType")
    public JAXBElement<String> createGuaranteeType(String value) {
        return new JAXBElement<>(_GuaranteeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "SimpleName")
    public JAXBElement<String> createSimpleName(String value) {
        return new JAXBElement<>(_SimpleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeStructuredAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeStructuredAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "LocationAddress")
    public JAXBElement<TypeStructuredAddress> createLocationAddress(TypeStructuredAddress value) {
        return new JAXBElement<>(_LocationAddress_QNAME, TypeStructuredAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeLocation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypeLocation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "ConnectionPoint")
    public JAXBElement<TypeLocation> createConnectionPoint(TypeLocation value) {
        return new JAXBElement<>(_ConnectionPoint_QNAME, TypeLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "ReferencePoint")
    public JAXBElement<String> createReferencePoint(String value) {
        return new JAXBElement<>(_ReferencePoint_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/common_v54_0", name = "SellMessage")
    public JAXBElement<String> createSellMessage(String value) {
        return new JAXBElement<>(_SellMessage_QNAME, String.class, null, value);
    }

}
