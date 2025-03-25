package org.example;

public class DisSup extends Supplier{
    private double orderValueForDiscount;
    private double discountPercentage;

    public DisSup(){
    }
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
