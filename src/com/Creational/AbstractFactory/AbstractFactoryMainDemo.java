package com.Creational.AbstractFactory;

public class AbstractFactoryMainDemo {

    public static void main(String args[]){
        CreditCardFactory creditCardFactory=CreditCardFactory.geCreditCardFactory(678);

        CreditCard creditCard=creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard.getClass());

        creditCardFactory= CreditCardFactory.geCreditCardFactory(546);

        CreditCard creditCard1=creditCardFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard1.getClass());
    }
}
