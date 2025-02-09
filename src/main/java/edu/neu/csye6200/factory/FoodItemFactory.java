package edu.neu.csye6200.factory;

import edu.neu.csye6200.model.FoodItem;

/**
 * Factory class for creating FoodItem objects.
 */
public class FoodItemFactory {
    public static FoodItem createFoodItem(String csv) {
        return new FoodItem(csv);
    }
}
