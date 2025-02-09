package edu.neu.csye6200.factory;

import edu.neu.csye6200.model.ServiceItem;

/**
 * Factory class implementing Eager Singleton for ServiceItem creation.
 */
public class ServiceItemFactory {
    private static final ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {}

    public static ServiceItemFactory getInstance() {
        return instance;
    }

    public ServiceItem createServiceItem(String csv) {
        return new ServiceItem(csv);
    }
}
