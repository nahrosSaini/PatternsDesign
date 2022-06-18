package com.Creational.Builder;

public class BuilderDemo {

    public static void main(String arg[]){

        StringBuilder builder=new StringBuilder();

        builder.append("This is an example");
        builder.append(" of the builder design ");
        builder.append("pattern. It means to append ");
        builder.append("almost everything we want to a string..");

        builder.append(42);

        System.out.println(builder.toString());

    }
}
