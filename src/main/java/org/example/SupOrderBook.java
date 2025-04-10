package org.example;

import java.util.*;

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

    /**
     * Takes in an orderId, looks for it and if found, calculates the final price of the order
     * @param orderId the ID being looked for
     * @return the final cost of the order
     * @throws NoSuchElementException if the ID wasn't found
     */
    public double calcOrderCost(String orderId){
        SupOrder supOrder = new SupOrder();
        String retrievedId = supOrder.getUniqueId();
        if (retrievedId.equals(orderId)){
            DisSup sup = new DisSup();
            return sup.calculateDiscountedPrice(sup.getAmountOwed());
        }else{
            throw new NoSuchElementException("No existing elements with the id: " + orderId);
        }
    }

    /**
     * Takes in a List of suppliers to map them and output the name and list of products
     * @param suppliers the List to be mapped
     * @return a mapped version of the List
     * @throws IllegalFormatCodePointException if the List is null
     */
    public Map<String, List<String>> createSupplierMap(List<Supplier> suppliers){
        if (suppliers == null){
            throw new IllegalArgumentException("Passed parameter cannot be null");
        } else{
            Map<String, List<String>> supplierMap = new HashMap<>();
            Stock stock = new Stock();
            List<String> products = new ArrayList<>();
            products.stream().map(object -> Objects.toString(stock, null)).toList(); //stock into stream
            for (Supplier supplier : suppliers) {
                supplierMap.put(supplier.getSupplierName(), products);
            }
            return supplierMap;
        }
    }
}
