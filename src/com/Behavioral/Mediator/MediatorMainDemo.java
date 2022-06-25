package com.Behavioral.Mediator;

public class MediatorMainDemo {

    public static void main(String arg[]){

        Mediator mediator=new Mediator();

        Light kitchenLight=new Light("Kitchen");
        Light bedroomLight=new Light("Bedroom");

        mediator.register(kitchenLight);
        mediator.register(bedroomLight);

        Command turnOnAllLights=new TurnOnAllLightsCommand(mediator);

        turnOnAllLights.execute();

        Command turnOffAllLights=new TurnOffAllLights(mediator);

        turnOffAllLights.execute();


    }
}
