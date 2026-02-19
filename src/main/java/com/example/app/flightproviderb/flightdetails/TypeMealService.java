
package com.example.app.flightproviderb.flightdetails;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Available Meal Service
 * 
 * <p>Java class for typeMealService</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="typeMealService">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Meal"/>
 *     <enumeration value="ColdMeal"/>
 *     <enumeration value="HotMeal"/>
 *     <enumeration value="Breakfast"/>
 *     <enumeration value="ContinentalBreakfast"/>
 *     <enumeration value="Lunch"/>
 *     <enumeration value="Dinner"/>
 *     <enumeration value="SnackOrBrunch"/>
 *     <enumeration value="FoodForPurchase"/>
 *     <enumeration value="ComplimentaryRefreshments"/>
 *     <enumeration value="AlcoholicBeveragesForPurchase"/>
 *     <enumeration value="ComplimentaryAlcoholicBeverages"/>
 *     <enumeration value="FoodAndBeveragesForPurchase"/>
 *     <enumeration value="NoMealService"/>
 *     <enumeration value="RefreshmentsForPurchase"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeMealService")
@XmlEnum
public enum TypeMealService {

    @XmlEnumValue("Meal")
    MEAL("Meal"),
    @XmlEnumValue("ColdMeal")
    COLD_MEAL("ColdMeal"),
    @XmlEnumValue("HotMeal")
    HOT_MEAL("HotMeal"),
    @XmlEnumValue("Breakfast")
    BREAKFAST("Breakfast"),
    @XmlEnumValue("ContinentalBreakfast")
    CONTINENTAL_BREAKFAST("ContinentalBreakfast"),
    @XmlEnumValue("Lunch")
    LUNCH("Lunch"),
    @XmlEnumValue("Dinner")
    DINNER("Dinner"),
    @XmlEnumValue("SnackOrBrunch")
    SNACK_OR_BRUNCH("SnackOrBrunch"),
    @XmlEnumValue("FoodForPurchase")
    FOOD_FOR_PURCHASE("FoodForPurchase"),
    @XmlEnumValue("ComplimentaryRefreshments")
    COMPLIMENTARY_REFRESHMENTS("ComplimentaryRefreshments"),
    @XmlEnumValue("AlcoholicBeveragesForPurchase")
    ALCOHOLIC_BEVERAGES_FOR_PURCHASE("AlcoholicBeveragesForPurchase"),
    @XmlEnumValue("ComplimentaryAlcoholicBeverages")
    COMPLIMENTARY_ALCOHOLIC_BEVERAGES("ComplimentaryAlcoholicBeverages"),
    @XmlEnumValue("FoodAndBeveragesForPurchase")
    FOOD_AND_BEVERAGES_FOR_PURCHASE("FoodAndBeveragesForPurchase"),
    @XmlEnumValue("NoMealService")
    NO_MEAL_SERVICE("NoMealService"),
    @XmlEnumValue("RefreshmentsForPurchase")
    REFRESHMENTS_FOR_PURCHASE("RefreshmentsForPurchase");
    private final String value;

    TypeMealService(String v) {
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
    public static TypeMealService fromValue(String v) {
        for (TypeMealService c: TypeMealService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
