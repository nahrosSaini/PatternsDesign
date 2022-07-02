package com.Behavioral.Visitor.PatternApplied;

public class Wheel implements AtvPart{

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
