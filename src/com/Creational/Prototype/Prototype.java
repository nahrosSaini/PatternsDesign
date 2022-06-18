package com.Creational.Prototype;

import java.util.List;

public class Prototype implements Cloneable{
    private String sql;
    private List<String> parameters;
    private Record record;

    public Prototype(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }

    public Prototype clone(){
        try {
            return (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return null;
    }
}
