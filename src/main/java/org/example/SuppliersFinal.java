package org.example;

import java.util.TreeSet;

public class SuppliersFinal {
    TreeSet<Supplier> sup;

    public SuppliersFinal(){
    }

    /**
     * Takes in a Supplier to be added to the TreeSet
     * @param toBeAdded the Supplier to be added
     * @return true if added
     * @throws IllegalArgumentException if the parameter is null
     */
    public boolean add(Supplier toBeAdded){
        if (toBeAdded == null){
            throw new IllegalArgumentException("Passed parameter cannot be null");
        }
        sup.add(toBeAdded);
        return true;
    }
}
