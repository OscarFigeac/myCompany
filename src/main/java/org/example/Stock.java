package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Item> products = new ArrayList<>();

    public Stock() {//no argument constructor
    }

    /**
     * Takes in an Object Item to be added to the arraylist products
     * @param item the object to be added
     */
    public void add(Item item) {
        products.add(item);
    }

    /**
     * Takes in name of an Item to be searched in the arraylist of items.
     * @param item the name of the item being looked for.
     * @return null if no matches or if the arraylist is empty. The item found otherwise
     */
    public Item findItem(String item) {
        if (products.isEmpty()) {
            return null;
        }
        Item it = new Item();
        for (int i = 0; i < products.size(); i++) {
            it = this.products.get(i);
            if (item.equalsIgnoreCase(it.getItemName())) {
                return it;
            }
        }
        return it;
    }

    /**
     * Looks for the dearest item in an array of Object Items.
     * @return null if not found; the name of the item otherwise
     */
    public String findDearest() {
        if (products.isEmpty()) {
            return null;
        }
        if (products.size() == 1) {
            return products.getFirst().getItemName();
        }
        Item dearest = products.getFirst();
        for (Item item : products){
            if (item.getUnitCostPrice() > dearest.getUnitCostPrice()){
                dearest = item;
            }
        }
        return dearest.getItemName() +" " + dearest.getSupplierRef() + " " + dearest.getQuantityInStock();
    }

    /**
     * Finds the cheapest item in an arraylist of Object Items
     * @return the cheapest object Item
     */
    public Item findCheapest() {
        if (products.isEmpty()) {
            return null;
        }
        if (products.size() == 1) {
            return products.getFirst();
        }
        Item cheapest = products.getFirst();
        for (Item item : products){
            if (item.getUnitCostPrice() < cheapest.getUnitCostPrice()){
                cheapest = item;
            }
        }
        return cheapest;
    }

    /**
     * Creates an arraylist of orders for those Object Items with the OnOrderFlag set on false.
     * @return the newly created orders arraylist
     */
    public ArrayList<SupOrder> createOrders() {
        if (products.isEmpty()) {
            return null;
        }
        ArrayList<SupOrder> orders = new ArrayList<>();
        Item it = new Item();
        for (int i = 0; i < products.size(); i++) {
            if (!it.getOnOrderFlag() && it.getQuantityInStock() <= it.getReorderLevel()) {
                orders.add(new SupOrder(it.getItemName(), LocalDate.now(),
                        it.getReorderLevel(), it.getUniqueId()));
                it.setOnOrderFlag(true);
            }
        }
        return orders;
    }

}
