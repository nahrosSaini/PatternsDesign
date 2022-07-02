package com.Behavioral.Template;

public class WebOrder extends OrderTemplate{
    @Override
    public void doCheckout() {
        System.out.println("Get the items from cart.");
        System.out.println("Set gift preferences.");
        System.out.println("Set Delivery address.");
        System.out.println("Set Billing address.");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without card present.");
    }

    @Override
    public void doReceipt() {
        System.out.println("Ship the items.");
    }

    @Override
    public void doDelivery() {
        System.out.println("Email receipt.");
    }
}
