package edu.neu.csye6200;

import edu.neu.csye6200.store.Store;

/**
 * Main Driver class to test the application.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n");
        
        Store store = new Store();
        store.demo();
        
        System.out.println("\n============Main Execution End===================");
    }
}
