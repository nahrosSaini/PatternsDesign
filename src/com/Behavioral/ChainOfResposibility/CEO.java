package com.Behavioral.ChainOfResposibility;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve any request");
    }
}
