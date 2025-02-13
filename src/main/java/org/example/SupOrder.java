package org.example;

import java.time.LocalDate;

public class SupOrder {
    //creating the variables to be used in the class
    private String itemRef;
    private LocalDate date;
    private int quantity;
    private String uniqueId;

    public SupOrder(){ //no argument constructor
    }

    public SupOrder(String itemRef, LocalDate date, int quantity, String uniqueId){
        this.itemRef = itemRef;//setting a value to it
        this.date = date;//setting a value to it
        this.quantity = quantity;//setting a value to it
        this.uniqueId = uniqueId;//setting a value to it
    }

    public String getItemRef() {
        return itemRef;
    }

    public boolean setItemRef(String itemRef) {
        if (itemRef == null){
            return false;
        }
        this.itemRef = itemRef;
        return true;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean setDate(LocalDate date) {
        if (date == null){
            return false;
        }
        this.date = date;
        return true;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setQuantity(int quantity) {
        if (quantity < 0){
            return false;
        }
        this.quantity = quantity;
        return true;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public boolean setUniqueId(String uniqueId) {
        if (uniqueId == null){
            return false;
        }
        this.uniqueId = uniqueId;
        return true;
    }
}
