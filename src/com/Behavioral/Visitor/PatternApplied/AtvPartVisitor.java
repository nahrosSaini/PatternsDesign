package com.Behavioral.Visitor.PatternApplied;

public interface AtvPartVisitor {

    void visit(Fender fender);
    void visit(Oil oil);
    void visit(Wheel wheel);
    void visit(PartsOrder partsOrder);
}
