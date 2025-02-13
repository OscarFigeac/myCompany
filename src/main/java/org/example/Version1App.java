package org.example;

import java.time.LocalDate;

public class Version1App {
    public static void main(String[] args) {
        //Assigning values to the variables in the Supplier class
        Supplier s = new Supplier();
        Supplier s1 = new Supplier("Musgrave", "Dublin Road", 147.85, 200.99);
        Supplier s2 = new Supplier("Tesco", "Warrenpoint", 132.50, 250.00);
        Supplier s3 = new Supplier("Lidl", "Drogheda Road", 145.45, 300.99);

        //Assigning values to the variables in the Item class
        Item i1 = new Item();//using a no argument constructor.
        Item i2 = new Item("iPhone", "iP154", 134, 55, 100, 250.99, "Apple123", true);
        Item i3 = new Item("Laptop", "Lap123", 122, 45, 60, 735.27, "HP123", false);
        Item i4 = new Item("Protein powder", "PP167", 43, 20, 25, 41.25, "ON667", true);
        Item i5 = new Item("Keyboards", "Kb773", 35, 15, 20, 12.90, "KB881", true);

        //Assigning values to the variables in the Delivery class
        Delivery d = new Delivery();
        Delivery d1 = new Delivery("iP154", LocalDate.of(2024, 9, 21), 175);
        Delivery d2 = new Delivery("PP167", LocalDate.of(2024, 6, 26), 5);
        Delivery d3 = new Delivery("Kb773", LocalDate.of(2024, 11, 7), 20);

        //if delivered, reducing the quantity in stock
        boolean delivered = i2.getOnOrderFlag();
        if (delivered) {
           double total;
           total = i2.decreaseQuantityInStock(i2.getQuantityInStock(), i2.getReOrderQuantity(), d1.getQuantity());
            System.out.println("Updated amount in stock is: " + total + ". With the reorder quantity: "
                    + i2.getReOrderQuantity() + " , the total price of the iPhones is :  " +  i2.getUnitCostPrice() + " per unit");
        }

        //cost of d1
        double d1Cost = d.calculateDeliveryCost(d1.getQuantity(), i2.getUnitCostPrice());
        System.out.println("The cost of the delivery for ID d1 is : " + d1Cost);

        //Display the amount owed to a Supplier and the quantity in stock of an item before and
        // after a delivery of that item is received from that supplier.
        System.out.println("The current amount due to " + s2.getSupplierName() + " is: " +
                s2.getAmountOwed() + " and the current amount in stock for iPhones is " + i2.getQuantityInStock());
    }

}
