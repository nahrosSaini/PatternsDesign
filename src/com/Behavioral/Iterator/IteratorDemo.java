package com.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String args[]){
        List<String> names=new ArrayList<>();

        names.add("Roshan");
        names.add("kapil");
        names.add("Rohit");

        Iterator<String> namesItr= names.iterator();

        for (String name:names) {
            System.out.println(name);
        }

//        while (namesItr.hasNext()){
//            String name=namesItr.next();
//            System.out.println(name);
//            namesItr.remove();
//        }

        System.out.println("Names Size : "+ names.size());
    }
}
