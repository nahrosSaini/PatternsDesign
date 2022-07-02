package com.Behavioral.Visitor.PatternApplied;

public class Oil implements AtvPart{

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
