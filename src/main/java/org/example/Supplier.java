package org.example;



public class Supplier {
    //creating variables in the class
    private String supplierName;
    private String supplierAddress;
    private double amountOwed;
    private double creditLimit;

    public Supplier() {
    } //no argument constructor

    public Supplier(String supplierName, String supplierAddress, double amountOwed, double creditLimit) {
        this.supplierName = supplierName;//giving a value to the variable
        this.supplierAddress = supplierAddress;//giving a value to the variable
        this.amountOwed = amountOwed;//giving a value to the variable
        this.creditLimit = creditLimit; //giving a value to the variable
    }

    public String getSupplierName() {
        return supplierName;
    }

    public boolean setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.isEmpty()) {
            return false;
        }
        this.supplierName = supplierName;
        return true;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public boolean setSupplierAddress(String supplierAddress) {
        if (supplierAddress == null || supplierAddress.isEmpty()) {
            return false;
        }
        this.supplierAddress = supplierAddress;
        return true;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public boolean setAmountOwed(double amountOwed) {
        if (amountOwed < 0) {
            return false;
        }
        this.amountOwed = amountOwed;
        return true;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public boolean setCreditLimit(double creditLimit) {
        if (creditLimit < 0) {
            return false;
        }
        this.creditLimit = creditLimit;
        return true;
    }

    /**
     * Takes in two doubles to sum them together
     *
     * @param amountOwed  current amount due
     * @param creditLimit max amount of credit.
     * @param newAmount The new amount to be added.
     * @return the total of the sum if the number is less than the credit limit. Returns credit limit
     * otherwise.
     */
    public double increaseAmountOwed(double amountOwed, double creditLimit, double newAmount) {
        double total = amountOwed + newAmount;
        if (total > creditLimit) {
            System.out.println("You've reached your limit");
            return creditLimit;
        }
        return total;
    }

    /**
     * Takes in a double and input from the user and subtracts the parameter from the input.
     *
     * @param amountOwed current amount owed
     * @param newAmount the newAmount to be subtracted
     * @return 0 if the new amount is greater than the last amount owed. Otherwise, returns the
     * total of the subtraction.
     */
    public double decreaseAmountOwed(double amountOwed, double newAmount) {
        if (newAmount > amountOwed) {
            System.out.println("Greater than the current amount. Balance will be 0");
            return 0;
        }
        return amountOwed - newAmount;
    }

    /**
     * Gives the object a string representation
     *
     * @return the string containing the values of all the parameters
     */
    @Override
    public String toString() {
        return "Supplier [supplierName=" + supplierName + ", supplierAddress=" + supplierAddress +
                ", amountOwed=" + amountOwed + ", creditLimit=" + creditLimit + "]";
    }
}
