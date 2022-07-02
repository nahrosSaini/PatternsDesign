package com.Behavioral.Template;

public class TemplateMainDemo {
    public static void main(String args[]){

    System.out.println("WEB Order : ");

    OrderTemplate webOrder=new WebOrder();
    webOrder.isGift=true;
    webOrder.proccessOrder();

    }
}
