package com.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo {

    public static void printContents(List<Person> people){
        for(Person person:people){
            System.out.println(person);
        }
    }

    public static void main(String args[]){

        Person bryan=new Person(23,"Byran","1234567890");
        Person mark=new Person(35,"mark","1234567890");
        Person chris=new Person(26,"chris","1234567890");

        List<Person> people=new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not Sorted : ");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.getAge() > o2.getAge()){
                    return 1;
                }

                if(o1.getAge() < o2.getAge()){
                    return -1;
                }

                return 0;
            }
        });

        System.out.println("\nSorted : ");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("\nSorted by Name: ");
        printContents(people);

    }
}
