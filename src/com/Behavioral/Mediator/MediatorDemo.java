package com.Behavioral.Mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo {

    private Timer timer;

    public MediatorDemo(int seconds){
        timer=new Timer();
        timer.schedule(new RemindTask(),seconds*1000);
        timer.schedule(new RemindTaskWithoutBeep(),seconds*2*1000);
    }

    private class RemindTask extends TimerTask {
        public void run(){
            System.out.println("Times up..!!");
        }
    }

    private class RemindTaskWithoutBeep extends TimerTask {

        public void run(){
            System.out.println("Now's time really up!");
            timer.cancel();
        }
    }


    public static void main(String arg[]){
        System.out.println("About to schedule a task..");

        new MediatorDemo(5);

        System.out.println("Task scheduled..");



    }


}
