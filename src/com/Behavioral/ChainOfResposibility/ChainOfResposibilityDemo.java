package com.Behavioral.ChainOfResposibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResposibilityDemo {

    private static final Logger logger=Logger.getLogger(ChainOfResposibilityDemo.class.getName());

    public static void main(String args[]){

        logger.setLevel(Level.FINE);

        ConsoleHandler handler=new ConsoleHandler();

        handler.setLevel(Level.FINER);

        logger.addHandler(handler);

        logger.finest("finest");
        logger.finer("finer");
        logger.fine("fine");


    }
}
