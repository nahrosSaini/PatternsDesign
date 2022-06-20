package com.Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandMainDemo {

    public static void main(String args[]){

        //Light light=new Light();

        AnchorSwitch switchh=new AnchorSwitch();

        //Command onCommand=new ToggleCommand(light);

//        switchh.storeAndExecute(onCommand);
//        switchh.storeAndExecute(onCommand);
//        switchh.storeAndExecute(onCommand);
//        switchh.storeAndExecute(onCommand);
//        switchh.storeAndExecute(onCommand);
//        switchh.storeAndExecute(onCommand);


        Light bedRoomlight=new Light();
        Light kitchenRoomlight=new Light();
        Light hallRoomlight=new Light();

        List<Light> lights=new ArrayList<>();
        lights.add(bedRoomlight);
        lights.add(kitchenRoomlight);
        lights.add(hallRoomlight);

        Command allLightsCommand=new AllLightsCommand(lights);
        switchh.storeAndExecute(allLightsCommand);
        switchh.storeAndExecute(allLightsCommand);
        switchh.storeAndExecute(allLightsCommand);

    }
}
