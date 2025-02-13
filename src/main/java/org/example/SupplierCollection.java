package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SupplierCollection {
    private ArrayList<Supplier> suppliers = new ArrayList<>();

    public SupplierCollection(){
    }

    /**
     * Takes in file input which will be used to populate an arrayList of supplier objects. Closes
     * itself after being used.
     * @param toBeWritten The File we are reading from.
     * @throws IOException If any input/output errors occur.
     * @throws ClassNotFoundException If the class used for readObject couldn't be found.
     */
    public SupplierCollection(FileInputStream toBeWritten) throws IOException, ClassNotFoundException {
        try (ObjectInputStream file = new ObjectInputStream(toBeWritten)){
        suppliers = (ArrayList<Supplier>)file.readObject();
        }
    }

    /**
     * Takes in a supplier to be added to the ArrayList. In place algorithm.
     * @param toBeAdded
     */
    public void add(Supplier toBeAdded){
        suppliers.add(toBeAdded);
    }

    /**
     * Takes in a string filename, parses the data and adds the elements to the arrayList suppliers
     * @throws FileNotFoundException if the file couldn't be found
     * @param fileName File being looked for with the data
     * @throws IOException If any input/output errors occur.
     */
    public void add(String fileName) throws IOException {
        String[] data;
        try { //basically an if and else structure
            Scanner input =new Scanner(new File(fileName));
            while (input.hasNextLine()){
                String in = input.nextLine();
                data = in.split(","); //split by comma working as a delimiter
                String supplierName = data[0];
                String supplierAddress = data[1];
                double amountOwed = Double.parseDouble(data[2]); //parsing the strings into doubles
                double creditLimit = Double.parseDouble(data[3]);
                Supplier sup = new Supplier(supplierName, supplierAddress, amountOwed, creditLimit);
                suppliers.add(sup);
            }
        } catch (FileNotFoundException fileNotFoundException){
            throw new FileNotFoundException("Provided file doesn't exist. Provided name was" +
                    fileName + ". Please try a different name");
        } catch (NumberFormatException numberFormatException){
            System.out.println("Couldn't parse numeric values");
        }
    }
}
