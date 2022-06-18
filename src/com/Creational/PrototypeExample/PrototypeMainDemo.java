package com.Creational.PrototypeExample;

public class PrototypeMainDemo {

    public static void main(String args[]){
        Registry registry=new Registry();
        Movie movie= (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Design Patterns");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie movie1=(Movie) registry.createItem("Movie");
        movie1.setTitle("Gang of Four");

        System.out.println(movie1);
        System.out.println(movie1.getRuntime());
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getUrl());
    }
}
