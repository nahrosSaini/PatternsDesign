package com.Behavioral.Iterator;

import java.util.Iterator;

public class IteratorMainDemo {

    public static void main(String arg[]){

    BikeRepository bikeRepository=new BikeRepository();

    bikeRepository.addBike("Splendor + ");
    bikeRepository.addBike("Plusor");
    bikeRepository.addBike("Luna");

    Iterator<String> bikeiterator= bikeRepository.iterator();

    while(bikeiterator.hasNext()){
        System.out.println(bikeiterator.next());
    }
    ///////////////

    for (String bike:bikeRepository){
        System.out.println(bike);
    }

    }
}
