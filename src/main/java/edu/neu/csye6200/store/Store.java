package edu.neu.csye6200.store;

import edu.neu.csye6200.model.*;
import edu.neu.csye6200.factory.*;
import edu.neu.csye6200.util.FileUtil;
import java.util.*;

public class Store extends AbstractStore {

    public Store() {
        items = new ArrayList<>();
    }

    @Override
    public void loadItems() {
        List<String> foodLines = FileUtil.readLines("FoodItemCSV.txt");
        for (String line : foodLines) {
            items.add(FoodItemFactory.createFoodItem(line));
        }

        List<String> electronicLines = FileUtil.readLines("ElectronicItemCSV.txt");
        for (String line : electronicLines) {
            items.add(ElectronicItemFactory.getInstance().createElectronicItem(line));
        }

        List<String> serviceLines = FileUtil.readLines("ServiceItemCSV.txt");
        for (String line : serviceLines) {
            items.add(ServiceItemFactory.getInstance().createServiceItem(line));
        }
    }

    @Override
    public void sortById() { items.sort(Comparator.comparingInt(Item::getId)); }
    @Override
    public void sortByName() { items.sort(Comparator.comparing(Item::getName)); }
    @Override
    public void sortByPrice() { items.sort(Comparator.comparingDouble(Item::getPrice)); }

    public void demo() {
        loadItems();
        
        System.out.println("============ Sorted by ID ============");
        sortById();
        System.out.println("------ Food Items ------");
        items.stream().filter(item -> item instanceof FoodItem).forEach(System.out::println);

        System.out.println("------ Electronic Items ------");
        items.stream().filter(item -> item instanceof ElectronicItem).forEach(System.out::println);

        System.out.println("------ Service Items ------");
        items.stream().filter(item -> item instanceof ServiceItem).forEach(System.out::println);

    }

}
