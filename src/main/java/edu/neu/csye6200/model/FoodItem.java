package edu.neu.csye6200.model;

/**
 * FoodItem class representing food products.
 */
public class FoodItem extends Item {
    private String expirationDate;

    public FoodItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
        this.expirationDate = csv.split(",")[3];
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}
