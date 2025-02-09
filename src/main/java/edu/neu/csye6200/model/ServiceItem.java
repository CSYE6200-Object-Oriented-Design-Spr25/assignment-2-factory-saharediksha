package edu.neu.csye6200.model;

/**
 * ServiceItem class representing service-based products.
 */
public class ServiceItem extends Item {
    private String serviceType;

    public ServiceItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
        this.serviceType = csv.split(",")[3];
    }

    @Override
    public String toString() {
        return super.toString() + ", Service Type: " + serviceType;
    }
}
