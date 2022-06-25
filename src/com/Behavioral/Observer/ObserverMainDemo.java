package com.Behavioral.Observer;

public class ObserverMainDemo {

    public static void main(String args[]){

        Subject subject=new MessageStream();

        PhoneClient phoneClient=new PhoneClient(subject);
        TabletClient tabletClient=new TabletClient(subject);

        phoneClient.addMessage("Here is a new Message..!!");
        tabletClient.addMessage("I am from tablet..!!");

    }
}
