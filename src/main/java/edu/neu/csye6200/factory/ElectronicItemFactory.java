package edu.neu.csye6200.factory;

import edu.neu.csye6200.model.ElectronicItem;

/**
 * Factory class implementing Lazy Singleton for ElectronicItem creation.
 */
public class ElectronicItemFactory {
    private static ElectronicItemFactory instance;

    private ElectronicItemFactory() {}

    public static synchronized ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    public ElectronicItem createElectronicItem(String csv) {
        return new ElectronicItem(csv);
    }
}
