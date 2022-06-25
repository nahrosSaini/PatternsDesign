package com.Behavioral.Memento;

import java.util.Stack;

// CARETAKER
public class Caretaker {

    private Stack<EmployeeMemento> empHistory=new Stack<>();

    public void save(Employee employee){
        empHistory.push(employee.save());
    }

    public void revert(Employee employee){
        employee.revert(empHistory.pop());
    }

}
