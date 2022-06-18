package com.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMainDemo {

    public static void main(String args[]){
        String sql="Select * from MarvelMovies where actor= ?";
        List<String> parameters=new ArrayList<>();
        parameters.add("Chris");
        parameters.add("Tony");

        Record record=new Record();

        Prototype prototype=new Prototype(sql,parameters,record);
         System.out.println(prototype.getSql());
         System.out.println(prototype.getParameters());
         System.out.println(prototype.getRecord());

         Prototype prototype1=prototype.clone();

        System.out.println(prototype1.getSql());
        System.out.println(prototype1.getParameters());
        System.out.println(prototype1.getRecord());



    }
}
