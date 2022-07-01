package com.Behavioral.Strategy;

public class AmexStrategy extends ValidationStrategy{
    @Override
    public boolean isValid(CreditCard creditCard) {

        boolean isValid=true;

        isValid= creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("43");

        if (isValid){
            isValid=creditCard.getNumber().length()==15;
        }

        if (isValid){
            isValid=checkLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
