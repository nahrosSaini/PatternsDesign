package com.Behavioral.ChainOfResposibility;

public class Director extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.CONFERENCE){
            System.out.println("Director approves conferences");
        }else{
            successor.handleRequest(request);
        }
    }
}
