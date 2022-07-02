package com.Behavioral.Visitor.PatternApplied;

public class Fender implements AtvPart{

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
