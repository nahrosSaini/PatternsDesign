package com.Behavioral.Mediator;

public class Light {

    private boolean isOn=false;
    String Location="";

    public Light(String location) {
        Location = location;
    }

    public void toggle(){
        if(isOn){

            off();
            isOn=false;


        }else {
            on();
            isOn = true;
        }
    }

    public boolean isOn(){
        return isOn;
    }
    public void on(){
        System.out.println("Light is switched On");
    }

    public void off(){
        System.out.println("Light is switched Off");
    }
}
