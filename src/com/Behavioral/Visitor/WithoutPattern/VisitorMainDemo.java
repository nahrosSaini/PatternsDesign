package com.Behavioral.Visitor.WithoutPattern;

public class VisitorMainDemo {
    public static void main(String args[]){

        PartsOrder partsOrder=new PartsOrder();
        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Fender());
        partsOrder.addPart(new Oil());

        double shippingCost=partsOrder.calculateShipping();

        System.out.println("Cost : "+shippingCost);


    }
}
