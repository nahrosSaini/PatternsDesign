package com.Behavioral.Visitor.PatternApplied;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder {

    private List<AtvPart> parts=new ArrayList<>();

    public PartsOrder(){

    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public void addPart(AtvPart part) {
        parts.add(part);
    }

    public void accept(AtvPartVisitor visitor){

        for (AtvPart part:parts){
            part.accept(visitor);
        }

        visitor.visit(this);
    }
}
