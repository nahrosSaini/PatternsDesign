package com.Creational.Builder;

public class BuilderMainDemo {

    public static void main(String arg[]){

        LunchOrder.Builder builder=new LunchOrder.Builder();

        LunchOrder lunchOrder= builder.setCondiments("lettuce").setDressing("mayo").setMeat("turkey").build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());


    }
}
