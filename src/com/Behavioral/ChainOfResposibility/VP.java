package com.Behavioral.ChainOfResposibility;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.PURCHASE){
            if(request.getAmount() < 15000){
                System.out.println("VP approves purchases below 15000");
            }else{
                successor.handleRequest(request);
            }
        }
    }
}
