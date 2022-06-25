package com.Behavioral.Mediator;

public class TurnOffAllLights implements Command{

    Mediator mediator=null;

    public TurnOffAllLights(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
