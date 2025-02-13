package org.example;

import java.util.Scanner;

public class Item {
    Scanner kb = new Scanner(System.in);
    //creating variables in the class
    private String itemName;
    private String uniqueId;
    private int quantityInStock;
    private int reorderLevel;
    private int reOrderQuantity;
    private double unitCostPrice;
    private String supplierRef;
    private boolean onOrderFlag;

    public Item() {
    }//no argument constructor

    public Item(String itemName, String uniqueId, int quantityInStock, int reorderLevel, int reOrderQuantity, double unitCostPrice, String supplierRef, boolean onOrderFlag) {
        this.itemName = itemName;//giving a value to the variable
        this.uniqueId = uniqueId;//giving a value to the variable
        this.quantityInStock = quantityInStock;//giving a value to the variable
        this.reorderLevel = reorderLevel;//giving a value to the variable
        this.reOrderQuantity = reOrderQuantity;//giving a value to the variable
        this.unitCostPrice = unitCostPrice;//giving a value to the variable
        this.supplierRef = supplierRef;//giving a value to the variable
        this.onOrderFlag = onOrderFlag;//giving a value to the variable
    }

    public String getItemName() {
        return itemName;
    }

    public boolean setItemName(String itemName) {
        if (itemName == null || itemName.isEmpty()) {
            return false;
        }
        this.itemName = itemName;
        return true;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public boolean setUniqueId(String uniqueId) {
        if (uniqueId == null || uniqueId.isEmpty()) {
            return false;
        }
        this.uniqueId = uniqueId;
        return true;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public boolean setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            return false;
        }
        this.quantityInStock = quantityInStock;
        return true;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public boolean setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) {
            return false;
        }
        this.reorderLevel = reorderLevel;
        return true;
    }

    public int getReOrderQuantity() {
        return reOrderQuantity;
    }

    public boolean setReOrderQuantity(int reOrderQuantity) {
        if (reOrderQuantity < 0) {
            return false;
        }
        this.reOrderQuantity = reOrderQuantity;
        return true;
    }

    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    public boolean setUnitCostPrice(double unitCostPrice) {
        if (unitCostPrice < 0) {
            return false;
        }
        this.unitCostPrice = unitCostPrice;
        return true;
    }

    public String getSupplierRef() {
        return supplierRef;
    }

    public boolean setSupplierRef(String supplierRef) {
        if (supplierRef == null || supplierRef.isEmpty()) {
            return false;
        }
        this.supplierRef = supplierRef;
        return true;
    }

    public boolean getOnOrderFlag() {
        return onOrderFlag;
    }

    public void setOnOrderFlag(boolean onOrderFlag) {
        this.onOrderFlag = onOrderFlag;
    }

    /**
     * Takes in two integers, quantityInStock and reOrderQuantity, sums them together and adds the new order
     * into reOrderQuantity
     *
     * @param quantityInStock the current stock first num to be added.
     * @param reOrderQuantity the order on the way, second num to be added.
     * @return the sum of quantityInStock and reOrderQuantity
     */
    public int increaseQuantityInStock(int quantityInStock, int reOrderQuantity) {
        reOrderQuantity += reOrderQuantity;//+= in case there already is stock on the way
        return quantityInStock + reOrderQuantity;
    }

    /**
     * Takes in two integers, quantityInStock and reOrderQuantity, sums them together and subtract the input
     * taken in from the user.
     *
     * @param quantityInStock the current stock first num to be added.
     * @param reOrderQuantity the order on the way, second num to be added.
     * @param total the total of products bought
     * @return 0 if the stock is less than 0. Total otherwise
     */
    public int decreaseQuantityInStock(int quantityInStock, int reOrderQuantity, int total) {
        total = quantityInStock + reOrderQuantity - total; //taking in reorder quantity, as there could be products on the way
        if (total < 0) {
            System.out.println("Stock can't be zero. 0 products in stock");
            return 0;
        }
        return total;
    }

    /**
     * Gives the object a string representation
     *
     * @return the string containing the values of all the parameters
     */
    @Override
    public String toString() {
        return "Item itemName[" + itemName + "], uniqueId[" + uniqueId + "], quantityInStock[" + quantityInStock + "], reorderLevel[" + reorderLevel
                + "], reOrderQuantity[" + reOrderQuantity + "], unitCostPrice[" + unitCostPrice + "], supplierRef[" + supplierRef + "], " +
                "onOrderFlag[" + onOrderFlag + "]";
    }
}
