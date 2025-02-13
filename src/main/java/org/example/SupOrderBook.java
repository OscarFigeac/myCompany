package org.example;

import java.util.ArrayList;

public class SupOrderBook {
    private ArrayList <SupOrder> orders = new ArrayList<>();

    public SupOrderBook(){ //no argument constructor
    }
    /**
     * Takes in an order and adds it into the ArrayList orders
     * @param order the value to be put in the ArrayList
     */
    public void add(SupOrder order){
        this.orders.add(order);
    }

    /**
     * Takes in an ArrayList of orders and merges it with itself
     * @param orders The ArrayList to be merged
     */
    public void add(ArrayList<SupOrder> orders){
        this.orders.addAll(orders);
    }
}
