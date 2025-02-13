package org.example;

import java.io.FileInputStream;
import java.io.IOException;

public class Version3App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Creating a Supplier Object
        SupplierCollection group1 = new SupplierCollection();

        //Call the add method in the Suppliers class using suppliers.txt as a parameter.
        group1.add("supplier.txt");

        //Call displayAll()
        group1.displayAll();

        //Call storeSuppliers() using sup.bin as an argument.
        group1.cstoreSupplied("sup");

        //Create a Suppliers object, group2 passing sup.bin as an argument to the parameterized constructor.
        SupplierCollection group2 = new SupplierCollection(new FileInputStream("sup"));

        //Display all group2 suppliers.
        group2.displayAll();

    }
    //Write a static method to display all invalid records from suppliers.txt. Call this method.
    //Note that the invalid recorde should be in invalidSupplier.txt.

}
