package org.example;

public class DisSup extends Supplier{
    private double orderValueForDiscount;
    private double discountPercentage;

    /**
     * No argument constructor
     */
    public DisSup(){
    }

    /**
     * Gives a value to every object (inherited included)
     * @param orderValueForDiscount Amount in the order to get a discount
     * @param discountPercentage the amount of discount
     * @param supplierName inherited variable
     * @param supplierAddress inherited variable
     * @param amountOwed inherited variable
     * @param creditLimit inherited variable
     */
    public DisSup(double orderValueForDiscount, double discountPercentage, String supplierName, String supplierAddress, double amountOwed, double creditLimit){
        super(supplierName, supplierAddress, amountOwed, creditLimit);
        this.discountPercentage = discountPercentage;
        this.orderValueForDiscount = orderValueForDiscount;
    }

    //getters and setters

    public double getOrderValueForDiscount() {
        return orderValueForDiscount;
    }

    public void setOrderValueForDiscount(double orderValueForDiscount) {
        this.orderValueForDiscount = orderValueForDiscount;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
