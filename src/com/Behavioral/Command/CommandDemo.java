package com.Behavioral.Command;

public class CommandDemo {

    public static void main(String args[]){
        Task task=new Task(10,20);
        Task task1=new Task(5,4);

        Thread thread=new Thread(task);
        thread.start();

        Thread thread1=new Thread(task1);
        thread1.start();
    }


}

class Task implements Runnable{

    int num1;
    int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1*num2);
    }
}
