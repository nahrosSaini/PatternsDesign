package com.Behavioral.Command;

//Invoker
public class AnchorSwitch {

    public AnchorSwitch() {
    }

    public void storeAndExecute(Command command){
        command.execute();
    }
}
