package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * extends customer, with commercial specific variable multiprop
 */
public class Commercial extends Customer{

    private boolean multiProp;




    public boolean isMultiProp() {
        return multiProp;
    }

    public void setMultiProp(boolean multiProp) {
        this.multiProp = multiProp;
    }

    public Commercial(String customerName, String customerPhone, String customerAddress, double squareFootage, boolean multiProp) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.multiProp = multiProp;
    }

    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }

    @Override
    public String getCustomerPhone() {
        return super.getCustomerPhone();
    }

    @Override
    public void setCustomerPhone(String customerPhone) {
        super.setCustomerPhone(customerPhone);
    }

    @Override
    public String getCustomerAddress() {
        return super.getCustomerAddress();
    }

    @Override
    public void setCustomerAddress(String customerAddress) {
        super.setCustomerAddress(customerAddress);
    }

    @Override
    public double getSquareFootage() {
        return super.getSquareFootage();
    }

    @Override
    public void setSquareFootage(double squareFootage) {
        super.setSquareFootage(squareFootage);
    }

    /**
     * displays all the users inputted information, but also calculates the cost of getting their properties mowed each week,
     * with the multi-property discount taken into consideration.
     */
    public void display()
    {
        if(multiProp==true)
            System.out.println("You are receiving a 10% multi-property discount");
        System.out.println(customerName);
        System.out.println(customerPhone);
        System.out.println(customerAddress);
        System.out.println(squareFootage + " sqft");

        //calculates charge, and discount if user has more than one property
        double charge = squareFootage*(5.0/1000);
        if(multiProp==true)
        {
            charge = charge- (charge*.1);
        }

        //formats charge per week
        DecimalFormat df = new DecimalFormat("$0.00");
        String c = Double.toString(charge);
        BigDecimal b = new BigDecimal(c);
        System.out.println("You will be charged "+  df.format(b) + " per week");
    }
}
