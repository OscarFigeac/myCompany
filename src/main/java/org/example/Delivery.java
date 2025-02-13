package org.example;

import java.time.LocalDate;

public class Delivery {
    String itemRef;
    LocalDate date;
    int quantity;

    public Delivery() {
    }//no argument constructor

    public Delivery(String itemRef, LocalDate date, int quantity) {
        this.itemRef = itemRef;//giving a value to the variable
        this.date = date;//giving a value to the variable
        this.quantity = quantity;//giving a value to the variable
    }

    public String getItemRef() {
        return itemRef;
    }

    public boolean setItemRef(String itemRef) {
        if (itemRef == null || itemRef.trim().isEmpty()) {
            return false;
        }
        this.itemRef = itemRef;
        return true;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean setDate(LocalDate date) {
        if (date == null || date.isAfter(LocalDate.now())) { //checking if the date is correct
            return false;
        }
        this.date = date;
        return true;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if (quantity < 0) {
            return false;
        }
        this.quantity = quantity;
        return true;
    }

    /**
     * Takes in the quantity and accesses the Item class to multiply the quantity by unitCostPrice
     *
     * @param quantity number to be multiplied
     * @return the result of quantity times UnitCostPrice
     */
    public double calculateDeliveryCost(int quantity, double cost) {
        return cost * quantity;
    }

    @Override
    public String toString() {
        return "Delivery [itemRef=" + itemRef + ", date=" + date + ", quantity=" + quantity + "]";
    }

}
