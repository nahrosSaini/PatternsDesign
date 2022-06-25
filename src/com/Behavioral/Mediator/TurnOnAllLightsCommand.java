package com.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class TurnOnAllLightsCommand implements Command{

    Mediator mediator=null;

    public TurnOnAllLightsCommand(Mediator mediator) {
       this.mediator=mediator;
    }

    @Override
    public void execute() {

        mediator.turnOnAllLights();

    }
}
