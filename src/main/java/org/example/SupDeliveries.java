package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class SupDeliveries {
    private ArrayList<Delivery> inComing = new ArrayList<>();

    /**
     * Takes in a delivery to be added in the ArrayList inComing
     * @param toAdd the values to be added to the arraylist
     */
    public void addDelivery(Delivery toAdd) {
        inComing.add(toAdd);
    }

    /**
     * Takes in a date and returns all the object deliveries scheduled on that date.
     * @param date the date being searched for
     * @return null if the array is empty or there weren't any results. The ArrayList with the
     * found results otherwise
     */
    public ArrayList<Delivery> findAllDeliveries(LocalDate date) {
        if (inComing.isEmpty()) {
            return null;
        }
        ArrayList<Delivery> sameDate = new ArrayList<>();
        Delivery d = null;
        for (int i = 0; i < inComing.size(); i++) {
            d = this.inComing.get(i);
            if (d.getDate() == date) {
                sameDate.add(d);
            }
        }
        return sameDate;
    }

    /**
     * Takes in an object item to be searched in the ArrayList.
     * @param itemName parameter to be found
     * @return null if no matches or if ArrayList null. The values otherwise
     */
    public ArrayList<Delivery> findAllDeliveries(String itemName) {
        if (inComing.isEmpty()) {
            return null;
        }
        ArrayList<Delivery> allDelvs = new ArrayList<>();
        for (Delivery delivery : inComing) {
            if (delivery.getItemRef().equalsIgnoreCase(itemName)) {
                allDelvs.add(delivery);
            }
        }
        return allDelvs;
    }

    /**
     * Takes in an object supplier name to be searched for in an ArrayList of Deliveries and deletes
     * the instance of the variable from the arraylist if it matches.
     * @param name the value to be deleted
     * @return 0 if array is empty. The count of the deleted items otherwise
     */
    public int deleteDeliveries(String name) {
        if (inComing.isEmpty()) {
            return 0;
        }
        int count = 0;
        Item it = null;
        for (int i = 0; i < inComing.size(); i++) {
            it = new Item();
            if (name.equalsIgnoreCase(it.getSupplierRef())) {
                inComing.remove(i);
                count++;
            }
        }
        return count;
    }


}
