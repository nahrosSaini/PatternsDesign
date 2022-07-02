package com.Structural.Adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    public static void main(String args[]){

        Integer[] arraysOfInts=new Integer[]{1,2,3,4,5};

        List<Integer> listOfInts= Arrays.asList(arraysOfInts);

        System.out.println(arraysOfInts);
        System.out.println(listOfInts);

    }
}
