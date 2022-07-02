package com.Behavioral.Visitor.PatternApplied;

public class AtvPartsDisplayVisitor implements AtvPartVisitor{
    @Override
    public void visit(Fender fender) {
        System.out.println("We have a Fender.");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have a Oil.");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a Wheel.");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have a Order.");
    }
}
