package com.Behavioral.Visitor.PatternApplied;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor{

    double shippingCost=0;

    @Override
    public void visit(Fender fender) {
        shippingCost+=3;
        System.out.println("fender are cheap to ship.");
    }

    @Override
    public void visit(Oil oil) {
        shippingCost+=9;
        System.out.println("Oil is hazards and has a fee to ship.");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingCost+=15;
        System.out.println("Wheels are bulky and expensive to ship.");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they have more than 3 items then we will give them a discount on shipping.");
        List<AtvPart> parts=partsOrder.getParts();
        if(parts.size()>3){
            shippingCost-=5;
        }
        System.out.println("Shipping Amount : "+shippingCost);
    }
}
