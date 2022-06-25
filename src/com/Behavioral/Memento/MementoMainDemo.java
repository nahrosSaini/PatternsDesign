package com.Behavioral.Memento;

public class MementoMainDemo {

    public static void main(String arg[]){

        Caretaker caretaker=new Caretaker();

        Employee employee=new Employee("John Wick","barrod","125609876");

        System.out.println("Employee before Save : "+employee);

        caretaker.save(employee);

        employee.setPhone("9855116437");

        employee.save();

        System.out.println("Employee Phone changed : "+employee);

        employee.setPhone("9494527489");

        caretaker.revert(employee); // not saved yet

        System.out.println("Reverts to last point  : "+employee);

        caretaker.revert(employee);

        System.out.println("Reverted to Original : "+employee);

    }
}
