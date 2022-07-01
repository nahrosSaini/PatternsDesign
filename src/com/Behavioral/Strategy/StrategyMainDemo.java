package com.Behavioral.Strategy;

public class StrategyMainDemo {

    public static void main(String args[]){

        CreditCard amexCard=new CreditCard(new AmexStrategy());

        amexCard.setNumber("378282246310005");
        amexCard.setDate("04/2022");
        amexCard.setCvv("234");

        System.out.println("Is Amex card valid : "+amexCard.isValid());


    }

}
