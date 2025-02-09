package edu.neu.csye6200.store;

import edu.neu.csye6200.model.Item;
import java.util.List;

/**
 * Abstract class for Store management.
 */
public abstract class AbstractStore {
    protected List<Item> items;

    public abstract void loadItems();
    public abstract void sortById();
    public abstract void sortByName();
    public abstract void sortByPrice();
}
