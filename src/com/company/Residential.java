package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * extends customer class, with residential specific variable senior
 */
public class Residential extends Customer
{
    private boolean senior;

    public Residential(String customerName, String customerPhone, String customerAddress, double squareFootage, boolean senior) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.senior = senior;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
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
     * displays all inputted user information, and displays residential rates per week dependant on square footage,
     * with the senior discount taken into consideration
     */
    public void display()
    {
        if(senior==true)
            System.out.println("You are receiving a 10% senior discount");
        //outputting all customer info
        System.out.println(customerName);
        System.out.println(customerPhone);
        System.out.println(customerAddress);
        System.out.println(squareFootage + " sqft");

        // calculates charge per week, plus discount if senior
        double charge = squareFootage*(6.0/1000);
        if(senior==true)
        {
            charge = charge- (charge*.15);
        }

        //formats decimal
        DecimalFormat df = new DecimalFormat("$0.00");
        String c = Double.toString(charge);
        BigDecimal b = new BigDecimal(c);
        System.out.println("You will be charged "+  df.format(b) + " per week");
    }
}
