package com.Behavioral.Visitor.PatternApplied;

public class VisitorPatternMainDemo {

    public static void main(String args[]){

        PartsOrder partsOrder=new PartsOrder();
        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Oil());
        partsOrder.addPart(new Fender());

        partsOrder.accept(new AtvPartsShippingVisitor());
        partsOrder.accept(new AtvPartsDisplayVisitor());

    }
}
