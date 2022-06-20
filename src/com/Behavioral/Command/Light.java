package com.Behavioral.Command;

//Receiver
public class Light {

    private boolean isOn=false;

    public void toggle(){
        if(isOn){

            off();
            isOn=false;


        }else {
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Light is switched On");
    }

    public void off(){
        System.out.println("Light is switched Off");
    }
}
